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
public final class bi0 implements di0 {
    public Bitmap f23029a;
    public Canvas f23030b;
    public final Paint f23031c;
    public final Paint d;
    public int e;
    public int f23032f;
    public int f23033g;
    public int h;
    public final ei0 f23034i;

    public bi0(ei0 ei0Var) {
        this.f23034i = ei0Var;
        Paint paint = new Paint();
        this.f23031c = paint;
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
    public final void c(nv nvVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        ei0 ei0Var = (ei0) nvVar.f26880b;
        ei0 ei0Var2 = this.f23034i;
        Paint paint = ei0Var2.f23944a;
        Bitmap bitmap = this.f23029a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.q.a(ei0Var2.f23947f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (ei0Var2.getWidth() - this.f23032f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (a2 != 255) {
                this.f23029a.eraseColor(0);
                this.f23030b.save();
                this.f23030b.scale(this.f23029a.getWidth() / this.f23033g, this.f23029a.getHeight() / this.h);
                float f7 = -width;
                this.f23030b.translate(f7, 0.0f);
                ei0.a(ei0Var, this.f23030b);
                this.f23030b.restore();
                this.f23030b.save();
                this.f23030b.scale(this.f23029a.getWidth() / this.f23033g, this.f23029a.getHeight() / this.h);
                if (ei0Var2.f23948n != null) {
                    this.f23030b.save();
                    this.f23030b.translate(f7, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo = ei0Var2.f23948n;
                    if (notchInfo.isLikelyCircle) {
                        Canvas canvas3 = this.f23030b;
                        float centerX = ei0Var2.f23948n.bounds.centerX();
                        RectF rectF = ei0Var2.f23948n.bounds;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(notchInfo.bounds.width(), ei0Var2.f23948n.bounds.height()) / 2.0f, paint);
                    } else if (notchInfo.isAccurate) {
                        this.f23030b.drawPath(notchInfo.path, paint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), ei0Var2.f23948n.bounds.height()) / 2.0f;
                        this.f23030b.drawRoundRect(ei0Var2.f23948n.bounds, max, max, paint);
                    }
                    this.f23030b.restore();
                } else {
                    this.f23030b.drawRect(0.0f, 0.0f, this.f23032f, AndroidUtilities.dp(32.0f), paint);
                }
                this.f23030b.restore();
                Utilities.stackBlurBitmap(this.f23029a, (int) ((ei0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f23033g, this.h, null);
                canvas2.scale(this.f23033g / this.f23029a.getWidth(), this.h / this.f23029a.getHeight());
                canvas2.drawBitmap(this.f23029a, 0.0f, 0.0f, this.f23031c);
                canvas2.drawBitmap(this.f23029a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f23032f, this.e, i11);
                } else {
                    i11 = a2;
                }
                ei0.a(ei0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f23029a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f23029a = null;
        }
        this.f23032f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.f23033g = this.f23032f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.f23029a = Bitmap.createBitmap((int) (this.f23033g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f23030b = new Canvas(this.f23029a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(float f7) {
    }
}
