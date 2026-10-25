package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class no0 extends View {
    public mo0 f31047a;
    public final h6 f31048b;
    public final eh.d f31049c;
    public bh.x0 d;
    public boolean e;
    public final Path f31050f;
    public final RectF h;
    public final RectF f31051n;
    public boolean f31052r;
    public final oo0 f31053s;

    public no0(oo0 oo0Var, Context context) {
        super(context);
        this.f31053s = oo0Var;
        this.f31048b = new h6(this, 0L, 260L, ds.h);
        this.f31050f = new Path();
        this.h = new RectF();
        this.f31051n = new RectF();
        gb1.b(this);
        ch.b bVar = oo0Var.v;
        if (bVar != null) {
            eh.d c10 = bVar.c(this, null, false);
            c10.v(oo0Var.f31341w);
            c10.A(AndroidUtilities.dp(5.0f));
            eh.d u10 = c10.u();
            org.telegram.messenger.vh.s(u10, AndroidUtilities.dp(6.0f), 4.0f);
            this.f31049c = u10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        mo0 mo0Var = this.f31047a;
        if (mo0Var != null) {
            mo0Var.f4182p = z10;
            h6 h6Var = this.f31048b;
            if (z11) {
                mo0Var.f4175i = mo0Var.N;
                mo0Var.f4173g = mo0Var.O;
                mo0Var.h = mo0Var.P;
                h6Var.d(0.0f, true);
            } else {
                h6Var.d(1.0f, true);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f31052r) {
            mo0 mo0Var = this.f31047a;
            if (mo0Var != null) {
                mo0Var.a();
            }
            this.f31052r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f31052r) {
            mo0 mo0Var = this.f31047a;
            if (mo0Var != null) {
                mo0Var.b();
            }
            this.f31052r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        oo0 oo0Var = this.f31053s;
        Paint paint = oo0Var.f31342x;
        int width = (getWidth() - this.f31047a.A) / 2;
        int height = getHeight();
        mo0 mo0Var = this.f31047a;
        int i11 = mo0Var.B;
        int i12 = (height - i11) / 2;
        eh.d dVar = this.f31049c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, mo0Var.A + width, i11 + i12);
            RectF rectF = this.f31051n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f31050f;
            if (!equals) {
                rectF2.set(rectF);
                bh.y0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.u6 u6Var = oo0Var.f31336c;
            if (u6Var == null ? org.telegram.ui.ActionBar.y6.I.q() : u6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f31047a.d(canvas, width, i12, this.f31048b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        mo0 mo0Var = this.f31047a;
        if (mo0Var != null) {
            dp = mo0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
