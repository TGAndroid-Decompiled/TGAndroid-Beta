package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
public final class bm0 extends View {
    public am0 f33716a;
    public final c6 f33717b;
    public final fh.g f33718c;
    public ch.p0 d;
    public boolean f33719e;
    public final Path f33720f;
    public final RectF h;
    public final RectF f33721n;
    public boolean f33722r;
    public final cm0 f33723s;

    public bm0(cm0 cm0Var, Context context) {
        super(context);
        this.f33723s = cm0Var;
        this.f33717b = new c6(this, 0L, 260L, lr.h);
        this.f33720f = new Path();
        this.h = new RectF();
        this.f33721n = new RectF();
        c8.ra.a(this);
        dh.c cVar = cm0Var.f34111w;
        if (cVar != null) {
            fh.g c10 = cVar.c(this, null, false);
            c10.p(cm0Var.f34112x);
            c10.u(org.telegram.messenger.g0.L(5.0f));
            c10.f11670s = false;
            fh.e eVar = c10.f11667g0;
            if (eVar != null) {
                eVar.g(false);
            }
            org.telegram.messenger.n10.s(c10, org.telegram.messenger.g0.L(6.0f), 4.0f);
            this.f33718c = c10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f33719e == z10) {
            return;
        }
        this.f33719e = z10;
        am0 am0Var = this.f33716a;
        if (am0Var != null) {
            am0Var.f5445o = z10;
            c6 c6Var = this.f33717b;
            if (z11) {
                am0Var.h = am0Var.M;
                am0Var.f5436f = am0Var.N;
                am0Var.f5438g = am0Var.O;
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
        if (!this.f33722r) {
            am0 am0Var = this.f33716a;
            if (am0Var != null) {
                am0Var.a();
            }
            this.f33722r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f33722r) {
            am0 am0Var = this.f33716a;
            if (am0Var != null) {
                am0Var.b();
            }
            this.f33722r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        cm0 cm0Var = this.f33723s;
        Paint paint = cm0Var.f34113y;
        int width = (getWidth() - this.f33716a.f5455z) / 2;
        int height = getHeight();
        am0 am0Var = this.f33716a;
        int i10 = am0Var.A;
        int i11 = (height - i10) / 2;
        fh.g gVar = this.f33718c;
        if (gVar != null) {
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set(width, i11, am0Var.f5455z + width, i10 + i11);
            RectF rectF = this.f33721n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f33720f;
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
            org.telegram.ui.ActionBar.i6 i6Var = cm0Var.f34105c;
            if (i6Var == null ? org.telegram.ui.ActionBar.n6.I.q() : i6Var.d()) {
                i7 = 687865855;
            } else {
                i7 = -1;
            }
            paint.setColor(i7);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f33716a.d(canvas, width, i11, this.f33717b.e(false, 1.0f), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        int L2 = org.telegram.messenger.g0.L(8.67f);
        am0 am0Var = this.f33716a;
        if (am0Var != null) {
            L = am0Var.f5455z;
        } else {
            L = org.telegram.messenger.g0.L(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L2 + L, 1073741824), i10);
    }
}
