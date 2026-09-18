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
public final class m80 extends ViewGroup {
    public AnimatorSet f35706a;
    public boolean f35707b;
    public final ArrayList f35708c;
    public org.telegram.ui.Components.m30 d;
    public org.telegram.ui.Components.m30 e;
    public int f35709f;
    public final n80 h;

    public m80(n80 n80Var, Context context) {
        super(context);
        this.h = n80Var;
        this.f35708c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.m30 m30Var) {
        n80 n80Var = this.h;
        n80Var.v = true;
        n80Var.F.remove(m30Var.getKey());
        n80Var.G.remove(m30Var);
        m30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f35706a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f35706a.setupEndValues();
            this.f35706a.cancel();
        }
        this.f35707b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f35706a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.qk0(7, this, m30Var));
        this.f35706a.setInterpolator(org.telegram.ui.Components.qr.h);
        this.f35706a.setDuration(320L);
        this.e = m30Var;
        ArrayList arrayList = this.f35708c;
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
            arrayList = this.f35708c;
            z10 = true;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Components.m30) {
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
                if (!this.f35707b) {
                    org.telegram.ui.Components.m30 m30Var = this.e;
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
                if (childAt != this.e) {
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
        n80 n80Var = this.h;
        if (i12 > n80Var.f35980x - AndroidUtilities.dp(12.0f)) {
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
        if (i13 > n80Var.f35980x - AndroidUtilities.dp(12.0f)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!this.f35707b) {
            int dp5 = AndroidUtilities.dp(28.0f) + dp3;
            n80Var.I = dp2;
            if (this.f35706a != null) {
                this.f35709f = AndroidUtilities.dp(28.0f) + dp2;
                this.f35706a.playTogether(arrayList);
                this.f35706a.start();
                this.f35707b = true;
            } else {
                this.f35709f = dp5;
            }
        }
        if (z12) {
            max = n80Var.f35980x - AndroidUtilities.dp(12.0f);
        } else {
            int dp6 = AndroidUtilities.dp(37.0f);
            if (i17 > 0) {
                i14 = AndroidUtilities.dp(31.0f) + i17;
            } else {
                i14 = 0;
            }
            max = Math.max(dp6, Math.min(i14, n80Var.f35980x - AndroidUtilities.dp(12.0f)));
        }
        n80Var.f35973b.a(max);
        l80 l80Var = n80Var.d;
        if (l80Var != null) {
            if (this.e != null) {
                i15 = 1;
            } else {
                i15 = 0;
            }
            int max2 = Math.max(0, childCount - i15);
            float f14 = hg.k0.f(6.0f, i17, 0);
            float f15 = i18;
            if (max2 > 0) {
                z10 = false;
            }
            ViewPropertyAnimator animate = l80Var.f35482c.animate();
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
            org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
            org.telegram.messenger.wl.q(scaleY, qrVar, 320L);
            ViewPropertyAnimator animate2 = l80Var.d.animate();
            if (z12) {
                f11 = ((l80Var.getHeight() - l80Var.getPaddingTop()) - l80Var.getPaddingBottom()) - AndroidUtilities.dp(44.0f);
            } else {
                f11 = f14;
            }
            ViewPropertyAnimator translationY = animate2.translationY(f11);
            if (z12) {
                f16 = AndroidUtilities.dp(-36.0f);
            } else if (max2 > 0) {
                f16 = Math.max(-AndroidUtilities.dp(36.0f), f15 - AndroidUtilities.dp(46.0f));
            }
            translationY.translationX(f16).setInterpolator(qrVar).setDuration(320L).start();
            l80Var.f35483f.e.post(new b0(l80Var, f14, 3));
        }
        setMeasuredDimension(size, this.f35709f);
    }
}
