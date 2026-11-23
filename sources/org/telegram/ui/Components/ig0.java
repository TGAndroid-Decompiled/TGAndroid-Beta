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
    public Bitmap f36202a;
    public Canvas f36203b;
    public final Paint f36204c;
    public final Paint d;
    public int f36205e;
    public int f36206f;
    public int f36207g;
    public int h;
    public final lg0 f36208i;

    public ig0(lg0 lg0Var) {
        this.f36208i = lg0Var;
        Paint paint = new Paint();
        this.f36204c = paint;
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
        lg0 lg0Var = (lg0) kyVar.f36994b;
        lg0 lg0Var2 = this.f36208i;
        Paint paint = lg0Var2.f37139a;
        Bitmap bitmap = this.f36202a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a10 = (int) ((1.0f - ((c8.m9.a(lg0Var2.f37143f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (lg0Var2.getWidth() - this.f36206f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -org.telegram.messenger.g0.L(32.0f));
            if (a10 != 255) {
                this.f36202a.eraseColor(0);
                this.f36203b.save();
                this.f36203b.scale(this.f36202a.getWidth() / this.f36207g, this.f36202a.getHeight() / this.h);
                float f10 = -width;
                this.f36203b.translate(f10, 0.0f);
                lg0.a(lg0Var, this.f36203b);
                this.f36203b.restore();
                this.f36203b.save();
                this.f36203b.scale(this.f36202a.getWidth() / this.f36207g, this.f36202a.getHeight() / this.h);
                if (lg0Var2.f37144n != null) {
                    this.f36203b.save();
                    this.f36203b.translate(f10, org.telegram.messenger.g0.L(32.0f));
                    bi.d2 d2Var = lg0Var2.f37144n;
                    if (d2Var.f3457c) {
                        Canvas canvas3 = this.f36203b;
                        float centerX = ((RectF) lg0Var2.f37144n.f3458e).centerX();
                        RectF rectF = (RectF) lg0Var2.f37144n.f3458e;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(((RectF) d2Var.f3458e).width(), ((RectF) lg0Var2.f37144n.f3458e).height()) / 2.0f, paint);
                    } else if (d2Var.f3456b) {
                        this.f36203b.drawPath((Path) d2Var.d, paint);
                    } else {
                        float max = Math.max(((RectF) d2Var.f3458e).width(), ((RectF) lg0Var2.f37144n.f3458e).height()) / 2.0f;
                        this.f36203b.drawRoundRect((RectF) lg0Var2.f37144n.f3458e, max, max, paint);
                    }
                    this.f36203b.restore();
                } else {
                    this.f36203b.drawRect(0.0f, 0.0f, this.f36206f, org.telegram.messenger.g0.L(32.0f), paint);
                }
                this.f36203b.restore();
                Utilities.stackBlurBitmap(this.f36202a, (int) ((lg0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i7 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f36207g, this.h, null);
                canvas2.scale(this.f36207g / this.f36202a.getWidth(), this.h / this.f36202a.getHeight());
                canvas2.drawBitmap(this.f36202a, 0.0f, 0.0f, this.f36204c);
                canvas2.drawBitmap(this.f36202a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i7 = 255;
            }
            if (a10 != 0) {
                if (a10 != i7) {
                    i10 = a10;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f36206f, this.f36205e, i10);
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
        Bitmap bitmap = this.f36202a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f36202a = null;
        }
        this.f36206f = Math.min(org.telegram.messenger.g0.L(120.0f), i7);
        int min = Math.min(org.telegram.messenger.g0.L(220.0f), i10);
        this.f36205e = min;
        this.f36207g = this.f36206f;
        int L = org.telegram.messenger.g0.L(32.0f) + min;
        this.h = L;
        this.f36202a = Bitmap.createBitmap((int) (this.f36207g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.f36203b = new Canvas(this.f36202a);
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void b(float f10) {
    }
}
