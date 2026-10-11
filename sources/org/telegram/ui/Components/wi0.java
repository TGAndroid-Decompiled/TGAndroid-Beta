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
public final class wi0 implements yi0 {
    public Bitmap f32647a;
    public Canvas f32648b;
    public final Paint f32649c;
    public final Paint d;
    public int f32650e;
    public int f32651f;
    public int f32652g;
    public int h;
    public final zi0 f32653i;

    public wi0(zi0 zi0Var) {
        this.f32653i = zi0Var;
        Paint paint = new Paint();
        this.f32649c = paint;
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
    public final void c(cw cwVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        zi0 zi0Var = (zi0) cwVar.f25331b;
        zi0 zi0Var2 = this.f32653i;
        Paint paint = zi0Var2.f33541a;
        Bitmap bitmap = this.f32647a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.o.a(zi0Var2.f33545f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (zi0Var2.getWidth() - this.f32651f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f32647a.eraseColor(0);
                this.f32648b.save();
                this.f32648b.scale(this.f32647a.getWidth() / this.f32652g, this.f32647a.getHeight() / this.h);
                float f7 = -width;
                this.f32648b.translate(f7, 0.0f);
                zi0.a(zi0Var, this.f32648b);
                this.f32648b.restore();
                this.f32648b.save();
                this.f32648b.scale(this.f32647a.getWidth() / this.f32652g, this.f32647a.getHeight() / this.h);
                if (zi0Var2.f33546n != null) {
                    this.f32648b.save();
                    this.f32648b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = zi0Var2.f33546n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f32648b;
                        float centerX = zi0Var2.f33546n.bounds.centerX();
                        RectF rectF = zi0Var2.f33546n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), zi0Var2.f33546n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f32648b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), zi0Var2.f33546n.bounds.height()) / 2.0f;
                        this.f32648b.drawRoundRect(zi0Var2.f33546n.bounds, max, max, paint);
                    }
                    this.f32648b.restore();
                } else {
                    this.f32648b.drawRect(0.0f, 0.0f, this.f32651f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f32648b.restore();
                Utilities.stackBlurBitmap(this.f32647a, (int) ((zi0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f32652g, this.h, null);
                canvas2.scale(this.f32652g / this.f32647a.getWidth(), this.h / this.f32647a.getHeight());
                canvas2.drawBitmap(this.f32647a, 0.0f, 0.0f, this.f32649c);
                canvas2.drawBitmap(this.f32647a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f32651f, this.f32650e, i11);
                } else {
                    i11 = a2;
                }
                zi0.a(zi0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f32647a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f32647a = null;
        }
        this.f32651f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.f32650e = min;
        this.f32652g = this.f32651f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f32647a = Bitmap.createBitmap((int) (this.f32652g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f32648b = new Canvas(this.f32647a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
