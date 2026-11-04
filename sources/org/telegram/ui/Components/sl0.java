package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
public final class sl0 extends View {
    public rl0 f38056a;
    public final u5 f38057b;
    public final gh.g f38058c;
    public dh.n0 d;
    public boolean f38059e;
    public final Path f38060f;
    public final RectF h;
    public final RectF f38061n;
    public boolean f38062r;
    public final tl0 f38063s;

    public sl0(tl0 tl0Var, Context context) {
        super(context);
        this.f38063s = tl0Var;
        this.f38057b = new u5(this, 0L, 260L, xq.h);
        this.f38060f = new Path();
        this.h = new RectF();
        this.f38061n = new RectF();
        b8.pf.a(this);
        eh.c cVar = tl0Var.f38493w;
        if (cVar != null) {
            gh.g c2 = cVar.c(this, null, false);
            c2.p(tl0Var.f38494x);
            c2.u(org.telegram.messenger.g0.L(5.0f));
            c2.f12333s = false;
            gh.e eVar = c2.f12330g0;
            if (eVar != null) {
                eVar.g(false);
            }
            org.telegram.messenger.camera.q.p(c2, org.telegram.messenger.g0.L(6.0f), 4.0f);
            this.f38058c = c2;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f38059e == z10) {
            return;
        }
        this.f38059e = z10;
        rl0 rl0Var = this.f38056a;
        if (rl0Var != null) {
            rl0Var.f9078o = z10;
            u5 u5Var = this.f38057b;
            if (z11) {
                rl0Var.h = rl0Var.M;
                rl0Var.f9069f = rl0Var.N;
                rl0Var.f9071g = rl0Var.O;
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
        if (!this.f38062r) {
            rl0 rl0Var = this.f38056a;
            if (rl0Var != null) {
                rl0Var.a();
            }
            this.f38062r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f38062r) {
            rl0 rl0Var = this.f38056a;
            if (rl0Var != null) {
                rl0Var.b();
            }
            this.f38062r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        tl0 tl0Var = this.f38063s;
        Paint paint = tl0Var.f38495y;
        int width = (getWidth() - this.f38056a.f9088z) / 2;
        int height = getHeight();
        rl0 rl0Var = this.f38056a;
        int i10 = rl0Var.A;
        int i11 = (height - i10) / 2;
        gh.g gVar = this.f38058c;
        if (gVar != null) {
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set(width, i11, rl0Var.f9088z + width, i10 + i11);
            RectF rectF = this.f38061n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f38060f;
            if (!equals) {
                rectF2.set(rectF);
                dh.o0.h(rectF2, rectF, path);
            }
            rect.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            rect.right = org.telegram.messenger.g0.L(1.0f) + rect.right;
            gVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            gVar.draw(canvas);
            org.telegram.ui.ActionBar.e6 e6Var = tl0Var.f38487c;
            if (e6Var == null ? org.telegram.ui.ActionBar.k6.I.q() : e6Var.a()) {
                i3 = 687865855;
            } else {
                i3 = -1;
            }
            paint.setColor(i3);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f38056a.d(canvas, width, i11, this.f38057b.e(false, 1.0f), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int L;
        int L2 = org.telegram.messenger.g0.L(8.67f);
        rl0 rl0Var = this.f38056a;
        if (rl0Var != null) {
            L = rl0Var.f9088z;
        } else {
            L = org.telegram.messenger.g0.L(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L2 + L, 1073741824), i10);
    }
}
