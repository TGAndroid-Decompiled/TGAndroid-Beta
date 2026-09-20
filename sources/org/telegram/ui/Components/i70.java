package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class i70 extends ViewGroup {
    public boolean f24899a;
    public final ArrayList f24900b;
    public m30 f24901c;
    public boolean d;
    public final j70 e;

    public i70(j70 j70Var, Context context) {
        super(context);
        this.e = j70Var;
        this.f24900b = new ArrayList();
    }

    public final void a(m30 m30Var, boolean z10) {
        this.d = true;
        j70 j70Var = this.e;
        j70Var.f25254f0.k(m30Var, m30Var.getUid());
        AnimatorSet animatorSet = j70Var.f25252d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            j70Var.f25252d0.cancel();
        }
        this.f24899a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            j70Var.f25252d0 = animatorSet2;
            animatorSet2.addListener(new h70(this, 1));
            j70Var.f25252d0.setDuration(150L);
            j70Var.f25252d0.setInterpolator(qr.f27642f);
            ArrayList arrayList = this.f24900b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(m30Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(m30Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(m30Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(m30Var);
    }

    public final void b(m30 m30Var) {
        this.d = false;
        j70 j70Var = this.e;
        j70Var.f25254f0.l(m30Var.getUid());
        m30Var.setOnClickListener(null);
        AnimatorSet animatorSet = j70Var.f25252d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            j70Var.f25252d0.cancel();
        }
        this.f24899a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        j70Var.f25252d0 = animatorSet2;
        animatorSet2.addListener(new ai.z(27, this, m30Var));
        j70Var.f25252d0.setDuration(150L);
        this.f24901c = m30Var;
        ArrayList arrayList = this.f24900b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f24901c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f24901c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f24901c, View.ALPHA, 1.0f, 0.0f));
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
        s4.c1 L;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.v1 v1Var;
        int i13;
        j70 j70Var = this.e;
        org.telegram.ui.ActionBar.v1 v1Var2 = j70Var.V;
        ai.w0 w0Var = j70Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f24900b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof m30)) {
                v1Var = v1Var2;
            } else {
                v1Var = v1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f24901c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.l0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.l0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f24899a) {
                    m30 m30Var = this.f24901c;
                    if (childAt == m30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i16);
                        childAt.setTranslationY(dp3);
                    } else if (m30Var != null) {
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
                if (childAt != this.f24901c) {
                    i15 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            v1Var2 = v1Var;
        }
        org.telegram.ui.ActionBar.v1 v1Var3 = v1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        if (j70Var.m0 != null) {
            if (j70Var.f25255g0) {
                b10 = Math.min(j70Var.f25266s0, dp6);
            } else {
                b10 = 0;
            }
        } else {
            b10 = org.telegram.messenger.l0.b(52.0f, Math.min(j70Var.f25266s0, dp6), 0);
        }
        int i17 = j70Var.f25268u0;
        if (j70Var.m0 == null && j70Var.f25254f0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        j70Var.f25268u0 = i12;
        if (b10 != j70Var.f25262o0 || i17 != i12) {
            j70Var.f25262o0 = b10;
            if (w0Var.getAdapter() != null && w0Var.getAdapter().h() > 0 && (L = w0Var.L(0)) != null) {
                w0Var.getAdapter().m(0);
                j70Var.R.h1(0, L.f42974a.getTop() - w0Var.getPaddingTop());
                if (w0Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ai.l6(this, 8));
                    ofFloat.setDuration(w0Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(j70Var.f25266s0, dp6);
        int i18 = j70Var.f25259k0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new j6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > j70Var.f25266s0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final i70 f24277b;

                {
                    this.f24277b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            j70 j70Var2 = this.f24277b.e;
                            j70Var2.V.smoothScrollTo(0, dp6 - j70Var2.f25266s0);
                            return;
                        default:
                            j70 j70Var3 = this.f24277b.e;
                            j70Var3.V.smoothScrollTo(0, dp6 - j70Var3.f25266s0);
                            return;
                    }
                }
            });
        } else if (!z10 && v1Var3.getMeasuredHeight() + v1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final i70 f24277b;

                {
                    this.f24277b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            j70 j70Var2 = this.f24277b.e;
                            j70Var2.V.smoothScrollTo(0, dp6 - j70Var2.f25266s0);
                            return;
                        default:
                            j70 j70Var3 = this.f24277b.e;
                            j70Var3.V.smoothScrollTo(0, dp6 - j70Var3.f25266s0);
                            return;
                    }
                }
            });
        }
        if (!this.f24899a && (animatorSet = j70Var.f25252d0) != null) {
            animatorSet.playTogether(arrayList);
            j70Var.f25252d0.addListener(new h70(this, 0));
            j70Var.f25252d0.start();
            this.f24899a = true;
        }
        if (j70Var.f25252d0 == null) {
            j70Var.f25259k0 = min;
            viewGroup = ((org.telegram.ui.ActionBar.f3) j70Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        w0Var.setTranslationY(0.0f);
    }
}
