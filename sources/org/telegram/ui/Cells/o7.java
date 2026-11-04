package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.wo;
public final class o7 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public l7[] f29750a;
    public zi[] f29751b;
    public int[] f29752c;
    public m7 d;
    public int f29753e;
    public boolean f29754f;
    public boolean h;
    public Paint f29755n;
    public int f29756r;
    public int f29757s;

    public static int a(int i3) {
        if (org.telegram.messenger.g0.Q1()) {
            return (org.telegram.messenger.g0.L(490.0f) - (org.telegram.messenger.g0.L(2.0f) * (i3 - 1))) / i3;
        }
        return (org.telegram.messenger.g0.f22608q.x - (org.telegram.messenger.g0.L(2.0f) * (i3 - 1))) / i3;
    }

    public final void b(int i3, boolean z10, boolean z11) {
        float f10;
        l7 l7Var = this.f29750a[i3];
        FrameLayout frameLayout = l7Var.f29589f;
        wo woVar = l7Var.f29588e;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z10, true);
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
        l7Var.h.addListener(new ii.v3(l7Var, 28));
        l7Var.h.start();
    }

    public final void c(int i3, int i10, zi ziVar) {
        l7[] l7VarArr = this.f29750a;
        zi[] ziVarArr = this.f29751b;
        ziVarArr[i3] = ziVar;
        this.f29752c[i3] = i10;
        if (ziVar != null) {
            l7VarArr[i3].setVisibility(0);
            l7VarArr[i3].setMessageObject(ziVar);
            return;
        }
        l7VarArr[i3].clearAnimation();
        l7VarArr[i3].setVisibility(4);
        ziVarArr[i3] = null;
    }

    public m7 getDelegate() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        for (int i3 = 0; i3 < 6; i3++) {
            this.f29750a[i3].invalidate();
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
    public final void onMeasure(int i3, int i10) {
        int a10;
        int L;
        View[] viewArr = this.f29750a;
        if (this.f29756r == 1) {
            a10 = org.telegram.messenger.camera.q.A(2.0f, this.f29753e - 1, View.MeasureSpec.getSize(i3)) / this.f29753e;
        } else {
            a10 = a(this.f29753e);
        }
        this.h = true;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f29753e; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            if (this.f29754f) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(2.0f);
            }
            layoutParams.topMargin = L;
            layoutParams.leftMargin = (org.telegram.messenger.g0.L(2.0f) + a10) * i12;
            if (i12 == this.f29753e - 1) {
                if (org.telegram.messenger.g0.Q1()) {
                    layoutParams.width = org.telegram.messenger.g0.L(490.0f) - ((org.telegram.messenger.g0.L(2.0f) + a10) * (this.f29753e - 1));
                } else {
                    layoutParams.width = org.telegram.messenger.g0.f22608q.x - ((org.telegram.messenger.g0.L(2.0f) + a10) * (this.f29753e - 1));
                }
            } else {
                layoutParams.width = a10;
            }
            layoutParams.height = a10;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        this.h = false;
        if (!this.f29754f) {
            i11 = org.telegram.messenger.g0.L(2.0f);
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(i11 + a10, 1073741824));
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
        this.f29754f = z10;
    }

    public void setItemsCount(int i3) {
        int i10;
        l7[] l7VarArr = this.f29750a;
        for (int i11 = 0; i11 < l7VarArr.length; i11++) {
            l7VarArr[i11].clearAnimation();
            l7 l7Var = l7VarArr[i11];
            if (i11 < i3) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            l7Var.setVisibility(i10);
        }
        this.f29753e = i3;
    }

    @Override
    public final void updateColors() {
        try {
            this.f29755n.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zi, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
