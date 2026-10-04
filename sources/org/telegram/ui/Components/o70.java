package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class o70 extends ViewGroup {
    public boolean f29275a;
    public final ArrayList f29276b;
    public q30 f29277c;
    public boolean d;
    public final p70 f29278e;

    public o70(p70 p70Var, Context context) {
        super(context);
        this.f29278e = p70Var;
        this.f29276b = new ArrayList();
    }

    public final void a(q30 q30Var, boolean z10) {
        this.d = true;
        p70 p70Var = this.f29278e;
        p70Var.f29540f0.k(q30Var, q30Var.getUid());
        AnimatorSet animatorSet = p70Var.f29538d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            p70Var.f29538d0.cancel();
        }
        this.f29275a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            p70Var.f29538d0 = animatorSet2;
            animatorSet2.addListener(new n70(this, 1));
            p70Var.f29538d0.setDuration(150L);
            p70Var.f29538d0.setInterpolator(tr.f31147f);
            ArrayList arrayList = this.f29276b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(q30Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(q30Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(q30Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(q30Var);
    }

    public final void b(q30 q30Var) {
        this.d = false;
        p70 p70Var = this.f29278e;
        p70Var.f29540f0.l(q30Var.getUid());
        q30Var.setOnClickListener(null);
        AnimatorSet animatorSet = p70Var.f29538d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            p70Var.f29538d0.cancel();
        }
        this.f29275a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        p70Var.f29538d0 = animatorSet2;
        animatorSet2.addListener(new ai.z(27, this, q30Var));
        p70Var.f29538d0.setDuration(150L);
        this.f29277c = q30Var;
        ArrayList arrayList = this.f29276b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f29277c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f29277c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f29277c, View.ALPHA, 1.0f, 0.0f));
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
        s4.c1 K;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.v1 v1Var;
        int i13;
        p70 p70Var = this.f29278e;
        org.telegram.ui.ActionBar.v1 v1Var2 = p70Var.V;
        ai.w0 w0Var = p70Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f29276b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof q30)) {
                v1Var = v1Var2;
            } else {
                v1Var = v1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f29277c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.q.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.q.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f29275a) {
                    q30 q30Var = this.f29277c;
                    if (childAt == q30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i16);
                        childAt.setTranslationY(dp3);
                    } else if (q30Var != null) {
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
                if (childAt != this.f29277c) {
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
        if (p70Var.m0 != null) {
            if (p70Var.f29541g0) {
                b10 = Math.min(p70Var.f29552s0, dp6);
            } else {
                b10 = 0;
            }
        } else {
            b10 = org.telegram.messenger.q.b(52.0f, Math.min(p70Var.f29552s0, dp6), 0);
        }
        int i17 = p70Var.f29554u0;
        if (p70Var.m0 == null && p70Var.f29540f0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        p70Var.f29554u0 = i12;
        if (b10 != p70Var.f29548o0 || i17 != i12) {
            p70Var.f29548o0 = b10;
            if (w0Var.getAdapter() != null && w0Var.getAdapter().h() > 0 && (K = w0Var.K(0)) != null) {
                w0Var.getAdapter().m(0);
                p70Var.R.h1(0, K.f46531a.getTop() - w0Var.getPaddingTop());
                if (w0Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ai.k6(this, 8));
                    ofFloat.setDuration(w0Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(p70Var.f29552s0, dp6);
        int i18 = p70Var.f29545k0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new k6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > p70Var.f29552s0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final o70 f28546b;

                {
                    this.f28546b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            p70 p70Var2 = this.f28546b.f29278e;
                            p70Var2.V.smoothScrollTo(0, dp6 - p70Var2.f29552s0);
                            return;
                        default:
                            p70 p70Var3 = this.f28546b.f29278e;
                            p70Var3.V.smoothScrollTo(0, dp6 - p70Var3.f29552s0);
                            return;
                    }
                }
            });
        } else if (!z10 && v1Var3.getMeasuredHeight() + v1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final o70 f28546b;

                {
                    this.f28546b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            p70 p70Var2 = this.f28546b.f29278e;
                            p70Var2.V.smoothScrollTo(0, dp6 - p70Var2.f29552s0);
                            return;
                        default:
                            p70 p70Var3 = this.f28546b.f29278e;
                            p70Var3.V.smoothScrollTo(0, dp6 - p70Var3.f29552s0);
                            return;
                    }
                }
            });
        }
        if (!this.f29275a && (animatorSet = p70Var.f29538d0) != null) {
            animatorSet.playTogether(arrayList);
            p70Var.f29538d0.addListener(new n70(this, 0));
            p70Var.f29538d0.start();
            this.f29275a = true;
        }
        if (p70Var.f29538d0 == null) {
            p70Var.f29545k0 = min;
            viewGroup = ((org.telegram.ui.ActionBar.f3) p70Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        w0Var.setTranslationY(0.0f);
    }
}
