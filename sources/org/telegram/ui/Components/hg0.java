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
public final class hg0 implements jg0 {
    public Bitmap f35731a;
    public Canvas f35732b;
    public final Paint f35733c;
    public final Paint d;
    public int f35734e;
    public int f35735f;
    public int f35736g;
    public int h;
    public final kg0 f35737i;

    public hg0(kg0 kg0Var) {
        this.f35737i = kg0Var;
        Paint paint = new Paint();
        this.f35733c = paint;
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
    public final void c(hy hyVar, Canvas canvas) {
        Canvas canvas2;
        int i7;
        int i10;
        kg0 kg0Var = (kg0) hyVar.f35848b;
        kg0 kg0Var2 = this.f35737i;
        Paint paint = kg0Var2.f36741a;
        Bitmap bitmap = this.f35731a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a10 = (int) ((1.0f - ((c8.m9.a(kg0Var2.f36745f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (kg0Var2.getWidth() - this.f35735f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -org.telegram.messenger.g0.L(32.0f));
            if (a10 != 255) {
                this.f35731a.eraseColor(0);
                this.f35732b.save();
                this.f35732b.scale(this.f35731a.getWidth() / this.f35736g, this.f35731a.getHeight() / this.h);
                float f10 = -width;
                this.f35732b.translate(f10, 0.0f);
                kg0.a(kg0Var, this.f35732b);
                this.f35732b.restore();
                this.f35732b.save();
                this.f35732b.scale(this.f35731a.getWidth() / this.f35736g, this.f35731a.getHeight() / this.h);
                if (kg0Var2.f36746n != null) {
                    this.f35732b.save();
                    this.f35732b.translate(f10, org.telegram.messenger.g0.L(32.0f));
                    bi.d2 d2Var = kg0Var2.f36746n;
                    if (d2Var.f3457c) {
                        Canvas canvas3 = this.f35732b;
                        float centerX = ((RectF) kg0Var2.f36746n.f3458e).centerX();
                        RectF rectF = (RectF) kg0Var2.f36746n.f3458e;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(((RectF) d2Var.f3458e).width(), ((RectF) kg0Var2.f36746n.f3458e).height()) / 2.0f, paint);
                    } else if (d2Var.f3456b) {
                        this.f35732b.drawPath((Path) d2Var.d, paint);
                    } else {
                        float max = Math.max(((RectF) d2Var.f3458e).width(), ((RectF) kg0Var2.f36746n.f3458e).height()) / 2.0f;
                        this.f35732b.drawRoundRect((RectF) kg0Var2.f36746n.f3458e, max, max, paint);
                    }
                    this.f35732b.restore();
                } else {
                    this.f35732b.drawRect(0.0f, 0.0f, this.f35735f, org.telegram.messenger.g0.L(32.0f), paint);
                }
                this.f35732b.restore();
                Utilities.stackBlurBitmap(this.f35731a, (int) ((kg0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i7 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f35736g, this.h, null);
                canvas2.scale(this.f35736g / this.f35731a.getWidth(), this.h / this.f35731a.getHeight());
                canvas2.drawBitmap(this.f35731a, 0.0f, 0.0f, this.f35733c);
                canvas2.drawBitmap(this.f35731a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i7 = 255;
            }
            if (a10 != 0) {
                if (a10 != i7) {
                    i10 = a10;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f35735f, this.f35734e, i10);
                } else {
                    i10 = a10;
                }
                kg0.a(kg0Var, canvas2);
                if (i10 != i7) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i7, int i10) {
        Bitmap bitmap = this.f35731a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f35731a = null;
        }
        this.f35735f = Math.min(org.telegram.messenger.g0.L(120.0f), i7);
        int min = Math.min(org.telegram.messenger.g0.L(220.0f), i10);
        this.f35734e = min;
        this.f35736g = this.f35735f;
        int L = org.telegram.messenger.g0.L(32.0f) + min;
        this.h = L;
        this.f35731a = Bitmap.createBitmap((int) (this.f35736g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.f35732b = new Canvas(this.f35731a);
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void b(float f10) {
    }
}
