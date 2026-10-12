package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class z70 extends ViewGroup {
    public boolean f31787a;
    public final ArrayList f31788b;
    public z30 f31789c;
    public boolean d;
    public final a80 e;

    public z70(a80 a80Var, Context context) {
        super(context);
        this.e = a80Var;
        this.f31788b = new ArrayList();
    }

    public final void a(z30 z30Var, boolean z10) {
        this.d = true;
        a80 a80Var = this.e;
        a80Var.f23471f0.k(z30Var, z30Var.getUid());
        AnimatorSet animatorSet = a80Var.f23469d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            a80Var.f23469d0.cancel();
        }
        this.f31787a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            a80Var.f23469d0 = animatorSet2;
            animatorSet2.addListener(new y70(this, 1));
            a80Var.f23469d0.setDuration(150L);
            a80Var.f23469d0.setInterpolator(es.f24771f);
            ArrayList arrayList = this.f31788b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(z30Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(z30Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(z30Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(z30Var);
    }

    public final void b(z30 z30Var) {
        this.d = false;
        a80 a80Var = this.e;
        a80Var.f23471f0.l(z30Var.getUid());
        z30Var.setOnClickListener(null);
        AnimatorSet animatorSet = a80Var.f23469d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            a80Var.f23469d0.cancel();
        }
        this.f31787a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        a80Var.f23469d0 = animatorSet2;
        animatorSet2.addListener(new bi.t(27, this, z30Var));
        a80Var.f23469d0.setDuration(150L);
        this.f31789c = z30Var;
        ArrayList arrayList = this.f31788b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f31789c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f31789c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f31789c, View.ALPHA, 1.0f, 0.0f));
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
        int c10;
        int i12;
        s4.b1 K;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.u1 u1Var;
        int i13;
        a80 a80Var = this.e;
        org.telegram.ui.ActionBar.u1 u1Var2 = a80Var.V;
        bi.o0 o0Var = a80Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f31788b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof z30)) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f31789c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.yh.c(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.yh.c(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f31787a) {
                    z30 z30Var = this.f31789c;
                    if (childAt == z30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i16);
                        childAt.setTranslationY(dp3);
                    } else if (z30Var != null) {
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
                if (childAt != this.f31789c) {
                    i15 = org.telegram.messenger.yh.c(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.yh.c(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            u1Var2 = u1Var;
        }
        org.telegram.ui.ActionBar.u1 u1Var3 = u1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        if (a80Var.m0 != null) {
            if (a80Var.f23472g0) {
                c10 = Math.min(a80Var.f23483s0, dp6);
            } else {
                c10 = 0;
            }
        } else {
            c10 = org.telegram.messenger.q.c(52.0f, Math.min(a80Var.f23483s0, dp6), 0);
        }
        int i17 = a80Var.f23485u0;
        if (a80Var.m0 == null && a80Var.f23471f0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        a80Var.f23485u0 = i12;
        if (c10 != a80Var.f23479o0 || i17 != i12) {
            a80Var.f23479o0 = c10;
            if (o0Var.getAdapter() != null && o0Var.getAdapter().h() > 0 && (K = o0Var.K(0)) != null) {
                o0Var.getAdapter().m(0);
                a80Var.R.h1(0, K.f44838a.getTop() - o0Var.getPaddingTop());
                if (o0Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new bi.w5(this, 8));
                    ofFloat.setDuration(o0Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(a80Var.f23483s0, dp6);
        int i18 = a80Var.f23476k0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new n6(this, 29));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > a80Var.f23483s0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final z70 f31186b;

                {
                    this.f31186b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            a80 a80Var2 = this.f31186b.e;
                            a80Var2.V.smoothScrollTo(0, dp6 - a80Var2.f23483s0);
                            return;
                        default:
                            a80 a80Var3 = this.f31186b.e;
                            a80Var3.V.smoothScrollTo(0, dp6 - a80Var3.f23483s0);
                            return;
                    }
                }
            });
        } else if (!z10 && u1Var3.getMeasuredHeight() + u1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final z70 f31186b;

                {
                    this.f31186b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            a80 a80Var2 = this.f31186b.e;
                            a80Var2.V.smoothScrollTo(0, dp6 - a80Var2.f23483s0);
                            return;
                        default:
                            a80 a80Var3 = this.f31186b.e;
                            a80Var3.V.smoothScrollTo(0, dp6 - a80Var3.f23483s0);
                            return;
                    }
                }
            });
        }
        if (!this.f31787a && (animatorSet = a80Var.f23469d0) != null) {
            animatorSet.playTogether(arrayList);
            a80Var.f23469d0.addListener(new y70(this, 0));
            a80Var.f23469d0.start();
            this.f31787a = true;
        }
        if (a80Var.f23469d0 == null) {
            a80Var.f23476k0 = min;
            viewGroup = ((org.telegram.ui.ActionBar.e3) a80Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        o0Var.setTranslationY(0.0f);
    }
}
