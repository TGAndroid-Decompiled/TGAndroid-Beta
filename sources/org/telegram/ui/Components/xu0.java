package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
public final class xu0 extends View {
    public final ImageReceiver f34830a;
    public final e9 f34831b;
    public final Paint f34832c;
    public float d;
    public boolean f34833e;
    public ValueAnimator f34834f;

    public xu0(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f34830a = imageReceiver;
        this.f34831b = new e9((org.telegram.ui.ActionBar.c6) null);
        Paint paint = new Paint(1);
        this.f34832c = paint;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f34834f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f9 = 0.0f;
        if (z11) {
            if (z10) {
                f9 = 1.0f;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.d, f9).setDuration(200L);
            duration.setInterpolator(jr.f29800f);
            duration.addUpdateListener(new d70(this, 21));
            duration.addListener(new zz(this, 23));
            duration.start();
            this.f34834f = duration;
            return;
        }
        if (z10) {
            f9 = 1.0f;
        }
        this.d = f9;
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
        this.f34830a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34830a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float f9 = (this.d * 0.1f) + 0.9f;
        canvas.scale(f9, f9);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23222m5, false);
        Paint paint = this.f34832c;
        paint.setColor(w02);
        paint.setAlpha((int) (Color.alpha(paint.getColor()) * this.d));
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth);
        canvas.drawArc(rectF, -90.0f, this.d * 360.0f, false, paint);
        canvas.restore();
        if (!this.f34833e) {
            float strokeWidth2 = paint.getStrokeWidth() * 2.5f * this.d;
            float f10 = 2.0f * strokeWidth2;
            float width = getWidth() - f10;
            float height = getHeight() - f10;
            ImageReceiver imageReceiver = this.f34830a;
            imageReceiver.setImageCoords(strokeWidth2, strokeWidth2, width, height);
            imageReceiver.draw(canvas);
        }
    }

    public void setAvatar(TLObject tLObject) {
        e9 e9Var = this.f34831b;
        e9Var.p(tLObject);
        this.f34830a.setForUserOrChat(tLObject, e9Var);
    }

    public void setHideAvatar(boolean z10) {
        this.f34833e = z10;
        invalidate();
    }
}
