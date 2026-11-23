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
    public Bitmap f36246a;
    public Canvas f36247b;
    public final Paint f36248c;
    public final Paint d;
    public int f36249e;
    public int f36250f;
    public int f36251g;
    public int h;
    public final lg0 f36252i;

    public ig0(lg0 lg0Var) {
        this.f36252i = lg0Var;
        Paint paint = new Paint();
        this.f36248c = paint;
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
        lg0 lg0Var = (lg0) kyVar.f37037b;
        lg0 lg0Var2 = this.f36252i;
        Paint paint = lg0Var2.f37183a;
        Bitmap bitmap = this.f36246a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a10 = (int) ((1.0f - ((c8.l9.a(lg0Var2.f37187f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (lg0Var2.getWidth() - this.f36250f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -org.telegram.messenger.g0.L(32.0f));
            if (a10 != 255) {
                this.f36246a.eraseColor(0);
                this.f36247b.save();
                this.f36247b.scale(this.f36246a.getWidth() / this.f36251g, this.f36246a.getHeight() / this.h);
                float f10 = -width;
                this.f36247b.translate(f10, 0.0f);
                lg0.a(lg0Var, this.f36247b);
                this.f36247b.restore();
                this.f36247b.save();
                this.f36247b.scale(this.f36246a.getWidth() / this.f36251g, this.f36246a.getHeight() / this.h);
                if (lg0Var2.f37188n != null) {
                    this.f36247b.save();
                    this.f36247b.translate(f10, org.telegram.messenger.g0.L(32.0f));
                    bi.c2 c2Var = lg0Var2.f37188n;
                    if (c2Var.f3458c) {
                        Canvas canvas3 = this.f36247b;
                        float centerX = ((RectF) lg0Var2.f37188n.f3459e).centerX();
                        RectF rectF = (RectF) lg0Var2.f37188n.f3459e;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(((RectF) c2Var.f3459e).width(), ((RectF) lg0Var2.f37188n.f3459e).height()) / 2.0f, paint);
                    } else if (c2Var.f3457b) {
                        this.f36247b.drawPath((Path) c2Var.d, paint);
                    } else {
                        float max = Math.max(((RectF) c2Var.f3459e).width(), ((RectF) lg0Var2.f37188n.f3459e).height()) / 2.0f;
                        this.f36247b.drawRoundRect((RectF) lg0Var2.f37188n.f3459e, max, max, paint);
                    }
                    this.f36247b.restore();
                } else {
                    this.f36247b.drawRect(0.0f, 0.0f, this.f36250f, org.telegram.messenger.g0.L(32.0f), paint);
                }
                this.f36247b.restore();
                Utilities.stackBlurBitmap(this.f36246a, (int) ((lg0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i7 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f36251g, this.h, null);
                canvas2.scale(this.f36251g / this.f36246a.getWidth(), this.h / this.f36246a.getHeight());
                canvas2.drawBitmap(this.f36246a, 0.0f, 0.0f, this.f36248c);
                canvas2.drawBitmap(this.f36246a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i7 = 255;
            }
            if (a10 != 0) {
                if (a10 != i7) {
                    i10 = a10;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f36250f, this.f36249e, i10);
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
        Bitmap bitmap = this.f36246a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f36246a = null;
        }
        this.f36250f = Math.min(org.telegram.messenger.g0.L(120.0f), i7);
        int min = Math.min(org.telegram.messenger.g0.L(220.0f), i10);
        this.f36249e = min;
        this.f36251g = this.f36250f;
        int L = org.telegram.messenger.g0.L(32.0f) + min;
        this.h = L;
        this.f36246a = Bitmap.createBitmap((int) (this.f36251g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.f36247b = new Canvas(this.f36246a);
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void b(float f10) {
    }
}
