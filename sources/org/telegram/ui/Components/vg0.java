package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class vg0 implements xg0 {
    public Bitmap f31250a;
    public Canvas f31251b;
    public final Paint f31252c;
    public final Paint d;
    public int e;
    public int f31253f;
    public int f31254g;
    public int h;
    public final yg0 f31255i;

    public vg0(yg0 yg0Var) {
        this.f31255i = yg0Var;
        Paint paint = new Paint();
        this.f31252c = paint;
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
    public final void b(px pxVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        yg0 yg0Var = (yg0) pxVar.f29448b;
        yg0 yg0Var2 = this.f31255i;
        Paint paint = yg0Var2.f32731a;
        Bitmap bitmap = this.f31250a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.u.a(yg0Var2.f32734f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (yg0Var2.getWidth() - this.f31253f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -org.telegram.messenger.i0.L(32.0f));
            if (a2 != 255) {
                this.f31250a.eraseColor(0);
                this.f31251b.save();
                this.f31251b.scale(this.f31250a.getWidth() / this.f31254g, this.f31250a.getHeight() / this.h);
                float f7 = -width;
                this.f31251b.translate(f7, 0.0f);
                yg0.a(yg0Var, this.f31251b);
                this.f31251b.restore();
                this.f31251b.save();
                this.f31251b.scale(this.f31250a.getWidth() / this.f31254g, this.f31250a.getHeight() / this.h);
                if (yg0Var2.f32735n != null) {
                    this.f31251b.save();
                    this.f31251b.translate(f7, org.telegram.messenger.i0.L(32.0f));
                    org.telegram.messenger.ks ksVar = yg0Var2.f32735n;
                    if (ksVar.f16632c) {
                        Canvas canvas3 = this.f31251b;
                        float centerX = yg0Var2.f32735n.e.centerX();
                        RectF rectF = yg0Var2.f32735n.e;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(ksVar.e.width(), yg0Var2.f32735n.e.height()) / 2.0f, paint);
                    } else if (ksVar.f16631b) {
                        this.f31251b.drawPath(ksVar.d, paint);
                    } else {
                        float max = Math.max(ksVar.e.width(), yg0Var2.f32735n.e.height()) / 2.0f;
                        this.f31251b.drawRoundRect(yg0Var2.f32735n.e, max, max, paint);
                    }
                    this.f31251b.restore();
                } else {
                    this.f31251b.drawRect(0.0f, 0.0f, this.f31253f, org.telegram.messenger.i0.L(32.0f), paint);
                }
                this.f31251b.restore();
                Utilities.stackBlurBitmap(this.f31250a, (int) ((yg0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f31254g, this.h, null);
                canvas2.scale(this.f31254g / this.f31250a.getWidth(), this.h / this.f31250a.getHeight());
                canvas2.drawBitmap(this.f31250a, 0.0f, 0.0f, this.f31252c);
                canvas2.drawBitmap(this.f31250a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f31253f, this.e, i11);
                } else {
                    i11 = a2;
                }
                yg0.a(yg0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f31250a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f31250a = null;
        }
        this.f31253f = Math.min(org.telegram.messenger.i0.L(120.0f), i10);
        int min = Math.min(org.telegram.messenger.i0.L(220.0f), i11);
        this.e = min;
        this.f31254g = this.f31253f;
        int L = org.telegram.messenger.i0.L(32.0f) + min;
        this.h = L;
        this.f31250a = Bitmap.createBitmap((int) (this.f31254g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.f31251b = new Canvas(this.f31250a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void c(float f7) {
    }
}
