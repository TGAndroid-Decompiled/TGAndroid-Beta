package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class md1 extends org.telegram.ui.Components.u9 {
    public Drawable G;
    public final boolean H;
    public float I;
    public float J;
    public final xd1 K;

    public md1(xd1 xd1Var, Activity activity) {
        super(activity);
        this.K = xd1Var;
        this.H = true;
    }

    @Override
    public Drawable getBackground() {
        return this.G;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.I = 0.0f;
        this.J = 0.0f;
        boolean z10 = this.H;
        xd1 xd1Var = this.K;
        if (z10) {
            Drawable drawable = this.G;
            if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.cc0)) {
                if (drawable instanceof BitmapDrawable) {
                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                        canvas.save();
                        float f7 = 2.0f / AndroidUtilities.density;
                        canvas.scale(f7, f7);
                        this.G.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f7), (int) Math.ceil(getMeasuredHeight() / f7));
                        this.G.draw(canvas);
                        canvas.restore();
                    } else {
                        int measuredHeight = getMeasuredHeight();
                        float max = Math.max(getMeasuredWidth() / this.G.getIntrinsicWidth(), measuredHeight / this.G.getIntrinsicHeight());
                        int ceil = (int) Math.ceil(this.G.getIntrinsicWidth() * max * xd1Var.f39597y1);
                        int ceil2 = (int) Math.ceil(this.G.getIntrinsicHeight() * max * xd1Var.f39597y1);
                        int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                        int i10 = (measuredHeight - ceil2) / 2;
                        this.J = i10;
                        this.G.setBounds(measuredWidth, i10, ceil + measuredWidth, ceil2 + i10);
                        this.G.draw(canvas);
                    }
                }
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.G.draw(canvas);
            }
        }
        if (xd1Var.a2) {
            if (!xd1Var.f39538c.isFinished() && xd1Var.f39538c.computeScrollOffset()) {
                if (xd1Var.f39538c.getStartX() < xd1Var.W1 && xd1Var.f39538c.getStartX() > 0) {
                    xd1Var.X1 = xd1Var.f39538c.getCurrX();
                }
                xd1Var.V0();
                invalidate();
            }
            canvas.save();
            float f10 = -xd1Var.X1;
            this.I = f10;
            canvas.translate(f10, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (xd1Var.M1) {
            float f11 = xd1Var.f39570n1;
            if (f11 > 0.0f) {
                canvas.drawColor(i0.a.k(-16777216, (int) (f11 * 255.0f * xd1Var.f39572o1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        xd1 xd1Var = this.K;
        org.telegram.ui.Components.m81 m81Var = xd1Var.f39588v1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        m81Var.getClass();
        float a2 = org.telegram.ui.Components.m81.a(measuredWidth, measuredHeight);
        xd1Var.f39597y1 = a2;
        if (xd1Var.E1) {
            setScaleX(a2);
            setScaleY(xd1Var.f39597y1);
        }
        if (xd1Var.f39534b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (xd1Var.f39537b2 != measuredWidth2) {
            xd1Var.a2 = false;
            Bitmap bitmap = xd1Var.C1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / xd1Var.C1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    xd1Var.a2 = true;
                    xd1Var.Z1 = (int) ((xd1Var.C1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    xd1Var.X1 = measuredWidth3;
                    xd1Var.Y1 = measuredWidth3;
                    xd1Var.W1 = measuredWidth3 * 2.0f;
                    s(measuredHeight2, getMeasuredHeight());
                    this.v = true;
                    xd1Var.V0();
                }
            }
            if (!xd1Var.a2) {
                s(-1, -1);
                this.v = false;
            }
        }
        xd1Var.f39537b2 = measuredWidth2;
    }

    @Override
    public void setBackground(Drawable drawable) {
        this.G = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.G != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
