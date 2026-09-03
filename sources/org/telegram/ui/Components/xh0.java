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
public final class xh0 implements zh0 {
    public Bitmap f30643a;
    public Canvas f30644b;
    public final Paint f30645c;
    public final Paint d;
    public int e;
    public int f30646f;
    public int f30647g;
    public int h;
    public final ai0 f30648i;

    public xh0(ai0 ai0Var) {
        this.f30648i = ai0Var;
        Paint paint = new Paint();
        this.f30645c = paint;
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
    public final void c(ev evVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        ai0 ai0Var = (ai0) evVar.f24700b;
        ai0 ai0Var2 = this.f30648i;
        Paint paint = ai0Var2.f23377a;
        Bitmap bitmap = this.f30643a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((k7.n.a(ai0Var2.f23380f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (ai0Var2.getWidth() - this.f30646f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f30643a.eraseColor(0);
                this.f30644b.save();
                this.f30644b.scale(this.f30643a.getWidth() / this.f30647g, this.f30643a.getHeight() / this.h);
                float f10 = -width;
                this.f30644b.translate(f10, 0.0f);
                ai0.a(ai0Var, this.f30644b);
                this.f30644b.restore();
                this.f30644b.save();
                this.f30644b.scale(this.f30643a.getWidth() / this.f30647g, this.f30643a.getHeight() / this.h);
                if (ai0Var2.f23381n != null) {
                    this.f30644b.save();
                    this.f30644b.translate(f10, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = ai0Var2.f23381n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f30644b;
                        float centerX = ai0Var2.f23381n.bounds.centerX();
                        RectF rectF = ai0Var2.f23381n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), ai0Var2.f23381n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f30644b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), ai0Var2.f23381n.bounds.height()) / 2.0f;
                        this.f30644b.drawRoundRect(ai0Var2.f23381n.bounds, max, max, paint);
                    }
                    this.f30644b.restore();
                } else {
                    this.f30644b.drawRect(0.0f, 0.0f, this.f30646f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f30644b.restore();
                Utilities.stackBlurBitmap(this.f30643a, (int) ((ai0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f30647g, this.h, null);
                canvas2.scale(this.f30647g / this.f30643a.getWidth(), this.h / this.f30643a.getHeight());
                canvas2.drawBitmap(this.f30643a, 0.0f, 0.0f, this.f30645c);
                canvas2.drawBitmap(this.f30643a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f30646f, this.e, i11);
                } else {
                    i11 = a2;
                }
                ai0.a(ai0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f30643a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f30643a = null;
        }
        this.f30646f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f30647g = this.f30646f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f30643a = Bitmap.createBitmap((int) (this.f30647g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f30644b = new Canvas(this.f30643a);
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void b(float f10) {
    }
}
