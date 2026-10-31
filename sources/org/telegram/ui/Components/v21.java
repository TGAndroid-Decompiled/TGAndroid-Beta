package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class v21 extends View implements org.telegram.ui.ActionBar.k6 {
    public int f31122a;
    public float f31123b;
    public final Paint f31124c;
    public final Paint d;
    public Drawable e;
    public boolean f31125f;
    public int h;
    public final RectF f31126n;

    public v21(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f31124c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f31125f = true;
        this.h = 0;
        this.f31126n = new RectF();
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.P9, false);
        this.f31122a = x02;
        paint.setColor(x02);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
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
        if (this.f31125f) {
            if (this.h == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f7 = this.f31123b;
            } else {
                f7 = 1.0f;
            }
            float L = org.telegram.messenger.i0.L((f7 * 26.0f) + 6.0f);
            RectF rectF = this.f31126n;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRoundRect(rectF, L, L, this.f31124c);
        }
        int i10 = this.h;
        Paint paint = this.d;
        if (i10 != 0) {
            if (i10 == 1) {
                float L2 = org.telegram.messenger.i0.L(21.0f);
                float width = getWidth() - org.telegram.messenger.i0.L(21.0f);
                float height = getHeight() / 2.0f;
                canvas2.save();
                canvas2.translate((-org.telegram.messenger.i0.L(2.0f)) * this.f31123b, 0.0f);
                canvas2.rotate(this.f31123b * 90.0f, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas2.drawLine(L2 + ((width - L2) * this.f31123b), height, width, height, paint);
                int L3 = org.telegram.messenger.i0.L((this.f31123b * (-1.0f)) + 9.0f);
                int L4 = org.telegram.messenger.i0.L((this.f31123b * 7.0f) + 9.0f);
                double d = width;
                double d10 = L3;
                double d11 = height;
                canvas.drawLine(width, height, (float) (d - (Math.cos(0.7853981633974483d) * d10)), (float) ((Math.sin(0.7853981633974483d) * d10) + d11), paint);
                double d12 = L4;
                canvas2 = canvas;
                canvas2.drawLine(width, height, (float) (d - (Math.cos(0.7853981633974483d) * d12)), (float) (d11 - (Math.sin(0.7853981633974483d) * d12)), paint);
                canvas.restore();
            }
        } else {
            float max = (Math.max(0.4f, this.f31123b) - 0.4f) / 0.6f;
            if (max != 0.0f) {
                float A = (org.telegram.messenger.z20.A(21.0f, 2, getWidth()) * max) + org.telegram.messenger.i0.L(21.0f);
                float height2 = getHeight() / 2.0f;
                canvas.drawLine(org.telegram.messenger.i0.L(21.0f), height2, A, height2, paint);
                double L5 = org.telegram.messenger.i0.L(9.0f) * max;
                float cos = (float) (A - (Math.cos(0.7853981633974483d) * L5));
                float sin = (float) (Math.sin(0.7853981633974483d) * L5);
                canvas2 = canvas;
                canvas2.drawLine(A, height2, cos, height2 - sin, paint);
                canvas2.drawLine(A, height2, cos, height2 + sin, paint);
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
        this.f31124c.setColor(i10);
        invalidate();
    }

    public void setColor(int i10) {
        this.d.setColor(i10);
        invalidate();
    }

    public void setDrawBackground(boolean z10) {
        this.f31125f = z10;
    }

    public void setProgress(float f7) {
        this.f31123b = f7;
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
        Paint paint = this.f31124c;
        try {
            if (paint.getColor() == this.f31122a) {
                this.f31122a = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.P9, false);
                int color = paint.getColor();
                int i10 = this.f31122a;
                if (color != i10) {
                    paint.setColor(i10);
                    invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
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
