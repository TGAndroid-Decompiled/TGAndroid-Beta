package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mo0 extends View {
    public lo0 f28871a;
    public final g6 f28872b;
    public final ch.d f28873c;
    public zg.n0 d;
    public boolean f28874e;
    public final Path f28875f;
    public final RectF h;
    public final RectF f28876n;
    public boolean f28877r;
    public final no0 f28878s;

    public mo0(no0 no0Var, Context context) {
        super(context);
        this.f28878s = no0Var;
        this.f28872b = new g6(this, 0L, 260L, hs.h);
        this.f28875f = new Path();
        this.h = new RectF();
        this.f28876n = new RectF();
        w7.z5.a(this);
        ah.c cVar = no0Var.v;
        if (cVar != null) {
            ch.d c10 = cVar.c(this, null, false);
            c10.o(no0Var.f29227w);
            c10.u(AndroidUtilities.dp(5.0f));
            ch.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.f28873c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f28874e == z10) {
            return;
        }
        this.f28874e = z10;
        lo0 lo0Var = this.f28871a;
        if (lo0Var != null) {
            lo0Var.f54600p = z10;
            g6 g6Var = this.f28872b;
            if (z11) {
                lo0Var.f54593i = lo0Var.N;
                lo0Var.f54591g = lo0Var.O;
                lo0Var.h = lo0Var.P;
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
        if (!this.f28877r) {
            lo0 lo0Var = this.f28871a;
            if (lo0Var != null) {
                lo0Var.a();
            }
            this.f28877r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f28877r) {
            lo0 lo0Var = this.f28871a;
            if (lo0Var != null) {
                lo0Var.b();
            }
            this.f28877r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        no0 no0Var = this.f28878s;
        Paint paint = no0Var.f29228x;
        int width = (getWidth() - this.f28871a.A) / 2;
        int height = getHeight();
        lo0 lo0Var = this.f28871a;
        int i11 = lo0Var.B;
        int i12 = (height - i11) / 2;
        ch.d dVar = this.f28873c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, lo0Var.A + width, i11 + i12);
            RectF rectF = this.f28876n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f28875f;
            if (!equals) {
                rectF2.set(rectF);
                zg.o0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.e6 e6Var = no0Var.f29221c;
            if (e6Var == null ? org.telegram.ui.ActionBar.i6.I.q() : e6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f28871a.d(canvas, width, i12, this.f28872b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        lo0 lo0Var = this.f28871a;
        if (lo0Var != null) {
            dp = lo0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
