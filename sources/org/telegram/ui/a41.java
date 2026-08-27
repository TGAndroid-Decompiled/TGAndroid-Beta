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

public final class a41 extends org.telegram.ui.Cells.s1 {
    public boolean Be;
    public final RectF Ce;
    public final RectF De;
    public RadialGradient Ee;
    public Paint Fe;
    public Matrix Ge;
    public final Path He;
    public Paint Ie;
    public final Paint Je;
    public org.telegram.ui.Components.e11 Ke;
    public final org.telegram.ui.Components.y5 Le;
    public final int Me;
    public final int Ne;
    public final c41 Oe;

    public a41(c41 c41Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12) {
        super(context, i10, false, null, c6Var);
        this.Oe = c41Var;
        this.Me = i11;
        this.Ne = i12;
        this.Be = false;
        this.Ce = new RectF();
        this.De = new RectF();
        this.He = new Path();
        this.Je = new Paint(1);
        this.Le = new org.telegram.ui.Components.y5(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override
    public final void D1(Canvas canvas) {
        Paint paint = this.Fe;
        c41 c41Var = this.Oe;
        if (paint != null) {
            float f10 = c41Var.f36944s;
            RectF rectF = c41Var.N;
            if (f10 > 0.0f) {
                if (c41Var.M) {
                    if (this.f25411ke) {
                        Bitmap bitmap = c41Var.L.getBitmap();
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
                        float fCenterX = rectF.centerX();
                        float fCenterY = rectF.centerY();
                        float fWidth = rectF.width() / 2.0f;
                        if (this.Ie == null) {
                            Paint paint2 = new Paint(1);
                            this.Ie = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(fCenterX, fCenterY, fWidth, this.Ie);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.Le.e(c41Var.M), 1.0f - c41Var.f36944s));
                    getPhotoImage().draw(canvas);
                } else {
                    getPhotoImage().draw(canvas);
                }
            }
            this.Ge.reset();
            float fWidth2 = (rectF.width() / 76.8f) * c41Var.v;
            this.Ge.postScale(fWidth2, fWidth2);
            this.Ge.postTranslate(rectF.centerX(), rectF.centerY());
            this.Ee.setLocalMatrix(this.Ge);
            canvas.saveLayerAlpha(rectF, 255, 31);
            super.D1(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.Fe);
            canvas.restore();
            canvas.restore();
        } else {
            super.D1(canvas);
        }
        canvas.saveLayerAlpha(c41Var.N, (int) (c41Var.v * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.Je;
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dp(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(c41Var.N);
        rectF2.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - c41Var.W) * (-360.0f), false, paint3);
        if (this.Ke == null) {
            org.telegram.ui.Components.e11 e11Var = new org.telegram.ui.Components.e11(120);
            this.Ke = e11Var;
            e11Var.f27924b = true;
        }
        paint3.setStrokeWidth(AndroidUtilities.dp(2.8f));
        this.Ke.a((1.0f - c41Var.W) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override
    public final void E1(Canvas canvas) {
        AndroidUtilities.lerp(1.0f, 1.5f, this.Oe.v);
        super.E1(canvas);
    }

    @Override
    public final void c2(Canvas canvas, float f10, Integer num) {
        canvas.save();
        ig.r0 r0Var = this.J;
        int i10 = -r0Var.f11420c;
        c41 c41Var = this.Oe;
        canvas.translate(AndroidUtilities.lerp(0, i10, c41Var.f36944s), AndroidUtilities.lerp(c41Var.K.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), r0Var.f11431p, c41Var.f36944s));
        super.c2(canvas, (1.0f - c41Var.f36944s) * f10, num);
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
    public final void l2(float f10, Canvas canvas, boolean z10) {
        canvas.save();
        c41 c41Var = this.Oe;
        if (c41Var.O) {
            int i10 = this.f25421lb;
            MessageObject messageObject = c41Var.I;
            int i11 = 0;
            if (messageObject != null && messageObject.isOutOwner()) {
                MessageObject messageObject2 = c41Var.I;
                if (messageObject2 != null && messageObject2.type == 19) {
                    i11 = 4;
                }
                i11 += 20;
            }
            canvas.translate(((this.De.right - (AndroidUtilities.dp(8 + i11) + i10)) - this.nb) * c41Var.f36944s, 0.0f);
        }
        super.l2(f10, canvas, z10);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        c41 c41Var = this.Oe;
        boolean z10 = c41Var.O;
        RectF rectF = c41Var.N;
        if (z10) {
            boolean z11 = this.Be;
            RectF rectF2 = this.De;
            RectF rectF3 = this.Ce;
            if (!z11) {
                rectF3.set(getPhotoImage().getImageX(), getPhotoImage().getImageY(), getPhotoImage().getImageX2(), getPhotoImage().getImageY2());
                float fMin = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - fMin) / 2.0f, (getMeasuredHeight() - fMin) / 2.0f, (getMeasuredWidth() + fMin) / 2.0f, (getMeasuredHeight() + fMin) / 2.0f);
                this.Be = true;
                this.Ee = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.Fe = paint;
                paint.setShader(this.Ee);
                this.Fe.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.Ge = new Matrix();
            }
            AndroidUtilities.lerp(rectF3, rectF2, c41Var.f36944s, rectF);
            T3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().setRoundRadius((int) rectF.width());
            if (c41Var.f36944s <= 0.0f || !c41Var.M) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            }
            this.f25507re = 1.0f - c41Var.f36944s;
        } else {
            canvas2 = canvas;
        }
        R1(canvas2);
        if (c41Var.O && c41Var.f36944s > 0.0f && c41Var.M) {
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
        if (textureView == null || i10 != 8) {
            return;
        }
        textureView.setVisibility(i10);
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
