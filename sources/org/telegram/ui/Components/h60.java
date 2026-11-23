package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class h60 extends ViewGroup {
    public boolean f35645a;
    public final ArrayList f35646b;
    public n20 f35647c;
    public boolean d;
    public final i60 f35648e;

    public h60(i60 i60Var, Context context) {
        super(context);
        this.f35648e = i60Var;
        this.f35646b = new ArrayList();
    }

    public final void a(n20 n20Var, boolean z10) {
        this.d = true;
        i60 i60Var = this.f35648e;
        i60Var.f35937a2.k(n20Var, n20Var.getUid());
        AnimatorSet animatorSet = i60Var.Y1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            i60Var.Y1.cancel();
        }
        this.f35645a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            i60Var.Y1 = animatorSet2;
            animatorSet2.addListener(new g60(this, 1));
            i60Var.Y1.setDuration(150L);
            i60Var.Y1.setInterpolator(kr.f36858f);
            ArrayList arrayList = this.f35646b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(n20Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(n20Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(n20Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(n20Var);
    }

    public final void b(n20 n20Var) {
        this.d = false;
        i60 i60Var = this.f35648e;
        i60Var.f35937a2.l(n20Var.getUid());
        n20Var.setOnClickListener(null);
        AnimatorSet animatorSet = i60Var.Y1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            i60Var.Y1.cancel();
        }
        this.f35645a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        i60Var.Y1 = animatorSet2;
        animatorSet2.addListener(new f10(1, this, n20Var));
        i60Var.Y1.setDuration(150L);
        this.f35647c = n20Var;
        ArrayList arrayList = this.f35646b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f35647c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f35647c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f35647c, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList;
        int d;
        int i11;
        v4.f1 K;
        final int i12;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.l1 l1Var;
        int i13;
        i60 i60Var = this.f35648e;
        org.telegram.ui.ActionBar.l1 l1Var2 = i60Var.Q1;
        di.b1 b1Var = i60Var.f38698o1;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(26.0f);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f35646b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof n20)) {
                l1Var = l1Var2;
            } else {
                l1Var = l1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                if (childAt != this.f35647c && childAt.getMeasuredWidth() + i15 > L) {
                    L2 = org.telegram.messenger.f3.C(8.0f, childAt.getMeasuredHeight(), L2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > L) {
                    L3 = org.telegram.messenger.f3.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i16 = 0;
                }
                int L4 = org.telegram.messenger.g0.L(13.0f) + i15;
                if (!this.f35645a) {
                    n20 n20Var = this.f35647c;
                    if (childAt == n20Var) {
                        childAt.setTranslationX(org.telegram.messenger.g0.L(13.0f) + i16);
                        childAt.setTranslationY(L3);
                    } else if (n20Var != null) {
                        float f10 = L4;
                        if (childAt.getTranslationX() != f10) {
                            i13 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, f10));
                        } else {
                            i13 = 1;
                        }
                        float f11 = L2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr = new float[i13];
                            fArr[0] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                    }
                }
                if (childAt != this.f35647c) {
                    i15 = org.telegram.messenger.f3.C(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.f3.C(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            l1Var2 = l1Var;
        }
        org.telegram.ui.ActionBar.l1 l1Var3 = l1Var2;
        int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
        final int L6 = org.telegram.messenger.g0.L(42.0f) + L2;
        if (i60Var.f35943h2 != null) {
            if (i60Var.f35938b2) {
                d = Math.min(i60Var.f35949n2, L6);
            } else {
                d = 0;
            }
        } else {
            d = i5.c.d(52.0f, Math.min(i60Var.f35949n2, L6), 0);
        }
        int i17 = i60Var.f35951p2;
        if (i60Var.f35943h2 == null && i60Var.f35937a2.m() > 0) {
            i11 = org.telegram.messenger.g0.L(56.0f);
        } else {
            i11 = 0;
        }
        i60Var.f35951p2 = i11;
        if (d != i60Var.f35945j2 || i17 != i11) {
            i60Var.f35945j2 = d;
            if (b1Var.getAdapter() != null && b1Var.getAdapter().b() > 0 && (K = b1Var.K(0)) != null) {
                b1Var.getAdapter().g(0);
                i60Var.M1.h1(0, K.f59245a.getTop() - b1Var.getPaddingTop());
                if (b1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new fi.d4(this, 9));
                    ofFloat.setDuration(b1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(i60Var.f35949n2, L6);
        int i18 = i60Var.f35941f2;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            i12 = 0;
            ofInt.addUpdateListener(new e60(this, 0));
            arrayList.add(ofInt);
        } else {
            i12 = 0;
        }
        boolean z10 = this.d;
        if (z10 && L6 > i60Var.f35949n2) {
            org.telegram.messenger.g0.g3(new Runnable(this) {
                public final h60 f35019b;

                {
                    this.f35019b = this;
                }

                @Override
                public final void run() {
                    switch (i12) {
                        case 0:
                            i60 i60Var2 = this.f35019b.f35648e;
                            i60Var2.Q1.smoothScrollTo(0, L6 - i60Var2.f35949n2);
                            return;
                        default:
                            i60 i60Var3 = this.f35019b.f35648e;
                            i60Var3.Q1.smoothScrollTo(0, L6 - i60Var3.f35949n2);
                            return;
                    }
                }
            });
        } else if (!z10 && l1Var3.getMeasuredHeight() + l1Var3.getScrollY() > L6) {
            org.telegram.messenger.g0.g3(new Runnable(this) {
                public final h60 f35019b;

                {
                    this.f35019b = this;
                }

                @Override
                public final void run() {
                    switch (i12) {
                        case 0:
                            i60 i60Var2 = this.f35019b.f35648e;
                            i60Var2.Q1.smoothScrollTo(0, L6 - i60Var2.f35949n2);
                            return;
                        default:
                            i60 i60Var3 = this.f35019b.f35648e;
                            i60Var3.Q1.smoothScrollTo(0, L6 - i60Var3.f35949n2);
                            return;
                    }
                }
            });
        }
        if (!this.f35645a && (animatorSet = i60Var.Y1) != null) {
            animatorSet.playTogether(arrayList);
            i60Var.Y1.addListener(new g60(this, 0));
            i60Var.Y1.start();
            this.f35645a = true;
        }
        if (i60Var.Y1 == null) {
            i60Var.f35941f2 = min;
            i60Var.f30226b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L6, L5));
        b1Var.setTranslationY(0.0f);
    }
}
