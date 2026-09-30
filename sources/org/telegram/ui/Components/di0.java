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
public final class di0 implements fi0 {
    public Bitmap f23651a;
    public Canvas f23652b;
    public final Paint f23653c;
    public final Paint d;
    public int e;
    public int f23654f;
    public int f23655g;
    public int h;
    public final gi0 f23656i;

    public di0(gi0 gi0Var) {
        this.f23656i = gi0Var;
        Paint paint = new Paint();
        this.f23653c = paint;
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
    public final void c(ov ovVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        gi0 gi0Var = (gi0) ovVar.f27180b;
        gi0 gi0Var2 = this.f23656i;
        Paint paint = gi0Var2.f24571a;
        Bitmap bitmap = this.f23651a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.q.a(gi0Var2.f24574f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (gi0Var2.getWidth() - this.f23654f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f23651a.eraseColor(0);
                this.f23652b.save();
                this.f23652b.scale(this.f23651a.getWidth() / this.f23655g, this.f23651a.getHeight() / this.h);
                float f7 = -width;
                this.f23652b.translate(f7, 0.0f);
                gi0.a(gi0Var, this.f23652b);
                this.f23652b.restore();
                this.f23652b.save();
                this.f23652b.scale(this.f23651a.getWidth() / this.f23655g, this.f23651a.getHeight() / this.h);
                if (gi0Var2.f24575n != null) {
                    this.f23652b.save();
                    this.f23652b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = gi0Var2.f24575n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f23652b;
                        float centerX = gi0Var2.f24575n.bounds.centerX();
                        RectF rectF = gi0Var2.f24575n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), gi0Var2.f24575n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f23652b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), gi0Var2.f24575n.bounds.height()) / 2.0f;
                        this.f23652b.drawRoundRect(gi0Var2.f24575n.bounds, max, max, paint);
                    }
                    this.f23652b.restore();
                } else {
                    this.f23652b.drawRect(0.0f, 0.0f, this.f23654f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f23652b.restore();
                Utilities.stackBlurBitmap(this.f23651a, (int) ((gi0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f23655g, this.h, null);
                canvas2.scale(this.f23655g / this.f23651a.getWidth(), this.h / this.f23651a.getHeight());
                canvas2.drawBitmap(this.f23651a, 0.0f, 0.0f, this.f23653c);
                canvas2.drawBitmap(this.f23651a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f23654f, this.e, i11);
                } else {
                    i11 = a2;
                }
                gi0.a(gi0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f23651a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f23651a = null;
        }
        this.f23654f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f23655g = this.f23654f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f23651a = Bitmap.createBitmap((int) (this.f23655g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f23652b = new Canvas(this.f23651a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
