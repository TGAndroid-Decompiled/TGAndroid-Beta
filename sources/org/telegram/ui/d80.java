package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class d80 extends ViewGroup {
    public AnimatorSet f33368a;
    public boolean f33369b;
    public final ArrayList f33370c;
    public org.telegram.ui.Components.o30 d;
    public org.telegram.ui.Components.o30 e;
    public int f33371f;
    public final e80 h;

    public d80(e80 e80Var, Context context) {
        super(context);
        this.h = e80Var;
        this.f33370c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.o30 o30Var) {
        e80 e80Var = this.h;
        e80Var.v = true;
        e80Var.C.remove(o30Var.getKey());
        e80Var.D.remove(o30Var);
        o30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f33368a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f33368a.setupEndValues();
            this.f33368a.cancel();
        }
        this.f33369b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33368a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.ex0(4, this, o30Var));
        this.f33368a.setInterpolator(org.telegram.ui.Components.mr.h);
        this.f33368a.setDuration(320L);
        this.e = o30Var;
        ArrayList arrayList = this.f33370c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.e, View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, View.ALPHA, 1.0f, 0.0f));
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
        boolean z4;
        int x10;
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        int max;
        int i15;
        float f10;
        float f11;
        float f12;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(6.0f);
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            arrayList = this.f33370c;
            z4 = true;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Components.o30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                if (childAt != this.e && childAt.getMeasuredWidth() + i18 > dp) {
                    dp2 += AndroidUtilities.dp(34.0f);
                    i18 = 0;
                }
                if (childAt.getMeasuredWidth() + i19 > dp) {
                    dp3 += AndroidUtilities.dp(34.0f);
                    i19 = 0;
                }
                int dp4 = AndroidUtilities.dp(5.0f) + i18;
                if (!this.f33369b) {
                    org.telegram.ui.Components.o30 o30Var = this.e;
                    if (childAt == o30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(5.0f) + i19);
                        childAt.setTranslationY(dp3);
                    } else if (o30Var != null) {
                        float f13 = dp4;
                        if (childAt.getTranslationX() != f13) {
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, f13));
                        }
                        float f14 = dp2;
                        if (childAt.getTranslationY() != f14) {
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, f14));
                        }
                        i17 = Math.max(i17, dp2);
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        i17 = Math.max(i17, dp2);
                    }
                }
                if (childAt != this.e) {
                    i18 = org.telegram.messenger.y3.C(9.0f, childAt.getMeasuredWidth(), i18);
                }
                i19 = org.telegram.messenger.y3.C(9.0f, childAt.getMeasuredWidth(), i19);
            }
            i16++;
        }
        if (AndroidUtilities.isTablet()) {
            x10 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            x10 = b.x(158.0f, Math.min(point.x, point.y), 3);
        }
        if (i17 > 0) {
            i12 = AndroidUtilities.dp(34.0f) + i17;
        } else {
            i12 = 0;
        }
        e80 e80Var = this.h;
        if (i12 > e80Var.f33741x - AndroidUtilities.dp(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (dp - i18 < x10 && !z10) {
            dp2 += AndroidUtilities.dp(34.0f);
            i17 = Math.max(i17, dp2);
            i18 = 0;
        }
        if (i17 > 0) {
            i13 = AndroidUtilities.dp(34.0f) + i17;
        } else {
            i13 = 0;
        }
        if (i13 > e80Var.f33741x - AndroidUtilities.dp(12.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!this.f33369b) {
            int dp5 = AndroidUtilities.dp(28.0f) + dp3;
            e80Var.F = dp2;
            if (this.f33368a != null) {
                this.f33371f = AndroidUtilities.dp(28.0f) + dp2;
                this.f33368a.playTogether(arrayList);
                this.f33368a.start();
                this.f33369b = true;
            } else {
                this.f33371f = dp5;
            }
        }
        if (z11) {
            max = e80Var.f33741x - AndroidUtilities.dp(12.0f);
        } else {
            int dp6 = AndroidUtilities.dp(37.0f);
            if (i17 > 0) {
                i14 = AndroidUtilities.dp(31.0f) + i17;
            } else {
                i14 = 0;
            }
            max = Math.max(dp6, Math.min(i14, e80Var.f33741x - AndroidUtilities.dp(12.0f)));
        }
        e80Var.f33734b.a(max);
        c80 c80Var = e80Var.d;
        if (c80Var != null) {
            if (this.e != null) {
                i15 = 1;
            } else {
                i15 = 0;
            }
            int max2 = Math.max(0, childCount - i15);
            float c3 = kf.k0.c(6.0f, i17, 0);
            float f15 = i18;
            if (max2 > 0) {
                z4 = false;
            }
            ViewPropertyAnimator animate = c80Var.f33041c.animate();
            float f16 = 0.0f;
            float f17 = 1.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!z4) {
                f17 = 0.5f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f17);
            org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
            b.p(scaleY, mrVar, 320L);
            ViewPropertyAnimator animate2 = c80Var.d.animate();
            if (z11) {
                f12 = ((c80Var.getHeight() - c80Var.getPaddingTop()) - c80Var.getPaddingBottom()) - AndroidUtilities.dp(44.0f);
            } else {
                f12 = c3;
            }
            ViewPropertyAnimator translationY = animate2.translationY(f12);
            if (z11) {
                f16 = AndroidUtilities.dp(-36.0f);
            } else if (max2 > 0) {
                f16 = Math.max(-AndroidUtilities.dp(36.0f), f15 - AndroidUtilities.dp(46.0f));
            }
            translationY.translationX(f16).setInterpolator(mrVar).setDuration(320L).start();
            c80Var.f33042f.e.post(new e0(c80Var, c3, 3));
        }
        setMeasuredDimension(size, this.f33371f);
    }
}
