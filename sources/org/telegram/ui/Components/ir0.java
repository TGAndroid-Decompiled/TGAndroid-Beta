package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ir0 implements ViewTreeObserver.OnPreDrawListener {
    public final ck0 f36177a;
    public final SparseBooleanArray f36178b;
    public final View f36179c;
    public final int d;
    public final gt0 f36180e;

    public ir0(gt0 gt0Var, ck0 ck0Var, SparseBooleanArray sparseBooleanArray, wz wzVar, int i7) {
        this.f36180e = gt0Var;
        this.f36177a = ck0Var;
        this.f36178b = sparseBooleanArray;
        this.f36179c = wzVar;
        this.d = i7;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        gt0 gt0Var = this.f36180e;
        gt0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final ck0 ck0Var = this.f36177a;
        v4.i0 adapter = ck0Var.getAdapter();
        if (adapter != gt0Var.K && adapter != gt0Var.N && adapter != gt0Var.P && adapter != gt0Var.O) {
            int childCount = ck0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt2 = ck0Var.getChildAt(i7);
                View view = this.f36179c;
                if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(ck0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / ck0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r1) {
                                case 0:
                                    ck0 ck0Var2 = ck0Var;
                                    if (ck0Var2.b1()) {
                                        ck0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    ck0 ck0Var3 = ck0Var;
                                    if (ck0Var3.b1()) {
                                        ck0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    ck0 ck0Var4 = ck0Var;
                                    if (ck0Var4.b1()) {
                                        ck0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    ck0Var.addView(view);
                    v4.p0 layoutManager = ck0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new q60(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r1) {
                                    case 0:
                                        ck0 ck0Var2 = ck0Var;
                                        if (ck0Var2.b1()) {
                                            ck0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        ck0 ck0Var3 = ck0Var;
                                        if (ck0Var3.b1()) {
                                            ck0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        ck0 ck0Var4 = ck0Var;
                                        if (ck0Var4.b1()) {
                                            ck0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f36178b;
        if (sparseBooleanArray != null) {
            int childCount2 = ck0Var.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                int o4 = gt0.o(ck0Var.getChildAt(i10));
                if (o4 != 0 && sparseBooleanArray.get(o4, false)) {
                    gt0Var.S1.put(o4, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new hi.a4(this, o4, ck0Var));
                    ofFloat3.addListener(new ki.f2(this, o4, 13));
                    ofFloat3.setStartDelay((int) ((Math.min(ck0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / ck0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r1) {
                                case 0:
                                    ck0 ck0Var2 = ck0Var;
                                    if (ck0Var2.b1()) {
                                        ck0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    ck0 ck0Var3 = ck0Var;
                                    if (ck0Var3.b1()) {
                                        ck0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    ck0 ck0Var4 = ck0Var;
                                    if (ck0Var4.b1()) {
                                        ck0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                ck0Var.invalidate();
            }
        }
        return true;
    }
}
