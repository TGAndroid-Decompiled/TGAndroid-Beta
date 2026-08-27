package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class oa1 implements org.telegram.ui.Components.pk0 {

    public final int f41047a;

    public final Object f41048b;

    public final Object f41049c;
    public final Object d;

    public oa1(Object obj, Object obj2, Object obj3, int i10) {
        this.f41047a = i10;
        this.f41048b = obj;
        this.f41049c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(int i10, View view) {
        Interpolator interpolator;
        int i11 = this.f41047a;
        Object obj = this.d;
        Object obj2 = this.f41049c;
        Object obj3 = this.f41048b;
        switch (i11) {
            case 0:
                xa1 xa1Var = (xa1) obj2;
                ta1 ta1Var = (ta1) obj;
                ThemeActivity themeActivity = ((va1) obj3).f43398e;
                int i12 = themeActivity.f36237f;
                org.telegram.ui.ActionBar.f6 f6VarA0 = i12 == 1 ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.A0();
                if (i10 == xa1Var.h() - 1) {
                    interpolator = null;
                    themeActivity.presentFragment(new nc1(f6VarA0, false, 1, false, i12 == 1));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) xa1Var.f44366e.get(i10);
                    if (!TextUtils.isEmpty(e6Var.f22895o) && e6Var.f22883a != org.telegram.ui.ActionBar.g6.f23227n) {
                        org.telegram.ui.ActionBar.b6.a(false);
                    }
                    int i13 = f6VarA0.U;
                    int i14 = e6Var.f22883a;
                    if (i13 != i14) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6VarA0, Boolean.valueOf(i12 == 1), null, Integer.valueOf(e6Var.f22883a));
                        org.telegram.ui.ActionBar.b4.q(f6VarA0, e6Var.f22883a);
                        org.telegram.ui.ActionBar.g6.F1(themeActivity);
                    } else {
                        themeActivity.presentFragment(new nc1(f6VarA0, false, 1, i14 >= 100, i12 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int iDp = AndroidUtilities.dp(52.0f);
                int i15 = left - iDp;
                if (i15 < 0) {
                    ta1Var.v0(i15, 0, interpolator);
                } else {
                    int i16 = right + iDp;
                    if (i16 > ta1Var.getMeasuredWidth()) {
                        ta1Var.v0(i16 - ta1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = ta1Var.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = ta1Var.getChildAt(i17);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                break;
            default:
                t01.V((t01) obj3, (Context) obj2, (String) obj, view, i10);
                break;
        }
    }
}
