package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotchInfoUtils;
import org.telegram.messenger.Utilities;
public final class ui0 implements wi0 {
    public Bitmap f31505a;
    public Canvas f31506b;
    public final Paint f31507c;
    public final Paint d;
    public int f31508e;
    public int f31509f;
    public int f31510g;
    public int h;
    public final xi0 f31511i;

    public ui0(xi0 xi0Var) {
        this.f31511i = xi0Var;
        Paint paint = new Paint();
        this.f31507c = paint;
        Paint paint2 = new Paint();
        this.d = paint2;
        paint.setFlags(7);
        paint.setFilterBitmap(true);
        paint2.setFlags(7);
        paint2.setFilterBitmap(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        paint.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60.0f, -7500.0f}));
    }

    @Override
    public final void c(bw bwVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        xi0 xi0Var = (xi0) bwVar.f25112b;
        xi0 xi0Var2 = this.f31511i;
        Paint paint = xi0Var2.f32879a;
        Bitmap bitmap = this.f31505a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.o.a(xi0Var2.f32883f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (xi0Var2.getWidth() - this.f31509f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f31505a.eraseColor(0);
                this.f31506b.save();
                this.f31506b.scale(this.f31505a.getWidth() / this.f31510g, this.f31505a.getHeight() / this.h);
                float f7 = -width;
                this.f31506b.translate(f7, 0.0f);
                xi0.a(xi0Var, this.f31506b);
                this.f31506b.restore();
                this.f31506b.save();
                this.f31506b.scale(this.f31505a.getWidth() / this.f31510g, this.f31505a.getHeight() / this.h);
                if (xi0Var2.f32884n != null) {
                    this.f31506b.save();
                    this.f31506b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = xi0Var2.f32884n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f31506b;
                        float centerX = xi0Var2.f32884n.bounds.centerX();
                        RectF rectF = xi0Var2.f32884n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), xi0Var2.f32884n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f31506b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), xi0Var2.f32884n.bounds.height()) / 2.0f;
                        this.f31506b.drawRoundRect(xi0Var2.f32884n.bounds, max, max, paint);
                    }
                    this.f31506b.restore();
                } else {
                    this.f31506b.drawRect(0.0f, 0.0f, this.f31509f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f31506b.restore();
                Utilities.stackBlurBitmap(this.f31505a, (int) ((xi0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f31510g, this.h, null);
                canvas2.scale(this.f31510g / this.f31505a.getWidth(), this.h / this.f31505a.getHeight());
                canvas2.drawBitmap(this.f31505a, 0.0f, 0.0f, this.f31507c);
                canvas2.drawBitmap(this.f31505a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f31509f, this.f31508e, i11);
                } else {
                    i11 = a2;
                }
                xi0.a(xi0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f31505a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f31505a = null;
        }
        this.f31509f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.f31508e = min;
        this.f31510g = this.f31509f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f31505a = Bitmap.createBitmap((int) (this.f31510g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f31506b = new Canvas(this.f31505a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
