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
public final class y2 {
    public final Path A;
    public final a3 f28825a;
    public final View f28826b;
    public int f28827c;
    public int d;
    public final org.telegram.ui.Components.u5 f28828e;
    public final org.telegram.ui.Components.u5 f28829f;
    public final Paint f28830g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f28831i;
    public final Paint f28832j;
    public int f28833k;
    public final org.telegram.ui.Cells.y f28834l;
    public int f28835m;
    public final int f28836n;
    public boolean f28837o;
    public final boolean f28838p;
    public final float f28839q;
    public final Bitmap f28840r;
    public final Drawable f28841s;
    public int f28842t;
    public final ly0 f28843u;
    public ly0 v;
    public float f28844w;
    public final float[] f28845x;
    public final Path f28846y;
    public final Path f28847z;

    public y2(View view, a3 a3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.f28831i = paint;
        this.f28832j = new Paint(3);
        org.telegram.ui.Cells.y h02 = k6.h0(822083583, 1, -1);
        this.f28834l = h02;
        this.f28842t = -1;
        this.f28845x = new float[8];
        this.f28846y = new Path();
        Path path = new Path();
        this.f28847z = path;
        Path path2 = new Path();
        this.A = path2;
        this.f28826b = view;
        this.f28825a = a3Var;
        h02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        xq xqVar = xq.h;
        this.f28828e = new org.telegram.ui.Components.u5(view, 320L, xqVar);
        this.f28829f = new org.telegram.ui.Components.u5(view, 320L, xqVar);
        this.f28840r = a3Var.F;
        String b10 = a3Var.b();
        textPaint = b3.getTextPaint();
        this.f28843u = new ly0(org.telegram.messenger.i6.m(b10, textPaint.getFontMetricsInt(), false, null, 0), 17.0f, org.telegram.messenger.g0.o());
        int i3 = a3Var.f27365q;
        this.f28836n = i3;
        this.f28838p = org.telegram.messenger.g0.B(i3) < 0.721f;
        org.telegram.ui.i4 i4Var = a3Var.J;
        if (i4Var != null) {
            ArrayList arrayList = i4Var.f46084e0;
            if (!arrayList.isEmpty()) {
                Object h = k2.p1.h(1, arrayList);
                if ((h instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) h).cached_page) == null || page.local == null)) {
                    this.f28841s = view.getContext().getResources().getDrawable(2131232190).mutate();
                }
            }
        }
        this.f28839q = a3Var.I;
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
        int i3;
        Canvas canvas2 = canvas;
        int f18 = i0.a.f(this.f28844w, this.f28835m, this.f28836n);
        Paint paint = this.f28830g;
        paint.setColor(f18);
        float f19 = f11 * 255.0f;
        paint.setAlpha((int) f19);
        float f20 = 0.0f;
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(1.0f), k6.r1(f11, 268435456));
        float[] fArr = this.f28845x;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[1] = f10;
        int i10 = 0;
        fArr[0] = f10;
        float T1 = org.telegram.messenger.g0.T1(f10, 0.0f, this.f28844w);
        fArr[7] = T1;
        fArr[6] = T1;
        fArr[5] = T1;
        fArr[4] = T1;
        Path path = this.f28846y;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f21 = this.f28839q;
        if (f21 > 0.0f && this.f28844w > 0.0f && f11 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            if (org.telegram.messenger.g0.B(f18) > 0.721f) {
                i3 = -16777216;
            } else {
                i3 = -1;
            }
            int r12 = k6.r1(0.07f * f11 * this.f28844w, i3);
            Paint paint2 = this.h;
            paint2.setColor(r12);
            float f22 = rectF.left;
            canvas.drawRect(f22, rectF.top, (rectF.width() * f21) + f22, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.f28837o) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        if (this.f28838p) {
            f20 = 1.0f;
        }
        float T12 = org.telegram.messenger.g0.T1(f13, f20, this.f28844w);
        int f23 = i0.a.f(T12, -16777216, -1);
        Paint paint3 = this.f28831i;
        paint3.setColor(f23);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        canvas2.save();
        canvas2.translate(rectF.left, rectF.centerY());
        int f24 = i0.a.f(T12, 553648127, 553648127);
        int L = org.telegram.messenger.g0.L(25.0f);
        int L2 = org.telegram.messenger.g0.L(25.0f);
        org.telegram.ui.Cells.y yVar = this.f28834l;
        yVar.setBounds(org.telegram.messenger.g0.L(25.0f) + (-org.telegram.messenger.g0.L(25.0f)), -org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(25.0f) + L, L2);
        if (this.f28833k != f24) {
            this.f28833k = f24;
            k6.H1(yVar, f24, false);
        }
        yVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + org.telegram.messenger.g0.L(18.0f), rectF.centerY() - org.telegram.messenger.g0.L(6.0f));
        float f25 = f19 * f12;
        int i11 = (int) f25;
        paint3.setAlpha(i11);
        canvas2.drawPath(this.f28847z, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - org.telegram.messenger.g0.L(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.f28844w) * f25));
        canvas2.drawPath(this.A, paint3);
        canvas2.restore();
        Bitmap bitmap = this.f28840r;
        if (bitmap != null) {
            int L3 = org.telegram.messenger.g0.L(24.0f);
            canvas2.save();
            Rect rect = org.telegram.messenger.g0.Q;
            float f26 = L3;
            float f27 = f26 / 2.0f;
            rect.set((int) (rectF.left + org.telegram.messenger.g0.L(56.0f)), (int) (rectF.centerY() - f27), (int) (rectF.left + org.telegram.messenger.g0.L(56.0f) + f26), (int) (rectF.centerY() + f27));
            Paint paint4 = this.f28832j;
            paint4.setAlpha(i11);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i10 = org.telegram.messenger.g0.L(4.0f) + L3;
        } else {
            Drawable drawable = this.f28841s;
            if (drawable != null) {
                float L4 = org.telegram.messenger.g0.L(24.0f);
                int intrinsicHeight = (int) ((L4 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = org.telegram.messenger.g0.Q;
                float f28 = (L4 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + org.telegram.messenger.g0.L(56.0f)), (int) (rectF.centerY() - f28), (int) ((intrinsicHeight * 0.7f) + rectF.left + org.telegram.messenger.g0.L(56.0f)), (int) (rectF.centerY() + f28));
                if (f23 != this.f28842t) {
                    this.f28842t = f23;
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
            ly0Var.f35929p = (int) ((rectF.width() - org.telegram.messenger.g0.L(100.0f)) - f17);
            f14 = 1.0f;
            ly0Var.c(rectF.left + org.telegram.messenger.g0.L(60.0f) + i10, rectF.centerY(), org.telegram.messenger.k5.A(1.0f, this.f28844w, f11, f12), f23, canvas2);
        } else {
            f14 = 1.0f;
        }
        float width = rectF.width() - org.telegram.messenger.g0.L(100.0f);
        ly0 ly0Var2 = this.f28843u;
        ly0Var2.f35929p = (int) (width - f15);
        float L5 = i10 + rectF.left + org.telegram.messenger.g0.L(60.0f);
        float centerY = rectF.centerY();
        if (this.v == null) {
            f16 = f14;
        } else {
            f16 = this.f28844w;
        }
        ly0Var2.c(L5, centerY, f16 * f11 * f12, f23, canvas);
    }

    public final float b() {
        float min;
        boolean z10;
        float c2 = c();
        if (c2 < 0.0f) {
            min = c2 + 1.0f;
        } else if (c2 >= 0.0f && c2 < 1.0f) {
            min = org.telegram.messenger.g0.T1(1.0f, 0.87f, c2);
        } else {
            min = (1.0f - Math.min(1.0f, c2 - 1.0f)) * 0.87f;
        }
        if (this.d >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return this.f28829f.d(z10) * min;
    }

    public final float c() {
        if (this.d < 0) {
            return this.f28827c;
        }
        return this.f28828e.e(false, this.f28827c);
    }
}
