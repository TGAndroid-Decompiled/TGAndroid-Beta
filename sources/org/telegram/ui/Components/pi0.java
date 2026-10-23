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
public final class pi0 implements ri0 {
    public Bitmap f29570a;
    public Canvas f29571b;
    public final Paint f29572c;
    public final Paint d;
    public int e;
    public int f29573f;
    public int f29574g;
    public int h;
    public final si0 f29575i;

    public pi0(si0 si0Var) {
        this.f29575i = si0Var;
        Paint paint = new Paint();
        this.f29572c = paint;
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
    public final void c(tv tvVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        si0 si0Var = (si0) tvVar.f30915b;
        si0 si0Var2 = this.f29575i;
        Paint paint = si0Var2.f30499a;
        Bitmap bitmap = this.f29570a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.r.a(si0Var2.f30502f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (si0Var2.getWidth() - this.f29573f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f29570a.eraseColor(0);
                this.f29571b.save();
                this.f29571b.scale(this.f29570a.getWidth() / this.f29574g, this.f29570a.getHeight() / this.h);
                float f7 = -width;
                this.f29571b.translate(f7, 0.0f);
                si0.a(si0Var, this.f29571b);
                this.f29571b.restore();
                this.f29571b.save();
                this.f29571b.scale(this.f29570a.getWidth() / this.f29574g, this.f29570a.getHeight() / this.h);
                if (si0Var2.f30503n != null) {
                    this.f29571b.save();
                    this.f29571b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = si0Var2.f30503n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f29571b;
                        float centerX = si0Var2.f30503n.bounds.centerX();
                        RectF rectF = si0Var2.f30503n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), si0Var2.f30503n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f29571b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), si0Var2.f30503n.bounds.height()) / 2.0f;
                        this.f29571b.drawRoundRect(si0Var2.f30503n.bounds, max, max, paint);
                    }
                    this.f29571b.restore();
                } else {
                    this.f29571b.drawRect(0.0f, 0.0f, this.f29573f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f29571b.restore();
                Utilities.stackBlurBitmap(this.f29570a, (int) ((si0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f29574g, this.h, null);
                canvas2.scale(this.f29574g / this.f29570a.getWidth(), this.h / this.f29570a.getHeight());
                canvas2.drawBitmap(this.f29570a, 0.0f, 0.0f, this.f29572c);
                canvas2.drawBitmap(this.f29570a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f29573f, this.e, i11);
                } else {
                    i11 = a2;
                }
                si0.a(si0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f29570a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f29570a = null;
        }
        this.f29573f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f29574g = this.f29573f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f29570a = Bitmap.createBitmap((int) (this.f29574g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f29571b = new Canvas(this.f29570a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
