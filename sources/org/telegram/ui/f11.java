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
public final class f11 extends org.telegram.ui.Cells.q1 {
    public boolean f36958hd;
    public final RectF f36959id;
    public final RectF f36960jd;
    public RadialGradient f36961kd;
    public Paint f36962ld;
    public Matrix f36963md;
    public final Path f36964nd;
    public Paint f36965od;
    public final Paint f36966pd;
    public org.telegram.ui.Components.i11 f36967qd;
    public final org.telegram.ui.Components.t5 f36968rd;
    public final int f36969sd;
    public final int f36970td;
    public final h11 f36971ud;

    public f11(h11 h11Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, int i12) {
        super(context, i10, false, null, p6Var);
        this.f36971ud = h11Var;
        this.f36969sd = i11;
        this.f36970td = i12;
        this.f36958hd = false;
        this.f36959id = new RectF();
        this.f36960jd = new RectF();
        this.f36964nd = new Path();
        this.f36966pd = new Paint(1);
        this.f36968rd = new org.telegram.ui.Components.t5(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override
    public final void L0(Canvas canvas) {
        Paint paint = this.f36962ld;
        h11 h11Var = this.f36971ud;
        if (paint != null) {
            float f7 = h11Var.f37626s;
            RectF rectF = h11Var.R;
            if (f7 > 0.0f) {
                if (h11Var.Q) {
                    if (this.Ec) {
                        Bitmap bitmap = h11Var.P.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.f36964nd;
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
                        if (this.f36965od == null) {
                            Paint paint2 = new Paint(1);
                            this.f36965od = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.f36965od);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.f36968rd.d(h11Var.Q), 1.0f - h11Var.f37626s));
                    getPhotoImage().h(canvas, null);
                } else {
                    getPhotoImage().h(canvas, null);
                }
            }
            this.f36963md.reset();
            float width2 = (rectF.width() / 76.8f) * h11Var.f37627w;
            this.f36963md.postScale(width2, width2);
            this.f36963md.postTranslate(rectF.centerX(), rectF.centerY());
            this.f36961kd.setLocalMatrix(this.f36963md);
            canvas.saveLayerAlpha(rectF, 255, 31);
            super.L0(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.f36962ld);
            canvas.restore();
            canvas.restore();
        } else {
            super.L0(canvas);
        }
        canvas.saveLayerAlpha(h11Var.R, (int) (h11Var.f37627w * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.f36966pd;
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(h11Var.R);
        rectF2.inset(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - h11Var.f37616a0) * (-360.0f), false, paint3);
        if (this.f36967qd == null) {
            org.telegram.ui.Components.i11 i11Var = new org.telegram.ui.Components.i11(120);
            this.f36967qd = i11Var;
            i11Var.f26982b = true;
        }
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(2.8f));
        this.f36967qd.a((1.0f - h11Var.f37616a0) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override
    public final void M0(Canvas canvas) {
        float f7 = this.f36971ud.f37627w;
        Typeface typeface = org.telegram.messenger.i0.f16145a;
        super.M0(canvas);
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
    public final void m1(Canvas canvas, float f7, Integer num) {
        canvas.save();
        sg.p0 p0Var = this.N;
        h11 h11Var = this.f36971ud;
        canvas.translate(org.telegram.messenger.i0.W1(h11Var.f37626s, 0, -p0Var.f48450b), org.telegram.messenger.i0.W1(h11Var.f37626s, h11Var.O.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), p0Var.f48459n));
        super.m1(canvas, (1.0f - h11Var.f37626s) * f7, num);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        h11 h11Var = this.f36971ud;
        boolean z10 = h11Var.S;
        RectF rectF = h11Var.R;
        if (z10) {
            boolean z11 = this.f36958hd;
            RectF rectF2 = this.f36960jd;
            RectF rectF3 = this.f36959id;
            if (!z11) {
                rectF3.set(getPhotoImage().K0, getPhotoImage().L0, getPhotoImage().y(), getPhotoImage().A());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.f36958hd = true;
                this.f36961kd = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.f36962ld = paint;
                paint.setShader(this.f36961kd);
                this.f36962ld.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.f36963md = new Matrix();
            }
            org.telegram.messenger.i0.Z1(rectF3, rectF2, h11Var.f37626s, rectF);
            q3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().J0((int) rectF.width());
            if (h11Var.f37626s > 0.0f && h11Var.Q) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            } else {
                canvas2 = canvas;
            }
            this.Qc = 1.0f - h11Var.f37626s;
        } else {
            canvas2 = canvas;
        }
        b1(canvas2);
        if (h11Var.S && h11Var.f37626s > 0.0f && h11Var.Q) {
            canvas2.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.f36969sd, this.f36970td);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        TextureView textureView = this.f36971ud.P;
        if (textureView != null && i10 == 8) {
            textureView.setVisibility(i10);
        }
    }

    @Override
    public final void v1(float f7, Canvas canvas, boolean z10) {
        canvas.save();
        h11 h11Var = this.f36971ud;
        if (h11Var.S) {
            int i10 = this.f22797y9;
            org.telegram.messenger.kj kjVar = h11Var.M;
            int i11 = 0;
            if (kjVar != null && kjVar.P3()) {
                org.telegram.messenger.kj kjVar2 = h11Var.M;
                if (kjVar2 != null && kjVar2.D == 19) {
                    i11 = 4;
                }
                i11 += 20;
            }
            canvas.translate(((this.f36960jd.right - (org.telegram.messenger.i0.L(8 + i11) + i10)) - this.A9) * h11Var.f37626s, 0.0f);
        }
        super.v1(f7, canvas, z10);
        canvas.restore();
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
