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
    public Bitmap f41332a;
    public Canvas f41333b;
    public final Paint f41334c;
    public final Paint d;
    public int f41335e;
    public int f41336f;
    public int f41337g;
    public int h;
    public final zf0 f41338i;

    public wf0(zf0 zf0Var) {
        this.f41338i = zf0Var;
        Paint paint = new Paint();
        this.f41334c = paint;
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
    public final void b(gx gxVar, Canvas canvas) {
        Canvas canvas2;
        int i7;
        int i10;
        zf0 zf0Var = (zf0) gxVar.f35079b;
        zf0 zf0Var2 = this.f41338i;
        Paint paint = zf0Var2.f42352a;
        Bitmap bitmap = this.f41332a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a10 = (int) ((1.0f - ((c8.i9.a(zf0Var2.f42356f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (zf0Var2.getWidth() - this.f41336f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -org.telegram.messenger.g0.L(32.0f));
            if (a10 != 255) {
                this.f41332a.eraseColor(0);
                this.f41333b.save();
                this.f41333b.scale(this.f41332a.getWidth() / this.f41337g, this.f41332a.getHeight() / this.h);
                float f10 = -width;
                this.f41333b.translate(f10, 0.0f);
                zf0.a(zf0Var, this.f41333b);
                this.f41333b.restore();
                this.f41333b.save();
                this.f41333b.scale(this.f41332a.getWidth() / this.f41337g, this.f41332a.getHeight() / this.h);
                if (zf0Var2.f42357n != null) {
                    this.f41333b.save();
                    this.f41333b.translate(f10, org.telegram.messenger.g0.L(32.0f));
                    org.telegram.messenger.yr yrVar = zf0Var2.f42357n;
                    if (yrVar.f27808c) {
                        Canvas canvas3 = this.f41333b;
                        float centerX = zf0Var2.f42357n.f27809e.centerX();
                        RectF rectF = zf0Var2.f42357n.f27809e;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(yrVar.f27809e.width(), zf0Var2.f42357n.f27809e.height()) / 2.0f, paint);
                    } else if (yrVar.f27807b) {
                        this.f41333b.drawPath(yrVar.d, paint);
                    } else {
                        float max = Math.max(yrVar.f27809e.width(), zf0Var2.f42357n.f27809e.height()) / 2.0f;
                        this.f41333b.drawRoundRect(zf0Var2.f42357n.f27809e, max, max, paint);
                    }
                    this.f41333b.restore();
                } else {
                    this.f41333b.drawRect(0.0f, 0.0f, this.f41336f, org.telegram.messenger.g0.L(32.0f), paint);
                }
                this.f41333b.restore();
                Utilities.stackBlurBitmap(this.f41332a, (int) ((zf0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i7 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f41337g, this.h, null);
                canvas2.scale(this.f41337g / this.f41332a.getWidth(), this.h / this.f41332a.getHeight());
                canvas2.drawBitmap(this.f41332a, 0.0f, 0.0f, this.f41334c);
                canvas2.drawBitmap(this.f41332a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i7 = 255;
            }
            if (a10 != 0) {
                if (a10 != i7) {
                    i10 = a10;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f41336f, this.f41335e, i10);
                } else {
                    i10 = a10;
                }
                zf0.a(zf0Var, canvas2);
                if (i10 != i7) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i7, int i10) {
        Bitmap bitmap = this.f41332a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f41332a = null;
        }
        this.f41336f = Math.min(org.telegram.messenger.g0.L(120.0f), i7);
        int min = Math.min(org.telegram.messenger.g0.L(220.0f), i10);
        this.f41335e = min;
        this.f41337g = this.f41336f;
        int L = org.telegram.messenger.g0.L(32.0f) + min;
        this.h = L;
        this.f41332a = Bitmap.createBitmap((int) (this.f41337g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.f41333b = new Canvas(this.f41332a);
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void c(float f10) {
    }
}
