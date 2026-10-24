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
public final class oi0 implements qi0 {
    public Bitmap f29298a;
    public Canvas f29299b;
    public final Paint f29300c;
    public final Paint d;
    public int e;
    public int f29301f;
    public int f29302g;
    public int h;
    public final ri0 f29303i;

    public oi0(ri0 ri0Var) {
        this.f29303i = ri0Var;
        Paint paint = new Paint();
        this.f29300c = paint;
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
    public final void c(rv rvVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        ri0 ri0Var = (ri0) rvVar.f30277b;
        ri0 ri0Var2 = this.f29303i;
        Paint paint = ri0Var2.f30213a;
        Bitmap bitmap = this.f29298a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.r.a(ri0Var2.f30216f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (ri0Var2.getWidth() - this.f29301f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f29298a.eraseColor(0);
                this.f29299b.save();
                this.f29299b.scale(this.f29298a.getWidth() / this.f29302g, this.f29298a.getHeight() / this.h);
                float f7 = -width;
                this.f29299b.translate(f7, 0.0f);
                ri0.a(ri0Var, this.f29299b);
                this.f29299b.restore();
                this.f29299b.save();
                this.f29299b.scale(this.f29298a.getWidth() / this.f29302g, this.f29298a.getHeight() / this.h);
                if (ri0Var2.f30217n != null) {
                    this.f29299b.save();
                    this.f29299b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = ri0Var2.f30217n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f29299b;
                        float centerX = ri0Var2.f30217n.bounds.centerX();
                        RectF rectF = ri0Var2.f30217n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), ri0Var2.f30217n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f29299b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), ri0Var2.f30217n.bounds.height()) / 2.0f;
                        this.f29299b.drawRoundRect(ri0Var2.f30217n.bounds, max, max, paint);
                    }
                    this.f29299b.restore();
                } else {
                    this.f29299b.drawRect(0.0f, 0.0f, this.f29301f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f29299b.restore();
                Utilities.stackBlurBitmap(this.f29298a, (int) ((ri0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f29302g, this.h, null);
                canvas2.scale(this.f29302g / this.f29298a.getWidth(), this.h / this.f29298a.getHeight());
                canvas2.drawBitmap(this.f29298a, 0.0f, 0.0f, this.f29300c);
                canvas2.drawBitmap(this.f29298a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f29301f, this.e, i11);
                } else {
                    i11 = a2;
                }
                ri0.a(ri0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f29298a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f29298a = null;
        }
        this.f29301f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f29302g = this.f29301f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f29298a = Bitmap.createBitmap((int) (this.f29302g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f29299b = new Canvas(this.f29298a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
