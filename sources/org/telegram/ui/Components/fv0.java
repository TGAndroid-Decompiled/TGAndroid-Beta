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
public final class fv0 extends View {
    public final ImageReceiver f27012a;
    public final z8 f27013b;
    public final Paint f27014c;
    public float d;
    public boolean f27015e;
    public ValueAnimator f27016f;

    public fv0(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f27012a = imageReceiver;
        this.f27013b = new z8((org.telegram.ui.ActionBar.g6) null);
        Paint paint = new Paint(1);
        this.f27014c = paint;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(boolean z4, boolean z10) {
        ValueAnimator valueAnimator = this.f27016f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        if (z10) {
            if (z4) {
                f10 = 1.0f;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.d, f10).setDuration(200L);
            duration.setInterpolator(pr.f30168f);
            duration.addUpdateListener(new k70(this, 21));
            duration.addListener(new pd0(this, 14));
            duration.start();
            this.f27016f = duration;
            return;
        }
        if (z4) {
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
        this.f27012a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27012a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float f10 = (this.d * 0.1f) + 0.9f;
        canvas.scale(f10, f10);
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21822m5, false);
        Paint paint = this.f27014c;
        paint.setColor(w02);
        paint.setAlpha((int) (Color.alpha(paint.getColor()) * this.d));
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth);
        canvas.drawArc(rectF, -90.0f, this.d * 360.0f, false, paint);
        canvas.restore();
        if (!this.f27015e) {
            float strokeWidth2 = paint.getStrokeWidth() * 2.5f * this.d;
            float f11 = 2.0f * strokeWidth2;
            float width = getWidth() - f11;
            float height = getHeight() - f11;
            ImageReceiver imageReceiver = this.f27012a;
            imageReceiver.setImageCoords(strokeWidth2, strokeWidth2, width, height);
            imageReceiver.draw(canvas);
        }
    }

    public void setAvatar(TLObject tLObject) {
        z8 z8Var = this.f27013b;
        z8Var.p(tLObject);
        this.f27012a.setForUserOrChat(tLObject, z8Var);
    }

    public void setHideAvatar(boolean z4) {
        this.f27015e = z4;
        invalidate();
    }
}
