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
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.wy0;
public final class c3 {
    public final Path A;
    public final e3 f28883a;
    public final View f28884b;
    public int f28885c;
    public int d;
    public final org.telegram.ui.Components.c6 f28886e;
    public final org.telegram.ui.Components.c6 f28887f;
    public final Paint f28888g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f28889i;
    public final Paint f28890j;
    public int f28891k;
    public final org.telegram.ui.Cells.y f28892l;
    public int f28893m;
    public final int f28894n;
    public boolean f28895o;
    public final boolean f28896p;
    public final float f28897q;
    public final Bitmap f28898r;
    public final Drawable f28899s;
    public int f28900t;
    public final wy0 f28901u;
    public wy0 v;
    public float f28902w;
    public final float[] f28903x;
    public final Path f28904y;
    public final Path f28905z;

    public c3(View view, e3 e3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.f28889i = paint;
        this.f28890j = new Paint(3);
        org.telegram.ui.Cells.y h02 = n6.h0(822083583, 1, -1);
        this.f28892l = h02;
        this.f28900t = -1;
        this.f28903x = new float[8];
        this.f28904y = new Path();
        Path path = new Path();
        this.f28905z = path;
        Path path2 = new Path();
        this.A = path2;
        this.f28884b = view;
        this.f28883a = e3Var;
        h02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        kr krVar = kr.h;
        this.f28886e = new org.telegram.ui.Components.c6(view, 320L, krVar);
        this.f28887f = new org.telegram.ui.Components.c6(view, 320L, krVar);
        this.f28898r = e3Var.F;
        String b10 = e3Var.b();
        textPaint = f3.getTextPaint();
        this.f28901u = new wy0(org.telegram.messenger.j6.m(b10, textPaint.getFontMetricsInt(), false, null, 0), 17.0f, org.telegram.messenger.g0.o());
        int i7 = e3Var.f28966q;
        this.f28894n = i7;
        this.f28896p = org.telegram.messenger.g0.B(i7) < 0.721f;
        org.telegram.ui.g4 g4Var = e3Var.J;
        if (g4Var != null) {
            ArrayList arrayList = g4Var.f48068e0;
            if (!arrayList.isEmpty()) {
                Object h = i5.c.h(1, arrayList);
                if ((h instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) h).cached_page) == null || page.local == null)) {
                    this.f28899s = view.getContext().getResources().getDrawable(2131232195).mutate();
                }
            }
        }
        this.f28897q = e3Var.I;
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
        int f18 = i0.a.f(this.f28902w, this.f28893m, this.f28894n);
        Paint paint = this.f28888g;
        paint.setColor(f18);
        float f19 = f11 * 255.0f;
        paint.setAlpha((int) f19);
        float f20 = 0.0f;
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(1.0f), n6.r1(f11, 268435456));
        float[] fArr = this.f28903x;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[1] = f10;
        int i10 = 0;
        fArr[0] = f10;
        float T1 = org.telegram.messenger.g0.T1(f10, 0.0f, this.f28902w);
        fArr[7] = T1;
        fArr[6] = T1;
        fArr[5] = T1;
        fArr[4] = T1;
        Path path = this.f28904y;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f21 = this.f28897q;
        if (f21 > 0.0f && this.f28902w > 0.0f && f11 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            if (org.telegram.messenger.g0.B(f18) > 0.721f) {
                i7 = -16777216;
            } else {
                i7 = -1;
            }
            int r12 = n6.r1(0.07f * f11 * this.f28902w, i7);
            Paint paint2 = this.h;
            paint2.setColor(r12);
            float f22 = rectF.left;
            canvas.drawRect(f22, rectF.top, (rectF.width() * f21) + f22, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.f28895o) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        if (this.f28896p) {
            f20 = 1.0f;
        }
        float T12 = org.telegram.messenger.g0.T1(f13, f20, this.f28902w);
        int f23 = i0.a.f(T12, -16777216, -1);
        Paint paint3 = this.f28889i;
        paint3.setColor(f23);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        canvas2.save();
        canvas2.translate(rectF.left, rectF.centerY());
        int f24 = i0.a.f(T12, 553648127, 553648127);
        int L = org.telegram.messenger.g0.L(25.0f);
        int L2 = org.telegram.messenger.g0.L(25.0f);
        org.telegram.ui.Cells.y yVar = this.f28892l;
        yVar.setBounds(org.telegram.messenger.g0.L(25.0f) + (-org.telegram.messenger.g0.L(25.0f)), -org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(25.0f) + L, L2);
        if (this.f28891k != f24) {
            this.f28891k = f24;
            n6.H1(yVar, f24, false);
        }
        yVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + org.telegram.messenger.g0.L(18.0f), rectF.centerY() - org.telegram.messenger.g0.L(6.0f));
        float f25 = f19 * f12;
        int i11 = (int) f25;
        paint3.setAlpha(i11);
        canvas2.drawPath(this.f28905z, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - org.telegram.messenger.g0.L(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.f28902w) * f25));
        canvas2.drawPath(this.A, paint3);
        canvas2.restore();
        Bitmap bitmap = this.f28898r;
        if (bitmap != null) {
            int L3 = org.telegram.messenger.g0.L(24.0f);
            canvas2.save();
            Rect rect = org.telegram.messenger.g0.Q;
            float f26 = L3;
            float f27 = f26 / 2.0f;
            rect.set((int) (rectF.left + org.telegram.messenger.g0.L(56.0f)), (int) (rectF.centerY() - f27), (int) (rectF.left + org.telegram.messenger.g0.L(56.0f) + f26), (int) (rectF.centerY() + f27));
            Paint paint4 = this.f28890j;
            paint4.setAlpha(i11);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i10 = org.telegram.messenger.g0.L(4.0f) + L3;
        } else {
            Drawable drawable = this.f28899s;
            if (drawable != null) {
                float L4 = org.telegram.messenger.g0.L(24.0f);
                int intrinsicHeight = (int) ((L4 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = org.telegram.messenger.g0.Q;
                float f28 = (L4 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + org.telegram.messenger.g0.L(56.0f)), (int) (rectF.centerY() - f28), (int) ((intrinsicHeight * 0.7f) + rectF.left + org.telegram.messenger.g0.L(56.0f)), (int) (rectF.centerY() + f28));
                if (f23 != this.f28900t) {
                    this.f28900t = f23;
                    drawable.setColorFilter(new PorterDuffColorFilter(f23, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i11);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i10 = intrinsicHeight - org.telegram.messenger.g0.L(2.0f);
            }
        }
        wy0 wy0Var = this.v;
        if (wy0Var != null) {
            wy0Var.f41774p = (int) ((rectF.width() - org.telegram.messenger.g0.L(100.0f)) - f17);
            f14 = 1.0f;
            wy0Var.c(rectF.left + org.telegram.messenger.g0.L(60.0f) + i10, rectF.centerY(), org.telegram.messenger.f3.A(1.0f, this.f28902w, f11, f12), f23, canvas2);
        } else {
            f14 = 1.0f;
        }
        float width = rectF.width() - org.telegram.messenger.g0.L(100.0f);
        wy0 wy0Var2 = this.f28901u;
        wy0Var2.f41774p = (int) (width - f15);
        float L5 = i10 + rectF.left + org.telegram.messenger.g0.L(60.0f);
        float centerY = rectF.centerY();
        if (this.v == null) {
            f16 = f14;
        } else {
            f16 = this.f28902w;
        }
        wy0Var2.c(L5, centerY, f16 * f11 * f12, f23, canvas);
    }

    public final float b() {
        float min;
        boolean z10;
        float c10 = c();
        if (c10 < 0.0f) {
            min = c10 + 1.0f;
        } else if (c10 >= 0.0f && c10 < 1.0f) {
            min = org.telegram.messenger.g0.T1(1.0f, 0.87f, c10);
        } else {
            min = (1.0f - Math.min(1.0f, c10 - 1.0f)) * 0.87f;
        }
        if (this.d >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return this.f28887f.d(z10) * min;
    }

    public final float c() {
        if (this.d < 0) {
            return this.f28885c;
        }
        return this.f28886e.e(false, this.f28885c);
    }
}
