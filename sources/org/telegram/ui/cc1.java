package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;
public final class cc1 implements org.telegram.ui.Components.km0 {
    public final int f36395a;
    public final Object f36396b;
    public final Object f36397c;
    public final Object d;

    public cc1(Object obj, Object obj2, Object obj3, int i10) {
        this.f36395a = i10;
        this.f36396b = obj;
        this.f36397c = obj2;
        this.d = obj3;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.ActionBar.g6 B0;
        Interpolator interpolator;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11 = this.f36395a;
        Object obj = this.d;
        Object obj2 = this.f36397c;
        Object obj3 = this.f36396b;
        switch (i11) {
            case 0:
                lc1 lc1Var = (lc1) obj2;
                hc1 hc1Var = (hc1) obj;
                ThemeActivity themeActivity = ((jc1) obj3).f39180e;
                int i12 = themeActivity.f34377f;
                if (i12 == 1) {
                    B0 = org.telegram.ui.ActionBar.h6.J;
                } else {
                    B0 = org.telegram.ui.ActionBar.h6.B0();
                }
                org.telegram.ui.ActionBar.g6 g6Var = B0;
                if (i10 == lc1Var.h() - 1) {
                    interpolator = null;
                    if (i12 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new zd1(g6Var, false, 1, false, z13));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) lc1Var.f39699e.get(i10);
                    if (!TextUtils.isEmpty(e6Var.f20362o) && e6Var.f20350a != org.telegram.ui.ActionBar.h6.f20738n) {
                        org.telegram.ui.ActionBar.b6.a(false);
                    }
                    int i13 = g6Var.Y;
                    int i14 = e6Var.f20350a;
                    if (i13 != i14) {
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        int i15 = NotificationCenter.needSetDayNightTheme;
                        if (i12 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i15, g6Var, Boolean.valueOf(z12), null, Integer.valueOf(e6Var.f20350a));
                        org.telegram.ui.ActionBar.b4.q(g6Var, e6Var.f20350a);
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
                        themeActivity.presentFragment(new zd1(g6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i16 = left - dp;
                if (i16 < 0) {
                    hc1Var.v0(i16, 0, interpolator);
                } else {
                    int i17 = right + dp;
                    if (i17 > hc1Var.getMeasuredWidth()) {
                        hc1Var.v0(i17 - hc1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = hc1Var.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = hc1Var.getChildAt(i18);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                x11.V((x11) obj3, (Context) obj2, (String) obj, view, i10);
                return;
        }
    }
}
