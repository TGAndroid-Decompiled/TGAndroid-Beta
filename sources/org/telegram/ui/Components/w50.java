package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class w50 extends ViewGroup {
    public boolean f39856a;
    public final ArrayList f39857b;
    public c20 f39858c;
    public boolean d;
    public final x50 f39859e;

    public w50(x50 x50Var, Context context) {
        super(context);
        this.f39859e = x50Var;
        this.f39857b = new ArrayList();
    }

    public final void a(c20 c20Var, boolean z9) {
        this.d = true;
        x50 x50Var = this.f39859e;
        x50Var.W1.k(c20Var, c20Var.getUid());
        AnimatorSet animatorSet = x50Var.U1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            x50Var.U1.cancel();
        }
        this.f39856a = false;
        if (z9) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            x50Var.U1 = animatorSet2;
            animatorSet2.addListener(new u50(this, 1));
            x50Var.U1.setDuration(150L);
            x50Var.U1.setInterpolator(xq.f40310f);
            ArrayList arrayList = this.f39857b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(c20Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(c20Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(c20Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(c20Var);
    }

    public final void b(c20 c20Var) {
        this.d = false;
        x50 x50Var = this.f39859e;
        x50Var.W1.l(c20Var.getUid());
        c20Var.setOnClickListener(null);
        AnimatorSet animatorSet = x50Var.U1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            x50Var.U1.cancel();
        }
        this.f39856a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        x50Var.U1 = animatorSet2;
        animatorSet2.addListener(new v50(0, this, c20Var));
        x50Var.U1.setDuration(150L);
        this.f39858c = c20Var;
        ArrayList arrayList = this.f39857b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f39858c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f39858c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f39858c, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList;
        int e10;
        int i11;
        v4.d1 K;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.m1 m1Var;
        int i12;
        x50 x50Var = this.f39859e;
        org.telegram.ui.ActionBar.m1 m1Var2 = x50Var.M1;
        bi.q1 q1Var = x50Var.f39833k1;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(26.0f);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            arrayList = this.f39857b;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (!(childAt instanceof c20)) {
                m1Var = m1Var2;
            } else {
                m1Var = m1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                if (childAt != this.f39858c && childAt.getMeasuredWidth() + i14 > L) {
                    L2 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > L) {
                    L3 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i15 = 0;
                }
                int L4 = org.telegram.messenger.g0.L(13.0f) + i14;
                if (!this.f39856a) {
                    c20 c20Var = this.f39858c;
                    if (childAt == c20Var) {
                        childAt.setTranslationX(org.telegram.messenger.g0.L(13.0f) + i15);
                        childAt.setTranslationY(L3);
                    } else if (c20Var != null) {
                        float f10 = L4;
                        if (childAt.getTranslationX() != f10) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, f10));
                        } else {
                            i12 = 1;
                        }
                        float f11 = L2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr = new float[i12];
                            fArr[0] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                    }
                }
                if (childAt != this.f39858c) {
                    i14 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i13++;
            m1Var2 = m1Var;
        }
        org.telegram.ui.ActionBar.m1 m1Var3 = m1Var2;
        int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
        final int L6 = org.telegram.messenger.g0.L(42.0f) + L2;
        if (x50Var.d2 != null) {
            if (x50Var.X1) {
                e10 = Math.min(x50Var.f40165j2, L6);
            } else {
                e10 = 0;
            }
        } else {
            e10 = jg.g.e(52.0f, Math.min(x50Var.f40165j2, L6), 0);
        }
        int i16 = x50Var.f40167l2;
        if (x50Var.d2 == null && x50Var.W1.m() > 0) {
            i11 = org.telegram.messenger.g0.L(56.0f);
        } else {
            i11 = 0;
        }
        x50Var.f40167l2 = i11;
        if (e10 != x50Var.f40161f2 || i16 != i11) {
            x50Var.f40161f2 = e10;
            if (q1Var.getAdapter() != null && q1Var.getAdapter().b() > 0 && (K = q1Var.K(0)) != null) {
                q1Var.getAdapter().g(0);
                x50Var.I1.h1(0, K.f56927a.getTop() - q1Var.getPaddingTop());
                if (q1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new di.m4(this, 9));
                    ofFloat.setDuration(q1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(x50Var.f40165j2, L6);
        int i17 = x50Var.f40158b2;
        if (i17 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i17, min);
            ofInt.addUpdateListener(new e6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z9 = this.d;
        if (z9 && L6 > x50Var.f40165j2) {
            org.telegram.messenger.g0.h3(new Runnable(this) {
                public final w50 f38255b;

                {
                    this.f38255b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            x50 x50Var2 = this.f38255b.f39859e;
                            x50Var2.M1.smoothScrollTo(0, L6 - x50Var2.f40165j2);
                            return;
                        default:
                            x50 x50Var3 = this.f38255b.f39859e;
                            x50Var3.M1.smoothScrollTo(0, L6 - x50Var3.f40165j2);
                            return;
                    }
                }
            });
        } else if (!z9 && m1Var3.getMeasuredHeight() + m1Var3.getScrollY() > L6) {
            org.telegram.messenger.g0.h3(new Runnable(this) {
                public final w50 f38255b;

                {
                    this.f38255b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            x50 x50Var2 = this.f38255b.f39859e;
                            x50Var2.M1.smoothScrollTo(0, L6 - x50Var2.f40165j2);
                            return;
                        default:
                            x50 x50Var3 = this.f38255b.f39859e;
                            x50Var3.M1.smoothScrollTo(0, L6 - x50Var3.f40165j2);
                            return;
                    }
                }
            });
        }
        if (!this.f39856a && (animatorSet = x50Var.U1) != null) {
            animatorSet.playTogether(arrayList);
            x50Var.U1.addListener(new u50(this, 0));
            x50Var.U1.start();
            this.f39856a = true;
        }
        if (x50Var.U1 == null) {
            x50Var.f40158b2 = min;
            x50Var.f28615b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L6, L5));
        q1Var.setTranslationY(0.0f);
    }
}
