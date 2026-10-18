package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class nt0 implements ViewTreeObserver.OnPreDrawListener {
    public final im0 f28823a;
    public final SparseBooleanArray f28824b;
    public final View f28825c;
    public final int d;
    public final sv0 e;

    public nt0(sv0 sv0Var, im0 im0Var, SparseBooleanArray sparseBooleanArray, b10 b10Var, int i10) {
        this.e = sv0Var;
        this.f28823a = im0Var;
        this.f28824b = sparseBooleanArray;
        this.f28825c = b10Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        sv0 sv0Var = this.e;
        sv0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final im0 im0Var = this.f28823a;
        s4.g0 adapter = im0Var.getAdapter();
        if (adapter != sv0Var.H && adapter != sv0Var.K && adapter != sv0Var.M && adapter != sv0Var.L) {
            int childCount = im0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt2 = im0Var.getChildAt(i10);
                View view = this.f28825c;
                if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(im0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / im0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    im0 im0Var2 = im0Var;
                                    if (im0Var2.b1()) {
                                        im0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    im0 im0Var3 = im0Var;
                                    if (im0Var3.b1()) {
                                        im0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    im0 im0Var4 = im0Var;
                                    if (im0Var4.b1()) {
                                        im0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    im0Var.addView(view);
                    s4.n0 layoutManager = im0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new c80(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        im0 im0Var2 = im0Var;
                                        if (im0Var2.b1()) {
                                            im0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        im0 im0Var3 = im0Var;
                                        if (im0Var3.b1()) {
                                            im0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        im0 im0Var4 = im0Var;
                                        if (im0Var4.b1()) {
                                            im0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f28824b;
        if (sparseBooleanArray != null) {
            int childCount2 = im0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                int q6 = sv0.q(im0Var.getChildAt(i11));
                if (q6 != 0 && sparseBooleanArray.get(q6, false)) {
                    sv0Var.O1.put(q6, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new ei.o4(this, q6, im0Var));
                    ofFloat3.addListener(new gi.p2(this, q6, 11));
                    ofFloat3.setStartDelay((int) ((Math.min(im0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / im0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    im0 im0Var2 = im0Var;
                                    if (im0Var2.b1()) {
                                        im0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    im0 im0Var3 = im0Var;
                                    if (im0Var3.b1()) {
                                        im0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    im0 im0Var4 = im0Var;
                                    if (im0Var4.b1()) {
                                        im0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                im0Var.invalidate();
            }
        }
        return true;
    }
}
