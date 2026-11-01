package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
public final class rm0 extends View {
    public qm0 f30018a;
    public final t5 f30019b;
    public final vg.f f30020c;
    public sg.o0 d;
    public boolean e;
    public final Path f30021f;
    public final RectF h;
    public final RectF f30022n;
    public boolean f30023r;
    public final sm0 f30024s;

    public rm0(sm0 sm0Var, Context context) {
        super(context);
        this.f30024s = sm0Var;
        this.f30019b = new t5(this, 0L, 260L, gr.h);
        this.f30021f = new Path();
        this.h = new RectF();
        this.f30022n = new RectF();
        w7.e6.a(this);
        tg.b bVar = sm0Var.f30342w;
        if (bVar != null) {
            vg.f c10 = bVar.c(this, null, false);
            c10.o(sm0Var.f30343x);
            c10.t(org.telegram.messenger.i0.L(5.0f));
            c10.f50864s = false;
            vg.d dVar = c10.f50860e0;
            if (dVar != null) {
                dVar.g(false);
            }
            org.telegram.messenger.a30.u(c10, org.telegram.messenger.i0.L(6.0f), 4.0f);
            this.f30020c = c10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        qm0 qm0Var = this.f30018a;
        if (qm0Var != null) {
            qm0Var.f48419o = z10;
            t5 t5Var = this.f30019b;
            if (z11) {
                qm0Var.h = qm0Var.M;
                qm0Var.f48410f = qm0Var.N;
                qm0Var.f48412g = qm0Var.O;
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
        if (!this.f30023r) {
            qm0 qm0Var = this.f30018a;
            if (qm0Var != null) {
                qm0Var.a();
            }
            this.f30023r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f30023r) {
            qm0 qm0Var = this.f30018a;
            if (qm0Var != null) {
                qm0Var.b();
            }
            this.f30023r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        sm0 sm0Var = this.f30024s;
        Paint paint = sm0Var.f30344y;
        int width = (getWidth() - this.f30018a.f48429z) / 2;
        int height = getHeight();
        qm0 qm0Var = this.f30018a;
        int i11 = qm0Var.A;
        int i12 = (height - i11) / 2;
        vg.f fVar = this.f30020c;
        if (fVar != null) {
            Rect rect = org.telegram.messenger.i0.Q;
            rect.set(width, i12, qm0Var.f48429z + width, i11 + i12);
            RectF rectF = this.f30022n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f30021f;
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
            org.telegram.ui.ActionBar.p6 p6Var = sm0Var.f30337c;
            if (p6Var == null ? org.telegram.ui.ActionBar.t6.I.q() : p6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f30018a.d(canvas, width, i12, this.f30019b.e(false, 1.0f), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int L;
        int L2 = org.telegram.messenger.i0.L(8.67f);
        qm0 qm0Var = this.f30018a;
        if (qm0Var != null) {
            L = qm0Var.f48429z;
        } else {
            L = org.telegram.messenger.i0.L(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L2 + L, 1073741824), i11);
    }
}
