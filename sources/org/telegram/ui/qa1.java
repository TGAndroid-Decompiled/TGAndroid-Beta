package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;
public final class qa1 implements org.telegram.ui.Components.mk0 {
    public final int f41734a;
    public final Object f41735b;
    public final Object f41736c;
    public final Object d;

    public qa1(Object obj, Object obj2, Object obj3, int i9) {
        this.f41734a = i9;
        this.f41735b = obj;
        this.f41736c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(int i9, View view) {
        org.telegram.ui.ActionBar.e6 A0;
        Interpolator interpolator;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10 = this.f41734a;
        Object obj = this.d;
        Object obj2 = this.f41736c;
        Object obj3 = this.f41735b;
        switch (i10) {
            case 0:
                za1 za1Var = (za1) obj2;
                va1 va1Var = (va1) obj;
                ThemeActivity themeActivity = ((xa1) obj3).f44444e;
                int i11 = themeActivity.f36234f;
                if (i11 == 1) {
                    A0 = org.telegram.ui.ActionBar.f6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.f6.A0();
                }
                org.telegram.ui.ActionBar.e6 e6Var = A0;
                if (i9 == za1Var.h() - 1) {
                    interpolator = null;
                    if (i11 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new oc1(e6Var, false, 1, false, z13));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) za1Var.f45098e.get(i9);
                    if (!TextUtils.isEmpty(d6Var.f22878o) && d6Var.f22866a != org.telegram.ui.ActionBar.f6.f23172n) {
                        org.telegram.ui.ActionBar.a6.a(false);
                    }
                    int i12 = e6Var.U;
                    int i13 = d6Var.f22866a;
                    if (i12 != i13) {
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        int i14 = NotificationCenter.needSetDayNightTheme;
                        if (i11 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i14, e6Var, Boolean.valueOf(z12), null, Integer.valueOf(d6Var.f22866a));
                        org.telegram.ui.ActionBar.b4.q(e6Var, d6Var.f22866a);
                        org.telegram.ui.ActionBar.f6.F1(themeActivity);
                    } else {
                        if (i13 >= 100) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i11 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        themeActivity.presentFragment(new oc1(e6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i15 = left - dp;
                if (i15 < 0) {
                    va1Var.v0(i15, 0, interpolator);
                } else {
                    int i16 = right + dp;
                    if (i16 > va1Var.getMeasuredWidth()) {
                        va1Var.v0(i16 - va1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = va1Var.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = va1Var.getChildAt(i17);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                s01.U((s01) obj3, (Context) obj2, (String) obj, view, i9);
                return;
        }
    }
}
