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
public final class mi0 implements oi0 {
    public Bitmap f28525a;
    public Canvas f28526b;
    public final Paint f28527c;
    public final Paint d;
    public int e;
    public int f28528f;
    public int f28529g;
    public int h;
    public final pi0 f28530i;

    public mi0(pi0 pi0Var) {
        this.f28530i = pi0Var;
        Paint paint = new Paint();
        this.f28527c = paint;
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
        pi0 pi0Var = (pi0) tvVar.f30679b;
        pi0 pi0Var2 = this.f28530i;
        Paint paint = pi0Var2.f29315a;
        Bitmap bitmap = this.f28525a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.r.a(pi0Var2.f29318f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (pi0Var2.getWidth() - this.f28528f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f28525a.eraseColor(0);
                this.f28526b.save();
                this.f28526b.scale(this.f28525a.getWidth() / this.f28529g, this.f28525a.getHeight() / this.h);
                float f7 = -width;
                this.f28526b.translate(f7, 0.0f);
                pi0.a(pi0Var, this.f28526b);
                this.f28526b.restore();
                this.f28526b.save();
                this.f28526b.scale(this.f28525a.getWidth() / this.f28529g, this.f28525a.getHeight() / this.h);
                if (pi0Var2.f29319n != null) {
                    this.f28526b.save();
                    this.f28526b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = pi0Var2.f29319n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f28526b;
                        float centerX = pi0Var2.f29319n.bounds.centerX();
                        RectF rectF = pi0Var2.f29319n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), pi0Var2.f29319n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f28526b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), pi0Var2.f29319n.bounds.height()) / 2.0f;
                        this.f28526b.drawRoundRect(pi0Var2.f29319n.bounds, max, max, paint);
                    }
                    this.f28526b.restore();
                } else {
                    this.f28526b.drawRect(0.0f, 0.0f, this.f28528f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f28526b.restore();
                Utilities.stackBlurBitmap(this.f28525a, (int) ((pi0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f28529g, this.h, null);
                canvas2.scale(this.f28529g / this.f28525a.getWidth(), this.h / this.f28525a.getHeight());
                canvas2.drawBitmap(this.f28525a, 0.0f, 0.0f, this.f28527c);
                canvas2.drawBitmap(this.f28525a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f28528f, this.e, i11);
                } else {
                    i11 = a2;
                }
                pi0.a(pi0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f28525a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f28525a = null;
        }
        this.f28528f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f28529g = this.f28528f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f28525a = Bitmap.createBitmap((int) (this.f28529g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f28526b = new Canvas(this.f28525a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
