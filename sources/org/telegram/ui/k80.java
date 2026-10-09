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
    public AnimatorSet f39175a;
    public boolean f39176b;
    public final ArrayList f39177c;
    public org.telegram.ui.Components.d40 d;
    public org.telegram.ui.Components.d40 f39178e;
    public int f39179f;
    public final l80 h;

    public k80(l80 l80Var, Context context) {
        super(context);
        this.h = l80Var;
        this.f39177c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.d40 d40Var) {
        l80 l80Var = this.h;
        l80Var.v = true;
        l80Var.F.remove(d40Var.getKey());
        l80Var.G.remove(d40Var);
        d40Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f39175a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f39175a.setupEndValues();
            this.f39175a.cancel();
        }
        this.f39176b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f39175a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.ul0(7, this, d40Var));
        this.f39175a.setInterpolator(org.telegram.ui.Components.hs.h);
        this.f39175a.setDuration(320L);
        this.f39178e = d40Var;
        ArrayList arrayList = this.f39177c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f39178e, View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.f39178e, View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.f39178e, View.ALPHA, 1.0f, 0.0f));
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
            arrayList = this.f39177c;
            z10 = true;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Components.d40) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                if (childAt != this.f39178e && childAt.getMeasuredWidth() + i18 > dp) {
                    dp2 += AndroidUtilities.dp(34.0f);
                    i18 = 0;
                }
                if (childAt.getMeasuredWidth() + i19 > dp) {
                    dp3 += AndroidUtilities.dp(34.0f);
                    i19 = 0;
                }
                int dp4 = AndroidUtilities.dp(5.0f) + i18;
                if (!this.f39176b) {
                    org.telegram.ui.Components.d40 d40Var = this.f39178e;
                    if (childAt == d40Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(5.0f) + i19);
                        childAt.setTranslationY(dp3);
                    } else if (d40Var != null) {
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
                if (childAt != this.f39178e) {
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
            A = org.telegram.messenger.bi.A(158.0f, Math.min(point.x, point.y), 3);
        }
        if (i17 > 0) {
            i12 = AndroidUtilities.dp(34.0f) + i17;
        } else {
            i12 = 0;
        }
        l80 l80Var = this.h;
        if (i12 > l80Var.f39471x - AndroidUtilities.dp(12.0f)) {
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
        if (i13 > l80Var.f39471x - AndroidUtilities.dp(12.0f)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!this.f39176b) {
            int dp5 = AndroidUtilities.dp(28.0f) + dp3;
            l80Var.I = dp2;
            if (this.f39175a != null) {
                this.f39179f = AndroidUtilities.dp(28.0f) + dp2;
                this.f39175a.playTogether(arrayList);
                this.f39175a.start();
                this.f39176b = true;
            } else {
                this.f39179f = dp5;
            }
        }
        if (z12) {
            max = l80Var.f39471x - AndroidUtilities.dp(12.0f);
        } else {
            int dp6 = AndroidUtilities.dp(37.0f);
            if (i17 > 0) {
                i14 = AndroidUtilities.dp(31.0f) + i17;
            } else {
                i14 = 0;
            }
            max = Math.max(dp6, Math.min(i14, l80Var.f39471x - AndroidUtilities.dp(12.0f)));
        }
        l80Var.f39463b.a(max);
        j80 j80Var = l80Var.d;
        if (j80Var != null) {
            if (this.f39178e != null) {
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
            ViewPropertyAnimator animate = j80Var.f38859c.animate();
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
            org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.h;
            org.telegram.messenger.bi.t(scaleY, hsVar, 320L);
            ViewPropertyAnimator animate2 = j80Var.d.animate();
            if (z12) {
                f11 = ((j80Var.getHeight() - j80Var.getPaddingTop()) - j80Var.getPaddingBottom()) - AndroidUtilities.dp(44.0f);
            } else {
                f11 = b10;
            }
            ViewPropertyAnimator translationY = animate2.translationY(f11);
            if (z12) {
                f15 = AndroidUtilities.dp(-36.0f);
            } else if (max2 > 0) {
                f15 = Math.max(-AndroidUtilities.dp(36.0f), f14 - AndroidUtilities.dp(46.0f));
            }
            translationY.translationX(f15).setInterpolator(hsVar).setDuration(320L).start();
            j80Var.f38861f.f39465e.post(new c0(j80Var, b10, 3));
        }
        setMeasuredDimension(size, this.f39179f);
    }
}
