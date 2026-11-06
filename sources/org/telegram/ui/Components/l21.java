package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
public final class l21 implements View.OnClickListener {
    public final int f35515a;
    public final u21 f35516b;

    public l21(u21 u21Var, int i7) {
        this.f35515a = i7;
        this.f35516b = u21Var;
    }

    @Override
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z9;
        int i7 = this.f35515a;
        u21 u21Var = this.f35516b;
        switch (i7) {
            case 0:
                u21Var.dismiss();
                return;
            case 1:
                u21Var.dismiss();
                return;
            case 2:
                u21Var.dismiss();
                return;
            case 3:
                CharSequence charSequence = u21Var.U1;
                if (charSequence != null) {
                    u21Var.V1.a(charSequence);
                }
                u21Var.dismiss();
                return;
            default:
                final u21 u21Var2 = this.f35516b;
                k60 F = k60.F(u21Var2.f28618c, u21Var2.I0, view);
                F.X = org.telegram.messenger.g0.L(450.0f);
                int i10 = 0;
                F.f35181t = false;
                F.Y = true;
                ScrollView scrollView = new ScrollView(u21Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(u21Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                F.q(scrollView);
                int i11 = 0;
                while (i11 < u21Var2.Z1.length) {
                    if (u21Var2.Y1 == i11) {
                        linearLayout = linearLayout2;
                        z9 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z9 = false;
                    }
                    u21Var2.d1(F, linearLayout, z9, u21Var2.f38483a2[i11], new r2(u21Var2, i11, 10));
                    i11++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View d1Var = new org.telegram.ui.ActionBar.d1(u21Var2.getContext(), u21Var2.I0);
                d1Var.setTag(2131296437, 1);
                linearLayout3.addView(d1Var, c8.ha.o(-1, 8));
                ArrayList o4 = org.telegram.messenger.f10.o(null);
                ArrayList n10 = org.telegram.messenger.f10.n();
                if (!TextUtils.isEmpty(u21Var2.X1)) {
                    u21Var2.d1(F, linearLayout3, true, j21.K0(j21.O0(u21Var2.X1, null, null)), null);
                }
                int size = o4.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    final org.telegram.messenger.y00 y00Var = (org.telegram.messenger.y00) o4.get(i12);
                    if (!TextUtils.equals(y00Var.f26554a, u21Var2.X1)) {
                        u21Var2.d1(F, linearLayout3, false, y00Var.f26555b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        u21 u21Var3 = u21Var2;
                                        u21Var3.e1();
                                        String str = y00Var.f26554a;
                                        u21Var3.X1 = str;
                                        j21.S0(str);
                                        u21Var3.f1();
                                        return;
                                    default:
                                        u21 u21Var4 = u21Var2;
                                        u21Var4.e1();
                                        String str2 = y00Var.f26554a;
                                        u21Var4.X1 = str2;
                                        j21.S0(str2);
                                        u21Var4.f1();
                                        return;
                                }
                            }
                        });
                    }
                    i12 = i13;
                }
                View d1Var2 = new org.telegram.ui.ActionBar.d1(u21Var2.getContext(), u21Var2.I0);
                d1Var2.setTag(2131296437, 1);
                linearLayout3.addView(d1Var2, c8.ha.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.y00 y00Var2 = (org.telegram.messenger.y00) obj;
                    u21Var2.d1(F, linearLayout3, TextUtils.equals(y00Var2.f26554a, u21Var2.X1), y00Var2.f26555b, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    u21 u21Var3 = u21Var2;
                                    u21Var3.e1();
                                    String str = y00Var2.f26554a;
                                    u21Var3.X1 = str;
                                    j21.S0(str);
                                    u21Var3.f1();
                                    return;
                                default:
                                    u21 u21Var4 = u21Var2;
                                    u21Var4.e1();
                                    String str2 = y00Var2.f26554a;
                                    u21Var4.X1 = str2;
                                    j21.S0(str2);
                                    u21Var4.f1();
                                    return;
                            }
                        }
                    });
                }
                F.Z();
                return;
        }
    }
}
