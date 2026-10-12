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
public final class xi0 implements zi0 {
    public Bitmap f32768a;
    public Canvas f32769b;
    public final Paint f32770c;
    public final Paint d;
    public int f32771e;
    public int f32772f;
    public int f32773g;
    public int h;
    public final aj0 f32774i;

    public xi0(aj0 aj0Var) {
        this.f32774i = aj0Var;
        Paint paint = new Paint();
        this.f32770c = paint;
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
    public final void c(ew ewVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        aj0 aj0Var = (aj0) ewVar.f25794b;
        aj0 aj0Var2 = this.f32774i;
        Paint paint = aj0Var2.f24405a;
        Bitmap bitmap = this.f32768a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.n.a(aj0Var2.f24409f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (aj0Var2.getWidth() - this.f32772f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f32768a.eraseColor(0);
                this.f32769b.save();
                this.f32769b.scale(this.f32768a.getWidth() / this.f32773g, this.f32768a.getHeight() / this.h);
                float f7 = -width;
                this.f32769b.translate(f7, 0.0f);
                aj0.a(aj0Var, this.f32769b);
                this.f32769b.restore();
                this.f32769b.save();
                this.f32769b.scale(this.f32768a.getWidth() / this.f32773g, this.f32768a.getHeight() / this.h);
                if (aj0Var2.f24410n != null) {
                    this.f32769b.save();
                    this.f32769b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = aj0Var2.f24410n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f32769b;
                        float centerX = aj0Var2.f24410n.bounds.centerX();
                        RectF rectF = aj0Var2.f24410n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), aj0Var2.f24410n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f32769b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), aj0Var2.f24410n.bounds.height()) / 2.0f;
                        this.f32769b.drawRoundRect(aj0Var2.f24410n.bounds, max, max, paint);
                    }
                    this.f32769b.restore();
                } else {
                    this.f32769b.drawRect(0.0f, 0.0f, this.f32772f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f32769b.restore();
                Utilities.stackBlurBitmap(this.f32768a, (int) ((aj0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f32773g, this.h, null);
                canvas2.scale(this.f32773g / this.f32768a.getWidth(), this.h / this.f32768a.getHeight());
                canvas2.drawBitmap(this.f32768a, 0.0f, 0.0f, this.f32770c);
                canvas2.drawBitmap(this.f32768a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f32772f, this.f32771e, i11);
                } else {
                    i11 = a2;
                }
                aj0.a(aj0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f32768a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f32768a = null;
        }
        this.f32772f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.f32771e = min;
        this.f32773g = this.f32772f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f32768a = Bitmap.createBitmap((int) (this.f32773g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f32769b = new Canvas(this.f32768a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
