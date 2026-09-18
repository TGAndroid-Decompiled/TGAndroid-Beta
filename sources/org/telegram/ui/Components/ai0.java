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
public final class ai0 implements ci0 {
    public Bitmap f22620a;
    public Canvas f22621b;
    public final Paint f22622c;
    public final Paint d;
    public int e;
    public int f22623f;
    public int f22624g;
    public int h;
    public final di0 f22625i;

    public ai0(di0 di0Var) {
        this.f22625i = di0Var;
        Paint paint = new Paint();
        this.f22622c = paint;
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
        di0 di0Var = (di0) lvVar.f26250b;
        di0 di0Var2 = this.f22625i;
        Paint paint = di0Var2.f23584a;
        Bitmap bitmap = this.f22620a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.q.a(di0Var2.f23587f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (di0Var2.getWidth() - this.f22623f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f22620a.eraseColor(0);
                this.f22621b.save();
                this.f22621b.scale(this.f22620a.getWidth() / this.f22624g, this.f22620a.getHeight() / this.h);
                float f7 = -width;
                this.f22621b.translate(f7, 0.0f);
                di0.a(di0Var, this.f22621b);
                this.f22621b.restore();
                this.f22621b.save();
                this.f22621b.scale(this.f22620a.getWidth() / this.f22624g, this.f22620a.getHeight() / this.h);
                if (di0Var2.f23588n != null) {
                    this.f22621b.save();
                    this.f22621b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = di0Var2.f23588n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f22621b;
                        float centerX = di0Var2.f23588n.bounds.centerX();
                        RectF rectF = di0Var2.f23588n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), di0Var2.f23588n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f22621b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), di0Var2.f23588n.bounds.height()) / 2.0f;
                        this.f22621b.drawRoundRect(di0Var2.f23588n.bounds, max, max, paint);
                    }
                    this.f22621b.restore();
                } else {
                    this.f22621b.drawRect(0.0f, 0.0f, this.f22623f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f22621b.restore();
                Utilities.stackBlurBitmap(this.f22620a, (int) ((di0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f22624g, this.h, null);
                canvas2.scale(this.f22624g / this.f22620a.getWidth(), this.h / this.f22620a.getHeight());
                canvas2.drawBitmap(this.f22620a, 0.0f, 0.0f, this.f22622c);
                canvas2.drawBitmap(this.f22620a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f22623f, this.e, i11);
                } else {
                    i11 = a2;
                }
                di0.a(di0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f22620a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f22620a = null;
        }
        this.f22623f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f22624g = this.f22623f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f22620a = Bitmap.createBitmap((int) (this.f22624g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f22621b = new Canvas(this.f22620a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
