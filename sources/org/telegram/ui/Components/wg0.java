package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class wg0 implements yg0 {
    public Bitmap f32240a;
    public Canvas f32241b;
    public final Paint f32242c;
    public final Paint d;
    public int e;
    public int f32243f;
    public int f32244g;
    public int h;
    public final zg0 f32245i;

    public wg0(zg0 zg0Var) {
        this.f32245i = zg0Var;
        Paint paint = new Paint();
        this.f32242c = paint;
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
        zg0 zg0Var = (zg0) pxVar.f29561b;
        zg0 zg0Var2 = this.f32245i;
        Paint paint = zg0Var2.f33152a;
        Bitmap bitmap = this.f32240a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a2 = (int) ((1.0f - ((w7.u.a(zg0Var2.f33155f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (zg0Var2.getWidth() - this.f32243f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -org.telegram.messenger.i0.L(32.0f));
            if (a2 != 255) {
                this.f32240a.eraseColor(0);
                this.f32241b.save();
                this.f32241b.scale(this.f32240a.getWidth() / this.f32244g, this.f32240a.getHeight() / this.h);
                float f7 = -width;
                this.f32241b.translate(f7, 0.0f);
                zg0.a(zg0Var, this.f32241b);
                this.f32241b.restore();
                this.f32241b.save();
                this.f32241b.scale(this.f32240a.getWidth() / this.f32244g, this.f32240a.getHeight() / this.h);
                if (zg0Var2.f33156n != null) {
                    this.f32241b.save();
                    this.f32241b.translate(f7, org.telegram.messenger.i0.L(32.0f));
                    org.telegram.messenger.ls lsVar = zg0Var2.f33156n;
                    if (lsVar.f16997c) {
                        Canvas canvas3 = this.f32241b;
                        float centerX = zg0Var2.f33156n.e.centerX();
                        RectF rectF = zg0Var2.f33156n.e;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(lsVar.e.width(), zg0Var2.f33156n.e.height()) / 2.0f, paint);
                    } else if (lsVar.f16996b) {
                        this.f32241b.drawPath(lsVar.d, paint);
                    } else {
                        float max = Math.max(lsVar.e.width(), zg0Var2.f33156n.e.height()) / 2.0f;
                        this.f32241b.drawRoundRect(zg0Var2.f33156n.e, max, max, paint);
                    }
                    this.f32241b.restore();
                } else {
                    this.f32241b.drawRect(0.0f, 0.0f, this.f32243f, org.telegram.messenger.i0.L(32.0f), paint);
                }
                this.f32241b.restore();
                Utilities.stackBlurBitmap(this.f32240a, (int) ((zg0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i10 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f32244g, this.h, null);
                canvas2.scale(this.f32244g / this.f32240a.getWidth(), this.h / this.f32240a.getHeight());
                canvas2.drawBitmap(this.f32240a, 0.0f, 0.0f, this.f32242c);
                canvas2.drawBitmap(this.f32240a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i10 = 255;
            }
            if (a2 != 0) {
                if (a2 != i10) {
                    i11 = a2;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f32243f, this.e, i11);
                } else {
                    i11 = a2;
                }
                zg0.a(zg0Var, canvas2);
                if (i11 != i10) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f32240a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f32240a = null;
        }
        this.f32243f = Math.min(org.telegram.messenger.i0.L(120.0f), i10);
        int min = Math.min(org.telegram.messenger.i0.L(220.0f), i11);
        this.e = min;
        this.f32244g = this.f32243f;
        int L = org.telegram.messenger.i0.L(32.0f) + min;
        this.h = L;
        this.f32240a = Bitmap.createBitmap((int) (this.f32244g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.f32241b = new Canvas(this.f32240a);
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void c(float f7) {
    }
}
