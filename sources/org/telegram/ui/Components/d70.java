package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class d70 extends ViewGroup {
    public boolean f26204a;
    public final ArrayList f26205b;
    public p30 f26206c;
    public boolean d;
    public final e70 f26207e;

    public d70(e70 e70Var, Context context) {
        super(context);
        this.f26207e = e70Var;
        this.f26205b = new ArrayList();
    }

    public final void a(p30 p30Var, boolean z4) {
        this.d = true;
        e70 e70Var = this.f26207e;
        e70Var.f26458c0.k(p30Var, p30Var.getUid());
        AnimatorSet animatorSet = e70Var.f26456a0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            e70Var.f26456a0.cancel();
        }
        this.f26204a = false;
        if (z4) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            e70Var.f26456a0 = animatorSet2;
            animatorSet2.addListener(new c70(this, 1));
            e70Var.f26456a0.setDuration(150L);
            e70Var.f26456a0.setInterpolator(pr.f30183f);
            ArrayList arrayList = this.f26205b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(p30Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(p30Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(p30Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(p30Var);
    }

    public final void b(p30 p30Var) {
        this.d = false;
        e70 e70Var = this.f26207e;
        e70Var.f26458c0.l(p30Var.getUid());
        p30Var.setOnClickListener(null);
        AnimatorSet animatorSet = e70Var.f26456a0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            e70Var.f26456a0.cancel();
        }
        this.f26204a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        e70Var.f26456a0 = animatorSet2;
        animatorSet2.addListener(new eg.w2(24, this, p30Var));
        e70Var.f26456a0.setDuration(150L);
        this.f26206c = p30Var;
        ArrayList arrayList = this.f26205b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f26206c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f26206c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f26206c, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        int c3;
        int i12;
        f2.m1 K;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.x1 x1Var;
        int i13;
        e70 e70Var = this.f26207e;
        org.telegram.ui.ActionBar.x1 x1Var2 = e70Var.S;
        mh.d1 d1Var = e70Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f26205b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof p30)) {
                x1Var = x1Var2;
            } else {
                x1Var = x1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f26206c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.y3.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.y3.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f26204a) {
                    p30 p30Var = this.f26206c;
                    if (childAt == p30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i16);
                        childAt.setTranslationY(dp3);
                    } else if (p30Var != null) {
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
                if (childAt != this.f26206c) {
                    i15 = org.telegram.messenger.y3.C(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.y3.C(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            x1Var2 = x1Var;
        }
        org.telegram.ui.ActionBar.x1 x1Var3 = x1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        if (e70Var.f26465j0 != null) {
            if (e70Var.f26459d0) {
                c3 = Math.min(e70Var.f26470p0, dp6);
            } else {
                c3 = 0;
            }
        } else {
            c3 = l.d.c(52.0f, Math.min(e70Var.f26470p0, dp6), 0);
        }
        int i17 = e70Var.f26472r0;
        if (e70Var.f26465j0 == null && e70Var.f26458c0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        e70Var.f26472r0 = i12;
        if (c3 != e70Var.f26467l0 || i17 != i12) {
            e70Var.f26467l0 = c3;
            if (d1Var.getAdapter() != null && d1Var.getAdapter().h() > 0 && (K = d1Var.K(0)) != null) {
                d1Var.getAdapter().m(0);
                e70Var.O.h1(0, K.f5875a.getTop() - d1Var.getPaddingTop());
                if (d1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new f2.d0(this, 6));
                    ofFloat.setDuration(d1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(e70Var.f26470p0, dp6);
        int i18 = e70Var.f26463h0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new f6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z4 = this.d;
        if (z4 && dp6 > e70Var.f26470p0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final d70 f25509b;

                {
                    this.f25509b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            e70 e70Var2 = this.f25509b.f26207e;
                            e70Var2.S.smoothScrollTo(0, dp6 - e70Var2.f26470p0);
                            return;
                        default:
                            e70 e70Var3 = this.f25509b.f26207e;
                            e70Var3.S.smoothScrollTo(0, dp6 - e70Var3.f26470p0);
                            return;
                    }
                }
            });
        } else if (!z4 && x1Var3.getMeasuredHeight() + x1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final d70 f25509b;

                {
                    this.f25509b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            e70 e70Var2 = this.f25509b.f26207e;
                            e70Var2.S.smoothScrollTo(0, dp6 - e70Var2.f26470p0);
                            return;
                        default:
                            e70 e70Var3 = this.f25509b.f26207e;
                            e70Var3.S.smoothScrollTo(0, dp6 - e70Var3.f26470p0);
                            return;
                    }
                }
            });
        }
        if (!this.f26204a && (animatorSet = e70Var.f26456a0) != null) {
            animatorSet.playTogether(arrayList);
            e70Var.f26456a0.addListener(new c70(this, 0));
            e70Var.f26456a0.start();
            this.f26204a = true;
        }
        if (e70Var.f26456a0 == null) {
            e70Var.f26463h0 = min;
            viewGroup = ((org.telegram.ui.ActionBar.h3) e70Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        d1Var.setTranslationY(0.0f);
    }
}
