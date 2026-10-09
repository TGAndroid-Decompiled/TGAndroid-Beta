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
public final class q31 extends k71 {
    public final org.telegram.ui.j20 f30025d3;
    public final g6 f30026e3;
    public final g6 f30027f3;
    public final RectF f30028g3;
    public final Paint f30029h3;
    public final g6 f30030i3;
    public Drawable j3;
    public int f30031k3;
    public final Paint f30032l3;
    public final c41 f30033m3;

    public q31(c41 c41Var, Context context, int i10, p31 p31Var, h31 h31Var, h31 h31Var2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, 0, false, p31Var, h31Var, h31Var2, e6Var);
        this.f30033m3 = c41Var;
        this.f30025d3 = new org.telegram.ui.j20();
        hs hsVar = hs.h;
        this.f30026e3 = new g6(this, 320L, hsVar);
        this.f30027f3 = new g6(this, 320L, hsVar);
        this.f30028g3 = new RectF();
        this.f30029h3 = new Paint(1);
        this.f30030i3 = new g6(this, 420L, hsVar);
        this.f30032l3 = new Paint(1);
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
        float e7 = this.f30026e3.e(canScrollHorizontally(-1));
        float e10 = this.f30027f3.e(canScrollHorizontally(1));
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
            if (childAt instanceof x31) {
                x31 x31Var = (x31) childAt;
                if (x31Var.f32740s) {
                    if (width > x31Var.getX()) {
                        width = x31Var.getX();
                        RecyclerView.R(x31Var);
                    }
                    if (f12 < x31Var.getX() + x31Var.getWidth()) {
                        f12 = x31Var.getX() + x31Var.getWidth();
                        RecyclerView.R(x31Var);
                    }
                }
            }
        }
        int i13 = (f12 > width ? 1 : (f12 == width ? 0 : -1));
        org.telegram.ui.ActionBar.e6 e6Var = this.f30216n2;
        if (i13 > 0) {
            int m12 = org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
            Paint paint = this.f30032l3;
            paint.setColor(m12);
            RectF rectF = AndroidUtilities.rectTmp;
            f10 = 14.0f;
            f7 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, f12 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.j3 == null) {
                this.j3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20763b9, e6Var);
            if (this.f30031k3 != w02) {
                Drawable drawable = this.j3;
                this.f30031k3 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            this.j3.setBounds((int) (AndroidUtilities.dp(-17.0f) + f12), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (f12 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.j3.draw(canvas2);
        } else {
            f7 = 1.0f;
            f10 = 14.0f;
        }
        super.dispatchDraw(canvas);
        c41 c41Var = this.f30033m3;
        long j3 = c41Var.H;
        int i14 = (j3 > c41Var.V ? 1 : (j3 == c41Var.V ? 0 : -1));
        g6 g6Var = this.f30030i3;
        if (i14 != 0) {
            c41Var.I = j3;
            g6Var.d(0.0f, true);
        }
        c41Var.H = c41Var.V;
        x31 x31Var2 = null;
        x31 x31Var3 = null;
        int i15 = 0;
        while (i15 < getChildCount()) {
            View childAt2 = getChildAt(i15);
            if (childAt2 instanceof x31) {
                x31 x31Var4 = (x31) childAt2;
                if (!x31Var4.f32742x) {
                    i10 = i11;
                    if (x31Var4.getTopicId() == c41Var.V) {
                        x31Var2 = x31Var4;
                    }
                    z11 = z10;
                    if (x31Var4.getTopicId() == c41Var.I) {
                        x31Var3 = x31Var4;
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
        if (x31Var2 != null) {
            float x10 = x31Var2.getX() + AndroidUtilities.dp(f7);
            float y3 = x31Var2.getY() + AndroidUtilities.dp(4.0f);
            float x11 = (x31Var2.getX() + x31Var2.getWidth()) - AndroidUtilities.dp(f7);
            float y10 = (x31Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.f30028g3;
            rectF2.set(x10, y3, x11, y10);
            if (x31Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(x31Var3.getX() + AndroidUtilities.dp(f7), x31Var3.getY() + AndroidUtilities.dp(4.0f), (x31Var3.getX() + x31Var3.getWidth()) - AndroidUtilities.dp(f7), (x31Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, g6Var.d(f7, false), rectF2);
            }
            int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var), 31);
            Paint paint2 = this.f30029h3;
            paint2.setColor(k10);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint2);
        }
        if (z12) {
            canvas2.save();
            org.telegram.ui.j20 j20Var = this.f30025d3;
            if (i16 > 0) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                f11 = 0.0f;
                rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                j20Var.b(canvas2, rectF4, 0, e7);
            } else {
                f11 = 0.0f;
            }
            if (e10 > f11) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f11, getWidth(), getHeight());
                j20Var.b(canvas2, rectF5, 2, e10);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
