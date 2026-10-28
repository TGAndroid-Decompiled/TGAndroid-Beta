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
public final class pi0 implements ri0 {
    public Bitmap f31621a;
    public Canvas f31622b;
    public final Paint f31623c;
    public final Paint d;
    public int e;
    public int f31624f;
    public int f31625g;
    public int h;
    public final si0 f31626i;

    public pi0(si0 si0Var) {
        this.f31626i = si0Var;
        Paint paint = new Paint();
        this.f31623c = paint;
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
    public final void c(tv tvVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        si0 si0Var = (si0) tvVar.f33156b;
        si0 si0Var2 = this.f31626i;
        Paint paint = si0Var2.f32600a;
        Bitmap bitmap = this.f31621a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((a8.ee.a(si0Var2.f32603f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (si0Var2.getWidth() - this.f31624f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f31621a.eraseColor(0);
                this.f31622b.save();
                this.f31622b.scale(this.f31621a.getWidth() / this.f31625g, this.f31621a.getHeight() / this.h);
                float f7 = -width;
                this.f31622b.translate(f7, 0.0f);
                si0.a(si0Var, this.f31622b);
                this.f31622b.restore();
                this.f31622b.save();
                this.f31622b.scale(this.f31621a.getWidth() / this.f31625g, this.f31621a.getHeight() / this.h);
                if (si0Var2.f32604n != null) {
                    this.f31622b.save();
                    this.f31622b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = si0Var2.f32604n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f31622b;
                        float centerX = si0Var2.f32604n.bounds.centerX();
                        RectF rectF = si0Var2.f32604n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), si0Var2.f32604n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f31622b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), si0Var2.f32604n.bounds.height()) / 2.0f;
                        this.f31622b.drawRoundRect(si0Var2.f32604n.bounds, max, max, paint);
                    }
                    this.f31622b.restore();
                } else {
                    this.f31622b.drawRect(0.0f, 0.0f, this.f31624f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f31622b.restore();
                Utilities.stackBlurBitmap(this.f31621a, (int) ((si0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f31625g, this.h, null);
                canvas2.scale(this.f31625g / this.f31621a.getWidth(), this.h / this.f31621a.getHeight());
                canvas2.drawBitmap(this.f31621a, 0.0f, 0.0f, this.f31623c);
                canvas2.drawBitmap(this.f31621a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f31624f, this.e, i11);
                } else {
                    i11 = a2;
                }
                si0.a(si0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f31621a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f31621a = null;
        }
        this.f31624f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f31625g = this.f31624f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f31621a = Bitmap.createBitmap((int) (this.f31625g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f31622b = new Canvas(this.f31621a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
