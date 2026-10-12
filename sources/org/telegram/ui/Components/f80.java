package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class f80 extends ViewGroup {
    public boolean f25959a;
    public final ArrayList f25960b;
    public g40 f25961c;
    public boolean d;
    public final g80 f25962e;

    public f80(g80 g80Var, Context context) {
        super(context);
        this.f25962e = g80Var;
        this.f25960b = new ArrayList();
    }

    public final void a(g40 g40Var, boolean z10) {
        this.d = true;
        g80 g80Var = this.f25962e;
        g80Var.f26328f0.k(g40Var, g40Var.getUid());
        AnimatorSet animatorSet = g80Var.f26326d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            g80Var.f26326d0.cancel();
        }
        this.f25959a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            g80Var.f26326d0 = animatorSet2;
            animatorSet2.addListener(new e80(this, 1));
            g80Var.f26326d0.setDuration(150L);
            g80Var.f26326d0.setInterpolator(js.f27627f);
            ArrayList arrayList = this.f25960b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(g40Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(g40Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(g40Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(g40Var);
    }

    public final void b(g40 g40Var) {
        this.d = false;
        g80 g80Var = this.f25962e;
        g80Var.f26328f0.l(g40Var.getUid());
        g40Var.setOnClickListener(null);
        AnimatorSet animatorSet = g80Var.f26326d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            g80Var.f26326d0.cancel();
        }
        this.f25959a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        g80Var.f26326d0 = animatorSet2;
        animatorSet2.addListener(new ai.z(27, this, g40Var));
        g80Var.f26326d0.setDuration(150L);
        this.f25961c = g40Var;
        ArrayList arrayList = this.f25960b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f25961c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f25961c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f25961c, View.ALPHA, 1.0f, 0.0f));
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
        s4.d1 K;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.u1 u1Var;
        int i13;
        g80 g80Var = this.f25962e;
        org.telegram.ui.ActionBar.u1 u1Var2 = g80Var.V;
        ai.w0 w0Var = g80Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f25960b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof g40)) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f25961c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.v0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.v0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f25959a) {
                    g40 g40Var = this.f25961c;
                    if (childAt == g40Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i16);
                        childAt.setTranslationY(dp3);
                    } else if (g40Var != null) {
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
                if (childAt != this.f25961c) {
                    i15 = org.telegram.messenger.v0.C(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.v0.C(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            u1Var2 = u1Var;
        }
        org.telegram.ui.ActionBar.u1 u1Var3 = u1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        if (g80Var.m0 != null) {
            if (g80Var.f26329g0) {
                f7 = Math.min(g80Var.f26340s0, dp6);
            } else {
                f7 = 0;
            }
        } else {
            f7 = hg.c.f(52.0f, Math.min(g80Var.f26340s0, dp6), 0);
        }
        int i17 = g80Var.f26342u0;
        if (g80Var.m0 == null && g80Var.f26328f0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        g80Var.f26342u0 = i12;
        if (f7 != g80Var.f26336o0 || i17 != i12) {
            g80Var.f26336o0 = f7;
            if (w0Var.getAdapter() != null && w0Var.getAdapter().h() > 0 && (K = w0Var.K(0)) != null) {
                w0Var.getAdapter().m(0);
                g80Var.R.h1(0, K.f47889a.getTop() - w0Var.getPaddingTop());
                if (w0Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ai.l6(this, 8));
                    ofFloat.setDuration(w0Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(g80Var.f26340s0, dp6);
        int i18 = g80Var.f26333k0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new m6(this, 29));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > g80Var.f26340s0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final f80 f25263b;

                {
                    this.f25263b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            g80 g80Var2 = this.f25263b.f25962e;
                            g80Var2.V.smoothScrollTo(0, dp6 - g80Var2.f26340s0);
                            return;
                        default:
                            g80 g80Var3 = this.f25263b.f25962e;
                            g80Var3.V.smoothScrollTo(0, dp6 - g80Var3.f26340s0);
                            return;
                    }
                }
            });
        } else if (!z10 && u1Var3.getMeasuredHeight() + u1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final f80 f25263b;

                {
                    this.f25263b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            g80 g80Var2 = this.f25263b.f25962e;
                            g80Var2.V.smoothScrollTo(0, dp6 - g80Var2.f26340s0);
                            return;
                        default:
                            g80 g80Var3 = this.f25263b.f25962e;
                            g80Var3.V.smoothScrollTo(0, dp6 - g80Var3.f26340s0);
                            return;
                    }
                }
            });
        }
        if (!this.f25959a && (animatorSet = g80Var.f26326d0) != null) {
            animatorSet.playTogether(arrayList);
            g80Var.f26326d0.addListener(new e80(this, 0));
            g80Var.f26326d0.start();
            this.f25959a = true;
        }
        if (g80Var.f26326d0 == null) {
            g80Var.f26333k0 = min;
            viewGroup = ((org.telegram.ui.ActionBar.e3) g80Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        w0Var.setTranslationY(0.0f);
    }
}
