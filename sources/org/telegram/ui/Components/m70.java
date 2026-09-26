package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class m70 extends ViewGroup {
    public boolean f26326a;
    public final ArrayList f26327b;
    public o30 f26328c;
    public boolean d;
    public final n70 e;

    public m70(n70 n70Var, Context context) {
        super(context);
        this.e = n70Var;
        this.f26327b = new ArrayList();
    }

    public final void a(o30 o30Var, boolean z10) {
        this.d = true;
        n70 n70Var = this.e;
        n70Var.f26693f0.k(o30Var, o30Var.getUid());
        AnimatorSet animatorSet = n70Var.f26691d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            n70Var.f26691d0.cancel();
        }
        this.f26326a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            n70Var.f26691d0 = animatorSet2;
            animatorSet2.addListener(new l70(this, 1));
            n70Var.f26691d0.setDuration(150L);
            n70Var.f26691d0.setInterpolator(sr.f28339f);
            ArrayList arrayList = this.f26327b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(o30Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(o30Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(o30Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(o30Var);
    }

    public final void b(o30 o30Var) {
        this.d = false;
        n70 n70Var = this.e;
        n70Var.f26693f0.l(o30Var.getUid());
        o30Var.setOnClickListener(null);
        AnimatorSet animatorSet = n70Var.f26691d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            n70Var.f26691d0.cancel();
        }
        this.f26326a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        n70Var.f26691d0 = animatorSet2;
        animatorSet2.addListener(new ai.z(27, this, o30Var));
        n70Var.f26691d0.setDuration(150L);
        this.f26328c = o30Var;
        ArrayList arrayList = this.f26327b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f26328c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f26328c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f26328c, View.ALPHA, 1.0f, 0.0f));
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
        s4.c1 K;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.u1 u1Var;
        int i13;
        n70 n70Var = this.e;
        org.telegram.ui.ActionBar.u1 u1Var2 = n70Var.V;
        ai.w0 w0Var = n70Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f26327b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof o30)) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f26328c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.f0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.f0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f26326a) {
                    o30 o30Var = this.f26328c;
                    if (childAt == o30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i16);
                        childAt.setTranslationY(dp3);
                    } else if (o30Var != null) {
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
                if (childAt != this.f26328c) {
                    i15 = org.telegram.messenger.f0.C(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.f0.C(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            u1Var2 = u1Var;
        }
        org.telegram.ui.ActionBar.u1 u1Var3 = u1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        if (n70Var.m0 != null) {
            if (n70Var.f26694g0) {
                b10 = Math.min(n70Var.f26705s0, dp6);
            } else {
                b10 = 0;
            }
        } else {
            b10 = org.telegram.messenger.f0.b(52.0f, Math.min(n70Var.f26705s0, dp6), 0);
        }
        int i17 = n70Var.f26707u0;
        if (n70Var.m0 == null && n70Var.f26693f0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        n70Var.f26707u0 = i12;
        if (b10 != n70Var.f26701o0 || i17 != i12) {
            n70Var.f26701o0 = b10;
            if (w0Var.getAdapter() != null && w0Var.getAdapter().h() > 0 && (K = w0Var.K(0)) != null) {
                w0Var.getAdapter().m(0);
                n70Var.R.h1(0, K.f42959a.getTop() - w0Var.getPaddingTop());
                if (w0Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ai.k6(this, 8));
                    ofFloat.setDuration(w0Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(n70Var.f26705s0, dp6);
        int i18 = n70Var.f26698k0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new k6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > n70Var.f26705s0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final m70 f25652b;

                {
                    this.f25652b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            n70 n70Var2 = this.f25652b.e;
                            n70Var2.V.smoothScrollTo(0, dp6 - n70Var2.f26705s0);
                            return;
                        default:
                            n70 n70Var3 = this.f25652b.e;
                            n70Var3.V.smoothScrollTo(0, dp6 - n70Var3.f26705s0);
                            return;
                    }
                }
            });
        } else if (!z10 && u1Var3.getMeasuredHeight() + u1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final m70 f25652b;

                {
                    this.f25652b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            n70 n70Var2 = this.f25652b.e;
                            n70Var2.V.smoothScrollTo(0, dp6 - n70Var2.f26705s0);
                            return;
                        default:
                            n70 n70Var3 = this.f25652b.e;
                            n70Var3.V.smoothScrollTo(0, dp6 - n70Var3.f26705s0);
                            return;
                    }
                }
            });
        }
        if (!this.f26326a && (animatorSet = n70Var.f26691d0) != null) {
            animatorSet.playTogether(arrayList);
            n70Var.f26691d0.addListener(new l70(this, 0));
            n70Var.f26691d0.start();
            this.f26326a = true;
        }
        if (n70Var.f26691d0 == null) {
            n70Var.f26698k0 = min;
            viewGroup = ((org.telegram.ui.ActionBar.e3) n70Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        w0Var.setTranslationY(0.0f);
    }
}
