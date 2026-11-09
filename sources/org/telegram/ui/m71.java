package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
public final class m71 extends org.telegram.ui.Components.l9 {
    public Drawable G;
    public final boolean H;
    public float I;
    public float J;
    public final w71 K;

    public m71(w71 w71Var, Activity activity) {
        super(activity);
        this.K = w71Var;
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
        w71 w71Var = this.K;
        if (z9) {
            Drawable drawable = this.G;
            if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.ra0)) {
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
                        int ceil = (int) Math.ceil(this.G.getIntrinsicWidth() * max * w71Var.f50971z1);
                        int ceil2 = (int) Math.ceil(this.G.getIntrinsicHeight() * max * w71Var.f50971z1);
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
        if (w71Var.f50909b2) {
            if (!w71Var.f50910c.isFinished() && w71Var.f50910c.computeScrollOffset()) {
                if (w71Var.f50910c.getStartX() < w71Var.X1 && w71Var.f50910c.getStartX() > 0) {
                    w71Var.Y1 = w71Var.f50910c.getCurrX();
                }
                w71Var.a1();
                invalidate();
            }
            canvas.save();
            float f11 = -w71Var.Y1;
            this.I = f11;
            canvas.translate(f11, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (w71Var.N1) {
            float f12 = w71Var.f50944o1;
            if (f12 > 0.0f) {
                canvas.drawColor(i0.a.o(-16777216, (int) (f12 * 255.0f * w71Var.f50946p1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        w71 w71Var = this.K;
        org.telegram.ui.Components.z61 z61Var = w71Var.f50963w1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        z61Var.getClass();
        float a10 = org.telegram.ui.Components.z61.a(measuredWidth, measuredHeight);
        w71Var.f50971z1 = a10;
        if (w71Var.F1) {
            setScaleX(a10);
            setScaleY(w71Var.f50971z1);
        }
        if (w71Var.f50906b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (w71Var.f50913c2 != measuredWidth2) {
            w71Var.f50909b2 = false;
            Bitmap bitmap = w71Var.D1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / w71Var.D1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    w71Var.f50909b2 = true;
                    w71Var.f50905a2 = (int) ((w71Var.D1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    w71Var.Y1 = measuredWidth3;
                    w71Var.Z1 = measuredWidth3;
                    w71Var.X1 = measuredWidth3 * 2.0f;
                    u(measuredHeight2, getMeasuredHeight());
                    this.f35655w = true;
                    w71Var.a1();
                }
            }
            if (!w71Var.f50909b2) {
                u(-1, -1);
                this.f35655w = false;
            }
        }
        w71Var.f50913c2 = measuredWidth2;
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
