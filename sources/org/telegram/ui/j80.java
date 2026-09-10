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
    public AnimatorSet f34049a;
    public boolean f34050b;
    public final ArrayList f34051c;
    public org.telegram.ui.Components.w30 d;
    public org.telegram.ui.Components.w30 e;
    public int f34052f;
    public final k80 h;

    public j80(k80 k80Var, Context context) {
        super(context);
        this.h = k80Var;
        this.f34051c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.w30 w30Var) {
        k80 k80Var = this.h;
        k80Var.v = true;
        k80Var.F.remove(w30Var.getKey());
        k80Var.G.remove(w30Var);
        w30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f34049a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f34049a.setupEndValues();
            this.f34049a.cancel();
        }
        this.f34050b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f34049a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.vv0(5, (Object) this, (Object) w30Var));
        this.f34049a.setInterpolator(org.telegram.ui.Components.wr.h);
        this.f34049a.setDuration(320L);
        this.e = w30Var;
        ArrayList arrayList = this.f34051c;
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
            arrayList = this.f34051c;
            z10 = true;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Components.w30) {
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
                if (!this.f34050b) {
                    org.telegram.ui.Components.w30 w30Var = this.e;
                    if (childAt == w30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(5.0f) + i19);
                        childAt.setTranslationY(dp3);
                    } else if (w30Var != null) {
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
                    i18 = org.telegram.messenger.a2.C(9.0f, childAt.getMeasuredWidth(), i18);
                }
                i19 = org.telegram.messenger.a2.C(9.0f, childAt.getMeasuredWidth(), i19);
            }
            i16++;
        }
        if (AndroidUtilities.isTablet()) {
            y3 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            y3 = org.telegram.messenger.em.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (i17 > 0) {
            i12 = AndroidUtilities.dp(34.0f) + i17;
        } else {
            i12 = 0;
        }
        k80 k80Var = this.h;
        if (i12 > k80Var.f34266x - AndroidUtilities.dp(12.0f)) {
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
        if (i13 > k80Var.f34266x - AndroidUtilities.dp(12.0f)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!this.f34050b) {
            int dp5 = AndroidUtilities.dp(28.0f) + dp3;
            k80Var.I = dp2;
            if (this.f34049a != null) {
                this.f34052f = AndroidUtilities.dp(28.0f) + dp2;
                this.f34049a.playTogether(arrayList);
                this.f34049a.start();
                this.f34050b = true;
            } else {
                this.f34052f = dp5;
            }
        }
        if (z12) {
            max = k80Var.f34266x - AndroidUtilities.dp(12.0f);
        } else {
            int dp6 = AndroidUtilities.dp(37.0f);
            if (i17 > 0) {
                i14 = AndroidUtilities.dp(31.0f) + i17;
            } else {
                i14 = 0;
            }
            max = Math.max(dp6, Math.min(i14, k80Var.f34266x - AndroidUtilities.dp(12.0f)));
        }
        k80Var.f34259b.a(max);
        i80 i80Var = k80Var.d;
        if (i80Var != null) {
            if (this.e != null) {
                i15 = 1;
            } else {
                i15 = 0;
            }
            int max2 = Math.max(0, childCount - i15);
            float g10 = hc.b.g(6.0f, i17, 0);
            float f14 = i18;
            if (max2 > 0) {
                z10 = false;
            }
            ViewPropertyAnimator animate = i80Var.f33557c.animate();
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
            org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
            org.telegram.messenger.em.q(scaleY, wrVar, 320L);
            ViewPropertyAnimator animate2 = i80Var.d.animate();
            if (z12) {
                f11 = ((i80Var.getHeight() - i80Var.getPaddingTop()) - i80Var.getPaddingBottom()) - AndroidUtilities.dp(44.0f);
            } else {
                f11 = g10;
            }
            ViewPropertyAnimator translationY = animate2.translationY(f11);
            if (z12) {
                f15 = AndroidUtilities.dp(-36.0f);
            } else if (max2 > 0) {
                f15 = Math.max(-AndroidUtilities.dp(36.0f), f14 - AndroidUtilities.dp(46.0f));
            }
            translationY.translationX(f15).setInterpolator(wrVar).setDuration(320L).start();
            i80Var.f33558f.e.post(new c0(i80Var, g10, 3));
        }
        setMeasuredDimension(size, this.f34052f);
    }
}
