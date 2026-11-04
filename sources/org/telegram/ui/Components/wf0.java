package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class wf0 implements yf0 {
    public Bitmap f39997a;
    public Canvas f39998b;
    public final Paint f39999c;
    public final Paint d;
    public int f40000e;
    public int f40001f;
    public int f40002g;
    public int h;
    public final zf0 f40003i;

    public wf0(zf0 zf0Var) {
        this.f40003i = zf0Var;
        Paint paint = new Paint();
        this.f39999c = paint;
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
    public final void b(zw zwVar, Canvas canvas) {
        Canvas canvas2;
        int i3;
        int i10;
        zf0 zf0Var = (zf0) zwVar.f41140b;
        zf0 zf0Var2 = this.f40003i;
        Paint paint = zf0Var2.f41034a;
        Bitmap bitmap = this.f39997a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a10 = (int) ((1.0f - ((b8.be.a(zf0Var2.f41038f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (zf0Var2.getWidth() - this.f40001f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -org.telegram.messenger.g0.L(32.0f));
            if (a10 != 255) {
                this.f39997a.eraseColor(0);
                this.f39998b.save();
                this.f39998b.scale(this.f39997a.getWidth() / this.f40002g, this.f39997a.getHeight() / this.h);
                float f10 = -width;
                this.f39998b.translate(f10, 0.0f);
                zf0.a(zf0Var, this.f39998b);
                this.f39998b.restore();
                this.f39998b.save();
                this.f39998b.scale(this.f39997a.getWidth() / this.f40002g, this.f39997a.getHeight() / this.h);
                if (zf0Var2.f41039n != null) {
                    this.f39998b.save();
                    this.f39998b.translate(f10, org.telegram.messenger.g0.L(32.0f));
                    org.telegram.messenger.tr trVar = zf0Var2.f41039n;
                    if (trVar.f25585c) {
                        Canvas canvas3 = this.f39998b;
                        float centerX = zf0Var2.f41039n.f25586e.centerX();
                        RectF rectF = zf0Var2.f41039n.f25586e;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(trVar.f25586e.width(), zf0Var2.f41039n.f25586e.height()) / 2.0f, paint);
                    } else if (trVar.f25584b) {
                        this.f39998b.drawPath(trVar.d, paint);
                    } else {
                        float max = Math.max(trVar.f25586e.width(), zf0Var2.f41039n.f25586e.height()) / 2.0f;
                        this.f39998b.drawRoundRect(zf0Var2.f41039n.f25586e, max, max, paint);
                    }
                    this.f39998b.restore();
                } else {
                    this.f39998b.drawRect(0.0f, 0.0f, this.f40001f, org.telegram.messenger.g0.L(32.0f), paint);
                }
                this.f39998b.restore();
                Utilities.stackBlurBitmap(this.f39997a, (int) ((zf0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i3 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f40002g, this.h, null);
                canvas2.scale(this.f40002g / this.f39997a.getWidth(), this.h / this.f39997a.getHeight());
                canvas2.drawBitmap(this.f39997a, 0.0f, 0.0f, this.f39999c);
                canvas2.drawBitmap(this.f39997a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i3 = 255;
            }
            if (a10 != 0) {
                if (a10 != i3) {
                    i10 = a10;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f40001f, this.f40000e, i10);
                } else {
                    i10 = a10;
                }
                zf0.a(zf0Var, canvas2);
                if (i10 != i3) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i3, int i10) {
        Bitmap bitmap = this.f39997a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f39997a = null;
        }
        this.f40001f = Math.min(org.telegram.messenger.g0.L(120.0f), i3);
        int min = Math.min(org.telegram.messenger.g0.L(220.0f), i10);
        this.f40000e = min;
        this.f40002g = this.f40001f;
        int L = org.telegram.messenger.g0.L(32.0f) + min;
        this.h = L;
        this.f39997a = Bitmap.createBitmap((int) (this.f40002g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.f39998b = new Canvas(this.f39997a);
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void c(float f10) {
    }
}
