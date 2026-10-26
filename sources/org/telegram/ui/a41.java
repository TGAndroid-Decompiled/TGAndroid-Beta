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
    public boolean He;
    public final RectF Ie;
    public final RectF Je;
    public RadialGradient Ke;
    public Paint Le;
    public Matrix Me;
    public final Path Ne;
    public Paint Oe;
    public final Paint Pe;
    public org.telegram.ui.Components.g31 Qe;
    public final org.telegram.ui.Components.h6 Re;
    public final int Se;
    public final int Te;
    public final c41 Ue;

    public a41(c41 c41Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11, int i12) {
        super(context, i10, false, null, u6Var);
        this.Ue = c41Var;
        this.Se = i11;
        this.Te = i12;
        this.He = false;
        this.Ie = new RectF();
        this.Je = new RectF();
        this.Ne = new Path();
        this.Pe = new Paint(1);
        this.Re = new org.telegram.ui.Components.h6(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override
    public final void E1(Canvas canvas) {
        Paint paint = this.Le;
        c41 c41Var = this.Ue;
        if (paint != null) {
            float f7 = c41Var.f38260s;
            RectF rectF = c41Var.R;
            if (f7 > 0.0f) {
                if (c41Var.Q) {
                    if (this.qe) {
                        Bitmap bitmap = c41Var.P.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.Ne;
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
                        if (this.Oe == null) {
                            Paint paint2 = new Paint(1);
                            this.Oe = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.Oe);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.Re.e(c41Var.Q), 1.0f - c41Var.f38260s));
                    getPhotoImage().draw(canvas);
                } else {
                    getPhotoImage().draw(canvas);
                }
            }
            this.Me.reset();
            float width2 = (rectF.width() / 76.8f) * c41Var.v;
            this.Me.postScale(width2, width2);
            this.Me.postTranslate(rectF.centerX(), rectF.centerY());
            this.Ke.setLocalMatrix(this.Me);
            canvas.saveLayerAlpha(rectF, 255, 31);
            super.E1(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.Le);
            canvas.restore();
            canvas.restore();
        } else {
            super.E1(canvas);
        }
        canvas.saveLayerAlpha(c41Var.R, (int) (c41Var.v * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.Pe;
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dp(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(c41Var.R);
        rectF2.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - c41Var.f38250a0) * (-360.0f), false, paint3);
        if (this.Qe == null) {
            org.telegram.ui.Components.g31 g31Var = new org.telegram.ui.Components.g31(120);
            this.Qe = g31Var;
            g31Var.f28400b = true;
        }
        paint3.setStrokeWidth(AndroidUtilities.dp(2.8f));
        this.Qe.a((1.0f - c41Var.f38250a0) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override
    public final void F1(Canvas canvas) {
        AndroidUtilities.lerp(1.0f, 1.5f, this.Ue.v);
        super.F1(canvas);
    }

    @Override
    public final void d2(Canvas canvas, float f7, Integer num) {
        canvas.save();
        bh.y0 y0Var = this.N;
        c41 c41Var = this.Ue;
        canvas.translate(AndroidUtilities.lerp(0, -y0Var.f4217c, c41Var.f38260s), AndroidUtilities.lerp(c41Var.O.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), y0Var.f4227p, c41Var.f38260s));
        super.d2(canvas, (1.0f - c41Var.f38260s) * f7, num);
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
    public final void m2(float f7, Canvas canvas, boolean z10) {
        canvas.save();
        c41 c41Var = this.Ue;
        if (c41Var.S) {
            int i10 = this.pb;
            MessageObject messageObject = c41Var.M;
            int i11 = 0;
            if (messageObject != null && messageObject.isOutOwner()) {
                MessageObject messageObject2 = c41Var.M;
                if (messageObject2 != null && messageObject2.type == 19) {
                    i11 = 4;
                }
                i11 += 20;
            }
            canvas.translate(((this.Je.right - (AndroidUtilities.dp(8 + i11) + i10)) - this.f25264rb) * c41Var.f38260s, 0.0f);
        }
        super.m2(f7, canvas, z10);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        c41 c41Var = this.Ue;
        boolean z10 = c41Var.S;
        RectF rectF = c41Var.R;
        if (z10) {
            boolean z11 = this.He;
            RectF rectF2 = this.Je;
            RectF rectF3 = this.Ie;
            if (!z11) {
                rectF3.set(getPhotoImage().getImageX(), getPhotoImage().getImageY(), getPhotoImage().getImageX2(), getPhotoImage().getImageY2());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.He = true;
                this.Ke = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.Le = paint;
                paint.setShader(this.Ke);
                this.Le.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.Me = new Matrix();
            }
            AndroidUtilities.lerp(rectF3, rectF2, c41Var.f38260s, rectF);
            W3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().setRoundRadius((int) rectF.width());
            if (c41Var.f38260s > 0.0f && c41Var.Q) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            } else {
                canvas2 = canvas;
            }
            this.f25357xe = 1.0f - c41Var.f38260s;
        } else {
            canvas2 = canvas;
        }
        S1(canvas2);
        if (c41Var.S && c41Var.f38260s > 0.0f && c41Var.Q) {
            canvas2.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Se, this.Te);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        TextureView textureView = this.Ue.P;
        if (textureView != null && i10 == 8) {
            textureView.setVisibility(i10);
        }
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
