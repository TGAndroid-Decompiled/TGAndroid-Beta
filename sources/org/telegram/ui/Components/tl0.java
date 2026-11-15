package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
public final class tl0 extends View {
    public sl0 f39712a;
    public final u5 f39713b;
    public final fh.g f39714c;
    public ch.p0 d;
    public boolean f39715e;
    public final Path f39716f;
    public final RectF h;
    public final RectF f39717n;
    public boolean f39718r;
    public final ul0 f39719s;

    public tl0(ul0 ul0Var, Context context) {
        super(context);
        this.f39719s = ul0Var;
        this.f39713b = new u5(this, 0L, 260L, er.h);
        this.f39716f = new Path();
        this.h = new RectF();
        this.f39717n = new RectF();
        c8.na.a(this);
        dh.c cVar = ul0Var.f40104w;
        if (cVar != null) {
            fh.g c10 = cVar.c(this, null, false);
            c10.p(ul0Var.f40105x);
            c10.u(org.telegram.messenger.g0.L(5.0f));
            c10.f11353s = false;
            fh.e eVar = c10.f11350g0;
            if (eVar != null) {
                eVar.g(false);
            }
            org.telegram.messenger.i20.r(c10, org.telegram.messenger.g0.L(6.0f), 4.0f);
            this.f39714c = c10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f39715e == z10) {
            return;
        }
        this.f39715e = z10;
        sl0 sl0Var = this.f39712a;
        if (sl0Var != null) {
            sl0Var.f5160o = z10;
            u5 u5Var = this.f39713b;
            if (z11) {
                sl0Var.h = sl0Var.M;
                sl0Var.f5151f = sl0Var.N;
                sl0Var.f5153g = sl0Var.O;
                u5Var.e(true, 0.0f);
            } else {
                u5Var.e(true, 1.0f);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f39718r) {
            sl0 sl0Var = this.f39712a;
            if (sl0Var != null) {
                sl0Var.a();
            }
            this.f39718r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f39718r) {
            sl0 sl0Var = this.f39712a;
            if (sl0Var != null) {
                sl0Var.b();
            }
            this.f39718r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        ul0 ul0Var = this.f39719s;
        Paint paint = ul0Var.f40106y;
        int width = (getWidth() - this.f39712a.f5170z) / 2;
        int height = getHeight();
        sl0 sl0Var = this.f39712a;
        int i10 = sl0Var.A;
        int i11 = (height - i10) / 2;
        fh.g gVar = this.f39714c;
        if (gVar != null) {
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set(width, i11, sl0Var.f5170z + width, i10 + i11);
            RectF rectF = this.f39717n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f39716f;
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
            org.telegram.ui.ActionBar.e6 e6Var = ul0Var.f40098c;
            if (e6Var == null ? org.telegram.ui.ActionBar.j6.I.q() : e6Var.a()) {
                i7 = 687865855;
            } else {
                i7 = -1;
            }
            paint.setColor(i7);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f39712a.d(canvas, width, i11, this.f39713b.e(false, 1.0f), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        int L2 = org.telegram.messenger.g0.L(8.67f);
        sl0 sl0Var = this.f39712a;
        if (sl0Var != null) {
            L = sl0Var.f5170z;
        } else {
            L = org.telegram.messenger.g0.L(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L2 + L, 1073741824), i10);
    }
}
