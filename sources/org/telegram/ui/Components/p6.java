package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class p6 extends View {
    public final ImageReceiver f36801a;
    public final Drawable f36802b;
    public final Paint f36803c;
    public final Paint d;

    public p6(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f36803c = paint;
        this.d = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f36801a = imageReceiver;
        imageReceiver.setAlpha(0.0f);
        imageReceiver.f21200g1 = new t(this, 12);
        this.f36802b = context.getDrawable(2131231495).mutate().getConstantState().newDrawable();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36801a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36801a.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(10.0f) + getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), this.d);
        ImageReceiver imageReceiver = this.f36801a;
        imageReceiver.y0((getWidth() / 2.0f) - org.telegram.messenger.g0.L(66.0f), (getHeight() / 2.0f) - (org.telegram.messenger.g0.L(42.0f) / 2.0f), org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
        imageReceiver.h(canvas, null);
        Paint paint = this.f36803c;
        canvas.drawLine((getWidth() / 2.0f) - org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, (getWidth() / 2.0f) + org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(getWidth() / 2.0f, (getHeight() / 2.0f) - org.telegram.messenger.g0.L(8.0f), getWidth() / 2.0f, org.telegram.messenger.g0.L(8.0f) + (getHeight() / 2.0f), paint);
        int L = org.telegram.messenger.g0.L(24.0f) + (getWidth() / 2);
        int height = (getHeight() / 2) - (org.telegram.messenger.g0.L(42.0f) / 2);
        int L2 = org.telegram.messenger.g0.L(66.0f) + (getWidth() / 2);
        int L3 = (org.telegram.messenger.g0.L(42.0f) / 2) + (getHeight() / 2);
        Drawable drawable = this.f36802b;
        drawable.setBounds(L, height, L2, L3);
        drawable.draw(canvas);
    }

    public void setAttachBot(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_attachMenuBotIcon k02 = org.telegram.messenger.ui.k0(tL_attachMenuBot);
        if (k02 != null) {
            this.f36801a.q0(org.telegram.messenger.hc.b(k02.icon), "42_42", org.telegram.messenger.t5.f(k02.icon, org.telegram.ui.ActionBar.m6.f28129q5, 1.0f, null), "svg", tL_attachMenuBot, 0);
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.d.setColor(i7);
    }

    public void setColor(int i7) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f36802b.setColorFilter(i7, mode);
        this.f36803c.setColor(i7);
        this.f36801a.f21214o1 = new PorterDuffColorFilter(i7, mode);
    }
}
