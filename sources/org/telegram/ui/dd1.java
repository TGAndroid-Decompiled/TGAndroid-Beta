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
public final class dd1 extends org.telegram.ui.Components.w9 {
    public Drawable G;
    public final boolean H;
    public float I;
    public float J;
    public final od1 K;

    public dd1(od1 od1Var, Activity activity) {
        super(activity);
        this.K = od1Var;
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
        od1 od1Var = this.K;
        if (z10) {
            Drawable drawable = this.G;
            if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.mc0)) {
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
                        int ceil = (int) Math.ceil(this.G.getIntrinsicWidth() * max * od1Var.f36219y1);
                        int ceil2 = (int) Math.ceil(this.G.getIntrinsicHeight() * max * od1Var.f36219y1);
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
        if (od1Var.a2) {
            if (!od1Var.f36160c.isFinished() && od1Var.f36160c.computeScrollOffset()) {
                if (od1Var.f36160c.getStartX() < od1Var.W1 && od1Var.f36160c.getStartX() > 0) {
                    od1Var.X1 = od1Var.f36160c.getCurrX();
                }
                od1Var.V0();
                invalidate();
            }
            canvas.save();
            float f10 = -od1Var.X1;
            this.I = f10;
            canvas.translate(f10, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (od1Var.M1) {
            float f11 = od1Var.f36192n1;
            if (f11 > 0.0f) {
                canvas.drawColor(i0.a.k(-16777216, (int) (f11 * 255.0f * od1Var.f36194o1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        od1 od1Var = this.K;
        org.telegram.ui.Components.z81 z81Var = od1Var.f36210v1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        z81Var.getClass();
        float a2 = org.telegram.ui.Components.z81.a(measuredWidth, measuredHeight);
        od1Var.f36219y1 = a2;
        if (od1Var.E1) {
            setScaleX(a2);
            setScaleY(od1Var.f36219y1);
        }
        if (od1Var.f36156b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (od1Var.f36159b2 != measuredWidth2) {
            od1Var.a2 = false;
            Bitmap bitmap = od1Var.C1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / od1Var.C1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    od1Var.a2 = true;
                    od1Var.Z1 = (int) ((od1Var.C1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    od1Var.X1 = measuredWidth3;
                    od1Var.Y1 = measuredWidth3;
                    od1Var.W1 = measuredWidth3 * 2.0f;
                    s(measuredHeight2, getMeasuredHeight());
                    this.v = true;
                    od1Var.V0();
                }
            }
            if (!od1Var.a2) {
                s(-1, -1);
                this.v = false;
            }
        }
        od1Var.f36159b2 = measuredWidth2;
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
