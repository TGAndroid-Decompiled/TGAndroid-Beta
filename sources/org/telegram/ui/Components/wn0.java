package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class wn0 extends View {
    public vn0 f30011a;
    public final e6 f30012b;
    public final ch.d f30013c;
    public zg.o0 d;
    public boolean e;
    public final Path f30014f;
    public final RectF h;
    public final RectF f30015n;
    public boolean f30016r;
    public final xn0 f30017s;

    public wn0(xn0 xn0Var, Context context) {
        super(context);
        this.f30017s = xn0Var;
        this.f30012b = new e6(this, 0L, 260L, tr.h);
        this.f30014f = new Path();
        this.h = new RectF();
        this.f30015n = new RectF();
        w7.a6.a(this);
        ah.c cVar = xn0Var.v;
        if (cVar != null) {
            ch.d c10 = cVar.c(this, null, false);
            c10.o(xn0Var.f30433w);
            c10.u(AndroidUtilities.dp(5.0f));
            ch.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.f30013c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        vn0 vn0Var = this.f30011a;
        if (vn0Var != null) {
            vn0Var.f49489p = z10;
            e6 e6Var = this.f30012b;
            if (z11) {
                vn0Var.f49482i = vn0Var.N;
                vn0Var.f49480g = vn0Var.O;
                vn0Var.h = vn0Var.P;
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
        if (!this.f30016r) {
            vn0 vn0Var = this.f30011a;
            if (vn0Var != null) {
                vn0Var.a();
            }
            this.f30016r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f30016r) {
            vn0 vn0Var = this.f30011a;
            if (vn0Var != null) {
                vn0Var.b();
            }
            this.f30016r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        xn0 xn0Var = this.f30017s;
        Paint paint = xn0Var.f30434x;
        int width = (getWidth() - this.f30011a.A) / 2;
        int height = getHeight();
        vn0 vn0Var = this.f30011a;
        int i11 = vn0Var.B;
        int i12 = (height - i11) / 2;
        ch.d dVar = this.f30013c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, vn0Var.A + width, i11 + i12);
            RectF rectF = this.f30015n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f30014f;
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
            org.telegram.ui.ActionBar.d6 d6Var = xn0Var.f30428c;
            if (d6Var == null ? org.telegram.ui.ActionBar.h6.I.q() : d6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f30011a.d(canvas, width, i12, this.f30012b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        vn0 vn0Var = this.f30011a;
        if (vn0Var != null) {
            dp = vn0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
