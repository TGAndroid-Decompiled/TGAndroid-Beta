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
public final class u6 extends View {
    public final ImageReceiver f40217a;
    public final Drawable f40218b;
    public final Paint f40219c;
    public final Paint d;

    public u6(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f40219c = paint;
        this.d = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f40217a = imageReceiver;
        imageReceiver.setAlpha(0.0f);
        imageReceiver.f22642h1 = new b0(this, 11);
        this.f40218b = context.getDrawable(2131231495).mutate().getConstantState().newDrawable();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40217a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40217a.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(10.0f) + getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), this.d);
        ImageReceiver imageReceiver = this.f40217a;
        imageReceiver.y0((getWidth() / 2.0f) - org.telegram.messenger.g0.L(66.0f), (getHeight() / 2.0f) - (org.telegram.messenger.g0.L(42.0f) / 2.0f), org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
        imageReceiver.h(canvas, null);
        Paint paint = this.f40219c;
        canvas.drawLine((getWidth() / 2.0f) - org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, (getWidth() / 2.0f) + org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(getWidth() / 2.0f, (getHeight() / 2.0f) - org.telegram.messenger.g0.L(8.0f), getWidth() / 2.0f, org.telegram.messenger.g0.L(8.0f) + (getHeight() / 2.0f), paint);
        int L = org.telegram.messenger.g0.L(24.0f) + (getWidth() / 2);
        int height = (getHeight() / 2) - (org.telegram.messenger.g0.L(42.0f) / 2);
        int L2 = org.telegram.messenger.g0.L(66.0f) + (getWidth() / 2);
        int L3 = (org.telegram.messenger.g0.L(42.0f) / 2) + (getHeight() / 2);
        Drawable drawable = this.f40218b;
        drawable.setBounds(L, height, L2, L3);
        drawable.draw(canvas);
    }

    public void setAttachBot(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_attachMenuBotIcon m0 = org.telegram.messenger.ri.m0(tL_attachMenuBot);
        if (m0 != null) {
            this.f40217a.q0(org.telegram.messenger.fc.b(m0.icon), "42_42", org.telegram.messenger.u5.f(m0.icon, org.telegram.ui.ActionBar.n6.f29635q5, 1.0f, null), "svg", tL_attachMenuBot, 0);
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.d.setColor(i7);
    }

    public void setColor(int i7) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f40218b.setColorFilter(i7, mode);
        this.f40219c.setColor(i7);
        this.f40217a.f22656p1 = new PorterDuffColorFilter(i7, mode);
    }
}
