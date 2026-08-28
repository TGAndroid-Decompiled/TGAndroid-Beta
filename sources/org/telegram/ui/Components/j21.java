package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j21 extends View {
    public float f29609a;
    public final Paint f29610b;
    public final Paint f29611c;
    public Drawable d;
    public boolean f29612e;
    public int f29613f;
    public final RectF h;

    public j21(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f29610b = paint;
        Paint paint2 = new Paint(1);
        this.f29611c = paint2;
        this.f29612e = true;
        this.f29613f = 0;
        this.h = new RectF();
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.P9, false));
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
        boolean z10;
        float f10;
        Canvas canvas2 = canvas;
        if (this.f29612e) {
            if (this.f29613f == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f10 = this.f29609a;
            } else {
                f10 = 1.0f;
            }
            float dp = AndroidUtilities.dp((f10 * 26.0f) + 6.0f);
            RectF rectF = this.h;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRoundRect(rectF, dp, dp, this.f29610b);
        }
        int i9 = this.f29613f;
        Paint paint = this.f29611c;
        if (i9 != 0) {
            if (i9 == 1) {
                float dp2 = AndroidUtilities.dp(21.0f);
                float width = getWidth() - AndroidUtilities.dp(21.0f);
                float height = getHeight() / 2.0f;
                canvas2.save();
                canvas2.translate((-AndroidUtilities.dp(2.0f)) * this.f29609a, 0.0f);
                canvas2.rotate(this.f29609a * 90.0f, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas2.drawLine(dp2 + ((width - dp2) * this.f29609a), height, width, height, paint);
                int dp3 = AndroidUtilities.dp((this.f29609a * (-1.0f)) + 9.0f);
                int dp4 = AndroidUtilities.dp((this.f29609a * 7.0f) + 9.0f);
                double d = width;
                double d9 = dp3;
                double d10 = height;
                canvas.drawLine(width, height, (float) (d - (Math.cos(0.7853981633974483d) * d9)), (float) ((Math.sin(0.7853981633974483d) * d9) + d10), paint);
                double d11 = dp4;
                canvas2 = canvas;
                canvas2.drawLine(width, height, (float) (d - (Math.cos(0.7853981633974483d) * d11)), (float) (d10 - (Math.sin(0.7853981633974483d) * d11)), paint);
                canvas.restore();
            }
        } else {
            float max = (Math.max(0.4f, this.f29609a) - 0.4f) / 0.6f;
            if (max != 0.0f) {
                float A = (org.telegram.messenger.ll.A(21.0f, 2, getWidth()) * max) + AndroidUtilities.dp(21.0f);
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
    public void setBackgroundColor(int i9) {
        this.f29610b.setColor(i9);
        invalidate();
    }

    public void setColor(int i9) {
        this.f29611c.setColor(i9);
        invalidate();
    }

    public void setDrawBackground(boolean z10) {
        this.f29612e = z10;
    }

    public void setProgress(float f10) {
        this.f29609a = f10;
        invalidate();
    }

    public void setRippleDrawable(Drawable drawable) {
        this.d = drawable;
        invalidate();
    }

    public void setTransformType(int i9) {
        this.f29613f = i9;
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
