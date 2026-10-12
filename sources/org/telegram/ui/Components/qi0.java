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
public final class qi0 implements si0 {
    public Bitmap f28614a;
    public Canvas f28615b;
    public final Paint f28616c;
    public final Paint d;
    public int e;
    public int f28617f;
    public int f28618g;
    public int h;
    public final ti0 f28619i;

    public qi0(ti0 ti0Var) {
        this.f28619i = ti0Var;
        Paint paint = new Paint();
        this.f28616c = paint;
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
    public final void c(xv xvVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        ti0 ti0Var = (ti0) xvVar.f31335b;
        ti0 ti0Var2 = this.f28619i;
        Paint paint = ti0Var2.f29393a;
        Bitmap bitmap = this.f28614a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.s.a(ti0Var2.f29396f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (ti0Var2.getWidth() - this.f28617f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f28614a.eraseColor(0);
                this.f28615b.save();
                this.f28615b.scale(this.f28614a.getWidth() / this.f28618g, this.f28614a.getHeight() / this.h);
                float f7 = -width;
                this.f28615b.translate(f7, 0.0f);
                ti0.a(ti0Var, this.f28615b);
                this.f28615b.restore();
                this.f28615b.save();
                this.f28615b.scale(this.f28614a.getWidth() / this.f28618g, this.f28614a.getHeight() / this.h);
                if (ti0Var2.f29397n != null) {
                    this.f28615b.save();
                    this.f28615b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = ti0Var2.f29397n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f28615b;
                        float centerX = ti0Var2.f29397n.bounds.centerX();
                        RectF rectF = ti0Var2.f29397n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), ti0Var2.f29397n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f28615b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), ti0Var2.f29397n.bounds.height()) / 2.0f;
                        this.f28615b.drawRoundRect(ti0Var2.f29397n.bounds, max, max, paint);
                    }
                    this.f28615b.restore();
                } else {
                    this.f28615b.drawRect(0.0f, 0.0f, this.f28617f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f28615b.restore();
                Utilities.stackBlurBitmap(this.f28614a, (int) ((ti0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f28618g, this.h, null);
                canvas2.scale(this.f28618g / this.f28614a.getWidth(), this.h / this.f28614a.getHeight());
                canvas2.drawBitmap(this.f28614a, 0.0f, 0.0f, this.f28616c);
                canvas2.drawBitmap(this.f28614a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f28617f, this.e, i11);
                } else {
                    i11 = a2;
                }
                ti0.a(ti0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f28614a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f28614a = null;
        }
        this.f28617f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f28618g = this.f28617f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f28614a = Bitmap.createBitmap((int) (this.f28618g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f28615b = new Canvas(this.f28614a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
