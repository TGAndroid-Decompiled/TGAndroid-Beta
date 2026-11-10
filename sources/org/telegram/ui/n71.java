package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
public final class n71 extends org.telegram.ui.Components.k9 {
    public Drawable G;
    public final boolean H;
    public float I;
    public float J;
    public final x71 K;

    public n71(x71 x71Var, Activity activity) {
        super(activity);
        this.K = x71Var;
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
        boolean z9 = this.H;
        x71 x71Var = this.K;
        if (z9) {
            Drawable drawable = this.G;
            if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.qa0)) {
                if (drawable instanceof BitmapDrawable) {
                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                        canvas.save();
                        float f10 = 2.0f / org.telegram.messenger.g0.f22566p;
                        canvas.scale(f10, f10);
                        this.G.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                        this.G.draw(canvas);
                        canvas.restore();
                    } else {
                        int measuredHeight = getMeasuredHeight();
                        float max = Math.max(getMeasuredWidth() / this.G.getIntrinsicWidth(), measuredHeight / this.G.getIntrinsicHeight());
                        int ceil = (int) Math.ceil(this.G.getIntrinsicWidth() * max * x71Var.f51630z1);
                        int ceil2 = (int) Math.ceil(this.G.getIntrinsicHeight() * max * x71Var.f51630z1);
                        int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                        int i7 = (measuredHeight - ceil2) / 2;
                        this.J = i7;
                        this.G.setBounds(measuredWidth, i7, ceil + measuredWidth, ceil2 + i7);
                        this.G.draw(canvas);
                    }
                }
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.G.draw(canvas);
            }
        }
        if (x71Var.f51568b2) {
            if (!x71Var.f51569c.isFinished() && x71Var.f51569c.computeScrollOffset()) {
                if (x71Var.f51569c.getStartX() < x71Var.X1 && x71Var.f51569c.getStartX() > 0) {
                    x71Var.Y1 = x71Var.f51569c.getCurrX();
                }
                x71Var.a1();
                invalidate();
            }
            canvas.save();
            float f11 = -x71Var.Y1;
            this.I = f11;
            canvas.translate(f11, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (x71Var.N1) {
            float f12 = x71Var.f51603o1;
            if (f12 > 0.0f) {
                canvas.drawColor(i0.a.o(-16777216, (int) (f12 * 255.0f * x71Var.f51605p1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        x71 x71Var = this.K;
        org.telegram.ui.Components.y61 y61Var = x71Var.f51622w1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        y61Var.getClass();
        float a10 = org.telegram.ui.Components.y61.a(measuredWidth, measuredHeight);
        x71Var.f51630z1 = a10;
        if (x71Var.F1) {
            setScaleX(a10);
            setScaleY(x71Var.f51630z1);
        }
        if (x71Var.f51565b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (x71Var.f51572c2 != measuredWidth2) {
            x71Var.f51568b2 = false;
            Bitmap bitmap = x71Var.D1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / x71Var.D1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    x71Var.f51568b2 = true;
                    x71Var.f51564a2 = (int) ((x71Var.D1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    x71Var.Y1 = measuredWidth3;
                    x71Var.Z1 = measuredWidth3;
                    x71Var.X1 = measuredWidth3 * 2.0f;
                    u(measuredHeight2, getMeasuredHeight());
                    this.f35257w = true;
                    x71Var.a1();
                }
            }
            if (!x71Var.f51568b2) {
                u(-1, -1);
                this.f35257w = false;
            }
        }
        x71Var.f51572c2 = measuredWidth2;
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
