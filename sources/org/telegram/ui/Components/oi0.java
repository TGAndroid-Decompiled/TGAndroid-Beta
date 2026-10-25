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
    public Bitmap f31306a;
    public Canvas f31307b;
    public final Paint f31308c;
    public final Paint d;
    public int e;
    public int f31309f;
    public int f31310g;
    public int h;
    public final ri0 f31311i;

    public oi0(ri0 ri0Var) {
        this.f31311i = ri0Var;
        Paint paint = new Paint();
        this.f31308c = paint;
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
        ri0 ri0Var = (ri0) tvVar.f33164b;
        ri0 ri0Var2 = this.f31311i;
        Paint paint = ri0Var2.f32250a;
        Bitmap bitmap = this.f31306a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((a8.ee.a(ri0Var2.f32253f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (ri0Var2.getWidth() - this.f31309f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f31306a.eraseColor(0);
                this.f31307b.save();
                this.f31307b.scale(this.f31306a.getWidth() / this.f31310g, this.f31306a.getHeight() / this.h);
                float f7 = -width;
                this.f31307b.translate(f7, 0.0f);
                ri0.a(ri0Var, this.f31307b);
                this.f31307b.restore();
                this.f31307b.save();
                this.f31307b.scale(this.f31306a.getWidth() / this.f31310g, this.f31306a.getHeight() / this.h);
                if (ri0Var2.f32254n != null) {
                    this.f31307b.save();
                    this.f31307b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = ri0Var2.f32254n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f31307b;
                        float centerX = ri0Var2.f32254n.bounds.centerX();
                        RectF rectF = ri0Var2.f32254n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), ri0Var2.f32254n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f31307b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), ri0Var2.f32254n.bounds.height()) / 2.0f;
                        this.f31307b.drawRoundRect(ri0Var2.f32254n.bounds, max, max, paint);
                    }
                    this.f31307b.restore();
                } else {
                    this.f31307b.drawRect(0.0f, 0.0f, this.f31309f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f31307b.restore();
                Utilities.stackBlurBitmap(this.f31306a, (int) ((ri0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f31310g, this.h, null);
                canvas2.scale(this.f31310g / this.f31306a.getWidth(), this.h / this.f31306a.getHeight());
                canvas2.drawBitmap(this.f31306a, 0.0f, 0.0f, this.f31308c);
                canvas2.drawBitmap(this.f31306a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f31309f, this.e, i11);
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
        Bitmap bitmap = this.f31306a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f31306a = null;
        }
        this.f31309f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f31310g = this.f31309f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f31306a = Bitmap.createBitmap((int) (this.f31310g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f31307b = new Canvas(this.f31306a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
