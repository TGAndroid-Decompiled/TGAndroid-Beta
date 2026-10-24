package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class u70 extends ViewGroup {
    public boolean f31035a;
    public final ArrayList f31036b;
    public t30 f31037c;
    public boolean d;
    public final v70 e;

    public u70(v70 v70Var, Context context) {
        super(context);
        this.e = v70Var;
        this.f31036b = new ArrayList();
    }

    public final void a(t30 t30Var, boolean z10) {
        this.d = true;
        v70 v70Var = this.e;
        v70Var.f31351f0.k(t30Var, t30Var.getUid());
        AnimatorSet animatorSet = v70Var.f31349d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            v70Var.f31349d0.cancel();
        }
        this.f31035a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            v70Var.f31349d0 = animatorSet2;
            animatorSet2.addListener(new t70(this, 1));
            v70Var.f31349d0.setDuration(150L);
            v70Var.f31349d0.setInterpolator(zr.f33337f);
            ArrayList arrayList = this.f31036b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(t30Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(t30Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(t30Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(t30Var);
    }

    public final void b(t30 t30Var) {
        this.d = false;
        v70 v70Var = this.e;
        v70Var.f31351f0.l(t30Var.getUid());
        t30Var.setOnClickListener(null);
        AnimatorSet animatorSet = v70Var.f31349d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            v70Var.f31349d0.cancel();
        }
        this.f31035a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        v70Var.f31349d0 = animatorSet2;
        animatorSet2.addListener(new ai.ne(28, this, t30Var));
        v70Var.f31349d0.setDuration(150L);
        this.f31037c = t30Var;
        ArrayList arrayList = this.f31036b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f31037c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f31037c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f31037c, View.ALPHA, 1.0f, 0.0f));
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
        int g10;
        int i12;
        s4.b1 K;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.u1 u1Var;
        int i13;
        v70 v70Var = this.e;
        org.telegram.ui.ActionBar.u1 u1Var2 = v70Var.V;
        ai.u1 u1Var3 = v70Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f31036b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof t30)) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f31037c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.v0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.v0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f31035a) {
                    t30 t30Var = this.f31037c;
                    if (childAt == t30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i16);
                        childAt.setTranslationY(dp3);
                    } else if (t30Var != null) {
                        float f7 = dp4;
                        if (childAt.getTranslationX() != f7) {
                            i13 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, f7));
                        } else {
                            i13 = 1;
                        }
                        float f10 = dp2;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr = new float[i13];
                            fArr[0] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                    }
                }
                if (childAt != this.f31037c) {
                    i15 = org.telegram.messenger.v0.C(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.v0.C(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            u1Var2 = u1Var;
        }
        org.telegram.ui.ActionBar.u1 u1Var4 = u1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        if (v70Var.m0 != null) {
            if (v70Var.f31352g0) {
                g10 = Math.min(v70Var.f31363s0, dp6);
            } else {
                g10 = 0;
            }
        } else {
            g10 = i2.o1.g(52.0f, Math.min(v70Var.f31363s0, dp6), 0);
        }
        int i17 = v70Var.f31365u0;
        if (v70Var.m0 == null && v70Var.f31351f0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        v70Var.f31365u0 = i12;
        if (g10 != v70Var.f31359o0 || i17 != i12) {
            v70Var.f31359o0 = g10;
            if (u1Var3.getAdapter() != null && u1Var3.getAdapter().h() > 0 && (K = u1Var3.K(0)) != null) {
                u1Var3.getAdapter().m(0);
                v70Var.R.h1(0, K.f46342a.getTop() - u1Var3.getPaddingTop());
                if (u1Var3.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ci.u4(this, 8));
                    ofFloat.setDuration(u1Var3.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(v70Var.f31363s0, dp6);
        int i18 = v70Var.f31356k0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new j6(this, 29));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > v70Var.f31363s0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final u70 f30460b;

                {
                    this.f30460b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            v70 v70Var2 = this.f30460b.e;
                            v70Var2.V.smoothScrollTo(0, dp6 - v70Var2.f31363s0);
                            return;
                        default:
                            v70 v70Var3 = this.f30460b.e;
                            v70Var3.V.smoothScrollTo(0, dp6 - v70Var3.f31363s0);
                            return;
                    }
                }
            });
        } else if (!z10 && u1Var4.getMeasuredHeight() + u1Var4.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final u70 f30460b;

                {
                    this.f30460b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            v70 v70Var2 = this.f30460b.e;
                            v70Var2.V.smoothScrollTo(0, dp6 - v70Var2.f31363s0);
                            return;
                        default:
                            v70 v70Var3 = this.f30460b.e;
                            v70Var3.V.smoothScrollTo(0, dp6 - v70Var3.f31363s0);
                            return;
                    }
                }
            });
        }
        if (!this.f31035a && (animatorSet = v70Var.f31349d0) != null) {
            animatorSet.playTogether(arrayList);
            v70Var.f31349d0.addListener(new t70(this, 0));
            v70Var.f31349d0.start();
            this.f31035a = true;
        }
        if (v70Var.f31349d0 == null) {
            v70Var.f31356k0 = min;
            v70.T(v70Var).invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        u1Var3.setTranslationY(0.0f);
    }
}
