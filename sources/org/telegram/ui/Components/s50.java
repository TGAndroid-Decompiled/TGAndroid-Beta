package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class s50 extends ViewGroup {
    public boolean f37909a;
    public final ArrayList f37910b;
    public y10 f37911c;
    public boolean d;
    public final t50 f37912e;

    public s50(t50 t50Var, Context context) {
        super(context);
        this.f37912e = t50Var;
        this.f37910b = new ArrayList();
    }

    public final void a(y10 y10Var, boolean z10) {
        this.d = true;
        t50 t50Var = this.f37912e;
        t50Var.X1.k(y10Var, y10Var.getUid());
        AnimatorSet animatorSet = t50Var.V1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            t50Var.V1.cancel();
        }
        this.f37909a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            t50Var.V1 = animatorSet2;
            animatorSet2.addListener(new r50(this, 1));
            t50Var.V1.setDuration(150L);
            t50Var.V1.setInterpolator(xq.f40452f);
            ArrayList arrayList = this.f37910b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(y10Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(y10Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(y10Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(y10Var);
    }

    public final void b(y10 y10Var) {
        this.d = false;
        t50 t50Var = this.f37912e;
        t50Var.X1.l(y10Var.getUid());
        y10Var.setOnClickListener(null);
        AnimatorSet animatorSet = t50Var.V1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            t50Var.V1.cancel();
        }
        this.f37909a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        t50Var.V1 = animatorSet2;
        animatorSet2.addListener(new bh.j(29, this, y10Var));
        t50Var.V1.setDuration(150L);
        this.f37911c = y10Var;
        ArrayList arrayList = this.f37910b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f37911c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f37911c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f37911c, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        ArrayList arrayList;
        int d;
        int i11;
        u4.d1 K;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.k1 k1Var;
        int i12;
        t50 t50Var = this.f37912e;
        org.telegram.ui.ActionBar.k1 k1Var2 = t50Var.N1;
        ci.j1 j1Var = t50Var.f38994l1;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i3);
        int L = size - org.telegram.messenger.g0.L(26.0f);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            arrayList = this.f37910b;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (!(childAt instanceof y10)) {
                k1Var = k1Var2;
            } else {
                k1Var = k1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                if (childAt != this.f37911c && childAt.getMeasuredWidth() + i14 > L) {
                    L2 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > L) {
                    L3 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i15 = 0;
                }
                int L4 = org.telegram.messenger.g0.L(13.0f) + i14;
                if (!this.f37909a) {
                    y10 y10Var = this.f37911c;
                    if (childAt == y10Var) {
                        childAt.setTranslationX(org.telegram.messenger.g0.L(13.0f) + i15);
                        childAt.setTranslationY(L3);
                    } else if (y10Var != null) {
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
                if (childAt != this.f37911c) {
                    i14 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i13++;
            k1Var2 = k1Var;
        }
        org.telegram.ui.ActionBar.k1 k1Var3 = k1Var2;
        int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
        final int L6 = org.telegram.messenger.g0.L(42.0f) + L2;
        if (t50Var.f38291e2 != null) {
            if (t50Var.Y1) {
                d = Math.min(t50Var.f38297k2, L6);
            } else {
                d = 0;
            }
        } else {
            d = k2.p1.d(52.0f, Math.min(t50Var.f38297k2, L6), 0);
        }
        int i16 = t50Var.f38299m2;
        if (t50Var.f38291e2 == null && t50Var.X1.m() > 0) {
            i11 = org.telegram.messenger.g0.L(56.0f);
        } else {
            i11 = 0;
        }
        t50Var.f38299m2 = i11;
        if (d != t50Var.f38293g2 || i16 != i11) {
            t50Var.f38293g2 = d;
            if (j1Var.getAdapter() != null && j1Var.getAdapter().b() > 0 && (K = j1Var.K(0)) != null) {
                j1Var.getAdapter().g(0);
                t50Var.J1.h1(0, K.f55540a.getTop() - j1Var.getPaddingTop());
                if (j1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ei.n4(this, 9));
                    ofFloat.setDuration(j1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(t50Var.f38297k2, L6);
        int i17 = t50Var.c2;
        if (i17 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i17, min);
            ofInt.addUpdateListener(new c6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && L6 > t50Var.f38297k2) {
            org.telegram.messenger.g0.h3(new Runnable(this) {
                public final s50 f37351b;

                {
                    this.f37351b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            t50 t50Var2 = this.f37351b.f37912e;
                            t50Var2.N1.smoothScrollTo(0, L6 - t50Var2.f38297k2);
                            return;
                        default:
                            t50 t50Var3 = this.f37351b.f37912e;
                            t50Var3.N1.smoothScrollTo(0, L6 - t50Var3.f38297k2);
                            return;
                    }
                }
            });
        } else if (!z10 && k1Var3.getMeasuredHeight() + k1Var3.getScrollY() > L6) {
            org.telegram.messenger.g0.h3(new Runnable(this) {
                public final s50 f37351b;

                {
                    this.f37351b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            t50 t50Var2 = this.f37351b.f37912e;
                            t50Var2.N1.smoothScrollTo(0, L6 - t50Var2.f38297k2);
                            return;
                        default:
                            t50 t50Var3 = this.f37351b.f37912e;
                            t50Var3.N1.smoothScrollTo(0, L6 - t50Var3.f38297k2);
                            return;
                    }
                }
            });
        }
        if (!this.f37909a && (animatorSet = t50Var.V1) != null) {
            animatorSet.playTogether(arrayList);
            t50Var.V1.addListener(new r50(this, 0));
            t50Var.V1.start();
            this.f37909a = true;
        }
        if (t50Var.V1 == null) {
            t50Var.c2 = min;
            t50Var.f28586b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L6, L5));
        j1Var.setTranslationY(0.0f);
    }
}
