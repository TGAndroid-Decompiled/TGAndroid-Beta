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
    public fn0 f26461a;
    public final e6 f26462b;
    public final dh.d f26463c;
    public ah.j1 d;
    public boolean f26464e;
    public final Path f26465f;
    public final RectF h;
    public final RectF f26466n;
    public boolean f26467r;
    public final hn0 f26468s;

    public gn0(hn0 hn0Var, Context context) {
        super(context);
        this.f26468s = hn0Var;
        this.f26462b = new e6(this, 0L, 260L, pr.h);
        this.f26465f = new Path();
        this.h = new RectF();
        this.f26466n = new RectF();
        w7.z5.a(this);
        bh.b bVar = hn0Var.v;
        if (bVar != null) {
            dh.d c10 = bVar.c(this, null, false);
            c10.n(hn0Var.f26770w);
            c10.t(AndroidUtilities.dp(5.0f));
            dh.d m10 = c10.m();
            m10.p(AndroidUtilities.dp(6.0f));
            m10.o(AndroidUtilities.dp(4.0f));
            this.f26463c = m10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f26464e == z10) {
            return;
        }
        this.f26464e = z10;
        fn0 fn0Var = this.f26461a;
        if (fn0Var != null) {
            fn0Var.f572p = z10;
            e6 e6Var = this.f26462b;
            if (z11) {
                fn0Var.f565i = fn0Var.N;
                fn0Var.f563g = fn0Var.O;
                fn0Var.h = fn0Var.P;
                e6Var.d(0.0f, true);
            } else {
                e6Var.d(1.0f, true);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f26467r) {
            fn0 fn0Var = this.f26461a;
            if (fn0Var != null) {
                fn0Var.a();
            }
            this.f26467r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f26467r) {
            fn0 fn0Var = this.f26461a;
            if (fn0Var != null) {
                fn0Var.b();
            }
            this.f26467r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        hn0 hn0Var = this.f26468s;
        Paint paint = hn0Var.f26771x;
        int width = (getWidth() - this.f26461a.A) / 2;
        int height = getHeight();
        fn0 fn0Var = this.f26461a;
        int i11 = fn0Var.B;
        int i12 = (height - i11) / 2;
        dh.d dVar = this.f26463c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, fn0Var.A + width, i11 + i12);
            RectF rectF = this.f26466n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f26465f;
            if (!equals) {
                rectF2.set(rectF);
                ah.k1.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.f6 f6Var = hn0Var.f26764c;
            if (f6Var == null ? org.telegram.ui.ActionBar.j6.I.q() : f6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f26461a.d(canvas, width, i12, this.f26462b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        fn0 fn0Var = this.f26461a;
        if (fn0Var != null) {
            dp = fn0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
