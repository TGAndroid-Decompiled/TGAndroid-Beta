package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class n70 extends ViewGroup {
    public boolean f26701a;
    public final ArrayList f26702b;
    public p30 f26703c;
    public boolean d;
    public final o70 e;

    public n70(o70 o70Var, Context context) {
        super(context);
        this.e = o70Var;
        this.f26702b = new ArrayList();
    }

    public final void a(p30 p30Var, boolean z10) {
        this.d = true;
        o70 o70Var = this.e;
        o70Var.f26982f0.k(p30Var, p30Var.getUid());
        AnimatorSet animatorSet = o70Var.f26980d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            o70Var.f26980d0.cancel();
        }
        this.f26701a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            o70Var.f26980d0 = animatorSet2;
            animatorSet2.addListener(new m70(this, 1));
            o70Var.f26980d0.setDuration(150L);
            o70Var.f26980d0.setInterpolator(sr.f28348f);
            ArrayList arrayList = this.f26702b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(p30Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(p30Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(p30Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(p30Var);
    }

    public final void b(p30 p30Var) {
        this.d = false;
        o70 o70Var = this.e;
        o70Var.f26982f0.l(p30Var.getUid());
        p30Var.setOnClickListener(null);
        AnimatorSet animatorSet = o70Var.f26980d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            o70Var.f26980d0.cancel();
        }
        this.f26701a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        o70Var.f26980d0 = animatorSet2;
        animatorSet2.addListener(new ai.z(27, this, p30Var));
        o70Var.f26980d0.setDuration(150L);
        this.f26703c = p30Var;
        ArrayList arrayList = this.f26702b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f26703c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f26703c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f26703c, View.ALPHA, 1.0f, 0.0f));
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
        org.telegram.ui.ActionBar.u1 u1Var;
        int i13;
        o70 o70Var = this.e;
        org.telegram.ui.ActionBar.u1 u1Var2 = o70Var.V;
        ai.w0 w0Var = o70Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f26702b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof p30)) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f26703c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.f0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.f0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f26701a) {
                    p30 p30Var = this.f26703c;
                    if (childAt == p30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i16);
                        childAt.setTranslationY(dp3);
                    } else if (p30Var != null) {
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
                if (childAt != this.f26703c) {
                    i15 = org.telegram.messenger.f0.C(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.f0.C(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            u1Var2 = u1Var;
        }
        org.telegram.ui.ActionBar.u1 u1Var3 = u1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        if (o70Var.m0 != null) {
            if (o70Var.f26983g0) {
                b10 = Math.min(o70Var.f26994s0, dp6);
            } else {
                b10 = 0;
            }
        } else {
            b10 = org.telegram.messenger.f0.b(52.0f, Math.min(o70Var.f26994s0, dp6), 0);
        }
        int i17 = o70Var.f26996u0;
        if (o70Var.m0 == null && o70Var.f26982f0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        o70Var.f26996u0 = i12;
        if (b10 != o70Var.f26990o0 || i17 != i12) {
            o70Var.f26990o0 = b10;
            if (w0Var.getAdapter() != null && w0Var.getAdapter().h() > 0 && (K = w0Var.K(0)) != null) {
                w0Var.getAdapter().m(0);
                o70Var.R.h1(0, K.f42960a.getTop() - w0Var.getPaddingTop());
                if (w0Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ai.k6(this, 8));
                    ofFloat.setDuration(w0Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(o70Var.f26994s0, dp6);
        int i18 = o70Var.f26987k0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new k6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > o70Var.f26994s0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final n70 f25944b;

                {
                    this.f25944b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            o70 o70Var2 = this.f25944b.e;
                            o70Var2.V.smoothScrollTo(0, dp6 - o70Var2.f26994s0);
                            return;
                        default:
                            o70 o70Var3 = this.f25944b.e;
                            o70Var3.V.smoothScrollTo(0, dp6 - o70Var3.f26994s0);
                            return;
                    }
                }
            });
        } else if (!z10 && u1Var3.getMeasuredHeight() + u1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final n70 f25944b;

                {
                    this.f25944b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            o70 o70Var2 = this.f25944b.e;
                            o70Var2.V.smoothScrollTo(0, dp6 - o70Var2.f26994s0);
                            return;
                        default:
                            o70 o70Var3 = this.f25944b.e;
                            o70Var3.V.smoothScrollTo(0, dp6 - o70Var3.f26994s0);
                            return;
                    }
                }
            });
        }
        if (!this.f26701a && (animatorSet = o70Var.f26980d0) != null) {
            animatorSet.playTogether(arrayList);
            o70Var.f26980d0.addListener(new m70(this, 0));
            o70Var.f26980d0.start();
            this.f26701a = true;
        }
        if (o70Var.f26980d0 == null) {
            o70Var.f26987k0 = min;
            viewGroup = ((org.telegram.ui.ActionBar.e3) o70Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        w0Var.setTranslationY(0.0f);
    }
}
