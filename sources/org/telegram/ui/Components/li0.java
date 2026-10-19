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
public final class li0 implements ni0 {
    public Bitmap f28228a;
    public Canvas f28229b;
    public final Paint f28230c;
    public final Paint d;
    public int e;
    public int f28231f;
    public int f28232g;
    public int h;
    public final oi0 f28233i;

    public li0(oi0 oi0Var) {
        this.f28233i = oi0Var;
        Paint paint = new Paint();
        this.f28230c = paint;
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
        oi0 oi0Var = (oi0) tvVar.f30681b;
        oi0 oi0Var2 = this.f28233i;
        Paint paint = oi0Var2.f29007a;
        Bitmap bitmap = this.f28228a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.r.a(oi0Var2.f29010f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (oi0Var2.getWidth() - this.f28231f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f28228a.eraseColor(0);
                this.f28229b.save();
                this.f28229b.scale(this.f28228a.getWidth() / this.f28232g, this.f28228a.getHeight() / this.h);
                float f7 = -width;
                this.f28229b.translate(f7, 0.0f);
                oi0.a(oi0Var, this.f28229b);
                this.f28229b.restore();
                this.f28229b.save();
                this.f28229b.scale(this.f28228a.getWidth() / this.f28232g, this.f28228a.getHeight() / this.h);
                if (oi0Var2.f29011n != null) {
                    this.f28229b.save();
                    this.f28229b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = oi0Var2.f29011n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f28229b;
                        float centerX = oi0Var2.f29011n.bounds.centerX();
                        RectF rectF = oi0Var2.f29011n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), oi0Var2.f29011n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f28229b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), oi0Var2.f29011n.bounds.height()) / 2.0f;
                        this.f28229b.drawRoundRect(oi0Var2.f29011n.bounds, max, max, paint);
                    }
                    this.f28229b.restore();
                } else {
                    this.f28229b.drawRect(0.0f, 0.0f, this.f28231f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f28229b.restore();
                Utilities.stackBlurBitmap(this.f28228a, (int) ((oi0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f28232g, this.h, null);
                canvas2.scale(this.f28232g / this.f28228a.getWidth(), this.h / this.f28228a.getHeight());
                canvas2.drawBitmap(this.f28228a, 0.0f, 0.0f, this.f28230c);
                canvas2.drawBitmap(this.f28228a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f28231f, this.e, i11);
                } else {
                    i11 = a2;
                }
                oi0.a(oi0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f28228a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f28228a = null;
        }
        this.f28231f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f28232g = this.f28231f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f28228a = Bitmap.createBitmap((int) (this.f28232g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f28229b = new Canvas(this.f28228a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
