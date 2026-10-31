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
public final class m6 extends View {
    public final ImageReceiver f28294a;
    public final Drawable f28295b;
    public final Paint f28296c;
    public final Paint d;

    public m6(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f28296c = paint;
        this.d = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f28294a = imageReceiver;
        imageReceiver.setAlpha(0.0f);
        imageReceiver.f14382g1 = new t(this, 12);
        this.f28295b = context.getDrawable(2131231496).mutate().getConstantState().newDrawable();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28294a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28294a.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.i0.L(10.0f) + getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), this.d);
        ImageReceiver imageReceiver = this.f28294a;
        imageReceiver.y0((getWidth() / 2.0f) - org.telegram.messenger.i0.L(66.0f), (getHeight() / 2.0f) - (org.telegram.messenger.i0.L(42.0f) / 2.0f), org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(42.0f));
        imageReceiver.h(canvas, null);
        Paint paint = this.f28296c;
        canvas.drawLine((getWidth() / 2.0f) - org.telegram.messenger.i0.L(8.0f), getHeight() / 2.0f, (getWidth() / 2.0f) + org.telegram.messenger.i0.L(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(getWidth() / 2.0f, (getHeight() / 2.0f) - org.telegram.messenger.i0.L(8.0f), getWidth() / 2.0f, org.telegram.messenger.i0.L(8.0f) + (getHeight() / 2.0f), paint);
        int L = org.telegram.messenger.i0.L(24.0f) + (getWidth() / 2);
        int height = (getHeight() / 2) - (org.telegram.messenger.i0.L(42.0f) / 2);
        int L2 = org.telegram.messenger.i0.L(66.0f) + (getWidth() / 2);
        int L3 = (org.telegram.messenger.i0.L(42.0f) / 2) + (getHeight() / 2);
        Drawable drawable = this.f28295b;
        drawable.setBounds(L, height, L2, L3);
        drawable.draw(canvas);
    }

    public void setAttachBot(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_attachMenuBotIcon k02 = org.telegram.messenger.ui.k0(tL_attachMenuBot);
        if (k02 != null) {
            this.f28294a.q0(org.telegram.messenger.ic.b(k02.icon), "42_42", org.telegram.messenger.v5.f(k02.icon, org.telegram.ui.ActionBar.t6.f21169q5, 1.0f, null), "svg", tL_attachMenuBot, 0);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.d.setColor(i10);
    }

    public void setColor(int i10) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f28295b.setColorFilter(i10, mode);
        this.f28296c.setColor(i10);
        this.f28294a.f14397o1 = new PorterDuffColorFilter(i10, mode);
    }
}
