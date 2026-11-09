package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class uf0 implements wf0 {
    public Bitmap f38710a;
    public Canvas f38711b;
    public final Paint f38712c;
    public final Paint d;
    public int f38713e;
    public int f38714f;
    public int f38715g;
    public int h;
    public final xf0 f38716i;

    public uf0(xf0 xf0Var) {
        this.f38716i = xf0Var;
        Paint paint = new Paint();
        this.f38712c = paint;
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
    public final void b(bx bxVar, Canvas canvas) {
        Canvas canvas2;
        int i7;
        int i10;
        xf0 xf0Var = (xf0) bxVar.f32442b;
        xf0 xf0Var2 = this.f38716i;
        Paint paint = xf0Var2.f40374a;
        Bitmap bitmap = this.f38710a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a10 = (int) ((1.0f - ((c8.j9.a(xf0Var2.f40378f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (xf0Var2.getWidth() - this.f38714f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -org.telegram.messenger.g0.L(32.0f));
            if (a10 != 255) {
                this.f38710a.eraseColor(0);
                this.f38711b.save();
                this.f38711b.scale(this.f38710a.getWidth() / this.f38715g, this.f38710a.getHeight() / this.h);
                float f10 = -width;
                this.f38711b.translate(f10, 0.0f);
                xf0.a(xf0Var, this.f38711b);
                this.f38711b.restore();
                this.f38711b.save();
                this.f38711b.scale(this.f38710a.getWidth() / this.f38715g, this.f38710a.getHeight() / this.h);
                if (xf0Var2.f40379n != null) {
                    this.f38711b.save();
                    this.f38711b.translate(f10, org.telegram.messenger.g0.L(32.0f));
                    org.telegram.messenger.bs bsVar = xf0Var2.f40379n;
                    if (bsVar.f21727c) {
                        Canvas canvas3 = this.f38711b;
                        float centerX = xf0Var2.f40379n.f21728e.centerX();
                        RectF rectF = xf0Var2.f40379n.f21728e;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(bsVar.f21728e.width(), xf0Var2.f40379n.f21728e.height()) / 2.0f, paint);
                    } else if (bsVar.f21726b) {
                        this.f38711b.drawPath(bsVar.d, paint);
                    } else {
                        float max = Math.max(bsVar.f21728e.width(), xf0Var2.f40379n.f21728e.height()) / 2.0f;
                        this.f38711b.drawRoundRect(xf0Var2.f40379n.f21728e, max, max, paint);
                    }
                    this.f38711b.restore();
                } else {
                    this.f38711b.drawRect(0.0f, 0.0f, this.f38714f, org.telegram.messenger.g0.L(32.0f), paint);
                }
                this.f38711b.restore();
                Utilities.stackBlurBitmap(this.f38710a, (int) ((xf0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i7 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f38715g, this.h, null);
                canvas2.scale(this.f38715g / this.f38710a.getWidth(), this.h / this.f38710a.getHeight());
                canvas2.drawBitmap(this.f38710a, 0.0f, 0.0f, this.f38712c);
                canvas2.drawBitmap(this.f38710a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i7 = 255;
            }
            if (a10 != 0) {
                if (a10 != i7) {
                    i10 = a10;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f38714f, this.f38713e, i10);
                } else {
                    i10 = a10;
                }
                xf0.a(xf0Var, canvas2);
                if (i10 != i7) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i7, int i10) {
        Bitmap bitmap = this.f38710a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f38710a = null;
        }
        this.f38714f = Math.min(org.telegram.messenger.g0.L(120.0f), i7);
        int min = Math.min(org.telegram.messenger.g0.L(220.0f), i10);
        this.f38713e = min;
        this.f38715g = this.f38714f;
        int L = org.telegram.messenger.g0.L(32.0f) + min;
        this.h = L;
        this.f38710a = Bitmap.createBitmap((int) (this.f38715g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.f38711b = new Canvas(this.f38710a);
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void c(float f10) {
    }
}
