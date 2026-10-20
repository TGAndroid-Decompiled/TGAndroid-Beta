package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class pt0 implements ViewTreeObserver.OnPreDrawListener {
    public final jm0 f29391a;
    public final SparseBooleanArray f29392b;
    public final View f29393c;
    public final int d;
    public final uv0 e;

    public pt0(uv0 uv0Var, jm0 jm0Var, SparseBooleanArray sparseBooleanArray, b10 b10Var, int i10) {
        this.e = uv0Var;
        this.f29391a = jm0Var;
        this.f29392b = sparseBooleanArray;
        this.f29393c = b10Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        uv0 uv0Var = this.e;
        uv0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final jm0 jm0Var = this.f29391a;
        s4.g0 adapter = jm0Var.getAdapter();
        if (adapter != uv0Var.H && adapter != uv0Var.K && adapter != uv0Var.M && adapter != uv0Var.L) {
            int childCount = jm0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt2 = jm0Var.getChildAt(i10);
                View view = this.f29393c;
                if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(jm0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / jm0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    jm0 jm0Var2 = jm0Var;
                                    if (jm0Var2.b1()) {
                                        jm0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    jm0 jm0Var3 = jm0Var;
                                    if (jm0Var3.b1()) {
                                        jm0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    jm0 jm0Var4 = jm0Var;
                                    if (jm0Var4.b1()) {
                                        jm0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    jm0Var.addView(view);
                    s4.n0 layoutManager = jm0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new c80(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        jm0 jm0Var2 = jm0Var;
                                        if (jm0Var2.b1()) {
                                            jm0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        jm0 jm0Var3 = jm0Var;
                                        if (jm0Var3.b1()) {
                                            jm0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        jm0 jm0Var4 = jm0Var;
                                        if (jm0Var4.b1()) {
                                            jm0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f29392b;
        if (sparseBooleanArray != null) {
            int childCount2 = jm0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                int q6 = uv0.q(jm0Var.getChildAt(i11));
                if (q6 != 0 && sparseBooleanArray.get(q6, false)) {
                    uv0Var.O1.put(q6, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new ei.o4(this, q6, jm0Var));
                    ofFloat3.addListener(new gi.p2(this, q6, 11));
                    ofFloat3.setStartDelay((int) ((Math.min(jm0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / jm0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    jm0 jm0Var2 = jm0Var;
                                    if (jm0Var2.b1()) {
                                        jm0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    jm0 jm0Var3 = jm0Var;
                                    if (jm0Var3.b1()) {
                                        jm0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    jm0 jm0Var4 = jm0Var;
                                    if (jm0Var4.b1()) {
                                        jm0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                jm0Var.invalidate();
            }
        }
        return true;
    }
}
