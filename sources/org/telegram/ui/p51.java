package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ThemeActivity;
public final class p51 implements org.telegram.ui.Components.fj0 {
    public final int f48469a;
    public final Object f48470b;
    public final Object f48471c;
    public final Object d;

    public p51(Object obj, Object obj2, Object obj3, int i3) {
        this.f48469a = i3;
        this.f48470b = obj;
        this.f48471c = obj2;
        this.d = obj3;
    }

    @Override
    public final void f(int i3, View view) {
        org.telegram.ui.ActionBar.j6 D0;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f48469a) {
            case 0:
                x51 x51Var = (x51) this.f48471c;
                u51 u51Var = (u51) this.d;
                ThemeActivity themeActivity = ((v51) this.f48470b).f50398e;
                int i10 = themeActivity.f42050f;
                if (i10 == 1) {
                    D0 = org.telegram.ui.ActionBar.k6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.k6.D0();
                }
                org.telegram.ui.ActionBar.j6 j6Var = D0;
                if (i3 == x51Var.b() - 1) {
                    if (i10 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new l71(j6Var, false, 1, false, z13));
                } else {
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) x51Var.f51834e.get(i3);
                    if (!TextUtils.isEmpty(g6Var.f27537o) && g6Var.f27525a != org.telegram.ui.ActionBar.k6.f28056n) {
                        org.telegram.ui.ActionBar.d6.a(false);
                    }
                    int i11 = j6Var.Z;
                    int i12 = g6Var.f27525a;
                    if (i11 != i12) {
                        if (i10 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.ui.ActionBar.k6.K1(j6Var, z12, i12, view);
                        org.telegram.ui.ActionBar.p3.q(j6Var, g6Var.f27525a);
                        org.telegram.ui.ActionBar.k6.M1(themeActivity);
                    } else {
                        if (i12 >= 100) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i10 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        themeActivity.presentFragment(new l71(j6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i13 = left - L;
                if (i13 < 0) {
                    u51Var.w0(i13, 0, null);
                } else {
                    int i14 = right + L;
                    if (i14 > u51Var.getMeasuredWidth()) {
                        u51Var.w0(i14 - u51Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = u51Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = u51Var.getChildAt(i15);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                yw0.a0((yw0) this.f48470b, (Context) this.f48471c, (String) this.d, view, i3);
                return;
        }
    }
}
