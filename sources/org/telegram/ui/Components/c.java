package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class c implements View.OnClickListener {
    public final int f24920a;
    public final g0 f24921b;

    public c(g0 g0Var, int i10) {
        this.f24920a = i10;
        this.f24921b = g0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f24920a;
        int i11 = 0;
        g0 g0Var = this.f24921b;
        switch (i10) {
            case 0:
                g0Var.dismiss();
                return;
            case 1:
                org.telegram.ui.Cells.m3 m3Var = g0Var.f26196s2;
                org.telegram.messenger.i0.v1(m3Var.d);
                g0Var.A2 = m3Var.getText().toString();
                g0Var.v1();
                g0Var.u1(true);
                g0Var.p1();
                return;
            case 2:
                if (g0Var.f26180c2 != null) {
                    TL_iv.RichMessage l1 = g0Var.l1();
                    if (l1 != null) {
                        g0Var.f26180c2.a(l1);
                    }
                } else if (g0Var.f26179b2 != null && g0Var.m1() != null) {
                    g0Var.f26179b2.a(g0Var.m1());
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
                final g0 g0Var2 = this.f24921b;
                z60 F = z60.F(g0Var2.f21589c, g0Var2.I0, view);
                F.X = org.telegram.messenger.i0.L(450.0f);
                F.f32942t = false;
                F.Y = true;
                ScrollView scrollView = new ScrollView(g0Var2.getContext());
                LinearLayout linearLayout = new LinearLayout(g0Var2.getContext());
                linearLayout.setOrientation(1);
                scrollView.addView(linearLayout);
                F.q(scrollView);
                ArrayList o10 = org.telegram.messenger.t10.o(null);
                ArrayList n10 = org.telegram.messenger.t10.n();
                if (!TextUtils.isEmpty(g0Var2.f26188k2)) {
                    g0Var2.g1(F, linearLayout, true, m31.K0(m31.O0(g0Var2.f26188k2, null, null)), null);
                }
                int size = o10.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    final org.telegram.messenger.m10 m10Var = (org.telegram.messenger.m10) o10.get(i12);
                    if (!TextUtils.equals(m10Var.f16857a, g0Var2.f26188k2)) {
                        g0Var2.g1(F, linearLayout, false, m10Var.f16858b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        g0 g0Var3 = g0Var2;
                                        g0Var3.h1();
                                        String str = m10Var.f16857a;
                                        g0Var3.f26188k2 = str;
                                        m31.S0(str);
                                        g0Var3.p1();
                                        return;
                                    default:
                                        g0 g0Var4 = g0Var2;
                                        g0Var4.h1();
                                        String str2 = m10Var.f16857a;
                                        g0Var4.f26188k2 = str2;
                                        m31.S0(str2);
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
                    final org.telegram.messenger.m10 m10Var2 = (org.telegram.messenger.m10) obj;
                    g0Var2.g1(F, linearLayout, TextUtils.equals(m10Var2.f16857a, g0Var2.f26188k2), m10Var2.f16858b, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    g0 g0Var3 = g0Var2;
                                    g0Var3.h1();
                                    String str = m10Var2.f16857a;
                                    g0Var3.f26188k2 = str;
                                    m31.S0(str);
                                    g0Var3.p1();
                                    return;
                                default:
                                    g0 g0Var4 = g0Var2;
                                    g0Var4.h1();
                                    String str2 = m10Var2.f16857a;
                                    g0Var4.f26188k2 = str2;
                                    m31.S0(str2);
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
