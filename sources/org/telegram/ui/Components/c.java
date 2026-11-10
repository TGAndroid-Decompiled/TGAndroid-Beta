package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class c implements View.OnClickListener {
    public final int f32398a;
    public final f0 f32399b;

    public c(f0 f0Var, int i7) {
        this.f32398a = i7;
        this.f32399b = f0Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f32398a;
        int i10 = 0;
        f0 f0Var = this.f32399b;
        switch (i7) {
            case 0:
                f0Var.dismiss();
                return;
            case 1:
                org.telegram.ui.Cells.k3 k3Var = f0Var.f33425v2;
                org.telegram.messenger.g0.v1(k3Var.d);
                f0Var.D2 = k3Var.getText().toString();
                f0Var.v1();
                f0Var.u1(true);
                f0Var.p1();
                return;
            case 2:
                if (f0Var.f33409f2 != null) {
                    TL_iv.RichMessage l1 = f0Var.l1();
                    if (l1 != null) {
                        f0Var.f33409f2.a(l1);
                    }
                } else if (f0Var.f33408e2 != null && f0Var.m1() != null) {
                    f0Var.f33408e2.a(f0Var.m1());
                }
                f0Var.dismiss();
                return;
            case 3:
                f0Var.dismiss();
                return;
            case 4:
                f0Var.K2 = false;
                f0Var.X0();
                f0Var.J2.O(true);
                f0Var.I0();
                return;
            case 5:
                final f0 f0Var2 = this.f32399b;
                k60 F = k60.F(f0Var2.f28675c, f0Var2.I0, view);
                F.X = org.telegram.messenger.g0.L(450.0f);
                F.f35220t = false;
                F.Y = true;
                ScrollView scrollView = new ScrollView(f0Var2.getContext());
                LinearLayout linearLayout = new LinearLayout(f0Var2.getContext());
                linearLayout.setOrientation(1);
                scrollView.addView(linearLayout);
                F.q(scrollView);
                ArrayList o4 = org.telegram.messenger.f10.o(null);
                ArrayList n10 = org.telegram.messenger.f10.n();
                if (!TextUtils.isEmpty(f0Var2.f33417n2)) {
                    f0Var2.g1(F, linearLayout, true, k21.K0(k21.O0(f0Var2.f33417n2, null, null)), null);
                }
                int size = o4.size();
                int i11 = 0;
                while (i11 < size) {
                    int i12 = i11 + 1;
                    final org.telegram.messenger.y00 y00Var = (org.telegram.messenger.y00) o4.get(i11);
                    if (!TextUtils.equals(y00Var.f26573a, f0Var2.f33417n2)) {
                        f0Var2.g1(F, linearLayout, false, y00Var.f26574b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        f0 f0Var3 = f0Var2;
                                        f0Var3.h1();
                                        String str = y00Var.f26573a;
                                        f0Var3.f33417n2 = str;
                                        k21.S0(str);
                                        f0Var3.p1();
                                        return;
                                    default:
                                        f0 f0Var4 = f0Var2;
                                        f0Var4.h1();
                                        String str2 = y00Var.f26573a;
                                        f0Var4.f33417n2 = str2;
                                        k21.S0(str2);
                                        f0Var4.p1();
                                        return;
                                }
                            }
                        });
                    }
                    i11 = i12;
                }
                View d1Var = new org.telegram.ui.ActionBar.d1(f0Var2.getContext(), f0Var2.I0);
                d1Var.setTag(2131296437, 1);
                linearLayout.addView(d1Var, c8.ha.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.y00 y00Var2 = (org.telegram.messenger.y00) obj;
                    f0Var2.g1(F, linearLayout, TextUtils.equals(y00Var2.f26573a, f0Var2.f33417n2), y00Var2.f26574b, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    f0 f0Var3 = f0Var2;
                                    f0Var3.h1();
                                    String str = y00Var2.f26573a;
                                    f0Var3.f33417n2 = str;
                                    k21.S0(str);
                                    f0Var3.p1();
                                    return;
                                default:
                                    f0 f0Var4 = f0Var2;
                                    f0Var4.h1();
                                    String str2 = y00Var2.f26573a;
                                    f0Var4.f33417n2 = str2;
                                    k21.S0(str2);
                                    f0Var4.p1();
                                    return;
                            }
                        }
                    });
                }
                F.Z();
                return;
            case 6:
                f0.d1(f0Var, view);
                return;
            case 7:
                if (!f0Var.M2) {
                    org.telegram.messenger.g0.g(f0Var.m1());
                    return;
                }
                return;
            case 8:
                f0Var.dismiss();
                return;
            default:
                f0Var.q1(0, 0, true);
                f0Var.dismiss();
                return;
        }
    }
}
