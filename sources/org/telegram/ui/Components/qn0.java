package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class qn0 extends View {
    public pn0 f26450a;
    public final d6 f26451b;
    public final bh.d f26452c;
    public yg.p0 d;
    public boolean e;
    public final Path f26453f;
    public final RectF h;
    public final RectF f26454n;
    public boolean f26455r;
    public final rn0 f26456s;

    public qn0(rn0 rn0Var, Context context) {
        super(context);
        this.f26456s = rn0Var;
        this.f26451b = new d6(this, 0L, 260L, wr.h);
        this.f26453f = new Path();
        this.h = new RectF();
        this.f26454n = new RectF();
        w7.c6.a(this);
        zg.a aVar = rn0Var.v;
        if (aVar != null) {
            bh.d c10 = aVar.c(this, null, false);
            c10.n(rn0Var.f26704w);
            c10.t(AndroidUtilities.dp(5.0f));
            bh.d m10 = c10.m();
            m10.p(AndroidUtilities.dp(6.0f));
            m10.o(AndroidUtilities.dp(4.0f));
            this.f26452c = m10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        pn0 pn0Var = this.f26450a;
        if (pn0Var != null) {
            pn0Var.f47086p = z10;
            d6 d6Var = this.f26451b;
            if (z11) {
                pn0Var.f47079i = pn0Var.N;
                pn0Var.f47077g = pn0Var.O;
                pn0Var.h = pn0Var.P;
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
        if (!this.f26455r) {
            pn0 pn0Var = this.f26450a;
            if (pn0Var != null) {
                pn0Var.a();
            }
            this.f26455r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f26455r) {
            pn0 pn0Var = this.f26450a;
            if (pn0Var != null) {
                pn0Var.b();
            }
            this.f26455r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        rn0 rn0Var = this.f26456s;
        Paint paint = rn0Var.f26705x;
        int width = (getWidth() - this.f26450a.A) / 2;
        int height = getHeight();
        pn0 pn0Var = this.f26450a;
        int i11 = pn0Var.B;
        int i12 = (height - i11) / 2;
        bh.d dVar = this.f26452c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, pn0Var.A + width, i11 + i12);
            RectF rectF = this.f26454n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f26453f;
            if (!equals) {
                rectF2.set(rectF);
                yg.q0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.f6 f6Var = rn0Var.f26699c;
            if (f6Var == null ? org.telegram.ui.ActionBar.j6.I.q() : f6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f26450a.d(canvas, width, i12, this.f26451b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        pn0 pn0Var = this.f26450a;
        if (pn0Var != null) {
            dp = pn0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
