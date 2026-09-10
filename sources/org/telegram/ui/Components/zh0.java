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
    public Bitmap f29689a;
    public Canvas f29690b;
    public final Paint f29691c;
    public final Paint d;
    public int e;
    public int f29692f;
    public int f29693g;
    public int h;
    public final ci0 f29694i;

    public zh0(ci0 ci0Var) {
        this.f29694i = ci0Var;
        Paint paint = new Paint();
        this.f29691c = paint;
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
        ci0 ci0Var = (ci0) pvVar.f26252b;
        ci0 ci0Var2 = this.f29694i;
        Paint paint = ci0Var2.f22133a;
        Bitmap bitmap = this.f29689a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.q.a(ci0Var2.f22136f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (ci0Var2.getWidth() - this.f29692f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f29689a.eraseColor(0);
                this.f29690b.save();
                this.f29690b.scale(this.f29689a.getWidth() / this.f29693g, this.f29689a.getHeight() / this.h);
                float f7 = -width;
                this.f29690b.translate(f7, 0.0f);
                ci0.a(ci0Var, this.f29690b);
                this.f29690b.restore();
                this.f29690b.save();
                this.f29690b.scale(this.f29689a.getWidth() / this.f29693g, this.f29689a.getHeight() / this.h);
                if (ci0Var2.f22137n != null) {
                    this.f29690b.save();
                    this.f29690b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = ci0Var2.f22137n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f29690b;
                        float centerX = ci0Var2.f22137n.bounds.centerX();
                        RectF rectF = ci0Var2.f22137n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), ci0Var2.f22137n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f29690b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), ci0Var2.f22137n.bounds.height()) / 2.0f;
                        this.f29690b.drawRoundRect(ci0Var2.f22137n.bounds, max, max, paint);
                    }
                    this.f29690b.restore();
                } else {
                    this.f29690b.drawRect(0.0f, 0.0f, this.f29692f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f29690b.restore();
                Utilities.stackBlurBitmap(this.f29689a, (int) ((ci0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f29693g, this.h, null);
                canvas2.scale(this.f29693g / this.f29689a.getWidth(), this.h / this.f29689a.getHeight());
                canvas2.drawBitmap(this.f29689a, 0.0f, 0.0f, this.f29691c);
                canvas2.drawBitmap(this.f29689a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f29692f, this.e, i11);
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
        Bitmap bitmap = this.f29689a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f29689a = null;
        }
        this.f29692f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f29693g = this.f29692f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f29689a = Bitmap.createBitmap((int) (this.f29693g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f29690b = new Canvas(this.f29689a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
