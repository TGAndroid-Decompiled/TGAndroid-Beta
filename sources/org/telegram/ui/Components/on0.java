package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class on0 extends View {
    public nn0 f29821a;
    public final z5 f29822b;
    public final qg.b f29823c;
    public ng.q0 d;
    public boolean f29824e;
    public final Path f29825f;
    public final RectF h;
    public final RectF f29826n;
    public boolean f29827r;
    public final pn0 f29828s;

    public on0(pn0 pn0Var, Context context) {
        super(context);
        this.f29828s = pn0Var;
        this.f29822b = new z5(this, 0L, 260L, pr.h);
        this.f29825f = new Path();
        this.h = new RectF();
        this.f29826n = new RectF();
        k7.e6.a(this);
        og.a aVar = pn0Var.v;
        if (aVar != null) {
            qg.b c3 = aVar.c(this, null, false);
            c3.n(pn0Var.f30136w);
            c3.t(AndroidUtilities.dp(5.0f));
            qg.b m9 = c3.m();
            m9.p(AndroidUtilities.dp(6.0f));
            m9.o(AndroidUtilities.dp(4.0f));
            this.f29823c = m9;
        }
    }

    public final void a(boolean z4, boolean z10) {
        if (this.f29824e == z4) {
            return;
        }
        this.f29824e = z4;
        nn0 nn0Var = this.f29821a;
        if (nn0Var != null) {
            nn0Var.f16162p = z4;
            z5 z5Var = this.f29822b;
            if (z10) {
                nn0Var.f16155i = nn0Var.N;
                nn0Var.f16153g = nn0Var.O;
                nn0Var.h = nn0Var.P;
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
        if (!this.f29827r) {
            nn0 nn0Var = this.f29821a;
            if (nn0Var != null) {
                nn0Var.a();
            }
            this.f29827r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f29827r) {
            nn0 nn0Var = this.f29821a;
            if (nn0Var != null) {
                nn0Var.b();
            }
            this.f29827r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        pn0 pn0Var = this.f29828s;
        Paint paint = pn0Var.f30137x;
        int width = (getWidth() - this.f29821a.A) / 2;
        int height = getHeight();
        nn0 nn0Var = this.f29821a;
        int i11 = nn0Var.B;
        int i12 = (height - i11) / 2;
        qg.b bVar = this.f29823c;
        if (bVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, nn0Var.A + width, i11 + i12);
            RectF rectF = this.f29826n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f29825f;
            if (!equals) {
                rectF2.set(rectF);
                ng.r0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            bVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            bVar.draw(canvas);
            org.telegram.ui.ActionBar.g6 g6Var = pn0Var.f30130c;
            if (g6Var == null ? org.telegram.ui.ActionBar.k6.I.q() : g6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f29821a.d(canvas, width, i12, this.f29822b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        nn0 nn0Var = this.f29821a;
        if (nn0Var != null) {
            dp = nn0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
