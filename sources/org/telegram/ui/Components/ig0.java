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
    public Bitmap f36253a;
    public Canvas f36254b;
    public final Paint f36255c;
    public final Paint d;
    public int f36256e;
    public int f36257f;
    public int f36258g;
    public int h;
    public final lg0 f36259i;

    public ig0(lg0 lg0Var) {
        this.f36259i = lg0Var;
        Paint paint = new Paint();
        this.f36255c = paint;
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
        lg0 lg0Var = (lg0) kyVar.f37035b;
        lg0 lg0Var2 = this.f36259i;
        Paint paint = lg0Var2.f37178a;
        Bitmap bitmap = this.f36253a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a10 = (int) ((1.0f - ((c8.l9.a(lg0Var2.f37182f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (lg0Var2.getWidth() - this.f36257f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -org.telegram.messenger.g0.L(32.0f));
            if (a10 != 255) {
                this.f36253a.eraseColor(0);
                this.f36254b.save();
                this.f36254b.scale(this.f36253a.getWidth() / this.f36258g, this.f36253a.getHeight() / this.h);
                float f10 = -width;
                this.f36254b.translate(f10, 0.0f);
                lg0.a(lg0Var, this.f36254b);
                this.f36254b.restore();
                this.f36254b.save();
                this.f36254b.scale(this.f36253a.getWidth() / this.f36258g, this.f36253a.getHeight() / this.h);
                if (lg0Var2.f37183n != null) {
                    this.f36254b.save();
                    this.f36254b.translate(f10, org.telegram.messenger.g0.L(32.0f));
                    bi.c2 c2Var = lg0Var2.f37183n;
                    if (c2Var.f3453c) {
                        Canvas canvas3 = this.f36254b;
                        float centerX = ((RectF) lg0Var2.f37183n.f3454e).centerX();
                        RectF rectF = (RectF) lg0Var2.f37183n.f3454e;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(((RectF) c2Var.f3454e).width(), ((RectF) lg0Var2.f37183n.f3454e).height()) / 2.0f, paint);
                    } else if (c2Var.f3452b) {
                        this.f36254b.drawPath((Path) c2Var.d, paint);
                    } else {
                        float max = Math.max(((RectF) c2Var.f3454e).width(), ((RectF) lg0Var2.f37183n.f3454e).height()) / 2.0f;
                        this.f36254b.drawRoundRect((RectF) lg0Var2.f37183n.f3454e, max, max, paint);
                    }
                    this.f36254b.restore();
                } else {
                    this.f36254b.drawRect(0.0f, 0.0f, this.f36257f, org.telegram.messenger.g0.L(32.0f), paint);
                }
                this.f36254b.restore();
                Utilities.stackBlurBitmap(this.f36253a, (int) ((lg0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i7 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f36258g, this.h, null);
                canvas2.scale(this.f36258g / this.f36253a.getWidth(), this.h / this.f36253a.getHeight());
                canvas2.drawBitmap(this.f36253a, 0.0f, 0.0f, this.f36255c);
                canvas2.drawBitmap(this.f36253a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i7 = 255;
            }
            if (a10 != 0) {
                if (a10 != i7) {
                    i10 = a10;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f36257f, this.f36256e, i10);
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
        Bitmap bitmap = this.f36253a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f36253a = null;
        }
        this.f36257f = Math.min(org.telegram.messenger.g0.L(120.0f), i7);
        int min = Math.min(org.telegram.messenger.g0.L(220.0f), i10);
        this.f36256e = min;
        this.f36258g = this.f36257f;
        int L = org.telegram.messenger.g0.L(32.0f) + min;
        this.h = L;
        this.f36253a = Bitmap.createBitmap((int) (this.f36258g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.f36254b = new Canvas(this.f36253a);
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void b(float f10) {
    }
}
