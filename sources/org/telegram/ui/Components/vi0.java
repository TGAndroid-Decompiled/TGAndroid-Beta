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
public final class vi0 implements xi0 {
    public Bitmap f31854a;
    public Canvas f31855b;
    public final Paint f31856c;
    public final Paint d;
    public int f31857e;
    public int f31858f;
    public int f31859g;
    public int h;
    public final yi0 f31860i;

    public vi0(yi0 yi0Var) {
        this.f31860i = yi0Var;
        Paint paint = new Paint();
        this.f31856c = paint;
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
    public final void c(cw cwVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        yi0 yi0Var = (yi0) cwVar.f25420b;
        yi0 yi0Var2 = this.f31860i;
        Paint paint = yi0Var2.f33302a;
        Bitmap bitmap = this.f31854a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.o.a(yi0Var2.f33306f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (yi0Var2.getWidth() - this.f31858f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f31854a.eraseColor(0);
                this.f31855b.save();
                this.f31855b.scale(this.f31854a.getWidth() / this.f31859g, this.f31854a.getHeight() / this.h);
                float f7 = -width;
                this.f31855b.translate(f7, 0.0f);
                yi0.a(yi0Var, this.f31855b);
                this.f31855b.restore();
                this.f31855b.save();
                this.f31855b.scale(this.f31854a.getWidth() / this.f31859g, this.f31854a.getHeight() / this.h);
                if (yi0Var2.f33307n != null) {
                    this.f31855b.save();
                    this.f31855b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = yi0Var2.f33307n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f31855b;
                        float centerX = yi0Var2.f33307n.bounds.centerX();
                        RectF rectF = yi0Var2.f33307n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), yi0Var2.f33307n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f31855b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), yi0Var2.f33307n.bounds.height()) / 2.0f;
                        this.f31855b.drawRoundRect(yi0Var2.f33307n.bounds, max, max, paint);
                    }
                    this.f31855b.restore();
                } else {
                    this.f31855b.drawRect(0.0f, 0.0f, this.f31858f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f31855b.restore();
                Utilities.stackBlurBitmap(this.f31854a, (int) ((yi0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f31859g, this.h, null);
                canvas2.scale(this.f31859g / this.f31854a.getWidth(), this.h / this.f31854a.getHeight());
                canvas2.drawBitmap(this.f31854a, 0.0f, 0.0f, this.f31856c);
                canvas2.drawBitmap(this.f31854a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f31858f, this.f31857e, i11);
                } else {
                    i11 = a2;
                }
                yi0.a(yi0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f31854a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f31854a = null;
        }
        this.f31858f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.f31857e = min;
        this.f31859g = this.f31858f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f31854a = Bitmap.createBitmap((int) (this.f31859g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f31855b = new Canvas(this.f31854a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
