package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;
public final class fc1 implements org.telegram.ui.Components.am0 {
    public final int f35790a;
    public final Object f35791b;
    public final Object f35792c;
    public final Object d;

    public fc1(Object obj, Object obj2, Object obj3, int i10) {
        this.f35790a = i10;
        this.f35791b = obj;
        this.f35792c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(int i10, View view) {
        org.telegram.ui.ActionBar.f6 B0;
        Interpolator interpolator;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11 = this.f35790a;
        Object obj = this.d;
        Object obj2 = this.f35792c;
        Object obj3 = this.f35791b;
        switch (i11) {
            case 0:
                oc1 oc1Var = (oc1) obj2;
                kc1 kc1Var = (kc1) obj;
                ThemeActivity themeActivity = ((mc1) obj3).e;
                int i12 = themeActivity.f32848f;
                if (i12 == 1) {
                    B0 = org.telegram.ui.ActionBar.g6.J;
                } else {
                    B0 = org.telegram.ui.ActionBar.g6.B0();
                }
                org.telegram.ui.ActionBar.f6 f6Var = B0;
                if (i10 == oc1Var.h() - 1) {
                    interpolator = null;
                    if (i12 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new ce1(f6Var, false, 1, false, z13));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) oc1Var.e.get(i10);
                    if (!TextUtils.isEmpty(e6Var.f19756o) && e6Var.f19745a != org.telegram.ui.ActionBar.g6.f20077n) {
                        org.telegram.ui.ActionBar.b6.a(false);
                    }
                    int i13 = f6Var.Y;
                    int i14 = e6Var.f19745a;
                    if (i13 != i14) {
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        int i15 = NotificationCenter.needSetDayNightTheme;
                        if (i12 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i15, f6Var, Boolean.valueOf(z12), null, Integer.valueOf(e6Var.f19745a));
                        org.telegram.ui.ActionBar.b4.q(f6Var, e6Var.f19745a);
                        org.telegram.ui.ActionBar.g6.G1(themeActivity);
                    } else {
                        if (i14 >= 100) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i12 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        themeActivity.presentFragment(new ce1(f6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i16 = left - dp;
                if (i16 < 0) {
                    kc1Var.v0(i16, 0, interpolator);
                } else {
                    int i17 = right + dp;
                    if (i17 > kc1Var.getMeasuredWidth()) {
                        kc1Var.v0(i17 - kc1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = kc1Var.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = kc1Var.getChildAt(i18);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                c21.V((c21) obj3, (Context) obj2, (String) obj, view, i10);
                return;
        }
    }
}
