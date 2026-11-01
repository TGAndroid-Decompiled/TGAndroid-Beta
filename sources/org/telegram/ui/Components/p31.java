package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
public final class p31 implements View.OnClickListener {
    public final int f29346a;
    public final y31 f29347b;

    public p31(y31 y31Var, int i10) {
        this.f29346a = i10;
        this.f29347b = y31Var;
    }

    @Override
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z10;
        int i10 = this.f29346a;
        y31 y31Var = this.f29347b;
        switch (i10) {
            case 0:
                y31Var.dismiss();
                return;
            case 1:
                y31Var.dismiss();
                return;
            case 2:
                y31Var.dismiss();
                return;
            case 3:
                Spannable spannable = y31Var.U1;
                if (spannable != null) {
                    y31Var.V1.a(spannable);
                }
                y31Var.dismiss();
                return;
            default:
                final y31 y31Var2 = this.f29347b;
                z60 F = z60.F(y31Var2.f21590c, y31Var2.I0, view);
                F.X = org.telegram.messenger.i0.L(450.0f);
                int i11 = 0;
                F.f33045t = false;
                F.Y = true;
                ScrollView scrollView = new ScrollView(y31Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(y31Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                F.q(scrollView);
                int i12 = 0;
                while (i12 < y31Var2.Z1.length) {
                    if (y31Var2.Y1 == i12) {
                        linearLayout = linearLayout2;
                        z10 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z10 = false;
                    }
                    y31Var2.d1(F, linearLayout, z10, y31Var2.a2[i12], new qq(y31Var2, i12, 5));
                    i12++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View h1Var = new org.telegram.ui.ActionBar.h1(y31Var2.getContext(), y31Var2.I0);
                h1Var.setTag(2131296437, 1);
                linearLayout3.addView(h1Var, w7.b6.o(-1, 8));
                ArrayList o10 = org.telegram.messenger.u10.o(null);
                ArrayList n10 = org.telegram.messenger.u10.n();
                if (!TextUtils.isEmpty(y31Var2.X1)) {
                    y31Var2.d1(F, linearLayout3, true, n31.K0(n31.O0(y31Var2.X1, null, null)), null);
                }
                int size = o10.size();
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    final org.telegram.messenger.n10 n10Var = (org.telegram.messenger.n10) o10.get(i13);
                    if (!TextUtils.equals(n10Var.f17246a, y31Var2.X1)) {
                        y31Var2.d1(F, linearLayout3, false, n10Var.f17247b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        y31 y31Var3 = y31Var2;
                                        y31Var3.e1();
                                        String str = n10Var.f17246a;
                                        y31Var3.X1 = str;
                                        n31.S0(str);
                                        y31Var3.f1();
                                        return;
                                    default:
                                        y31 y31Var4 = y31Var2;
                                        y31Var4.e1();
                                        String str2 = n10Var.f17246a;
                                        y31Var4.X1 = str2;
                                        n31.S0(str2);
                                        y31Var4.f1();
                                        return;
                                }
                            }
                        });
                    }
                    i13 = i14;
                }
                View h1Var2 = new org.telegram.ui.ActionBar.h1(y31Var2.getContext(), y31Var2.I0);
                h1Var2.setTag(2131296437, 1);
                linearLayout3.addView(h1Var2, w7.b6.o(-1, 8));
                int size2 = n10.size();
                while (i11 < size2) {
                    Object obj = n10.get(i11);
                    i11++;
                    final org.telegram.messenger.n10 n10Var2 = (org.telegram.messenger.n10) obj;
                    y31Var2.d1(F, linearLayout3, TextUtils.equals(n10Var2.f17246a, y31Var2.X1), n10Var2.f17247b, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    y31 y31Var3 = y31Var2;
                                    y31Var3.e1();
                                    String str = n10Var2.f17246a;
                                    y31Var3.X1 = str;
                                    n31.S0(str);
                                    y31Var3.f1();
                                    return;
                                default:
                                    y31 y31Var4 = y31Var2;
                                    y31Var4.e1();
                                    String str2 = n10Var2.f17246a;
                                    y31Var4.X1 = str2;
                                    n31.S0(str2);
                                    y31Var4.f1();
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
