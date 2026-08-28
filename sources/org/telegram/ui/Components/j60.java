package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class j60 extends ViewGroup {
    public boolean f29652a;
    public final ArrayList f29653b;
    public w20 f29654c;
    public boolean d;
    public final k60 f29655e;

    public j60(k60 k60Var, Context context) {
        super(context);
        this.f29655e = k60Var;
        this.f29653b = new ArrayList();
    }

    public final void a(w20 w20Var, boolean z10) {
        this.d = true;
        k60 k60Var = this.f29655e;
        k60Var.f29975b0.k(w20Var, w20Var.getUid());
        AnimatorSet animatorSet = k60Var.Z;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            k60Var.Z.cancel();
        }
        this.f29652a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            k60Var.Z = animatorSet2;
            animatorSet2.addListener(new i60(this, 1));
            k60Var.Z.setDuration(150L);
            k60Var.Z.setInterpolator(gr.f28844f);
            ArrayList arrayList = this.f29653b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(w20Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(w20Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(w20Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(w20Var);
    }

    public final void b(w20 w20Var) {
        this.d = false;
        k60 k60Var = this.f29655e;
        k60Var.f29975b0.l(w20Var.getUid());
        w20Var.setOnClickListener(null);
        AnimatorSet animatorSet = k60Var.Z;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            k60Var.Z.cancel();
        }
        this.f29652a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        k60Var.Z = animatorSet2;
        animatorSet2.addListener(new fg.j(25, this, w20Var));
        k60Var.Z.setDuration(150L);
        this.f29654c = w20Var;
        ArrayList arrayList = this.f29653b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f29654c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f29654c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f29654c, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        ArrayList arrayList;
        int b10;
        int i11;
        f2.q1 K;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.w1 w1Var;
        int i12;
        k60 k60Var = this.f29655e;
        org.telegram.ui.ActionBar.w1 w1Var2 = k60Var.R;
        gh.f1 f1Var = k60Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i9);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            arrayList = this.f29653b;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (!(childAt instanceof w20)) {
                w1Var = w1Var2;
            } else {
                w1Var = w1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f29654c && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 = org.telegram.messenger.l0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.l0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.f29652a) {
                    w20 w20Var = this.f29654c;
                    if (childAt == w20Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (w20Var != null) {
                        float f10 = dp4;
                        if (childAt.getTranslationX() != f10) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, f10));
                        } else {
                            i12 = 1;
                        }
                        float f11 = dp2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr = new float[i12];
                            fArr[0] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                    }
                }
                if (childAt != this.f29654c) {
                    i14 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i13++;
            w1Var2 = w1Var;
        }
        org.telegram.ui.ActionBar.w1 w1Var3 = w1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        if (k60Var.f29982i0 != null) {
            if (k60Var.f29976c0) {
                b10 = Math.min(k60Var.f29987o0, dp6);
            } else {
                b10 = 0;
            }
        } else {
            b10 = org.telegram.messenger.l0.b(52.0f, Math.min(k60Var.f29987o0, dp6), 0);
        }
        int i16 = k60Var.f29989q0;
        if (k60Var.f29982i0 == null && k60Var.f29975b0.m() > 0) {
            i11 = AndroidUtilities.dp(56.0f);
        } else {
            i11 = 0;
        }
        k60Var.f29989q0 = i11;
        if (b10 != k60Var.f29984k0 || i16 != i11) {
            k60Var.f29984k0 = b10;
            if (f1Var.getAdapter() != null && f1Var.getAdapter().h() > 0 && (K = f1Var.K(0)) != null) {
                f1Var.getAdapter().m(0);
                k60Var.N.h1(0, K.f5501a.getTop() - f1Var.getPaddingTop());
                if (f1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new f2.f0(this, 7));
                    ofFloat.setDuration(f1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(k60Var.f29987o0, dp6);
        int i17 = k60Var.f29980g0;
        if (i17 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i17, min);
            ofInt.addUpdateListener(new e6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > k60Var.f29987o0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final j60 f28983b;

                {
                    this.f28983b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            k60 k60Var2 = this.f28983b.f29655e;
                            k60Var2.R.smoothScrollTo(0, dp6 - k60Var2.f29987o0);
                            return;
                        default:
                            k60 k60Var3 = this.f28983b.f29655e;
                            k60Var3.R.smoothScrollTo(0, dp6 - k60Var3.f29987o0);
                            return;
                    }
                }
            });
        } else if (!z10 && w1Var3.getMeasuredHeight() + w1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final j60 f28983b;

                {
                    this.f28983b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            k60 k60Var2 = this.f28983b.f29655e;
                            k60Var2.R.smoothScrollTo(0, dp6 - k60Var2.f29987o0);
                            return;
                        default:
                            k60 k60Var3 = this.f28983b.f29655e;
                            k60Var3.R.smoothScrollTo(0, dp6 - k60Var3.f29987o0);
                            return;
                    }
                }
            });
        }
        if (!this.f29652a && (animatorSet = k60Var.Z) != null) {
            animatorSet.playTogether(arrayList);
            k60Var.Z.addListener(new i60(this, 0));
            k60Var.Z.start();
            this.f29652a = true;
        }
        if (k60Var.Z == null) {
            k60Var.f29980g0 = min;
            viewGroup = ((org.telegram.ui.ActionBar.f3) k60Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        f1Var.setTranslationY(0.0f);
    }
}
