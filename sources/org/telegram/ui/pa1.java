package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;
public final class pa1 implements org.telegram.ui.Components.wl0 {
    public final int f40009a;
    public final Object f40010b;
    public final Object f40011c;
    public final Object d;

    public pa1(Object obj, Object obj2, Object obj3, int i10) {
        this.f40009a = i10;
        this.f40010b = obj;
        this.f40011c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(int i10, View view) {
        org.telegram.ui.ActionBar.g6 B0;
        Interpolator interpolator;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11 = this.f40009a;
        Object obj = this.d;
        Object obj2 = this.f40011c;
        Object obj3 = this.f40010b;
        switch (i11) {
            case 0:
                ya1 ya1Var = (ya1) obj2;
                ua1 ua1Var = (ua1) obj;
                ThemeActivity themeActivity = ((wa1) obj3).e;
                int i12 = themeActivity.f33890f;
                if (i12 == 1) {
                    B0 = org.telegram.ui.ActionBar.h6.J;
                } else {
                    B0 = org.telegram.ui.ActionBar.h6.B0();
                }
                org.telegram.ui.ActionBar.g6 g6Var = B0;
                if (i10 == ya1Var.h() - 1) {
                    interpolator = null;
                    if (i12 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new mc1(g6Var, false, 1, false, z13));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) ya1Var.e.get(i10);
                    if (!TextUtils.isEmpty(f6Var.f20839o) && f6Var.f20828a != org.telegram.ui.ActionBar.h6.f21162n) {
                        org.telegram.ui.ActionBar.c6.a(false);
                    }
                    int i13 = g6Var.Y;
                    int i14 = f6Var.f20828a;
                    if (i13 != i14) {
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        int i15 = NotificationCenter.needSetDayNightTheme;
                        if (i12 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i15, g6Var, Boolean.valueOf(z12), null, Integer.valueOf(f6Var.f20828a));
                        org.telegram.ui.ActionBar.c4.p(g6Var, f6Var.f20828a);
                        org.telegram.ui.ActionBar.h6.G1(themeActivity);
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
                        themeActivity.presentFragment(new mc1(g6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i16 = left - dp;
                if (i16 < 0) {
                    ua1Var.v0(i16, 0, interpolator);
                } else {
                    int i17 = right + dp;
                    if (i17 > ua1Var.getMeasuredWidth()) {
                        ua1Var.v0(i17 - ua1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = ua1Var.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = ua1Var.getChildAt(i18);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                b11.V((b11) obj3, (Context) obj2, (String) obj, view, i10);
                return;
        }
    }
}
