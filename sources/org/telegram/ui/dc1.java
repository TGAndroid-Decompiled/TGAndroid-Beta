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
public final class dc1 extends org.telegram.ui.Components.o9 {
    public Drawable C;
    public final boolean D;
    public float E;
    public float F;
    public final oc1 G;

    public dc1(oc1 oc1Var, Activity activity) {
        super(activity);
        this.G = oc1Var;
        this.D = true;
    }

    @Override
    public Drawable getBackground() {
        return this.C;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.E = 0.0f;
        this.F = 0.0f;
        boolean z10 = this.D;
        oc1 oc1Var = this.G;
        if (z10) {
            Drawable drawable = this.C;
            if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.jb0)) {
                if (drawable instanceof BitmapDrawable) {
                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                        canvas.save();
                        float f10 = 2.0f / AndroidUtilities.density;
                        canvas.scale(f10, f10);
                        this.C.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                        this.C.draw(canvas);
                        canvas.restore();
                    } else {
                        int measuredHeight = getMeasuredHeight();
                        float max = Math.max(getMeasuredWidth() / this.C.getIntrinsicWidth(), measuredHeight / this.C.getIntrinsicHeight());
                        int ceil = (int) Math.ceil(this.C.getIntrinsicWidth() * max * oc1Var.f41108u1);
                        int ceil2 = (int) Math.ceil(this.C.getIntrinsicHeight() * max * oc1Var.f41108u1);
                        int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                        int i9 = (measuredHeight - ceil2) / 2;
                        this.F = i9;
                        this.C.setBounds(measuredWidth, i9, ceil + measuredWidth, ceil2 + i9);
                        this.C.draw(canvas);
                    }
                }
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.C.draw(canvas);
            }
        }
        if (oc1Var.W1) {
            if (!oc1Var.f41063c.isFinished() && oc1Var.f41063c.computeScrollOffset()) {
                if (oc1Var.f41063c.getStartX() < oc1Var.S1 && oc1Var.f41063c.getStartX() > 0) {
                    oc1Var.T1 = oc1Var.f41063c.getCurrX();
                }
                oc1Var.V0();
                invalidate();
            }
            canvas.save();
            float f11 = -oc1Var.T1;
            this.E = f11;
            canvas.translate(f11, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (oc1Var.I1) {
            float f12 = oc1Var.f41085j1;
            if (f12 > 0.0f) {
                canvas.drawColor(i0.a.k(-16777216, (int) (f12 * 255.0f * oc1Var.f41087k1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        oc1 oc1Var = this.G;
        org.telegram.ui.Components.q71 q71Var = oc1Var.f41101r1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        q71Var.getClass();
        float a2 = org.telegram.ui.Components.q71.a(measuredWidth, measuredHeight);
        oc1Var.f41108u1 = a2;
        if (oc1Var.A1) {
            setScaleX(a2);
            setScaleY(oc1Var.f41108u1);
        }
        if (oc1Var.f41059b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (oc1Var.X1 != measuredWidth2) {
            oc1Var.W1 = false;
            Bitmap bitmap = oc1Var.f41119y1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / oc1Var.f41119y1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    oc1Var.W1 = true;
                    oc1Var.V1 = (int) ((oc1Var.f41119y1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    oc1Var.T1 = measuredWidth3;
                    oc1Var.U1 = measuredWidth3;
                    oc1Var.S1 = measuredWidth3 * 2.0f;
                    s(measuredHeight2, getMeasuredHeight());
                    this.v = true;
                    oc1Var.V0();
                }
            }
            if (!oc1Var.W1) {
                s(-1, -1);
                this.v = false;
            }
        }
        oc1Var.X1 = measuredWidth2;
    }

    @Override
    public void setBackground(Drawable drawable) {
        this.C = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.C != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
