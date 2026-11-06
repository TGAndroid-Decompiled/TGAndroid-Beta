package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.wo;
public final class p7 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public m7[] f29734a;
    public ij[] f29735b;
    public int[] f29736c;
    public n7 d;
    public int f29737e;
    public boolean f29738f;
    public boolean h;
    public Paint f29739n;
    public int f29740r;
    public int f29741s;

    public static int a(int i7) {
        if (org.telegram.messenger.g0.Q1()) {
            return (org.telegram.messenger.g0.L(490.0f) - (org.telegram.messenger.g0.L(2.0f) * (i7 - 1))) / i7;
        }
        return (org.telegram.messenger.g0.f22544q.x - (org.telegram.messenger.g0.L(2.0f) * (i7 - 1))) / i7;
    }

    public final void b(int i7, boolean z9, boolean z10) {
        float f10;
        m7 m7Var = this.f29734a[i7];
        FrameLayout frameLayout = m7Var.f29561f;
        wo woVar = m7Var.f29560e;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z9, true);
        AnimatorSet animatorSet = m7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            m7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        m7Var.h = animatorSet2;
        float f11 = 0.81f;
        if (z9) {
            f10 = 0.81f;
        } else {
            f10 = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, View.SCALE_X, f10);
        if (!z9) {
            f11 = 1.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(frameLayout, View.SCALE_Y, f11));
        m7Var.h.setDuration(200L);
        m7Var.h.addListener(new m.a(m7Var, 27));
        m7Var.h.start();
    }

    public final void c(int i7, int i10, ij ijVar) {
        m7[] m7VarArr = this.f29734a;
        ij[] ijVarArr = this.f29735b;
        ijVarArr[i7] = ijVar;
        this.f29736c[i7] = i10;
        if (ijVar != null) {
            m7VarArr[i7].setVisibility(0);
            m7VarArr[i7].setMessageObject(ijVar);
            return;
        }
        m7VarArr[i7].clearAnimation();
        m7VarArr[i7].setVisibility(4);
        ijVarArr[i7] = null;
    }

    public n7 getDelegate() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        for (int i7 = 0; i7 < 6; i7++) {
            this.f29734a[i7].invalidate();
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
        View[] viewArr = this.f29734a;
        if (this.f29740r == 1) {
            a10 = org.telegram.messenger.camera.q.A(2.0f, this.f29737e - 1, View.MeasureSpec.getSize(i7)) / this.f29737e;
        } else {
            a10 = a(this.f29737e);
        }
        this.h = true;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f29737e; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            if (this.f29738f) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(2.0f);
            }
            layoutParams.topMargin = L;
            layoutParams.leftMargin = (org.telegram.messenger.g0.L(2.0f) + a10) * i12;
            if (i12 == this.f29737e - 1) {
                if (org.telegram.messenger.g0.Q1()) {
                    layoutParams.width = org.telegram.messenger.g0.L(490.0f) - ((org.telegram.messenger.g0.L(2.0f) + a10) * (this.f29737e - 1));
                } else {
                    layoutParams.width = org.telegram.messenger.g0.f22544q.x - ((org.telegram.messenger.g0.L(2.0f) + a10) * (this.f29737e - 1));
                }
            } else {
                layoutParams.width = a10;
            }
            layoutParams.height = a10;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        this.h = false;
        if (!this.f29738f) {
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

    public void setIsFirst(boolean z9) {
        this.f29738f = z9;
    }

    public void setItemsCount(int i7) {
        int i10;
        m7[] m7VarArr = this.f29734a;
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
        this.f29737e = i7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f29739n.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zi, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
