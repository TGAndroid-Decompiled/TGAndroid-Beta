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
public final class l21 extends i61 {
    public final org.telegram.ui.h20 c3;
    public final z5 f28572d3;
    public final z5 f28573e3;
    public final RectF f28574f3;
    public final Paint f28575g3;
    public final z5 f28576h3;
    public Drawable f28577i3;
    public int f28578j3;
    public final Paint f28579k3;
    public final x21 f28580l3;

    public l21(x21 x21Var, Context context, int i10, k21 k21Var, f21 f21Var, f21 f21Var2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, 0, false, k21Var, f21Var, f21Var2, g6Var);
        this.f28580l3 = x21Var;
        this.c3 = new org.telegram.ui.h20();
        pr prVar = pr.h;
        this.f28572d3 = new z5(this, 320L, prVar);
        this.f28573e3 = new z5(this, 320L, prVar);
        this.f28574f3 = new RectF();
        this.f28575g3 = new Paint(1);
        this.f28576h3 = new z5(this, 420L, prVar);
        this.f28579k3 = new Paint(1);
    }

    @Override
    public final Integer W0(int i10) {
        return 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        float e6 = this.f28572d3.e(canScrollHorizontally(-1));
        float e10 = this.f28573e3.e(canScrollHorizontally(1));
        int i11 = (e6 > 0.0f ? 1 : (e6 == 0.0f ? 0 : -1));
        if (i11 <= 0 && e10 <= 0.0f) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float width = getWidth();
        float f14 = 0.0f;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof s21) {
                s21 s21Var = (s21) childAt;
                if (s21Var.f30965s) {
                    if (width > s21Var.getX()) {
                        width = s21Var.getX();
                        RecyclerView.R(s21Var);
                    }
                    if (f14 < s21Var.getX() + s21Var.getWidth()) {
                        f14 = s21Var.getX() + s21Var.getWidth();
                        RecyclerView.R(s21Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f31383m2;
        if (f14 > width) {
            int l1 = org.telegram.ui.ActionBar.k6.l1(0.06f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
            Paint paint = this.f28579k3;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            f10 = 14.0f;
            f11 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, f14 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.f28577i3 == null) {
                this.f28577i3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21626b9, g6Var);
            if (this.f28578j3 != v02) {
                Drawable drawable = this.f28577i3;
                this.f28578j3 = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            this.f28577i3.setBounds((int) (AndroidUtilities.dp(-17.0f) + f14), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (f14 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.f28577i3.draw(canvas2);
        } else {
            f10 = 14.0f;
            f11 = 1.0f;
        }
        super.dispatchDraw(canvas);
        x21 x21Var = this.f28580l3;
        long j10 = x21Var.E;
        long j11 = x21Var.S;
        z5 z5Var = this.f28576h3;
        if (j10 != j11) {
            x21Var.F = j10;
            z5Var.d(0.0f, true);
        }
        x21Var.E = x21Var.S;
        s21 s21Var2 = null;
        s21 s21Var3 = null;
        int i13 = 0;
        while (i13 < getChildCount()) {
            View childAt2 = getChildAt(i13);
            if (childAt2 instanceof s21) {
                s21 s21Var4 = (s21) childAt2;
                if (!s21Var4.f30967x) {
                    i10 = i11;
                    if (s21Var4.getTopicId() == x21Var.S) {
                        s21Var2 = s21Var4;
                    }
                    f13 = e10;
                    if (s21Var4.getTopicId() == x21Var.F) {
                        s21Var3 = s21Var4;
                    }
                    i13++;
                    i11 = i10;
                    e10 = f13;
                }
            }
            f13 = e10;
            i10 = i11;
            i13++;
            i11 = i10;
            e10 = f13;
        }
        float f15 = e10;
        int i14 = i11;
        if (s21Var2 != null) {
            float x10 = s21Var2.getX() + AndroidUtilities.dp(f11);
            float y10 = s21Var2.getY() + AndroidUtilities.dp(4.0f);
            float x11 = (s21Var2.getX() + s21Var2.getWidth()) - AndroidUtilities.dp(f11);
            float y11 = (s21Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.f28574f3;
            rectF2.set(x10, y10, x11, y11);
            if (s21Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(s21Var3.getX() + AndroidUtilities.dp(f11), s21Var3.getY() + AndroidUtilities.dp(4.0f), (s21Var3.getX() + s21Var3.getWidth()) - AndroidUtilities.dp(f11), (s21Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, z5Var.d(1.0f, false), rectF2);
            }
            int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var), 31);
            Paint paint2 = this.f28575g3;
            paint2.setColor(k10);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint2);
        }
        if (z4) {
            canvas2.save();
            org.telegram.ui.h20 h20Var = this.c3;
            if (i14 > 0) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                f12 = 0.0f;
                rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                h20Var.b(canvas2, rectF4, 0, e6);
            } else {
                f12 = 0.0f;
            }
            if (f15 > f12) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f12, getWidth(), getHeight());
                h20Var.b(canvas2, rectF5, 2, f15);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
