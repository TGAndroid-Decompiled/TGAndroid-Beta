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

public final class cc1 extends org.telegram.ui.Components.n9 {
    public Drawable C;
    public final boolean D;
    public float E;
    public float F;
    public final nc1 G;

    public cc1(nc1 nc1Var, Activity activity) {
        super(activity);
        this.G = nc1Var;
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
        nc1 nc1Var = this.G;
        if (z10) {
            Drawable drawable = this.C;
            if ((drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof org.telegram.ui.Components.nb0)) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.C.draw(canvas);
            } else if (drawable instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f10 = 2.0f / AndroidUtilities.density;
                    canvas.scale(f10, f10);
                    this.C.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                    this.C.draw(canvas);
                    canvas.restore();
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float fMax = Math.max(getMeasuredWidth() / this.C.getIntrinsicWidth(), measuredHeight / this.C.getIntrinsicHeight());
                    int iCeil = (int) Math.ceil(this.C.getIntrinsicWidth() * fMax * nc1Var.f40787u1);
                    int iCeil2 = (int) Math.ceil(this.C.getIntrinsicHeight() * fMax * nc1Var.f40787u1);
                    int measuredWidth = (getMeasuredWidth() - iCeil) / 2;
                    int i10 = (measuredHeight - iCeil2) / 2;
                    this.F = i10;
                    this.C.setBounds(measuredWidth, i10, iCeil + measuredWidth, iCeil2 + i10);
                    this.C.draw(canvas);
                }
            }
        }
        if (nc1Var.W1) {
            if (!nc1Var.f40742c.isFinished() && nc1Var.f40742c.computeScrollOffset()) {
                if (nc1Var.f40742c.getStartX() < nc1Var.S1 && nc1Var.f40742c.getStartX() > 0) {
                    nc1Var.T1 = nc1Var.f40742c.getCurrX();
                }
                nc1Var.V0();
                invalidate();
            }
            canvas.save();
            float f11 = -nc1Var.T1;
            this.E = f11;
            canvas.translate(f11, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (nc1Var.I1) {
            float f12 = nc1Var.f40764j1;
            if (f12 > 0.0f) {
                canvas.drawColor(i0.b.k(-16777216, (int) (f12 * 255.0f * nc1Var.f40766k1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        nc1 nc1Var = this.G;
        org.telegram.ui.Components.s71 s71Var = nc1Var.f40780r1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        s71Var.getClass();
        float fA = org.telegram.ui.Components.s71.a(measuredWidth, measuredHeight);
        nc1Var.f40787u1 = fA;
        if (nc1Var.A1) {
            setScaleX(fA);
            setScaleY(nc1Var.f40787u1);
        }
        if (nc1Var.f40738b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (nc1Var.X1 != measuredWidth2) {
            nc1Var.W1 = false;
            Bitmap bitmap = nc1Var.f40798y1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / nc1Var.f40798y1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    nc1Var.W1 = true;
                    nc1Var.V1 = (int) ((nc1Var.f40798y1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    nc1Var.T1 = measuredWidth3;
                    nc1Var.U1 = measuredWidth3;
                    nc1Var.S1 = measuredWidth3 * 2.0f;
                    s(measuredHeight2, getMeasuredHeight());
                    this.v = true;
                    nc1Var.V0();
                }
            }
            if (!nc1Var.W1) {
                s(-1, -1);
                this.v = false;
            }
        }
        nc1Var.X1 = measuredWidth2;
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
        return this.C == drawable || super.verifyDrawable(drawable);
    }
}
