package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class c implements View.OnClickListener {
    public final int f24943a;
    public final g0 f24944b;

    public c(g0 g0Var, int i10) {
        this.f24943a = i10;
        this.f24944b = g0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f24943a;
        int i11 = 0;
        g0 g0Var = this.f24944b;
        switch (i10) {
            case 0:
                g0Var.dismiss();
                return;
            case 1:
                org.telegram.ui.Cells.m3 m3Var = g0Var.f26257s2;
                org.telegram.messenger.i0.v1(m3Var.d);
                g0Var.A2 = m3Var.getText().toString();
                g0Var.v1();
                g0Var.u1(true);
                g0Var.p1();
                return;
            case 2:
                if (g0Var.f26241c2 != null) {
                    TL_iv.RichMessage l1 = g0Var.l1();
                    if (l1 != null) {
                        g0Var.f26241c2.a(l1);
                    }
                } else if (g0Var.f26240b2 != null && g0Var.m1() != null) {
                    g0Var.f26240b2.a(g0Var.m1());
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
                final g0 g0Var2 = this.f24944b;
                z60 F = z60.F(g0Var2.f21590c, g0Var2.I0, view);
                F.X = org.telegram.messenger.i0.L(450.0f);
                F.f33045t = false;
                F.Y = true;
                ScrollView scrollView = new ScrollView(g0Var2.getContext());
                LinearLayout linearLayout = new LinearLayout(g0Var2.getContext());
                linearLayout.setOrientation(1);
                scrollView.addView(linearLayout);
                F.q(scrollView);
                ArrayList o10 = org.telegram.messenger.u10.o(null);
                ArrayList n10 = org.telegram.messenger.u10.n();
                if (!TextUtils.isEmpty(g0Var2.f26249k2)) {
                    g0Var2.g1(F, linearLayout, true, n31.K0(n31.O0(g0Var2.f26249k2, null, null)), null);
                }
                int size = o10.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    final org.telegram.messenger.n10 n10Var = (org.telegram.messenger.n10) o10.get(i12);
                    if (!TextUtils.equals(n10Var.f17246a, g0Var2.f26249k2)) {
                        g0Var2.g1(F, linearLayout, false, n10Var.f17247b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        g0 g0Var3 = g0Var2;
                                        g0Var3.h1();
                                        String str = n10Var.f17246a;
                                        g0Var3.f26249k2 = str;
                                        n31.S0(str);
                                        g0Var3.p1();
                                        return;
                                    default:
                                        g0 g0Var4 = g0Var2;
                                        g0Var4.h1();
                                        String str2 = n10Var.f17246a;
                                        g0Var4.f26249k2 = str2;
                                        n31.S0(str2);
                                        g0Var4.p1();
                                        return;
                                }
                            }
                        });
                    }
                    i12 = i13;
                }
                View h1Var = new org.telegram.ui.ActionBar.h1(g0Var2.getContext(), g0Var2.I0);
                h1Var.setTag(2131296437, 1);
                linearLayout.addView(h1Var, w7.b6.o(-1, 8));
                int size2 = n10.size();
                while (i11 < size2) {
                    Object obj = n10.get(i11);
                    i11++;
                    final org.telegram.messenger.n10 n10Var2 = (org.telegram.messenger.n10) obj;
                    g0Var2.g1(F, linearLayout, TextUtils.equals(n10Var2.f17246a, g0Var2.f26249k2), n10Var2.f17247b, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    g0 g0Var3 = g0Var2;
                                    g0Var3.h1();
                                    String str = n10Var2.f17246a;
                                    g0Var3.f26249k2 = str;
                                    n31.S0(str);
                                    g0Var3.p1();
                                    return;
                                default:
                                    g0 g0Var4 = g0Var2;
                                    g0Var4.h1();
                                    String str2 = n10Var2.f17246a;
                                    g0Var4.f26249k2 = str2;
                                    n31.S0(str2);
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
                    org.telegram.messenger.i0.g(g0Var.m1());
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
