package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;
public final class dc1 implements org.telegram.ui.Components.jl0 {
    public final int f31882a;
    public final Object f31883b;
    public final Object f31884c;
    public final Object d;

    public dc1(Object obj, Object obj2, Object obj3, int i10) {
        this.f31882a = i10;
        this.f31883b = obj;
        this.f31884c = obj2;
        this.d = obj3;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.ActionBar.i6 A0;
        Interpolator interpolator;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11 = this.f31882a;
        Object obj = this.d;
        Object obj2 = this.f31884c;
        Object obj3 = this.f31883b;
        switch (i11) {
            case 0:
                mc1 mc1Var = (mc1) obj2;
                ic1 ic1Var = (ic1) obj;
                ThemeActivity themeActivity = ((kc1) obj3).e;
                int i12 = themeActivity.f30669f;
                if (i12 == 1) {
                    A0 = org.telegram.ui.ActionBar.j6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.j6.A0();
                }
                org.telegram.ui.ActionBar.i6 i6Var = A0;
                if (i10 == mc1Var.h() - 1) {
                    interpolator = null;
                    if (i12 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new ae1(i6Var, false, 1, false, z13));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) mc1Var.e.get(i10);
                    if (!TextUtils.isEmpty(h6Var.f17803o) && h6Var.f17792a != org.telegram.ui.ActionBar.j6.f18103n) {
                        org.telegram.ui.ActionBar.e6.a(false);
                    }
                    int i13 = i6Var.Y;
                    int i14 = h6Var.f17792a;
                    if (i13 != i14) {
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        int i15 = NotificationCenter.needSetDayNightTheme;
                        if (i12 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i15, i6Var, Boolean.valueOf(z12), null, Integer.valueOf(h6Var.f17792a));
                        org.telegram.ui.ActionBar.f4.q(i6Var, h6Var.f17792a);
                        org.telegram.ui.ActionBar.j6.F1(themeActivity);
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
                        themeActivity.presentFragment(new ae1(i6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i16 = left - dp;
                if (i16 < 0) {
                    ic1Var.v0(i16, 0, interpolator);
                } else {
                    int i17 = right + dp;
                    if (i17 > ic1Var.getMeasuredWidth()) {
                        ic1Var.v0(i17 - ic1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = ic1Var.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = ic1Var.getChildAt(i18);
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
