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
public final class j51 extends org.telegram.ui.Cells.u1 {
    public boolean Ge;
    public final RectF He;
    public final RectF Ie;
    public RadialGradient Je;
    public Paint Ke;
    public Matrix Le;
    public final Path Me;
    public Paint Ne;
    public final Paint Oe;
    public org.telegram.ui.Components.n21 Pe;
    public final org.telegram.ui.Components.d6 Qe;
    public final int Re;
    public final int Se;
    public final l51 Te;

    public j51(l51 l51Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12) {
        super(context, i10, false, null, f6Var);
        this.Te = l51Var;
        this.Re = i11;
        this.Se = i12;
        this.Ge = false;
        this.He = new RectF();
        this.Ie = new RectF();
        this.Me = new Path();
        this.Oe = new Paint(1);
        this.Qe = new org.telegram.ui.Components.d6(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override
    public final void E1(Canvas canvas) {
        Paint paint = this.Ke;
        l51 l51Var = this.Te;
        if (paint != null) {
            float f7 = l51Var.f35336s;
            RectF rectF = l51Var.R;
            if (f7 > 0.0f) {
                if (l51Var.Q) {
                    if (this.f21463pe) {
                        Bitmap bitmap = l51Var.P.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.Me;
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
                        if (this.Ne == null) {
                            Paint paint2 = new Paint(1);
                            this.Ne = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.Ne);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.Qe.e(l51Var.Q), 1.0f - l51Var.f35336s));
                    getPhotoImage().draw(canvas);
                } else {
                    getPhotoImage().draw(canvas);
                }
            }
            this.Le.reset();
            float width2 = (rectF.width() / 76.8f) * l51Var.v;
            this.Le.postScale(width2, width2);
            this.Le.postTranslate(rectF.centerX(), rectF.centerY());
            this.Je.setLocalMatrix(this.Le);
            canvas.saveLayerAlpha(rectF, 255, 31);
            super.E1(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.Ke);
            canvas.restore();
            canvas.restore();
        } else {
            super.E1(canvas);
        }
        canvas.saveLayerAlpha(l51Var.R, (int) (l51Var.v * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.Oe;
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dp(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(l51Var.R);
        rectF2.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - l51Var.f35326a0) * (-360.0f), false, paint3);
        if (this.Pe == null) {
            org.telegram.ui.Components.n21 n21Var = new org.telegram.ui.Components.n21(120);
            this.Pe = n21Var;
            n21Var.f26600b = true;
        }
        paint3.setStrokeWidth(AndroidUtilities.dp(2.8f));
        this.Pe.a((1.0f - l51Var.f35326a0) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override
    public final void F1(Canvas canvas) {
        AndroidUtilities.lerp(1.0f, 1.5f, this.Te.v);
        super.F1(canvas);
    }

    @Override
    public final void d2(Canvas canvas, float f7, Integer num) {
        canvas.save();
        zg.q0 q0Var = this.N;
        l51 l51Var = this.Te;
        canvas.translate(AndroidUtilities.lerp(0, -q0Var.f49464c, l51Var.f35336s), AndroidUtilities.lerp(l51Var.O.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), q0Var.f49474p, l51Var.f35336s));
        super.d2(canvas, (1.0f - l51Var.f35336s) * f7, num);
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
        l51 l51Var = this.Te;
        if (l51Var.S) {
            int i10 = this.f21460pb;
            MessageObject messageObject = l51Var.M;
            int i11 = 0;
            if (messageObject != null && messageObject.isOutOwner()) {
                MessageObject messageObject2 = l51Var.M;
                if (messageObject2 != null && messageObject2.type == 19) {
                    i11 = 4;
                }
                i11 += 20;
            }
            canvas.translate(((this.Ie.right - (AndroidUtilities.dp(8 + i11) + i10)) - this.f21490rb) * l51Var.f35336s, 0.0f);
        }
        super.m2(f7, canvas, z10);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        l51 l51Var = this.Te;
        boolean z10 = l51Var.S;
        RectF rectF = l51Var.R;
        if (z10) {
            boolean z11 = this.Ge;
            RectF rectF2 = this.Ie;
            RectF rectF3 = this.He;
            if (!z11) {
                rectF3.set(getPhotoImage().getImageX(), getPhotoImage().getImageY(), getPhotoImage().getImageX2(), getPhotoImage().getImageY2());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.Ge = true;
                this.Je = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.Ke = paint;
                paint.setShader(this.Je);
                this.Ke.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.Le = new Matrix();
            }
            AndroidUtilities.lerp(rectF3, rectF2, l51Var.f35336s, rectF);
            U3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().setRoundRadius((int) rectF.width());
            if (l51Var.f35336s > 0.0f && l51Var.Q) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            } else {
                canvas2 = canvas;
            }
            this.f21567we = 1.0f - l51Var.f35336s;
        } else {
            canvas2 = canvas;
        }
        S1(canvas2);
        if (l51Var.S && l51Var.f35336s > 0.0f && l51Var.Q) {
            canvas2.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Re, this.Se);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        TextureView textureView = this.Te.P;
        if (textureView != null && i10 == 8) {
            textureView.setVisibility(i10);
        }
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
