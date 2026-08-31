package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ts0 implements ViewTreeObserver.OnPreDrawListener {
    public final tl0 f31447a;
    public final SparseBooleanArray f31448b;
    public final View f31449c;
    public final int d;
    public final zu0 f31450e;

    public ts0(zu0 zu0Var, tl0 tl0Var, SparseBooleanArray sparseBooleanArray, u00 u00Var, int i10) {
        this.f31450e = zu0Var;
        this.f31447a = tl0Var;
        this.f31448b = sparseBooleanArray;
        this.f31449c = u00Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        zu0 zu0Var = this.f31450e;
        zu0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final tl0 tl0Var = this.f31447a;
        f2.p0 adapter = tl0Var.getAdapter();
        if (adapter != zu0Var.E && adapter != zu0Var.H && adapter != zu0Var.J && adapter != zu0Var.I) {
            int childCount = tl0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = tl0Var.getChildAt(i10);
                View view = this.f31449c;
                if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                    childAt.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(tl0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / tl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    tl0 tl0Var2 = tl0Var;
                                    if (tl0Var2.b1()) {
                                        tl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    tl0 tl0Var3 = tl0Var;
                                    if (tl0Var3.b1()) {
                                        tl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    tl0 tl0Var4 = tl0Var;
                                    if (tl0Var4.b1()) {
                                        tl0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    tl0Var.addView(view);
                    f2.w0 layoutManager = tl0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new pd0(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        tl0 tl0Var2 = tl0Var;
                                        if (tl0Var2.b1()) {
                                            tl0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        tl0 tl0Var3 = tl0Var;
                                        if (tl0Var3.b1()) {
                                            tl0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        tl0 tl0Var4 = tl0Var;
                                        if (tl0Var4.b1()) {
                                            tl0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f31448b;
        if (sparseBooleanArray != null) {
            int childCount2 = tl0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = tl0Var.getChildAt(i11);
                int p10 = zu0.p(childAt2);
                if (p10 != 0 && sparseBooleanArray.get(p10, false)) {
                    zu0Var.L1.put(p10, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new eg.s(this, p10, tl0Var));
                    ofFloat3.addListener(new org.telegram.ui.Cells.b4(this, p10, 7));
                    ofFloat3.setStartDelay((int) ((Math.min(tl0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / tl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    tl0 tl0Var2 = tl0Var;
                                    if (tl0Var2.b1()) {
                                        tl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    tl0 tl0Var3 = tl0Var;
                                    if (tl0Var3.b1()) {
                                        tl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    tl0 tl0Var4 = tl0Var;
                                    if (tl0Var4.b1()) {
                                        tl0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                tl0Var.invalidate();
            }
        }
        return true;
    }
}
