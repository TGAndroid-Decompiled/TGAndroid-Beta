package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
public final class dm0 extends View {
    public cm0 f34385a;
    public final c6 f34386b;
    public final fh.g f34387c;
    public ch.p0 d;
    public boolean f34388e;
    public final Path f34389f;
    public final RectF h;
    public final RectF f34390n;
    public boolean f34391r;
    public final em0 f34392s;

    public dm0(em0 em0Var, Context context) {
        super(context);
        this.f34392s = em0Var;
        this.f34386b = new c6(this, 0L, 260L, kr.h);
        this.f34389f = new Path();
        this.h = new RectF();
        this.f34390n = new RectF();
        c8.sa.a(this);
        dh.c cVar = em0Var.f34802w;
        if (cVar != null) {
            fh.g c10 = cVar.c(this, null, false);
            c10.p(em0Var.f34803x);
            c10.u(org.telegram.messenger.g0.L(5.0f));
            c10.f11664s = false;
            fh.e eVar = c10.f11661g0;
            if (eVar != null) {
                eVar.g(false);
            }
            org.telegram.messenger.m10.s(c10, org.telegram.messenger.g0.L(6.0f), 4.0f);
            this.f34387c = c10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f34388e == z10) {
            return;
        }
        this.f34388e = z10;
        cm0 cm0Var = this.f34385a;
        if (cm0Var != null) {
            cm0Var.f5440o = z10;
            c6 c6Var = this.f34386b;
            if (z11) {
                cm0Var.h = cm0Var.M;
                cm0Var.f5431f = cm0Var.N;
                cm0Var.f5433g = cm0Var.O;
                c6Var.e(true, 0.0f);
            } else {
                c6Var.e(true, 1.0f);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f34391r) {
            cm0 cm0Var = this.f34385a;
            if (cm0Var != null) {
                cm0Var.a();
            }
            this.f34391r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f34391r) {
            cm0 cm0Var = this.f34385a;
            if (cm0Var != null) {
                cm0Var.b();
            }
            this.f34391r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        em0 em0Var = this.f34392s;
        Paint paint = em0Var.f34804y;
        int width = (getWidth() - this.f34385a.f5450z) / 2;
        int height = getHeight();
        cm0 cm0Var = this.f34385a;
        int i10 = cm0Var.A;
        int i11 = (height - i10) / 2;
        fh.g gVar = this.f34387c;
        if (gVar != null) {
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set(width, i11, cm0Var.f5450z + width, i10 + i11);
            RectF rectF = this.f34390n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f34389f;
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
            org.telegram.ui.ActionBar.i6 i6Var = em0Var.f34796c;
            if (i6Var == null ? org.telegram.ui.ActionBar.n6.I.q() : i6Var.b()) {
                i7 = 687865855;
            } else {
                i7 = -1;
            }
            paint.setColor(i7);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f34385a.d(canvas, width, i11, this.f34386b.e(false, 1.0f), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        int L2 = org.telegram.messenger.g0.L(8.67f);
        cm0 cm0Var = this.f34385a;
        if (cm0Var != null) {
            L = cm0Var.f5450z;
        } else {
            L = org.telegram.messenger.g0.L(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L2 + L, 1073741824), i10);
    }
}
