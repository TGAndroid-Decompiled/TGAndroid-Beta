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
import android.view.TextureView;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class d41 extends org.telegram.ui.Cells.s1 {
    public boolean Be;
    public final RectF Ce;
    public final RectF De;
    public RadialGradient Ee;
    public Paint Fe;
    public Matrix Ge;
    public final Path He;
    public Paint Ie;
    public final Paint Je;
    public org.telegram.ui.Components.o11 Ke;
    public final org.telegram.ui.Components.d6 Le;
    public final int Me;
    public final int Ne;
    public final f41 Oe;

    public d41(f41 f41Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12) {
        super(context, i10, false, null, c6Var);
        this.Oe = f41Var;
        this.Me = i11;
        this.Ne = i12;
        this.Be = false;
        this.Ce = new RectF();
        this.De = new RectF();
        this.He = new Path();
        this.Je = new Paint(1);
        this.Le = new org.telegram.ui.Components.d6(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override
    public final void E1(Canvas canvas) {
        Paint paint = this.Fe;
        f41 f41Var = this.Oe;
        if (paint != null) {
            float f9 = f41Var.f37995s;
            RectF rectF = f41Var.N;
            if (f9 > 0.0f) {
                if (f41Var.M) {
                    if (this.f25422ke) {
                        Bitmap bitmap = f41Var.L.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.He;
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
                        if (this.Ie == null) {
                            Paint paint2 = new Paint(1);
                            this.Ie = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.Ie);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.Le.e(f41Var.M), 1.0f - f41Var.f37995s));
                    getPhotoImage().draw(canvas);
                } else {
                    getPhotoImage().draw(canvas);
                }
            }
            this.Ge.reset();
            float width2 = (rectF.width() / 76.8f) * f41Var.v;
            this.Ge.postScale(width2, width2);
            this.Ge.postTranslate(rectF.centerX(), rectF.centerY());
            this.Ee.setLocalMatrix(this.Ge);
            canvas.saveLayerAlpha(rectF, 255, 31);
            super.E1(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.Fe);
            canvas.restore();
            canvas.restore();
        } else {
            super.E1(canvas);
        }
        canvas.saveLayerAlpha(f41Var.N, (int) (f41Var.v * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.Je;
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dp(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(f41Var.N);
        rectF2.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - f41Var.W) * (-360.0f), false, paint3);
        if (this.Ke == null) {
            org.telegram.ui.Components.o11 o11Var = new org.telegram.ui.Components.o11(120);
            this.Ke = o11Var;
            o11Var.f31227b = true;
        }
        paint3.setStrokeWidth(AndroidUtilities.dp(2.8f));
        this.Ke.a((1.0f - f41Var.W) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override
    public final void F1(Canvas canvas) {
        AndroidUtilities.lerp(1.0f, 1.5f, this.Oe.v);
        super.F1(canvas);
    }

    @Override
    public final void d2(Canvas canvas, float f9, Integer num) {
        canvas.save();
        kg.r0 r0Var = this.J;
        f41 f41Var = this.Oe;
        canvas.translate(AndroidUtilities.lerp(0, -r0Var.f13833c, f41Var.f37995s), AndroidUtilities.lerp(f41Var.K.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), r0Var.f13844p, f41Var.f37995s));
        super.d2(canvas, (1.0f - f41Var.f37995s) * f9, num);
        canvas.restore();
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
    public final void m2(float f9, Canvas canvas, boolean z10) {
        canvas.save();
        f41 f41Var = this.Oe;
        if (f41Var.O) {
            int i10 = this.f25433lb;
            MessageObject messageObject = f41Var.I;
            int i11 = 0;
            if (messageObject != null && messageObject.isOutOwner()) {
                MessageObject messageObject2 = f41Var.I;
                if (messageObject2 != null && messageObject2.type == 19) {
                    i11 = 4;
                }
                i11 += 20;
            }
            canvas.translate(((this.De.right - (AndroidUtilities.dp(8 + i11) + i10)) - this.f25461nb) * f41Var.f37995s, 0.0f);
        }
        super.m2(f9, canvas, z10);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        f41 f41Var = this.Oe;
        boolean z10 = f41Var.O;
        RectF rectF = f41Var.N;
        if (z10) {
            boolean z11 = this.Be;
            RectF rectF2 = this.De;
            RectF rectF3 = this.Ce;
            if (!z11) {
                rectF3.set(getPhotoImage().getImageX(), getPhotoImage().getImageY(), getPhotoImage().getImageX2(), getPhotoImage().getImageY2());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.Be = true;
                this.Ee = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.Fe = paint;
                paint.setShader(this.Ee);
                this.Fe.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.Ge = new Matrix();
            }
            AndroidUtilities.lerp(rectF3, rectF2, f41Var.f37995s, rectF);
            U3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().setRoundRadius((int) rectF.width());
            if (f41Var.f37995s > 0.0f && f41Var.M) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            } else {
                canvas2 = canvas;
            }
            this.re = 1.0f - f41Var.f37995s;
        } else {
            canvas2 = canvas;
        }
        S1(canvas2);
        if (f41Var.O && f41Var.f37995s > 0.0f && f41Var.M) {
            canvas2.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Me, this.Ne);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        TextureView textureView = this.Oe.L;
        if (textureView != null && i10 == 8) {
            textureView.setVisibility(i10);
        }
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
