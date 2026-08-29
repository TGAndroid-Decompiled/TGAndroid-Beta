package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u21 extends View {
    public float f33109a;
    public final Paint f33110b;
    public final Paint f33111c;
    public Drawable d;
    public boolean f33112e;
    public int f33113f;
    public final RectF h;

    public u21(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f33110b = paint;
        Paint paint2 = new Paint(1);
        this.f33111c = paint2;
        this.f33112e = true;
        this.f33113f = 0;
        this.h = new RectF();
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.P9, false));
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void drawableHotspotChanged(float f9, float f10) {
        super.drawableHotspotChanged(f9, f10);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setHotspot(f9, f10);
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
        float f9;
        Canvas canvas2 = canvas;
        if (this.f33112e) {
            if (this.f33113f == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f9 = this.f33109a;
            } else {
                f9 = 1.0f;
            }
            float dp = AndroidUtilities.dp((f9 * 26.0f) + 6.0f);
            RectF rectF = this.h;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRoundRect(rectF, dp, dp, this.f33110b);
        }
        int i10 = this.f33113f;
        Paint paint = this.f33111c;
        if (i10 != 0) {
            if (i10 == 1) {
                float dp2 = AndroidUtilities.dp(21.0f);
                float width = getWidth() - AndroidUtilities.dp(21.0f);
                float height = getHeight() / 2.0f;
                canvas2.save();
                canvas2.translate((-AndroidUtilities.dp(2.0f)) * this.f33109a, 0.0f);
                canvas2.rotate(this.f33109a * 90.0f, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas2.drawLine(dp2 + ((width - dp2) * this.f33109a), height, width, height, paint);
                int dp3 = AndroidUtilities.dp((this.f33109a * (-1.0f)) + 9.0f);
                int dp4 = AndroidUtilities.dp((this.f33109a * 7.0f) + 9.0f);
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
            float max = (Math.max(0.4f, this.f33109a) - 0.4f) / 0.6f;
            if (max != 0.0f) {
                float z11 = (org.telegram.ui.b.z(21.0f, 2, getWidth()) * max) + AndroidUtilities.dp(21.0f);
                float height2 = getHeight() / 2.0f;
                canvas.drawLine(AndroidUtilities.dp(21.0f), height2, z11, height2, paint);
                double dp5 = AndroidUtilities.dp(9.0f) * max;
                float cos = (float) (z11 - (Math.cos(0.7853981633974483d) * dp5));
                float sin = (float) (Math.sin(0.7853981633974483d) * dp5);
                canvas2 = canvas;
                canvas2.drawLine(z11, height2, cos, height2 - sin, paint);
                canvas2.drawLine(z11, height2, cos, height2 + sin, paint);
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
        this.f33110b.setColor(i10);
        invalidate();
    }

    public void setColor(int i10) {
        this.f33111c.setColor(i10);
        invalidate();
    }

    public void setDrawBackground(boolean z10) {
        this.f33112e = z10;
    }

    public void setProgress(float f9) {
        this.f33109a = f9;
        invalidate();
    }

    public void setRippleDrawable(Drawable drawable) {
        this.d = drawable;
        invalidate();
    }

    public void setTransformType(int i10) {
        this.f33113f = i10;
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
