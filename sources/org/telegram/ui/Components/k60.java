package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class k60 extends ViewGroup {
    public boolean f36781a;
    public final ArrayList f36782b;
    public p20 f36783c;
    public boolean d;
    public final l60 f36784e;

    public k60(l60 l60Var, Context context) {
        super(context);
        this.f36784e = l60Var;
        this.f36782b = new ArrayList();
    }

    public final void a(p20 p20Var, boolean z10) {
        this.d = true;
        l60 l60Var = this.f36784e;
        l60Var.f37076a2.k(p20Var, p20Var.getUid());
        AnimatorSet animatorSet = l60Var.Y1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            l60Var.Y1.cancel();
        }
        this.f36781a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            l60Var.Y1 = animatorSet2;
            animatorSet2.addListener(new j60(this, 1));
            l60Var.Y1.setDuration(150L);
            l60Var.Y1.setInterpolator(nr.f37917f);
            ArrayList arrayList = this.f36782b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(p20Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(p20Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(p20Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(p20Var);
    }

    public final void b(p20 p20Var) {
        this.d = false;
        l60 l60Var = this.f36784e;
        l60Var.f37076a2.l(p20Var.getUid());
        p20Var.setOnClickListener(null);
        AnimatorSet animatorSet = l60Var.Y1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            l60Var.Y1.cancel();
        }
        this.f36781a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        l60Var.Y1 = animatorSet2;
        animatorSet2.addListener(new h10(1, this, p20Var));
        l60Var.Y1.setDuration(150L);
        this.f36783c = p20Var;
        ArrayList arrayList = this.f36782b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f36783c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f36783c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f36783c, View.ALPHA, 1.0f, 0.0f));
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
        v4.e1 K;
        final int i12;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.l1 l1Var;
        int i13;
        l60 l60Var = this.f36784e;
        org.telegram.ui.ActionBar.l1 l1Var2 = l60Var.Q1;
        di.b1 b1Var = l60Var.f39036o1;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(26.0f);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f36782b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof p20)) {
                l1Var = l1Var2;
            } else {
                l1Var = l1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                if (childAt != this.f36783c && childAt.getMeasuredWidth() + i15 > L) {
                    L2 = org.telegram.messenger.f3.C(8.0f, childAt.getMeasuredHeight(), L2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > L) {
                    L3 = org.telegram.messenger.f3.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i16 = 0;
                }
                int L4 = org.telegram.messenger.g0.L(13.0f) + i15;
                if (!this.f36781a) {
                    p20 p20Var = this.f36783c;
                    if (childAt == p20Var) {
                        childAt.setTranslationX(org.telegram.messenger.g0.L(13.0f) + i16);
                        childAt.setTranslationY(L3);
                    } else if (p20Var != null) {
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
                if (childAt != this.f36783c) {
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
        if (l60Var.f37082h2 != null) {
            if (l60Var.f37077b2) {
                d = Math.min(l60Var.f37088n2, L6);
            } else {
                d = 0;
            }
        } else {
            d = i5.c.d(52.0f, Math.min(l60Var.f37088n2, L6), 0);
        }
        int i17 = l60Var.f37090p2;
        if (l60Var.f37082h2 == null && l60Var.f37076a2.m() > 0) {
            i11 = org.telegram.messenger.g0.L(56.0f);
        } else {
            i11 = 0;
        }
        l60Var.f37090p2 = i11;
        if (d != l60Var.f37084j2 || i17 != i11) {
            l60Var.f37084j2 = d;
            if (b1Var.getAdapter() != null && b1Var.getAdapter().b() > 0 && (K = b1Var.K(0)) != null) {
                b1Var.getAdapter().g(0);
                l60Var.M1.h1(0, K.f59111a.getTop() - b1Var.getPaddingTop());
                if (b1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new fi.d4(this, 9));
                    ofFloat.setDuration(b1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(l60Var.f37088n2, L6);
        int i18 = l60Var.f37080f2;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            i12 = 0;
            ofInt.addUpdateListener(new h60(this, 0));
            arrayList.add(ofInt);
        } else {
            i12 = 0;
        }
        boolean z10 = this.d;
        if (z10 && L6 > l60Var.f37088n2) {
            org.telegram.messenger.g0.g3(new Runnable(this) {
                public final k60 f36105b;

                {
                    this.f36105b = this;
                }

                @Override
                public final void run() {
                    switch (i12) {
                        case 0:
                            l60 l60Var2 = this.f36105b.f36784e;
                            l60Var2.Q1.smoothScrollTo(0, L6 - l60Var2.f37088n2);
                            return;
                        default:
                            l60 l60Var3 = this.f36105b.f36784e;
                            l60Var3.Q1.smoothScrollTo(0, L6 - l60Var3.f37088n2);
                            return;
                    }
                }
            });
        } else if (!z10 && l1Var3.getMeasuredHeight() + l1Var3.getScrollY() > L6) {
            org.telegram.messenger.g0.g3(new Runnable(this) {
                public final k60 f36105b;

                {
                    this.f36105b = this;
                }

                @Override
                public final void run() {
                    switch (i12) {
                        case 0:
                            l60 l60Var2 = this.f36105b.f36784e;
                            l60Var2.Q1.smoothScrollTo(0, L6 - l60Var2.f37088n2);
                            return;
                        default:
                            l60 l60Var3 = this.f36105b.f36784e;
                            l60Var3.Q1.smoothScrollTo(0, L6 - l60Var3.f37088n2);
                            return;
                    }
                }
            });
        }
        if (!this.f36781a && (animatorSet = l60Var.Y1) != null) {
            animatorSet.playTogether(arrayList);
            l60Var.Y1.addListener(new j60(this, 0));
            l60Var.Y1.start();
            this.f36781a = true;
        }
        if (l60Var.Y1 == null) {
            l60Var.f37080f2 = min;
            l60Var.f30142b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L6, L5));
        b1Var.setTranslationY(0.0f);
    }
}
