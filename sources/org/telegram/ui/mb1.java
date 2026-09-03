package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;
public final class mb1 implements org.telegram.ui.Components.hl0 {
    public final int f36017a;
    public final Object f36018b;
    public final Object f36019c;
    public final Object d;

    public mb1(Object obj, Object obj2, Object obj3, int i10) {
        this.f36017a = i10;
        this.f36018b = obj;
        this.f36019c = obj2;
        this.d = obj3;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.ActionBar.i6 A0;
        Interpolator interpolator;
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11 = this.f36017a;
        Object obj = this.d;
        Object obj2 = this.f36019c;
        Object obj3 = this.f36018b;
        switch (i11) {
            case 0:
                vb1 vb1Var = (vb1) obj2;
                rb1 rb1Var = (rb1) obj;
                ThemeActivity themeActivity = ((tb1) obj3).e;
                int i12 = themeActivity.f32313f;
                if (i12 == 1) {
                    A0 = org.telegram.ui.ActionBar.j6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.j6.A0();
                }
                org.telegram.ui.ActionBar.i6 i6Var = A0;
                if (i10 == vb1Var.h() - 1) {
                    interpolator = null;
                    if (i12 == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    themeActivity.presentFragment(new jd1(i6Var, false, 1, false, z12));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) vb1Var.e.get(i10);
                    if (!TextUtils.isEmpty(h6Var.f19747o) && h6Var.f19736a != org.telegram.ui.ActionBar.j6.f20053n) {
                        org.telegram.ui.ActionBar.e6.a(false);
                    }
                    int i13 = i6Var.V;
                    int i14 = h6Var.f19736a;
                    if (i13 != i14) {
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        int i15 = NotificationCenter.needSetDayNightTheme;
                        if (i12 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i15, i6Var, Boolean.valueOf(z11), null, Integer.valueOf(h6Var.f19736a));
                        org.telegram.ui.ActionBar.e4.q(i6Var, h6Var.f19736a);
                        org.telegram.ui.ActionBar.j6.F1(themeActivity);
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
                        themeActivity.presentFragment(new jd1(i6Var, false, 1, z4, z10));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i16 = left - dp;
                if (i16 < 0) {
                    rb1Var.v0(i16, 0, interpolator);
                } else {
                    int i17 = right + dp;
                    if (i17 > rb1Var.getMeasuredWidth()) {
                        rb1Var.v0(i17 - rb1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = rb1Var.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = rb1Var.getChildAt(i18);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                l11.V((l11) obj3, (Context) obj2, (String) obj, view, i10);
                return;
        }
    }
}
