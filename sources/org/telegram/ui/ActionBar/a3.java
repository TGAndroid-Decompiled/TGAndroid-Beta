package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.xq;
public final class a3 {
    public final Path A;
    public final c3 f27302a;
    public final View f27303b;
    public int f27304c;
    public int d;
    public final org.telegram.ui.Components.w5 f27305e;
    public final org.telegram.ui.Components.w5 f27306f;
    public final Paint f27307g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f27308i;
    public final Paint f27309j;
    public int f27310k;
    public final org.telegram.ui.Cells.y f27311l;
    public int f27312m;
    public final int f27313n;
    public boolean f27314o;
    public final boolean f27315p;
    public final float f27316q;
    public final Bitmap f27317r;
    public final Drawable f27318s;
    public int f27319t;
    public final ly0 f27320u;
    public ly0 v;
    public float f27321w;
    public final float[] f27322x;
    public final Path f27323y;
    public final Path f27324z;

    public a3(View view, c3 c3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.f27308i = paint;
        this.f27309j = new Paint(3);
        org.telegram.ui.Cells.y h02 = k6.h0(822083583, 1, -1);
        this.f27311l = h02;
        this.f27319t = -1;
        this.f27322x = new float[8];
        this.f27323y = new Path();
        Path path = new Path();
        this.f27324z = path;
        Path path2 = new Path();
        this.A = path2;
        this.f27303b = view;
        this.f27302a = c3Var;
        h02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        xq xqVar = xq.h;
        this.f27305e = new org.telegram.ui.Components.w5(view, 320L, xqVar);
        this.f27306f = new org.telegram.ui.Components.w5(view, 320L, xqVar);
        this.f27317r = c3Var.F;
        String b10 = c3Var.b();
        textPaint = d3.getTextPaint();
        this.f27320u = new ly0(org.telegram.messenger.i6.m(b10, textPaint.getFontMetricsInt(), false, null, 0), 17.0f, org.telegram.messenger.g0.o());
        int i7 = c3Var.f27384q;
        this.f27313n = i7;
        this.f27315p = org.telegram.messenger.g0.B(i7) < 0.721f;
        org.telegram.ui.g4 g4Var = c3Var.J;
        if (g4Var != null) {
            ArrayList arrayList = g4Var.f45800d0;
            if (!arrayList.isEmpty()) {
                Object i10 = jg.g.i(1, arrayList);
                if ((i10 instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) i10).cached_page) == null || page.local == null)) {
                    this.f27318s = view.getContext().getResources().getDrawable(2131232190).mutate();
                }
            }
        }
        this.f27316q = c3Var.I;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        path.moveTo(org.telegram.messenger.g0.L(12.0f), 0.0f);
        path.lineTo(0.0f, org.telegram.messenger.g0.L(12.0f));
        path2.rewind();
        path2.moveTo(0.0f, org.telegram.messenger.g0.L(6.33f) / 2.0f);
        path2.lineTo(org.telegram.messenger.g0.L(12.66f) / 2.0f, (-org.telegram.messenger.g0.L(6.33f)) / 2.0f);
        path2.lineTo(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(6.33f) / 2.0f);
    }

    public final void a(Canvas canvas, RectF rectF, float f10, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i7;
        Canvas canvas2 = canvas;
        int f18 = i0.a.f(this.f27321w, this.f27312m, this.f27313n);
        Paint paint = this.f27307g;
        paint.setColor(f18);
        float f19 = f11 * 255.0f;
        paint.setAlpha((int) f19);
        float f20 = 0.0f;
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(1.0f), k6.r1(f11, 268435456));
        float[] fArr = this.f27322x;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[1] = f10;
        int i10 = 0;
        fArr[0] = f10;
        float T1 = org.telegram.messenger.g0.T1(f10, 0.0f, this.f27321w);
        fArr[7] = T1;
        fArr[6] = T1;
        fArr[5] = T1;
        fArr[4] = T1;
        Path path = this.f27323y;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f21 = this.f27316q;
        if (f21 > 0.0f && this.f27321w > 0.0f && f11 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            if (org.telegram.messenger.g0.B(f18) > 0.721f) {
                i7 = -16777216;
            } else {
                i7 = -1;
            }
            int r12 = k6.r1(0.07f * f11 * this.f27321w, i7);
            Paint paint2 = this.h;
            paint2.setColor(r12);
            float f22 = rectF.left;
            canvas.drawRect(f22, rectF.top, (rectF.width() * f21) + f22, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.f27314o) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        if (this.f27315p) {
            f20 = 1.0f;
        }
        float T12 = org.telegram.messenger.g0.T1(f13, f20, this.f27321w);
        int f23 = i0.a.f(T12, -16777216, -1);
        Paint paint3 = this.f27308i;
        paint3.setColor(f23);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        canvas2.save();
        canvas2.translate(rectF.left, rectF.centerY());
        int f24 = i0.a.f(T12, 553648127, 553648127);
        int L = org.telegram.messenger.g0.L(25.0f);
        int L2 = org.telegram.messenger.g0.L(25.0f);
        org.telegram.ui.Cells.y yVar = this.f27311l;
        yVar.setBounds(org.telegram.messenger.g0.L(25.0f) + (-org.telegram.messenger.g0.L(25.0f)), -org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(25.0f) + L, L2);
        if (this.f27310k != f24) {
            this.f27310k = f24;
            k6.H1(yVar, f24, false);
        }
        yVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + org.telegram.messenger.g0.L(18.0f), rectF.centerY() - org.telegram.messenger.g0.L(6.0f));
        float f25 = f19 * f12;
        int i11 = (int) f25;
        paint3.setAlpha(i11);
        canvas2.drawPath(this.f27324z, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - org.telegram.messenger.g0.L(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.f27321w) * f25));
        canvas2.drawPath(this.A, paint3);
        canvas2.restore();
        Bitmap bitmap = this.f27317r;
        if (bitmap != null) {
            int L3 = org.telegram.messenger.g0.L(24.0f);
            canvas2.save();
            Rect rect = org.telegram.messenger.g0.Q;
            float f26 = L3;
            float f27 = f26 / 2.0f;
            rect.set((int) (rectF.left + org.telegram.messenger.g0.L(56.0f)), (int) (rectF.centerY() - f27), (int) (rectF.left + org.telegram.messenger.g0.L(56.0f) + f26), (int) (rectF.centerY() + f27));
            Paint paint4 = this.f27309j;
            paint4.setAlpha(i11);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i10 = org.telegram.messenger.g0.L(4.0f) + L3;
        } else {
            Drawable drawable = this.f27318s;
            if (drawable != null) {
                float L4 = org.telegram.messenger.g0.L(24.0f);
                int intrinsicHeight = (int) ((L4 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = org.telegram.messenger.g0.Q;
                float f28 = (L4 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + org.telegram.messenger.g0.L(56.0f)), (int) (rectF.centerY() - f28), (int) ((intrinsicHeight * 0.7f) + rectF.left + org.telegram.messenger.g0.L(56.0f)), (int) (rectF.centerY() + f28));
                if (f23 != this.f27319t) {
                    this.f27319t = f23;
                    drawable.setColorFilter(new PorterDuffColorFilter(f23, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i11);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i10 = intrinsicHeight - org.telegram.messenger.g0.L(2.0f);
            }
        }
        ly0 ly0Var = this.v;
        if (ly0Var != null) {
            ly0Var.f35788p = (int) ((rectF.width() - org.telegram.messenger.g0.L(100.0f)) - f17);
            f14 = 1.0f;
            ly0Var.c(rectF.left + org.telegram.messenger.g0.L(60.0f) + i10, rectF.centerY(), org.telegram.messenger.k5.A(1.0f, this.f27321w, f11, f12), f23, canvas2);
        } else {
            f14 = 1.0f;
        }
        float width = rectF.width() - org.telegram.messenger.g0.L(100.0f);
        ly0 ly0Var2 = this.f27320u;
        ly0Var2.f35788p = (int) (width - f15);
        float L5 = i10 + rectF.left + org.telegram.messenger.g0.L(60.0f);
        float centerY = rectF.centerY();
        if (this.v == null) {
            f16 = f14;
        } else {
            f16 = this.f27321w;
        }
        ly0Var2.c(L5, centerY, f16 * f11 * f12, f23, canvas);
    }

    public final float b() {
        float min;
        boolean z9;
        float c10 = c();
        if (c10 < 0.0f) {
            min = c10 + 1.0f;
        } else if (c10 >= 0.0f && c10 < 1.0f) {
            min = org.telegram.messenger.g0.T1(1.0f, 0.87f, c10);
        } else {
            min = (1.0f - Math.min(1.0f, c10 - 1.0f)) * 0.87f;
        }
        if (this.d >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        return this.f27306f.d(z9) * min;
    }

    public final float c() {
        if (this.d < 0) {
            return this.f27304c;
        }
        return this.f27305e.e(false, this.f27304c);
    }
}
