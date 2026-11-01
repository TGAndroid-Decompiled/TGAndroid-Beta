package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ThemeActivity;
public final class p71 implements org.telegram.ui.Components.hk0 {
    public final int f40383a;
    public final Object f40384b;
    public final Object f40385c;
    public final Object d;

    public p71(Object obj, Object obj2, Object obj3, int i10) {
        this.f40383a = i10;
        this.f40384b = obj;
        this.f40385c = obj2;
        this.d = obj3;
    }

    @Override
    public final void f(int i10, View view) {
        org.telegram.ui.ActionBar.s6 D0;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f40383a) {
            case 0:
                x71 x71Var = (x71) this.f40385c;
                u71 u71Var = (u71) this.d;
                ThemeActivity themeActivity = ((v71) this.f40384b).e;
                int i11 = themeActivity.f34102f;
                if (i11 == 1) {
                    D0 = org.telegram.ui.ActionBar.t6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.t6.D0();
                }
                org.telegram.ui.ActionBar.s6 s6Var = D0;
                if (i10 == x71Var.b() - 1) {
                    if (i11 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new k91(s6Var, false, 1, false, z13));
                } else {
                    org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) x71Var.e.get(i10);
                    if (!TextUtils.isEmpty(r6Var.f20742o) && r6Var.f20731a != org.telegram.ui.ActionBar.t6.f21109n) {
                        org.telegram.ui.ActionBar.o6.a(false);
                    }
                    int i12 = s6Var.Y;
                    int i13 = r6Var.f20731a;
                    if (i12 != i13) {
                        if (i11 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.ui.ActionBar.t6.K1(s6Var, z12, i13, view);
                        org.telegram.ui.ActionBar.y3.q(s6Var, r6Var.f20731a);
                        org.telegram.ui.ActionBar.t6.M1(themeActivity);
                    } else {
                        if (i13 >= 100) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i11 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        themeActivity.presentFragment(new k91(s6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.i0.L(52.0f);
                int i14 = left - L;
                if (i14 < 0) {
                    u71Var.w0(i14, 0, null);
                } else {
                    int i15 = right + L;
                    if (i15 > u71Var.getMeasuredWidth()) {
                        u71Var.w0(i15 - u71Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = u71Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = u71Var.getChildAt(i16);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                ty0.a0((ty0) this.f40384b, (Context) this.f40385c, (String) this.d, view, i10);
                return;
        }
    }
}
