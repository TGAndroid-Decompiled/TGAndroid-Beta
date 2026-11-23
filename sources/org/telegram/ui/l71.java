package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
public final class l71 extends org.telegram.ui.Components.p9 {
    public Drawable H;
    public final boolean I;
    public float J;
    public float K;
    public final v71 L;

    public l71(v71 v71Var, Activity activity) {
        super(activity);
        this.L = v71Var;
        this.I = true;
    }

    @Override
    public Drawable getBackground() {
        return this.H;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.J = 0.0f;
        this.K = 0.0f;
        boolean z10 = this.I;
        v71 v71Var = this.L;
        if (z10) {
            Drawable drawable = this.H;
            if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.za0)) {
                if (drawable instanceof BitmapDrawable) {
                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                        canvas.save();
                        float f10 = 2.0f / org.telegram.messenger.g0.f24225p;
                        canvas.scale(f10, f10);
                        this.H.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                        this.H.draw(canvas);
                        canvas.restore();
                    } else {
                        int measuredHeight = getMeasuredHeight();
                        float max = Math.max(getMeasuredWidth() / this.H.getIntrinsicWidth(), measuredHeight / this.H.getIntrinsicHeight());
                        int ceil = (int) Math.ceil(this.H.getIntrinsicWidth() * max * v71Var.A1);
                        int ceil2 = (int) Math.ceil(this.H.getIntrinsicHeight() * max * v71Var.A1);
                        int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                        int i7 = (measuredHeight - ceil2) / 2;
                        this.K = i7;
                        this.H.setBounds(measuredWidth, i7, ceil + measuredWidth, ceil2 + i7);
                        this.H.draw(canvas);
                    }
                }
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.H.draw(canvas);
            }
        }
        if (v71Var.f52856c2) {
            if (!v71Var.f52853c.isFinished() && v71Var.f52853c.computeScrollOffset()) {
                if (v71Var.f52853c.getStartX() < v71Var.Y1 && v71Var.f52853c.getStartX() > 0) {
                    v71Var.Z1 = v71Var.f52853c.getCurrX();
                }
                v71Var.a1();
                invalidate();
            }
            canvas.save();
            float f11 = -v71Var.Z1;
            this.J = f11;
            canvas.translate(f11, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (v71Var.O1) {
            float f12 = v71Var.f52890p1;
            if (f12 > 0.0f) {
                canvas.drawColor(i0.a.o(-16777216, (int) (f12 * 255.0f * v71Var.f52892q1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        v71 v71Var = this.L;
        org.telegram.ui.Components.n71 n71Var = v71Var.f52910x1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        n71Var.getClass();
        float a10 = org.telegram.ui.Components.n71.a(measuredWidth, measuredHeight);
        v71Var.A1 = a10;
        if (v71Var.G1) {
            setScaleX(a10);
            setScaleY(v71Var.A1);
        }
        if (v71Var.f52849b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (v71Var.d2 != measuredWidth2) {
            v71Var.f52856c2 = false;
            Bitmap bitmap = v71Var.E1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / v71Var.E1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    v71Var.f52856c2 = true;
                    v71Var.f52852b2 = (int) ((v71Var.E1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    v71Var.Z1 = measuredWidth3;
                    v71Var.f52848a2 = measuredWidth3;
                    v71Var.Y1 = measuredWidth3 * 2.0f;
                    u(measuredHeight2, getMeasuredHeight());
                    this.f38437w = true;
                    v71Var.a1();
                }
            }
            if (!v71Var.f52856c2) {
                u(-1, -1);
                this.f38437w = false;
            }
        }
        v71Var.d2 = measuredWidth2;
    }

    @Override
    public void setBackground(Drawable drawable) {
        this.H = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.H != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
