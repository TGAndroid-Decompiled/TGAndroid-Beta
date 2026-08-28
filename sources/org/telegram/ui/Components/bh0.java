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
public final class bh0 implements dh0 {
    public Bitmap f27208a;
    public Canvas f27209b;
    public final Paint f27210c;
    public final Paint d;
    public int f27211e;
    public int f27212f;
    public int f27213g;
    public int h;
    public final eh0 f27214i;

    public bh0(eh0 eh0Var) {
        this.f27214i = eh0Var;
        Paint paint = new Paint();
        this.f27210c = paint;
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
    public final void c(wu wuVar, Canvas canvas) {
        Canvas canvas2;
        int i9;
        int i10;
        eh0 eh0Var = (eh0) wuVar.f34373b;
        eh0 eh0Var2 = this.f27214i;
        Paint paint = eh0Var2.f28026a;
        Bitmap bitmap = this.f27208a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((g7.n.a(eh0Var2.f28030f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (eh0Var2.getWidth() - this.f27212f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f27208a.eraseColor(0);
                this.f27209b.save();
                this.f27209b.scale(this.f27208a.getWidth() / this.f27213g, this.f27208a.getHeight() / this.h);
                float f10 = -width;
                this.f27209b.translate(f10, 0.0f);
                eh0.a(eh0Var, this.f27209b);
                this.f27209b.restore();
                this.f27209b.save();
                this.f27209b.scale(this.f27208a.getWidth() / this.f27213g, this.f27208a.getHeight() / this.h);
                if (eh0Var2.f28031n != null) {
                    this.f27209b.save();
                    this.f27209b.translate(f10, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = eh0Var2.f28031n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f27209b;
                        float centerX = eh0Var2.f28031n.bounds.centerX();
                        RectF rectF = eh0Var2.f28031n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), eh0Var2.f28031n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f27209b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), eh0Var2.f28031n.bounds.height()) / 2.0f;
                        this.f27209b.drawRoundRect(eh0Var2.f28031n.bounds, max, max, paint);
                    }
                    this.f27209b.restore();
                } else {
                    this.f27209b.drawRect(0.0f, 0.0f, this.f27212f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f27209b.restore();
                Utilities.stackBlurBitmap(this.f27208a, (int) ((eh0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i9 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f27213g, this.h, null);
                canvas2.scale(this.f27213g / this.f27208a.getWidth(), this.h / this.f27208a.getHeight());
                canvas2.drawBitmap(this.f27208a, 0.0f, 0.0f, this.f27210c);
                canvas2.drawBitmap(this.f27208a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i9 = 255;
            }
            if (a2 != 0) {
                if (a2 != i9) {
                    i10 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f27212f, this.f27211e, i10);
                } else {
                    i10 = a2;
                }
                eh0.a(eh0Var, canvas2);
                if (i10 != i9) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i9, int i10) {
        Bitmap bitmap = this.f27208a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f27208a = null;
        }
        this.f27212f = Math.min(AndroidUtilities.dp(120.0f), i9);
        int min = Math.min(AndroidUtilities.dp(220.0f), i10);
        this.f27211e = min;
        this.f27213g = this.f27212f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f27208a = Bitmap.createBitmap((int) (this.f27213g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f27209b = new Canvas(this.f27208a);
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void b(float f10) {
    }
}
