package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e31 extends View {
    public float f24451a;
    public final Paint f24452b;
    public final Paint f24453c;
    public Drawable d;
    public boolean e;
    public int f24454f;
    public final RectF h;

    public e31(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f24452b = paint;
        Paint paint2 = new Paint(1);
        this.f24453c = paint2;
        this.e = true;
        this.f24454f = 0;
        this.h = new RectF();
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.P9, false));
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
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
        boolean z4;
        float f10;
        Canvas canvas2 = canvas;
        if (this.e) {
            if (this.f24454f == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                f10 = this.f24451a;
            } else {
                f10 = 1.0f;
            }
            float dp = AndroidUtilities.dp((f10 * 26.0f) + 6.0f);
            RectF rectF = this.h;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRoundRect(rectF, dp, dp, this.f24452b);
        }
        int i10 = this.f24454f;
        Paint paint = this.f24453c;
        if (i10 != 0) {
            if (i10 == 1) {
                float dp2 = AndroidUtilities.dp(21.0f);
                float width = getWidth() - AndroidUtilities.dp(21.0f);
                float height = getHeight() / 2.0f;
                canvas2.save();
                canvas2.translate((-AndroidUtilities.dp(2.0f)) * this.f24451a, 0.0f);
                canvas2.rotate(this.f24451a * 90.0f, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas2.drawLine(dp2 + ((width - dp2) * this.f24451a), height, width, height, paint);
                int dp3 = AndroidUtilities.dp((this.f24451a * (-1.0f)) + 9.0f);
                int dp4 = AndroidUtilities.dp((this.f24451a * 7.0f) + 9.0f);
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
            float max = (Math.max(0.4f, this.f24451a) - 0.4f) / 0.6f;
            if (max != 0.0f) {
                float z10 = (org.telegram.ui.b.z(21.0f, 2, getWidth()) * max) + AndroidUtilities.dp(21.0f);
                float height2 = getHeight() / 2.0f;
                canvas.drawLine(AndroidUtilities.dp(21.0f), height2, z10, height2, paint);
                double dp5 = AndroidUtilities.dp(9.0f) * max;
                float cos = (float) (z10 - (Math.cos(0.7853981633974483d) * dp5));
                float sin = (float) (Math.sin(0.7853981633974483d) * dp5);
                canvas2 = canvas;
                canvas2.drawLine(z10, height2, cos, height2 - sin, paint);
                canvas2.drawLine(z10, height2, cos, height2 + sin, paint);
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
        this.f24452b.setColor(i10);
        invalidate();
    }

    public void setColor(int i10) {
        this.f24453c.setColor(i10);
        invalidate();
    }

    public void setDrawBackground(boolean z4) {
        this.e = z4;
    }

    public void setProgress(float f10) {
        this.f24451a = f10;
        invalidate();
    }

    public void setRippleDrawable(Drawable drawable) {
        this.d = drawable;
        invalidate();
    }

    public void setTransformType(int i10) {
        this.f24454f = i10;
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
