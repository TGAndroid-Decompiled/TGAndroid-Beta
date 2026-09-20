package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class et0 implements ViewTreeObserver.OnPreDrawListener {
    public final vl0 f23931a;
    public final SparseBooleanArray f23932b;
    public final View f23933c;
    public final int d;
    public final jv0 e;

    public et0(jv0 jv0Var, vl0 vl0Var, SparseBooleanArray sparseBooleanArray, t00 t00Var, int i10) {
        this.e = jv0Var;
        this.f23931a = vl0Var;
        this.f23932b = sparseBooleanArray;
        this.f23933c = t00Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        jv0 jv0Var = this.e;
        jv0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final vl0 vl0Var = this.f23931a;
        s4.h0 adapter = vl0Var.getAdapter();
        if (adapter != jv0Var.H && adapter != jv0Var.K && adapter != jv0Var.M && adapter != jv0Var.L) {
            int childCount = vl0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = vl0Var.getChildAt(i10);
                View view = this.f23933c;
                if (childAt != view && RecyclerView.S(childAt) >= this.d - 1) {
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
                                    if (vl0Var2.c1()) {
                                        vl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    vl0 vl0Var3 = vl0Var;
                                    if (vl0Var3.c1()) {
                                        vl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    vl0 vl0Var4 = vl0Var;
                                    if (vl0Var4.c1()) {
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
                        ofFloat2.addListener(new dd0(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        vl0 vl0Var2 = vl0Var;
                                        if (vl0Var2.c1()) {
                                            vl0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        vl0 vl0Var3 = vl0Var;
                                        if (vl0Var3.c1()) {
                                            vl0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        vl0 vl0Var4 = vl0Var;
                                        if (vl0Var4.c1()) {
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
        SparseBooleanArray sparseBooleanArray = this.f23932b;
        if (sparseBooleanArray != null) {
            int childCount2 = vl0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = vl0Var.getChildAt(i11);
                int p5 = jv0.p(childAt2);
                if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                    jv0Var.O1.put(p5, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new ci.x4(this, p5, vl0Var));
                    ofFloat3.addListener(new ei.v2(this, p5, 10));
                    ofFloat3.setStartDelay((int) ((Math.min(vl0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / vl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    vl0 vl0Var2 = vl0Var;
                                    if (vl0Var2.c1()) {
                                        vl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    vl0 vl0Var3 = vl0Var;
                                    if (vl0Var3.c1()) {
                                        vl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    vl0 vl0Var4 = vl0Var;
                                    if (vl0Var4.c1()) {
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
