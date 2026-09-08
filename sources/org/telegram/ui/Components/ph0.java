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
public final class ph0 implements rh0 {
    public Bitmap f29410a;
    public Canvas f29411b;
    public final Paint f29412c;
    public final Paint d;
    public int f29413e;
    public int f29414f;
    public int f29415g;
    public int h;
    public final sh0 f29416i;

    public ph0(sh0 sh0Var) {
        this.f29416i = sh0Var;
        Paint paint = new Paint();
        this.f29412c = paint;
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
    public final void c(kv kvVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        sh0 sh0Var = (sh0) kvVar.f27935b;
        sh0 sh0Var2 = this.f29416i;
        Paint paint = sh0Var2.f30320a;
        Bitmap bitmap = this.f29410a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.p.a(sh0Var2.f30324f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (sh0Var2.getWidth() - this.f29414f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f29410a.eraseColor(0);
                this.f29411b.save();
                this.f29411b.scale(this.f29410a.getWidth() / this.f29415g, this.f29410a.getHeight() / this.h);
                float f7 = -width;
                this.f29411b.translate(f7, 0.0f);
                sh0.a(sh0Var, this.f29411b);
                this.f29411b.restore();
                this.f29411b.save();
                this.f29411b.scale(this.f29410a.getWidth() / this.f29415g, this.f29410a.getHeight() / this.h);
                if (sh0Var2.f30325n != null) {
                    this.f29411b.save();
                    this.f29411b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = sh0Var2.f30325n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f29411b;
                        float centerX = sh0Var2.f30325n.bounds.centerX();
                        RectF rectF = sh0Var2.f30325n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), sh0Var2.f30325n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f29411b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), sh0Var2.f30325n.bounds.height()) / 2.0f;
                        this.f29411b.drawRoundRect(sh0Var2.f30325n.bounds, max, max, paint);
                    }
                    this.f29411b.restore();
                } else {
                    this.f29411b.drawRect(0.0f, 0.0f, this.f29414f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f29411b.restore();
                Utilities.stackBlurBitmap(this.f29410a, (int) ((sh0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f29415g, this.h, null);
                canvas2.scale(this.f29415g / this.f29410a.getWidth(), this.h / this.f29410a.getHeight());
                canvas2.drawBitmap(this.f29410a, 0.0f, 0.0f, this.f29412c);
                canvas2.drawBitmap(this.f29410a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f29414f, this.f29413e, i11);
                } else {
                    i11 = a2;
                }
                sh0.a(sh0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f29410a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f29410a = null;
        }
        this.f29414f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.f29413e = min;
        this.f29415g = this.f29414f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f29410a = Bitmap.createBitmap((int) (this.f29415g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f29411b = new Canvas(this.f29410a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
