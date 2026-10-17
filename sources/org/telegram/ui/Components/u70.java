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
    public boolean f30902a;
    public final ArrayList f30903b;
    public v30 f30904c;
    public boolean d;
    public final v70 e;

    public u70(v70 v70Var, Context context) {
        super(context);
        this.e = v70Var;
        this.f30903b = new ArrayList();
    }

    public final void a(v30 v30Var, boolean z10) {
        this.d = true;
        v70 v70Var = this.e;
        v70Var.f31198f0.k(v30Var, v30Var.getUid());
        AnimatorSet animatorSet = v70Var.f31196d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            v70Var.f31196d0.cancel();
        }
        this.f30902a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            v70Var.f31196d0 = animatorSet2;
            animatorSet2.addListener(new t70(this, 1));
            v70Var.f31196d0.setDuration(150L);
            v70Var.f31196d0.setInterpolator(bs.f25030f);
            ArrayList arrayList = this.f30903b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(v30Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(v30Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(v30Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(v30Var);
    }

    public final void b(v30 v30Var) {
        this.d = false;
        v70 v70Var = this.e;
        v70Var.f31198f0.l(v30Var.getUid());
        v30Var.setOnClickListener(null);
        AnimatorSet animatorSet = v70Var.f31196d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            v70Var.f31196d0.cancel();
        }
        this.f30902a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        v70Var.f31196d0 = animatorSet2;
        animatorSet2.addListener(new ai.le(28, this, v30Var));
        v70Var.f31196d0.setDuration(150L);
        this.f30904c = v30Var;
        ArrayList arrayList = this.f30903b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f30904c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f30904c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f30904c, View.ALPHA, 1.0f, 0.0f));
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
        int b10;
        int i12;
        s4.b1 K;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.v1 v1Var;
        int i13;
        v70 v70Var = this.e;
        org.telegram.ui.ActionBar.v1 v1Var2 = v70Var.V;
        ai.u1 u1Var = v70Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f30903b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof v30)) {
                v1Var = v1Var2;
            } else {
                v1Var = v1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f30904c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.q.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.q.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f30902a) {
                    v30 v30Var = this.f30904c;
                    if (childAt == v30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i16);
                        childAt.setTranslationY(dp3);
                    } else if (v30Var != null) {
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
                if (childAt != this.f30904c) {
                    i15 = org.telegram.messenger.q.C(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.q.C(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            v1Var2 = v1Var;
        }
        org.telegram.ui.ActionBar.v1 v1Var3 = v1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        if (v70Var.m0 != null) {
            if (v70Var.f31199g0) {
                b10 = Math.min(v70Var.f31210s0, dp6);
            } else {
                b10 = 0;
            }
        } else {
            b10 = org.telegram.messenger.q.b(52.0f, Math.min(v70Var.f31210s0, dp6), 0);
        }
        int i17 = v70Var.f31212u0;
        if (v70Var.m0 == null && v70Var.f31198f0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        v70Var.f31212u0 = i12;
        if (b10 != v70Var.f31206o0 || i17 != i12) {
            v70Var.f31206o0 = b10;
            if (u1Var.getAdapter() != null && u1Var.getAdapter().h() > 0 && (K = u1Var.K(0)) != null) {
                u1Var.getAdapter().m(0);
                v70Var.R.h1(0, K.f45938a.getTop() - u1Var.getPaddingTop());
                if (u1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ci.v4(this, 8));
                    ofFloat.setDuration(u1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(v70Var.f31210s0, dp6);
        int i18 = v70Var.f31203k0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new l6(this, 29));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > v70Var.f31210s0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final u70 f30211b;

                {
                    this.f30211b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            v70 v70Var2 = this.f30211b.e;
                            v70Var2.V.smoothScrollTo(0, dp6 - v70Var2.f31210s0);
                            return;
                        default:
                            v70 v70Var3 = this.f30211b.e;
                            v70Var3.V.smoothScrollTo(0, dp6 - v70Var3.f31210s0);
                            return;
                    }
                }
            });
        } else if (!z10 && v1Var3.getMeasuredHeight() + v1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final u70 f30211b;

                {
                    this.f30211b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            v70 v70Var2 = this.f30211b.e;
                            v70Var2.V.smoothScrollTo(0, dp6 - v70Var2.f31210s0);
                            return;
                        default:
                            v70 v70Var3 = this.f30211b.e;
                            v70Var3.V.smoothScrollTo(0, dp6 - v70Var3.f31210s0);
                            return;
                    }
                }
            });
        }
        if (!this.f30902a && (animatorSet = v70Var.f31196d0) != null) {
            animatorSet.playTogether(arrayList);
            v70Var.f31196d0.addListener(new t70(this, 0));
            v70Var.f31196d0.start();
            this.f30902a = true;
        }
        if (v70Var.f31196d0 == null) {
            v70Var.f31203k0 = min;
            v70.U(v70Var).invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        u1Var.setTranslationY(0.0f);
    }
}
