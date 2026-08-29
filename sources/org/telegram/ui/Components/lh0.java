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
public final class lh0 implements nh0 {
    public Bitmap f30328a;
    public Canvas f30329b;
    public final Paint f30330c;
    public final Paint d;
    public int f30331e;
    public int f30332f;
    public int f30333g;
    public int h;
    public final oh0 f30334i;

    public lh0(oh0 oh0Var) {
        this.f30334i = oh0Var;
        Paint paint = new Paint();
        this.f30330c = paint;
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
    public final void c(cv cvVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        oh0 oh0Var = (oh0) cvVar.f27577b;
        oh0 oh0Var2 = this.f30334i;
        Paint paint = oh0Var2.f31365a;
        Bitmap bitmap = this.f30328a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((i7.w.a(oh0Var2.f31369f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (oh0Var2.getWidth() - this.f30332f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f30328a.eraseColor(0);
                this.f30329b.save();
                this.f30329b.scale(this.f30328a.getWidth() / this.f30333g, this.f30328a.getHeight() / this.h);
                float f9 = -width;
                this.f30329b.translate(f9, 0.0f);
                oh0.a(oh0Var, this.f30329b);
                this.f30329b.restore();
                this.f30329b.save();
                this.f30329b.scale(this.f30328a.getWidth() / this.f30333g, this.f30328a.getHeight() / this.h);
                if (oh0Var2.f31370n != null) {
                    this.f30329b.save();
                    this.f30329b.translate(f9, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = oh0Var2.f31370n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f30329b;
                        float centerX = oh0Var2.f31370n.bounds.centerX();
                        RectF rectF = oh0Var2.f31370n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), oh0Var2.f31370n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f30329b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), oh0Var2.f31370n.bounds.height()) / 2.0f;
                        this.f30329b.drawRoundRect(oh0Var2.f31370n.bounds, max, max, paint);
                    }
                    this.f30329b.restore();
                } else {
                    this.f30329b.drawRect(0.0f, 0.0f, this.f30332f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f30329b.restore();
                Utilities.stackBlurBitmap(this.f30328a, (int) ((oh0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f30333g, this.h, null);
                canvas2.scale(this.f30333g / this.f30328a.getWidth(), this.h / this.f30328a.getHeight());
                canvas2.drawBitmap(this.f30328a, 0.0f, 0.0f, this.f30330c);
                canvas2.drawBitmap(this.f30328a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f30332f, this.f30331e, i11);
                } else {
                    i11 = a2;
                }
                oh0.a(oh0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f30328a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f30328a = null;
        }
        this.f30332f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.f30331e = min;
        this.f30333g = this.f30332f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f30328a = Bitmap.createBitmap((int) (this.f30333g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f30329b = new Canvas(this.f30328a);
    }

    @Override
    public final void a(float f9) {
    }

    @Override
    public final void b(float f9) {
    }
}
