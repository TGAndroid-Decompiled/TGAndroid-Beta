package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class v31 extends p71 {
    public final org.telegram.ui.l20 f31373d3;
    public final g6 f31374e3;
    public final g6 f31375f3;
    public final RectF f31376g3;
    public final Paint f31377h3;
    public final g6 f31378i3;
    public Drawable j3;
    public int f31379k3;
    public final Paint f31380l3;
    public final h41 f31381m3;

    public v31(h41 h41Var, Context context, int i10, u31 u31Var, n31 n31Var, n31 n31Var2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, 0, false, u31Var, n31Var, n31Var2, c6Var);
        this.f31381m3 = h41Var;
        this.f31373d3 = new org.telegram.ui.l20();
        js jsVar = js.h;
        this.f31374e3 = new g6(this, 320L, jsVar);
        this.f31375f3 = new g6(this, 320L, jsVar);
        this.f31376g3 = new RectF();
        this.f31377h3 = new Paint(1);
        this.f31378i3 = new g6(this, 420L, jsVar);
        this.f31380l3 = new Paint(1);
    }

    @Override
    public final Integer W0(int i10) {
        return 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        int i10;
        boolean z11;
        float e7 = this.f31374e3.e(canScrollHorizontally(-1));
        float e10 = this.f31375f3.e(canScrollHorizontally(1));
        int i11 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
        if (i11 <= 0 && e10 <= 0.0f) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float width = getWidth();
        float f12 = 0.0f;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof c41) {
                c41 c41Var = (c41) childAt;
                if (c41Var.f24814s) {
                    if (width > c41Var.getX()) {
                        width = c41Var.getX();
                        RecyclerView.R(c41Var);
                    }
                    if (f12 < c41Var.getX() + c41Var.getWidth()) {
                        f12 = c41Var.getX() + c41Var.getWidth();
                        RecyclerView.R(c41Var);
                    }
                }
            }
        }
        int i13 = (f12 > width ? 1 : (f12 == width ? 0 : -1));
        org.telegram.ui.ActionBar.c6 c6Var = this.f32467n2;
        if (i13 > 0) {
            int m12 = org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, c6Var));
            Paint paint = this.f31380l3;
            paint.setColor(m12);
            RectF rectF = AndroidUtilities.rectTmp;
            f10 = 14.0f;
            f7 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, f12 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.j3 == null) {
                this.j3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20525b9, c6Var);
            if (this.f31379k3 != w02) {
                Drawable drawable = this.j3;
                this.f31379k3 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            this.j3.setBounds((int) (AndroidUtilities.dp(-17.0f) + f12), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (f12 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.j3.draw(canvas2);
        } else {
            f7 = 1.0f;
            f10 = 14.0f;
        }
        super.dispatchDraw(canvas);
        h41 h41Var = this.f31381m3;
        long j3 = h41Var.H;
        int i14 = (j3 > h41Var.V ? 1 : (j3 == h41Var.V ? 0 : -1));
        g6 g6Var = this.f31378i3;
        if (i14 != 0) {
            h41Var.I = j3;
            g6Var.d(0.0f, true);
        }
        h41Var.H = h41Var.V;
        c41 c41Var2 = null;
        c41 c41Var3 = null;
        int i15 = 0;
        while (i15 < getChildCount()) {
            View childAt2 = getChildAt(i15);
            if (childAt2 instanceof c41) {
                c41 c41Var4 = (c41) childAt2;
                if (!c41Var4.f24816x) {
                    i10 = i11;
                    if (c41Var4.getTopicId() == h41Var.V) {
                        c41Var2 = c41Var4;
                    }
                    z11 = z10;
                    if (c41Var4.getTopicId() == h41Var.I) {
                        c41Var3 = c41Var4;
                    }
                    i15++;
                    i11 = i10;
                    z10 = z11;
                }
            }
            i10 = i11;
            z11 = z10;
            i15++;
            i11 = i10;
            z10 = z11;
        }
        int i16 = i11;
        boolean z12 = z10;
        if (c41Var2 != null) {
            float x10 = c41Var2.getX() + AndroidUtilities.dp(f7);
            float y3 = c41Var2.getY() + AndroidUtilities.dp(4.0f);
            float x11 = (c41Var2.getX() + c41Var2.getWidth()) - AndroidUtilities.dp(f7);
            float y10 = (c41Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.f31376g3;
            rectF2.set(x10, y3, x11, y10);
            if (c41Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(c41Var3.getX() + AndroidUtilities.dp(f7), c41Var3.getY() + AndroidUtilities.dp(4.0f), (c41Var3.getX() + c41Var3.getWidth()) - AndroidUtilities.dp(f7), (c41Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, g6Var.d(f7, false), rectF2);
            }
            int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, c6Var), 31);
            Paint paint2 = this.f31377h3;
            paint2.setColor(k10);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint2);
        }
        if (z12) {
            canvas2.save();
            org.telegram.ui.l20 l20Var = this.f31373d3;
            if (i16 > 0) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                f11 = 0.0f;
                rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                l20Var.b(canvas2, rectF4, 0, e7);
            } else {
                f11 = 0.0f;
            }
            if (e10 > f11) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f11, getWidth(), getHeight());
                l20Var.b(canvas2, rectF5, 2, e10);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
