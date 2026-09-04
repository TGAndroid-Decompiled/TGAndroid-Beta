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
public final class k80 extends ViewGroup {
    public AnimatorSet f37953a;
    public boolean f37954b;
    public final ArrayList f37955c;
    public org.telegram.ui.Components.m30 d;
    public org.telegram.ui.Components.m30 f37956e;
    public int f37957f;
    public final l80 h;

    public k80(l80 l80Var, Context context) {
        super(context);
        this.h = l80Var;
        this.f37955c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.m30 m30Var) {
        l80 l80Var = this.h;
        l80Var.v = true;
        l80Var.F.remove(m30Var.getKey());
        l80Var.G.remove(m30Var);
        m30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f37953a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f37953a.setupEndValues();
            this.f37953a.cancel();
        }
        this.f37954b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f37953a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.pk0(7, this, m30Var));
        this.f37953a.setInterpolator(org.telegram.ui.Components.pr.h);
        this.f37953a.setDuration(320L);
        this.f37956e = m30Var;
        ArrayList arrayList = this.f37955c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f37956e, View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.f37956e, View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.f37956e, View.ALPHA, 1.0f, 0.0f));
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
        int y3;
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
            arrayList = this.f37955c;
            z10 = true;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Components.m30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                if (childAt != this.f37956e && childAt.getMeasuredWidth() + i18 > dp) {
                    dp2 += AndroidUtilities.dp(34.0f);
                    i18 = 0;
                }
                if (childAt.getMeasuredWidth() + i19 > dp) {
                    dp3 += AndroidUtilities.dp(34.0f);
                    i19 = 0;
                }
                int dp4 = AndroidUtilities.dp(5.0f) + i18;
                if (!this.f37954b) {
                    org.telegram.ui.Components.m30 m30Var = this.f37956e;
                    if (childAt == m30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(5.0f) + i19);
                        childAt.setTranslationY(dp3);
                    } else if (m30Var != null) {
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
                if (childAt != this.f37956e) {
                    i18 = org.telegram.messenger.w1.C(9.0f, childAt.getMeasuredWidth(), i18);
                }
                i19 = org.telegram.messenger.w1.C(9.0f, childAt.getMeasuredWidth(), i19);
            }
            i16++;
        }
        if (AndroidUtilities.isTablet()) {
            y3 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            y3 = org.telegram.messenger.wl.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (i17 > 0) {
            i12 = AndroidUtilities.dp(34.0f) + i17;
        } else {
            i12 = 0;
        }
        l80 l80Var = this.h;
        if (i12 > l80Var.f38228x - AndroidUtilities.dp(12.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (dp - i18 < y3 && !z11) {
            dp2 += AndroidUtilities.dp(34.0f);
            i17 = Math.max(i17, dp2);
            i18 = 0;
        }
        if (i17 > 0) {
            i13 = AndroidUtilities.dp(34.0f) + i17;
        } else {
            i13 = 0;
        }
        if (i13 > l80Var.f38228x - AndroidUtilities.dp(12.0f)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!this.f37954b) {
            int dp5 = AndroidUtilities.dp(28.0f) + dp3;
            l80Var.I = dp2;
            if (this.f37953a != null) {
                this.f37957f = AndroidUtilities.dp(28.0f) + dp2;
                this.f37953a.playTogether(arrayList);
                this.f37953a.start();
                this.f37954b = true;
            } else {
                this.f37957f = dp5;
            }
        }
        if (z12) {
            max = l80Var.f38228x - AndroidUtilities.dp(12.0f);
        } else {
            int dp6 = AndroidUtilities.dp(37.0f);
            if (i17 > 0) {
                i14 = AndroidUtilities.dp(31.0f) + i17;
            } else {
                i14 = 0;
            }
            max = Math.max(dp6, Math.min(i14, l80Var.f38228x - AndroidUtilities.dp(12.0f)));
        }
        l80Var.f38220b.a(max);
        j80 j80Var = l80Var.d;
        if (j80Var != null) {
            if (this.f37956e != null) {
                i15 = 1;
            } else {
                i15 = 0;
            }
            int max2 = Math.max(0, childCount - i15);
            float f14 = i2.g.f(6.0f, i17, 0);
            float f15 = i18;
            if (max2 > 0) {
                z10 = false;
            }
            ViewPropertyAnimator animate = j80Var.f37692c.animate();
            float f16 = 0.0f;
            float f17 = 1.0f;
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
                f17 = 0.5f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f17);
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
            org.telegram.messenger.wl.q(scaleY, prVar, 320L);
            ViewPropertyAnimator animate2 = j80Var.d.animate();
            if (z12) {
                f11 = ((j80Var.getHeight() - j80Var.getPaddingTop()) - j80Var.getPaddingBottom()) - AndroidUtilities.dp(44.0f);
            } else {
                f11 = f14;
            }
            ViewPropertyAnimator translationY = animate2.translationY(f11);
            if (z12) {
                f16 = AndroidUtilities.dp(-36.0f);
            } else if (max2 > 0) {
                f16 = Math.max(-AndroidUtilities.dp(36.0f), f15 - AndroidUtilities.dp(46.0f));
            }
            translationY.translationX(f16).setInterpolator(prVar).setDuration(320L).start();
            j80Var.f37694f.f38222e.post(new b0(j80Var, f14, 3));
        }
        setMeasuredDimension(size, this.f37957f);
    }
}
