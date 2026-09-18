package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class un0 extends View {
    public tn0 f28777a;
    public final e6 f28778b;
    public final ch.d f28779c;
    public zg.o0 d;
    public boolean e;
    public final Path f28780f;
    public final RectF h;
    public final RectF f28781n;
    public boolean f28782r;
    public final vn0 f28783s;

    public un0(vn0 vn0Var, Context context) {
        super(context);
        this.f28783s = vn0Var;
        this.f28778b = new e6(this, 0L, 260L, qr.h);
        this.f28780f = new Path();
        this.h = new RectF();
        this.f28781n = new RectF();
        w7.a6.a(this);
        ah.c cVar = vn0Var.v;
        if (cVar != null) {
            ch.d c10 = cVar.c(this, null, false);
            c10.o(vn0Var.f29147w);
            c10.u(AndroidUtilities.dp(5.0f));
            ch.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.f28779c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        tn0 tn0Var = this.f28777a;
        if (tn0Var != null) {
            tn0Var.f49362p = z10;
            e6 e6Var = this.f28778b;
            if (z11) {
                tn0Var.f49355i = tn0Var.N;
                tn0Var.f49353g = tn0Var.O;
                tn0Var.h = tn0Var.P;
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
        if (!this.f28782r) {
            tn0 tn0Var = this.f28777a;
            if (tn0Var != null) {
                tn0Var.a();
            }
            this.f28782r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f28782r) {
            tn0 tn0Var = this.f28777a;
            if (tn0Var != null) {
                tn0Var.b();
            }
            this.f28782r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        vn0 vn0Var = this.f28783s;
        Paint paint = vn0Var.f29148x;
        int width = (getWidth() - this.f28777a.A) / 2;
        int height = getHeight();
        tn0 tn0Var = this.f28777a;
        int i11 = tn0Var.B;
        int i12 = (height - i11) / 2;
        ch.d dVar = this.f28779c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, tn0Var.A + width, i11 + i12);
            RectF rectF = this.f28781n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f28780f;
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
            org.telegram.ui.ActionBar.e6 e6Var = vn0Var.f29142c;
            if (e6Var == null ? org.telegram.ui.ActionBar.j6.I.q() : e6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f28777a.d(canvas, width, i12, this.f28778b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        tn0 tn0Var = this.f28777a;
        if (tn0Var != null) {
            dp = tn0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
