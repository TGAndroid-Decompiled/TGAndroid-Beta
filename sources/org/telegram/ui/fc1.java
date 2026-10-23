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
public final class fc1 extends org.telegram.ui.Components.w9 {
    public Drawable G;
    public final boolean H;
    public float I;
    public float J;
    public final qc1 K;

    public fc1(qc1 qc1Var, Activity activity) {
        super(activity);
        this.K = qc1Var;
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
        qc1 qc1Var = this.K;
        if (z10) {
            Drawable drawable = this.G;
            if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.yc0)) {
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
                        int ceil = (int) Math.ceil(this.G.getIntrinsicWidth() * max * qc1Var.f40782z1);
                        int ceil2 = (int) Math.ceil(this.G.getIntrinsicHeight() * max * qc1Var.f40782z1);
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
        if (qc1Var.f40719b2) {
            if (!qc1Var.f40720c.isFinished() && qc1Var.f40720c.computeScrollOffset()) {
                if (qc1Var.f40720c.getStartX() < qc1Var.X1 && qc1Var.f40720c.getStartX() > 0) {
                    qc1Var.Y1 = qc1Var.f40720c.getCurrX();
                }
                qc1Var.V0();
                invalidate();
            }
            canvas.save();
            float f10 = -qc1Var.Y1;
            this.I = f10;
            canvas.translate(f10, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (qc1Var.N1) {
            float f11 = qc1Var.f40755o1;
            if (f11 > 0.0f) {
                canvas.drawColor(i0.a.o(-16777216, (int) (f11 * 255.0f * qc1Var.f40757p1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        qc1 qc1Var = this.K;
        org.telegram.ui.Components.o91 o91Var = qc1Var.f40774w1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        o91Var.getClass();
        float a2 = org.telegram.ui.Components.o91.a(measuredWidth, measuredHeight);
        qc1Var.f40782z1 = a2;
        if (qc1Var.F1) {
            setScaleX(a2);
            setScaleY(qc1Var.f40782z1);
        }
        if (qc1Var.f40716b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (qc1Var.f40723c2 != measuredWidth2) {
            qc1Var.f40719b2 = false;
            Bitmap bitmap = qc1Var.D1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / qc1Var.D1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    qc1Var.f40719b2 = true;
                    qc1Var.a2 = (int) ((qc1Var.D1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    qc1Var.Y1 = measuredWidth3;
                    qc1Var.Z1 = measuredWidth3;
                    qc1Var.X1 = measuredWidth3 * 2.0f;
                    s(measuredHeight2, getMeasuredHeight());
                    this.v = true;
                    qc1Var.V0();
                }
            }
            if (!qc1Var.f40719b2) {
                s(-1, -1);
                this.v = false;
            }
        }
        qc1Var.f40723c2 = measuredWidth2;
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
