package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fo0 extends View {
    public eo0 f26329a;
    public final f6 f26330b;
    public final dh.d f26331c;
    public ah.i1 d;
    public boolean e;
    public final Path f26332f;
    public final RectF h;
    public final RectF f26333n;
    public boolean f26334r;
    public final go0 f26335s;

    public fo0(go0 go0Var, Context context) {
        super(context);
        this.f26335s = go0Var;
        this.f26330b = new f6(this, 0L, 260L, bs.h);
        this.f26332f = new Path();
        this.h = new RectF();
        this.f26333n = new RectF();
        w7.b6.a(this);
        bh.b bVar = go0Var.v;
        if (bVar != null) {
            dh.d c10 = bVar.c(this, null, false);
            c10.o(go0Var.f26625w);
            c10.u(AndroidUtilities.dp(5.0f));
            dh.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.f26331c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        eo0 eo0Var = this.f26329a;
        if (eo0Var != null) {
            eo0Var.f759p = z10;
            f6 f6Var = this.f26330b;
            if (z11) {
                eo0Var.f752i = eo0Var.N;
                eo0Var.f750g = eo0Var.O;
                eo0Var.h = eo0Var.P;
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
        if (!this.f26334r) {
            eo0 eo0Var = this.f26329a;
            if (eo0Var != null) {
                eo0Var.a();
            }
            this.f26334r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f26334r) {
            eo0 eo0Var = this.f26329a;
            if (eo0Var != null) {
                eo0Var.b();
            }
            this.f26334r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        go0 go0Var = this.f26335s;
        Paint paint = go0Var.f26626x;
        int width = (getWidth() - this.f26329a.A) / 2;
        int height = getHeight();
        eo0 eo0Var = this.f26329a;
        int i11 = eo0Var.B;
        int i12 = (height - i11) / 2;
        dh.d dVar = this.f26331c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, eo0Var.A + width, i11 + i12);
            RectF rectF = this.f26333n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f26332f;
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
            org.telegram.ui.ActionBar.d6 d6Var = go0Var.f26620c;
            if (d6Var == null ? org.telegram.ui.ActionBar.h6.I.q() : d6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f26329a.d(canvas, width, i12, this.f26330b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        eo0 eo0Var = this.f26329a;
        if (eo0Var != null) {
            dp = eo0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
