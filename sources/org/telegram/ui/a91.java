package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
public final class a91 extends org.telegram.ui.Components.g9 {
    public Drawable G;
    public final boolean H;
    public float I;
    public float J;
    public final k91 K;

    public a91(k91 k91Var, Activity activity) {
        super(activity);
        this.K = k91Var;
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
        k91 k91Var = this.K;
        if (z10) {
            Drawable drawable = this.G;
            if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.jb0)) {
                if (drawable instanceof BitmapDrawable) {
                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                        canvas.save();
                        float f7 = 2.0f / org.telegram.messenger.i0.f16171p;
                        canvas.scale(f7, f7);
                        this.G.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f7), (int) Math.ceil(getMeasuredHeight() / f7));
                        this.G.draw(canvas);
                        canvas.restore();
                    } else {
                        int measuredHeight = getMeasuredHeight();
                        float max = Math.max(getMeasuredWidth() / this.G.getIntrinsicWidth(), measuredHeight / this.G.getIntrinsicHeight());
                        int ceil = (int) Math.ceil(this.G.getIntrinsicWidth() * max * k91Var.f38781z1);
                        int ceil2 = (int) Math.ceil(this.G.getIntrinsicHeight() * max * k91Var.f38781z1);
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
        if (k91Var.f38718b2) {
            if (!k91Var.f38719c.isFinished() && k91Var.f38719c.computeScrollOffset()) {
                if (k91Var.f38719c.getStartX() < k91Var.X1 && k91Var.f38719c.getStartX() > 0) {
                    k91Var.Y1 = k91Var.f38719c.getCurrX();
                }
                k91Var.a1();
                invalidate();
            }
            canvas.save();
            float f10 = -k91Var.Y1;
            this.I = f10;
            canvas.translate(f10, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (k91Var.N1) {
            float f11 = k91Var.f38754o1;
            if (f11 > 0.0f) {
                canvas.drawColor(i0.b.o(-16777216, (int) (f11 * 255.0f * k91Var.f38756p1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k91 k91Var = this.K;
        org.telegram.ui.Components.a81 a81Var = k91Var.f38773w1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        a81Var.getClass();
        float a2 = org.telegram.ui.Components.a81.a(measuredWidth, measuredHeight);
        k91Var.f38781z1 = a2;
        if (k91Var.F1) {
            setScaleX(a2);
            setScaleY(k91Var.f38781z1);
        }
        if (k91Var.f38715b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (k91Var.f38722c2 != measuredWidth2) {
            k91Var.f38718b2 = false;
            Bitmap bitmap = k91Var.D1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / k91Var.D1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    k91Var.f38718b2 = true;
                    k91Var.a2 = (int) ((k91Var.D1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    k91Var.Y1 = measuredWidth3;
                    k91Var.Z1 = measuredWidth3;
                    k91Var.X1 = measuredWidth3 * 2.0f;
                    u(measuredHeight2, getMeasuredHeight());
                    this.f26364w = true;
                    k91Var.a1();
                }
            }
            if (!k91Var.f38718b2) {
                u(-1, -1);
                this.f26364w = false;
            }
        }
        k91Var.f38722c2 = measuredWidth2;
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
