package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class eo0 extends View {
    public do0 f25952a;
    public final f6 f25953b;
    public final dh.d f25954c;
    public ah.i1 d;
    public boolean e;
    public final Path f25955f;
    public final RectF h;
    public final RectF f25956n;
    public boolean f25957r;
    public final fo0 f25958s;

    public eo0(fo0 fo0Var, Context context) {
        super(context);
        this.f25958s = fo0Var;
        this.f25953b = new f6(this, 0L, 260L, bs.h);
        this.f25955f = new Path();
        this.h = new RectF();
        this.f25956n = new RectF();
        w7.b6.a(this);
        bh.b bVar = fo0Var.v;
        if (bVar != null) {
            dh.d c10 = bVar.c(this, null, false);
            c10.o(fo0Var.f26312w);
            c10.u(AndroidUtilities.dp(5.0f));
            dh.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.f25954c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        do0 do0Var = this.f25952a;
        if (do0Var != null) {
            do0Var.f759p = z10;
            f6 f6Var = this.f25953b;
            if (z11) {
                do0Var.f752i = do0Var.N;
                do0Var.f750g = do0Var.O;
                do0Var.h = do0Var.P;
                f6Var.d(0.0f, true);
            } else {
                f6Var.d(1.0f, true);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f25957r) {
            do0 do0Var = this.f25952a;
            if (do0Var != null) {
                do0Var.a();
            }
            this.f25957r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f25957r) {
            do0 do0Var = this.f25952a;
            if (do0Var != null) {
                do0Var.b();
            }
            this.f25957r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        fo0 fo0Var = this.f25958s;
        Paint paint = fo0Var.f26313x;
        int width = (getWidth() - this.f25952a.A) / 2;
        int height = getHeight();
        do0 do0Var = this.f25952a;
        int i11 = do0Var.B;
        int i12 = (height - i11) / 2;
        dh.d dVar = this.f25954c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, do0Var.A + width, i11 + i12);
            RectF rectF = this.f25956n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f25955f;
            if (!equals) {
                rectF2.set(rectF);
                ah.j1.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.d6 d6Var = fo0Var.f26307c;
            if (d6Var == null ? org.telegram.ui.ActionBar.h6.I.q() : d6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f25952a.d(canvas, width, i12, this.f25953b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        do0 do0Var = this.f25952a;
        if (do0Var != null) {
            dp = do0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
