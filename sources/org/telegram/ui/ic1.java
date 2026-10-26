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
public final class ic1 extends org.telegram.ui.Components.y9 {
    public Drawable G;
    public final boolean H;
    public float I;
    public float J;
    public final tc1 K;

    public ic1(tc1 tc1Var, Activity activity) {
        super(activity);
        this.K = tc1Var;
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
        tc1 tc1Var = this.K;
        if (z10) {
            Drawable drawable = this.G;
            if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.uc0)) {
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
                        int ceil = (int) Math.ceil(this.G.getIntrinsicWidth() * max * tc1Var.f43805z1);
                        int ceil2 = (int) Math.ceil(this.G.getIntrinsicHeight() * max * tc1Var.f43805z1);
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
        if (tc1Var.f43742b2) {
            if (!tc1Var.f43743c.isFinished() && tc1Var.f43743c.computeScrollOffset()) {
                if (tc1Var.f43743c.getStartX() < tc1Var.X1 && tc1Var.f43743c.getStartX() > 0) {
                    tc1Var.Y1 = tc1Var.f43743c.getCurrX();
                }
                tc1Var.W0();
                invalidate();
            }
            canvas.save();
            float f10 = -tc1Var.Y1;
            this.I = f10;
            canvas.translate(f10, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (tc1Var.N1) {
            float f11 = tc1Var.f43778o1;
            if (f11 > 0.0f) {
                canvas.drawColor(i0.a.o(-16777216, (int) (f11 * 255.0f * tc1Var.f43780p1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        tc1 tc1Var = this.K;
        org.telegram.ui.Components.x91 x91Var = tc1Var.f43797w1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        x91Var.getClass();
        float a2 = org.telegram.ui.Components.x91.a(measuredWidth, measuredHeight);
        tc1Var.f43805z1 = a2;
        if (tc1Var.F1) {
            setScaleX(a2);
            setScaleY(tc1Var.f43805z1);
        }
        if (tc1Var.f43739b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (tc1Var.f43746c2 != measuredWidth2) {
            tc1Var.f43742b2 = false;
            Bitmap bitmap = tc1Var.D1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / tc1Var.D1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    tc1Var.f43742b2 = true;
                    tc1Var.a2 = (int) ((tc1Var.D1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    tc1Var.Y1 = measuredWidth3;
                    tc1Var.Z1 = measuredWidth3;
                    tc1Var.X1 = measuredWidth3 * 2.0f;
                    s(measuredHeight2, getMeasuredHeight());
                    this.v = true;
                    tc1Var.W0();
                }
            }
            if (!tc1Var.f43742b2) {
                s(-1, -1);
                this.v = false;
            }
        }
        tc1Var.f43746c2 = measuredWidth2;
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
