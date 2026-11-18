package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ThemeActivity;
public final class a61 implements org.telegram.ui.Components.oj0 {
    public final int f45478a;
    public final Object f45479b;
    public final Object f45480c;
    public final Object d;

    public a61(Object obj, Object obj2, Object obj3, int i7) {
        this.f45478a = i7;
        this.f45479b = obj;
        this.f45480c = obj2;
        this.d = obj3;
    }

    @Override
    public final void c(int i7, View view) {
        org.telegram.ui.ActionBar.m6 D0;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f45478a) {
            case 0:
                i61 i61Var = (i61) this.f45480c;
                f61 f61Var = (f61) this.d;
                ThemeActivity themeActivity = ((g61) this.f45479b).f47912e;
                int i10 = themeActivity.f43839f;
                if (i10 == 1) {
                    D0 = org.telegram.ui.ActionBar.n6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.n6.D0();
                }
                org.telegram.ui.ActionBar.m6 m6Var = D0;
                if (i7 == i61Var.b() - 1) {
                    if (i10 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new x71(m6Var, false, 1, false, z13));
                } else {
                    org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) i61Var.f48547e.get(i7);
                    if (!TextUtils.isEmpty(k6Var.f29180o) && k6Var.f29168a != org.telegram.ui.ActionBar.n6.f29570n) {
                        org.telegram.ui.ActionBar.h6.a(false);
                    }
                    int i11 = m6Var.Z;
                    int i12 = k6Var.f29168a;
                    if (i11 != i12) {
                        if (i10 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.ui.ActionBar.n6.K1(m6Var, z12, i12, view);
                        org.telegram.ui.ActionBar.t3.q(m6Var, k6Var.f29168a);
                        org.telegram.ui.ActionBar.n6.M1(themeActivity);
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
                        themeActivity.presentFragment(new x71(m6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i13 = left - L;
                if (i13 < 0) {
                    f61Var.w0(i13, 0, null);
                } else {
                    int i14 = right + L;
                    if (i14 > f61Var.getMeasuredWidth()) {
                        f61Var.w0(i14 - f61Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = f61Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = f61Var.getChildAt(i15);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                jx0.a0((jx0) this.f45479b, (Context) this.f45480c, (String) this.d, view, i7);
                return;
        }
    }
}
