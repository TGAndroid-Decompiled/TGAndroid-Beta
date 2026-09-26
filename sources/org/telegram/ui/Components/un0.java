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
    public tn0 f28859a;
    public final e6 f28860b;
    public final ch.d f28861c;
    public zg.o0 d;
    public boolean e;
    public final Path f28862f;
    public final RectF h;
    public final RectF f28863n;
    public boolean f28864r;
    public final vn0 f28865s;

    public un0(vn0 vn0Var, Context context) {
        super(context);
        this.f28865s = vn0Var;
        this.f28860b = new e6(this, 0L, 260L, sr.h);
        this.f28862f = new Path();
        this.h = new RectF();
        this.f28863n = new RectF();
        w7.a6.a(this);
        ah.c cVar = vn0Var.v;
        if (cVar != null) {
            ch.d c10 = cVar.c(this, null, false);
            c10.o(vn0Var.f29159w);
            c10.u(AndroidUtilities.dp(5.0f));
            ch.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.f28861c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        tn0 tn0Var = this.f28859a;
        if (tn0Var != null) {
            tn0Var.f49380p = z10;
            e6 e6Var = this.f28860b;
            if (z11) {
                tn0Var.f49373i = tn0Var.N;
                tn0Var.f49371g = tn0Var.O;
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
        if (!this.f28864r) {
            tn0 tn0Var = this.f28859a;
            if (tn0Var != null) {
                tn0Var.a();
            }
            this.f28864r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f28864r) {
            tn0 tn0Var = this.f28859a;
            if (tn0Var != null) {
                tn0Var.b();
            }
            this.f28864r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        vn0 vn0Var = this.f28865s;
        Paint paint = vn0Var.f29160x;
        int width = (getWidth() - this.f28859a.A) / 2;
        int height = getHeight();
        tn0 tn0Var = this.f28859a;
        int i11 = tn0Var.B;
        int i12 = (height - i11) / 2;
        ch.d dVar = this.f28861c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, tn0Var.A + width, i11 + i12);
            RectF rectF = this.f28863n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f28862f;
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
            org.telegram.ui.ActionBar.d6 d6Var = vn0Var.f29154c;
            if (d6Var == null ? org.telegram.ui.ActionBar.h6.I.q() : d6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f28859a.d(canvas, width, i12, this.f28860b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        tn0 tn0Var = this.f28859a;
        if (tn0Var != null) {
            dp = tn0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
