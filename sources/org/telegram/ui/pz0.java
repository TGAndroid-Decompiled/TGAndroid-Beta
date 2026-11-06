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
    public boolean f48978kd;
    public final RectF f48979ld;
    public final RectF f48980md;
    public RadialGradient f48981nd;
    public Paint f48982od;
    public Matrix f48983pd;
    public final Path f48984qd;
    public Paint f48985rd;
    public final Paint f48986sd;
    public org.telegram.ui.Components.c01 f48987td;
    public final org.telegram.ui.Components.w5 f48988ud;
    public final int f48989vd;
    public final int f48990wd;
    public final rz0 f48991xd;

    public pz0(rz0 rz0Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11) {
        super(context, i7, false, null, f6Var);
        this.f48991xd = rz0Var;
        this.f48989vd = i10;
        this.f48990wd = i11;
        this.f48978kd = false;
        this.f48979ld = new RectF();
        this.f48980md = new RectF();
        this.f48984qd = new Path();
        this.f48986sd = new Paint(1);
        this.f48988ud = new org.telegram.ui.Components.w5(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override
    public final void N0(Canvas canvas) {
        Paint paint = this.f48982od;
        rz0 rz0Var = this.f48991xd;
        if (paint != null) {
            float f10 = rz0Var.f49603s;
            RectF rectF = rz0Var.R;
            if (f10 > 0.0f) {
                if (rz0Var.Q) {
                    if (this.Fc) {
                        Bitmap bitmap = rz0Var.P.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.f48984qd;
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
                        if (this.f48985rd == null) {
                            Paint paint2 = new Paint(1);
                            this.f48985rd = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.f48985rd);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.f48988ud.d(rz0Var.Q), 1.0f - rz0Var.f49603s));
                    getPhotoImage().h(canvas, null);
                } else {
                    getPhotoImage().h(canvas, null);
                }
            }
            this.f48983pd.reset();
            float width2 = (rectF.width() / 76.8f) * rz0Var.f49604w;
            this.f48983pd.postScale(width2, width2);
            this.f48983pd.postTranslate(rectF.centerX(), rectF.centerY());
            this.f48981nd.setLocalMatrix(this.f48983pd);
            canvas.saveLayerAlpha(rectF, 255, 31);
            super.N0(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.f48982od);
            canvas.restore();
            canvas.restore();
        } else {
            super.N0(canvas);
        }
        canvas.saveLayerAlpha(rz0Var.R, (int) (rz0Var.f49604w * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.f48986sd;
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(rz0Var.R);
        rectF2.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - rz0Var.f49592a0) * (-360.0f), false, paint3);
        if (this.f48987td == null) {
            org.telegram.ui.Components.c01 c01Var = new org.telegram.ui.Components.c01(120);
            this.f48987td = c01Var;
            c01Var.f32366b = true;
        }
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.8f));
        this.f48987td.a((1.0f - rz0Var.f49592a0) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override
    public final void O0(Canvas canvas) {
        float f10 = this.f48991xd.f49604w;
        Typeface typeface = org.telegram.messenger.g0.f22516a;
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
        rz0 rz0Var = this.f48991xd;
        canvas.translate(org.telegram.messenger.g0.W1(rz0Var.f49603s, 0, -p0Var.f6361b), org.telegram.messenger.g0.W1(rz0Var.f49603s, rz0Var.O.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), p0Var.f6371n));
        super.o1(canvas, (1.0f - rz0Var.f49603s) * f10, num);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        rz0 rz0Var = this.f48991xd;
        boolean z9 = rz0Var.S;
        RectF rectF = rz0Var.R;
        if (z9) {
            boolean z10 = this.f48978kd;
            RectF rectF2 = this.f48980md;
            RectF rectF3 = this.f48979ld;
            if (!z10) {
                rectF3.set(getPhotoImage().K0, getPhotoImage().L0, getPhotoImage().y(), getPhotoImage().A());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.f48978kd = true;
                this.f48981nd = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.f48982od = paint;
                paint.setShader(this.f48981nd);
                this.f48982od.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.f48983pd = new Matrix();
            }
            org.telegram.messenger.g0.Z1(rectF3, rectF2, rz0Var.f49603s, rectF);
            t3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().J0((int) rectF.width());
            if (rz0Var.f49603s > 0.0f && rz0Var.Q) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            } else {
                canvas2 = canvas;
            }
            this.Rc = 1.0f - rz0Var.f49603s;
        } else {
            canvas2 = canvas;
        }
        d1(canvas2);
        if (rz0Var.S && rz0Var.f49603s > 0.0f && rz0Var.Q) {
            canvas2.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.f48989vd, this.f48990wd);
    }

    @Override
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        TextureView textureView = this.f48991xd.P;
        if (textureView != null && i7 == 8) {
            textureView.setVisibility(i7);
        }
    }

    @Override
    public final void x1(float f10, Canvas canvas, boolean z9) {
        canvas.save();
        rz0 rz0Var = this.f48991xd;
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
            canvas.translate(((this.f48980md.right - (org.telegram.messenger.g0.L(8 + i10) + i7)) - this.B9) * rz0Var.f49603s, 0.0f);
        }
        super.x1(f10, canvas, z9);
        canvas.restore();
    }

    @Override
    public final void setPressed(boolean z9) {
    }
}
