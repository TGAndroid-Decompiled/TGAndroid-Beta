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
    public Bitmap f32416a;
    public Canvas f32417b;
    public final Paint f32418c;
    public final Paint d;
    public int f32419e;
    public int f32420f;
    public int f32421g;
    public int h;
    public final zi0 f32422i;

    public wi0(zi0 zi0Var) {
        this.f32422i = zi0Var;
        Paint paint = new Paint();
        this.f32418c = paint;
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
    public final void c(ew ewVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        zi0 zi0Var = (zi0) ewVar.f25792b;
        zi0 zi0Var2 = this.f32422i;
        Paint paint = zi0Var2.f33383a;
        Bitmap bitmap = this.f32416a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.n.a(zi0Var2.f33387f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (zi0Var2.getWidth() - this.f32420f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f32416a.eraseColor(0);
                this.f32417b.save();
                this.f32417b.scale(this.f32416a.getWidth() / this.f32421g, this.f32416a.getHeight() / this.h);
                float f7 = -width;
                this.f32417b.translate(f7, 0.0f);
                zi0.a(zi0Var, this.f32417b);
                this.f32417b.restore();
                this.f32417b.save();
                this.f32417b.scale(this.f32416a.getWidth() / this.f32421g, this.f32416a.getHeight() / this.h);
                if (zi0Var2.f33388n != null) {
                    this.f32417b.save();
                    this.f32417b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = zi0Var2.f33388n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f32417b;
                        float centerX = zi0Var2.f33388n.bounds.centerX();
                        RectF rectF = zi0Var2.f33388n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), zi0Var2.f33388n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f32417b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), zi0Var2.f33388n.bounds.height()) / 2.0f;
                        this.f32417b.drawRoundRect(zi0Var2.f33388n.bounds, max, max, paint);
                    }
                    this.f32417b.restore();
                } else {
                    this.f32417b.drawRect(0.0f, 0.0f, this.f32420f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f32417b.restore();
                Utilities.stackBlurBitmap(this.f32416a, (int) ((zi0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f32421g, this.h, null);
                canvas2.scale(this.f32421g / this.f32416a.getWidth(), this.h / this.f32416a.getHeight());
                canvas2.drawBitmap(this.f32416a, 0.0f, 0.0f, this.f32418c);
                canvas2.drawBitmap(this.f32416a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f32420f, this.f32419e, i11);
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
        Bitmap bitmap = this.f32416a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f32416a = null;
        }
        this.f32420f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.f32419e = min;
        this.f32421g = this.f32420f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f32416a = Bitmap.createBitmap((int) (this.f32421g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f32417b = new Canvas(this.f32416a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
