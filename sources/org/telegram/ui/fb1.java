package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;
public final class fb1 implements org.telegram.ui.Components.jl0 {
    public final int f36837a;
    public final Object f36838b;
    public final Object f36839c;
    public final Object d;

    public fb1(Object obj, Object obj2, Object obj3, int i10) {
        this.f36837a = i10;
        this.f36838b = obj;
        this.f36839c = obj2;
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
        int i11 = this.f36837a;
        Object obj = this.d;
        Object obj2 = this.f36839c;
        Object obj3 = this.f36838b;
        switch (i11) {
            case 0:
                ob1 ob1Var = (ob1) obj2;
                kb1 kb1Var = (kb1) obj;
                ThemeActivity themeActivity = ((mb1) obj3).f39073e;
                int i12 = themeActivity.f34879f;
                if (i12 == 1) {
                    A0 = org.telegram.ui.ActionBar.k6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.k6.A0();
                }
                org.telegram.ui.ActionBar.j6 j6Var = A0;
                if (i10 == ob1Var.h() - 1) {
                    interpolator = null;
                    if (i12 == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    themeActivity.presentFragment(new ed1(j6Var, false, 1, false, z12));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) ob1Var.f39715e.get(i10);
                    if (!TextUtils.isEmpty(i6Var.f21479o) && i6Var.f21467a != org.telegram.ui.ActionBar.k6.f21832n) {
                        org.telegram.ui.ActionBar.f6.a(false);
                    }
                    int i13 = j6Var.V;
                    int i14 = i6Var.f21467a;
                    if (i13 != i14) {
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        int i15 = NotificationCenter.needSetDayNightTheme;
                        if (i12 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i15, j6Var, Boolean.valueOf(z11), null, Integer.valueOf(i6Var.f21467a));
                        org.telegram.ui.ActionBar.f4.q(j6Var, i6Var.f21467a);
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
                        themeActivity.presentFragment(new ed1(j6Var, false, 1, z4, z10));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i16 = left - dp;
                if (i16 < 0) {
                    kb1Var.v0(i16, 0, interpolator);
                } else {
                    int i17 = right + dp;
                    if (i17 > kb1Var.getMeasuredWidth()) {
                        kb1Var.v0(i17 - kb1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = kb1Var.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = kb1Var.getChildAt(i18);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                g11.V((g11) obj3, (Context) obj2, (String) obj, view, i10);
                return;
        }
    }
}
