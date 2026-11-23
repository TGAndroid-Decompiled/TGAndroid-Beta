package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
public final class dm0 extends View {
    public cm0 f34526a;
    public final d6 f34527b;
    public final fh.g f34528c;
    public ch.p0 d;
    public boolean f34529e;
    public final Path f34530f;
    public final RectF h;
    public final RectF f34531n;
    public boolean f34532r;
    public final em0 f34533s;

    public dm0(em0 em0Var, Context context) {
        super(context);
        this.f34533s = em0Var;
        this.f34527b = new d6(this, 0L, 260L, nr.h);
        this.f34530f = new Path();
        this.h = new RectF();
        this.f34531n = new RectF();
        c8.ra.a(this);
        dh.c cVar = em0Var.f34910w;
        if (cVar != null) {
            fh.g c10 = cVar.c(this, null, false);
            c10.p(em0Var.f34911x);
            c10.u(org.telegram.messenger.g0.L(5.0f));
            c10.f11702s = false;
            fh.e eVar = c10.f11699g0;
            if (eVar != null) {
                eVar.g(false);
            }
            org.telegram.messenger.o10.s(c10, org.telegram.messenger.g0.L(6.0f), 4.0f);
            this.f34528c = c10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f34529e == z10) {
            return;
        }
        this.f34529e = z10;
        cm0 cm0Var = this.f34526a;
        if (cm0Var != null) {
            cm0Var.f5477o = z10;
            d6 d6Var = this.f34527b;
            if (z11) {
                cm0Var.h = cm0Var.M;
                cm0Var.f5468f = cm0Var.N;
                cm0Var.f5470g = cm0Var.O;
                d6Var.e(true, 0.0f);
            } else {
                d6Var.e(true, 1.0f);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f34532r) {
            cm0 cm0Var = this.f34526a;
            if (cm0Var != null) {
                cm0Var.a();
            }
            this.f34532r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f34532r) {
            cm0 cm0Var = this.f34526a;
            if (cm0Var != null) {
                cm0Var.b();
            }
            this.f34532r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        em0 em0Var = this.f34533s;
        Paint paint = em0Var.f34912y;
        int width = (getWidth() - this.f34526a.f5487z) / 2;
        int height = getHeight();
        cm0 cm0Var = this.f34526a;
        int i10 = cm0Var.A;
        int i11 = (height - i10) / 2;
        fh.g gVar = this.f34528c;
        if (gVar != null) {
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set(width, i11, cm0Var.f5487z + width, i10 + i11);
            RectF rectF = this.f34531n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f34530f;
            if (!equals) {
                rectF2.set(rectF);
                ch.q0.h(rectF2, rectF, path);
            }
            rect.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            rect.right = org.telegram.messenger.g0.L(1.0f) + rect.right;
            gVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            gVar.draw(canvas);
            org.telegram.ui.ActionBar.h6 h6Var = em0Var.f34904c;
            if (h6Var == null ? org.telegram.ui.ActionBar.m6.I.q() : h6Var.d()) {
                i7 = 687865855;
            } else {
                i7 = -1;
            }
            paint.setColor(i7);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f34526a.d(canvas, width, i11, this.f34527b.e(false, 1.0f), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        int L2 = org.telegram.messenger.g0.L(8.67f);
        cm0 cm0Var = this.f34526a;
        if (cm0Var != null) {
            L = cm0Var.f5487z;
        } else {
            L = org.telegram.messenger.g0.L(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L2 + L, 1073741824), i10);
    }
}
