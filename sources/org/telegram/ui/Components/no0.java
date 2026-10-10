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
    public mo0 f29157a;
    public final g6 f29158b;
    public final ch.d f29159c;
    public zg.n0 d;
    public boolean f29160e;
    public final Path f29161f;
    public final RectF h;
    public final RectF f29162n;
    public boolean f29163r;
    public final oo0 f29164s;

    public no0(oo0 oo0Var, Context context) {
        super(context);
        this.f29164s = oo0Var;
        this.f29158b = new g6(this, 0L, 260L, is.h);
        this.f29161f = new Path();
        this.h = new RectF();
        this.f29162n = new RectF();
        w7.z5.a(this);
        ah.c cVar = oo0Var.v;
        if (cVar != null) {
            ch.d c10 = cVar.c(this, null, false);
            c10.o(oo0Var.f29541w);
            c10.u(AndroidUtilities.dp(5.0f));
            ch.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.f29159c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f29160e == z10) {
            return;
        }
        this.f29160e = z10;
        mo0 mo0Var = this.f29157a;
        if (mo0Var != null) {
            mo0Var.f54644p = z10;
            g6 g6Var = this.f29158b;
            if (z11) {
                mo0Var.f54637i = mo0Var.N;
                mo0Var.f54635g = mo0Var.O;
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
        if (!this.f29163r) {
            mo0 mo0Var = this.f29157a;
            if (mo0Var != null) {
                mo0Var.a();
            }
            this.f29163r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f29163r) {
            mo0 mo0Var = this.f29157a;
            if (mo0Var != null) {
                mo0Var.b();
            }
            this.f29163r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        oo0 oo0Var = this.f29164s;
        Paint paint = oo0Var.f29542x;
        int width = (getWidth() - this.f29157a.A) / 2;
        int height = getHeight();
        mo0 mo0Var = this.f29157a;
        int i11 = mo0Var.B;
        int i12 = (height - i11) / 2;
        ch.d dVar = this.f29159c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, mo0Var.A + width, i11 + i12);
            RectF rectF = this.f29162n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f29161f;
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
            org.telegram.ui.ActionBar.e6 e6Var = oo0Var.f29535c;
            if (e6Var == null ? org.telegram.ui.ActionBar.i6.I.q() : e6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f29157a.d(canvas, width, i12, this.f29158b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        mo0 mo0Var = this.f29157a;
        if (mo0Var != null) {
            dp = mo0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
