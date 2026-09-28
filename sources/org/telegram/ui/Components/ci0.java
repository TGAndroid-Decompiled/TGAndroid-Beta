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
    public Bitmap f23314a;
    public Canvas f23315b;
    public final Paint f23316c;
    public final Paint d;
    public int e;
    public int f23317f;
    public int f23318g;
    public int h;
    public final fi0 f23319i;

    public ci0(fi0 fi0Var) {
        this.f23319i = fi0Var;
        Paint paint = new Paint();
        this.f23316c = paint;
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
        fi0 fi0Var = (fi0) nvVar.f26863b;
        fi0 fi0Var2 = this.f23319i;
        Paint paint = fi0Var2.f24249a;
        Bitmap bitmap = this.f23314a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.q.a(fi0Var2.f24252f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (fi0Var2.getWidth() - this.f23317f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f23314a.eraseColor(0);
                this.f23315b.save();
                this.f23315b.scale(this.f23314a.getWidth() / this.f23318g, this.f23314a.getHeight() / this.h);
                float f7 = -width;
                this.f23315b.translate(f7, 0.0f);
                fi0.a(fi0Var, this.f23315b);
                this.f23315b.restore();
                this.f23315b.save();
                this.f23315b.scale(this.f23314a.getWidth() / this.f23318g, this.f23314a.getHeight() / this.h);
                if (fi0Var2.f24253n != null) {
                    this.f23315b.save();
                    this.f23315b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = fi0Var2.f24253n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f23315b;
                        float centerX = fi0Var2.f24253n.bounds.centerX();
                        RectF rectF = fi0Var2.f24253n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), fi0Var2.f24253n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f23315b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), fi0Var2.f24253n.bounds.height()) / 2.0f;
                        this.f23315b.drawRoundRect(fi0Var2.f24253n.bounds, max, max, paint);
                    }
                    this.f23315b.restore();
                } else {
                    this.f23315b.drawRect(0.0f, 0.0f, this.f23317f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f23315b.restore();
                Utilities.stackBlurBitmap(this.f23314a, (int) ((fi0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f23318g, this.h, null);
                canvas2.scale(this.f23318g / this.f23314a.getWidth(), this.h / this.f23314a.getHeight());
                canvas2.drawBitmap(this.f23314a, 0.0f, 0.0f, this.f23316c);
                canvas2.drawBitmap(this.f23314a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f23317f, this.e, i11);
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
        Bitmap bitmap = this.f23314a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f23314a = null;
        }
        this.f23317f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f23318g = this.f23317f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f23314a = Bitmap.createBitmap((int) (this.f23318g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f23315b = new Canvas(this.f23314a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
