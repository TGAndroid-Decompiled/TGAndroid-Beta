package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class oo0 extends View {
    public no0 f29438a;
    public final g6 f29439b;
    public final ch.d f29440c;
    public zg.n0 d;
    public boolean f29441e;
    public final Path f29442f;
    public final RectF h;
    public final RectF f29443n;
    public boolean f29444r;
    public final po0 f29445s;

    public oo0(po0 po0Var, Context context) {
        super(context);
        this.f29445s = po0Var;
        this.f29439b = new g6(this, 0L, 260L, is.h);
        this.f29442f = new Path();
        this.h = new RectF();
        this.f29443n = new RectF();
        w7.z5.a(this);
        ah.c cVar = po0Var.v;
        if (cVar != null) {
            ch.d c10 = cVar.c(this, null, false);
            c10.o(po0Var.f29788w);
            c10.u(AndroidUtilities.dp(5.0f));
            ch.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.f29440c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f29441e == z10) {
            return;
        }
        this.f29441e = z10;
        no0 no0Var = this.f29438a;
        if (no0Var != null) {
            no0Var.f54687p = z10;
            g6 g6Var = this.f29439b;
            if (z11) {
                no0Var.f54680i = no0Var.N;
                no0Var.f54678g = no0Var.O;
                no0Var.h = no0Var.P;
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
        if (!this.f29444r) {
            no0 no0Var = this.f29438a;
            if (no0Var != null) {
                no0Var.a();
            }
            this.f29444r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f29444r) {
            no0 no0Var = this.f29438a;
            if (no0Var != null) {
                no0Var.b();
            }
            this.f29444r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        po0 po0Var = this.f29445s;
        Paint paint = po0Var.f29789x;
        int width = (getWidth() - this.f29438a.A) / 2;
        int height = getHeight();
        no0 no0Var = this.f29438a;
        int i11 = no0Var.B;
        int i12 = (height - i11) / 2;
        ch.d dVar = this.f29440c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, no0Var.A + width, i11 + i12);
            RectF rectF = this.f29443n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f29442f;
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
            org.telegram.ui.ActionBar.d6 d6Var = po0Var.f29782c;
            if (d6Var == null ? org.telegram.ui.ActionBar.h6.I.q() : d6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f29438a.d(canvas, width, i12, this.f29439b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        no0 no0Var = this.f29438a;
        if (no0Var != null) {
            dp = no0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
