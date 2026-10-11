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
    public Bitmap f31888a;
    public Canvas f31889b;
    public final Paint f31890c;
    public final Paint d;
    public int f31891e;
    public int f31892f;
    public int f31893g;
    public int h;
    public final yi0 f31894i;

    public vi0(yi0 yi0Var) {
        this.f31894i = yi0Var;
        Paint paint = new Paint();
        this.f31890c = paint;
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
        yi0 yi0Var = (yi0) cwVar.f25482b;
        yi0 yi0Var2 = this.f31894i;
        Paint paint = yi0Var2.f33356a;
        Bitmap bitmap = this.f31888a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.o.a(yi0Var2.f33360f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (yi0Var2.getWidth() - this.f31892f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f31888a.eraseColor(0);
                this.f31889b.save();
                this.f31889b.scale(this.f31888a.getWidth() / this.f31893g, this.f31888a.getHeight() / this.h);
                float f7 = -width;
                this.f31889b.translate(f7, 0.0f);
                yi0.a(yi0Var, this.f31889b);
                this.f31889b.restore();
                this.f31889b.save();
                this.f31889b.scale(this.f31888a.getWidth() / this.f31893g, this.f31888a.getHeight() / this.h);
                if (yi0Var2.f33361n != null) {
                    this.f31889b.save();
                    this.f31889b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = yi0Var2.f33361n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f31889b;
                        float centerX = yi0Var2.f33361n.bounds.centerX();
                        RectF rectF = yi0Var2.f33361n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), yi0Var2.f33361n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f31889b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), yi0Var2.f33361n.bounds.height()) / 2.0f;
                        this.f31889b.drawRoundRect(yi0Var2.f33361n.bounds, max, max, paint);
                    }
                    this.f31889b.restore();
                } else {
                    this.f31889b.drawRect(0.0f, 0.0f, this.f31892f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f31889b.restore();
                Utilities.stackBlurBitmap(this.f31888a, (int) ((yi0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f31893g, this.h, null);
                canvas2.scale(this.f31893g / this.f31888a.getWidth(), this.h / this.f31888a.getHeight());
                canvas2.drawBitmap(this.f31888a, 0.0f, 0.0f, this.f31890c);
                canvas2.drawBitmap(this.f31888a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f31892f, this.f31891e, i11);
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
        Bitmap bitmap = this.f31888a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f31888a = null;
        }
        this.f31892f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.f31891e = min;
        this.f31893g = this.f31892f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f31888a = Bitmap.createBitmap((int) (this.f31893g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f31889b = new Canvas(this.f31888a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
