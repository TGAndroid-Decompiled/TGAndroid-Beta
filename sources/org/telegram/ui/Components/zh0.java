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
public final class zh0 implements bi0 {
    public Bitmap f30827a;
    public Canvas f30828b;
    public final Paint f30829c;
    public final Paint d;
    public int e;
    public int f30830f;
    public int f30831g;
    public int h;
    public final ci0 f30832i;

    public zh0(ci0 ci0Var) {
        this.f30832i = ci0Var;
        Paint paint = new Paint();
        this.f30829c = paint;
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
    public final void c(mv mvVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        ci0 ci0Var = (ci0) mvVar.f26497b;
        ci0 ci0Var2 = this.f30832i;
        Paint paint = ci0Var2.f23295a;
        Bitmap bitmap = this.f30827a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.q.a(ci0Var2.f23298f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (ci0Var2.getWidth() - this.f30830f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f30827a.eraseColor(0);
                this.f30828b.save();
                this.f30828b.scale(this.f30827a.getWidth() / this.f30831g, this.f30827a.getHeight() / this.h);
                float f7 = -width;
                this.f30828b.translate(f7, 0.0f);
                ci0.a(ci0Var, this.f30828b);
                this.f30828b.restore();
                this.f30828b.save();
                this.f30828b.scale(this.f30827a.getWidth() / this.f30831g, this.f30827a.getHeight() / this.h);
                if (ci0Var2.f23299n != null) {
                    this.f30828b.save();
                    this.f30828b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = ci0Var2.f23299n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f30828b;
                        float centerX = ci0Var2.f23299n.bounds.centerX();
                        RectF rectF = ci0Var2.f23299n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), ci0Var2.f23299n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f30828b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), ci0Var2.f23299n.bounds.height()) / 2.0f;
                        this.f30828b.drawRoundRect(ci0Var2.f23299n.bounds, max, max, paint);
                    }
                    this.f30828b.restore();
                } else {
                    this.f30828b.drawRect(0.0f, 0.0f, this.f30830f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f30828b.restore();
                Utilities.stackBlurBitmap(this.f30827a, (int) ((ci0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f30831g, this.h, null);
                canvas2.scale(this.f30831g / this.f30827a.getWidth(), this.h / this.f30827a.getHeight());
                canvas2.drawBitmap(this.f30827a, 0.0f, 0.0f, this.f30829c);
                canvas2.drawBitmap(this.f30827a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f30830f, this.e, i11);
                } else {
                    i11 = a2;
                }
                ci0.a(ci0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f30827a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f30827a = null;
        }
        this.f30830f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f30831g = this.f30830f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f30827a = Bitmap.createBitmap((int) (this.f30831g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f30828b = new Canvas(this.f30827a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
