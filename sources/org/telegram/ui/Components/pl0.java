package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
public final class pl0 extends View {
    public ol0 f37009a;
    public final w5 f37010b;
    public final fh.g f37011c;
    public ch.o0 d;
    public boolean f37012e;
    public final Path f37013f;
    public final RectF h;
    public final RectF f37014n;
    public boolean f37015r;
    public final ql0 f37016s;

    public pl0(ql0 ql0Var, Context context) {
        super(context);
        this.f37016s = ql0Var;
        this.f37010b = new w5(this, 0L, 260L, xq.h);
        this.f37013f = new Path();
        this.h = new RectF();
        this.f37014n = new RectF();
        c8.ka.a(this);
        dh.c cVar = ql0Var.f37365w;
        if (cVar != null) {
            fh.g c10 = cVar.c(this, null, false);
            c10.p(ql0Var.f37366x);
            c10.u(org.telegram.messenger.g0.L(5.0f));
            c10.f11538s = false;
            fh.e eVar = c10.f11535f0;
            if (eVar != null) {
                eVar.g(false);
            }
            org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(6.0f), 4.0f);
            this.f37011c = c10;
        }
    }

    public final void a(boolean z9, boolean z10) {
        if (this.f37012e == z9) {
            return;
        }
        this.f37012e = z9;
        ol0 ol0Var = this.f37009a;
        if (ol0Var != null) {
            ol0Var.f6327o = z9;
            w5 w5Var = this.f37010b;
            if (z10) {
                ol0Var.h = ol0Var.M;
                ol0Var.f6318f = ol0Var.N;
                ol0Var.f6320g = ol0Var.O;
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
        if (!this.f37015r) {
            ol0 ol0Var = this.f37009a;
            if (ol0Var != null) {
                ol0Var.a();
            }
            this.f37015r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37015r) {
            ol0 ol0Var = this.f37009a;
            if (ol0Var != null) {
                ol0Var.b();
            }
            this.f37015r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        ql0 ql0Var = this.f37016s;
        Paint paint = ql0Var.f37367y;
        int width = (getWidth() - this.f37009a.f6337z) / 2;
        int height = getHeight();
        ol0 ol0Var = this.f37009a;
        int i10 = ol0Var.A;
        int i11 = (height - i10) / 2;
        fh.g gVar = this.f37011c;
        if (gVar != null) {
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set(width, i11, ol0Var.f6337z + width, i10 + i11);
            RectF rectF = this.f37014n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f37013f;
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
            org.telegram.ui.ActionBar.f6 f6Var = ql0Var.f37359c;
            if (f6Var == null ? org.telegram.ui.ActionBar.k6.I.q() : f6Var.a()) {
                i7 = 687865855;
            } else {
                i7 = -1;
            }
            paint.setColor(i7);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f37009a.d(canvas, width, i11, this.f37010b.e(false, 1.0f), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        int L2 = org.telegram.messenger.g0.L(8.67f);
        ol0 ol0Var = this.f37009a;
        if (ol0Var != null) {
            L = ol0Var.f6337z;
        } else {
            L = org.telegram.messenger.g0.L(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L2 + L, 1073741824), i10);
    }
}
