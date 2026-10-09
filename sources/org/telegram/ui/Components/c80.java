package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class c80 extends ViewGroup {
    public boolean f25286a;
    public final ArrayList f25287b;
    public d40 f25288c;
    public boolean d;
    public final d80 f25289e;

    public c80(d80 d80Var, Context context) {
        super(context);
        this.f25289e = d80Var;
        this.f25287b = new ArrayList();
    }

    public final void a(d40 d40Var, boolean z10) {
        this.d = true;
        d80 d80Var = this.f25289e;
        d80Var.f25625f0.k(d40Var, d40Var.getUid());
        AnimatorSet animatorSet = d80Var.f25623d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            d80Var.f25623d0.cancel();
        }
        this.f25286a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            d80Var.f25623d0 = animatorSet2;
            animatorSet2.addListener(new b80(this, 1));
            d80Var.f25623d0.setDuration(150L);
            d80Var.f25623d0.setInterpolator(hs.f27118f);
            ArrayList arrayList = this.f25287b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(d40Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(d40Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(d40Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(d40Var);
    }

    public final void b(d40 d40Var) {
        this.d = false;
        d80 d80Var = this.f25289e;
        d80Var.f25625f0.l(d40Var.getUid());
        d40Var.setOnClickListener(null);
        AnimatorSet animatorSet = d80Var.f25623d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            d80Var.f25623d0.cancel();
        }
        this.f25286a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        d80Var.f25623d0 = animatorSet2;
        animatorSet2.addListener(new ai.z(27, this, d40Var));
        d80Var.f25623d0.setDuration(150L);
        this.f25288c = d40Var;
        ArrayList arrayList = this.f25287b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f25288c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f25288c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f25288c, View.ALPHA, 1.0f, 0.0f));
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
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.v1 v1Var;
        int i13;
        d80 d80Var = this.f25289e;
        org.telegram.ui.ActionBar.v1 v1Var2 = d80Var.V;
        ai.w0 w0Var = d80Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f25287b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof d40)) {
                v1Var = v1Var2;
            } else {
                v1Var = v1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f25288c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.q.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.q.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f25286a) {
                    d40 d40Var = this.f25288c;
                    if (childAt == d40Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i16);
                        childAt.setTranslationY(dp3);
                    } else if (d40Var != null) {
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
                if (childAt != this.f25288c) {
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
        if (d80Var.m0 != null) {
            if (d80Var.f25626g0) {
                b10 = Math.min(d80Var.f25637s0, dp6);
            } else {
                b10 = 0;
            }
        } else {
            b10 = org.telegram.messenger.q.b(52.0f, Math.min(d80Var.f25637s0, dp6), 0);
        }
        int i17 = d80Var.f25639u0;
        if (d80Var.m0 == null && d80Var.f25625f0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        d80Var.f25639u0 = i12;
        if (b10 != d80Var.f25633o0 || i17 != i12) {
            d80Var.f25633o0 = b10;
            if (w0Var.getAdapter() != null && w0Var.getAdapter().h() > 0 && (K = w0Var.K(0)) != null) {
                w0Var.getAdapter().m(0);
                d80Var.R.h1(0, K.f47658a.getTop() - w0Var.getPaddingTop());
                if (w0Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ai.l6(this, 8));
                    ofFloat.setDuration(w0Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(d80Var.f25637s0, dp6);
        int i18 = d80Var.f25630k0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new m6(this, 29));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > d80Var.f25637s0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final c80 f24624b;

                {
                    this.f24624b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            d80 d80Var2 = this.f24624b.f25289e;
                            d80Var2.V.smoothScrollTo(0, dp6 - d80Var2.f25637s0);
                            return;
                        default:
                            d80 d80Var3 = this.f24624b.f25289e;
                            d80Var3.V.smoothScrollTo(0, dp6 - d80Var3.f25637s0);
                            return;
                    }
                }
            });
        } else if (!z10 && v1Var3.getMeasuredHeight() + v1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final c80 f24624b;

                {
                    this.f24624b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            d80 d80Var2 = this.f24624b.f25289e;
                            d80Var2.V.smoothScrollTo(0, dp6 - d80Var2.f25637s0);
                            return;
                        default:
                            d80 d80Var3 = this.f24624b.f25289e;
                            d80Var3.V.smoothScrollTo(0, dp6 - d80Var3.f25637s0);
                            return;
                    }
                }
            });
        }
        if (!this.f25286a && (animatorSet = d80Var.f25623d0) != null) {
            animatorSet.playTogether(arrayList);
            d80Var.f25623d0.addListener(new b80(this, 0));
            d80Var.f25623d0.start();
            this.f25286a = true;
        }
        if (d80Var.f25623d0 == null) {
            d80Var.f25630k0 = min;
            viewGroup = ((org.telegram.ui.ActionBar.f3) d80Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        w0Var.setTranslationY(0.0f);
    }
}
