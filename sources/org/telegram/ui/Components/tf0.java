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
    public Bitmap f38333a;
    public Canvas f38334b;
    public final Paint f38335c;
    public final Paint d;
    public int f38336e;
    public int f38337f;
    public int f38338g;
    public int h;
    public final wf0 f38339i;

    public tf0(wf0 wf0Var) {
        this.f38339i = wf0Var;
        Paint paint = new Paint();
        this.f38335c = paint;
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
        wf0 wf0Var = (wf0) axVar.f31929b;
        wf0 wf0Var2 = this.f38339i;
        Paint paint = wf0Var2.f39951a;
        Bitmap bitmap = this.f38333a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a10 = (int) ((1.0f - ((c8.j9.a(wf0Var2.f39955f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (wf0Var2.getWidth() - this.f38337f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -org.telegram.messenger.g0.L(32.0f));
            if (a10 != 255) {
                this.f38333a.eraseColor(0);
                this.f38334b.save();
                this.f38334b.scale(this.f38333a.getWidth() / this.f38338g, this.f38333a.getHeight() / this.h);
                float f10 = -width;
                this.f38334b.translate(f10, 0.0f);
                wf0.a(wf0Var, this.f38334b);
                this.f38334b.restore();
                this.f38334b.save();
                this.f38334b.scale(this.f38333a.getWidth() / this.f38338g, this.f38333a.getHeight() / this.h);
                if (wf0Var2.f39956n != null) {
                    this.f38334b.save();
                    this.f38334b.translate(f10, org.telegram.messenger.g0.L(32.0f));
                    org.telegram.messenger.bs bsVar = wf0Var2.f39956n;
                    if (bsVar.f21691c) {
                        Canvas canvas3 = this.f38334b;
                        float centerX = wf0Var2.f39956n.f21692e.centerX();
                        RectF rectF = wf0Var2.f39956n.f21692e;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(bsVar.f21692e.width(), wf0Var2.f39956n.f21692e.height()) / 2.0f, paint);
                    } else if (bsVar.f21690b) {
                        this.f38334b.drawPath(bsVar.d, paint);
                    } else {
                        float max = Math.max(bsVar.f21692e.width(), wf0Var2.f39956n.f21692e.height()) / 2.0f;
                        this.f38334b.drawRoundRect(wf0Var2.f39956n.f21692e, max, max, paint);
                    }
                    this.f38334b.restore();
                } else {
                    this.f38334b.drawRect(0.0f, 0.0f, this.f38337f, org.telegram.messenger.g0.L(32.0f), paint);
                }
                this.f38334b.restore();
                Utilities.stackBlurBitmap(this.f38333a, (int) ((wf0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i7 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f38338g, this.h, null);
                canvas2.scale(this.f38338g / this.f38333a.getWidth(), this.h / this.f38333a.getHeight());
                canvas2.drawBitmap(this.f38333a, 0.0f, 0.0f, this.f38335c);
                canvas2.drawBitmap(this.f38333a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i7 = 255;
            }
            if (a10 != 0) {
                if (a10 != i7) {
                    i10 = a10;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f38337f, this.f38336e, i10);
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
        Bitmap bitmap = this.f38333a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f38333a = null;
        }
        this.f38337f = Math.min(org.telegram.messenger.g0.L(120.0f), i7);
        int min = Math.min(org.telegram.messenger.g0.L(220.0f), i10);
        this.f38336e = min;
        this.f38338g = this.f38337f;
        int L = org.telegram.messenger.g0.L(32.0f) + min;
        this.h = L;
        this.f38333a = Bitmap.createBitmap((int) (this.f38338g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.f38334b = new Canvas(this.f38333a);
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void c(float f10) {
    }
}
