package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.TextureView;
import android.view.animation.LinearInterpolator;
public final class gz0 extends org.telegram.ui.Cells.q1 {
    public boolean f45748kd;
    public final RectF f45749ld;
    public final RectF f45750md;
    public RadialGradient f45751nd;
    public Paint f45752od;
    public Matrix f45753pd;
    public final Path f45754qd;
    public Paint f45755rd;
    public final Paint f45756sd;
    public org.telegram.ui.Components.b01 f45757td;
    public final org.telegram.ui.Components.u5 f45758ud;
    public final int f45759vd;
    public final int f45760wd;
    public final iz0 f45761xd;

    public gz0(iz0 iz0Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11) {
        super(context, i3, false, null, e6Var);
        this.f45761xd = iz0Var;
        this.f45759vd = i10;
        this.f45760wd = i11;
        this.f45748kd = false;
        this.f45749ld = new RectF();
        this.f45750md = new RectF();
        this.f45754qd = new Path();
        this.f45756sd = new Paint(1);
        this.f45758ud = new org.telegram.ui.Components.u5(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override
    public final void N0(Canvas canvas) {
        Paint paint = this.f45752od;
        iz0 iz0Var = this.f45761xd;
        if (paint != null) {
            float f10 = iz0Var.f46469s;
            RectF rectF = iz0Var.S;
            if (f10 > 0.0f) {
                if (iz0Var.R) {
                    if (this.Fc) {
                        Bitmap bitmap = iz0Var.Q.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.f45754qd;
                            path.rewind();
                            path.addCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, Path.Direction.CW);
                            canvas.clipPath(path);
                            canvas.scale(rectF.width() / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                            canvas.translate(rectF.left, rectF.top);
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                            bitmap.recycle();
                        }
                    } else {
                        float centerX = rectF.centerX();
                        float centerY = rectF.centerY();
                        float width = rectF.width() / 2.0f;
                        if (this.f45755rd == null) {
                            Paint paint2 = new Paint(1);
                            this.f45755rd = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.f45755rd);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.f45758ud.d(iz0Var.R), 1.0f - iz0Var.f46469s));
                    getPhotoImage().h(canvas, null);
                } else {
                    getPhotoImage().h(canvas, null);
                }
            }
            this.f45753pd.reset();
            float width2 = (rectF.width() / 76.8f) * iz0Var.f46470w;
            this.f45753pd.postScale(width2, width2);
            this.f45753pd.postTranslate(rectF.centerX(), rectF.centerY());
            this.f45751nd.setLocalMatrix(this.f45753pd);
            canvas.saveLayerAlpha(rectF, 255, 31);
            super.N0(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.f45752od);
            canvas.restore();
            canvas.restore();
        } else {
            super.N0(canvas);
        }
        canvas.saveLayerAlpha(iz0Var.S, (int) (iz0Var.f46470w * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.f45756sd;
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(iz0Var.S);
        rectF2.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - iz0Var.f46459b0) * (-360.0f), false, paint3);
        if (this.f45757td == null) {
            org.telegram.ui.Components.b01 b01Var = new org.telegram.ui.Components.b01(120);
            this.f45757td = b01Var;
            b01Var.f32028b = true;
        }
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.8f));
        this.f45757td.a((1.0f - iz0Var.f46459b0) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override
    public final void O0(Canvas canvas) {
        float f10 = this.f45761xd.f46470w;
        Typeface typeface = org.telegram.messenger.g0.f22580a;
        super.O0(canvas);
    }

    @Override
    public final int getBoundsLeft() {
        return 0;
    }

    @Override
    public final int getBoundsRight() {
        return getWidth();
    }

    @Override
    public final void o1(Canvas canvas, float f10, Integer num) {
        canvas.save();
        dh.o0 o0Var = this.O;
        iz0 iz0Var = this.f45761xd;
        canvas.translate(org.telegram.messenger.g0.W1(iz0Var.f46469s, 0, -o0Var.f9113b), org.telegram.messenger.g0.W1(iz0Var.f46469s, iz0Var.P.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), o0Var.f9123n));
        super.o1(canvas, (1.0f - iz0Var.f46469s) * f10, num);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        iz0 iz0Var = this.f45761xd;
        boolean z10 = iz0Var.T;
        RectF rectF = iz0Var.S;
        if (z10) {
            boolean z11 = this.f45748kd;
            RectF rectF2 = this.f45750md;
            RectF rectF3 = this.f45749ld;
            if (!z11) {
                rectF3.set(getPhotoImage().L0, getPhotoImage().M0, getPhotoImage().y(), getPhotoImage().A());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.f45748kd = true;
                this.f45751nd = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.f45752od = paint;
                paint.setShader(this.f45751nd);
                this.f45752od.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.f45753pd = new Matrix();
            }
            org.telegram.messenger.g0.Z1(rectF3, rectF2, iz0Var.f46469s, rectF);
            s3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().J0((int) rectF.width());
            if (iz0Var.f46469s > 0.0f && iz0Var.R) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            } else {
                canvas2 = canvas;
            }
            this.Rc = 1.0f - iz0Var.f46469s;
        } else {
            canvas2 = canvas;
        }
        d1(canvas2);
        if (iz0Var.T && iz0Var.f46469s > 0.0f && iz0Var.R) {
            canvas2.restore();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(this.f45759vd, this.f45760wd);
    }

    @Override
    public final void setVisibility(int i3) {
        super.setVisibility(i3);
        TextureView textureView = this.f45761xd.Q;
        if (textureView != null && i3 == 8) {
            textureView.setVisibility(i3);
        }
    }

    @Override
    public final void x1(float f10, Canvas canvas, boolean z10) {
        canvas.save();
        iz0 iz0Var = this.f45761xd;
        if (iz0Var.T) {
            int i3 = this.f30167z9;
            org.telegram.messenger.zi ziVar = iz0Var.N;
            int i10 = 0;
            if (ziVar != null && ziVar.Q3()) {
                org.telegram.messenger.zi ziVar2 = iz0Var.N;
                if (ziVar2 != null && ziVar2.D == 19) {
                    i10 = 4;
                }
                i10 += 20;
            }
            canvas.translate(((this.f45750md.right - (org.telegram.messenger.g0.L(8 + i10) + i3)) - this.B9) * iz0Var.f46469s, 0.0f);
        }
        super.x1(f10, canvas, z10);
        canvas.restore();
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
