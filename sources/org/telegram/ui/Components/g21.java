package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
public final class g21 implements View.OnClickListener {
    public final int f33811a;
    public final p21 f33812b;

    public g21(p21 p21Var, int i7) {
        this.f33811a = i7;
        this.f33812b = p21Var;
    }

    @Override
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z9;
        int i7 = this.f33811a;
        p21 p21Var = this.f33812b;
        switch (i7) {
            case 0:
                p21Var.dismiss();
                return;
            case 1:
                p21Var.dismiss();
                return;
            case 2:
                p21Var.dismiss();
                return;
            case 3:
                CharSequence charSequence = p21Var.U1;
                if (charSequence != null) {
                    p21Var.V1.a(charSequence);
                }
                p21Var.dismiss();
                return;
            default:
                final p21 p21Var2 = this.f33812b;
                k60 F = k60.F(p21Var2.f28618c, p21Var2.I0, view);
                F.X = org.telegram.messenger.g0.L(450.0f);
                int i10 = 0;
                F.f35217t = false;
                F.Y = true;
                ScrollView scrollView = new ScrollView(p21Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(p21Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                F.q(scrollView);
                int i11 = 0;
                while (i11 < p21Var2.Z1.length) {
                    if (p21Var2.Y1 == i11) {
                        linearLayout = linearLayout2;
                        z9 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z9 = false;
                    }
                    p21Var2.d1(F, linearLayout, z9, p21Var2.f36869a2[i11], new r2(p21Var2, i11, 10));
                    i11++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View d1Var = new org.telegram.ui.ActionBar.d1(p21Var2.getContext(), p21Var2.I0);
                d1Var.setTag(2131296437, 1);
                linearLayout3.addView(d1Var, c8.ha.o(-1, 8));
                ArrayList o4 = org.telegram.messenger.f10.o(null);
                ArrayList n10 = org.telegram.messenger.f10.n();
                if (!TextUtils.isEmpty(p21Var2.X1)) {
                    p21Var2.d1(F, linearLayout3, true, e21.K0(e21.O0(p21Var2.X1, null, null)), null);
                }
                int size = o4.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    final org.telegram.messenger.y00 y00Var = (org.telegram.messenger.y00) o4.get(i12);
                    if (!TextUtils.equals(y00Var.f26554a, p21Var2.X1)) {
                        p21Var2.d1(F, linearLayout3, false, y00Var.f26555b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        p21 p21Var3 = p21Var2;
                                        p21Var3.e1();
                                        String str = y00Var.f26554a;
                                        p21Var3.X1 = str;
                                        e21.S0(str);
                                        p21Var3.f1();
                                        return;
                                    default:
                                        p21 p21Var4 = p21Var2;
                                        p21Var4.e1();
                                        String str2 = y00Var.f26554a;
                                        p21Var4.X1 = str2;
                                        e21.S0(str2);
                                        p21Var4.f1();
                                        return;
                                }
                            }
                        });
                    }
                    i12 = i13;
                }
                View d1Var2 = new org.telegram.ui.ActionBar.d1(p21Var2.getContext(), p21Var2.I0);
                d1Var2.setTag(2131296437, 1);
                linearLayout3.addView(d1Var2, c8.ha.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.y00 y00Var2 = (org.telegram.messenger.y00) obj;
                    p21Var2.d1(F, linearLayout3, TextUtils.equals(y00Var2.f26554a, p21Var2.X1), y00Var2.f26555b, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    p21 p21Var3 = p21Var2;
                                    p21Var3.e1();
                                    String str = y00Var2.f26554a;
                                    p21Var3.X1 = str;
                                    e21.S0(str);
                                    p21Var3.f1();
                                    return;
                                default:
                                    p21 p21Var4 = p21Var2;
                                    p21Var4.e1();
                                    String str2 = y00Var2.f26554a;
                                    p21Var4.X1 = str2;
                                    e21.S0(str2);
                                    p21Var4.f1();
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
