package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class l60 extends ViewGroup {
    public boolean f28020a;
    public final ArrayList f28021b;
    public s20 f28022c;
    public boolean d;
    public final m60 e;

    public l60(m60 m60Var, Context context) {
        super(context);
        this.e = m60Var;
        this.f28021b = new ArrayList();
    }

    public final void a(s20 s20Var, boolean z10) {
        this.d = true;
        m60 m60Var = this.e;
        m60Var.W1.k(s20Var, s20Var.getUid());
        AnimatorSet animatorSet = m60Var.U1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            m60Var.U1.cancel();
        }
        this.f28020a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            m60Var.U1 = animatorSet2;
            animatorSet2.addListener(new k60(this, 1));
            m60Var.U1.setDuration(150L);
            m60Var.U1.setInterpolator(gr.f26495f);
            ArrayList arrayList = this.f28021b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(s20Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(s20Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(s20Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(s20Var);
    }

    public final void b(s20 s20Var) {
        this.d = false;
        m60 m60Var = this.e;
        m60Var.W1.l(s20Var.getUid());
        s20Var.setOnClickListener(null);
        AnimatorSet animatorSet = m60Var.U1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            m60Var.U1.cancel();
        }
        this.f28020a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        m60Var.U1 = animatorSet2;
        animatorSet2.addListener(new bg.f(25, this, s20Var));
        m60Var.U1.setDuration(150L);
        this.f28022c = s20Var;
        ArrayList arrayList = this.f28021b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f28022c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f28022c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f28022c, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        int d;
        int i12;
        s4.c1 K;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.p1 p1Var;
        int i13;
        m60 m60Var = this.e;
        org.telegram.ui.ActionBar.p1 p1Var2 = m60Var.M1;
        ag.b1 b1Var = m60Var.f25719k1;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int L = size - org.telegram.messenger.i0.L(26.0f);
        int L2 = org.telegram.messenger.i0.L(10.0f);
        int L3 = org.telegram.messenger.i0.L(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f28021b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof s20)) {
                p1Var = p1Var2;
            } else {
                p1Var = p1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), 1073741824));
                if (childAt != this.f28022c && childAt.getMeasuredWidth() + i15 > L) {
                    L2 = org.telegram.messenger.m5.C(8.0f, childAt.getMeasuredHeight(), L2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > L) {
                    L3 = org.telegram.messenger.m5.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i16 = 0;
                }
                int L4 = org.telegram.messenger.i0.L(13.0f) + i15;
                if (!this.f28020a) {
                    s20 s20Var = this.f28022c;
                    if (childAt == s20Var) {
                        childAt.setTranslationX(org.telegram.messenger.i0.L(13.0f) + i16);
                        childAt.setTranslationY(L3);
                    } else if (s20Var != null) {
                        float f7 = L4;
                        if (childAt.getTranslationX() != f7) {
                            i13 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, f7));
                        } else {
                            i13 = 1;
                        }
                        float f10 = L2;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr = new float[i13];
                            fArr[0] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                    }
                }
                if (childAt != this.f28022c) {
                    i15 = org.telegram.messenger.m5.C(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.m5.C(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            p1Var2 = p1Var;
        }
        org.telegram.ui.ActionBar.p1 p1Var3 = p1Var2;
        int L5 = org.telegram.messenger.i0.L(42.0f) + L3;
        final int L6 = org.telegram.messenger.i0.L(42.0f) + L2;
        if (m60Var.f28299d2 != null) {
            if (m60Var.X1) {
                d = Math.min(m60Var.f28305j2, L6);
            } else {
                d = 0;
            }
        } else {
            d = i0.a.d(52.0f, Math.min(m60Var.f28305j2, L6), 0);
        }
        int i17 = m60Var.f28307l2;
        if (m60Var.f28299d2 == null && m60Var.W1.m() > 0) {
            i12 = org.telegram.messenger.i0.L(56.0f);
        } else {
            i12 = 0;
        }
        m60Var.f28307l2 = i12;
        if (d != m60Var.f28301f2 || i17 != i12) {
            m60Var.f28301f2 = d;
            if (b1Var.getAdapter() != null && b1Var.getAdapter().b() > 0 && (K = b1Var.K(0)) != null) {
                b1Var.getAdapter().g(0);
                m60Var.I1.h1(0, K.f47898a.getTop() - b1Var.getPaddingTop());
                if (b1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new bg.o(this, 7));
                    ofFloat.setDuration(b1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(m60Var.f28305j2, L6);
        int i18 = m60Var.f28297b2;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new a6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && L6 > m60Var.f28305j2) {
            org.telegram.messenger.i0.g3(new Runnable(this) {
                public final l60 f27238b;

                {
                    this.f27238b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            m60 m60Var2 = this.f27238b.e;
                            m60Var2.M1.smoothScrollTo(0, L6 - m60Var2.f28305j2);
                            return;
                        default:
                            m60 m60Var3 = this.f27238b.e;
                            m60Var3.M1.smoothScrollTo(0, L6 - m60Var3.f28305j2);
                            return;
                    }
                }
            });
        } else if (!z10 && p1Var3.getMeasuredHeight() + p1Var3.getScrollY() > L6) {
            org.telegram.messenger.i0.g3(new Runnable(this) {
                public final l60 f27238b;

                {
                    this.f27238b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            m60 m60Var2 = this.f27238b.e;
                            m60Var2.M1.smoothScrollTo(0, L6 - m60Var2.f28305j2);
                            return;
                        default:
                            m60 m60Var3 = this.f27238b.e;
                            m60Var3.M1.smoothScrollTo(0, L6 - m60Var3.f28305j2);
                            return;
                    }
                }
            });
        }
        if (!this.f28020a && (animatorSet = m60Var.U1) != null) {
            animatorSet.playTogether(arrayList);
            m60Var.U1.addListener(new k60(this, 0));
            m60Var.U1.start();
            this.f28020a = true;
        }
        if (m60Var.U1 == null) {
            m60Var.f28297b2 = min;
            m60Var.f21586b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L6, L5));
        b1Var.setTranslationY(0.0f);
    }
}
