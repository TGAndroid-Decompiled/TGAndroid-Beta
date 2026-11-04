package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class d implements View.OnClickListener {
    public final int f32872a;
    public final e0 f32873b;

    public d(e0 e0Var, int i3) {
        this.f32872a = i3;
        this.f32873b = e0Var;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f32872a;
        int i10 = 0;
        e0 e0Var = this.f32873b;
        switch (i3) {
            case 0:
                e0Var.dismiss();
                return;
            case 1:
                org.telegram.ui.Cells.k3 k3Var = e0Var.f33252t2;
                org.telegram.messenger.g0.v1(k3Var.d);
                e0Var.B2 = k3Var.getText().toString();
                e0Var.v1();
                e0Var.u1(true);
                e0Var.p1();
                return;
            case 2:
                if (e0Var.f33236d2 != null) {
                    TL_iv.RichMessage l12 = e0Var.l1();
                    if (l12 != null) {
                        e0Var.f33236d2.a(l12);
                    }
                } else if (e0Var.c2 != null && e0Var.m1() != null) {
                    e0Var.c2.a(e0Var.m1());
                }
                e0Var.dismiss();
                return;
            case 3:
                e0Var.dismiss();
                return;
            case 4:
                e0Var.I2 = false;
                e0Var.X0();
                e0Var.H2.O(true);
                e0Var.I0();
                return;
            case 5:
                final e0 e0Var2 = this.f32873b;
                f60 F = f60.F(e0Var2.f28589c, e0Var2.J0, view);
                F.X = org.telegram.messenger.g0.L(450.0f);
                F.f33748t = false;
                F.Y = true;
                ScrollView scrollView = new ScrollView(e0Var2.getContext());
                LinearLayout linearLayout = new LinearLayout(e0Var2.getContext());
                linearLayout.setOrientation(1);
                scrollView.addView(linearLayout);
                F.q(scrollView);
                ArrayList o10 = org.telegram.messenger.x00.o(null);
                ArrayList n4 = org.telegram.messenger.x00.n();
                if (!TextUtils.isEmpty(e0Var2.f33244l2)) {
                    e0Var2.g1(F, linearLayout, true, f21.K0(f21.O0(e0Var2.f33244l2, null, null)), null);
                }
                int size = o10.size();
                int i11 = 0;
                while (i11 < size) {
                    int i12 = i11 + 1;
                    final org.telegram.messenger.q00 q00Var = (org.telegram.messenger.q00) o10.get(i11);
                    if (!TextUtils.equals(q00Var.f24844a, e0Var2.f33244l2)) {
                        e0Var2.g1(F, linearLayout, false, q00Var.f24845b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        e0 e0Var3 = e0Var2;
                                        e0Var3.h1();
                                        String str = q00Var.f24844a;
                                        e0Var3.f33244l2 = str;
                                        f21.S0(str);
                                        e0Var3.p1();
                                        return;
                                    default:
                                        e0 e0Var4 = e0Var2;
                                        e0Var4.h1();
                                        String str2 = q00Var.f24844a;
                                        e0Var4.f33244l2 = str2;
                                        f21.S0(str2);
                                        e0Var4.p1();
                                        return;
                                }
                            }
                        });
                    }
                    i11 = i12;
                }
                View c1Var = new org.telegram.ui.ActionBar.c1(e0Var2.getContext(), e0Var2.J0);
                c1Var.setTag(2131296437, 1);
                linearLayout.addView(c1Var, b8.mf.o(-1, 8));
                int size2 = n4.size();
                while (i10 < size2) {
                    Object obj = n4.get(i10);
                    i10++;
                    final org.telegram.messenger.q00 q00Var2 = (org.telegram.messenger.q00) obj;
                    e0Var2.g1(F, linearLayout, TextUtils.equals(q00Var2.f24844a, e0Var2.f33244l2), q00Var2.f24845b, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    e0 e0Var3 = e0Var2;
                                    e0Var3.h1();
                                    String str = q00Var2.f24844a;
                                    e0Var3.f33244l2 = str;
                                    f21.S0(str);
                                    e0Var3.p1();
                                    return;
                                default:
                                    e0 e0Var4 = e0Var2;
                                    e0Var4.h1();
                                    String str2 = q00Var2.f24844a;
                                    e0Var4.f33244l2 = str2;
                                    f21.S0(str2);
                                    e0Var4.p1();
                                    return;
                            }
                        }
                    });
                }
                F.Z();
                return;
            case 6:
                e0.d1(e0Var, view);
                return;
            case 7:
                if (!e0Var.K2) {
                    org.telegram.messenger.g0.g(e0Var.m1());
                    return;
                }
                return;
            case 8:
                e0Var.dismiss();
                return;
            default:
                e0Var.q1(0, 0, true);
                e0Var.dismiss();
                return;
        }
    }
}
