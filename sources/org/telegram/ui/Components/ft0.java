package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ft0 implements ViewTreeObserver.OnPreDrawListener {
    public final wl0 f24231a;
    public final SparseBooleanArray f24232b;
    public final View f24233c;
    public final int d;
    public final kv0 e;

    public ft0(kv0 kv0Var, wl0 wl0Var, SparseBooleanArray sparseBooleanArray, t00 t00Var, int i10) {
        this.e = kv0Var;
        this.f24231a = wl0Var;
        this.f24232b = sparseBooleanArray;
        this.f24233c = t00Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        kv0 kv0Var = this.e;
        kv0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final wl0 wl0Var = this.f24231a;
        s4.h0 adapter = wl0Var.getAdapter();
        if (adapter != kv0Var.H && adapter != kv0Var.K && adapter != kv0Var.M && adapter != kv0Var.L) {
            int childCount = wl0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = wl0Var.getChildAt(i10);
                View view = this.f24233c;
                if (childAt != view && RecyclerView.S(childAt) >= this.d - 1) {
                    childAt.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(wl0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / wl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    wl0 wl0Var2 = wl0Var;
                                    if (wl0Var2.c1()) {
                                        wl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    wl0 wl0Var3 = wl0Var;
                                    if (wl0Var3.c1()) {
                                        wl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    wl0 wl0Var4 = wl0Var;
                                    if (wl0Var4.c1()) {
                                        wl0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    wl0Var.addView(view);
                    s4.o0 layoutManager = wl0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new ed0(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        wl0 wl0Var2 = wl0Var;
                                        if (wl0Var2.c1()) {
                                            wl0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        wl0 wl0Var3 = wl0Var;
                                        if (wl0Var3.c1()) {
                                            wl0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        wl0 wl0Var4 = wl0Var;
                                        if (wl0Var4.c1()) {
                                            wl0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f24232b;
        if (sparseBooleanArray != null) {
            int childCount2 = wl0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = wl0Var.getChildAt(i11);
                int p5 = kv0.p(childAt2);
                if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                    kv0Var.O1.put(p5, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new ci.x4(this, p5, wl0Var));
                    ofFloat3.addListener(new ei.v2(this, p5, 10));
                    ofFloat3.setStartDelay((int) ((Math.min(wl0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / wl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    wl0 wl0Var2 = wl0Var;
                                    if (wl0Var2.c1()) {
                                        wl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    wl0 wl0Var3 = wl0Var;
                                    if (wl0Var3.c1()) {
                                        wl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    wl0 wl0Var4 = wl0Var;
                                    if (wl0Var4.c1()) {
                                        wl0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                wl0Var.invalidate();
            }
        }
        return true;
    }
}
