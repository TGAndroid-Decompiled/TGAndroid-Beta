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
public final class i80 extends ViewGroup {
    public AnimatorSet f34388a;
    public boolean f34389b;
    public final ArrayList f34390c;
    public org.telegram.ui.Components.p30 d;
    public org.telegram.ui.Components.p30 e;
    public int f34391f;
    public final j80 h;

    public i80(j80 j80Var, Context context) {
        super(context);
        this.h = j80Var;
        this.f34390c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.p30 p30Var) {
        j80 j80Var = this.h;
        j80Var.v = true;
        j80Var.F.remove(p30Var.getKey());
        j80Var.G.remove(p30Var);
        p30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f34388a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f34388a.setupEndValues();
            this.f34388a.cancel();
        }
        this.f34389b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f34388a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.cl0(7, this, p30Var));
        this.f34388a.setInterpolator(org.telegram.ui.Components.sr.h);
        this.f34388a.setDuration(320L);
        this.e = p30Var;
        ArrayList arrayList = this.f34390c;
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
        int z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
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
            arrayList = this.f34390c;
            z10 = true;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Components.p30) {
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
                if (!this.f34389b) {
                    org.telegram.ui.Components.p30 p30Var = this.e;
                    if (childAt == p30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(5.0f) + i19);
                        childAt.setTranslationY(dp3);
                    } else if (p30Var != null) {
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
                    i18 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i18);
                }
                i19 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i19);
            }
            i16++;
        }
        if (AndroidUtilities.isTablet()) {
            z11 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            z11 = org.telegram.messenger.qk.z(158.0f, Math.min(point.x, point.y), 3);
        }
        if (i17 > 0) {
            i12 = AndroidUtilities.dp(34.0f) + i17;
        } else {
            i12 = 0;
        }
        j80 j80Var = this.h;
        if (i12 > j80Var.f34666x - AndroidUtilities.dp(12.0f)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (dp - i18 < z11 && !z12) {
            dp2 += AndroidUtilities.dp(34.0f);
            i17 = Math.max(i17, dp2);
            i18 = 0;
        }
        if (i17 > 0) {
            i13 = AndroidUtilities.dp(34.0f) + i17;
        } else {
            i13 = 0;
        }
        if (i13 > j80Var.f34666x - AndroidUtilities.dp(12.0f)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!this.f34389b) {
            int dp5 = AndroidUtilities.dp(28.0f) + dp3;
            j80Var.I = dp2;
            if (this.f34388a != null) {
                this.f34391f = AndroidUtilities.dp(28.0f) + dp2;
                this.f34388a.playTogether(arrayList);
                this.f34388a.start();
                this.f34389b = true;
            } else {
                this.f34391f = dp5;
            }
        }
        if (z13) {
            max = j80Var.f34666x - AndroidUtilities.dp(12.0f);
        } else {
            int dp6 = AndroidUtilities.dp(37.0f);
            if (i17 > 0) {
                i14 = AndroidUtilities.dp(31.0f) + i17;
            } else {
                i14 = 0;
            }
            max = Math.max(dp6, Math.min(i14, j80Var.f34666x - AndroidUtilities.dp(12.0f)));
        }
        j80Var.f34659b.a(max);
        h80 h80Var = j80Var.d;
        if (h80Var != null) {
            if (this.e != null) {
                i15 = 1;
            } else {
                i15 = 0;
            }
            int max2 = Math.max(0, childCount - i15);
            float b10 = org.telegram.messenger.l0.b(6.0f, i17, 0);
            float f14 = i18;
            if (max2 > 0) {
                z10 = false;
            }
            ViewPropertyAnimator animate = h80Var.f34162c.animate();
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
            org.telegram.messenger.qk.s(scaleY, srVar, 320L);
            ViewPropertyAnimator animate2 = h80Var.d.animate();
            if (z13) {
                f11 = ((h80Var.getHeight() - h80Var.getPaddingTop()) - h80Var.getPaddingBottom()) - AndroidUtilities.dp(44.0f);
            } else {
                f11 = b10;
            }
            ViewPropertyAnimator translationY = animate2.translationY(f11);
            if (z13) {
                f15 = AndroidUtilities.dp(-36.0f);
            } else if (max2 > 0) {
                f15 = Math.max(-AndroidUtilities.dp(36.0f), f14 - AndroidUtilities.dp(46.0f));
            }
            translationY.translationX(f15).setInterpolator(srVar).setDuration(320L).start();
            h80Var.f34163f.e.post(new d0(h80Var, b10, 3));
        }
        setMeasuredDimension(size, this.f34391f);
    }
}
