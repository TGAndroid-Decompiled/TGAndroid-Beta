package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

public final class as0 implements ViewTreeObserver.OnPreDrawListener {

    public final zk0 f26814a;

    public final SparseBooleanArray f26815b;

    public final View f26816c;
    public final int d;

    public final hu0 f26817e;

    public as0(hu0 hu0Var, zk0 zk0Var, SparseBooleanArray sparseBooleanArray, h00 h00Var, int i10) {
        this.f26817e = hu0Var;
        this.f26814a = zk0Var;
        this.f26815b = sparseBooleanArray;
        this.f26816c = h00Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        hu0 hu0Var = this.f26817e;
        hu0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final zk0 zk0Var = this.f26814a;
        f2.q0 adapter = zk0Var.getAdapter();
        final int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        if (adapter == hu0Var.D || adapter == hu0Var.G || adapter == hu0Var.I || adapter == hu0Var.H) {
            SparseBooleanArray sparseBooleanArray = this.f26815b;
            if (sparseBooleanArray != null) {
                int childCount = zk0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = zk0Var.getChildAt(i13);
                    int iP = hu0.p(childAt);
                    if (iP != 0 && sparseBooleanArray.get(iP, false)) {
                        hu0Var.K1.put(iP, Float.valueOf(0.0f));
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new lh.n4(this, iP, zk0Var));
                        valueAnimatorOfFloat.addListener(new nh.n2(this, iP, 9));
                        valueAnimatorOfFloat.setStartDelay((int) ((Math.min(zk0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / zk0Var.getMeasuredHeight()) * 100.0f));
                        valueAnimatorOfFloat.setDuration(250L);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        zk0 zk0Var2 = zk0Var;
                                        if (zk0Var2.b1()) {
                                            zk0Var2.invalidate();
                                        }
                                        break;
                                    case 1:
                                        zk0 zk0Var3 = zk0Var;
                                        if (zk0Var3.b1()) {
                                            zk0Var3.invalidate();
                                        }
                                        break;
                                    default:
                                        zk0 zk0Var4 = zk0Var;
                                        if (zk0Var4.b1()) {
                                            zk0Var4.invalidate();
                                        }
                                        break;
                                }
                            }
                        });
                        valueAnimatorOfFloat.start();
                    }
                    zk0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = zk0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = zk0Var.getChildAt(i14);
            View view = this.f26816c;
            if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                childAt2.setAlpha(0.0f);
                int iMin = (int) ((Math.min(zk0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / zk0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat.setStartDelay(iMin);
                objectAnimatorOfFloat.setDuration(200L);
                objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                zk0 zk0Var2 = zk0Var;
                                if (zk0Var2.b1()) {
                                    zk0Var2.invalidate();
                                }
                                break;
                            case 1:
                                zk0 zk0Var3 = zk0Var;
                                if (zk0Var3.b1()) {
                                    zk0Var3.invalidate();
                                }
                                break;
                            default:
                                zk0 zk0Var4 = zk0Var;
                                if (zk0Var4.b1()) {
                                    zk0Var4.invalidate();
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(objectAnimatorOfFloat);
            }
            if (view != null && view.getParent() == null) {
                zk0Var.addView(view);
                f2.x0 layoutManager = zk0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    objectAnimatorOfFloat2.addListener(new sz(this, layoutManager));
                    objectAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    zk0 zk0Var2 = zk0Var;
                                    if (zk0Var2.b1()) {
                                        zk0Var2.invalidate();
                                    }
                                    break;
                                case 1:
                                    zk0 zk0Var3 = zk0Var;
                                    if (zk0Var3.b1()) {
                                        zk0Var3.invalidate();
                                    }
                                    break;
                                default:
                                    zk0 zk0Var4 = zk0Var;
                                    if (zk0Var4.b1()) {
                                        zk0Var4.invalidate();
                                    }
                                    break;
                            }
                        }
                    });
                    objectAnimatorOfFloat2.start();
                }
            }
        }
        animatorSet.start();
        return true;
    }
}
