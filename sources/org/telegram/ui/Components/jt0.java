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
public final class jt0 extends View {
    public final ImageReceiver f35070a;
    public final v8 f35071b;
    public final Paint f35072c;
    public float d;
    public boolean f35073e;
    public ValueAnimator f35074f;

    public jt0(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f35070a = imageReceiver;
        this.f35071b = new v8((org.telegram.ui.ActionBar.h6) null);
        Paint paint = new Paint(1);
        this.f35072c = paint;
        imageReceiver.J0(org.telegram.messenger.g0.L(28.0f));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(boolean z9, boolean z10) {
        ValueAnimator valueAnimator = this.f35074f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        if (z10) {
            if (z9) {
                f10 = 1.0f;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.d, f10).setDuration(200L);
            duration.setInterpolator(wq.f40046f);
            duration.addUpdateListener(new c60(this, 20));
            duration.addListener(new e60(this, 22));
            duration.start();
            this.f35074f = duration;
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
        this.f35070a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35070a.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float f10 = (this.d * 0.1f) + 0.9f;
        canvas.scale(f10, f10);
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28054m5, false);
        Paint paint = this.f35072c;
        paint.setColor(x02);
        paint.setAlpha((int) (Color.alpha(paint.getColor()) * this.d));
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth);
        canvas.drawArc(rectF, -90.0f, this.d * 360.0f, false, paint);
        canvas.restore();
        if (!this.f35073e) {
            float strokeWidth2 = paint.getStrokeWidth() * 2.5f * this.d;
            float f11 = 2.0f * strokeWidth2;
            float width = getWidth() - f11;
            float height = getHeight() - f11;
            ImageReceiver imageReceiver = this.f35070a;
            imageReceiver.y0(strokeWidth2, strokeWidth2, width, height);
            imageReceiver.h(canvas, null);
        }
    }

    public void setAvatar(TLObject tLObject) {
        v8 v8Var = this.f35071b;
        v8Var.l(tLObject);
        this.f35070a.i0(tLObject, v8Var, null);
    }

    public void setHideAvatar(boolean z9) {
        this.f35073e = z9;
        invalidate();
    }
}
