package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ho0 extends View {
    public go0 f27088a;
    public final d6 f27089b;
    public final dh.d f27090c;
    public ah.i1 d;
    public boolean e;
    public final Path f27091f;
    public final RectF h;
    public final RectF f27092n;
    public boolean f27093r;
    public final io0 f27094s;

    public ho0(io0 io0Var, Context context) {
        super(context);
        this.f27094s = io0Var;
        this.f27089b = new d6(this, 0L, 260L, zr.h);
        this.f27091f = new Path();
        this.h = new RectF();
        this.f27092n = new RectF();
        w7.b6.a(this);
        bh.b bVar = io0Var.v;
        if (bVar != null) {
            dh.d c10 = bVar.c(this, null, false);
            c10.o(io0Var.f27459w);
            c10.u(AndroidUtilities.dp(5.0f));
            dh.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.f27090c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        go0 go0Var = this.f27088a;
        if (go0Var != null) {
            go0Var.f760p = z10;
            d6 d6Var = this.f27089b;
            if (z11) {
                go0Var.f753i = go0Var.N;
                go0Var.f751g = go0Var.O;
                go0Var.h = go0Var.P;
                d6Var.d(0.0f, true);
            } else {
                d6Var.d(1.0f, true);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f27093r) {
            go0 go0Var = this.f27088a;
            if (go0Var != null) {
                go0Var.a();
            }
            this.f27093r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f27093r) {
            go0 go0Var = this.f27088a;
            if (go0Var != null) {
                go0Var.b();
            }
            this.f27093r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        io0 io0Var = this.f27094s;
        Paint paint = io0Var.f27460x;
        int width = (getWidth() - this.f27088a.A) / 2;
        int height = getHeight();
        go0 go0Var = this.f27088a;
        int i11 = go0Var.B;
        int i12 = (height - i11) / 2;
        dh.d dVar = this.f27090c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, go0Var.A + width, i11 + i12);
            RectF rectF = this.f27092n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f27091f;
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
            org.telegram.ui.ActionBar.g6 g6Var = io0Var.f27454c;
            if (g6Var == null ? org.telegram.ui.ActionBar.k6.I.q() : g6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f27088a.d(canvas, width, i12, this.f27089b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        go0 go0Var = this.f27088a;
        if (go0Var != null) {
            dp = go0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
