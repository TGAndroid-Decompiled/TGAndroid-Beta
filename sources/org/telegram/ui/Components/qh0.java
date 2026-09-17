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
public final class qh0 implements sh0 {
    public Bitmap f27311a;
    public Canvas f27312b;
    public final Paint f27313c;
    public final Paint d;
    public int e;
    public int f27314f;
    public int f27315g;
    public int h;
    public final th0 f27316i;

    public qh0(th0 th0Var) {
        this.f27316i = th0Var;
        Paint paint = new Paint();
        this.f27313c = paint;
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
    public final void c(lv lvVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        th0 th0Var = (th0) lvVar.f25976b;
        th0 th0Var2 = this.f27316i;
        Paint paint = th0Var2.f28099a;
        Bitmap bitmap = this.f27311a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.p.a(th0Var2.f28102f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (th0Var2.getWidth() - this.f27314f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f27311a.eraseColor(0);
                this.f27312b.save();
                this.f27312b.scale(this.f27311a.getWidth() / this.f27315g, this.f27311a.getHeight() / this.h);
                float f7 = -width;
                this.f27312b.translate(f7, 0.0f);
                th0.a(th0Var, this.f27312b);
                this.f27312b.restore();
                this.f27312b.save();
                this.f27312b.scale(this.f27311a.getWidth() / this.f27315g, this.f27311a.getHeight() / this.h);
                if (th0Var2.f28103n != null) {
                    this.f27312b.save();
                    this.f27312b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = th0Var2.f28103n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f27312b;
                        float centerX = th0Var2.f28103n.bounds.centerX();
                        RectF rectF = th0Var2.f28103n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), th0Var2.f28103n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f27312b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), th0Var2.f28103n.bounds.height()) / 2.0f;
                        this.f27312b.drawRoundRect(th0Var2.f28103n.bounds, max, max, paint);
                    }
                    this.f27312b.restore();
                } else {
                    this.f27312b.drawRect(0.0f, 0.0f, this.f27314f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f27312b.restore();
                Utilities.stackBlurBitmap(this.f27311a, (int) ((th0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f27315g, this.h, null);
                canvas2.scale(this.f27315g / this.f27311a.getWidth(), this.h / this.f27311a.getHeight());
                canvas2.drawBitmap(this.f27311a, 0.0f, 0.0f, this.f27313c);
                canvas2.drawBitmap(this.f27311a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f27314f, this.e, i11);
                } else {
                    i11 = a2;
                }
                th0.a(th0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f27311a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f27311a = null;
        }
        this.f27314f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f27315g = this.f27314f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f27311a = Bitmap.createBitmap((int) (this.f27315g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f27312b = new Canvas(this.f27311a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
