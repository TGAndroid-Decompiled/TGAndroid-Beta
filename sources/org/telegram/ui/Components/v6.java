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
public final class v6 extends View {
    public final ImageReceiver f40693a;
    public final Drawable f40694b;
    public final Paint f40695c;
    public final Paint d;

    public v6(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f40695c = paint;
        this.d = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f40693a = imageReceiver;
        imageReceiver.setAlpha(0.0f);
        imageReceiver.f22670h1 = new c0(this, 11);
        this.f40694b = context.getDrawable(2131231495).mutate().getConstantState().newDrawable();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40693a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40693a.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(10.0f) + getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), this.d);
        ImageReceiver imageReceiver = this.f40693a;
        imageReceiver.y0((getWidth() / 2.0f) - org.telegram.messenger.g0.L(66.0f), (getHeight() / 2.0f) - (org.telegram.messenger.g0.L(42.0f) / 2.0f), org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
        imageReceiver.h(canvas, null);
        Paint paint = this.f40695c;
        canvas.drawLine((getWidth() / 2.0f) - org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, (getWidth() / 2.0f) + org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(getWidth() / 2.0f, (getHeight() / 2.0f) - org.telegram.messenger.g0.L(8.0f), getWidth() / 2.0f, org.telegram.messenger.g0.L(8.0f) + (getHeight() / 2.0f), paint);
        int L = org.telegram.messenger.g0.L(24.0f) + (getWidth() / 2);
        int height = (getHeight() / 2) - (org.telegram.messenger.g0.L(42.0f) / 2);
        int L2 = org.telegram.messenger.g0.L(66.0f) + (getWidth() / 2);
        int L3 = (org.telegram.messenger.g0.L(42.0f) / 2) + (getHeight() / 2);
        Drawable drawable = this.f40694b;
        drawable.setBounds(L, height, L2, L3);
        drawable.draw(canvas);
    }

    public void setAttachBot(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_attachMenuBotIcon m0 = org.telegram.messenger.si.m0(tL_attachMenuBot);
        if (m0 != null) {
            this.f40693a.q0(org.telegram.messenger.gc.b(m0.icon), "42_42", org.telegram.messenger.u5.f(m0.icon, org.telegram.ui.ActionBar.m6.f29620q5, 1.0f, null), "svg", tL_attachMenuBot, 0);
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.d.setColor(i7);
    }

    public void setColor(int i7) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f40694b.setColorFilter(i7, mode);
        this.f40695c.setColor(i7);
        this.f40693a.f22684p1 = new PorterDuffColorFilter(i7, mode);
    }
}
