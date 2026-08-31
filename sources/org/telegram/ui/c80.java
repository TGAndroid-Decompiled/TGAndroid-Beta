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
public final class c80 extends ViewGroup {
    public AnimatorSet f35705a;
    public boolean f35706b;
    public final ArrayList f35707c;
    public org.telegram.ui.Components.p30 d;
    public org.telegram.ui.Components.p30 f35708e;
    public int f35709f;
    public final d80 h;

    public c80(d80 d80Var, Context context) {
        super(context);
        this.h = d80Var;
        this.f35707c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.p30 p30Var) {
        d80 d80Var = this.h;
        d80Var.v = true;
        d80Var.C.remove(p30Var.getKey());
        d80Var.D.remove(p30Var);
        p30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f35705a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f35705a.setupEndValues();
            this.f35705a.cancel();
        }
        this.f35706b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f35705a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.fx0(4, this, p30Var));
        this.f35705a.setInterpolator(org.telegram.ui.Components.pr.h);
        this.f35705a.setDuration(320L);
        this.f35708e = p30Var;
        ArrayList arrayList = this.f35707c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f35708e, View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.f35708e, View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.f35708e, View.ALPHA, 1.0f, 0.0f));
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
            arrayList = this.f35707c;
            z4 = true;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Components.p30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                if (childAt != this.f35708e && childAt.getMeasuredWidth() + i18 > dp) {
                    dp2 += AndroidUtilities.dp(34.0f);
                    i18 = 0;
                }
                if (childAt.getMeasuredWidth() + i19 > dp) {
                    dp3 += AndroidUtilities.dp(34.0f);
                    i19 = 0;
                }
                int dp4 = AndroidUtilities.dp(5.0f) + i18;
                if (!this.f35706b) {
                    org.telegram.ui.Components.p30 p30Var = this.f35708e;
                    if (childAt == p30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(5.0f) + i19);
                        childAt.setTranslationY(dp3);
                    } else if (p30Var != null) {
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
                if (childAt != this.f35708e) {
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
        d80 d80Var = this.h;
        if (i12 > d80Var.f36141x - AndroidUtilities.dp(12.0f)) {
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
        if (i13 > d80Var.f36141x - AndroidUtilities.dp(12.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!this.f35706b) {
            int dp5 = AndroidUtilities.dp(28.0f) + dp3;
            d80Var.F = dp2;
            if (this.f35705a != null) {
                this.f35709f = AndroidUtilities.dp(28.0f) + dp2;
                this.f35705a.playTogether(arrayList);
                this.f35705a.start();
                this.f35706b = true;
            } else {
                this.f35709f = dp5;
            }
        }
        if (z11) {
            max = d80Var.f36141x - AndroidUtilities.dp(12.0f);
        } else {
            int dp6 = AndroidUtilities.dp(37.0f);
            if (i17 > 0) {
                i14 = AndroidUtilities.dp(31.0f) + i17;
            } else {
                i14 = 0;
            }
            max = Math.max(dp6, Math.min(i14, d80Var.f36141x - AndroidUtilities.dp(12.0f)));
        }
        d80Var.f36133b.a(max);
        b80 b80Var = d80Var.d;
        if (b80Var != null) {
            if (this.f35708e != null) {
                i15 = 1;
            } else {
                i15 = 0;
            }
            int max2 = Math.max(0, childCount - i15);
            float c3 = l.d.c(6.0f, i17, 0);
            float f15 = i18;
            if (max2 > 0) {
                z4 = false;
            }
            ViewPropertyAnimator animate = b80Var.f35384c.animate();
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
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
            b.p(scaleY, prVar, 320L);
            ViewPropertyAnimator animate2 = b80Var.d.animate();
            if (z11) {
                f12 = ((b80Var.getHeight() - b80Var.getPaddingTop()) - b80Var.getPaddingBottom()) - AndroidUtilities.dp(44.0f);
            } else {
                f12 = c3;
            }
            ViewPropertyAnimator translationY = animate2.translationY(f12);
            if (z11) {
                f16 = AndroidUtilities.dp(-36.0f);
            } else if (max2 > 0) {
                f16 = Math.max(-AndroidUtilities.dp(36.0f), f15 - AndroidUtilities.dp(46.0f));
            }
            translationY.translationX(f16).setInterpolator(prVar).setDuration(320L).start();
            b80Var.f35386f.f36135e.post(new d0(b80Var, c3, 3));
        }
        setMeasuredDimension(size, this.f35709f);
    }
}
