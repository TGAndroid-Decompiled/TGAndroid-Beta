package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class au0 implements ViewTreeObserver.OnPreDrawListener {
    public final nm0 f26665a;
    public final SparseBooleanArray f26666b;
    public final View f26667c;
    public final int d;
    public final bw0 e;

    public au0(bw0 bw0Var, nm0 nm0Var, SparseBooleanArray sparseBooleanArray, c10 c10Var, int i10) {
        this.e = bw0Var;
        this.f26665a = nm0Var;
        this.f26666b = sparseBooleanArray;
        this.f26667c = c10Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        bw0 bw0Var = this.e;
        bw0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final nm0 nm0Var = this.f26665a;
        s4.h0 adapter = nm0Var.getAdapter();
        if (adapter != bw0Var.J && adapter != bw0Var.M && adapter != bw0Var.O && adapter != bw0Var.N) {
            int childCount = nm0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt2 = nm0Var.getChildAt(i10);
                View view = this.f26667c;
                if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(nm0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / nm0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    nm0 nm0Var2 = nm0Var;
                                    if (nm0Var2.b1()) {
                                        nm0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    nm0 nm0Var3 = nm0Var;
                                    if (nm0Var3.b1()) {
                                        nm0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    nm0 nm0Var4 = nm0Var;
                                    if (nm0Var4.b1()) {
                                        nm0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    nm0Var.addView(view);
                    s4.p0 layoutManager = nm0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new i10(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        nm0 nm0Var2 = nm0Var;
                                        if (nm0Var2.b1()) {
                                            nm0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        nm0 nm0Var3 = nm0Var;
                                        if (nm0Var3.b1()) {
                                            nm0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        nm0 nm0Var4 = nm0Var;
                                        if (nm0Var4.b1()) {
                                            nm0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f26666b;
        if (sparseBooleanArray != null) {
            int childCount2 = nm0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                int r6 = bw0.r(nm0Var.getChildAt(i11));
                if (r6 != 0 && sparseBooleanArray.get(r6, false)) {
                    bw0Var.R1.put(r6, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new fi.n4(this, r6, nm0Var));
                    ofFloat3.addListener(new hi.y2(this, r6, 11));
                    ofFloat3.setStartDelay((int) ((Math.min(nm0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / nm0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    nm0 nm0Var2 = nm0Var;
                                    if (nm0Var2.b1()) {
                                        nm0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    nm0 nm0Var3 = nm0Var;
                                    if (nm0Var3.b1()) {
                                        nm0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    nm0 nm0Var4 = nm0Var;
                                    if (nm0Var4.b1()) {
                                        nm0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                nm0Var.invalidate();
            }
        }
        return true;
    }
}
