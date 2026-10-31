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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
public final class f3 {
    public final Path A;
    public final h3 f20298a;
    public final View f20299b;
    public int f20300c;
    public int d;
    public final org.telegram.ui.Components.t5 e;
    public final org.telegram.ui.Components.t5 f20301f;
    public final Paint f20302g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f20303i;
    public final Paint f20304j;
    public int f20305k;
    public final org.telegram.ui.Cells.y f20306l;
    public int f20307m;
    public final int f20308n;
    public boolean f20309o;
    public final boolean f20310p;
    public final float f20311q;
    public final Bitmap f20312r;
    public final Drawable f20313s;
    public int f20314t;
    public final qz0 f20315u;
    public qz0 v;
    public float f20316w;
    public final float[] f20317x;
    public final Path f20318y;
    public final Path f20319z;

    public f3(View view, h3 h3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.f20303i = paint;
        this.f20304j = new Paint(3);
        org.telegram.ui.Cells.y h02 = t6.h0(822083583, 1, -1);
        this.f20306l = h02;
        this.f20314t = -1;
        this.f20317x = new float[8];
        this.f20318y = new Path();
        Path path = new Path();
        this.f20319z = path;
        Path path2 = new Path();
        this.A = path2;
        this.f20299b = view;
        this.f20298a = h3Var;
        h02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        gr grVar = gr.h;
        this.e = new org.telegram.ui.Components.t5(view, 320L, grVar);
        this.f20301f = new org.telegram.ui.Components.t5(view, 320L, grVar);
        this.f20312r = h3Var.F;
        String b10 = h3Var.b();
        textPaint = i3.getTextPaint();
        this.f20315u = new qz0(org.telegram.messenger.k6.m(b10, textPaint.getFontMetricsInt(), false, null, 0), 17.0f, org.telegram.messenger.i0.o());
        int i10 = h3Var.f20367q;
        this.f20308n = i10;
        this.f20310p = org.telegram.messenger.i0.B(i10) < 0.721f;
        org.telegram.ui.h4 h4Var = h3Var.J;
        if (h4Var != null) {
            ArrayList arrayList = h4Var.f37730d0;
            if (!arrayList.isEmpty()) {
                Object g10 = i0.a.g(1, arrayList);
                if ((g10 instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) g10).cached_page) == null || page.local == null)) {
                    this.f20313s = view.getContext().getResources().getDrawable(2131232189).mutate();
                }
            }
        }
        this.f20311q = h3Var.I;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        path.moveTo(org.telegram.messenger.i0.L(12.0f), 0.0f);
        path.lineTo(0.0f, org.telegram.messenger.i0.L(12.0f));
        path2.rewind();
        path2.moveTo(0.0f, org.telegram.messenger.i0.L(6.33f) / 2.0f);
        path2.lineTo(org.telegram.messenger.i0.L(12.66f) / 2.0f, (-org.telegram.messenger.i0.L(6.33f)) / 2.0f);
        path2.lineTo(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(6.33f) / 2.0f);
    }

    public final void a(Canvas canvas, RectF rectF, float f7, float f10, float f11) {
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i10;
        Canvas canvas2 = canvas;
        int f17 = i0.b.f(this.f20316w, this.f20307m, this.f20308n);
        Paint paint = this.f20302g;
        paint.setColor(f17);
        float f18 = f10 * 255.0f;
        paint.setAlpha((int) f18);
        float f19 = 0.0f;
        paint.setShadowLayer(org.telegram.messenger.i0.L(2.33f), 0.0f, org.telegram.messenger.i0.L(1.0f), t6.r1(f10, 268435456));
        float[] fArr = this.f20317x;
        fArr[3] = f7;
        fArr[2] = f7;
        fArr[1] = f7;
        int i11 = 0;
        fArr[0] = f7;
        float T1 = org.telegram.messenger.i0.T1(f7, 0.0f, this.f20316w);
        fArr[7] = T1;
        fArr[6] = T1;
        fArr[5] = T1;
        fArr[4] = T1;
        Path path = this.f20318y;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f20 = this.f20311q;
        if (f20 > 0.0f && this.f20316w > 0.0f && f10 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            if (org.telegram.messenger.i0.B(f17) > 0.721f) {
                i10 = -16777216;
            } else {
                i10 = -1;
            }
            int r12 = t6.r1(0.07f * f10 * this.f20316w, i10);
            Paint paint2 = this.h;
            paint2.setColor(r12);
            float f21 = rectF.left;
            canvas.drawRect(f21, rectF.top, (rectF.width() * f20) + f21, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.f20309o) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        if (this.f20310p) {
            f19 = 1.0f;
        }
        float T12 = org.telegram.messenger.i0.T1(f12, f19, this.f20316w);
        int f22 = i0.b.f(T12, -16777216, -1);
        Paint paint3 = this.f20303i;
        paint3.setColor(f22);
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        canvas2.save();
        canvas2.translate(rectF.left, rectF.centerY());
        int f23 = i0.b.f(T12, 553648127, 553648127);
        int L = org.telegram.messenger.i0.L(25.0f);
        int L2 = org.telegram.messenger.i0.L(25.0f);
        org.telegram.ui.Cells.y yVar = this.f20306l;
        yVar.setBounds(org.telegram.messenger.i0.L(25.0f) + (-org.telegram.messenger.i0.L(25.0f)), -org.telegram.messenger.i0.L(25.0f), org.telegram.messenger.i0.L(25.0f) + L, L2);
        if (this.f20305k != f23) {
            this.f20305k = f23;
            t6.H1(yVar, f23, false);
        }
        yVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + org.telegram.messenger.i0.L(18.0f), rectF.centerY() - org.telegram.messenger.i0.L(6.0f));
        float f24 = f18 * f11;
        int i12 = (int) f24;
        paint3.setAlpha(i12);
        canvas2.drawPath(this.f20319z, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - org.telegram.messenger.i0.L(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.f20316w) * f24));
        canvas2.drawPath(this.A, paint3);
        canvas2.restore();
        Bitmap bitmap = this.f20312r;
        if (bitmap != null) {
            int L3 = org.telegram.messenger.i0.L(24.0f);
            canvas2.save();
            Rect rect = org.telegram.messenger.i0.Q;
            float f25 = L3;
            float f26 = f25 / 2.0f;
            rect.set((int) (rectF.left + org.telegram.messenger.i0.L(56.0f)), (int) (rectF.centerY() - f26), (int) (rectF.left + org.telegram.messenger.i0.L(56.0f) + f25), (int) (rectF.centerY() + f26));
            Paint paint4 = this.f20304j;
            paint4.setAlpha(i12);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i11 = org.telegram.messenger.i0.L(4.0f) + L3;
        } else {
            Drawable drawable = this.f20313s;
            if (drawable != null) {
                float L4 = org.telegram.messenger.i0.L(24.0f);
                int intrinsicHeight = (int) ((L4 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = org.telegram.messenger.i0.Q;
                float f27 = (L4 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + org.telegram.messenger.i0.L(56.0f)), (int) (rectF.centerY() - f27), (int) ((intrinsicHeight * 0.7f) + rectF.left + org.telegram.messenger.i0.L(56.0f)), (int) (rectF.centerY() + f27));
                if (f22 != this.f20314t) {
                    this.f20314t = f22;
                    drawable.setColorFilter(new PorterDuffColorFilter(f22, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i12);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i11 = intrinsicHeight - org.telegram.messenger.i0.L(2.0f);
            }
        }
        qz0 qz0Var = this.v;
        if (qz0Var != null) {
            qz0Var.f29784p = (int) ((rectF.width() - org.telegram.messenger.i0.L(100.0f)) - f16);
            f13 = 1.0f;
            qz0Var.c(rectF.left + org.telegram.messenger.i0.L(60.0f) + i11, rectF.centerY(), org.telegram.messenger.m5.A(1.0f, this.f20316w, f10, f11), f22, canvas2);
        } else {
            f13 = 1.0f;
        }
        float width = rectF.width() - org.telegram.messenger.i0.L(100.0f);
        qz0 qz0Var2 = this.f20315u;
        qz0Var2.f29784p = (int) (width - f14);
        float L5 = i11 + rectF.left + org.telegram.messenger.i0.L(60.0f);
        float centerY = rectF.centerY();
        if (this.v == null) {
            f15 = f13;
        } else {
            f15 = this.f20316w;
        }
        qz0Var2.c(L5, centerY, f15 * f10 * f11, f22, canvas);
    }

    public final float b() {
        float min;
        boolean z10;
        float c10 = c();
        if (c10 < 0.0f) {
            min = c10 + 1.0f;
        } else if (c10 >= 0.0f && c10 < 1.0f) {
            min = org.telegram.messenger.i0.T1(1.0f, 0.87f, c10);
        } else {
            min = (1.0f - Math.min(1.0f, c10 - 1.0f)) * 0.87f;
        }
        if (this.d >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return this.f20301f.d(z10) * min;
    }

    public final float c() {
        if (this.d < 0) {
            return this.f20300c;
        }
        return this.e.e(false, this.f20300c);
    }
}
