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
    public Bitmap f28529a;
    public Canvas f28530b;
    public final Paint f28531c;
    public final Paint d;
    public int e;
    public int f28532f;
    public int f28533g;
    public int h;
    public final pi0 f28534i;

    public mi0(pi0 pi0Var) {
        this.f28534i = pi0Var;
        Paint paint = new Paint();
        this.f28531c = paint;
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
        pi0 pi0Var = (pi0) tvVar.f30683b;
        pi0 pi0Var2 = this.f28534i;
        Paint paint = pi0Var2.f29319a;
        Bitmap bitmap = this.f28529a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.r.a(pi0Var2.f29322f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (pi0Var2.getWidth() - this.f28532f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f28529a.eraseColor(0);
                this.f28530b.save();
                this.f28530b.scale(this.f28529a.getWidth() / this.f28533g, this.f28529a.getHeight() / this.h);
                float f7 = -width;
                this.f28530b.translate(f7, 0.0f);
                pi0.a(pi0Var, this.f28530b);
                this.f28530b.restore();
                this.f28530b.save();
                this.f28530b.scale(this.f28529a.getWidth() / this.f28533g, this.f28529a.getHeight() / this.h);
                if (pi0Var2.f29323n != null) {
                    this.f28530b.save();
                    this.f28530b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = pi0Var2.f29323n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f28530b;
                        float centerX = pi0Var2.f29323n.bounds.centerX();
                        RectF rectF = pi0Var2.f29323n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), pi0Var2.f29323n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f28530b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), pi0Var2.f29323n.bounds.height()) / 2.0f;
                        this.f28530b.drawRoundRect(pi0Var2.f29323n.bounds, max, max, paint);
                    }
                    this.f28530b.restore();
                } else {
                    this.f28530b.drawRect(0.0f, 0.0f, this.f28532f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f28530b.restore();
                Utilities.stackBlurBitmap(this.f28529a, (int) ((pi0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f28533g, this.h, null);
                canvas2.scale(this.f28533g / this.f28529a.getWidth(), this.h / this.f28529a.getHeight());
                canvas2.drawBitmap(this.f28529a, 0.0f, 0.0f, this.f28531c);
                canvas2.drawBitmap(this.f28529a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f28532f, this.e, i11);
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
        Bitmap bitmap = this.f28529a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f28529a = null;
        }
        this.f28532f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f28533g = this.f28532f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f28529a = Bitmap.createBitmap((int) (this.f28533g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f28530b = new Canvas(this.f28529a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
