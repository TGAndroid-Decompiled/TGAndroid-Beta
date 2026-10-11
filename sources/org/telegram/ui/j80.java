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
public final class j80 extends ViewGroup {
    public AnimatorSet f38971a;
    public boolean f38972b;
    public final ArrayList f38973c;
    public org.telegram.ui.Components.e40 d;
    public org.telegram.ui.Components.e40 f38974e;
    public int f38975f;
    public final k80 h;

    public j80(k80 k80Var, Context context) {
        super(context);
        this.h = k80Var;
        this.f38973c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.e40 e40Var) {
        k80 k80Var = this.h;
        k80Var.v = true;
        k80Var.F.remove(e40Var.getKey());
        k80Var.G.remove(e40Var);
        e40Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f38971a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f38971a.setupEndValues();
            this.f38971a.cancel();
        }
        this.f38972b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f38971a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.vl0(7, this, e40Var));
        this.f38971a.setInterpolator(org.telegram.ui.Components.is.h);
        this.f38971a.setDuration(320L);
        this.f38974e = e40Var;
        ArrayList arrayList = this.f38973c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f38974e, View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.f38974e, View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.f38974e, View.ALPHA, 1.0f, 0.0f));
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
            arrayList = this.f38973c;
            z10 = true;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Components.e40) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                if (childAt != this.f38974e && childAt.getMeasuredWidth() + i18 > dp) {
                    dp2 += AndroidUtilities.dp(34.0f);
                    i18 = 0;
                }
                if (childAt.getMeasuredWidth() + i19 > dp) {
                    dp3 += AndroidUtilities.dp(34.0f);
                    i19 = 0;
                }
                int dp4 = AndroidUtilities.dp(5.0f) + i18;
                if (!this.f38972b) {
                    org.telegram.ui.Components.e40 e40Var = this.f38974e;
                    if (childAt == e40Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(5.0f) + i19);
                        childAt.setTranslationY(dp3);
                    } else if (e40Var != null) {
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
                if (childAt != this.f38974e) {
                    i18 = org.telegram.messenger.q.C(9.0f, childAt.getMeasuredWidth(), i18);
                }
                i19 = org.telegram.messenger.q.C(9.0f, childAt.getMeasuredWidth(), i19);
            }
            i16++;
        }
        if (AndroidUtilities.isTablet()) {
            A = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            A = org.telegram.messenger.ai.A(158.0f, Math.min(point.x, point.y), 3);
        }
        if (i17 > 0) {
            i12 = AndroidUtilities.dp(34.0f) + i17;
        } else {
            i12 = 0;
        }
        k80 k80Var = this.h;
        if (i12 > k80Var.f39265x - AndroidUtilities.dp(12.0f)) {
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
        if (i13 > k80Var.f39265x - AndroidUtilities.dp(12.0f)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!this.f38972b) {
            int dp5 = AndroidUtilities.dp(28.0f) + dp3;
            k80Var.I = dp2;
            if (this.f38971a != null) {
                this.f38975f = AndroidUtilities.dp(28.0f) + dp2;
                this.f38971a.playTogether(arrayList);
                this.f38971a.start();
                this.f38972b = true;
            } else {
                this.f38975f = dp5;
            }
        }
        if (z12) {
            max = k80Var.f39265x - AndroidUtilities.dp(12.0f);
        } else {
            int dp6 = AndroidUtilities.dp(37.0f);
            if (i17 > 0) {
                i14 = AndroidUtilities.dp(31.0f) + i17;
            } else {
                i14 = 0;
            }
            max = Math.max(dp6, Math.min(i14, k80Var.f39265x - AndroidUtilities.dp(12.0f)));
        }
        k80Var.f39257b.a(max);
        i80 i80Var = k80Var.d;
        if (i80Var != null) {
            if (this.f38974e != null) {
                i15 = 1;
            } else {
                i15 = 0;
            }
            int max2 = Math.max(0, childCount - i15);
            float b10 = org.telegram.messenger.q.b(6.0f, i17, 0);
            float f14 = i18;
            if (max2 > 0) {
                z10 = false;
            }
            ViewPropertyAnimator animate = i80Var.f38639c.animate();
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
            org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
            org.telegram.messenger.ai.t(scaleY, isVar, 320L);
            ViewPropertyAnimator animate2 = i80Var.d.animate();
            if (z12) {
                f11 = ((i80Var.getHeight() - i80Var.getPaddingTop()) - i80Var.getPaddingBottom()) - AndroidUtilities.dp(44.0f);
            } else {
                f11 = b10;
            }
            ViewPropertyAnimator translationY = animate2.translationY(f11);
            if (z12) {
                f15 = AndroidUtilities.dp(-36.0f);
            } else if (max2 > 0) {
                f15 = Math.max(-AndroidUtilities.dp(36.0f), f14 - AndroidUtilities.dp(46.0f));
            }
            translationY.translationX(f15).setInterpolator(isVar).setDuration(320L).start();
            i80Var.f38641f.f39259e.post(new b0(i80Var, b10, 3));
        }
        setMeasuredDimension(size, this.f38975f);
    }
}
