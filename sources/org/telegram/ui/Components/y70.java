package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class y70 extends ViewGroup {
    public boolean f31172a;
    public final ArrayList f31173b;
    public z30 f31174c;
    public boolean d;
    public final z70 e;

    public y70(z70 z70Var, Context context) {
        super(context);
        this.e = z70Var;
        this.f31173b = new ArrayList();
    }

    public final void a(z30 z30Var, boolean z10) {
        this.d = true;
        z70 z70Var = this.e;
        z70Var.f31478f0.k(z30Var, z30Var.getUid());
        AnimatorSet animatorSet = z70Var.f31476d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            z70Var.f31476d0.cancel();
        }
        this.f31172a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            z70Var.f31476d0 = animatorSet2;
            animatorSet2.addListener(new x70(this, 1));
            z70Var.f31476d0.setDuration(150L);
            z70Var.f31476d0.setInterpolator(es.f24465f);
            ArrayList arrayList = this.f31173b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(z30Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(z30Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(z30Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(z30Var);
    }

    public final void b(z30 z30Var) {
        this.d = false;
        z70 z70Var = this.e;
        z70Var.f31478f0.l(z30Var.getUid());
        z30Var.setOnClickListener(null);
        AnimatorSet animatorSet = z70Var.f31476d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            z70Var.f31476d0.cancel();
        }
        this.f31172a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        z70Var.f31476d0 = animatorSet2;
        animatorSet2.addListener(new bi.t(27, this, z30Var));
        z70Var.f31476d0.setDuration(150L);
        this.f31174c = z30Var;
        ArrayList arrayList = this.f31173b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f31174c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f31174c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f31174c, View.ALPHA, 1.0f, 0.0f));
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
        s4.b1 K;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.u1 u1Var;
        int i13;
        z70 z70Var = this.e;
        org.telegram.ui.ActionBar.u1 u1Var2 = z70Var.V;
        bi.o0 o0Var = z70Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f31173b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof z30)) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f31174c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.g0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.g0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f31172a) {
                    z30 z30Var = this.f31174c;
                    if (childAt == z30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i16);
                        childAt.setTranslationY(dp3);
                    } else if (z30Var != null) {
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
                if (childAt != this.f31174c) {
                    i15 = org.telegram.messenger.g0.C(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.g0.C(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            u1Var2 = u1Var;
        }
        org.telegram.ui.ActionBar.u1 u1Var3 = u1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        if (z70Var.m0 != null) {
            if (z70Var.f31479g0) {
                b10 = Math.min(z70Var.f31490s0, dp6);
            } else {
                b10 = 0;
            }
        } else {
            b10 = org.telegram.messenger.g0.b(52.0f, Math.min(z70Var.f31490s0, dp6), 0);
        }
        int i17 = z70Var.f31492u0;
        if (z70Var.m0 == null && z70Var.f31478f0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        z70Var.f31492u0 = i12;
        if (b10 != z70Var.f31486o0 || i17 != i12) {
            z70Var.f31486o0 = b10;
            if (o0Var.getAdapter() != null && o0Var.getAdapter().h() > 0 && (K = o0Var.K(0)) != null) {
                o0Var.getAdapter().m(0);
                z70Var.R.h1(0, K.f44838a.getTop() - o0Var.getPaddingTop());
                if (o0Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new bi.w5(this, 8));
                    ofFloat.setDuration(o0Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(z70Var.f31490s0, dp6);
        int i18 = z70Var.f31483k0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new n6(this, 29));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > z70Var.f31490s0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final y70 f30488b;

                {
                    this.f30488b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            z70 z70Var2 = this.f30488b.e;
                            z70Var2.V.smoothScrollTo(0, dp6 - z70Var2.f31490s0);
                            return;
                        default:
                            z70 z70Var3 = this.f30488b.e;
                            z70Var3.V.smoothScrollTo(0, dp6 - z70Var3.f31490s0);
                            return;
                    }
                }
            });
        } else if (!z10 && u1Var3.getMeasuredHeight() + u1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final y70 f30488b;

                {
                    this.f30488b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            z70 z70Var2 = this.f30488b.e;
                            z70Var2.V.smoothScrollTo(0, dp6 - z70Var2.f31490s0);
                            return;
                        default:
                            z70 z70Var3 = this.f30488b.e;
                            z70Var3.V.smoothScrollTo(0, dp6 - z70Var3.f31490s0);
                            return;
                    }
                }
            });
        }
        if (!this.f31172a && (animatorSet = z70Var.f31476d0) != null) {
            animatorSet.playTogether(arrayList);
            z70Var.f31476d0.addListener(new x70(this, 0));
            z70Var.f31476d0.start();
            this.f31172a = true;
        }
        if (z70Var.f31476d0 == null) {
            z70Var.f31483k0 = min;
            z70.U(z70Var).invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        o0Var.setTranslationY(0.0f);
    }
}
