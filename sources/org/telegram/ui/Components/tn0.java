package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class tn0 extends View {
    public sn0 f28571a;
    public final e6 f28572b;
    public final ch.d f28573c;
    public zg.o0 d;
    public boolean e;
    public final Path f28574f;
    public final RectF h;
    public final RectF f28575n;
    public boolean f28576r;
    public final un0 f28577s;

    public tn0(un0 un0Var, Context context) {
        super(context);
        this.f28577s = un0Var;
        this.f28572b = new e6(this, 0L, 260L, rr.h);
        this.f28574f = new Path();
        this.h = new RectF();
        this.f28575n = new RectF();
        w7.a6.a(this);
        ah.c cVar = un0Var.v;
        if (cVar != null) {
            ch.d c10 = cVar.c(this, null, false);
            c10.o(un0Var.f28847w);
            c10.u(AndroidUtilities.dp(5.0f));
            ch.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.f28573c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        sn0 sn0Var = this.f28571a;
        if (sn0Var != null) {
            sn0Var.f49381p = z10;
            e6 e6Var = this.f28572b;
            if (z11) {
                sn0Var.f49374i = sn0Var.N;
                sn0Var.f49372g = sn0Var.O;
                sn0Var.h = sn0Var.P;
                e6Var.d(0.0f, true);
            } else {
                e6Var.d(1.0f, true);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f28576r) {
            sn0 sn0Var = this.f28571a;
            if (sn0Var != null) {
                sn0Var.a();
            }
            this.f28576r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f28576r) {
            sn0 sn0Var = this.f28571a;
            if (sn0Var != null) {
                sn0Var.b();
            }
            this.f28576r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        un0 un0Var = this.f28577s;
        Paint paint = un0Var.f28848x;
        int width = (getWidth() - this.f28571a.A) / 2;
        int height = getHeight();
        sn0 sn0Var = this.f28571a;
        int i11 = sn0Var.B;
        int i12 = (height - i11) / 2;
        ch.d dVar = this.f28573c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, sn0Var.A + width, i11 + i12);
            RectF rectF = this.f28575n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f28574f;
            if (!equals) {
                rectF2.set(rectF);
                zg.p0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.d6 d6Var = un0Var.f28842c;
            if (d6Var == null ? org.telegram.ui.ActionBar.h6.I.q() : d6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f28571a.d(canvas, width, i12, this.f28572b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        sn0 sn0Var = this.f28571a;
        if (sn0Var != null) {
            dp = sn0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
