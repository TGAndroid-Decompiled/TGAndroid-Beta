package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ct0 implements ViewTreeObserver.OnPreDrawListener {
    public final vl0 f22221a;
    public final SparseBooleanArray f22222b;
    public final View f22223c;
    public final int d;
    public final iv0 e;

    public ct0(iv0 iv0Var, vl0 vl0Var, SparseBooleanArray sparseBooleanArray, a10 a10Var, int i10) {
        this.e = iv0Var;
        this.f22221a = vl0Var;
        this.f22222b = sparseBooleanArray;
        this.f22223c = a10Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        iv0 iv0Var = this.e;
        iv0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final vl0 vl0Var = this.f22221a;
        s4.h0 adapter = vl0Var.getAdapter();
        if (adapter != iv0Var.H && adapter != iv0Var.K && adapter != iv0Var.M && adapter != iv0Var.L) {
            int childCount = vl0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = vl0Var.getChildAt(i10);
                View view = this.f22223c;
                if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                    childAt.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(vl0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / vl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    vl0 vl0Var2 = vl0Var;
                                    if (vl0Var2.a1()) {
                                        vl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    vl0 vl0Var3 = vl0Var;
                                    if (vl0Var3.a1()) {
                                        vl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    vl0 vl0Var4 = vl0Var;
                                    if (vl0Var4.a1()) {
                                        vl0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    vl0Var.addView(view);
                    s4.o0 layoutManager = vl0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new zn0(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        vl0 vl0Var2 = vl0Var;
                                        if (vl0Var2.a1()) {
                                            vl0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        vl0 vl0Var3 = vl0Var;
                                        if (vl0Var3.a1()) {
                                            vl0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        vl0 vl0Var4 = vl0Var;
                                        if (vl0Var4.a1()) {
                                            vl0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f22222b;
        if (sparseBooleanArray != null) {
            int childCount2 = vl0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = vl0Var.getChildAt(i11);
                int p5 = iv0.p(childAt2);
                if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                    iv0Var.O1.put(p5, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new bi.s5(this, p5, vl0Var));
                    ofFloat3.addListener(new di.y2(this, p5, 10));
                    ofFloat3.setStartDelay((int) ((Math.min(vl0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / vl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    vl0 vl0Var2 = vl0Var;
                                    if (vl0Var2.a1()) {
                                        vl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    vl0 vl0Var3 = vl0Var;
                                    if (vl0Var3.a1()) {
                                        vl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    vl0 vl0Var4 = vl0Var;
                                    if (vl0Var4.a1()) {
                                        vl0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                vl0Var.invalidate();
            }
        }
        return true;
    }
}
