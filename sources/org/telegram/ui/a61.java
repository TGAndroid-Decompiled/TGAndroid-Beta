package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ThemeActivity;
public final class a61 implements org.telegram.ui.Components.cj0 {
    public final int f43598a;
    public final Object f43599b;
    public final Object f43600c;
    public final Object d;

    public a61(Object obj, Object obj2, Object obj3, int i7) {
        this.f43598a = i7;
        this.f43599b = obj;
        this.f43600c = obj2;
        this.d = obj3;
    }

    @Override
    public final void c(int i7, View view) {
        org.telegram.ui.ActionBar.k6 D0;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f43598a) {
            case 0:
                i61 i61Var = (i61) this.f43600c;
                f61 f61Var = (f61) this.d;
                ThemeActivity themeActivity = ((g61) this.f43599b).f45922e;
                int i10 = themeActivity.f42027f;
                if (i10 == 1) {
                    D0 = org.telegram.ui.ActionBar.l6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.l6.D0();
                }
                org.telegram.ui.ActionBar.k6 k6Var = D0;
                if (i7 == i61Var.b() - 1) {
                    if (i10 == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    themeActivity.presentFragment(new w71(k6Var, false, 1, false, z12));
                } else {
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) i61Var.f46477e.get(i7);
                    if (!TextUtils.isEmpty(i6Var.f27583o) && i6Var.f27571a != org.telegram.ui.ActionBar.l6.f28041n) {
                        org.telegram.ui.ActionBar.f6.a(false);
                    }
                    int i11 = k6Var.Y;
                    int i12 = i6Var.f27571a;
                    if (i11 != i12) {
                        if (i10 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        org.telegram.ui.ActionBar.l6.K1(k6Var, z11, i12, view);
                        org.telegram.ui.ActionBar.r3.q(k6Var, i6Var.f27571a);
                        org.telegram.ui.ActionBar.l6.M1(themeActivity);
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
                        themeActivity.presentFragment(new w71(k6Var, false, 1, z9, z10));
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
                kx0.a0((kx0) this.f43599b, (Context) this.f43600c, (String) this.d, view, i7);
                return;
        }
    }
}
