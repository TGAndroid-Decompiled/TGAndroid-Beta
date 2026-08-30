package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class nn0 extends View {
    public mn0 f27324a;
    public final z5 f27325b;
    public final pg.b f27326c;
    public mg.q0 d;
    public boolean e;
    public final Path f27327f;
    public final RectF h;
    public final RectF f27328n;
    public boolean f27329r;
    public final on0 f27330s;

    public nn0(on0 on0Var, Context context) {
        super(context);
        this.f27330s = on0Var;
        this.f27325b = new z5(this, 0L, 260L, nr.h);
        this.f27327f = new Path();
        this.h = new RectF();
        this.f27328n = new RectF();
        k7.d6.a(this);
        ng.a aVar = on0Var.v;
        if (aVar != null) {
            pg.b c3 = aVar.c(this, null, false);
            c3.n(on0Var.f27607w);
            c3.t(AndroidUtilities.dp(5.0f));
            pg.b m9 = c3.m();
            m9.p(AndroidUtilities.dp(6.0f));
            m9.o(AndroidUtilities.dp(4.0f));
            this.f27326c = m9;
        }
    }

    public final void a(boolean z4, boolean z10) {
        if (this.e == z4) {
            return;
        }
        this.e = z4;
        mn0 mn0Var = this.f27324a;
        if (mn0Var != null) {
            mn0Var.f14092p = z4;
            z5 z5Var = this.f27325b;
            if (z10) {
                mn0Var.f14085i = mn0Var.N;
                mn0Var.f14083g = mn0Var.O;
                mn0Var.h = mn0Var.P;
                z5Var.d(0.0f, true);
            } else {
                z5Var.d(1.0f, true);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f27329r) {
            mn0 mn0Var = this.f27324a;
            if (mn0Var != null) {
                mn0Var.a();
            }
            this.f27329r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f27329r) {
            mn0 mn0Var = this.f27324a;
            if (mn0Var != null) {
                mn0Var.b();
            }
            this.f27329r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        on0 on0Var = this.f27330s;
        Paint paint = on0Var.f27608x;
        int width = (getWidth() - this.f27324a.A) / 2;
        int height = getHeight();
        mn0 mn0Var = this.f27324a;
        int i11 = mn0Var.B;
        int i12 = (height - i11) / 2;
        pg.b bVar = this.f27326c;
        if (bVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, mn0Var.A + width, i11 + i12);
            RectF rectF = this.f27328n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f27327f;
            if (!equals) {
                rectF2.set(rectF);
                mg.r0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            bVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            bVar.draw(canvas);
            org.telegram.ui.ActionBar.f6 f6Var = on0Var.f27602c;
            if (f6Var == null ? org.telegram.ui.ActionBar.j6.I.q() : f6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f27324a.d(canvas, width, i12, this.f27325b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        mn0 mn0Var = this.f27324a;
        if (mn0Var != null) {
            dp = mn0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
