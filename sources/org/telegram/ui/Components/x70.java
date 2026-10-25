package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class x70 extends ViewGroup {
    public boolean f34649a;
    public final ArrayList f34650b;
    public x30 f34651c;
    public boolean d;
    public final y70 e;

    public x70(y70 y70Var, Context context) {
        super(context);
        this.e = y70Var;
        this.f34650b = new ArrayList();
    }

    public final void a(x30 x30Var, boolean z10) {
        this.d = true;
        y70 y70Var = this.e;
        y70Var.f34946f0.k(x30Var, x30Var.getUid());
        AnimatorSet animatorSet = y70Var.f34944d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            y70Var.f34944d0.cancel();
        }
        this.f34649a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            y70Var.f34944d0 = animatorSet2;
            animatorSet2.addListener(new w70(this, 1));
            y70Var.f34944d0.setDuration(150L);
            y70Var.f34944d0.setInterpolator(ds.f27584f);
            ArrayList arrayList = this.f34650b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(x30Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(x30Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(x30Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(x30Var);
    }

    public final void b(x30 x30Var) {
        this.d = false;
        y70 y70Var = this.e;
        y70Var.f34946f0.l(x30Var.getUid());
        x30Var.setOnClickListener(null);
        AnimatorSet animatorSet = y70Var.f34944d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            y70Var.f34944d0.cancel();
        }
        this.f34649a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        y70Var.f34944d0 = animatorSet2;
        animatorSet2.addListener(new bi.ce(28, this, x30Var));
        y70Var.f34944d0.setDuration(150L);
        this.f34651c = x30Var;
        ArrayList arrayList = this.f34650b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f34651c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f34651c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f34651c, View.ALPHA, 1.0f, 0.0f));
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
        y70 y70Var = this.e;
        org.telegram.ui.ActionBar.w1 w1Var2 = y70Var.V;
        bi.r1 r1Var = y70Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f34650b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof x30)) {
                w1Var = w1Var2;
            } else {
                w1Var = w1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f34651c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.t.D(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.t.D(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f34649a) {
                    x30 x30Var = this.f34651c;
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
                if (childAt != this.f34651c) {
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
        if (y70Var.m0 != null) {
            if (y70Var.f34947g0) {
                c10 = Math.min(y70Var.f34958s0, dp6);
            } else {
                c10 = 0;
            }
        } else {
            c10 = org.telegram.messenger.t.c(52.0f, Math.min(y70Var.f34958s0, dp6), 0);
        }
        int i17 = y70Var.f34960u0;
        if (y70Var.m0 == null && y70Var.f34946f0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        y70Var.f34960u0 = i12;
        if (c10 != y70Var.f34954o0 || i17 != i12) {
            y70Var.f34954o0 = c10;
            if (r1Var.getAdapter() != null && r1Var.getAdapter().h() > 0 && (K = r1Var.K(0)) != null) {
                r1Var.getAdapter().m(0);
                y70Var.R.h1(0, K.f47735a.getTop() - r1Var.getPaddingTop());
                if (r1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new di.u4(this, 8));
                    ofFloat.setDuration(r1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(y70Var.f34958s0, dp6);
        int i18 = y70Var.f34951k0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new n6(this, 29));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > y70Var.f34958s0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final x70 f33590b;

                {
                    this.f33590b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            y70 y70Var2 = this.f33590b.e;
                            y70Var2.V.smoothScrollTo(0, dp6 - y70Var2.f34958s0);
                            return;
                        default:
                            y70 y70Var3 = this.f33590b.e;
                            y70Var3.V.smoothScrollTo(0, dp6 - y70Var3.f34958s0);
                            return;
                    }
                }
            });
        } else if (!z10 && w1Var3.getMeasuredHeight() + w1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final x70 f33590b;

                {
                    this.f33590b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            y70 y70Var2 = this.f33590b.e;
                            y70Var2.V.smoothScrollTo(0, dp6 - y70Var2.f34958s0);
                            return;
                        default:
                            y70 y70Var3 = this.f33590b.e;
                            y70Var3.V.smoothScrollTo(0, dp6 - y70Var3.f34958s0);
                            return;
                    }
                }
            });
        }
        if (!this.f34649a && (animatorSet = y70Var.f34944d0) != null) {
            animatorSet.playTogether(arrayList);
            y70Var.f34944d0.addListener(new w70(this, 0));
            y70Var.f34944d0.start();
            this.f34649a = true;
        }
        if (y70Var.f34944d0 == null) {
            y70Var.f34951k0 = min;
            y70.T(y70Var).invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        r1Var.setTranslationY(0.0f);
    }
}
