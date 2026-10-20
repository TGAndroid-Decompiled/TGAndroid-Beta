package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;
public final class na1 implements org.telegram.ui.Components.xl0 {
    public final int f39490a;
    public final Object f39491b;
    public final Object f39492c;
    public final Object d;

    public na1(Object obj, Object obj2, Object obj3, int i10) {
        this.f39490a = i10;
        this.f39491b = obj;
        this.f39492c = obj2;
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
        int i11 = this.f39490a;
        Object obj = this.d;
        Object obj2 = this.f39492c;
        Object obj3 = this.f39491b;
        switch (i11) {
            case 0:
                wa1 wa1Var = (wa1) obj2;
                sa1 sa1Var = (sa1) obj;
                ThemeActivity themeActivity = ((ua1) obj3).e;
                int i12 = themeActivity.f33904f;
                if (i12 == 1) {
                    B0 = org.telegram.ui.ActionBar.h6.J;
                } else {
                    B0 = org.telegram.ui.ActionBar.h6.B0();
                }
                org.telegram.ui.ActionBar.g6 g6Var = B0;
                if (i10 == wa1Var.h() - 1) {
                    interpolator = null;
                    if (i12 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new kc1(g6Var, false, 1, false, z13));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) wa1Var.e.get(i10);
                    if (!TextUtils.isEmpty(f6Var.f20843o) && f6Var.f20832a != org.telegram.ui.ActionBar.h6.f21166n) {
                        org.telegram.ui.ActionBar.c6.a(false);
                    }
                    int i13 = g6Var.Y;
                    int i14 = f6Var.f20832a;
                    if (i13 != i14) {
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        int i15 = NotificationCenter.needSetDayNightTheme;
                        if (i12 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i15, g6Var, Boolean.valueOf(z12), null, Integer.valueOf(f6Var.f20832a));
                        org.telegram.ui.ActionBar.c4.p(g6Var, f6Var.f20832a);
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
                        themeActivity.presentFragment(new kc1(g6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i16 = left - dp;
                if (i16 < 0) {
                    sa1Var.v0(i16, 0, interpolator);
                } else {
                    int i17 = right + dp;
                    if (i17 > sa1Var.getMeasuredWidth()) {
                        sa1Var.v0(i17 - sa1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = sa1Var.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = sa1Var.getChildAt(i18);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                z01.V((z01) obj3, (Context) obj2, (String) obj, view, i10);
                return;
        }
    }
}
