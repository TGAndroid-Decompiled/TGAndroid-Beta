package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
public final class l71 extends org.telegram.ui.Components.l9 {
    public Drawable G;
    public final boolean H;
    public float I;
    public float J;
    public final v71 K;

    public l71(v71 v71Var, Activity activity) {
        super(activity);
        this.K = v71Var;
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
        v71 v71Var = this.K;
        if (z9) {
            Drawable drawable = this.G;
            if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.qa0)) {
                if (drawable instanceof BitmapDrawable) {
                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                        canvas.save();
                        float f10 = 2.0f / org.telegram.messenger.g0.f22562p;
                        canvas.scale(f10, f10);
                        this.G.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                        this.G.draw(canvas);
                        canvas.restore();
                    } else {
                        int measuredHeight = getMeasuredHeight();
                        float max = Math.max(getMeasuredWidth() / this.G.getIntrinsicWidth(), measuredHeight / this.G.getIntrinsicHeight());
                        int ceil = (int) Math.ceil(this.G.getIntrinsicWidth() * max * v71Var.f50589z1);
                        int ceil2 = (int) Math.ceil(this.G.getIntrinsicHeight() * max * v71Var.f50589z1);
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
        if (v71Var.f50527b2) {
            if (!v71Var.f50528c.isFinished() && v71Var.f50528c.computeScrollOffset()) {
                if (v71Var.f50528c.getStartX() < v71Var.X1 && v71Var.f50528c.getStartX() > 0) {
                    v71Var.Y1 = v71Var.f50528c.getCurrX();
                }
                v71Var.a1();
                invalidate();
            }
            canvas.save();
            float f11 = -v71Var.Y1;
            this.I = f11;
            canvas.translate(f11, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (v71Var.N1) {
            float f12 = v71Var.f50562o1;
            if (f12 > 0.0f) {
                canvas.drawColor(i0.a.o(-16777216, (int) (f12 * 255.0f * v71Var.f50564p1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        v71 v71Var = this.K;
        org.telegram.ui.Components.y61 y61Var = v71Var.f50581w1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        y61Var.getClass();
        float a10 = org.telegram.ui.Components.y61.a(measuredWidth, measuredHeight);
        v71Var.f50589z1 = a10;
        if (v71Var.F1) {
            setScaleX(a10);
            setScaleY(v71Var.f50589z1);
        }
        if (v71Var.f50524b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (v71Var.f50531c2 != measuredWidth2) {
            v71Var.f50527b2 = false;
            Bitmap bitmap = v71Var.D1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / v71Var.D1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    v71Var.f50527b2 = true;
                    v71Var.f50523a2 = (int) ((v71Var.D1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    v71Var.Y1 = measuredWidth3;
                    v71Var.Z1 = measuredWidth3;
                    v71Var.X1 = measuredWidth3 * 2.0f;
                    u(measuredHeight2, getMeasuredHeight());
                    this.f35608w = true;
                    v71Var.a1();
                }
            }
            if (!v71Var.f50527b2) {
                u(-1, -1);
                this.f35608w = false;
            }
        }
        v71Var.f50531c2 = measuredWidth2;
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
