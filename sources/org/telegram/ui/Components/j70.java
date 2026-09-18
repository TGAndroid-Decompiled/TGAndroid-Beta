package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class j70 extends ViewGroup {
    public boolean f25190a;
    public final ArrayList f25191b;
    public m30 f25192c;
    public boolean d;
    public final k70 e;

    public j70(k70 k70Var, Context context) {
        super(context);
        this.e = k70Var;
        this.f25191b = new ArrayList();
    }

    public final void a(m30 m30Var, boolean z10) {
        this.d = true;
        k70 k70Var = this.e;
        k70Var.f25605f0.k(m30Var, m30Var.getUid());
        AnimatorSet animatorSet = k70Var.f25603d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            k70Var.f25603d0.cancel();
        }
        this.f25190a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            k70Var.f25603d0 = animatorSet2;
            animatorSet2.addListener(new i70(this, 1));
            k70Var.f25603d0.setDuration(150L);
            k70Var.f25603d0.setInterpolator(qr.f27715f);
            ArrayList arrayList = this.f25191b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(m30Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(m30Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(m30Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(m30Var);
    }

    public final void b(m30 m30Var) {
        this.d = false;
        k70 k70Var = this.e;
        k70Var.f25605f0.l(m30Var.getUid());
        m30Var.setOnClickListener(null);
        AnimatorSet animatorSet = k70Var.f25603d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            k70Var.f25603d0.cancel();
        }
        this.f25190a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        k70Var.f25603d0 = animatorSet2;
        animatorSet2.addListener(new ai.z(27, this, m30Var));
        k70Var.f25603d0.setDuration(150L);
        this.f25192c = m30Var;
        ArrayList arrayList = this.f25191b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f25192c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f25192c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f25192c, View.ALPHA, 1.0f, 0.0f));
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
        s4.c1 L;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.v1 v1Var;
        int i13;
        k70 k70Var = this.e;
        org.telegram.ui.ActionBar.v1 v1Var2 = k70Var.V;
        ai.w0 w0Var = k70Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f25191b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof m30)) {
                v1Var = v1Var2;
            } else {
                v1Var = v1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f25192c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.q.D(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.q.D(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f25190a) {
                    m30 m30Var = this.f25192c;
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
                if (childAt != this.f25192c) {
                    i15 = org.telegram.messenger.q.D(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.q.D(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            v1Var2 = v1Var;
        }
        org.telegram.ui.ActionBar.v1 v1Var3 = v1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        if (k70Var.m0 != null) {
            if (k70Var.f25606g0) {
                c10 = Math.min(k70Var.f25617s0, dp6);
            } else {
                c10 = 0;
            }
        } else {
            c10 = org.telegram.messenger.q.c(52.0f, Math.min(k70Var.f25617s0, dp6), 0);
        }
        int i17 = k70Var.f25619u0;
        if (k70Var.m0 == null && k70Var.f25605f0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        k70Var.f25619u0 = i12;
        if (c10 != k70Var.f25613o0 || i17 != i12) {
            k70Var.f25613o0 = c10;
            if (w0Var.getAdapter() != null && w0Var.getAdapter().h() > 0 && (L = w0Var.L(0)) != null) {
                w0Var.getAdapter().m(0);
                k70Var.R.h1(0, L.f42929a.getTop() - w0Var.getPaddingTop());
                if (w0Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ai.l6(this, 8));
                    ofFloat.setDuration(w0Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(k70Var.f25617s0, dp6);
        int i18 = k70Var.f25610k0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new k6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > k70Var.f25617s0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final j70 f24576b;

                {
                    this.f24576b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            k70 k70Var2 = this.f24576b.e;
                            k70Var2.V.smoothScrollTo(0, dp6 - k70Var2.f25617s0);
                            return;
                        default:
                            k70 k70Var3 = this.f24576b.e;
                            k70Var3.V.smoothScrollTo(0, dp6 - k70Var3.f25617s0);
                            return;
                    }
                }
            });
        } else if (!z10 && v1Var3.getMeasuredHeight() + v1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final j70 f24576b;

                {
                    this.f24576b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            k70 k70Var2 = this.f24576b.e;
                            k70Var2.V.smoothScrollTo(0, dp6 - k70Var2.f25617s0);
                            return;
                        default:
                            k70 k70Var3 = this.f24576b.e;
                            k70Var3.V.smoothScrollTo(0, dp6 - k70Var3.f25617s0);
                            return;
                    }
                }
            });
        }
        if (!this.f25190a && (animatorSet = k70Var.f25603d0) != null) {
            animatorSet.playTogether(arrayList);
            k70Var.f25603d0.addListener(new i70(this, 0));
            k70Var.f25603d0.start();
            this.f25190a = true;
        }
        if (k70Var.f25603d0 == null) {
            k70Var.f25610k0 = min;
            viewGroup = ((org.telegram.ui.ActionBar.f3) k70Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        w0Var.setTranslationY(0.0f);
    }
}
