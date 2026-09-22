package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vn0 extends View {
    public un0 f29212a;
    public final d6 f29213b;
    public final ch.d f29214c;
    public zg.p0 d;
    public boolean e;
    public final Path f29215f;
    public final RectF h;
    public final RectF f29216n;
    public boolean f29217r;
    public final wn0 f29218s;

    public vn0(wn0 wn0Var, Context context) {
        super(context);
        this.f29218s = wn0Var;
        this.f29213b = new d6(this, 0L, 260L, qr.h);
        this.f29215f = new Path();
        this.h = new RectF();
        this.f29216n = new RectF();
        w7.a6.a(this);
        ah.c cVar = wn0Var.v;
        if (cVar != null) {
            ch.d c10 = cVar.c(this, null, false);
            c10.o(wn0Var.f30081w);
            c10.u(AndroidUtilities.dp(5.0f));
            ch.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.f29214c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        un0 un0Var = this.f29212a;
        if (un0Var != null) {
            un0Var.f49431p = z10;
            d6 d6Var = this.f29213b;
            if (z11) {
                un0Var.f49424i = un0Var.N;
                un0Var.f49422g = un0Var.O;
                un0Var.h = un0Var.P;
                d6Var.d(0.0f, true);
            } else {
                d6Var.d(1.0f, true);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f29217r) {
            un0 un0Var = this.f29212a;
            if (un0Var != null) {
                un0Var.a();
            }
            this.f29217r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f29217r) {
            un0 un0Var = this.f29212a;
            if (un0Var != null) {
                un0Var.b();
            }
            this.f29217r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        wn0 wn0Var = this.f29218s;
        Paint paint = wn0Var.f30082x;
        int width = (getWidth() - this.f29212a.A) / 2;
        int height = getHeight();
        un0 un0Var = this.f29212a;
        int i11 = un0Var.B;
        int i12 = (height - i11) / 2;
        ch.d dVar = this.f29214c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, un0Var.A + width, i11 + i12);
            RectF rectF = this.f29216n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f29215f;
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
            org.telegram.ui.ActionBar.f6 f6Var = wn0Var.f30076c;
            if (f6Var == null ? org.telegram.ui.ActionBar.j6.I.q() : f6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f29212a.d(canvas, width, i12, this.f29213b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        un0 un0Var = this.f29212a;
        if (un0Var != null) {
            dp = un0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
