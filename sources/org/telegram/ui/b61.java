package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ThemeActivity;
public final class b61 implements org.telegram.ui.Components.bj0 {
    public final int f43939a;
    public final Object f43940b;
    public final Object f43941c;
    public final Object d;

    public b61(Object obj, Object obj2, Object obj3, int i7) {
        this.f43939a = i7;
        this.f43940b = obj;
        this.f43941c = obj2;
        this.d = obj3;
    }

    @Override
    public final void c(int i7, View view) {
        org.telegram.ui.ActionBar.l6 D0;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f43939a) {
            case 0:
                j61 j61Var = (j61) this.f43941c;
                g61 g61Var = (g61) this.d;
                ThemeActivity themeActivity = ((h61) this.f43940b).f46233e;
                int i10 = themeActivity.f42018f;
                if (i10 == 1) {
                    D0 = org.telegram.ui.ActionBar.m6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.m6.D0();
                }
                org.telegram.ui.ActionBar.l6 l6Var = D0;
                if (i7 == j61Var.b() - 1) {
                    if (i10 == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    themeActivity.presentFragment(new x71(l6Var, false, 1, false, z12));
                } else {
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) j61Var.f46832e.get(i7);
                    if (!TextUtils.isEmpty(j6Var.f27621o) && j6Var.f27609a != org.telegram.ui.ActionBar.m6.f28066n) {
                        org.telegram.ui.ActionBar.g6.a(false);
                    }
                    int i11 = l6Var.Y;
                    int i12 = j6Var.f27609a;
                    if (i11 != i12) {
                        if (i10 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        org.telegram.ui.ActionBar.m6.K1(l6Var, z11, i12, view);
                        org.telegram.ui.ActionBar.s3.q(l6Var, j6Var.f27609a);
                        org.telegram.ui.ActionBar.m6.M1(themeActivity);
                    } else {
                        if (i12 >= 100) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (i10 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        themeActivity.presentFragment(new x71(l6Var, false, 1, z9, z10));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i13 = left - L;
                if (i13 < 0) {
                    g61Var.w0(i13, 0, null);
                } else {
                    int i14 = right + L;
                    if (i14 > g61Var.getMeasuredWidth()) {
                        g61Var.w0(i14 - g61Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = g61Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = g61Var.getChildAt(i15);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                lx0.a0((lx0) this.f43940b, (Context) this.f43941c, (String) this.d, view, i7);
                return;
        }
    }
}
