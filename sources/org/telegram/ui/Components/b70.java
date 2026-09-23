package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class b70 extends ViewGroup {
    public boolean f22591a;
    public final ArrayList f22592b;
    public n30 f22593c;
    public boolean d;
    public final c70 e;

    public b70(c70 c70Var, Context context) {
        super(context);
        this.e = c70Var;
        this.f22592b = new ArrayList();
    }

    public final void a(n30 n30Var, boolean z10) {
        this.d = true;
        c70 c70Var = this.e;
        c70Var.f22956f0.k(n30Var, n30Var.getUid());
        AnimatorSet animatorSet = c70Var.f22954d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            c70Var.f22954d0.cancel();
        }
        this.f22591a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            c70Var.f22954d0 = animatorSet2;
            animatorSet2.addListener(new a70(this, 1));
            c70Var.f22954d0.setDuration(150L);
            c70Var.f22954d0.setInterpolator(rr.f27701f);
            ArrayList arrayList = this.f22592b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(n30Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(n30Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(n30Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(n30Var);
    }

    public final void b(n30 n30Var) {
        this.d = false;
        c70 c70Var = this.e;
        c70Var.f22956f0.l(n30Var.getUid());
        n30Var.setOnClickListener(null);
        AnimatorSet animatorSet = c70Var.f22954d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            c70Var.f22954d0.cancel();
        }
        this.f22591a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        c70Var.f22954d0 = animatorSet2;
        animatorSet2.addListener(new ai.z(27, this, n30Var));
        c70Var.f22954d0.setDuration(150L);
        this.f22593c = n30Var;
        ArrayList arrayList = this.f22592b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f22593c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f22593c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f22593c, View.ALPHA, 1.0f, 0.0f));
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
        int f7;
        int i12;
        s4.c1 K;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.v1 v1Var;
        int i13;
        c70 c70Var = this.e;
        org.telegram.ui.ActionBar.v1 v1Var2 = c70Var.V;
        ai.w0 w0Var = c70Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f22592b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof n30)) {
                v1Var = v1Var2;
            } else {
                v1Var = v1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f22593c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.z0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.z0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f22591a) {
                    n30 n30Var = this.f22593c;
                    if (childAt == n30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i16);
                        childAt.setTranslationY(dp3);
                    } else if (n30Var != null) {
                        float f10 = dp4;
                        if (childAt.getTranslationX() != f10) {
                            i13 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, f10));
                        } else {
                            i13 = 1;
                        }
                        float f11 = dp2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr = new float[i13];
                            fArr[0] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                    }
                }
                if (childAt != this.f22593c) {
                    i15 = org.telegram.messenger.z0.C(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.z0.C(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            v1Var2 = v1Var;
        }
        org.telegram.ui.ActionBar.v1 v1Var3 = v1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        if (c70Var.m0 != null) {
            if (c70Var.f22957g0) {
                f7 = Math.min(c70Var.f22968s0, dp6);
            } else {
                f7 = 0;
            }
        } else {
            f7 = hg.c.f(52.0f, Math.min(c70Var.f22968s0, dp6), 0);
        }
        int i17 = c70Var.f22970u0;
        if (c70Var.m0 == null && c70Var.f22956f0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        c70Var.f22970u0 = i12;
        if (f7 != c70Var.f22964o0 || i17 != i12) {
            c70Var.f22964o0 = f7;
            if (w0Var.getAdapter() != null && w0Var.getAdapter().h() > 0 && (K = w0Var.K(0)) != null) {
                w0Var.getAdapter().m(0);
                c70Var.R.h1(0, K.f42627a.getTop() - w0Var.getPaddingTop());
                if (w0Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ai.k6(this, 8));
                    ofFloat.setDuration(w0Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(c70Var.f22968s0, dp6);
        int i18 = c70Var.f22961k0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new k6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > c70Var.f22968s0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final b70 f30536b;

                {
                    this.f30536b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            c70 c70Var2 = this.f30536b.e;
                            c70Var2.V.smoothScrollTo(0, dp6 - c70Var2.f22968s0);
                            return;
                        default:
                            c70 c70Var3 = this.f30536b.e;
                            c70Var3.V.smoothScrollTo(0, dp6 - c70Var3.f22968s0);
                            return;
                    }
                }
            });
        } else if (!z10 && v1Var3.getMeasuredHeight() + v1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final b70 f30536b;

                {
                    this.f30536b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            c70 c70Var2 = this.f30536b.e;
                            c70Var2.V.smoothScrollTo(0, dp6 - c70Var2.f22968s0);
                            return;
                        default:
                            c70 c70Var3 = this.f30536b.e;
                            c70Var3.V.smoothScrollTo(0, dp6 - c70Var3.f22968s0);
                            return;
                    }
                }
            });
        }
        if (!this.f22591a && (animatorSet = c70Var.f22954d0) != null) {
            animatorSet.playTogether(arrayList);
            c70Var.f22954d0.addListener(new a70(this, 0));
            c70Var.f22954d0.start();
            this.f22591a = true;
        }
        if (c70Var.f22954d0 == null) {
            c70Var.f22961k0 = min;
            viewGroup = ((org.telegram.ui.ActionBar.f3) c70Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        w0Var.setTranslationY(0.0f);
    }
}
