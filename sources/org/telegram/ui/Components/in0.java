package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class in0 extends View {
    public hn0 f24967a;
    public final c6 f24968b;
    public final ch.d f24969c;
    public zg.p0 d;
    public boolean e;
    public final Path f24970f;
    public final RectF h;
    public final RectF f24971n;
    public boolean f24972r;
    public final jn0 f24973s;

    public in0(jn0 jn0Var, Context context) {
        super(context);
        this.f24973s = jn0Var;
        this.f24968b = new c6(this, 0L, 260L, qr.h);
        this.f24970f = new Path();
        this.h = new RectF();
        this.f24971n = new RectF();
        w7.z5.a(this);
        ah.c cVar = jn0Var.v;
        if (cVar != null) {
            ch.d c10 = cVar.c(this, null, false);
            c10.o(jn0Var.f25365w);
            c10.u(AndroidUtilities.dp(5.0f));
            ch.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.f24969c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        hn0 hn0Var = this.f24967a;
        if (hn0Var != null) {
            hn0Var.f49139p = z10;
            c6 c6Var = this.f24968b;
            if (z11) {
                hn0Var.f49132i = hn0Var.N;
                hn0Var.f49130g = hn0Var.O;
                hn0Var.h = hn0Var.P;
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
        if (!this.f24972r) {
            hn0 hn0Var = this.f24967a;
            if (hn0Var != null) {
                hn0Var.a();
            }
            this.f24972r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f24972r) {
            hn0 hn0Var = this.f24967a;
            if (hn0Var != null) {
                hn0Var.b();
            }
            this.f24972r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        jn0 jn0Var = this.f24973s;
        Paint paint = jn0Var.f25366x;
        int width = (getWidth() - this.f24967a.A) / 2;
        int height = getHeight();
        hn0 hn0Var = this.f24967a;
        int i11 = hn0Var.B;
        int i12 = (height - i11) / 2;
        ch.d dVar = this.f24969c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, hn0Var.A + width, i11 + i12);
            RectF rectF = this.f24971n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f24970f;
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
            org.telegram.ui.ActionBar.f6 f6Var = jn0Var.f25360c;
            if (f6Var == null ? org.telegram.ui.ActionBar.j6.I.q() : f6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f24967a.d(canvas, width, i12, this.f24968b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        hn0 hn0Var = this.f24967a;
        if (hn0Var != null) {
            dp = hn0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
