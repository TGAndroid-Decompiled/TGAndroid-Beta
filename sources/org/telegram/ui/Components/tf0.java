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
    public Bitmap f38298a;
    public Canvas f38299b;
    public final Paint f38300c;
    public final Paint d;
    public int f38301e;
    public int f38302f;
    public int f38303g;
    public int h;
    public final wf0 f38304i;

    public tf0(wf0 wf0Var) {
        this.f38304i = wf0Var;
        Paint paint = new Paint();
        this.f38300c = paint;
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
        wf0 wf0Var = (wf0) axVar.f32025b;
        wf0 wf0Var2 = this.f38304i;
        Paint paint = wf0Var2.f39959a;
        Bitmap bitmap = this.f38298a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a10 = (int) ((1.0f - ((c8.j9.a(wf0Var2.f39963f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (wf0Var2.getWidth() - this.f38302f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -org.telegram.messenger.g0.L(32.0f));
            if (a10 != 255) {
                this.f38298a.eraseColor(0);
                this.f38299b.save();
                this.f38299b.scale(this.f38298a.getWidth() / this.f38303g, this.f38298a.getHeight() / this.h);
                float f10 = -width;
                this.f38299b.translate(f10, 0.0f);
                wf0.a(wf0Var, this.f38299b);
                this.f38299b.restore();
                this.f38299b.save();
                this.f38299b.scale(this.f38298a.getWidth() / this.f38303g, this.f38298a.getHeight() / this.h);
                if (wf0Var2.f39964n != null) {
                    this.f38299b.save();
                    this.f38299b.translate(f10, org.telegram.messenger.g0.L(32.0f));
                    org.telegram.messenger.bs bsVar = wf0Var2.f39964n;
                    if (bsVar.f21732c) {
                        Canvas canvas3 = this.f38299b;
                        float centerX = wf0Var2.f39964n.f21733e.centerX();
                        RectF rectF = wf0Var2.f39964n.f21733e;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(bsVar.f21733e.width(), wf0Var2.f39964n.f21733e.height()) / 2.0f, paint);
                    } else if (bsVar.f21731b) {
                        this.f38299b.drawPath(bsVar.d, paint);
                    } else {
                        float max = Math.max(bsVar.f21733e.width(), wf0Var2.f39964n.f21733e.height()) / 2.0f;
                        this.f38299b.drawRoundRect(wf0Var2.f39964n.f21733e, max, max, paint);
                    }
                    this.f38299b.restore();
                } else {
                    this.f38299b.drawRect(0.0f, 0.0f, this.f38302f, org.telegram.messenger.g0.L(32.0f), paint);
                }
                this.f38299b.restore();
                Utilities.stackBlurBitmap(this.f38298a, (int) ((wf0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i7 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f38303g, this.h, null);
                canvas2.scale(this.f38303g / this.f38298a.getWidth(), this.h / this.f38298a.getHeight());
                canvas2.drawBitmap(this.f38298a, 0.0f, 0.0f, this.f38300c);
                canvas2.drawBitmap(this.f38298a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i7 = 255;
            }
            if (a10 != 0) {
                if (a10 != i7) {
                    i10 = a10;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f38302f, this.f38301e, i10);
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
        Bitmap bitmap = this.f38298a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f38298a = null;
        }
        this.f38302f = Math.min(org.telegram.messenger.g0.L(120.0f), i7);
        int min = Math.min(org.telegram.messenger.g0.L(220.0f), i10);
        this.f38301e = min;
        this.f38303g = this.f38302f;
        int L = org.telegram.messenger.g0.L(32.0f) + min;
        this.h = L;
        this.f38298a = Bitmap.createBitmap((int) (this.f38303g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.f38299b = new Canvas(this.f38298a);
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void c(float f10) {
    }
}
