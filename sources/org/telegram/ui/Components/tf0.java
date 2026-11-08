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
    public Bitmap f38341a;
    public Canvas f38342b;
    public final Paint f38343c;
    public final Paint d;
    public int f38344e;
    public int f38345f;
    public int f38346g;
    public int h;
    public final wf0 f38347i;

    public tf0(wf0 wf0Var) {
        this.f38347i = wf0Var;
        Paint paint = new Paint();
        this.f38343c = paint;
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
    public final void b(bx bxVar, Canvas canvas) {
        Canvas canvas2;
        int i7;
        int i10;
        wf0 wf0Var = (wf0) bxVar.f32375b;
        wf0 wf0Var2 = this.f38347i;
        Paint paint = wf0Var2.f39916a;
        Bitmap bitmap = this.f38341a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a10 = (int) ((1.0f - ((c8.j9.a(wf0Var2.f39920f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (wf0Var2.getWidth() - this.f38345f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -org.telegram.messenger.g0.L(32.0f));
            if (a10 != 255) {
                this.f38341a.eraseColor(0);
                this.f38342b.save();
                this.f38342b.scale(this.f38341a.getWidth() / this.f38346g, this.f38341a.getHeight() / this.h);
                float f10 = -width;
                this.f38342b.translate(f10, 0.0f);
                wf0.a(wf0Var, this.f38342b);
                this.f38342b.restore();
                this.f38342b.save();
                this.f38342b.scale(this.f38341a.getWidth() / this.f38346g, this.f38341a.getHeight() / this.h);
                if (wf0Var2.f39921n != null) {
                    this.f38342b.save();
                    this.f38342b.translate(f10, org.telegram.messenger.g0.L(32.0f));
                    org.telegram.messenger.bs bsVar = wf0Var2.f39921n;
                    if (bsVar.f21727c) {
                        Canvas canvas3 = this.f38342b;
                        float centerX = wf0Var2.f39921n.f21728e.centerX();
                        RectF rectF = wf0Var2.f39921n.f21728e;
                        canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(bsVar.f21728e.width(), wf0Var2.f39921n.f21728e.height()) / 2.0f, paint);
                    } else if (bsVar.f21726b) {
                        this.f38342b.drawPath(bsVar.d, paint);
                    } else {
                        float max = Math.max(bsVar.f21728e.width(), wf0Var2.f39921n.f21728e.height()) / 2.0f;
                        this.f38342b.drawRoundRect(wf0Var2.f39921n.f21728e, max, max, paint);
                    }
                    this.f38342b.restore();
                } else {
                    this.f38342b.drawRect(0.0f, 0.0f, this.f38345f, org.telegram.messenger.g0.L(32.0f), paint);
                }
                this.f38342b.restore();
                Utilities.stackBlurBitmap(this.f38341a, (int) ((wf0Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i7 = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.f38346g, this.h, null);
                canvas2.scale(this.f38346g / this.f38341a.getWidth(), this.h / this.f38341a.getHeight());
                canvas2.drawBitmap(this.f38341a, 0.0f, 0.0f, this.f38343c);
                canvas2.drawBitmap(this.f38341a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i7 = 255;
            }
            if (a10 != 0) {
                if (a10 != i7) {
                    i10 = a10;
                    canvas2.saveLayerAlpha(width, 0.0f, width + this.f38345f, this.f38344e, i10);
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
        Bitmap bitmap = this.f38341a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f38341a = null;
        }
        this.f38345f = Math.min(org.telegram.messenger.g0.L(120.0f), i7);
        int min = Math.min(org.telegram.messenger.g0.L(220.0f), i10);
        this.f38344e = min;
        this.f38346g = this.f38345f;
        int L = org.telegram.messenger.g0.L(32.0f) + min;
        this.h = L;
        this.f38341a = Bitmap.createBitmap((int) (this.f38346g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.f38342b = new Canvas(this.f38341a);
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void c(float f10) {
    }
}
