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
public final class pz0 extends org.telegram.ui.Cells.q1 {
    public boolean f48979kd;
    public final RectF f48980ld;
    public final RectF f48981md;
    public RadialGradient f48982nd;
    public Paint f48983od;
    public Matrix f48984pd;
    public final Path f48985qd;
    public Paint f48986rd;
    public final Paint f48987sd;
    public org.telegram.ui.Components.b01 f48988td;
    public final org.telegram.ui.Components.w5 f48989ud;
    public final int f48990vd;
    public final int f48991wd;
    public final rz0 f48992xd;

    public pz0(rz0 rz0Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11) {
        super(context, i7, false, null, f6Var);
        this.f48992xd = rz0Var;
        this.f48990vd = i10;
        this.f48991wd = i11;
        this.f48979kd = false;
        this.f48980ld = new RectF();
        this.f48981md = new RectF();
        this.f48985qd = new Path();
        this.f48987sd = new Paint(1);
        this.f48989ud = new org.telegram.ui.Components.w5(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override
    public final void N0(Canvas canvas) {
        Paint paint = this.f48983od;
        rz0 rz0Var = this.f48992xd;
        if (paint != null) {
            float f10 = rz0Var.f49604s;
            RectF rectF = rz0Var.R;
            if (f10 > 0.0f) {
                if (rz0Var.Q) {
                    if (this.Fc) {
                        Bitmap bitmap = rz0Var.P.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.f48985qd;
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
                        if (this.f48986rd == null) {
                            Paint paint2 = new Paint(1);
                            this.f48986rd = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.f48986rd);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.f48989ud.d(rz0Var.Q), 1.0f - rz0Var.f49604s));
                    getPhotoImage().h(canvas, null);
                } else {
                    getPhotoImage().h(canvas, null);
                }
            }
            this.f48984pd.reset();
            float width2 = (rectF.width() / 76.8f) * rz0Var.f49605w;
            this.f48984pd.postScale(width2, width2);
            this.f48984pd.postTranslate(rectF.centerX(), rectF.centerY());
            this.f48982nd.setLocalMatrix(this.f48984pd);
            canvas.saveLayerAlpha(rectF, 255, 31);
            super.N0(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.f48983od);
            canvas.restore();
            canvas.restore();
        } else {
            super.N0(canvas);
        }
        canvas.saveLayerAlpha(rz0Var.R, (int) (rz0Var.f49605w * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.f48987sd;
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(rz0Var.R);
        rectF2.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - rz0Var.f49593a0) * (-360.0f), false, paint3);
        if (this.f48988td == null) {
            org.telegram.ui.Components.b01 b01Var = new org.telegram.ui.Components.b01(120);
            this.f48988td = b01Var;
            b01Var.f31971b = true;
        }
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.8f));
        this.f48988td.a((1.0f - rz0Var.f49593a0) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override
    public final void O0(Canvas canvas) {
        float f10 = this.f48992xd.f49605w;
        Typeface typeface = org.telegram.messenger.g0.f22509a;
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
        ch.p0 p0Var = this.N;
        rz0 rz0Var = this.f48992xd;
        canvas.translate(org.telegram.messenger.g0.W1(rz0Var.f49604s, 0, -p0Var.f6361b), org.telegram.messenger.g0.W1(rz0Var.f49604s, rz0Var.O.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), p0Var.f6371n));
        super.o1(canvas, (1.0f - rz0Var.f49604s) * f10, num);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        rz0 rz0Var = this.f48992xd;
        boolean z9 = rz0Var.S;
        RectF rectF = rz0Var.R;
        if (z9) {
            boolean z10 = this.f48979kd;
            RectF rectF2 = this.f48981md;
            RectF rectF3 = this.f48980ld;
            if (!z10) {
                rectF3.set(getPhotoImage().K0, getPhotoImage().L0, getPhotoImage().y(), getPhotoImage().A());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.f48979kd = true;
                this.f48982nd = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.f48983od = paint;
                paint.setShader(this.f48982nd);
                this.f48983od.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.f48984pd = new Matrix();
            }
            org.telegram.messenger.g0.Z1(rectF3, rectF2, rz0Var.f49604s, rectF);
            t3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().J0((int) rectF.width());
            if (rz0Var.f49604s > 0.0f && rz0Var.Q) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            } else {
                canvas2 = canvas;
            }
            this.Rc = 1.0f - rz0Var.f49604s;
        } else {
            canvas2 = canvas;
        }
        d1(canvas2);
        if (rz0Var.S && rz0Var.f49604s > 0.0f && rz0Var.Q) {
            canvas2.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.f48990vd, this.f48991wd);
    }

    @Override
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        TextureView textureView = this.f48992xd.P;
        if (textureView != null && i7 == 8) {
            textureView.setVisibility(i7);
        }
    }

    @Override
    public final void x1(float f10, Canvas canvas, boolean z9) {
        canvas.save();
        rz0 rz0Var = this.f48992xd;
        if (rz0Var.S) {
            int i7 = this.z9;
            org.telegram.messenger.ij ijVar = rz0Var.M;
            int i10 = 0;
            if (ijVar != null && ijVar.Q3()) {
                org.telegram.messenger.ij ijVar2 = rz0Var.M;
                if (ijVar2 != null && ijVar2.D == 19) {
                    i10 = 4;
                }
                i10 += 20;
            }
            canvas.translate(((this.f48981md.right - (org.telegram.messenger.g0.L(8 + i10) + i7)) - this.B9) * rz0Var.f49604s, 0.0f);
        }
        super.x1(f10, canvas, z9);
        canvas.restore();
    }

    @Override
    public final void setPressed(boolean z9) {
    }
}
