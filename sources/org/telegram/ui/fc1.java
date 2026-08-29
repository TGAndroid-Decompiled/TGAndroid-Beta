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
public final class fc1 extends org.telegram.ui.Components.t9 {
    public Drawable C;
    public final boolean D;
    public float E;
    public float F;
    public final qc1 G;

    public fc1(qc1 qc1Var, Activity activity) {
        super(activity);
        this.G = qc1Var;
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
        qc1 qc1Var = this.G;
        if (z10) {
            Drawable drawable = this.C;
            if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.yb0)) {
                if (drawable instanceof BitmapDrawable) {
                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                        canvas.save();
                        float f9 = 2.0f / AndroidUtilities.density;
                        canvas.scale(f9, f9);
                        this.C.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f9), (int) Math.ceil(getMeasuredHeight() / f9));
                        this.C.draw(canvas);
                        canvas.restore();
                    } else {
                        int measuredHeight = getMeasuredHeight();
                        float max = Math.max(getMeasuredWidth() / this.C.getIntrinsicWidth(), measuredHeight / this.C.getIntrinsicHeight());
                        int ceil = (int) Math.ceil(this.C.getIntrinsicWidth() * max * qc1Var.f41675u1);
                        int ceil2 = (int) Math.ceil(this.C.getIntrinsicHeight() * max * qc1Var.f41675u1);
                        int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                        int i10 = (measuredHeight - ceil2) / 2;
                        this.F = i10;
                        this.C.setBounds(measuredWidth, i10, ceil + measuredWidth, ceil2 + i10);
                        this.C.draw(canvas);
                    }
                }
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.C.draw(canvas);
            }
        }
        if (qc1Var.W1) {
            if (!qc1Var.f41630c.isFinished() && qc1Var.f41630c.computeScrollOffset()) {
                if (qc1Var.f41630c.getStartX() < qc1Var.S1 && qc1Var.f41630c.getStartX() > 0) {
                    qc1Var.T1 = qc1Var.f41630c.getCurrX();
                }
                qc1Var.V0();
                invalidate();
            }
            canvas.save();
            float f10 = -qc1Var.T1;
            this.E = f10;
            canvas.translate(f10, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (qc1Var.I1) {
            float f11 = qc1Var.f41652j1;
            if (f11 > 0.0f) {
                canvas.drawColor(i0.a.k(-16777216, (int) (f11 * 255.0f * qc1Var.f41654k1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        qc1 qc1Var = this.G;
        org.telegram.ui.Components.c81 c81Var = qc1Var.f41668r1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        c81Var.getClass();
        float a2 = org.telegram.ui.Components.c81.a(measuredWidth, measuredHeight);
        qc1Var.f41675u1 = a2;
        if (qc1Var.A1) {
            setScaleX(a2);
            setScaleY(qc1Var.f41675u1);
        }
        if (qc1Var.f41626b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (qc1Var.X1 != measuredWidth2) {
            qc1Var.W1 = false;
            Bitmap bitmap = qc1Var.f41686y1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / qc1Var.f41686y1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    qc1Var.W1 = true;
                    qc1Var.V1 = (int) ((qc1Var.f41686y1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    qc1Var.T1 = measuredWidth3;
                    qc1Var.U1 = measuredWidth3;
                    qc1Var.S1 = measuredWidth3 * 2.0f;
                    s(measuredHeight2, getMeasuredHeight());
                    this.v = true;
                    qc1Var.V0();
                }
            }
            if (!qc1Var.W1) {
                s(-1, -1);
                this.v = false;
            }
        }
        qc1Var.X1 = measuredWidth2;
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
