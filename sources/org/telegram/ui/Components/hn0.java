package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hn0 extends View {
    public gn0 f24725a;
    public final c6 f24726b;
    public final ch.d f24727c;
    public zg.p0 d;
    public boolean e;
    public final Path f24728f;
    public final RectF h;
    public final RectF f24729n;
    public boolean f24730r;
    public final in0 f24731s;

    public hn0(in0 in0Var, Context context) {
        super(context);
        this.f24731s = in0Var;
        this.f24726b = new c6(this, 0L, 260L, qr.h);
        this.f24728f = new Path();
        this.h = new RectF();
        this.f24729n = new RectF();
        w7.z5.a(this);
        ah.c cVar = in0Var.v;
        if (cVar != null) {
            ch.d c10 = cVar.c(this, null, false);
            c10.o(in0Var.f25090w);
            c10.u(AndroidUtilities.dp(5.0f));
            ch.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.f24727c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        gn0 gn0Var = this.f24725a;
        if (gn0Var != null) {
            gn0Var.f49111p = z10;
            c6 c6Var = this.f24726b;
            if (z11) {
                gn0Var.f49104i = gn0Var.N;
                gn0Var.f49102g = gn0Var.O;
                gn0Var.h = gn0Var.P;
                c6Var.d(0.0f, true);
            } else {
                c6Var.d(1.0f, true);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f24730r) {
            gn0 gn0Var = this.f24725a;
            if (gn0Var != null) {
                gn0Var.a();
            }
            this.f24730r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f24730r) {
            gn0 gn0Var = this.f24725a;
            if (gn0Var != null) {
                gn0Var.b();
            }
            this.f24730r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        in0 in0Var = this.f24731s;
        Paint paint = in0Var.f25091x;
        int width = (getWidth() - this.f24725a.A) / 2;
        int height = getHeight();
        gn0 gn0Var = this.f24725a;
        int i11 = gn0Var.B;
        int i12 = (height - i11) / 2;
        ch.d dVar = this.f24727c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, gn0Var.A + width, i11 + i12);
            RectF rectF = this.f24729n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f24728f;
            if (!equals) {
                rectF2.set(rectF);
                zg.q0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.e6 e6Var = in0Var.f25085c;
            if (e6Var == null ? org.telegram.ui.ActionBar.i6.I.q() : e6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f24725a.d(canvas, width, i12, this.f24726b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        gn0 gn0Var = this.f24725a;
        if (gn0Var != null) {
            dp = gn0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
