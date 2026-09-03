package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mn0 extends View {
    public ln0 f27098a;
    public final z5 f27099b;
    public final pg.b f27100c;
    public mg.q0 d;
    public boolean e;
    public final Path f27101f;
    public final RectF h;
    public final RectF f27102n;
    public boolean f27103r;
    public final nn0 f27104s;

    public mn0(nn0 nn0Var, Context context) {
        super(context);
        this.f27104s = nn0Var;
        this.f27099b = new z5(this, 0L, 260L, mr.h);
        this.f27101f = new Path();
        this.h = new RectF();
        this.f27102n = new RectF();
        k7.d6.a(this);
        ng.a aVar = nn0Var.v;
        if (aVar != null) {
            pg.b c3 = aVar.c(this, null, false);
            c3.n(nn0Var.f27315w);
            c3.t(AndroidUtilities.dp(5.0f));
            pg.b m9 = c3.m();
            m9.p(AndroidUtilities.dp(6.0f));
            m9.o(AndroidUtilities.dp(4.0f));
            this.f27100c = m9;
        }
    }

    public final void a(boolean z4, boolean z10) {
        if (this.e == z4) {
            return;
        }
        this.e = z4;
        ln0 ln0Var = this.f27098a;
        if (ln0Var != null) {
            ln0Var.f14080p = z4;
            z5 z5Var = this.f27099b;
            if (z10) {
                ln0Var.f14073i = ln0Var.N;
                ln0Var.f14071g = ln0Var.O;
                ln0Var.h = ln0Var.P;
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
        if (!this.f27103r) {
            ln0 ln0Var = this.f27098a;
            if (ln0Var != null) {
                ln0Var.a();
            }
            this.f27103r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f27103r) {
            ln0 ln0Var = this.f27098a;
            if (ln0Var != null) {
                ln0Var.b();
            }
            this.f27103r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        nn0 nn0Var = this.f27104s;
        Paint paint = nn0Var.f27316x;
        int width = (getWidth() - this.f27098a.A) / 2;
        int height = getHeight();
        ln0 ln0Var = this.f27098a;
        int i11 = ln0Var.B;
        int i12 = (height - i11) / 2;
        pg.b bVar = this.f27100c;
        if (bVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, ln0Var.A + width, i11 + i12);
            RectF rectF = this.f27102n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f27101f;
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
            org.telegram.ui.ActionBar.f6 f6Var = nn0Var.f27310c;
            if (f6Var == null ? org.telegram.ui.ActionBar.j6.I.q() : f6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f27098a.d(canvas, width, i12, this.f27099b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        ln0 ln0Var = this.f27098a;
        if (ln0Var != null) {
            dp = ln0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
