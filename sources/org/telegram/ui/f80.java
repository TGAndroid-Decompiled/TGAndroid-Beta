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
public final class f80 extends ViewGroup {
    public AnimatorSet f33574a;
    public boolean f33575b;
    public final ArrayList f33576c;
    public org.telegram.ui.Components.o30 d;
    public org.telegram.ui.Components.o30 e;
    public int f33577f;
    public final g80 h;

    public f80(g80 g80Var, Context context) {
        super(context);
        this.h = g80Var;
        this.f33576c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.o30 o30Var) {
        g80 g80Var = this.h;
        g80Var.v = true;
        g80Var.F.remove(o30Var.getKey());
        g80Var.G.remove(o30Var);
        o30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f33574a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f33574a.setupEndValues();
            this.f33574a.cancel();
        }
        this.f33575b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33574a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.bl0(7, this, o30Var));
        this.f33574a.setInterpolator(org.telegram.ui.Components.sr.h);
        this.f33574a.setDuration(320L);
        this.e = o30Var;
        ArrayList arrayList = this.f33576c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.e, View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, View.ALPHA, 1.0f, 0.0f));
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
        boolean z10;
        int A;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        int max;
        int i15;
        float f7;
        float f10;
        float f11;
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
            arrayList = this.f33576c;
            z10 = true;
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
                if (!this.f33575b) {
                    org.telegram.ui.Components.o30 o30Var = this.e;
                    if (childAt == o30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(5.0f) + i19);
                        childAt.setTranslationY(dp3);
                    } else if (o30Var != null) {
                        float f12 = dp4;
                        if (childAt.getTranslationX() != f12) {
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, f12));
                        }
                        float f13 = dp2;
                        if (childAt.getTranslationY() != f13) {
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, f13));
                        }
                        i17 = Math.max(i17, dp2);
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        i17 = Math.max(i17, dp2);
                    }
                }
                if (childAt != this.e) {
                    i18 = org.telegram.messenger.f0.C(9.0f, childAt.getMeasuredWidth(), i18);
                }
                i19 = org.telegram.messenger.f0.C(9.0f, childAt.getMeasuredWidth(), i19);
            }
            i16++;
        }
        if (AndroidUtilities.isTablet()) {
            A = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            A = org.telegram.messenger.ok.A(158.0f, Math.min(point.x, point.y), 3);
        }
        if (i17 > 0) {
            i12 = AndroidUtilities.dp(34.0f) + i17;
        } else {
            i12 = 0;
        }
        g80 g80Var = this.h;
        if (i12 > g80Var.f33856x - AndroidUtilities.dp(12.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (dp - i18 < A && !z11) {
            dp2 += AndroidUtilities.dp(34.0f);
            i17 = Math.max(i17, dp2);
            i18 = 0;
        }
        if (i17 > 0) {
            i13 = AndroidUtilities.dp(34.0f) + i17;
        } else {
            i13 = 0;
        }
        if (i13 > g80Var.f33856x - AndroidUtilities.dp(12.0f)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!this.f33575b) {
            int dp5 = AndroidUtilities.dp(28.0f) + dp3;
            g80Var.I = dp2;
            if (this.f33574a != null) {
                this.f33577f = AndroidUtilities.dp(28.0f) + dp2;
                this.f33574a.playTogether(arrayList);
                this.f33574a.start();
                this.f33575b = true;
            } else {
                this.f33577f = dp5;
            }
        }
        if (z12) {
            max = g80Var.f33856x - AndroidUtilities.dp(12.0f);
        } else {
            int dp6 = AndroidUtilities.dp(37.0f);
            if (i17 > 0) {
                i14 = AndroidUtilities.dp(31.0f) + i17;
            } else {
                i14 = 0;
            }
            max = Math.max(dp6, Math.min(i14, g80Var.f33856x - AndroidUtilities.dp(12.0f)));
        }
        g80Var.f33849b.a(max);
        e80 e80Var = g80Var.d;
        if (e80Var != null) {
            if (this.e != null) {
                i15 = 1;
            } else {
                i15 = 0;
            }
            int max2 = Math.max(0, childCount - i15);
            float b10 = org.telegram.messenger.f0.b(6.0f, i17, 0);
            float f14 = i18;
            if (max2 > 0) {
                z10 = false;
            }
            ViewPropertyAnimator animate = e80Var.f33297c.animate();
            float f15 = 0.0f;
            float f16 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!z10) {
                f16 = 0.5f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f16);
            org.telegram.ui.Components.sr srVar = org.telegram.ui.Components.sr.h;
            org.telegram.messenger.ok.s(scaleY, srVar, 320L);
            ViewPropertyAnimator animate2 = e80Var.d.animate();
            if (z12) {
                f11 = ((e80Var.getHeight() - e80Var.getPaddingTop()) - e80Var.getPaddingBottom()) - AndroidUtilities.dp(44.0f);
            } else {
                f11 = b10;
            }
            ViewPropertyAnimator translationY = animate2.translationY(f11);
            if (z12) {
                f15 = AndroidUtilities.dp(-36.0f);
            } else if (max2 > 0) {
                f15 = Math.max(-AndroidUtilities.dp(36.0f), f14 - AndroidUtilities.dp(46.0f));
            }
            translationY.translationX(f15).setInterpolator(srVar).setDuration(320L).start();
            e80Var.f33298f.e.post(new c0(e80Var, b10, 3));
        }
        setMeasuredDimension(size, this.f33577f);
    }
}
