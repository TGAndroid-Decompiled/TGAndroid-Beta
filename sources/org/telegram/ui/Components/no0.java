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
    public mo0 f29199a;
    public final g6 f29200b;
    public final ch.d f29201c;
    public zg.n0 d;
    public boolean f29202e;
    public final Path f29203f;
    public final RectF h;
    public final RectF f29204n;
    public boolean f29205r;
    public final oo0 f29206s;

    public no0(oo0 oo0Var, Context context) {
        super(context);
        this.f29206s = oo0Var;
        this.f29200b = new g6(this, 0L, 260L, is.h);
        this.f29203f = new Path();
        this.h = new RectF();
        this.f29204n = new RectF();
        w7.z5.a(this);
        ah.c cVar = oo0Var.v;
        if (cVar != null) {
            ch.d c10 = cVar.c(this, null, false);
            c10.o(oo0Var.f29573w);
            c10.u(AndroidUtilities.dp(5.0f));
            ch.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.f29201c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f29202e == z10) {
            return;
        }
        this.f29202e = z10;
        mo0 mo0Var = this.f29199a;
        if (mo0Var != null) {
            mo0Var.f54721p = z10;
            g6 g6Var = this.f29200b;
            if (z11) {
                mo0Var.f54714i = mo0Var.N;
                mo0Var.f54712g = mo0Var.O;
                mo0Var.h = mo0Var.P;
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
        if (!this.f29205r) {
            mo0 mo0Var = this.f29199a;
            if (mo0Var != null) {
                mo0Var.a();
            }
            this.f29205r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f29205r) {
            mo0 mo0Var = this.f29199a;
            if (mo0Var != null) {
                mo0Var.b();
            }
            this.f29205r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        oo0 oo0Var = this.f29206s;
        Paint paint = oo0Var.f29574x;
        int width = (getWidth() - this.f29199a.A) / 2;
        int height = getHeight();
        mo0 mo0Var = this.f29199a;
        int i11 = mo0Var.B;
        int i12 = (height - i11) / 2;
        ch.d dVar = this.f29201c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, mo0Var.A + width, i11 + i12);
            RectF rectF = this.f29204n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f29203f;
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
            org.telegram.ui.ActionBar.d6 d6Var = oo0Var.f29567c;
            if (d6Var == null ? org.telegram.ui.ActionBar.h6.I.q() : d6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f29199a.d(canvas, width, i12, this.f29200b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        mo0 mo0Var = this.f29199a;
        if (mo0Var != null) {
            dp = mo0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
