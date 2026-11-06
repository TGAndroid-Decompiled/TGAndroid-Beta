package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class tf0 implements vf0 {
    public Bitmap f38324a;
    public Canvas f38325b;
    public final Paint f38326c;
    public final Paint d;
    public int f38327e;
    public int f38328f;
    public int f38329g;
    public int h;
    public final wf0 f38330i;

    public tf0(wf0 wf0Var) {
        this.f38330i = wf0Var;
        Paint paint = new Paint();
        this.f38326c = paint;
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
    public final void b(ax axVar, Canvas canvas) {
        Canvas canvas2;
        int i7;
        int i10;
        wf0 wf0Var = (wf0) axVar.f31941b;
        wf0 wf0Var2 = this.f38330i;
        Paint paint = wf0Var2.f39958a;
        Bitmap bitmap = this.f38324a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a10 = (int) ((1.0f - ((c8.j9.a(wf0Var2.f39962f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (wf0Var2.getWidth() - this.f38328f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -org.telegram.messenger.g0.L(32.0f));
            if (a10 != 255) {
                this.f38324a.eraseColor(0);
                this.f38325b.save();
                this.f38325b.scale(this.f38324a.getWidth() / this.f38329g, this.f38324a.getHeight() / this.h);
                float f10 = -width;
                this.f38325b.translate(f10, 0.0f);
                wf0.a(wf0Var, this.f38325b);
                this.f38325b.restore();
                this.f38325b.save();
                this.f38325b.scale(this.f38324a.getWidth() / this.f38329g, this.f38324a.getHeight() / this.h);
                if (wf0Var2.f39963n != null) {
                    this.f38325b.save();
                    this.f38325b.translate(f10, org.telegram.messenger.g0.L(32.0f));
                    org.telegram.messenger.bs bsVar = wf0Var2.f39963n;
                    if (bsVar.f21691c) {
                        Canvas canvas3 = this.f38325b;
                        float centerX = wf0Var2.f39963n.f21692e.centerX();
                        RectF rectF = wf0Var2.f39963n.f21692e;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(bsVar.f21692e.width(), wf0Var2.f39963n.f21692e.height()) / 2.0f, paint);
                    } else if (bsVar.f21690b) {
                        this.f38325b.drawPath(bsVar.d, paint);
                    } else {
                        float max = Math.max(bsVar.f21692e.width(), wf0Var2.f39963n.f21692e.height()) / 2.0f;
                        this.f38325b.drawRoundRect(wf0Var2.f39963n.f21692e, max, max, paint);
                    }
                    this.f38325b.restore();
                } else {
                    this.f38325b.drawRect(0.0f, 0.0f, this.f38328f, org.telegram.messenger.g0.L(32.0f), paint);
                }
                this.f38325b.restore();
                Utilities.stackBlurBitmap(this.f38324a, (int) ((wf0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i7 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f38329g, this.h, null);
                canvas2.scale(this.f38329g / this.f38324a.getWidth(), this.h / this.f38324a.getHeight());
                canvas2.drawBitmap(this.f38324a, 0.0f, 0.0f, this.f38326c);
                canvas2.drawBitmap(this.f38324a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i7 = 255;
            }
            if (a10 != 0) {
                if (a10 != i7) {
                    i10 = a10;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f38328f, this.f38327e, i10);
                } else {
                    i10 = a10;
                }
                wf0.a(wf0Var, canvas2);
                if (i10 != i7) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i7, int i10) {
        Bitmap bitmap = this.f38324a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f38324a = null;
        }
        this.f38328f = Math.min(org.telegram.messenger.g0.L(120.0f), i7);
        int min = Math.min(org.telegram.messenger.g0.L(220.0f), i10);
        this.f38327e = min;
        this.f38329g = this.f38328f;
        int L = org.telegram.messenger.g0.L(32.0f) + min;
        this.h = L;
        this.f38324a = Bitmap.createBitmap((int) (this.f38329g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.f38325b = new Canvas(this.f38324a);
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void c(float f10) {
    }
}
