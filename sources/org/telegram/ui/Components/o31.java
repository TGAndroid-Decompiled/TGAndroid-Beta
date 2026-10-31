package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
public final class o31 implements View.OnClickListener {
    public final int f28966a;
    public final x31 f28967b;

    public o31(x31 x31Var, int i10) {
        this.f28966a = i10;
        this.f28967b = x31Var;
    }

    @Override
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z10;
        int i10 = this.f28966a;
        x31 x31Var = this.f28967b;
        switch (i10) {
            case 0:
                x31Var.dismiss();
                return;
            case 1:
                x31Var.dismiss();
                return;
            case 2:
                x31Var.dismiss();
                return;
            case 3:
                Spannable spannable = x31Var.U1;
                if (spannable != null) {
                    x31Var.V1.a(spannable);
                }
                x31Var.dismiss();
                return;
            default:
                final x31 x31Var2 = this.f28967b;
                z60 F = z60.F(x31Var2.f21589c, x31Var2.I0, view);
                F.X = org.telegram.messenger.i0.L(450.0f);
                int i11 = 0;
                F.f32942t = false;
                F.Y = true;
                ScrollView scrollView = new ScrollView(x31Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(x31Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                F.q(scrollView);
                int i12 = 0;
                while (i12 < x31Var2.Z1.length) {
                    if (x31Var2.Y1 == i12) {
                        linearLayout = linearLayout2;
                        z10 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z10 = false;
                    }
                    x31Var2.d1(F, linearLayout, z10, x31Var2.a2[i12], new qq(x31Var2, i12, 5));
                    i12++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View h1Var = new org.telegram.ui.ActionBar.h1(x31Var2.getContext(), x31Var2.I0);
                h1Var.setTag(2131296437, 1);
                linearLayout3.addView(h1Var, w7.b6.o(-1, 8));
                ArrayList o10 = org.telegram.messenger.t10.o(null);
                ArrayList n10 = org.telegram.messenger.t10.n();
                if (!TextUtils.isEmpty(x31Var2.X1)) {
                    x31Var2.d1(F, linearLayout3, true, m31.K0(m31.O0(x31Var2.X1, null, null)), null);
                }
                int size = o10.size();
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    final org.telegram.messenger.m10 m10Var = (org.telegram.messenger.m10) o10.get(i13);
                    if (!TextUtils.equals(m10Var.f16857a, x31Var2.X1)) {
                        x31Var2.d1(F, linearLayout3, false, m10Var.f16858b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        x31 x31Var3 = x31Var2;
                                        x31Var3.e1();
                                        String str = m10Var.f16857a;
                                        x31Var3.X1 = str;
                                        m31.S0(str);
                                        x31Var3.f1();
                                        return;
                                    default:
                                        x31 x31Var4 = x31Var2;
                                        x31Var4.e1();
                                        String str2 = m10Var.f16857a;
                                        x31Var4.X1 = str2;
                                        m31.S0(str2);
                                        x31Var4.f1();
                                        return;
                                }
                            }
                        });
                    }
                    i13 = i14;
                }
                View h1Var2 = new org.telegram.ui.ActionBar.h1(x31Var2.getContext(), x31Var2.I0);
                h1Var2.setTag(2131296437, 1);
                linearLayout3.addView(h1Var2, w7.b6.o(-1, 8));
                int size2 = n10.size();
                while (i11 < size2) {
                    Object obj = n10.get(i11);
                    i11++;
                    final org.telegram.messenger.m10 m10Var2 = (org.telegram.messenger.m10) obj;
                    x31Var2.d1(F, linearLayout3, TextUtils.equals(m10Var2.f16857a, x31Var2.X1), m10Var2.f16858b, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    x31 x31Var3 = x31Var2;
                                    x31Var3.e1();
                                    String str = m10Var2.f16857a;
                                    x31Var3.X1 = str;
                                    m31.S0(str);
                                    x31Var3.f1();
                                    return;
                                default:
                                    x31 x31Var4 = x31Var2;
                                    x31Var4.e1();
                                    String str2 = m10Var2.f16857a;
                                    x31Var4.X1 = str2;
                                    m31.S0(str2);
                                    x31Var4.f1();
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
