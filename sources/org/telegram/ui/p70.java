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
public final class p70 extends ViewGroup {
    public AnimatorSet f41351a;
    public boolean f41352b;
    public final ArrayList f41353c;
    public org.telegram.ui.Components.w20 d;
    public org.telegram.ui.Components.w20 f41354e;
    public int f41355f;
    public final q70 h;

    public p70(q70 q70Var, Context context) {
        super(context);
        this.h = q70Var;
        this.f41353c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.w20 w20Var) {
        q70 q70Var = this.h;
        q70Var.v = true;
        q70Var.B.remove(w20Var.getKey());
        q70Var.C.remove(w20Var);
        w20Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f41351a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f41351a.setupEndValues();
            this.f41351a.cancel();
        }
        this.f41352b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f41351a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.su0(5, this, w20Var));
        this.f41351a.setInterpolator(org.telegram.ui.Components.gr.h);
        this.f41351a.setDuration(320L);
        this.f41354e = w20Var;
        ArrayList arrayList = this.f41353c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f41354e, View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.f41354e, View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.f41354e, View.ALPHA, 1.0f, 0.0f));
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
        boolean z10;
        int y10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        int max;
        int i14;
        float f10;
        float f11;
        float f12;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i9);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(6.0f);
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            arrayList = this.f41353c;
            z10 = true;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            if (childAt instanceof org.telegram.ui.Components.w20) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                if (childAt != this.f41354e && childAt.getMeasuredWidth() + i17 > dp) {
                    dp2 += AndroidUtilities.dp(34.0f);
                    i17 = 0;
                }
                if (childAt.getMeasuredWidth() + i18 > dp) {
                    dp3 += AndroidUtilities.dp(34.0f);
                    i18 = 0;
                }
                int dp4 = AndroidUtilities.dp(5.0f) + i17;
                if (!this.f41352b) {
                    org.telegram.ui.Components.w20 w20Var = this.f41354e;
                    if (childAt == w20Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(5.0f) + i18);
                        childAt.setTranslationY(dp3);
                    } else if (w20Var != null) {
                        float f13 = dp4;
                        if (childAt.getTranslationX() != f13) {
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, f13));
                        }
                        float f14 = dp2;
                        if (childAt.getTranslationY() != f14) {
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, f14));
                        }
                        i16 = Math.max(i16, dp2);
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        i16 = Math.max(i16, dp2);
                    }
                }
                if (childAt != this.f41354e) {
                    i17 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i17);
                }
                i18 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i18);
            }
            i15++;
        }
        if (AndroidUtilities.isTablet()) {
            y10 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            y10 = org.telegram.messenger.ll.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (i16 > 0) {
            i11 = AndroidUtilities.dp(34.0f) + i16;
        } else {
            i11 = 0;
        }
        q70 q70Var = this.h;
        if (i11 > q70Var.f41709x - AndroidUtilities.dp(12.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (dp - i17 < y10 && !z11) {
            dp2 += AndroidUtilities.dp(34.0f);
            i16 = Math.max(i16, dp2);
            i17 = 0;
        }
        if (i16 > 0) {
            i12 = AndroidUtilities.dp(34.0f) + i16;
        } else {
            i12 = 0;
        }
        if (i12 > q70Var.f41709x - AndroidUtilities.dp(12.0f)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!this.f41352b) {
            int dp5 = AndroidUtilities.dp(28.0f) + dp3;
            q70Var.E = dp2;
            if (this.f41351a != null) {
                this.f41355f = AndroidUtilities.dp(28.0f) + dp2;
                this.f41351a.playTogether(arrayList);
                this.f41351a.start();
                this.f41352b = true;
            } else {
                this.f41355f = dp5;
            }
        }
        if (z12) {
            max = q70Var.f41709x - AndroidUtilities.dp(12.0f);
        } else {
            int dp6 = AndroidUtilities.dp(37.0f);
            if (i16 > 0) {
                i13 = AndroidUtilities.dp(31.0f) + i16;
            } else {
                i13 = 0;
            }
            max = Math.max(dp6, Math.min(i13, q70Var.f41709x - AndroidUtilities.dp(12.0f)));
        }
        q70Var.f41701b.a(max);
        o70 o70Var = q70Var.d;
        if (o70Var != null) {
            if (this.f41354e != null) {
                i14 = 1;
            } else {
                i14 = 0;
            }
            int max2 = Math.max(0, childCount - i14);
            float b10 = org.telegram.messenger.l0.b(6.0f, i16, 0);
            float f15 = i17;
            if (max2 > 0) {
                z10 = false;
            }
            ViewPropertyAnimator animate = o70Var.f40997c.animate();
            float f16 = 0.0f;
            float f17 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!z10) {
                f17 = 0.5f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f17);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
            org.telegram.messenger.ll.r(scaleY, grVar, 320L);
            ViewPropertyAnimator animate2 = o70Var.d.animate();
            if (z12) {
                f12 = ((o70Var.getHeight() - o70Var.getPaddingTop()) - o70Var.getPaddingBottom()) - AndroidUtilities.dp(44.0f);
            } else {
                f12 = b10;
            }
            ViewPropertyAnimator translationY = animate2.translationY(f12);
            if (z12) {
                f16 = AndroidUtilities.dp(-36.0f);
            } else if (max2 > 0) {
                f16 = Math.max(-AndroidUtilities.dp(36.0f), f15 - AndroidUtilities.dp(46.0f));
            }
            translationY.translationX(f16).setInterpolator(grVar).setDuration(320L).start();
            o70Var.f40999f.f41703e.post(new d0(o70Var, b10, 3));
        }
        setMeasuredDimension(size, this.f41355f);
    }
}
