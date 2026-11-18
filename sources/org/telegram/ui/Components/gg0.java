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
public final class gg0 implements ig0 {
    public Bitmap f35493a;
    public Canvas f35494b;
    public final Paint f35495c;
    public final Paint d;
    public int f35496e;
    public int f35497f;
    public int f35498g;
    public int h;
    public final jg0 f35499i;

    public gg0(jg0 jg0Var) {
        this.f35499i = jg0Var;
        Paint paint = new Paint();
        this.f35495c = paint;
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
    public final void c(iy iyVar, Canvas canvas) {
        Canvas canvas2;
        int i7;
        int i10;
        jg0 jg0Var = (jg0) iyVar.f36266b;
        jg0 jg0Var2 = this.f35499i;
        Paint paint = jg0Var2.f36432a;
        Bitmap bitmap = this.f35493a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a10 = (int) ((1.0f - ((c8.l9.a(jg0Var2.f36436f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (jg0Var2.getWidth() - this.f35497f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -org.telegram.messenger.g0.L(32.0f));
            if (a10 != 255) {
                this.f35493a.eraseColor(0);
                this.f35494b.save();
                this.f35494b.scale(this.f35493a.getWidth() / this.f35498g, this.f35493a.getHeight() / this.h);
                float f10 = -width;
                this.f35494b.translate(f10, 0.0f);
                jg0.a(jg0Var, this.f35494b);
                this.f35494b.restore();
                this.f35494b.save();
                this.f35494b.scale(this.f35493a.getWidth() / this.f35498g, this.f35493a.getHeight() / this.h);
                if (jg0Var2.f36437n != null) {
                    this.f35494b.save();
                    this.f35494b.translate(f10, org.telegram.messenger.g0.L(32.0f));
                    bi.y1 y1Var = jg0Var2.f36437n;
                    if (y1Var.f4218c) {
                        Canvas canvas3 = this.f35494b;
                        float centerX = ((RectF) jg0Var2.f36437n.f4219e).centerX();
                        RectF rectF = (RectF) jg0Var2.f36437n.f4219e;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(((RectF) y1Var.f4219e).width(), ((RectF) jg0Var2.f36437n.f4219e).height()) / 2.0f, paint);
                    } else if (y1Var.f4217b) {
                        this.f35494b.drawPath((Path) y1Var.d, paint);
                    } else {
                        float max = Math.max(((RectF) y1Var.f4219e).width(), ((RectF) jg0Var2.f36437n.f4219e).height()) / 2.0f;
                        this.f35494b.drawRoundRect((RectF) jg0Var2.f36437n.f4219e, max, max, paint);
                    }
                    this.f35494b.restore();
                } else {
                    this.f35494b.drawRect(0.0f, 0.0f, this.f35497f, org.telegram.messenger.g0.L(32.0f), paint);
                }
                this.f35494b.restore();
                Utilities.stackBlurBitmap(this.f35493a, (int) ((jg0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i7 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f35498g, this.h, null);
                canvas2.scale(this.f35498g / this.f35493a.getWidth(), this.h / this.f35493a.getHeight());
                canvas2.drawBitmap(this.f35493a, 0.0f, 0.0f, this.f35495c);
                canvas2.drawBitmap(this.f35493a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i7 = 255;
            }
            if (a10 != 0) {
                if (a10 != i7) {
                    i10 = a10;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f35497f, this.f35496e, i10);
                } else {
                    i10 = a10;
                }
                jg0.a(jg0Var, canvas2);
                if (i10 != i7) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i7, int i10) {
        Bitmap bitmap = this.f35493a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f35493a = null;
        }
        this.f35497f = Math.min(org.telegram.messenger.g0.L(120.0f), i7);
        int min = Math.min(org.telegram.messenger.g0.L(220.0f), i10);
        this.f35496e = min;
        this.f35498g = this.f35497f;
        int L = org.telegram.messenger.g0.L(32.0f) + min;
        this.h = L;
        this.f35493a = Bitmap.createBitmap((int) (this.f35498g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.f35494b = new Canvas(this.f35493a);
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void b(float f10) {
    }
}
