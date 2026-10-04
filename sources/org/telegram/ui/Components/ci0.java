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
    public Bitmap f25380a;
    public Canvas f25381b;
    public final Paint f25382c;
    public final Paint d;
    public int f25383e;
    public int f25384f;
    public int f25385g;
    public int h;
    public final fi0 f25386i;

    public ci0(fi0 fi0Var) {
        this.f25386i = fi0Var;
        Paint paint = new Paint();
        this.f25382c = paint;
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
        fi0 fi0Var = (fi0) pvVar.f29746b;
        fi0 fi0Var2 = this.f25386i;
        Paint paint = fi0Var2.f26457a;
        Bitmap bitmap = this.f25380a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.q.a(fi0Var2.f26461f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (fi0Var2.getWidth() - this.f25384f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f25380a.eraseColor(0);
                this.f25381b.save();
                this.f25381b.scale(this.f25380a.getWidth() / this.f25385g, this.f25380a.getHeight() / this.h);
                float f7 = -width;
                this.f25381b.translate(f7, 0.0f);
                fi0.a(fi0Var, this.f25381b);
                this.f25381b.restore();
                this.f25381b.save();
                this.f25381b.scale(this.f25380a.getWidth() / this.f25385g, this.f25380a.getHeight() / this.h);
                if (fi0Var2.f26462n != null) {
                    this.f25381b.save();
                    this.f25381b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = fi0Var2.f26462n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f25381b;
                        float centerX = fi0Var2.f26462n.bounds.centerX();
                        RectF rectF = fi0Var2.f26462n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), fi0Var2.f26462n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f25381b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), fi0Var2.f26462n.bounds.height()) / 2.0f;
                        this.f25381b.drawRoundRect(fi0Var2.f26462n.bounds, max, max, paint);
                    }
                    this.f25381b.restore();
                } else {
                    this.f25381b.drawRect(0.0f, 0.0f, this.f25384f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f25381b.restore();
                Utilities.stackBlurBitmap(this.f25380a, (int) ((fi0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f25385g, this.h, null);
                canvas2.scale(this.f25385g / this.f25380a.getWidth(), this.h / this.f25380a.getHeight());
                canvas2.drawBitmap(this.f25380a, 0.0f, 0.0f, this.f25382c);
                canvas2.drawBitmap(this.f25380a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f25384f, this.f25383e, i11);
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
        Bitmap bitmap = this.f25380a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f25380a = null;
        }
        this.f25384f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.f25383e = min;
        this.f25385g = this.f25384f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f25380a = Bitmap.createBitmap((int) (this.f25385g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f25381b = new Canvas(this.f25380a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
