package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.a30;
import org.telegram.messenger.kj;
import org.telegram.ui.Components.ep;
public final class t7 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public q7[] f23093a;
    public kj[] f23094b;
    public int[] f23095c;
    public r7 d;
    public int e;
    public boolean f23096f;
    public boolean h;
    public Paint f23097n;
    public int f23098r;
    public int f23099s;

    public static int a(int i10) {
        if (org.telegram.messenger.i0.Q1()) {
            return (org.telegram.messenger.i0.L(490.0f) - (org.telegram.messenger.i0.L(2.0f) * (i10 - 1))) / i10;
        }
        return (org.telegram.messenger.i0.f16172q.x - (org.telegram.messenger.i0.L(2.0f) * (i10 - 1))) / i10;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        float f7;
        q7 q7Var = this.f23093a[i10];
        FrameLayout frameLayout = q7Var.f22848f;
        ep epVar = q7Var.e;
        if (epVar.getVisibility() != 0) {
            epVar.setVisibility(0);
        }
        epVar.a(z10, true);
        AnimatorSet animatorSet = q7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            q7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        q7Var.h = animatorSet2;
        float f10 = 0.81f;
        if (z10) {
            f7 = 0.81f;
        } else {
            f7 = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, View.SCALE_X, f7);
        if (!z10) {
            f10 = 1.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(frameLayout, View.SCALE_Y, f10));
        q7Var.h.setDuration(200L);
        q7Var.h.addListener(new org.telegram.ui.s9(q7Var, 8));
        q7Var.h.start();
    }

    public final void c(int i10, int i11, kj kjVar) {
        q7[] q7VarArr = this.f23093a;
        kj[] kjVarArr = this.f23094b;
        kjVarArr[i10] = kjVar;
        this.f23095c[i10] = i11;
        if (kjVar != null) {
            q7VarArr[i10].setVisibility(0);
            q7VarArr[i10].setMessageObject(kjVar);
            return;
        }
        q7VarArr[i10].clearAnimation();
        q7VarArr[i10].setVisibility(4);
        kjVarArr[i10] = null;
    }

    public r7 getDelegate() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        for (int i10 = 0; i10 < 6; i10++) {
            this.f23093a[i10].invalidate();
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
    public final void onMeasure(int i10, int i11) {
        int a2;
        int L;
        View[] viewArr = this.f23093a;
        if (this.f23098r == 1) {
            a2 = a30.A(2.0f, this.e - 1, View.MeasureSpec.getSize(i10)) / this.e;
        } else {
            a2 = a(this.e);
        }
        this.h = true;
        int i12 = 0;
        for (int i13 = 0; i13 < this.e; i13++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i13].getLayoutParams();
            if (this.f23096f) {
                L = 0;
            } else {
                L = org.telegram.messenger.i0.L(2.0f);
            }
            layoutParams.topMargin = L;
            layoutParams.leftMargin = (org.telegram.messenger.i0.L(2.0f) + a2) * i13;
            if (i13 == this.e - 1) {
                if (org.telegram.messenger.i0.Q1()) {
                    layoutParams.width = org.telegram.messenger.i0.L(490.0f) - ((org.telegram.messenger.i0.L(2.0f) + a2) * (this.e - 1));
                } else {
                    layoutParams.width = org.telegram.messenger.i0.f16172q.x - ((org.telegram.messenger.i0.L(2.0f) + a2) * (this.e - 1));
                }
            } else {
                layoutParams.width = a2;
            }
            layoutParams.height = a2;
            layoutParams.gravity = 51;
            viewArr[i13].setLayoutParams(layoutParams);
        }
        this.h = false;
        if (!this.f23096f) {
            i12 = org.telegram.messenger.i0.L(2.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12 + a2, 1073741824));
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(r7 r7Var) {
        this.d = r7Var;
    }

    public void setIsFirst(boolean z10) {
        this.f23096f = z10;
    }

    public void setItemsCount(int i10) {
        int i11;
        q7[] q7VarArr = this.f23093a;
        for (int i12 = 0; i12 < q7VarArr.length; i12++) {
            q7VarArr[i12].clearAnimation();
            q7 q7Var = q7VarArr[i12];
            if (i12 < i10) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            q7Var.setVisibility(i11);
        }
        this.e = i10;
    }

    @Override
    public final void updateColors() {
        try {
            this.f23097n.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zi, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
