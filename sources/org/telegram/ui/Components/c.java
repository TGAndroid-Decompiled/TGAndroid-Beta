package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class c implements View.OnClickListener {
    public final int f33435a;
    public final d0 f33436b;

    public c(d0 d0Var, int i7) {
        this.f33435a = i7;
        this.f33436b = d0Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f33435a;
        int i10 = 0;
        d0 d0Var = this.f33436b;
        switch (i7) {
            case 0:
                d0Var.dismiss();
                return;
            case 1:
                org.telegram.ui.Cells.k3 k3Var = d0Var.f33768w2;
                org.telegram.messenger.g0.v1(k3Var.d);
                d0Var.E2 = k3Var.getText().toString();
                d0Var.v1();
                d0Var.u1(true);
                d0Var.p1();
                return;
            case 2:
                if (d0Var.f33752g2 != null) {
                    TL_iv.RichMessage l1 = d0Var.l1();
                    if (l1 != null) {
                        d0Var.f33752g2.a(l1);
                    }
                } else if (d0Var.f33751f2 != null && d0Var.m1() != null) {
                    d0Var.f33751f2.a(d0Var.m1());
                }
                d0Var.dismiss();
                return;
            case 3:
                d0Var.dismiss();
                return;
            case 4:
                d0Var.L2 = false;
                d0Var.X0();
                d0Var.K2.O(true);
                d0Var.I0();
                return;
            case 5:
                final d0 d0Var2 = this.f33436b;
                m60 F = m60.F(d0Var2.f29685c, d0Var2.J0, view);
                F.X = org.telegram.messenger.g0.L(450.0f);
                F.f37112t = false;
                F.Y = true;
                ScrollView scrollView = new ScrollView(d0Var2.getContext());
                LinearLayout linearLayout = new LinearLayout(d0Var2.getContext());
                linearLayout.setOrientation(1);
                scrollView.addView(linearLayout);
                F.q(scrollView);
                ArrayList o4 = org.telegram.messenger.c10.o(null);
                ArrayList n10 = org.telegram.messenger.c10.n();
                if (!TextUtils.isEmpty(d0Var2.f33760o2)) {
                    d0Var2.g1(F, linearLayout, true, p21.K0(p21.O0(d0Var2.f33760o2, null, null)), null);
                }
                int size = o4.size();
                int i11 = 0;
                while (i11 < size) {
                    int i12 = i11 + 1;
                    final org.telegram.messenger.v00 v00Var = (org.telegram.messenger.v00) o4.get(i11);
                    if (!TextUtils.equals(v00Var.f26916a, d0Var2.f33760o2)) {
                        d0Var2.g1(F, linearLayout, false, v00Var.f26917b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d0 d0Var3 = d0Var2;
                                        d0Var3.h1();
                                        String str = v00Var.f26916a;
                                        d0Var3.f33760o2 = str;
                                        p21.T0(str);
                                        d0Var3.p1();
                                        return;
                                    default:
                                        d0 d0Var4 = d0Var2;
                                        d0Var4.h1();
                                        String str2 = v00Var.f26916a;
                                        d0Var4.f33760o2 = str2;
                                        p21.T0(str2);
                                        d0Var4.p1();
                                        return;
                                }
                            }
                        });
                    }
                    i11 = i12;
                }
                View d1Var = new org.telegram.ui.ActionBar.d1(d0Var2.getContext(), d0Var2.J0);
                d1Var.setTag(2131296437, 1);
                linearLayout.addView(d1Var, c8.ja.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.v00 v00Var2 = (org.telegram.messenger.v00) obj;
                    d0Var2.g1(F, linearLayout, TextUtils.equals(v00Var2.f26916a, d0Var2.f33760o2), v00Var2.f26917b, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    d0 d0Var3 = d0Var2;
                                    d0Var3.h1();
                                    String str = v00Var2.f26916a;
                                    d0Var3.f33760o2 = str;
                                    p21.T0(str);
                                    d0Var3.p1();
                                    return;
                                default:
                                    d0 d0Var4 = d0Var2;
                                    d0Var4.h1();
                                    String str2 = v00Var2.f26916a;
                                    d0Var4.f33760o2 = str2;
                                    p21.T0(str2);
                                    d0Var4.p1();
                                    return;
                            }
                        }
                    });
                }
                F.Z();
                return;
            case 6:
                d0.d1(d0Var, view);
                return;
            case 7:
                if (!d0Var.N2) {
                    org.telegram.messenger.g0.g(d0Var.m1());
                    return;
                }
                return;
            case 8:
                d0Var.dismiss();
                return;
            default:
                d0Var.q1(0, 0, true);
                d0Var.dismiss();
                return;
        }
    }
}
