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
public final class yh0 implements ai0 {
    public Bitmap f33537a;
    public Canvas f33538b;
    public final Paint f33539c;
    public final Paint d;
    public int f33540e;
    public int f33541f;
    public int f33542g;
    public int h;
    public final bi0 f33543i;

    public yh0(bi0 bi0Var) {
        this.f33543i = bi0Var;
        Paint paint = new Paint();
        this.f33539c = paint;
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
    public final void c(hv hvVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        bi0 bi0Var = (bi0) hvVar.f27638b;
        bi0 bi0Var2 = this.f33543i;
        Paint paint = bi0Var2.f25606a;
        Bitmap bitmap = this.f33537a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((k7.o.a(bi0Var2.f25610f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (bi0Var2.getWidth() - this.f33541f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f33537a.eraseColor(0);
                this.f33538b.save();
                this.f33538b.scale(this.f33537a.getWidth() / this.f33542g, this.f33537a.getHeight() / this.h);
                float f10 = -width;
                this.f33538b.translate(f10, 0.0f);
                bi0.a(bi0Var, this.f33538b);
                this.f33538b.restore();
                this.f33538b.save();
                this.f33538b.scale(this.f33537a.getWidth() / this.f33542g, this.f33537a.getHeight() / this.h);
                if (bi0Var2.f25611n != null) {
                    this.f33538b.save();
                    this.f33538b.translate(f10, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = bi0Var2.f25611n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f33538b;
                        float centerX = bi0Var2.f25611n.bounds.centerX();
                        RectF rectF = bi0Var2.f25611n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), bi0Var2.f25611n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f33538b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), bi0Var2.f25611n.bounds.height()) / 2.0f;
                        this.f33538b.drawRoundRect(bi0Var2.f25611n.bounds, max, max, paint);
                    }
                    this.f33538b.restore();
                } else {
                    this.f33538b.drawRect(0.0f, 0.0f, this.f33541f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f33538b.restore();
                Utilities.stackBlurBitmap(this.f33537a, (int) ((bi0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f33542g, this.h, null);
                canvas2.scale(this.f33542g / this.f33537a.getWidth(), this.h / this.f33537a.getHeight());
                canvas2.drawBitmap(this.f33537a, 0.0f, 0.0f, this.f33539c);
                canvas2.drawBitmap(this.f33537a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f33541f, this.f33540e, i11);
                } else {
                    i11 = a2;
                }
                bi0.a(bi0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f33537a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f33537a = null;
        }
        this.f33541f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.f33540e = min;
        this.f33542g = this.f33541f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f33537a = Bitmap.createBitmap((int) (this.f33542g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f33538b = new Canvas(this.f33537a);
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void b(float f10) {
    }
}
