package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class d80 extends ViewGroup {
    public boolean f25593a;
    public final ArrayList f25594b;
    public e40 f25595c;
    public boolean d;
    public final e80 f25596e;

    public d80(e80 e80Var, Context context) {
        super(context);
        this.f25596e = e80Var;
        this.f25594b = new ArrayList();
    }

    public final void a(e40 e40Var, boolean z10) {
        this.d = true;
        e80 e80Var = this.f25596e;
        e80Var.f25945f0.k(e40Var, e40Var.getUid());
        AnimatorSet animatorSet = e80Var.f25943d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            e80Var.f25943d0.cancel();
        }
        this.f25593a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            e80Var.f25943d0 = animatorSet2;
            animatorSet2.addListener(new c80(this, 1));
            e80Var.f25943d0.setDuration(150L);
            e80Var.f25943d0.setInterpolator(is.f27443f);
            ArrayList arrayList = this.f25594b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(e40Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(e40Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(e40Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(e40Var);
    }

    public final void b(e40 e40Var) {
        this.d = false;
        e80 e80Var = this.f25596e;
        e80Var.f25945f0.l(e40Var.getUid());
        e40Var.setOnClickListener(null);
        AnimatorSet animatorSet = e80Var.f25943d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            e80Var.f25943d0.cancel();
        }
        this.f25593a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        e80Var.f25943d0 = animatorSet2;
        animatorSet2.addListener(new ai.z(27, this, e40Var));
        e80Var.f25943d0.setDuration(150L);
        this.f25595c = e40Var;
        ArrayList arrayList = this.f25594b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f25595c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f25595c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f25595c, View.ALPHA, 1.0f, 0.0f));
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
        s4.d1 K;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.v1 v1Var;
        int i13;
        e80 e80Var = this.f25596e;
        org.telegram.ui.ActionBar.v1 v1Var2 = e80Var.V;
        ai.w0 w0Var = e80Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f25594b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof e40)) {
                v1Var = v1Var2;
            } else {
                v1Var = v1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f25595c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.q.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.q.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f25593a) {
                    e40 e40Var = this.f25595c;
                    if (childAt == e40Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i16);
                        childAt.setTranslationY(dp3);
                    } else if (e40Var != null) {
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
                if (childAt != this.f25595c) {
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
        if (e80Var.m0 != null) {
            if (e80Var.f25946g0) {
                b10 = Math.min(e80Var.f25957s0, dp6);
            } else {
                b10 = 0;
            }
        } else {
            b10 = org.telegram.messenger.q.b(52.0f, Math.min(e80Var.f25957s0, dp6), 0);
        }
        int i17 = e80Var.f25959u0;
        if (e80Var.m0 == null && e80Var.f25945f0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        e80Var.f25959u0 = i12;
        if (b10 != e80Var.f25953o0 || i17 != i12) {
            e80Var.f25953o0 = b10;
            if (w0Var.getAdapter() != null && w0Var.getAdapter().h() > 0 && (K = w0Var.K(0)) != null) {
                w0Var.getAdapter().m(0);
                e80Var.R.h1(0, K.f47702a.getTop() - w0Var.getPaddingTop());
                if (w0Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ai.l6(this, 8));
                    ofFloat.setDuration(w0Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(e80Var.f25957s0, dp6);
        int i18 = e80Var.f25950k0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new m6(this, 29));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > e80Var.f25957s0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final d80 f24887b;

                {
                    this.f24887b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            e80 e80Var2 = this.f24887b.f25596e;
                            e80Var2.V.smoothScrollTo(0, dp6 - e80Var2.f25957s0);
                            return;
                        default:
                            e80 e80Var3 = this.f24887b.f25596e;
                            e80Var3.V.smoothScrollTo(0, dp6 - e80Var3.f25957s0);
                            return;
                    }
                }
            });
        } else if (!z10 && v1Var3.getMeasuredHeight() + v1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final d80 f24887b;

                {
                    this.f24887b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            e80 e80Var2 = this.f24887b.f25596e;
                            e80Var2.V.smoothScrollTo(0, dp6 - e80Var2.f25957s0);
                            return;
                        default:
                            e80 e80Var3 = this.f24887b.f25596e;
                            e80Var3.V.smoothScrollTo(0, dp6 - e80Var3.f25957s0);
                            return;
                    }
                }
            });
        }
        if (!this.f25593a && (animatorSet = e80Var.f25943d0) != null) {
            animatorSet.playTogether(arrayList);
            e80Var.f25943d0.addListener(new c80(this, 0));
            e80Var.f25943d0.start();
            this.f25593a = true;
        }
        if (e80Var.f25943d0 == null) {
            e80Var.f25950k0 = min;
            e80.U(e80Var).invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        w0Var.setTranslationY(0.0f);
    }
}
