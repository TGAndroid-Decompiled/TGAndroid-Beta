package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
public final class ql0 extends View {
    public pl0 f37410a;
    public final w5 f37411b;
    public final fh.g f37412c;
    public ch.o0 d;
    public boolean f37413e;
    public final Path f37414f;
    public final RectF h;
    public final RectF f37415n;
    public boolean f37416r;
    public final rl0 f37417s;

    public ql0(rl0 rl0Var, Context context) {
        super(context);
        this.f37417s = rl0Var;
        this.f37411b = new w5(this, 0L, 260L, xq.h);
        this.f37414f = new Path();
        this.h = new RectF();
        this.f37415n = new RectF();
        c8.ka.a(this);
        dh.c cVar = rl0Var.f37741w;
        if (cVar != null) {
            fh.g c10 = cVar.c(this, null, false);
            c10.p(rl0Var.f37742x);
            c10.u(org.telegram.messenger.g0.L(5.0f));
            c10.f11538s = false;
            fh.e eVar = c10.f11535f0;
            if (eVar != null) {
                eVar.g(false);
            }
            org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(6.0f), 4.0f);
            this.f37412c = c10;
        }
    }

    public final void a(boolean z9, boolean z10) {
        if (this.f37413e == z9) {
            return;
        }
        this.f37413e = z9;
        pl0 pl0Var = this.f37410a;
        if (pl0Var != null) {
            pl0Var.f6325o = z9;
            w5 w5Var = this.f37411b;
            if (z10) {
                pl0Var.h = pl0Var.M;
                pl0Var.f6316f = pl0Var.N;
                pl0Var.f6318g = pl0Var.O;
                w5Var.e(true, 0.0f);
            } else {
                w5Var.e(true, 1.0f);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f37416r) {
            pl0 pl0Var = this.f37410a;
            if (pl0Var != null) {
                pl0Var.a();
            }
            this.f37416r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37416r) {
            pl0 pl0Var = this.f37410a;
            if (pl0Var != null) {
                pl0Var.b();
            }
            this.f37416r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        rl0 rl0Var = this.f37417s;
        Paint paint = rl0Var.f37743y;
        int width = (getWidth() - this.f37410a.f6335z) / 2;
        int height = getHeight();
        pl0 pl0Var = this.f37410a;
        int i10 = pl0Var.A;
        int i11 = (height - i10) / 2;
        fh.g gVar = this.f37412c;
        if (gVar != null) {
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set(width, i11, pl0Var.f6335z + width, i10 + i11);
            RectF rectF = this.f37415n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f37414f;
            if (!equals) {
                rectF2.set(rectF);
                ch.p0.h(rectF2, rectF, path);
            }
            rect.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            rect.right = org.telegram.messenger.g0.L(1.0f) + rect.right;
            gVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            gVar.draw(canvas);
            org.telegram.ui.ActionBar.g6 g6Var = rl0Var.f37735c;
            if (g6Var == null ? org.telegram.ui.ActionBar.l6.I.q() : g6Var.a()) {
                i7 = 687865855;
            } else {
                i7 = -1;
            }
            paint.setColor(i7);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f37410a.d(canvas, width, i11, this.f37411b.e(false, 1.0f), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        int L2 = org.telegram.messenger.g0.L(8.67f);
        pl0 pl0Var = this.f37410a;
        if (pl0Var != null) {
            L = pl0Var.f6335z;
        } else {
            L = org.telegram.messenger.g0.L(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L2 + L, 1073741824), i10);
    }
}
