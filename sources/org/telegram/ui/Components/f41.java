package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class f41 extends View implements org.telegram.ui.ActionBar.b6 {
    public int f26162a;
    public float f26163b;
    public final Paint f26164c;
    public final Paint d;
    public Drawable e;
    public boolean f26165f;
    public int h;
    public final RectF f26166n;

    public f41(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f26164c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f26165f = true;
        this.h = 0;
        this.f26166n = new RectF();
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false);
        this.f26162a = x02;
        paint.setColor(x02);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void drawableHotspotChanged(float f7, float f10) {
        super.drawableHotspotChanged(f7, f10);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setHotspot(f7, f10);
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        float f7;
        Canvas canvas2 = canvas;
        if (this.f26165f) {
            if (this.h == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f7 = this.f26163b;
            } else {
                f7 = 1.0f;
            }
            float dp = AndroidUtilities.dp((f7 * 26.0f) + 6.0f);
            RectF rectF = this.f26166n;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRoundRect(rectF, dp, dp, this.f26164c);
        }
        int i10 = this.h;
        Paint paint = this.d;
        if (i10 != 0) {
            if (i10 == 1) {
                float dp2 = AndroidUtilities.dp(21.0f);
                float width = getWidth() - AndroidUtilities.dp(21.0f);
                float height = getHeight() / 2.0f;
                canvas2.save();
                canvas2.translate((-AndroidUtilities.dp(2.0f)) * this.f26163b, 0.0f);
                canvas2.rotate(this.f26163b * 90.0f, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas2.drawLine(dp2 + ((width - dp2) * this.f26163b), height, width, height, paint);
                int dp3 = AndroidUtilities.dp((this.f26163b * (-1.0f)) + 9.0f);
                int dp4 = AndroidUtilities.dp((this.f26163b * 7.0f) + 9.0f);
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
            float max = (Math.max(0.4f, this.f26163b) - 0.4f) / 0.6f;
            if (max != 0.0f) {
                float B = (org.telegram.messenger.sl.B(21.0f, 2, getWidth()) * max) + AndroidUtilities.dp(21.0f);
                float height2 = getHeight() / 2.0f;
                canvas.drawLine(AndroidUtilities.dp(21.0f), height2, B, height2, paint);
                double dp5 = AndroidUtilities.dp(9.0f) * max;
                float cos = (float) (B - (Math.cos(0.7853981633974483d) * dp5));
                float sin = (float) (Math.sin(0.7853981633974483d) * dp5);
                canvas2 = canvas;
                canvas2.drawLine(B, height2, cos, height2 - sin, paint);
                canvas2.drawLine(B, height2, cos, height2 + sin, paint);
            } else {
                canvas2 = canvas;
            }
        }
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            this.e.setHotspotBounds(0, 0, getWidth(), getHeight());
            this.e.draw(canvas2);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f26164c.setColor(i10);
        invalidate();
    }

    public void setColor(int i10) {
        this.d.setColor(i10);
        invalidate();
    }

    public void setDrawBackground(boolean z10) {
        this.f26165f = z10;
    }

    public void setProgress(float f7) {
        this.f26163b = f7;
        invalidate();
    }

    public void setRippleDrawable(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    public void setTransformType(int i10) {
        this.h = i10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        Paint paint = this.f26164c;
        try {
            if (paint.getColor() == this.f26162a) {
                this.f26162a = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false);
                int color = paint.getColor();
                int i10 = this.f26162a;
                if (color != i10) {
                    paint.setColor(i10);
                    invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            Drawable drawable2 = this.e;
            if (drawable2 == null || drawable != drawable2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
