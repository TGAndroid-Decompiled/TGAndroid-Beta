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
    public Bitmap f27352a;
    public Canvas f27353b;
    public final Paint f27354c;
    public final Paint d;
    public int e;
    public int f27355f;
    public int f27356g;
    public int h;
    public final th0 f27357i;

    public qh0(th0 th0Var) {
        this.f27357i = th0Var;
        Paint paint = new Paint();
        this.f27354c = paint;
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
    public final void c(mv mvVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        th0 th0Var = (th0) mvVar.f26280b;
        th0 th0Var2 = this.f27357i;
        Paint paint = th0Var2.f28191a;
        Bitmap bitmap = this.f27352a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.p.a(th0Var2.f28194f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (th0Var2.getWidth() - this.f27355f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f27352a.eraseColor(0);
                this.f27353b.save();
                this.f27353b.scale(this.f27352a.getWidth() / this.f27356g, this.f27352a.getHeight() / this.h);
                float f7 = -width;
                this.f27353b.translate(f7, 0.0f);
                th0.a(th0Var, this.f27353b);
                this.f27353b.restore();
                this.f27353b.save();
                this.f27353b.scale(this.f27352a.getWidth() / this.f27356g, this.f27352a.getHeight() / this.h);
                if (th0Var2.f28195n != null) {
                    this.f27353b.save();
                    this.f27353b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = th0Var2.f28195n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f27353b;
                        float centerX = th0Var2.f28195n.bounds.centerX();
                        RectF rectF = th0Var2.f28195n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), th0Var2.f28195n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f27353b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), th0Var2.f28195n.bounds.height()) / 2.0f;
                        this.f27353b.drawRoundRect(th0Var2.f28195n.bounds, max, max, paint);
                    }
                    this.f27353b.restore();
                } else {
                    this.f27353b.drawRect(0.0f, 0.0f, this.f27355f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f27353b.restore();
                Utilities.stackBlurBitmap(this.f27352a, (int) ((th0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f27356g, this.h, null);
                canvas2.scale(this.f27356g / this.f27352a.getWidth(), this.h / this.f27352a.getHeight());
                canvas2.drawBitmap(this.f27352a, 0.0f, 0.0f, this.f27354c);
                canvas2.drawBitmap(this.f27352a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f27355f, this.e, i11);
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
        Bitmap bitmap = this.f27352a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f27352a = null;
        }
        this.f27355f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f27356g = this.f27355f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f27352a = Bitmap.createBitmap((int) (this.f27356g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f27353b = new Canvas(this.f27352a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
