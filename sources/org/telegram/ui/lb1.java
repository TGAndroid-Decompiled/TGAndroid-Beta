package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;
public final class lb1 implements org.telegram.ui.Components.il0 {
    public final int f38605a;
    public final Object f38606b;
    public final Object f38607c;
    public final Object d;

    public lb1(Object obj, Object obj2, Object obj3, int i10) {
        this.f38605a = i10;
        this.f38606b = obj;
        this.f38607c = obj2;
        this.d = obj3;
    }

    @Override
    public final void f(int i10, View view) {
        org.telegram.ui.ActionBar.j6 A0;
        Interpolator interpolator;
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11 = this.f38605a;
        Object obj = this.d;
        Object obj2 = this.f38607c;
        Object obj3 = this.f38606b;
        switch (i11) {
            case 0:
                ub1 ub1Var = (ub1) obj2;
                qb1 qb1Var = (qb1) obj;
                ThemeActivity themeActivity = ((sb1) obj3).f41126e;
                int i12 = themeActivity.f34879f;
                if (i12 == 1) {
                    A0 = org.telegram.ui.ActionBar.k6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.k6.A0();
                }
                org.telegram.ui.ActionBar.j6 j6Var = A0;
                if (i10 == ub1Var.h() - 1) {
                    interpolator = null;
                    if (i12 == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    themeActivity.presentFragment(new jd1(j6Var, false, 1, false, z12));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) ub1Var.f41794e.get(i10);
                    if (!TextUtils.isEmpty(i6Var.f21481o) && i6Var.f21469a != org.telegram.ui.ActionBar.k6.f21834n) {
                        org.telegram.ui.ActionBar.f6.a(false);
                    }
                    int i13 = j6Var.V;
                    int i14 = i6Var.f21469a;
                    if (i13 != i14) {
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        int i15 = NotificationCenter.needSetDayNightTheme;
                        if (i12 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i15, j6Var, Boolean.valueOf(z11), null, Integer.valueOf(i6Var.f21469a));
                        org.telegram.ui.ActionBar.f4.q(j6Var, i6Var.f21469a);
                        org.telegram.ui.ActionBar.k6.F1(themeActivity);
                    } else {
                        if (i14 >= 100) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (i12 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        themeActivity.presentFragment(new jd1(j6Var, false, 1, z4, z10));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i16 = left - dp;
                if (i16 < 0) {
                    qb1Var.v0(i16, 0, interpolator);
                } else {
                    int i17 = right + dp;
                    if (i17 > qb1Var.getMeasuredWidth()) {
                        qb1Var.v0(i17 - qb1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = qb1Var.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = qb1Var.getChildAt(i18);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                k11.V((k11) obj3, (Context) obj2, (String) obj, view, i10);
                return;
        }
    }
}
