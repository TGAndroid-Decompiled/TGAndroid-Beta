package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s31 extends View {
    public float f26930a;
    public final Paint f26931b;
    public final Paint f26932c;
    public Drawable d;
    public boolean e;
    public int f26933f;
    public final RectF h;

    public s31(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f26931b = paint;
        Paint paint2 = new Paint(1);
        this.f26932c = paint2;
        this.e = true;
        this.f26933f = 0;
        this.h = new RectF();
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.P9, false));
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void drawableHotspotChanged(float f7, float f10) {
        super.drawableHotspotChanged(f7, f10);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setHotspot(f7, f10);
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        float f7;
        Canvas canvas2 = canvas;
        if (this.e) {
            if (this.f26933f == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f7 = this.f26930a;
            } else {
                f7 = 1.0f;
            }
            float dp = AndroidUtilities.dp((f7 * 26.0f) + 6.0f);
            RectF rectF = this.h;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRoundRect(rectF, dp, dp, this.f26931b);
        }
        int i10 = this.f26933f;
        Paint paint = this.f26932c;
        if (i10 != 0) {
            if (i10 == 1) {
                float dp2 = AndroidUtilities.dp(21.0f);
                float width = getWidth() - AndroidUtilities.dp(21.0f);
                float height = getHeight() / 2.0f;
                canvas2.save();
                canvas2.translate((-AndroidUtilities.dp(2.0f)) * this.f26930a, 0.0f);
                canvas2.rotate(this.f26930a * 90.0f, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas2.drawLine(dp2 + ((width - dp2) * this.f26930a), height, width, height, paint);
                int dp3 = AndroidUtilities.dp((this.f26930a * (-1.0f)) + 9.0f);
                int dp4 = AndroidUtilities.dp((this.f26930a * 7.0f) + 9.0f);
                double d = width;
                double d10 = dp3;
                double d11 = height;
                canvas.drawLine(width, height, (float) (d - (Math.cos(0.7853981633974483d) * d10)), (float) ((Math.sin(0.7853981633974483d) * d10) + d11), paint);
                double d12 = dp4;
                canvas2 = canvas;
                canvas2.drawLine(width, height, (float) (d - (Math.cos(0.7853981633974483d) * d12)), (float) (d11 - (Math.sin(0.7853981633974483d) * d12)), paint);
                canvas.restore();
            }
        } else {
            float max = (Math.max(0.4f, this.f26930a) - 0.4f) / 0.6f;
            if (max != 0.0f) {
                float A = (org.telegram.messenger.em.A(21.0f, 2, getWidth()) * max) + AndroidUtilities.dp(21.0f);
                float height2 = getHeight() / 2.0f;
                canvas.drawLine(AndroidUtilities.dp(21.0f), height2, A, height2, paint);
                double dp5 = AndroidUtilities.dp(9.0f) * max;
                float cos = (float) (A - (Math.cos(0.7853981633974483d) * dp5));
                float sin = (float) (Math.sin(0.7853981633974483d) * dp5);
                canvas2 = canvas;
                canvas2.drawLine(A, height2, cos, height2 - sin, paint);
                canvas2.drawLine(A, height2, cos, height2 + sin, paint);
            } else {
                canvas2 = canvas;
            }
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            this.d.setHotspotBounds(0, 0, getWidth(), getHeight());
            this.d.draw(canvas2);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f26931b.setColor(i10);
        invalidate();
    }

    public void setColor(int i10) {
        this.f26932c.setColor(i10);
        invalidate();
    }

    public void setDrawBackground(boolean z10) {
        this.e = z10;
    }

    public void setProgress(float f7) {
        this.f26930a = f7;
        invalidate();
    }

    public void setRippleDrawable(Drawable drawable) {
        this.d = drawable;
        invalidate();
    }

    public void setTransformType(int i10) {
        this.f26933f = i10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            Drawable drawable2 = this.d;
            if (drawable2 == null || drawable != drawable2) {
                return false;
            }
            return true;
        }
        return true;
    }
}
