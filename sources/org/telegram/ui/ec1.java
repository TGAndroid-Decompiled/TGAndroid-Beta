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
public final class ec1 extends org.telegram.ui.Components.u9 {
    public Drawable G;
    public final boolean H;
    public float I;
    public float J;
    public final pc1 K;

    public ec1(pc1 pc1Var, Activity activity) {
        super(activity);
        this.K = pc1Var;
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
        pc1 pc1Var = this.K;
        if (z10) {
            Drawable drawable = this.G;
            if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.wc0)) {
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
                        int ceil = (int) Math.ceil(this.G.getIntrinsicWidth() * max * pc1Var.f40511z1);
                        int ceil2 = (int) Math.ceil(this.G.getIntrinsicHeight() * max * pc1Var.f40511z1);
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
        if (pc1Var.f40448b2) {
            if (!pc1Var.f40449c.isFinished() && pc1Var.f40449c.computeScrollOffset()) {
                if (pc1Var.f40449c.getStartX() < pc1Var.X1 && pc1Var.f40449c.getStartX() > 0) {
                    pc1Var.Y1 = pc1Var.f40449c.getCurrX();
                }
                pc1Var.V0();
                invalidate();
            }
            canvas.save();
            float f10 = -pc1Var.Y1;
            this.I = f10;
            canvas.translate(f10, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (pc1Var.N1) {
            float f11 = pc1Var.f40484o1;
            if (f11 > 0.0f) {
                canvas.drawColor(i0.a.o(-16777216, (int) (f11 * 255.0f * pc1Var.f40486p1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        pc1 pc1Var = this.K;
        org.telegram.ui.Components.o91 o91Var = pc1Var.f40503w1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        o91Var.getClass();
        float a2 = org.telegram.ui.Components.o91.a(measuredWidth, measuredHeight);
        pc1Var.f40511z1 = a2;
        if (pc1Var.F1) {
            setScaleX(a2);
            setScaleY(pc1Var.f40511z1);
        }
        if (pc1Var.f40445b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (pc1Var.f40452c2 != measuredWidth2) {
            pc1Var.f40448b2 = false;
            Bitmap bitmap = pc1Var.D1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / pc1Var.D1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    pc1Var.f40448b2 = true;
                    pc1Var.a2 = (int) ((pc1Var.D1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    pc1Var.Y1 = measuredWidth3;
                    pc1Var.Z1 = measuredWidth3;
                    pc1Var.X1 = measuredWidth3 * 2.0f;
                    s(measuredHeight2, getMeasuredHeight());
                    this.v = true;
                    pc1Var.V0();
                }
            }
            if (!pc1Var.f40448b2) {
                s(-1, -1);
                this.v = false;
            }
        }
        pc1Var.f40452c2 = measuredWidth2;
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
