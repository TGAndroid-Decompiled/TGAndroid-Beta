package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class ig0 implements kg0 {
    public Bitmap f36247a;
    public Canvas f36248b;
    public final Paint f36249c;
    public final Paint d;
    public int f36250e;
    public int f36251f;
    public int f36252g;
    public int h;
    public final lg0 f36253i;

    public ig0(lg0 lg0Var) {
        this.f36253i = lg0Var;
        Paint paint = new Paint();
        this.f36249c = paint;
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
    public final void c(ky kyVar, Canvas canvas) {
        Canvas canvas2;
        int i7;
        int i10;
        lg0 lg0Var = (lg0) kyVar.f37038b;
        lg0 lg0Var2 = this.f36253i;
        Paint paint = lg0Var2.f37184a;
        Bitmap bitmap = this.f36247a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a10 = (int) ((1.0f - ((c8.l9.a(lg0Var2.f37188f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (lg0Var2.getWidth() - this.f36251f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -org.telegram.messenger.g0.L(32.0f));
            if (a10 != 255) {
                this.f36247a.eraseColor(0);
                this.f36248b.save();
                this.f36248b.scale(this.f36247a.getWidth() / this.f36252g, this.f36247a.getHeight() / this.h);
                float f10 = -width;
                this.f36248b.translate(f10, 0.0f);
                lg0.a(lg0Var, this.f36248b);
                this.f36248b.restore();
                this.f36248b.save();
                this.f36248b.scale(this.f36247a.getWidth() / this.f36252g, this.f36247a.getHeight() / this.h);
                if (lg0Var2.f37189n != null) {
                    this.f36248b.save();
                    this.f36248b.translate(f10, org.telegram.messenger.g0.L(32.0f));
                    bi.c2 c2Var = lg0Var2.f37189n;
                    if (c2Var.f3458c) {
                        Canvas canvas3 = this.f36248b;
                        float centerX = ((RectF) lg0Var2.f37189n.f3459e).centerX();
                        RectF rectF = (RectF) lg0Var2.f37189n.f3459e;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(((RectF) c2Var.f3459e).width(), ((RectF) lg0Var2.f37189n.f3459e).height()) / 2.0f, paint);
                    } else if (c2Var.f3457b) {
                        this.f36248b.drawPath((Path) c2Var.d, paint);
                    } else {
                        float max = Math.max(((RectF) c2Var.f3459e).width(), ((RectF) lg0Var2.f37189n.f3459e).height()) / 2.0f;
                        this.f36248b.drawRoundRect((RectF) lg0Var2.f37189n.f3459e, max, max, paint);
                    }
                    this.f36248b.restore();
                } else {
                    this.f36248b.drawRect(0.0f, 0.0f, this.f36251f, org.telegram.messenger.g0.L(32.0f), paint);
                }
                this.f36248b.restore();
                Utilities.stackBlurBitmap(this.f36247a, (int) ((lg0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i7 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f36252g, this.h, null);
                canvas2.scale(this.f36252g / this.f36247a.getWidth(), this.h / this.f36247a.getHeight());
                canvas2.drawBitmap(this.f36247a, 0.0f, 0.0f, this.f36249c);
                canvas2.drawBitmap(this.f36247a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i7 = 255;
            }
            if (a10 != 0) {
                if (a10 != i7) {
                    i10 = a10;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f36251f, this.f36250e, i10);
                } else {
                    i10 = a10;
                }
                lg0.a(lg0Var, canvas2);
                if (i10 != i7) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i7, int i10) {
        Bitmap bitmap = this.f36247a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f36247a = null;
        }
        this.f36251f = Math.min(org.telegram.messenger.g0.L(120.0f), i7);
        int min = Math.min(org.telegram.messenger.g0.L(220.0f), i10);
        this.f36250e = min;
        this.f36252g = this.f36251f;
        int L = org.telegram.messenger.g0.L(32.0f) + min;
        this.h = L;
        this.f36247a = Bitmap.createBitmap((int) (this.f36252g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.f36248b = new Canvas(this.f36247a);
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void b(float f10) {
    }
}
