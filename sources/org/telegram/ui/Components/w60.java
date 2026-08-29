package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class w60 extends ViewGroup {
    public boolean f34332a;
    public final ArrayList f34333b;
    public j30 f34334c;
    public boolean d;
    public final x60 f34335e;

    public w60(x60 x60Var, Context context) {
        super(context);
        this.f34335e = x60Var;
        this.f34333b = new ArrayList();
    }

    public final void a(j30 j30Var, boolean z10) {
        this.d = true;
        x60 x60Var = this.f34335e;
        x60Var.f34605b0.k(j30Var, j30Var.getUid());
        AnimatorSet animatorSet = x60Var.Z;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            x60Var.Z.cancel();
        }
        this.f34332a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            x60Var.Z = animatorSet2;
            animatorSet2.addListener(new v60(this, 1));
            x60Var.Z.setDuration(150L);
            x60Var.Z.setInterpolator(jr.f29800f);
            ArrayList arrayList = this.f34333b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(j30Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(j30Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(j30Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(j30Var);
    }

    public final void b(j30 j30Var) {
        this.d = false;
        x60 x60Var = this.f34335e;
        x60Var.f34605b0.l(j30Var.getUid());
        j30Var.setOnClickListener(null);
        AnimatorSet animatorSet = x60Var.Z;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            x60Var.Z.cancel();
        }
        this.f34332a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        x60Var.Z = animatorSet2;
        animatorSet2.addListener(new bg.c3(28, this, j30Var));
        x60Var.Z.setDuration(150L);
        this.f34334c = j30Var;
        ArrayList arrayList = this.f34333b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f34334c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f34334c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f34334c, View.ALPHA, 1.0f, 0.0f));
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
        int d;
        int i12;
        f2.n1 K;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.w1 w1Var;
        int i13;
        x60 x60Var = this.f34335e;
        org.telegram.ui.ActionBar.w1 w1Var2 = x60Var.R;
        jh.e1 e1Var = x60Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f34333b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof j30)) {
                w1Var = w1Var2;
            } else {
                w1Var = w1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f34334c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.x3.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.x3.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f34332a) {
                    j30 j30Var = this.f34334c;
                    if (childAt == j30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i16);
                        childAt.setTranslationY(dp3);
                    } else if (j30Var != null) {
                        float f9 = dp4;
                        if (childAt.getTranslationX() != f9) {
                            i13 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, f9));
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
                if (childAt != this.f34334c) {
                    i15 = org.telegram.messenger.x3.C(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.x3.C(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            w1Var2 = w1Var;
        }
        org.telegram.ui.ActionBar.w1 w1Var3 = w1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        if (x60Var.f34612i0 != null) {
            if (x60Var.f34606c0) {
                d = Math.min(x60Var.f34617o0, dp6);
            } else {
                d = 0;
            }
        } else {
            d = j7.l1.d(52.0f, Math.min(x60Var.f34617o0, dp6), 0);
        }
        int i17 = x60Var.f34619q0;
        if (x60Var.f34612i0 == null && x60Var.f34605b0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        x60Var.f34619q0 = i12;
        if (d != x60Var.f34614k0 || i17 != i12) {
            x60Var.f34614k0 = d;
            if (e1Var.getAdapter() != null && e1Var.getAdapter().h() > 0 && (K = e1Var.K(0)) != null) {
                e1Var.getAdapter().m(0);
                x60Var.N.h1(0, K.f6432a.getTop() - e1Var.getPaddingTop());
                if (e1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new cg.c1(this, 8));
                    ofFloat.setDuration(e1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(x60Var.f34617o0, dp6);
        int i18 = x60Var.f34610g0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new j6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > x60Var.f34617o0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final w60 f33149b;

                {
                    this.f33149b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            x60 x60Var2 = this.f33149b.f34335e;
                            x60Var2.R.smoothScrollTo(0, dp6 - x60Var2.f34617o0);
                            return;
                        default:
                            x60 x60Var3 = this.f33149b.f34335e;
                            x60Var3.R.smoothScrollTo(0, dp6 - x60Var3.f34617o0);
                            return;
                    }
                }
            });
        } else if (!z10 && w1Var3.getMeasuredHeight() + w1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final w60 f33149b;

                {
                    this.f33149b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            x60 x60Var2 = this.f33149b.f34335e;
                            x60Var2.R.smoothScrollTo(0, dp6 - x60Var2.f34617o0);
                            return;
                        default:
                            x60 x60Var3 = this.f33149b.f34335e;
                            x60Var3.R.smoothScrollTo(0, dp6 - x60Var3.f34617o0);
                            return;
                    }
                }
            });
        }
        if (!this.f34332a && (animatorSet = x60Var.Z) != null) {
            animatorSet.playTogether(arrayList);
            x60Var.Z.addListener(new v60(this, 0));
            x60Var.Z.start();
            this.f34332a = true;
        }
        if (x60Var.Z == null) {
            x60Var.f34610g0 = min;
            viewGroup = ((org.telegram.ui.ActionBar.f3) x60Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        e1Var.setTranslationY(0.0f);
    }
}
