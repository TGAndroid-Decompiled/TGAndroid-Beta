package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
public final class qm0 extends View {
    public pm0 f29680a;
    public final t5 f29681b;
    public final vg.f f29682c;
    public sg.o0 d;
    public boolean e;
    public final Path f29683f;
    public final RectF h;
    public final RectF f29684n;
    public boolean f29685r;
    public final rm0 f29686s;

    public qm0(rm0 rm0Var, Context context) {
        super(context);
        this.f29686s = rm0Var;
        this.f29681b = new t5(this, 0L, 260L, gr.h);
        this.f29683f = new Path();
        this.h = new RectF();
        this.f29684n = new RectF();
        w7.e6.a(this);
        tg.b bVar = rm0Var.f29963w;
        if (bVar != null) {
            vg.f c10 = bVar.c(this, null, false);
            c10.o(rm0Var.f29964x);
            c10.t(org.telegram.messenger.i0.L(5.0f));
            c10.h = false;
            vg.d dVar = c10.f50842b0;
            if (dVar != null) {
                dVar.g(false);
            }
            org.telegram.messenger.z20.u(c10, org.telegram.messenger.i0.L(6.0f), 4.0f);
            this.f29682c = c10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        pm0 pm0Var = this.f29680a;
        if (pm0Var != null) {
            pm0Var.f48408o = z10;
            t5 t5Var = this.f29681b;
            if (z11) {
                pm0Var.h = pm0Var.M;
                pm0Var.f48399f = pm0Var.N;
                pm0Var.f48401g = pm0Var.O;
                t5Var.e(true, 0.0f);
            } else {
                t5Var.e(true, 1.0f);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f29685r) {
            pm0 pm0Var = this.f29680a;
            if (pm0Var != null) {
                pm0Var.a();
            }
            this.f29685r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f29685r) {
            pm0 pm0Var = this.f29680a;
            if (pm0Var != null) {
                pm0Var.b();
            }
            this.f29685r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        rm0 rm0Var = this.f29686s;
        Paint paint = rm0Var.f29965y;
        int width = (getWidth() - this.f29680a.f48418z) / 2;
        int height = getHeight();
        pm0 pm0Var = this.f29680a;
        int i11 = pm0Var.A;
        int i12 = (height - i11) / 2;
        vg.f fVar = this.f29682c;
        if (fVar != null) {
            Rect rect = org.telegram.messenger.i0.Q;
            rect.set(width, i12, pm0Var.f48418z + width, i11 + i12);
            RectF rectF = this.f29684n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f29683f;
            if (!equals) {
                rectF2.set(rectF);
                sg.p0.h(rectF2, rectF, path);
            }
            rect.inset(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f));
            rect.right = org.telegram.messenger.i0.L(1.0f) + rect.right;
            fVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            fVar.draw(canvas);
            org.telegram.ui.ActionBar.p6 p6Var = rm0Var.f29958c;
            if (p6Var == null ? org.telegram.ui.ActionBar.t6.I.q() : p6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f29680a.d(canvas, width, i12, this.f29681b.e(false, 1.0f), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int L;
        int L2 = org.telegram.messenger.i0.L(8.67f);
        pm0 pm0Var = this.f29680a;
        if (pm0Var != null) {
            L = pm0Var.f48418z;
        } else {
            L = org.telegram.messenger.i0.L(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L2 + L, 1073741824), i11);
    }
}
