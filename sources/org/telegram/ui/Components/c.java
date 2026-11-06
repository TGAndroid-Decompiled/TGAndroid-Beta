package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class c implements View.OnClickListener {
    public final int f32345a;
    public final g0 f32346b;

    public c(g0 g0Var, int i7) {
        this.f32345a = i7;
        this.f32346b = g0Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f32345a;
        int i10 = 0;
        g0 g0Var = this.f32346b;
        switch (i7) {
            case 0:
                g0Var.dismiss();
                return;
            case 1:
                org.telegram.ui.Cells.k3 k3Var = g0Var.f33749s2;
                org.telegram.messenger.g0.v1(k3Var.d);
                g0Var.A2 = k3Var.getText().toString();
                g0Var.v1();
                g0Var.u1(true);
                g0Var.p1();
                return;
            case 2:
                if (g0Var.f33734c2 != null) {
                    TL_iv.RichMessage l1 = g0Var.l1();
                    if (l1 != null) {
                        g0Var.f33734c2.a(l1);
                    }
                } else if (g0Var.f33733b2 != null && g0Var.m1() != null) {
                    g0Var.f33733b2.a(g0Var.m1());
                }
                g0Var.dismiss();
                return;
            case 3:
                g0Var.dismiss();
                return;
            case 4:
                g0Var.H2 = false;
                g0Var.X0();
                g0Var.G2.O(true);
                g0Var.I0();
                return;
            case 5:
                final g0 g0Var2 = this.f32346b;
                k60 F = k60.F(g0Var2.f28618c, g0Var2.I0, view);
                F.X = org.telegram.messenger.g0.L(450.0f);
                F.f35217t = false;
                F.Y = true;
                ScrollView scrollView = new ScrollView(g0Var2.getContext());
                LinearLayout linearLayout = new LinearLayout(g0Var2.getContext());
                linearLayout.setOrientation(1);
                scrollView.addView(linearLayout);
                F.q(scrollView);
                ArrayList o4 = org.telegram.messenger.f10.o(null);
                ArrayList n10 = org.telegram.messenger.f10.n();
                if (!TextUtils.isEmpty(g0Var2.f33741k2)) {
                    g0Var2.g1(F, linearLayout, true, e21.K0(e21.O0(g0Var2.f33741k2, null, null)), null);
                }
                int size = o4.size();
                int i11 = 0;
                while (i11 < size) {
                    int i12 = i11 + 1;
                    final org.telegram.messenger.y00 y00Var = (org.telegram.messenger.y00) o4.get(i11);
                    if (!TextUtils.equals(y00Var.f26554a, g0Var2.f33741k2)) {
                        g0Var2.g1(F, linearLayout, false, y00Var.f26555b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        g0 g0Var3 = g0Var2;
                                        g0Var3.h1();
                                        String str = y00Var.f26554a;
                                        g0Var3.f33741k2 = str;
                                        e21.S0(str);
                                        g0Var3.p1();
                                        return;
                                    default:
                                        g0 g0Var4 = g0Var2;
                                        g0Var4.h1();
                                        String str2 = y00Var.f26554a;
                                        g0Var4.f33741k2 = str2;
                                        e21.S0(str2);
                                        g0Var4.p1();
                                        return;
                                }
                            }
                        });
                    }
                    i11 = i12;
                }
                View d1Var = new org.telegram.ui.ActionBar.d1(g0Var2.getContext(), g0Var2.I0);
                d1Var.setTag(2131296437, 1);
                linearLayout.addView(d1Var, c8.ha.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.y00 y00Var2 = (org.telegram.messenger.y00) obj;
                    g0Var2.g1(F, linearLayout, TextUtils.equals(y00Var2.f26554a, g0Var2.f33741k2), y00Var2.f26555b, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    g0 g0Var3 = g0Var2;
                                    g0Var3.h1();
                                    String str = y00Var2.f26554a;
                                    g0Var3.f33741k2 = str;
                                    e21.S0(str);
                                    g0Var3.p1();
                                    return;
                                default:
                                    g0 g0Var4 = g0Var2;
                                    g0Var4.h1();
                                    String str2 = y00Var2.f26554a;
                                    g0Var4.f33741k2 = str2;
                                    e21.S0(str2);
                                    g0Var4.p1();
                                    return;
                            }
                        }
                    });
                }
                F.Z();
                return;
            case 6:
                g0.d1(g0Var, view);
                return;
            case 7:
                if (!g0Var.J2) {
                    org.telegram.messenger.g0.g(g0Var.m1());
                    return;
                }
                return;
            case 8:
                g0Var.dismiss();
                return;
            default:
                g0Var.q1(0, 0, true);
                g0Var.dismiss();
                return;
        }
    }
}
