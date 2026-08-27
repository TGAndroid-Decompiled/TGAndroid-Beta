package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class o60 extends ViewGroup {

    public boolean f31173a;

    public final ArrayList f31174b;

    public a30 f31175c;
    public boolean d;

    public final p60 f31176e;

    public o60(p60 p60Var, Context context) {
        super(context);
        this.f31176e = p60Var;
        this.f31174b = new ArrayList();
    }

    public final void a(a30 a30Var, boolean z10) {
        this.d = true;
        p60 p60Var = this.f31176e;
        p60Var.f31515b0.k(a30Var, a30Var.getUid());
        AnimatorSet animatorSet = p60Var.Z;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            p60Var.Z.cancel();
        }
        this.f31173a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            p60Var.Z = animatorSet2;
            animatorSet2.addListener(new n60(this, 1));
            p60Var.Z.setDuration(150L);
            p60Var.Z.setInterpolator(er.f28122f);
            ArrayList arrayList = this.f31174b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(a30Var);
    }

    public final void b(a30 a30Var) {
        this.d = false;
        p60 p60Var = this.f31176e;
        p60Var.f31515b0.l(a30Var.getUid());
        a30Var.setOnClickListener(null);
        AnimatorSet animatorSet = p60Var.Z;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            p60Var.Z.cancel();
        }
        this.f31173a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        p60Var.Z = animatorSet2;
        animatorSet2.addListener(new ag.x1(27, this, a30Var));
        p60Var.Z.setDuration(150L);
        this.f31175c = a30Var;
        ArrayList arrayList = this.f31174b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f31175c, (Property<a30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f31175c, (Property<a30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f31175c, (Property<a30, Float>) View.ALPHA, 1.0f, 0.0f));
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
        int iD;
        f2.o1 o1VarK;
        AnimatorSet animatorSet;
        int i12;
        p60 p60Var = this.f31176e;
        org.telegram.ui.ActionBar.v1 v1Var = p60Var.R;
        hh.f1 f1Var = p60Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int iDp = size - AndroidUtilities.dp(26.0f);
        int iDp2 = AndroidUtilities.dp(10.0f);
        int iDp3 = AndroidUtilities.dp(10.0f);
        int i13 = 0;
        int iC = 0;
        int iC2 = 0;
        while (true) {
            arrayList = this.f31174b;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof a30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f31175c && childAt.getMeasuredWidth() + iC > iDp) {
                    iDp2 = org.telegram.messenger.y1.C(8.0f, childAt.getMeasuredHeight(), iDp2);
                    iC = 0;
                }
                if (childAt.getMeasuredWidth() + iC2 > iDp) {
                    iDp3 = org.telegram.messenger.y1.C(8.0f, childAt.getMeasuredHeight(), iDp3);
                    iC2 = 0;
                }
                int iDp4 = AndroidUtilities.dp(13.0f) + iC;
                if (!this.f31173a) {
                    a30 a30Var = this.f31175c;
                    if (childAt == a30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + iC2);
                        childAt.setTranslationY(iDp3);
                    } else if (a30Var != null) {
                        float f10 = iDp4;
                        if (childAt.getTranslationX() != f10) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f10));
                        } else {
                            i12 = 1;
                        }
                        float f11 = iDp2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr = new float[i12];
                            fArr[0] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(iDp4);
                        childAt.setTranslationY(iDp2);
                    }
                }
                if (childAt != this.f31175c) {
                    iC = org.telegram.messenger.y1.C(9.0f, childAt.getMeasuredWidth(), iC);
                }
                iC2 = org.telegram.messenger.y1.C(9.0f, childAt.getMeasuredWidth(), iC2);
            }
            i13++;
            v1Var = v1Var;
        }
        org.telegram.ui.ActionBar.v1 v1Var2 = v1Var;
        int iDp5 = AndroidUtilities.dp(42.0f) + iDp3;
        final int iDp6 = AndroidUtilities.dp(42.0f) + iDp2;
        if (p60Var.f31522i0 != null) {
            iD = p60Var.f31516c0 ? Math.min(p60Var.f31527o0, iDp6) : 0;
        } else {
            iD = i0.a.d(52.0f, Math.min(p60Var.f31527o0, iDp6), 0);
        }
        int i14 = p60Var.f31529q0;
        int iDp7 = (p60Var.f31522i0 != null || p60Var.f31515b0.m() <= 0) ? 0 : AndroidUtilities.dp(56.0f);
        p60Var.f31529q0 = iDp7;
        if (iD != p60Var.f31524k0 || i14 != iDp7) {
            p60Var.f31524k0 = iD;
            if (f1Var.getAdapter() != null && f1Var.getAdapter().h() > 0 && (o1VarK = f1Var.K(0)) != null) {
                f1Var.getAdapter().m(0);
                p60Var.N.h1(0, o1VarK.f5789a.getTop() - f1Var.getPaddingTop());
                if (f1Var.getItemAnimator() != null) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ag.q1(this, 8));
                    valueAnimatorOfFloat.setDuration(f1Var.getItemAnimator().i()).start();
                }
            }
        }
        int iMin = Math.min(p60Var.f31527o0, iDp6);
        int i15 = p60Var.f31520g0;
        if (i15 != iMin) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i15, iMin);
            valueAnimatorOfInt.addUpdateListener(new e6(this, 28));
            arrayList.add(valueAnimatorOfInt);
        }
        boolean z10 = this.d;
        if (z10 && iDp6 > p60Var.f31527o0) {
            final int i16 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) {

                public final o60 f30585b;

                {
                    this.f30585b = this;
                }

                @Override
                public final void run() {
                    switch (i16) {
                        case 0:
                            p60 p60Var2 = this.f30585b.f31176e;
                            p60Var2.R.smoothScrollTo(0, iDp6 - p60Var2.f31527o0);
                            break;
                        default:
                            p60 p60Var3 = this.f30585b.f31176e;
                            p60Var3.R.smoothScrollTo(0, iDp6 - p60Var3.f31527o0);
                            break;
                    }
                }
            });
        } else if (!z10 && v1Var2.getMeasuredHeight() + v1Var2.getScrollY() > iDp6) {
            final int i17 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(this) {

                public final o60 f30585b;

                {
                    this.f30585b = this;
                }

                @Override
                public final void run() {
                    switch (i17) {
                        case 0:
                            p60 p60Var2 = this.f30585b.f31176e;
                            p60Var2.R.smoothScrollTo(0, iDp6 - p60Var2.f31527o0);
                            break;
                        default:
                            p60 p60Var3 = this.f30585b.f31176e;
                            p60Var3.R.smoothScrollTo(0, iDp6 - p60Var3.f31527o0);
                            break;
                    }
                }
            });
        }
        if (!this.f31173a && (animatorSet = p60Var.Z) != null) {
            animatorSet.playTogether(arrayList);
            p60Var.Z.addListener(new n60(this, 0));
            p60Var.Z.start();
            this.f31173a = true;
        }
        if (p60Var.Z == null) {
            p60Var.f31520g0 = iMin;
            ((org.telegram.ui.ActionBar.e3) p60Var).containerView.invalidate();
        }
        setMeasuredDimension(size, Math.max(iDp6, iDp5));
        f1Var.setTranslationY(0.0f);
    }
}
