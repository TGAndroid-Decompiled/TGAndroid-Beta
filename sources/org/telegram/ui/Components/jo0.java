package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jo0 extends View {
    public io0 f26420a;
    public final g6 f26421b;
    public final dh.d f26422c;
    public ah.i1 d;
    public boolean e;
    public final Path f26423f;
    public final RectF h;
    public final RectF f26424n;
    public boolean f26425r;
    public final ko0 f26426s;

    public jo0(ko0 ko0Var, Context context) {
        super(context);
        this.f26426s = ko0Var;
        this.f26421b = new g6(this, 0L, 260L, es.h);
        this.f26423f = new Path();
        this.h = new RectF();
        this.f26424n = new RectF();
        w7.c6.a(this);
        bh.b bVar = ko0Var.v;
        if (bVar != null) {
            dh.d c10 = bVar.c(this, null, false);
            c10.o(ko0Var.f26771w);
            c10.u(AndroidUtilities.dp(5.0f));
            dh.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.f26422c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        io0 io0Var = this.f26420a;
        if (io0Var != null) {
            io0Var.f755p = z10;
            g6 g6Var = this.f26421b;
            if (z11) {
                io0Var.f748i = io0Var.N;
                io0Var.f746g = io0Var.O;
                io0Var.h = io0Var.P;
                g6Var.d(0.0f, true);
            } else {
                g6Var.d(1.0f, true);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f26425r) {
            io0 io0Var = this.f26420a;
            if (io0Var != null) {
                io0Var.a();
            }
            this.f26425r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f26425r) {
            io0 io0Var = this.f26420a;
            if (io0Var != null) {
                io0Var.b();
            }
            this.f26425r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        ko0 ko0Var = this.f26426s;
        Paint paint = ko0Var.f26772x;
        int width = (getWidth() - this.f26420a.A) / 2;
        int height = getHeight();
        io0 io0Var = this.f26420a;
        int i11 = io0Var.B;
        int i12 = (height - i11) / 2;
        dh.d dVar = this.f26422c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, io0Var.A + width, i11 + i12);
            RectF rectF = this.f26424n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f26423f;
            if (!equals) {
                rectF2.set(rectF);
                ah.j1.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.c6 c6Var = ko0Var.f26766c;
            if (c6Var == null ? org.telegram.ui.ActionBar.g6.I.q() : c6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f26420a.d(canvas, width, i12, this.f26421b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        io0 io0Var = this.f26420a;
        if (io0Var != null) {
            dp = io0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
