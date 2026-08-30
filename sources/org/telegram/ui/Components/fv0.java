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
    public final ImageReceiver f24963a;
    public final z8 f24964b;
    public final Paint f24965c;
    public float d;
    public boolean e;
    public ValueAnimator f24966f;

    public fv0(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f24963a = imageReceiver;
        this.f24964b = new z8((org.telegram.ui.ActionBar.f6) null);
        Paint paint = new Paint(1);
        this.f24965c = paint;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(boolean z4, boolean z10) {
        ValueAnimator valueAnimator = this.f24966f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        if (z10) {
            if (z4) {
                f10 = 1.0f;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.d, f10).setDuration(200L);
            duration.setInterpolator(nr.f27346f);
            duration.addUpdateListener(new i70(this, 21));
            duration.addListener(new nd0(this, 14));
            duration.start();
            this.f24966f = duration;
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
        this.f24963a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24963a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float f10 = (this.d * 0.1f) + 0.9f;
        canvas.scale(f10, f10);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20066m5, false);
        Paint paint = this.f24965c;
        paint.setColor(w02);
        paint.setAlpha((int) (Color.alpha(paint.getColor()) * this.d));
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth);
        canvas.drawArc(rectF, -90.0f, this.d * 360.0f, false, paint);
        canvas.restore();
        if (!this.e) {
            float strokeWidth2 = paint.getStrokeWidth() * 2.5f * this.d;
            float f11 = 2.0f * strokeWidth2;
            float width = getWidth() - f11;
            float height = getHeight() - f11;
            ImageReceiver imageReceiver = this.f24963a;
            imageReceiver.setImageCoords(strokeWidth2, strokeWidth2, width, height);
            imageReceiver.draw(canvas);
        }
    }

    public void setAvatar(TLObject tLObject) {
        z8 z8Var = this.f24964b;
        z8Var.p(tLObject);
        this.f24963a.setForUserOrChat(tLObject, z8Var);
    }

    public void setHideAvatar(boolean z4) {
        this.e = z4;
        invalidate();
    }
}
