package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class io0 extends View {
    public ho0 f27376a;
    public final f6 f27377b;
    public final dh.d f27378c;
    public ah.i1 d;
    public boolean e;
    public final Path f27379f;
    public final RectF h;
    public final RectF f27380n;
    public boolean f27381r;
    public final jo0 f27382s;

    public io0(jo0 jo0Var, Context context) {
        super(context);
        this.f27382s = jo0Var;
        this.f27377b = new f6(this, 0L, 260L, bs.h);
        this.f27379f = new Path();
        this.h = new RectF();
        this.f27380n = new RectF();
        w7.b6.a(this);
        bh.b bVar = jo0Var.v;
        if (bVar != null) {
            dh.d c10 = bVar.c(this, null, false);
            c10.o(jo0Var.f27729w);
            c10.u(AndroidUtilities.dp(5.0f));
            dh.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.f27378c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        ho0 ho0Var = this.f27376a;
        if (ho0Var != null) {
            ho0Var.f760p = z10;
            f6 f6Var = this.f27377b;
            if (z11) {
                ho0Var.f753i = ho0Var.N;
                ho0Var.f751g = ho0Var.O;
                ho0Var.h = ho0Var.P;
                f6Var.d(0.0f, true);
            } else {
                f6Var.d(1.0f, true);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f27381r) {
            ho0 ho0Var = this.f27376a;
            if (ho0Var != null) {
                ho0Var.a();
            }
            this.f27381r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f27381r) {
            ho0 ho0Var = this.f27376a;
            if (ho0Var != null) {
                ho0Var.b();
            }
            this.f27381r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        jo0 jo0Var = this.f27382s;
        Paint paint = jo0Var.f27730x;
        int width = (getWidth() - this.f27376a.A) / 2;
        int height = getHeight();
        ho0 ho0Var = this.f27376a;
        int i11 = ho0Var.B;
        int i12 = (height - i11) / 2;
        dh.d dVar = this.f27378c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, ho0Var.A + width, i11 + i12);
            RectF rectF = this.f27380n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f27379f;
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
            org.telegram.ui.ActionBar.g6 g6Var = jo0Var.f27724c;
            if (g6Var == null ? org.telegram.ui.ActionBar.k6.I.q() : g6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f27376a.d(canvas, width, i12, this.f27377b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        ho0 ho0Var = this.f27376a;
        if (ho0Var != null) {
            dp = ho0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
