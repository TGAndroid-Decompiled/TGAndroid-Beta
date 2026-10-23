package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class st0 implements ViewTreeObserver.OnPreDrawListener {
    public final mm0 f30551a;
    public final SparseBooleanArray f30552b;
    public final View f30553c;
    public final int d;
    public final xv0 e;

    public st0(xv0 xv0Var, mm0 mm0Var, SparseBooleanArray sparseBooleanArray, b10 b10Var, int i10) {
        this.e = xv0Var;
        this.f30551a = mm0Var;
        this.f30552b = sparseBooleanArray;
        this.f30553c = b10Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        xv0 xv0Var = this.e;
        xv0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final mm0 mm0Var = this.f30551a;
        s4.g0 adapter = mm0Var.getAdapter();
        if (adapter != xv0Var.H && adapter != xv0Var.K && adapter != xv0Var.M && adapter != xv0Var.L) {
            int childCount = mm0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt2 = mm0Var.getChildAt(i10);
                View view = this.f30553c;
                if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(mm0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / mm0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    mm0 mm0Var2 = mm0Var;
                                    if (mm0Var2.c1()) {
                                        mm0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    mm0 mm0Var3 = mm0Var;
                                    if (mm0Var3.c1()) {
                                        mm0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    mm0 mm0Var4 = mm0Var;
                                    if (mm0Var4.c1()) {
                                        mm0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    mm0Var.addView(view);
                    s4.n0 layoutManager = mm0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new i60(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        mm0 mm0Var2 = mm0Var;
                                        if (mm0Var2.c1()) {
                                            mm0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        mm0 mm0Var3 = mm0Var;
                                        if (mm0Var3.c1()) {
                                            mm0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        mm0 mm0Var4 = mm0Var;
                                        if (mm0Var4.c1()) {
                                            mm0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f30552b;
        if (sparseBooleanArray != null) {
            int childCount2 = mm0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                int q6 = xv0.q(mm0Var.getChildAt(i11));
                if (q6 != 0 && sparseBooleanArray.get(q6, false)) {
                    xv0Var.P1.put(q6, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new ei.o4(this, q6, mm0Var));
                    ofFloat3.addListener(new gi.p2(this, q6, 11));
                    ofFloat3.setStartDelay((int) ((Math.min(mm0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / mm0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    mm0 mm0Var2 = mm0Var;
                                    if (mm0Var2.c1()) {
                                        mm0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    mm0 mm0Var3 = mm0Var;
                                    if (mm0Var3.c1()) {
                                        mm0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    mm0 mm0Var4 = mm0Var;
                                    if (mm0Var4.c1()) {
                                        mm0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                mm0Var.invalidate();
            }
        }
        return true;
    }
}
