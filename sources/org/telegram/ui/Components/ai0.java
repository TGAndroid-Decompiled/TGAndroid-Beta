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
public final class ai0 implements ci0 {
    public Bitmap f22701a;
    public Canvas f22702b;
    public final Paint f22703c;
    public final Paint d;
    public int e;
    public int f22704f;
    public int f22705g;
    public int h;
    public final di0 f22706i;

    public ai0(di0 di0Var) {
        this.f22706i = di0Var;
        Paint paint = new Paint();
        this.f22703c = paint;
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
        di0 di0Var = (di0) mvVar.f26585b;
        di0 di0Var2 = this.f22706i;
        Paint paint = di0Var2.f23624a;
        Bitmap bitmap = this.f22701a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.q.a(di0Var2.f23627f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (di0Var2.getWidth() - this.f22704f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f22701a.eraseColor(0);
                this.f22702b.save();
                this.f22702b.scale(this.f22701a.getWidth() / this.f22705g, this.f22701a.getHeight() / this.h);
                float f7 = -width;
                this.f22702b.translate(f7, 0.0f);
                di0.a(di0Var, this.f22702b);
                this.f22702b.restore();
                this.f22702b.save();
                this.f22702b.scale(this.f22701a.getWidth() / this.f22705g, this.f22701a.getHeight() / this.h);
                if (di0Var2.f23628n != null) {
                    this.f22702b.save();
                    this.f22702b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = di0Var2.f23628n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f22702b;
                        float centerX = di0Var2.f23628n.bounds.centerX();
                        RectF rectF = di0Var2.f23628n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), di0Var2.f23628n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f22702b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), di0Var2.f23628n.bounds.height()) / 2.0f;
                        this.f22702b.drawRoundRect(di0Var2.f23628n.bounds, max, max, paint);
                    }
                    this.f22702b.restore();
                } else {
                    this.f22702b.drawRect(0.0f, 0.0f, this.f22704f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f22702b.restore();
                Utilities.stackBlurBitmap(this.f22701a, (int) ((di0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f22705g, this.h, null);
                canvas2.scale(this.f22705g / this.f22701a.getWidth(), this.h / this.f22701a.getHeight());
                canvas2.drawBitmap(this.f22701a, 0.0f, 0.0f, this.f22703c);
                canvas2.drawBitmap(this.f22701a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f22704f, this.e, i11);
                } else {
                    i11 = a2;
                }
                di0.a(di0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f22701a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f22701a = null;
        }
        this.f22704f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f22705g = this.f22704f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f22701a = Bitmap.createBitmap((int) (this.f22705g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f22702b = new Canvas(this.f22701a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
