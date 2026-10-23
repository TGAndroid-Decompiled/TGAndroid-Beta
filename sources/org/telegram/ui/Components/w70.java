package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class w70 extends ViewGroup {
    public boolean f32174a;
    public final ArrayList f32175b;
    public v30 f32176c;
    public boolean d;
    public final x70 e;

    public w70(x70 x70Var, Context context) {
        super(context);
        this.e = x70Var;
        this.f32175b = new ArrayList();
    }

    public final void a(v30 v30Var, boolean z10) {
        this.d = true;
        x70 x70Var = this.e;
        x70Var.f32456f0.k(v30Var, v30Var.getUid());
        AnimatorSet animatorSet = x70Var.f32454d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            x70Var.f32454d0.cancel();
        }
        this.f32174a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            x70Var.f32454d0 = animatorSet2;
            animatorSet2.addListener(new v70(this, 1));
            x70Var.f32454d0.setDuration(150L);
            x70Var.f32454d0.setInterpolator(bs.f25133f);
            ArrayList arrayList = this.f32175b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(v30Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(v30Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(v30Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(v30Var);
    }

    public final void b(v30 v30Var) {
        this.d = false;
        x70 x70Var = this.e;
        x70Var.f32456f0.l(v30Var.getUid());
        v30Var.setOnClickListener(null);
        AnimatorSet animatorSet = x70Var.f32454d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            x70Var.f32454d0.cancel();
        }
        this.f32174a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        x70Var.f32454d0 = animatorSet2;
        animatorSet2.addListener(new ai.ne(28, this, v30Var));
        x70Var.f32454d0.setDuration(150L);
        this.f32176c = v30Var;
        ArrayList arrayList = this.f32175b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f32176c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f32176c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f32176c, View.ALPHA, 1.0f, 0.0f));
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
        int g10;
        int i12;
        s4.b1 K;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.u1 u1Var;
        int i13;
        x70 x70Var = this.e;
        org.telegram.ui.ActionBar.u1 u1Var2 = x70Var.V;
        ai.u1 u1Var3 = x70Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f32175b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof v30)) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f32176c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.v0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.v0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f32174a) {
                    v30 v30Var = this.f32176c;
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
                if (childAt != this.f32176c) {
                    i15 = org.telegram.messenger.v0.C(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.v0.C(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            u1Var2 = u1Var;
        }
        org.telegram.ui.ActionBar.u1 u1Var4 = u1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        if (x70Var.m0 != null) {
            if (x70Var.f32457g0) {
                g10 = Math.min(x70Var.f32468s0, dp6);
            } else {
                g10 = 0;
            }
        } else {
            g10 = i2.o1.g(52.0f, Math.min(x70Var.f32468s0, dp6), 0);
        }
        int i17 = x70Var.f32470u0;
        if (x70Var.m0 == null && x70Var.f32456f0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        x70Var.f32470u0 = i12;
        if (g10 != x70Var.f32464o0 || i17 != i12) {
            x70Var.f32464o0 = g10;
            if (u1Var3.getAdapter() != null && u1Var3.getAdapter().h() > 0 && (K = u1Var3.K(0)) != null) {
                u1Var3.getAdapter().m(0);
                x70Var.R.h1(0, K.f46343a.getTop() - u1Var3.getPaddingTop());
                if (u1Var3.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ci.u4(this, 8));
                    ofFloat.setDuration(u1Var3.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(x70Var.f32468s0, dp6);
        int i18 = x70Var.f32461k0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new l6(this, 29));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > x70Var.f32468s0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final w70 f31097b;

                {
                    this.f31097b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            x70 x70Var2 = this.f31097b.e;
                            x70Var2.V.smoothScrollTo(0, dp6 - x70Var2.f32468s0);
                            return;
                        default:
                            x70 x70Var3 = this.f31097b.e;
                            x70Var3.V.smoothScrollTo(0, dp6 - x70Var3.f32468s0);
                            return;
                    }
                }
            });
        } else if (!z10 && u1Var4.getMeasuredHeight() + u1Var4.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final w70 f31097b;

                {
                    this.f31097b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            x70 x70Var2 = this.f31097b.e;
                            x70Var2.V.smoothScrollTo(0, dp6 - x70Var2.f32468s0);
                            return;
                        default:
                            x70 x70Var3 = this.f31097b.e;
                            x70Var3.V.smoothScrollTo(0, dp6 - x70Var3.f32468s0);
                            return;
                    }
                }
            });
        }
        if (!this.f32174a && (animatorSet = x70Var.f32454d0) != null) {
            animatorSet.playTogether(arrayList);
            x70Var.f32454d0.addListener(new v70(this, 0));
            x70Var.f32454d0.start();
            this.f32174a = true;
        }
        if (x70Var.f32454d0 == null) {
            x70Var.f32461k0 = min;
            x70.T(x70Var).invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        u1Var3.setTranslationY(0.0f);
    }
}
