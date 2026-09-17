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
    public Bitmap f29384a;
    public Canvas f29385b;
    public final Paint f29386c;
    public final Paint d;
    public int f29387e;
    public int f29388f;
    public int f29389g;
    public int h;
    public final sh0 f29390i;

    public ph0(sh0 sh0Var) {
        this.f29390i = sh0Var;
        Paint paint = new Paint();
        this.f29386c = paint;
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
        sh0 sh0Var = (sh0) kvVar.f27909b;
        sh0 sh0Var2 = this.f29390i;
        Paint paint = sh0Var2.f30294a;
        Bitmap bitmap = this.f29384a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.p.a(sh0Var2.f30298f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (sh0Var2.getWidth() - this.f29388f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f29384a.eraseColor(0);
                this.f29385b.save();
                this.f29385b.scale(this.f29384a.getWidth() / this.f29389g, this.f29384a.getHeight() / this.h);
                float f7 = -width;
                this.f29385b.translate(f7, 0.0f);
                sh0.a(sh0Var, this.f29385b);
                this.f29385b.restore();
                this.f29385b.save();
                this.f29385b.scale(this.f29384a.getWidth() / this.f29389g, this.f29384a.getHeight() / this.h);
                if (sh0Var2.f30299n != null) {
                    this.f29385b.save();
                    this.f29385b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = sh0Var2.f30299n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f29385b;
                        float centerX = sh0Var2.f30299n.bounds.centerX();
                        RectF rectF = sh0Var2.f30299n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), sh0Var2.f30299n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f29385b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), sh0Var2.f30299n.bounds.height()) / 2.0f;
                        this.f29385b.drawRoundRect(sh0Var2.f30299n.bounds, max, max, paint);
                    }
                    this.f29385b.restore();
                } else {
                    this.f29385b.drawRect(0.0f, 0.0f, this.f29388f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f29385b.restore();
                Utilities.stackBlurBitmap(this.f29384a, (int) ((sh0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f29389g, this.h, null);
                canvas2.scale(this.f29389g / this.f29384a.getWidth(), this.h / this.f29384a.getHeight());
                canvas2.drawBitmap(this.f29384a, 0.0f, 0.0f, this.f29386c);
                canvas2.drawBitmap(this.f29384a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f29388f, this.f29387e, i11);
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
        Bitmap bitmap = this.f29384a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f29384a = null;
        }
        this.f29388f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.f29387e = min;
        this.f29389g = this.f29388f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f29384a = Bitmap.createBitmap((int) (this.f29389g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f29385b = new Canvas(this.f29384a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
