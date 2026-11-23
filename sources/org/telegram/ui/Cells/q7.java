package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.gj;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.op;
public final class q7 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public n7[] f31322a;
    public gj[] f31323b;
    public int[] f31324c;
    public o7 d;
    public int f31325e;
    public boolean f31326f;
    public boolean h;
    public Paint f31327n;
    public int f31328r;
    public int f31329s;

    public static int a(int i7) {
        if (org.telegram.messenger.g0.Q1()) {
            return (org.telegram.messenger.g0.L(490.0f) - (org.telegram.messenger.g0.L(2.0f) * (i7 - 1))) / i7;
        }
        return (org.telegram.messenger.g0.f24046q.x - (org.telegram.messenger.g0.L(2.0f) * (i7 - 1))) / i7;
    }

    public final void b(int i7, boolean z10, boolean z11) {
        float f10;
        n7 n7Var = this.f31322a[i7];
        FrameLayout frameLayout = n7Var.f31162f;
        op opVar = n7Var.f31161e;
        if (opVar.getVisibility() != 0) {
            opVar.setVisibility(0);
        }
        opVar.a(z10, true);
        AnimatorSet animatorSet = n7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            n7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        n7Var.h = animatorSet2;
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
        n7Var.h.setDuration(200L);
        n7Var.h.addListener(new ki.m3(n7Var, 28));
        n7Var.h.start();
    }

    public final void c(int i7, int i10, gj gjVar) {
        n7[] n7VarArr = this.f31322a;
        gj[] gjVarArr = this.f31323b;
        gjVarArr[i7] = gjVar;
        this.f31324c[i7] = i10;
        if (gjVar != null) {
            n7VarArr[i7].setVisibility(0);
            n7VarArr[i7].setMessageObject(gjVar);
            return;
        }
        n7VarArr[i7].clearAnimation();
        n7VarArr[i7].setVisibility(4);
        gjVarArr[i7] = null;
    }

    public o7 getDelegate() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        for (int i7 = 0; i7 < 6; i7++) {
            this.f31322a[i7].invalidate();
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
        View[] viewArr = this.f31322a;
        if (this.f31328r == 1) {
            a10 = o10.B(2.0f, this.f31325e - 1, View.MeasureSpec.getSize(i7)) / this.f31325e;
        } else {
            a10 = a(this.f31325e);
        }
        this.h = true;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f31325e; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            if (this.f31326f) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(2.0f);
            }
            layoutParams.topMargin = L;
            layoutParams.leftMargin = (org.telegram.messenger.g0.L(2.0f) + a10) * i12;
            if (i12 == this.f31325e - 1) {
                if (org.telegram.messenger.g0.Q1()) {
                    layoutParams.width = org.telegram.messenger.g0.L(490.0f) - ((org.telegram.messenger.g0.L(2.0f) + a10) * (this.f31325e - 1));
                } else {
                    layoutParams.width = org.telegram.messenger.g0.f24046q.x - ((org.telegram.messenger.g0.L(2.0f) + a10) * (this.f31325e - 1));
                }
            } else {
                layoutParams.width = a10;
            }
            layoutParams.height = a10;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        this.h = false;
        if (!this.f31326f) {
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

    public void setDelegate(o7 o7Var) {
        this.d = o7Var;
    }

    public void setIsFirst(boolean z10) {
        this.f31326f = z10;
    }

    public void setItemsCount(int i7) {
        int i10;
        n7[] n7VarArr = this.f31322a;
        for (int i11 = 0; i11 < n7VarArr.length; i11++) {
            n7VarArr[i11].clearAnimation();
            n7 n7Var = n7VarArr[i11];
            if (i11 < i7) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            n7Var.setVisibility(i10);
        }
        this.f31325e = i7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f31327n.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ci, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
