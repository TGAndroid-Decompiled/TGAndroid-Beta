package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class so0 extends View {
    public ro0 f30600a;
    public final g6 f30601b;
    public final ch.d f30602c;
    public zg.n0 d;
    public boolean f30603e;
    public final Path f30604f;
    public final RectF h;
    public final RectF f30605n;
    public boolean f30606r;
    public final to0 f30607s;

    public so0(to0 to0Var, Context context) {
        super(context);
        this.f30607s = to0Var;
        this.f30601b = new g6(this, 0L, 260L, js.h);
        this.f30604f = new Path();
        this.h = new RectF();
        this.f30605n = new RectF();
        w7.y5.a(this);
        ah.c cVar = to0Var.v;
        if (cVar != null) {
            ch.d c10 = cVar.c(this, null, false);
            c10.o(to0Var.f30915w);
            c10.u(AndroidUtilities.dp(5.0f));
            ch.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.f30602c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f30603e == z10) {
            return;
        }
        this.f30603e = z10;
        ro0 ro0Var = this.f30600a;
        if (ro0Var != null) {
            ro0Var.f54832p = z10;
            g6 g6Var = this.f30601b;
            if (z11) {
                ro0Var.f54825i = ro0Var.N;
                ro0Var.f54823g = ro0Var.O;
                ro0Var.h = ro0Var.P;
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
        if (!this.f30606r) {
            ro0 ro0Var = this.f30600a;
            if (ro0Var != null) {
                ro0Var.a();
            }
            this.f30606r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f30606r) {
            ro0 ro0Var = this.f30600a;
            if (ro0Var != null) {
                ro0Var.b();
            }
            this.f30606r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        to0 to0Var = this.f30607s;
        Paint paint = to0Var.f30916x;
        int width = (getWidth() - this.f30600a.A) / 2;
        int height = getHeight();
        ro0 ro0Var = this.f30600a;
        int i11 = ro0Var.B;
        int i12 = (height - i11) / 2;
        ch.d dVar = this.f30602c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, ro0Var.A + width, i11 + i12);
            RectF rectF = this.f30605n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f30604f;
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
            org.telegram.ui.ActionBar.c6 c6Var = to0Var.f30909c;
            if (c6Var == null ? org.telegram.ui.ActionBar.h6.I.q() : c6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f30600a.d(canvas, width, i12, this.f30601b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        ro0 ro0Var = this.f30600a;
        if (ro0Var != null) {
            dp = ro0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
