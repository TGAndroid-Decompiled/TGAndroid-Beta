package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class y70 extends ViewGroup {
    public boolean f34985a;
    public final ArrayList f34986b;
    public x30 f34987c;
    public boolean d;
    public final z70 e;

    public y70(z70 z70Var, Context context) {
        super(context);
        this.e = z70Var;
        this.f34986b = new ArrayList();
    }

    public final void a(x30 x30Var, boolean z10) {
        this.d = true;
        z70 z70Var = this.e;
        z70Var.f35266f0.k(x30Var, x30Var.getUid());
        AnimatorSet animatorSet = z70Var.f35264d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            z70Var.f35264d0.cancel();
        }
        this.f34985a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            z70Var.f35264d0 = animatorSet2;
            animatorSet2.addListener(new x70(this, 1));
            z70Var.f35264d0.setDuration(150L);
            z70Var.f35264d0.setInterpolator(ds.f27530f);
            ArrayList arrayList = this.f34986b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(x30Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(x30Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(x30Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(x30Var);
    }

    public final void b(x30 x30Var) {
        this.d = false;
        z70 z70Var = this.e;
        z70Var.f35266f0.l(x30Var.getUid());
        x30Var.setOnClickListener(null);
        AnimatorSet animatorSet = z70Var.f35264d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            z70Var.f35264d0.cancel();
        }
        this.f34985a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        z70Var.f35264d0 = animatorSet2;
        animatorSet2.addListener(new bi.ce(28, this, x30Var));
        z70Var.f35264d0.setDuration(150L);
        this.f34987c = x30Var;
        ArrayList arrayList = this.f34986b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f34987c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f34987c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f34987c, View.ALPHA, 1.0f, 0.0f));
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
        s4.e1 K;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.w1 w1Var;
        int i13;
        z70 z70Var = this.e;
        org.telegram.ui.ActionBar.w1 w1Var2 = z70Var.V;
        bi.r1 r1Var = z70Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f34986b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof x30)) {
                w1Var = w1Var2;
            } else {
                w1Var = w1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f34987c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.t.D(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.t.D(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f34985a) {
                    x30 x30Var = this.f34987c;
                    if (childAt == x30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i16);
                        childAt.setTranslationY(dp3);
                    } else if (x30Var != null) {
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
                if (childAt != this.f34987c) {
                    i15 = org.telegram.messenger.t.D(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.t.D(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            w1Var2 = w1Var;
        }
        org.telegram.ui.ActionBar.w1 w1Var3 = w1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        if (z70Var.m0 != null) {
            if (z70Var.f35267g0) {
                c10 = Math.min(z70Var.f35278s0, dp6);
            } else {
                c10 = 0;
            }
        } else {
            c10 = org.telegram.messenger.t.c(52.0f, Math.min(z70Var.f35278s0, dp6), 0);
        }
        int i17 = z70Var.f35280u0;
        if (z70Var.m0 == null && z70Var.f35266f0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        z70Var.f35280u0 = i12;
        if (c10 != z70Var.f35274o0 || i17 != i12) {
            z70Var.f35274o0 = c10;
            if (r1Var.getAdapter() != null && r1Var.getAdapter().h() > 0 && (K = r1Var.K(0)) != null) {
                r1Var.getAdapter().m(0);
                z70Var.R.h1(0, K.f47773a.getTop() - r1Var.getPaddingTop());
                if (r1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new di.u4(this, 8));
                    ofFloat.setDuration(r1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(z70Var.f35278s0, dp6);
        int i18 = z70Var.f35271k0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new n6(this, 29));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > z70Var.f35278s0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final y70 f34466b;

                {
                    this.f34466b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            z70 z70Var2 = this.f34466b.e;
                            z70Var2.V.smoothScrollTo(0, dp6 - z70Var2.f35278s0);
                            return;
                        default:
                            z70 z70Var3 = this.f34466b.e;
                            z70Var3.V.smoothScrollTo(0, dp6 - z70Var3.f35278s0);
                            return;
                    }
                }
            });
        } else if (!z10 && w1Var3.getMeasuredHeight() + w1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final y70 f34466b;

                {
                    this.f34466b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            z70 z70Var2 = this.f34466b.e;
                            z70Var2.V.smoothScrollTo(0, dp6 - z70Var2.f35278s0);
                            return;
                        default:
                            z70 z70Var3 = this.f34466b.e;
                            z70Var3.V.smoothScrollTo(0, dp6 - z70Var3.f35278s0);
                            return;
                    }
                }
            });
        }
        if (!this.f34985a && (animatorSet = z70Var.f35264d0) != null) {
            animatorSet.playTogether(arrayList);
            z70Var.f35264d0.addListener(new x70(this, 0));
            z70Var.f35264d0.start();
            this.f34985a = true;
        }
        if (z70Var.f35264d0 == null) {
            z70Var.f35271k0 = min;
            z70.T(z70Var).invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        r1Var.setTranslationY(0.0f);
    }
}
