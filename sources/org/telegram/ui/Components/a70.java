package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class a70 extends ViewGroup {
    public boolean f22339a;
    public final ArrayList f22340b;
    public m30 f22341c;
    public boolean d;
    public final b70 e;

    public a70(b70 b70Var, Context context) {
        super(context);
        this.e = b70Var;
        this.f22340b = new ArrayList();
    }

    public final void a(m30 m30Var, boolean z10) {
        this.d = true;
        b70 b70Var = this.e;
        b70Var.f22627f0.k(m30Var, m30Var.getUid());
        AnimatorSet animatorSet = b70Var.f22625d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            b70Var.f22625d0.cancel();
        }
        this.f22339a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            b70Var.f22625d0 = animatorSet2;
            animatorSet2.addListener(new z60(this, 1));
            b70Var.f22625d0.setDuration(150L);
            b70Var.f22625d0.setInterpolator(qr.f27380f);
            ArrayList arrayList = this.f22340b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(m30Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(m30Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(m30Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(m30Var);
    }

    public final void b(m30 m30Var) {
        this.d = false;
        b70 b70Var = this.e;
        b70Var.f22627f0.l(m30Var.getUid());
        m30Var.setOnClickListener(null);
        AnimatorSet animatorSet = b70Var.f22625d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            b70Var.f22625d0.cancel();
        }
        this.f22339a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        b70Var.f22625d0 = animatorSet2;
        animatorSet2.addListener(new ai.z(27, this, m30Var));
        b70Var.f22625d0.setDuration(150L);
        this.f22341c = m30Var;
        ArrayList arrayList = this.f22340b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f22341c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f22341c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f22341c, View.ALPHA, 1.0f, 0.0f));
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
        s4.c1 L;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.w1 w1Var;
        int i13;
        b70 b70Var = this.e;
        org.telegram.ui.ActionBar.w1 w1Var2 = b70Var.V;
        ai.w0 w0Var = b70Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f22340b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof m30)) {
                w1Var = w1Var2;
            } else {
                w1Var = w1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f22341c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.w1.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.w1.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f22339a) {
                    m30 m30Var = this.f22341c;
                    if (childAt == m30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i16);
                        childAt.setTranslationY(dp3);
                    } else if (m30Var != null) {
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
                if (childAt != this.f22341c) {
                    i15 = org.telegram.messenger.w1.C(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.w1.C(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            w1Var2 = w1Var;
        }
        org.telegram.ui.ActionBar.w1 w1Var3 = w1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        if (b70Var.m0 != null) {
            if (b70Var.f22628g0) {
                f7 = Math.min(b70Var.f22639s0, dp6);
            } else {
                f7 = 0;
            }
        } else {
            f7 = hg.k0.f(52.0f, Math.min(b70Var.f22639s0, dp6), 0);
        }
        int i17 = b70Var.f22641u0;
        if (b70Var.m0 == null && b70Var.f22627f0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        b70Var.f22641u0 = i12;
        if (f7 != b70Var.f22635o0 || i17 != i12) {
            b70Var.f22635o0 = f7;
            if (w0Var.getAdapter() != null && w0Var.getAdapter().h() > 0 && (L = w0Var.L(0)) != null) {
                w0Var.getAdapter().m(0);
                b70Var.R.h1(0, L.f42697a.getTop() - w0Var.getPaddingTop());
                if (w0Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ai.l6(this, 8));
                    ofFloat.setDuration(w0Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(b70Var.f22639s0, dp6);
        int i18 = b70Var.f22632k0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new i6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > b70Var.f22639s0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final a70 f30130b;

                {
                    this.f30130b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            b70 b70Var2 = this.f30130b.e;
                            b70Var2.V.smoothScrollTo(0, dp6 - b70Var2.f22639s0);
                            return;
                        default:
                            b70 b70Var3 = this.f30130b.e;
                            b70Var3.V.smoothScrollTo(0, dp6 - b70Var3.f22639s0);
                            return;
                    }
                }
            });
        } else if (!z10 && w1Var3.getMeasuredHeight() + w1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final a70 f30130b;

                {
                    this.f30130b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            b70 b70Var2 = this.f30130b.e;
                            b70Var2.V.smoothScrollTo(0, dp6 - b70Var2.f22639s0);
                            return;
                        default:
                            b70 b70Var3 = this.f30130b.e;
                            b70Var3.V.smoothScrollTo(0, dp6 - b70Var3.f22639s0);
                            return;
                    }
                }
            });
        }
        if (!this.f22339a && (animatorSet = b70Var.f22625d0) != null) {
            animatorSet.playTogether(arrayList);
            b70Var.f22625d0.addListener(new z60(this, 0));
            b70Var.f22625d0.start();
            this.f22339a = true;
        }
        if (b70Var.f22625d0 == null) {
            b70Var.f22632k0 = min;
            viewGroup = ((org.telegram.ui.ActionBar.g3) b70Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        w0Var.setTranslationY(0.0f);
    }
}
