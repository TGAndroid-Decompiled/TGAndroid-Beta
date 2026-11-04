package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class n11 extends View implements org.telegram.ui.ActionBar.z5 {
    public int f36329a;
    public float f36330b;
    public final Paint f36331c;
    public final Paint d;
    public Drawable f36332e;
    public boolean f36333f;
    public int h;
    public final RectF f36334n;

    public n11(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f36331c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f36333f = true;
        this.h = 0;
        this.f36334n = new RectF();
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false);
        this.f36329a = x02;
        paint.setColor(x02);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f36332e;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f36332e;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f36332e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        float f10;
        Canvas canvas2 = canvas;
        if (this.f36333f) {
            if (this.h == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f10 = this.f36330b;
            } else {
                f10 = 1.0f;
            }
            float L = org.telegram.messenger.g0.L((f10 * 26.0f) + 6.0f);
            RectF rectF = this.f36334n;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRoundRect(rectF, L, L, this.f36331c);
        }
        int i3 = this.h;
        Paint paint = this.d;
        if (i3 != 0) {
            if (i3 == 1) {
                float L2 = org.telegram.messenger.g0.L(21.0f);
                float width = getWidth() - org.telegram.messenger.g0.L(21.0f);
                float height = getHeight() / 2.0f;
                canvas2.save();
                canvas2.translate((-org.telegram.messenger.g0.L(2.0f)) * this.f36330b, 0.0f);
                canvas2.rotate(this.f36330b * 90.0f, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas2.drawLine(L2 + ((width - L2) * this.f36330b), height, width, height, paint);
                int L3 = org.telegram.messenger.g0.L((this.f36330b * (-1.0f)) + 9.0f);
                int L4 = org.telegram.messenger.g0.L((this.f36330b * 7.0f) + 9.0f);
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
            float max = (Math.max(0.4f, this.f36330b) - 0.4f) / 0.6f;
            if (max != 0.0f) {
                float A = (org.telegram.messenger.camera.q.A(21.0f, 2, getWidth()) * max) + org.telegram.messenger.g0.L(21.0f);
                float height2 = getHeight() / 2.0f;
                canvas.drawLine(org.telegram.messenger.g0.L(21.0f), height2, A, height2, paint);
                double L5 = org.telegram.messenger.g0.L(9.0f) * max;
                float cos = (float) (A - (Math.cos(0.7853981633974483d) * L5));
                float sin = (float) (Math.sin(0.7853981633974483d) * L5);
                canvas2 = canvas;
                canvas2.drawLine(A, height2, cos, height2 - sin, paint);
                canvas2.drawLine(A, height2, cos, height2 + sin, paint);
            } else {
                canvas2 = canvas;
            }
        }
        Drawable drawable = this.f36332e;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            this.f36332e.setHotspotBounds(0, 0, getWidth(), getHeight());
            this.f36332e.draw(canvas2);
        }
    }

    @Override
    public void setBackgroundColor(int i3) {
        this.f36331c.setColor(i3);
        invalidate();
    }

    public void setColor(int i3) {
        this.d.setColor(i3);
        invalidate();
    }

    public void setDrawBackground(boolean z10) {
        this.f36333f = z10;
    }

    public void setProgress(float f10) {
        this.f36330b = f10;
        invalidate();
    }

    public void setRippleDrawable(Drawable drawable) {
        this.f36332e = drawable;
        invalidate();
    }

    public void setTransformType(int i3) {
        this.h = i3;
        invalidate();
    }

    @Override
    public final void updateColors() {
        Paint paint = this.f36331c;
        try {
            if (paint.getColor() == this.f36329a) {
                this.f36329a = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false);
                int color = paint.getColor();
                int i3 = this.f36329a;
                if (color != i3) {
                    paint.setColor(i3);
                    invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            Drawable drawable2 = this.f36332e;
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
