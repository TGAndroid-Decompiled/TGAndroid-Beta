package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
public final class kt0 extends View {
    public final ImageReceiver f35479a;
    public final w8 f35480b;
    public final Paint f35481c;
    public float d;
    public boolean f35482e;
    public ValueAnimator f35483f;

    public kt0(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f35479a = imageReceiver;
        this.f35480b = new w8((org.telegram.ui.ActionBar.g6) null);
        Paint paint = new Paint(1);
        this.f35481c = paint;
        imageReceiver.J0(org.telegram.messenger.g0.L(28.0f));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(boolean z9, boolean z10) {
        ValueAnimator valueAnimator = this.f35483f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        if (z10) {
            if (z9) {
                f10 = 1.0f;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.d, f10).setDuration(200L);
            duration.setInterpolator(xq.f40458f);
            duration.addUpdateListener(new d60(this, 20));
            duration.addListener(new f60(this, 22));
            duration.start();
            this.f35483f = duration;
            return;
        }
        if (z9) {
            f10 = 1.0f;
        }
        this.d = f10;
        invalidate();
    }

    @Override
    public final boolean isSelected() {
        if (this.d == 1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35479a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35479a.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float f10 = (this.d * 0.1f) + 0.9f;
        canvas.scale(f10, f10);
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28029m5, false);
        Paint paint = this.f35481c;
        paint.setColor(x02);
        paint.setAlpha((int) (Color.alpha(paint.getColor()) * this.d));
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth);
        canvas.drawArc(rectF, -90.0f, this.d * 360.0f, false, paint);
        canvas.restore();
        if (!this.f35482e) {
            float strokeWidth2 = paint.getStrokeWidth() * 2.5f * this.d;
            float f11 = 2.0f * strokeWidth2;
            float width = getWidth() - f11;
            float height = getHeight() - f11;
            ImageReceiver imageReceiver = this.f35479a;
            imageReceiver.y0(strokeWidth2, strokeWidth2, width, height);
            imageReceiver.h(canvas, null);
        }
    }

    public void setAvatar(TLObject tLObject) {
        w8 w8Var = this.f35480b;
        w8Var.l(tLObject);
        this.f35479a.i0(tLObject, w8Var, null);
    }

    public void setHideAvatar(boolean z9) {
        this.f35482e = z9;
        invalidate();
    }
}
