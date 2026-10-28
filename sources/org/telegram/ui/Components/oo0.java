package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class oo0 extends View {
    public no0 f31351a;
    public final h6 f31352b;
    public final eh.d f31353c;
    public bh.x0 d;
    public boolean e;
    public final Path f31354f;
    public final RectF h;
    public final RectF f31355n;
    public boolean f31356r;
    public final po0 f31357s;

    public oo0(po0 po0Var, Context context) {
        super(context);
        this.f31357s = po0Var;
        this.f31352b = new h6(this, 0L, 260L, ds.h);
        this.f31354f = new Path();
        this.h = new RectF();
        this.f31355n = new RectF();
        kb1.b(this);
        ch.b bVar = po0Var.v;
        if (bVar != null) {
            eh.d c10 = bVar.c(this, null, false);
            c10.v(po0Var.f31690w);
            c10.A(AndroidUtilities.dp(5.0f));
            eh.d u10 = c10.u();
            org.telegram.messenger.wh.s(u10, AndroidUtilities.dp(6.0f), 4.0f);
            this.f31353c = u10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        no0 no0Var = this.f31351a;
        if (no0Var != null) {
            no0Var.f4182p = z10;
            h6 h6Var = this.f31352b;
            if (z11) {
                no0Var.f4175i = no0Var.N;
                no0Var.f4173g = no0Var.O;
                no0Var.h = no0Var.P;
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
        if (!this.f31356r) {
            no0 no0Var = this.f31351a;
            if (no0Var != null) {
                no0Var.a();
            }
            this.f31356r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f31356r) {
            no0 no0Var = this.f31351a;
            if (no0Var != null) {
                no0Var.b();
            }
            this.f31356r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        po0 po0Var = this.f31357s;
        Paint paint = po0Var.f31691x;
        int width = (getWidth() - this.f31351a.A) / 2;
        int height = getHeight();
        no0 no0Var = this.f31351a;
        int i11 = no0Var.B;
        int i12 = (height - i11) / 2;
        eh.d dVar = this.f31353c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i12, no0Var.A + width, i11 + i12);
            RectF rectF = this.f31355n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f31354f;
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
            org.telegram.ui.ActionBar.u6 u6Var = po0Var.f31685c;
            if (u6Var == null ? org.telegram.ui.ActionBar.y6.I.q() : u6Var.a()) {
                i10 = 687865855;
            } else {
                i10 = -1;
            }
            paint.setColor(i10);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f31351a.d(canvas, width, i12, this.f31352b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        no0 no0Var = this.f31351a;
        if (no0Var != null) {
            dp = no0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i11);
    }
}
