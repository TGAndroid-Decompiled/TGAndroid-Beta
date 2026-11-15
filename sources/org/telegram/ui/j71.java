package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
public final class j71 extends org.telegram.ui.Components.i9 {
    public Drawable H;
    public final boolean I;
    public float J;
    public float K;
    public final t71 L;

    public j71(t71 t71Var, Activity activity) {
        super(activity);
        this.L = t71Var;
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
        t71 t71Var = this.L;
        if (z10) {
            Drawable drawable = this.H;
            if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.ra0)) {
                if (drawable instanceof BitmapDrawable) {
                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                        canvas.save();
                        float f10 = 2.0f / org.telegram.messenger.g0.f23608p;
                        canvas.scale(f10, f10);
                        this.H.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                        this.H.draw(canvas);
                        canvas.restore();
                    } else {
                        int measuredHeight = getMeasuredHeight();
                        float max = Math.max(getMeasuredWidth() / this.H.getIntrinsicWidth(), measuredHeight / this.H.getIntrinsicHeight());
                        int ceil = (int) Math.ceil(this.H.getIntrinsicWidth() * max * t71Var.A1);
                        int ceil2 = (int) Math.ceil(this.H.getIntrinsicHeight() * max * t71Var.A1);
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
        if (t71Var.f51419c2) {
            if (!t71Var.f51416c.isFinished() && t71Var.f51416c.computeScrollOffset()) {
                if (t71Var.f51416c.getStartX() < t71Var.Y1 && t71Var.f51416c.getStartX() > 0) {
                    t71Var.Z1 = t71Var.f51416c.getCurrX();
                }
                t71Var.a1();
                invalidate();
            }
            canvas.save();
            float f11 = -t71Var.Z1;
            this.J = f11;
            canvas.translate(f11, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (t71Var.O1) {
            float f12 = t71Var.f51453p1;
            if (f12 > 0.0f) {
                canvas.drawColor(i0.a.o(-16777216, (int) (f12 * 255.0f * t71Var.f51455q1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        t71 t71Var = this.L;
        org.telegram.ui.Components.z61 z61Var = t71Var.f51473x1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        z61Var.getClass();
        float a10 = org.telegram.ui.Components.z61.a(measuredWidth, measuredHeight);
        t71Var.A1 = a10;
        if (t71Var.G1) {
            setScaleX(a10);
            setScaleY(t71Var.A1);
        }
        if (t71Var.f51412b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (t71Var.d2 != measuredWidth2) {
            t71Var.f51419c2 = false;
            Bitmap bitmap = t71Var.E1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / t71Var.E1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    t71Var.f51419c2 = true;
                    t71Var.f51415b2 = (int) ((t71Var.E1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    t71Var.Z1 = measuredWidth3;
                    t71Var.f51411a2 = measuredWidth3;
                    t71Var.Y1 = measuredWidth3 * 2.0f;
                    u(measuredHeight2, getMeasuredHeight());
                    this.f35516w = true;
                    t71Var.a1();
                }
            }
            if (!t71Var.f51419c2) {
                u(-1, -1);
                this.f35516w = false;
            }
        }
        t71Var.d2 = measuredWidth2;
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
