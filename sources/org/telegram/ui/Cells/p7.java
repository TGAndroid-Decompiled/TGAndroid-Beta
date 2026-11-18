package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.fj;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.mp;
public final class p7 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public m7[] f31241a;
    public fj[] f31242b;
    public int[] f31243c;
    public n7 d;
    public int f31244e;
    public boolean f31245f;
    public boolean h;
    public Paint f31246n;
    public int f31247r;
    public int f31248s;

    public static int a(int i7) {
        if (org.telegram.messenger.g0.Q1()) {
            return (org.telegram.messenger.g0.L(490.0f) - (org.telegram.messenger.g0.L(2.0f) * (i7 - 1))) / i7;
        }
        return (org.telegram.messenger.g0.f24121q.x - (org.telegram.messenger.g0.L(2.0f) * (i7 - 1))) / i7;
    }

    public final void b(int i7, boolean z10, boolean z11) {
        float f10;
        m7 m7Var = this.f31241a[i7];
        FrameLayout frameLayout = m7Var.f31076f;
        mp mpVar = m7Var.f31075e;
        if (mpVar.getVisibility() != 0) {
            mpVar.setVisibility(0);
        }
        mpVar.a(z10, true);
        AnimatorSet animatorSet = m7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            m7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        m7Var.h = animatorSet2;
        float f11 = 0.81f;
        if (z10) {
            f10 = 0.81f;
        } else {
            f10 = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, View.SCALE_X, f10);
        if (!z10) {
            f11 = 1.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(frameLayout, View.SCALE_Y, f11));
        m7Var.h.setDuration(200L);
        m7Var.h.addListener(new ki.n3(m7Var, 28));
        m7Var.h.start();
    }

    public final void c(int i7, int i10, fj fjVar) {
        m7[] m7VarArr = this.f31241a;
        fj[] fjVarArr = this.f31242b;
        fjVarArr[i7] = fjVar;
        this.f31243c[i7] = i10;
        if (fjVar != null) {
            m7VarArr[i7].setVisibility(0);
            m7VarArr[i7].setMessageObject(fjVar);
            return;
        }
        m7VarArr[i7].clearAnimation();
        m7VarArr[i7].setVisibility(4);
        fjVarArr[i7] = null;
    }

    public n7 getDelegate() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        for (int i7 = 0; i7 < 6; i7++) {
            this.f31241a[i7].invalidate();
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int a10;
        int L;
        View[] viewArr = this.f31241a;
        if (this.f31247r == 1) {
            a10 = n10.B(2.0f, this.f31244e - 1, View.MeasureSpec.getSize(i7)) / this.f31244e;
        } else {
            a10 = a(this.f31244e);
        }
        this.h = true;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f31244e; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            if (this.f31245f) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(2.0f);
            }
            layoutParams.topMargin = L;
            layoutParams.leftMargin = (org.telegram.messenger.g0.L(2.0f) + a10) * i12;
            if (i12 == this.f31244e - 1) {
                if (org.telegram.messenger.g0.Q1()) {
                    layoutParams.width = org.telegram.messenger.g0.L(490.0f) - ((org.telegram.messenger.g0.L(2.0f) + a10) * (this.f31244e - 1));
                } else {
                    layoutParams.width = org.telegram.messenger.g0.f24121q.x - ((org.telegram.messenger.g0.L(2.0f) + a10) * (this.f31244e - 1));
                }
            } else {
                layoutParams.width = a10;
            }
            layoutParams.height = a10;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        this.h = false;
        if (!this.f31245f) {
            i11 = org.telegram.messenger.g0.L(2.0f);
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11 + a10, 1073741824));
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(n7 n7Var) {
        this.d = n7Var;
    }

    public void setIsFirst(boolean z10) {
        this.f31245f = z10;
    }

    public void setItemsCount(int i7) {
        int i10;
        m7[] m7VarArr = this.f31241a;
        for (int i11 = 0; i11 < m7VarArr.length; i11++) {
            m7VarArr[i11].clearAnimation();
            m7 m7Var = m7VarArr[i11];
            if (i11 < i7) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            m7Var.setVisibility(i10);
        }
        this.f31244e = i7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f31246n.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ci, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
