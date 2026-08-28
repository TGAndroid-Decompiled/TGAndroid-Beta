package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class zr0 implements ViewTreeObserver.OnPreDrawListener {
    public final wk0 f35365a;
    public final SparseBooleanArray f35366b;
    public final View f35367c;
    public final int d;
    public final eu0 f35368e;

    public zr0(eu0 eu0Var, wk0 wk0Var, SparseBooleanArray sparseBooleanArray, e00 e00Var, int i9) {
        this.f35368e = eu0Var;
        this.f35365a = wk0Var;
        this.f35366b = sparseBooleanArray;
        this.f35367c = e00Var;
        this.d = i9;
    }

    @Override
    public final boolean onPreDraw() {
        eu0 eu0Var = this.f35368e;
        eu0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final wk0 wk0Var = this.f35365a;
        f2.r0 adapter = wk0Var.getAdapter();
        if (adapter != eu0Var.D && adapter != eu0Var.G && adapter != eu0Var.I && adapter != eu0Var.H) {
            int childCount = wk0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = wk0Var.getChildAt(i9);
                View view = this.f35367c;
                if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                    childAt.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(wk0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / wk0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    wk0 wk0Var2 = wk0Var;
                                    if (wk0Var2.b1()) {
                                        wk0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    wk0 wk0Var3 = wk0Var;
                                    if (wk0Var3.b1()) {
                                        wk0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    wk0 wk0Var4 = wk0Var;
                                    if (wk0Var4.b1()) {
                                        wk0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    wk0Var.addView(view);
                    f2.z0 layoutManager = wk0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new r60(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        wk0 wk0Var2 = wk0Var;
                                        if (wk0Var2.b1()) {
                                            wk0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        wk0 wk0Var3 = wk0Var;
                                        if (wk0Var3.b1()) {
                                            wk0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        wk0 wk0Var4 = wk0Var;
                                        if (wk0Var4.b1()) {
                                            wk0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f35366b;
        if (sparseBooleanArray != null) {
            int childCount2 = wk0Var.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = wk0Var.getChildAt(i10);
                int p6 = eu0.p(childAt2);
                if (p6 != 0 && sparseBooleanArray.get(p6, false)) {
                    eu0Var.K1.put(p6, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new kh.p4(this, p6, wk0Var));
                    ofFloat3.addListener(new mh.o2(this, p6, 9));
                    ofFloat3.setStartDelay((int) ((Math.min(wk0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / wk0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    wk0 wk0Var2 = wk0Var;
                                    if (wk0Var2.b1()) {
                                        wk0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    wk0 wk0Var3 = wk0Var;
                                    if (wk0Var3.b1()) {
                                        wk0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    wk0 wk0Var4 = wk0Var;
                                    if (wk0Var4.b1()) {
                                        wk0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                wk0Var.invalidate();
            }
        }
        return true;
    }
}
