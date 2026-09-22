package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gn0 extends View {
    public fn0 f24421a;
    public final c6 f24422b;
    public final ch.d f24423c;
    public zg.p0 d;
    public boolean e;
    public final Path f24424f;
    public final RectF h;
    public final RectF f24425n;
    public boolean f24426r;
    public final hn0 f24427s;

    public gn0(hn0 hn0Var, Context context) {
        super(context);
        this.f24427s = hn0Var;
        this.f24422b = new c6(this, 0L, 260L, qr.h);
        this.f24424f = new Path();
        this.h = new RectF();
        this.f24425n = new RectF();
        w7.z5.a(this);
        ah.c cVar = hn0Var.v;
        if (cVar != null) {
            ch.d c10 = cVar.c(this, null, false);
            c10.o(hn0Var.f24735w);
            c10.u(AndroidUtilities.dp(5.0f));
            ch.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.f24423c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        fn0 fn0Var = this.f24421a;
        if (fn0Var != null) {
            fn0Var.f49104p = z10;
            c6 c6Var = this.f24422b;
            if (z11) {
                fn0Var.f49097i = fn0Var.N;
                fn0Var.f49095g = fn0Var.O;
                fn0Var.h = fn0Var.P;
                c6Var.d(0.0f, true);
            } else {
                c6Var.d(1.0f, true);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f24426r) {
            fn0 fn0Var = this.f24421a;
            if (fn0Var != null) {
                fn0Var.a();
            }
            this.f24426r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f24426r) {
            fn0 fn0Var = this.f24421a;
            if (fn0Var != null) {
                fn0Var.b();
            }
            this.f24426r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        hn0 hn0Var = this.f24427s;
        Paint paint = hn0Var.f24736x;
        int width = (getWidth() - this.f24421a.A) / 2;
        int height = getHeight();
        fn0 fn0Var = this.f24421a;
        int i11 = fn0Var.B;
        int i12 = (height - i11) / 2;
        ch.d dVar = this.f24423c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, fn0Var.A + width, i11 + i12);
            RectF rectF = this.f24425n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f24424f;
            if (!equals) {
                rectF2.set(rectF);
                zg.q0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.e6 e6Var = hn0Var.f24730c;
            if (e6Var == null ? org.telegram.ui.ActionBar.i6.I.q() : e6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f24421a.d(canvas, width, i12, this.f24422b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        fn0 fn0Var = this.f24421a;
        if (fn0Var != null) {
            dp = fn0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
