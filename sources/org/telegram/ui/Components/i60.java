package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class i60 extends ViewGroup {
    public boolean f36063a;
    public final ArrayList f36064b;
    public m20 f36065c;
    public boolean d;
    public final j60 f36066e;

    public i60(j60 j60Var, Context context) {
        super(context);
        this.f36066e = j60Var;
        this.f36064b = new ArrayList();
    }

    public final void a(m20 m20Var, boolean z10) {
        this.d = true;
        j60 j60Var = this.f36066e;
        j60Var.f36352a2.k(m20Var, m20Var.getUid());
        AnimatorSet animatorSet = j60Var.Y1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            j60Var.Y1.cancel();
        }
        this.f36063a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            j60Var.Y1 = animatorSet2;
            animatorSet2.addListener(new g60(this, 1));
            j60Var.Y1.setDuration(150L);
            j60Var.Y1.setInterpolator(lr.f37208f);
            ArrayList arrayList = this.f36064b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(m20Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(m20Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(m20Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(m20Var);
    }

    public final void b(m20 m20Var) {
        this.d = false;
        j60 j60Var = this.f36066e;
        j60Var.f36352a2.l(m20Var.getUid());
        m20Var.setOnClickListener(null);
        AnimatorSet animatorSet = j60Var.Y1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            j60Var.Y1.cancel();
        }
        this.f36063a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        j60Var.Y1 = animatorSet2;
        animatorSet2.addListener(new h60(0, this, m20Var));
        j60Var.Y1.setDuration(150L);
        this.f36065c = m20Var;
        ArrayList arrayList = this.f36064b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f36065c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f36065c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f36065c, View.ALPHA, 1.0f, 0.0f));
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
        org.telegram.ui.ActionBar.m1 m1Var;
        int i13;
        j60 j60Var = this.f36066e;
        org.telegram.ui.ActionBar.m1 m1Var2 = j60Var.Q1;
        di.b1 b1Var = j60Var.f37984o1;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(26.0f);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f36064b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof m20)) {
                m1Var = m1Var2;
            } else {
                m1Var = m1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                if (childAt != this.f36065c && childAt.getMeasuredWidth() + i15 > L) {
                    L2 = org.telegram.messenger.f3.C(8.0f, childAt.getMeasuredHeight(), L2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > L) {
                    L3 = org.telegram.messenger.f3.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i16 = 0;
                }
                int L4 = org.telegram.messenger.g0.L(13.0f) + i15;
                if (!this.f36063a) {
                    m20 m20Var = this.f36065c;
                    if (childAt == m20Var) {
                        childAt.setTranslationX(org.telegram.messenger.g0.L(13.0f) + i16);
                        childAt.setTranslationY(L3);
                    } else if (m20Var != null) {
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
                if (childAt != this.f36065c) {
                    i15 = org.telegram.messenger.f3.C(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.f3.C(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            m1Var2 = m1Var;
        }
        org.telegram.ui.ActionBar.m1 m1Var3 = m1Var2;
        int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
        final int L6 = org.telegram.messenger.g0.L(42.0f) + L2;
        if (j60Var.f36358h2 != null) {
            if (j60Var.f36353b2) {
                d = Math.min(j60Var.f36364n2, L6);
            } else {
                d = 0;
            }
        } else {
            d = i5.c.d(52.0f, Math.min(j60Var.f36364n2, L6), 0);
        }
        int i17 = j60Var.f36366p2;
        if (j60Var.f36358h2 == null && j60Var.f36352a2.m() > 0) {
            i11 = org.telegram.messenger.g0.L(56.0f);
        } else {
            i11 = 0;
        }
        j60Var.f36366p2 = i11;
        if (d != j60Var.f36360j2 || i17 != i11) {
            j60Var.f36360j2 = d;
            if (b1Var.getAdapter() != null && b1Var.getAdapter().b() > 0 && (K = b1Var.K(0)) != null) {
                b1Var.getAdapter().g(0);
                j60Var.M1.h1(0, K.f59122a.getTop() - b1Var.getPaddingTop());
                if (b1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new fi.d4(this, 9));
                    ofFloat.setDuration(b1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(j60Var.f36364n2, L6);
        int i18 = j60Var.f36356f2;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            i12 = 0;
            ofInt.addUpdateListener(new e60(this, 0));
            arrayList.add(ofInt);
        } else {
            i12 = 0;
        }
        boolean z10 = this.d;
        if (z10 && L6 > j60Var.f36364n2) {
            org.telegram.messenger.g0.g3(new Runnable(this) {
                public final i60 f34957b;

                {
                    this.f34957b = this;
                }

                @Override
                public final void run() {
                    switch (i12) {
                        case 0:
                            j60 j60Var2 = this.f34957b.f36066e;
                            j60Var2.Q1.smoothScrollTo(0, L6 - j60Var2.f36364n2);
                            return;
                        default:
                            j60 j60Var3 = this.f34957b.f36066e;
                            j60Var3.Q1.smoothScrollTo(0, L6 - j60Var3.f36364n2);
                            return;
                    }
                }
            });
        } else if (!z10 && m1Var3.getMeasuredHeight() + m1Var3.getScrollY() > L6) {
            org.telegram.messenger.g0.g3(new Runnable(this) {
                public final i60 f34957b;

                {
                    this.f34957b = this;
                }

                @Override
                public final void run() {
                    switch (i12) {
                        case 0:
                            j60 j60Var2 = this.f34957b.f36066e;
                            j60Var2.Q1.smoothScrollTo(0, L6 - j60Var2.f36364n2);
                            return;
                        default:
                            j60 j60Var3 = this.f34957b.f36066e;
                            j60Var3.Q1.smoothScrollTo(0, L6 - j60Var3.f36364n2);
                            return;
                    }
                }
            });
        }
        if (!this.f36063a && (animatorSet = j60Var.Y1) != null) {
            animatorSet.playTogether(arrayList);
            j60Var.Y1.addListener(new g60(this, 0));
            j60Var.Y1.start();
            this.f36063a = true;
        }
        if (j60Var.Y1 == null) {
            j60Var.f36356f2 = min;
            j60Var.f30192b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L6, L5));
        b1Var.setTranslationY(0.0f);
    }
}
