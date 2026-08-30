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
public final class wh0 implements yh0 {
    public Bitmap f30351a;
    public Canvas f30352b;
    public final Paint f30353c;
    public final Paint d;
    public int e;
    public int f30354f;
    public int f30355g;
    public int h;
    public final zh0 f30356i;

    public wh0(zh0 zh0Var) {
        this.f30356i = zh0Var;
        Paint paint = new Paint();
        this.f30353c = paint;
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
    public final void c(fv fvVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        zh0 zh0Var = (zh0) fvVar.f24962b;
        zh0 zh0Var2 = this.f30356i;
        Paint paint = zh0Var2.f31342a;
        Bitmap bitmap = this.f30351a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((k7.n.a(zh0Var2.f31345f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (zh0Var2.getWidth() - this.f30354f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f30351a.eraseColor(0);
                this.f30352b.save();
                this.f30352b.scale(this.f30351a.getWidth() / this.f30355g, this.f30351a.getHeight() / this.h);
                float f10 = -width;
                this.f30352b.translate(f10, 0.0f);
                zh0.a(zh0Var, this.f30352b);
                this.f30352b.restore();
                this.f30352b.save();
                this.f30352b.scale(this.f30351a.getWidth() / this.f30355g, this.f30351a.getHeight() / this.h);
                if (zh0Var2.f31346n != null) {
                    this.f30352b.save();
                    this.f30352b.translate(f10, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = zh0Var2.f31346n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f30352b;
                        float centerX = zh0Var2.f31346n.bounds.centerX();
                        RectF rectF = zh0Var2.f31346n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), zh0Var2.f31346n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f30352b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), zh0Var2.f31346n.bounds.height()) / 2.0f;
                        this.f30352b.drawRoundRect(zh0Var2.f31346n.bounds, max, max, paint);
                    }
                    this.f30352b.restore();
                } else {
                    this.f30352b.drawRect(0.0f, 0.0f, this.f30354f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f30352b.restore();
                Utilities.stackBlurBitmap(this.f30351a, (int) ((zh0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f30355g, this.h, null);
                canvas2.scale(this.f30355g / this.f30351a.getWidth(), this.h / this.f30351a.getHeight());
                canvas2.drawBitmap(this.f30351a, 0.0f, 0.0f, this.f30353c);
                canvas2.drawBitmap(this.f30351a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f30354f, this.e, i11);
                } else {
                    i11 = a2;
                }
                zh0.a(zh0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f30351a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f30351a = null;
        }
        this.f30354f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f30355g = this.f30354f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f30351a = Bitmap.createBitmap((int) (this.f30355g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f30352b = new Canvas(this.f30351a);
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void b(float f10) {
    }
}
