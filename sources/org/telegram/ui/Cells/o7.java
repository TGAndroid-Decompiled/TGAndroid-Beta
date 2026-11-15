package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.gj;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.fp;
public final class o7 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public l7[] f30811a;
    public gj[] f30812b;
    public int[] f30813c;
    public m7 d;
    public int f30814e;
    public boolean f30815f;
    public boolean h;
    public Paint f30816n;
    public int f30817r;
    public int f30818s;

    public static int a(int i7) {
        if (org.telegram.messenger.g0.Q1()) {
            return (org.telegram.messenger.g0.L(490.0f) - (org.telegram.messenger.g0.L(2.0f) * (i7 - 1))) / i7;
        }
        return (org.telegram.messenger.g0.f23609q.x - (org.telegram.messenger.g0.L(2.0f) * (i7 - 1))) / i7;
    }

    public final void b(int i7, boolean z10, boolean z11) {
        float f10;
        l7 l7Var = this.f30811a[i7];
        FrameLayout frameLayout = l7Var.f30650f;
        fp fpVar = l7Var.f30649e;
        if (fpVar.getVisibility() != 0) {
            fpVar.setVisibility(0);
        }
        fpVar.a(z10, true);
        AnimatorSet animatorSet = l7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            l7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        l7Var.h = animatorSet2;
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
        l7Var.h.setDuration(200L);
        l7Var.h.addListener(new ki.s3(l7Var, 28));
        l7Var.h.start();
    }

    public final void c(int i7, int i10, gj gjVar) {
        l7[] l7VarArr = this.f30811a;
        gj[] gjVarArr = this.f30812b;
        gjVarArr[i7] = gjVar;
        this.f30813c[i7] = i10;
        if (gjVar != null) {
            l7VarArr[i7].setVisibility(0);
            l7VarArr[i7].setMessageObject(gjVar);
            return;
        }
        l7VarArr[i7].clearAnimation();
        l7VarArr[i7].setVisibility(4);
        gjVarArr[i7] = null;
    }

    public m7 getDelegate() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        for (int i7 = 0; i7 < 6; i7++) {
            this.f30811a[i7].invalidate();
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
        View[] viewArr = this.f30811a;
        if (this.f30817r == 1) {
            a10 = i20.A(2.0f, this.f30814e - 1, View.MeasureSpec.getSize(i7)) / this.f30814e;
        } else {
            a10 = a(this.f30814e);
        }
        this.h = true;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f30814e; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            if (this.f30815f) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(2.0f);
            }
            layoutParams.topMargin = L;
            layoutParams.leftMargin = (org.telegram.messenger.g0.L(2.0f) + a10) * i12;
            if (i12 == this.f30814e - 1) {
                if (org.telegram.messenger.g0.Q1()) {
                    layoutParams.width = org.telegram.messenger.g0.L(490.0f) - ((org.telegram.messenger.g0.L(2.0f) + a10) * (this.f30814e - 1));
                } else {
                    layoutParams.width = org.telegram.messenger.g0.f23609q.x - ((org.telegram.messenger.g0.L(2.0f) + a10) * (this.f30814e - 1));
                }
            } else {
                layoutParams.width = a10;
            }
            layoutParams.height = a10;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        this.h = false;
        if (!this.f30815f) {
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

    public void setDelegate(m7 m7Var) {
        this.d = m7Var;
    }

    public void setIsFirst(boolean z10) {
        this.f30815f = z10;
    }

    public void setItemsCount(int i7) {
        int i10;
        l7[] l7VarArr = this.f30811a;
        for (int i11 = 0; i11 < l7VarArr.length; i11++) {
            l7VarArr[i11].clearAnimation();
            l7 l7Var = l7VarArr[i11];
            if (i11 < i7) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            l7Var.setVisibility(i10);
        }
        this.f30814e = i7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f30816n.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ci, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
