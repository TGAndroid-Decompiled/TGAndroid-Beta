package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class cu0 implements ViewTreeObserver.OnPreDrawListener {
    public final wm0 f25019a;
    public final SparseBooleanArray f25020b;
    public final View f25021c;
    public final int d;
    public final hw0 f25022e;

    public cu0(hw0 hw0Var, wm0 wm0Var, SparseBooleanArray sparseBooleanArray, m10 m10Var, int i10) {
        this.f25022e = hw0Var;
        this.f25019a = wm0Var;
        this.f25020b = sparseBooleanArray;
        this.f25021c = m10Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        hw0 hw0Var = this.f25022e;
        hw0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final wm0 wm0Var = this.f25019a;
        s4.i0 adapter = wm0Var.getAdapter();
        if (adapter != hw0Var.H && adapter != hw0Var.K && adapter != hw0Var.M && adapter != hw0Var.L) {
            int childCount = wm0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt2 = wm0Var.getChildAt(i10);
                View view = this.f25021c;
                if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(wm0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / wm0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    wm0 wm0Var2 = wm0Var;
                                    if (wm0Var2.b1()) {
                                        wm0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    wm0 wm0Var3 = wm0Var;
                                    if (wm0Var3.b1()) {
                                        wm0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    wm0 wm0Var4 = wm0Var;
                                    if (wm0Var4.b1()) {
                                        wm0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    wm0Var.addView(view);
                    s4.p0 layoutManager = wm0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new zd0(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        wm0 wm0Var2 = wm0Var;
                                        if (wm0Var2.b1()) {
                                            wm0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        wm0 wm0Var3 = wm0Var;
                                        if (wm0Var3.b1()) {
                                            wm0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        wm0 wm0Var4 = wm0Var;
                                        if (wm0Var4.b1()) {
                                            wm0Var4.invalidate();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        ofFloat2.start();
                    }
                }
            }
            animatorSet.start();
            return true;
        }
        SparseBooleanArray sparseBooleanArray = this.f25020b;
        if (sparseBooleanArray != null) {
            int childCount2 = wm0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                int p5 = hw0.p(wm0Var.getChildAt(i11));
                if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                    hw0Var.O1.put(p5, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new ci.v4(this, p5, wm0Var));
                    ofFloat3.addListener(new ei.v2(this, p5, 11));
                    ofFloat3.setStartDelay((int) ((Math.min(wm0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / wm0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    wm0 wm0Var2 = wm0Var;
                                    if (wm0Var2.b1()) {
                                        wm0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    wm0 wm0Var3 = wm0Var;
                                    if (wm0Var3.b1()) {
                                        wm0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    wm0 wm0Var4 = wm0Var;
                                    if (wm0Var4.b1()) {
                                        wm0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                wm0Var.invalidate();
            }
        }
        return true;
    }
}
