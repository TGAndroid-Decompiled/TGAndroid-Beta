package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ar0 implements ViewTreeObserver.OnPreDrawListener {
    public final uj0 f33047a;
    public final SparseBooleanArray f33048b;
    public final View f33049c;
    public final int d;
    public final ys0 f33050e;

    public ar0(ys0 ys0Var, uj0 uj0Var, SparseBooleanArray sparseBooleanArray, pz pzVar, int i7) {
        this.f33050e = ys0Var;
        this.f33047a = uj0Var;
        this.f33048b = sparseBooleanArray;
        this.f33049c = pzVar;
        this.d = i7;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        ys0 ys0Var = this.f33050e;
        ys0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final uj0 uj0Var = this.f33047a;
        v4.h0 adapter = uj0Var.getAdapter();
        if (adapter != ys0Var.K && adapter != ys0Var.N && adapter != ys0Var.P && adapter != ys0Var.O) {
            int childCount = uj0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt2 = uj0Var.getChildAt(i7);
                View view = this.f33049c;
                if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(uj0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / uj0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r1) {
                                case 0:
                                    uj0 uj0Var2 = uj0Var;
                                    if (uj0Var2.b1()) {
                                        uj0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    uj0 uj0Var3 = uj0Var;
                                    if (uj0Var3.b1()) {
                                        uj0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    uj0 uj0Var4 = uj0Var;
                                    if (uj0Var4.b1()) {
                                        uj0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    uj0Var.addView(view);
                    v4.o0 layoutManager = uj0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new h60(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r1) {
                                    case 0:
                                        uj0 uj0Var2 = uj0Var;
                                        if (uj0Var2.b1()) {
                                            uj0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        uj0 uj0Var3 = uj0Var;
                                        if (uj0Var3.b1()) {
                                            uj0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        uj0 uj0Var4 = uj0Var;
                                        if (uj0Var4.b1()) {
                                            uj0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f33048b;
        if (sparseBooleanArray != null) {
            int childCount2 = uj0Var.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                int o4 = ys0.o(uj0Var.getChildAt(i10));
                if (o4 != 0 && sparseBooleanArray.get(o4, false)) {
                    ys0Var.S1.put(o4, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new hi.a4(this, o4, uj0Var));
                    ofFloat3.addListener(new ki.j2(this, o4, 13));
                    ofFloat3.setStartDelay((int) ((Math.min(uj0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / uj0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r1) {
                                case 0:
                                    uj0 uj0Var2 = uj0Var;
                                    if (uj0Var2.b1()) {
                                        uj0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    uj0 uj0Var3 = uj0Var;
                                    if (uj0Var3.b1()) {
                                        uj0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    uj0 uj0Var4 = uj0Var;
                                    if (uj0Var4.b1()) {
                                        uj0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                uj0Var.invalidate();
            }
        }
        return true;
    }
}
