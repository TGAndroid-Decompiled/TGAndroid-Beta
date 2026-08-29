package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dn0 extends View {
    public cn0 f27814a;
    public final d6 f27815b;
    public final ng.d f27816c;
    public kg.q0 d;
    public boolean f27817e;
    public final Path f27818f;
    public final RectF h;
    public final RectF f27819n;
    public boolean f27820r;
    public final en0 f27821s;

    public dn0(en0 en0Var, Context context) {
        super(context);
        this.f27821s = en0Var;
        this.f27815b = new d6(this, 0L, 260L, jr.h);
        this.f27818f = new Path();
        this.h = new RectF();
        this.f27819n = new RectF();
        i7.h6.a(this);
        lg.a aVar = en0Var.v;
        if (aVar != null) {
            ng.d c3 = aVar.c(this, null, false);
            c3.n(en0Var.f28124w);
            c3.t(AndroidUtilities.dp(5.0f));
            ng.d m10 = c3.m();
            m10.p(AndroidUtilities.dp(6.0f));
            m10.o(AndroidUtilities.dp(4.0f));
            this.f27816c = m10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f27817e == z10) {
            return;
        }
        this.f27817e = z10;
        cn0 cn0Var = this.f27814a;
        if (cn0Var != null) {
            cn0Var.f13810p = z10;
            d6 d6Var = this.f27815b;
            if (z11) {
                cn0Var.f13803i = cn0Var.N;
                cn0Var.f13801g = cn0Var.O;
                cn0Var.h = cn0Var.P;
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
        if (!this.f27820r) {
            cn0 cn0Var = this.f27814a;
            if (cn0Var != null) {
                cn0Var.a();
            }
            this.f27820r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f27820r) {
            cn0 cn0Var = this.f27814a;
            if (cn0Var != null) {
                cn0Var.b();
            }
            this.f27820r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        en0 en0Var = this.f27821s;
        Paint paint = en0Var.f28125x;
        int width = (getWidth() - this.f27814a.A) / 2;
        int height = getHeight();
        cn0 cn0Var = this.f27814a;
        int i11 = cn0Var.B;
        int i12 = (height - i11) / 2;
        ng.d dVar = this.f27816c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, cn0Var.A + width, i11 + i12);
            RectF rectF = this.f27819n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f27818f;
            if (!equals) {
                rectF2.set(rectF);
                kg.r0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.c6 c6Var = en0Var.f28118c;
            if (c6Var == null ? org.telegram.ui.ActionBar.g6.I.q() : c6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f27814a.d(canvas, width, i12, this.f27815b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        cn0 cn0Var = this.f27814a;
        if (cn0Var != null) {
            dp = cn0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
