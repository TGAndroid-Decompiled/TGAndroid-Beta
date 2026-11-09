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
public final class q6 extends View {
    public final ImageReceiver f37202a;
    public final Drawable f37203b;
    public final Paint f37204c;
    public final Paint d;

    public q6(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f37204c = paint;
        this.d = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f37202a = imageReceiver;
        imageReceiver.setAlpha(0.0f);
        imageReceiver.f21195g1 = new u(this, 12);
        this.f37203b = context.getDrawable(2131231495).mutate().getConstantState().newDrawable();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37202a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37202a.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(10.0f) + getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), this.d);
        ImageReceiver imageReceiver = this.f37202a;
        imageReceiver.y0((getWidth() / 2.0f) - org.telegram.messenger.g0.L(66.0f), (getHeight() / 2.0f) - (org.telegram.messenger.g0.L(42.0f) / 2.0f), org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
        imageReceiver.h(canvas, null);
        Paint paint = this.f37204c;
        canvas.drawLine((getWidth() / 2.0f) - org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, (getWidth() / 2.0f) + org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(getWidth() / 2.0f, (getHeight() / 2.0f) - org.telegram.messenger.g0.L(8.0f), getWidth() / 2.0f, org.telegram.messenger.g0.L(8.0f) + (getHeight() / 2.0f), paint);
        int L = org.telegram.messenger.g0.L(24.0f) + (getWidth() / 2);
        int height = (getHeight() / 2) - (org.telegram.messenger.g0.L(42.0f) / 2);
        int L2 = org.telegram.messenger.g0.L(66.0f) + (getWidth() / 2);
        int L3 = (org.telegram.messenger.g0.L(42.0f) / 2) + (getHeight() / 2);
        Drawable drawable = this.f37203b;
        drawable.setBounds(L, height, L2, L3);
        drawable.draw(canvas);
    }

    public void setAttachBot(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_attachMenuBotIcon k02 = org.telegram.messenger.ui.k0(tL_attachMenuBot);
        if (k02 != null) {
            this.f37202a.q0(org.telegram.messenger.hc.b(k02.icon), "42_42", org.telegram.messenger.t5.f(k02.icon, org.telegram.ui.ActionBar.l6.f28104q5, 1.0f, null), "svg", tL_attachMenuBot, 0);
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.d.setColor(i7);
    }

    public void setColor(int i7) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f37203b.setColorFilter(i7, mode);
        this.f37204c.setColor(i7);
        this.f37202a.f21209o1 = new PorterDuffColorFilter(i7, mode);
    }
}
