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
public final class g11 extends org.telegram.ui.Cells.q1 {
    public boolean f37386hd;
    public final RectF f37387id;
    public final RectF f37388jd;
    public RadialGradient f37389kd;
    public Paint f37390ld;
    public Matrix f37391md;
    public final Path f37392nd;
    public Paint f37393od;
    public final Paint f37394pd;
    public org.telegram.ui.Components.h11 f37395qd;
    public final org.telegram.ui.Components.t5 f37396rd;
    public final int f37397sd;
    public final int f37398td;
    public final i11 f37399ud;

    public g11(i11 i11Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, int i12) {
        super(context, i10, false, null, p6Var);
        this.f37399ud = i11Var;
        this.f37397sd = i11;
        this.f37398td = i12;
        this.f37386hd = false;
        this.f37387id = new RectF();
        this.f37388jd = new RectF();
        this.f37392nd = new Path();
        this.f37394pd = new Paint(1);
        this.f37396rd = new org.telegram.ui.Components.t5(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override
    public final void L0(Canvas canvas) {
        Paint paint = this.f37390ld;
        i11 i11Var = this.f37399ud;
        if (paint != null) {
            float f7 = i11Var.f38093s;
            RectF rectF = i11Var.R;
            if (f7 > 0.0f) {
                if (i11Var.Q) {
                    if (this.Ec) {
                        Bitmap bitmap = i11Var.P.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.f37392nd;
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
                        if (this.f37393od == null) {
                            Paint paint2 = new Paint(1);
                            this.f37393od = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.f37393od);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.f37396rd.d(i11Var.Q), 1.0f - i11Var.f38093s));
                    getPhotoImage().h(canvas, null);
                } else {
                    getPhotoImage().h(canvas, null);
                }
            }
            this.f37391md.reset();
            float width2 = (rectF.width() / 76.8f) * i11Var.f38094w;
            this.f37391md.postScale(width2, width2);
            this.f37391md.postTranslate(rectF.centerX(), rectF.centerY());
            this.f37389kd.setLocalMatrix(this.f37391md);
            canvas.saveLayerAlpha(rectF, 255, 31);
            super.L0(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.f37390ld);
            canvas.restore();
            canvas.restore();
        } else {
            super.L0(canvas);
        }
        canvas.saveLayerAlpha(i11Var.R, (int) (i11Var.f38094w * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.f37394pd;
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(i11Var.R);
        rectF2.inset(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - i11Var.f38083a0) * (-360.0f), false, paint3);
        if (this.f37395qd == null) {
            org.telegram.ui.Components.h11 h11Var = new org.telegram.ui.Components.h11(120);
            this.f37395qd = h11Var;
            h11Var.f26594b = true;
        }
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(2.8f));
        this.f37395qd.a((1.0f - i11Var.f38083a0) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override
    public final void M0(Canvas canvas) {
        float f7 = this.f37399ud.f38094w;
        Typeface typeface = org.telegram.messenger.i0.f15999a;
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
        i11 i11Var = this.f37399ud;
        canvas.translate(org.telegram.messenger.i0.W1(i11Var.f38093s, 0, -p0Var.f48439b), org.telegram.messenger.i0.W1(i11Var.f38093s, i11Var.O.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), p0Var.f48448n));
        super.m1(canvas, (1.0f - i11Var.f38093s) * f7, num);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        i11 i11Var = this.f37399ud;
        boolean z10 = i11Var.S;
        RectF rectF = i11Var.R;
        if (z10) {
            boolean z11 = this.f37386hd;
            RectF rectF2 = this.f37388jd;
            RectF rectF3 = this.f37387id;
            if (!z11) {
                rectF3.set(getPhotoImage().K0, getPhotoImage().L0, getPhotoImage().y(), getPhotoImage().A());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.f37386hd = true;
                this.f37389kd = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.f37390ld = paint;
                paint.setShader(this.f37389kd);
                this.f37390ld.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.f37391md = new Matrix();
            }
            org.telegram.messenger.i0.Z1(rectF3, rectF2, i11Var.f38093s, rectF);
            q3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().J0((int) rectF.width());
            if (i11Var.f38093s > 0.0f && i11Var.Q) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            } else {
                canvas2 = canvas;
            }
            this.Qc = 1.0f - i11Var.f38093s;
        } else {
            canvas2 = canvas;
        }
        b1(canvas2);
        if (i11Var.S && i11Var.f38093s > 0.0f && i11Var.Q) {
            canvas2.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.f37397sd, this.f37398td);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        TextureView textureView = this.f37399ud.P;
        if (textureView != null && i10 == 8) {
            textureView.setVisibility(i10);
        }
    }

    @Override
    public final void v1(float f7, Canvas canvas, boolean z10) {
        canvas.save();
        i11 i11Var = this.f37399ud;
        if (i11Var.S) {
            int i10 = this.f22796y9;
            org.telegram.messenger.jj jjVar = i11Var.M;
            int i11 = 0;
            if (jjVar != null && jjVar.P3()) {
                org.telegram.messenger.jj jjVar2 = i11Var.M;
                if (jjVar2 != null && jjVar2.D == 19) {
                    i11 = 4;
                }
                i11 += 20;
            }
            canvas.translate(((this.f37388jd.right - (org.telegram.messenger.i0.L(8 + i11) + i10)) - this.A9) * i11Var.f38093s, 0.0f);
        }
        super.v1(f7, canvas, z10);
        canvas.restore();
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
