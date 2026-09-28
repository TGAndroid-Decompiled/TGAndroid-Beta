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
public final class ci0 implements ei0 {
    public Bitmap f23315a;
    public Canvas f23316b;
    public final Paint f23317c;
    public final Paint d;
    public int e;
    public int f23318f;
    public int f23319g;
    public int h;
    public final fi0 f23320i;

    public ci0(fi0 fi0Var) {
        this.f23320i = fi0Var;
        Paint paint = new Paint();
        this.f23317c = paint;
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
    public final void c(nv nvVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        fi0 fi0Var = (fi0) nvVar.f26864b;
        fi0 fi0Var2 = this.f23320i;
        Paint paint = fi0Var2.f24250a;
        Bitmap bitmap = this.f23315a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.q.a(fi0Var2.f24253f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (fi0Var2.getWidth() - this.f23318f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f23315a.eraseColor(0);
                this.f23316b.save();
                this.f23316b.scale(this.f23315a.getWidth() / this.f23319g, this.f23315a.getHeight() / this.h);
                float f7 = -width;
                this.f23316b.translate(f7, 0.0f);
                fi0.a(fi0Var, this.f23316b);
                this.f23316b.restore();
                this.f23316b.save();
                this.f23316b.scale(this.f23315a.getWidth() / this.f23319g, this.f23315a.getHeight() / this.h);
                if (fi0Var2.f24254n != null) {
                    this.f23316b.save();
                    this.f23316b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = fi0Var2.f24254n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f23316b;
                        float centerX = fi0Var2.f24254n.bounds.centerX();
                        RectF rectF = fi0Var2.f24254n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), fi0Var2.f24254n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f23316b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), fi0Var2.f24254n.bounds.height()) / 2.0f;
                        this.f23316b.drawRoundRect(fi0Var2.f24254n.bounds, max, max, paint);
                    }
                    this.f23316b.restore();
                } else {
                    this.f23316b.drawRect(0.0f, 0.0f, this.f23318f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f23316b.restore();
                Utilities.stackBlurBitmap(this.f23315a, (int) ((fi0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f23319g, this.h, null);
                canvas2.scale(this.f23319g / this.f23315a.getWidth(), this.h / this.f23315a.getHeight());
                canvas2.drawBitmap(this.f23315a, 0.0f, 0.0f, this.f23317c);
                canvas2.drawBitmap(this.f23315a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f23318f, this.e, i11);
                } else {
                    i11 = a2;
                }
                fi0.a(fi0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f23315a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f23315a = null;
        }
        this.f23318f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f23319g = this.f23318f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f23315a = Bitmap.createBitmap((int) (this.f23319g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f23316b = new Canvas(this.f23315a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
