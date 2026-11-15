package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class z50 extends ViewGroup {
    public boolean f42251a;
    public final ArrayList f42252b;
    public f20 f42253c;
    public boolean d;
    public final a60 f42254e;

    public z50(a60 a60Var, Context context) {
        super(context);
        this.f42254e = a60Var;
        this.f42252b = new ArrayList();
    }

    public final void a(f20 f20Var, boolean z10) {
        this.d = true;
        a60 a60Var = this.f42254e;
        a60Var.f32867a2.k(f20Var, f20Var.getUid());
        AnimatorSet animatorSet = a60Var.Y1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            a60Var.Y1.cancel();
        }
        this.f42251a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            a60Var.Y1 = animatorSet2;
            animatorSet2.addListener(new x50(this, 1));
            a60Var.Y1.setDuration(150L);
            a60Var.Y1.setInterpolator(er.f34419f);
            ArrayList arrayList = this.f42252b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(f20Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(f20Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(f20Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(f20Var);
    }

    public final void b(f20 f20Var) {
        this.d = false;
        a60 a60Var = this.f42254e;
        a60Var.f32867a2.l(f20Var.getUid());
        f20Var.setOnClickListener(null);
        AnimatorSet animatorSet = a60Var.Y1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            a60Var.Y1.cancel();
        }
        this.f42251a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        a60Var.Y1 = animatorSet2;
        animatorSet2.addListener(new y50(0, this, f20Var));
        a60Var.Y1.setDuration(150L);
        this.f42253c = f20Var;
        ArrayList arrayList = this.f42252b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f42253c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f42253c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f42253c, View.ALPHA, 1.0f, 0.0f));
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
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.l1 l1Var;
        int i12;
        a60 a60Var = this.f42254e;
        org.telegram.ui.ActionBar.l1 l1Var2 = a60Var.Q1;
        di.c1 c1Var = a60Var.f34191o1;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(26.0f);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            arrayList = this.f42252b;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (!(childAt instanceof f20)) {
                l1Var = l1Var2;
            } else {
                l1Var = l1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                if (childAt != this.f42253c && childAt.getMeasuredWidth() + i14 > L) {
                    L2 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > L) {
                    L3 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i15 = 0;
                }
                int L4 = org.telegram.messenger.g0.L(13.0f) + i14;
                if (!this.f42251a) {
                    f20 f20Var = this.f42253c;
                    if (childAt == f20Var) {
                        childAt.setTranslationX(org.telegram.messenger.g0.L(13.0f) + i15);
                        childAt.setTranslationY(L3);
                    } else if (f20Var != null) {
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
                if (childAt != this.f42253c) {
                    i14 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i13++;
            l1Var2 = l1Var;
        }
        org.telegram.ui.ActionBar.l1 l1Var3 = l1Var2;
        int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
        final int L6 = org.telegram.messenger.g0.L(42.0f) + L2;
        if (a60Var.f32873h2 != null) {
            if (a60Var.f32868b2) {
                d = Math.min(a60Var.f32879n2, L6);
            } else {
                d = 0;
            }
        } else {
            d = i5.c.d(52.0f, Math.min(a60Var.f32879n2, L6), 0);
        }
        int i16 = a60Var.f32881p2;
        if (a60Var.f32873h2 == null && a60Var.f32867a2.m() > 0) {
            i11 = org.telegram.messenger.g0.L(56.0f);
        } else {
            i11 = 0;
        }
        a60Var.f32881p2 = i11;
        if (d != a60Var.f32875j2 || i16 != i11) {
            a60Var.f32875j2 = d;
            if (c1Var.getAdapter() != null && c1Var.getAdapter().b() > 0 && (K = c1Var.K(0)) != null) {
                c1Var.getAdapter().g(0);
                a60Var.M1.h1(0, K.f58535a.getTop() - c1Var.getPaddingTop());
                if (c1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new fi.f4(this, 9));
                    ofFloat.setDuration(c1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(a60Var.f32879n2, L6);
        int i17 = a60Var.f32871f2;
        if (i17 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i17, min);
            ofInt.addUpdateListener(new c6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && L6 > a60Var.f32879n2) {
            org.telegram.messenger.g0.h3(new Runnable(this) {
                public final z50 f41268b;

                {
                    this.f41268b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            a60 a60Var2 = this.f41268b.f42254e;
                            a60Var2.Q1.smoothScrollTo(0, L6 - a60Var2.f32879n2);
                            return;
                        default:
                            a60 a60Var3 = this.f41268b.f42254e;
                            a60Var3.Q1.smoothScrollTo(0, L6 - a60Var3.f32879n2);
                            return;
                    }
                }
            });
        } else if (!z10 && l1Var3.getMeasuredHeight() + l1Var3.getScrollY() > L6) {
            org.telegram.messenger.g0.h3(new Runnable(this) {
                public final z50 f41268b;

                {
                    this.f41268b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            a60 a60Var2 = this.f41268b.f42254e;
                            a60Var2.Q1.smoothScrollTo(0, L6 - a60Var2.f32879n2);
                            return;
                        default:
                            a60 a60Var3 = this.f41268b.f42254e;
                            a60Var3.Q1.smoothScrollTo(0, L6 - a60Var3.f32879n2);
                            return;
                    }
                }
            });
        }
        if (!this.f42251a && (animatorSet = a60Var.Y1) != null) {
            animatorSet.playTogether(arrayList);
            a60Var.Y1.addListener(new x50(this, 0));
            a60Var.Y1.start();
            this.f42251a = true;
        }
        if (a60Var.Y1 == null) {
            a60Var.f32871f2 = min;
            a60Var.f29682b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L6, L5));
        c1Var.setTranslationY(0.0f);
    }
}
