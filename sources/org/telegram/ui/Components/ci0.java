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
public final class ci0 implements ei0 {
    public Bitmap f25434a;
    public Canvas f25435b;
    public final Paint f25436c;
    public final Paint d;
    public int f25437e;
    public int f25438f;
    public int f25439g;
    public int h;
    public final fi0 f25440i;

    public ci0(fi0 fi0Var) {
        this.f25440i = fi0Var;
        Paint paint = new Paint();
        this.f25436c = paint;
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
    public final void c(pv pvVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        fi0 fi0Var = (fi0) pvVar.f29849b;
        fi0 fi0Var2 = this.f25440i;
        Paint paint = fi0Var2.f26470a;
        Bitmap bitmap = this.f25434a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.q.a(fi0Var2.f26474f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (fi0Var2.getWidth() - this.f25438f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f25434a.eraseColor(0);
                this.f25435b.save();
                this.f25435b.scale(this.f25434a.getWidth() / this.f25439g, this.f25434a.getHeight() / this.h);
                float f7 = -width;
                this.f25435b.translate(f7, 0.0f);
                fi0.a(fi0Var, this.f25435b);
                this.f25435b.restore();
                this.f25435b.save();
                this.f25435b.scale(this.f25434a.getWidth() / this.f25439g, this.f25434a.getHeight() / this.h);
                if (fi0Var2.f26475n != null) {
                    this.f25435b.save();
                    this.f25435b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = fi0Var2.f26475n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f25435b;
                        float centerX = fi0Var2.f26475n.bounds.centerX();
                        RectF rectF = fi0Var2.f26475n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), fi0Var2.f26475n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f25435b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), fi0Var2.f26475n.bounds.height()) / 2.0f;
                        this.f25435b.drawRoundRect(fi0Var2.f26475n.bounds, max, max, paint);
                    }
                    this.f25435b.restore();
                } else {
                    this.f25435b.drawRect(0.0f, 0.0f, this.f25438f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f25435b.restore();
                Utilities.stackBlurBitmap(this.f25434a, (int) ((fi0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f25439g, this.h, null);
                canvas2.scale(this.f25439g / this.f25434a.getWidth(), this.h / this.f25434a.getHeight());
                canvas2.drawBitmap(this.f25434a, 0.0f, 0.0f, this.f25436c);
                canvas2.drawBitmap(this.f25434a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f25438f, this.f25437e, i11);
                } else {
                    i11 = a2;
                }
                fi0.a(fi0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f25434a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f25434a = null;
        }
        this.f25438f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.f25437e = min;
        this.f25439g = this.f25438f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f25434a = Bitmap.createBitmap((int) (this.f25439g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f25435b = new Canvas(this.f25434a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
