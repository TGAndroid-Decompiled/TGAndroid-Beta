package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class jr0 implements ViewTreeObserver.OnPreDrawListener {
    public final ek0 f36499a;
    public final SparseBooleanArray f36500b;
    public final View f36501c;
    public final int d;
    public final it0 f36502e;

    public jr0(it0 it0Var, ek0 ek0Var, SparseBooleanArray sparseBooleanArray, vz vzVar, int i7) {
        this.f36502e = it0Var;
        this.f36499a = ek0Var;
        this.f36500b = sparseBooleanArray;
        this.f36501c = vzVar;
        this.d = i7;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        it0 it0Var = this.f36502e;
        it0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final ek0 ek0Var = this.f36499a;
        v4.i0 adapter = ek0Var.getAdapter();
        if (adapter != it0Var.K && adapter != it0Var.N && adapter != it0Var.P && adapter != it0Var.O) {
            int childCount = ek0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt2 = ek0Var.getChildAt(i7);
                View view = this.f36501c;
                if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(ek0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / ek0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r1) {
                                case 0:
                                    ek0 ek0Var2 = ek0Var;
                                    if (ek0Var2.b1()) {
                                        ek0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    ek0 ek0Var3 = ek0Var;
                                    if (ek0Var3.b1()) {
                                        ek0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    ek0 ek0Var4 = ek0Var;
                                    if (ek0Var4.b1()) {
                                        ek0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    ek0Var.addView(view);
                    v4.p0 layoutManager = ek0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new p60(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r1) {
                                    case 0:
                                        ek0 ek0Var2 = ek0Var;
                                        if (ek0Var2.b1()) {
                                            ek0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        ek0 ek0Var3 = ek0Var;
                                        if (ek0Var3.b1()) {
                                            ek0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        ek0 ek0Var4 = ek0Var;
                                        if (ek0Var4.b1()) {
                                            ek0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f36500b;
        if (sparseBooleanArray != null) {
            int childCount2 = ek0Var.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                int o4 = it0.o(ek0Var.getChildAt(i10));
                if (o4 != 0 && sparseBooleanArray.get(o4, false)) {
                    it0Var.S1.put(o4, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new hi.j4(this, o4, ek0Var));
                    ofFloat3.addListener(new ki.e2(this, o4, 13));
                    ofFloat3.setStartDelay((int) ((Math.min(ek0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / ek0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r1) {
                                case 0:
                                    ek0 ek0Var2 = ek0Var;
                                    if (ek0Var2.b1()) {
                                        ek0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    ek0 ek0Var3 = ek0Var;
                                    if (ek0Var3.b1()) {
                                        ek0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    ek0 ek0Var4 = ek0Var;
                                    if (ek0Var4.b1()) {
                                        ek0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                ek0Var.invalidate();
            }
        }
        return true;
    }
}
