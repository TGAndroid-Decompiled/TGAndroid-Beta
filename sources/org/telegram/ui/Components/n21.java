package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
public final class n21 implements View.OnClickListener {
    public final int f36234a;
    public final w21 f36235b;

    public n21(w21 w21Var, int i7) {
        this.f36234a = i7;
        this.f36235b = w21Var;
    }

    @Override
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z9;
        int i7 = this.f36234a;
        w21 w21Var = this.f36235b;
        switch (i7) {
            case 0:
                w21Var.dismiss();
                return;
            case 1:
                w21Var.dismiss();
                return;
            case 2:
                w21Var.dismiss();
                return;
            case 3:
                CharSequence charSequence = w21Var.U1;
                if (charSequence != null) {
                    w21Var.V1.a(charSequence);
                }
                w21Var.dismiss();
                return;
            default:
                final w21 w21Var2 = this.f36235b;
                l60 F = l60.F(w21Var2.f28627c, w21Var2.I0, view);
                F.X = org.telegram.messenger.g0.L(450.0f);
                int i10 = 0;
                F.f35618t = false;
                F.Y = true;
                ScrollView scrollView = new ScrollView(w21Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(w21Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                F.q(scrollView);
                int i11 = 0;
                while (i11 < w21Var2.Z1.length) {
                    if (w21Var2.Y1 == i11) {
                        linearLayout = linearLayout2;
                        z9 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z9 = false;
                    }
                    w21Var2.d1(F, linearLayout, z9, w21Var2.f39880a2[i11], new r2(w21Var2, i11, 10));
                    i11++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View d1Var = new org.telegram.ui.ActionBar.d1(w21Var2.getContext(), w21Var2.I0);
                d1Var.setTag(2131296437, 1);
                linearLayout3.addView(d1Var, c8.ha.o(-1, 8));
                ArrayList o4 = org.telegram.messenger.f10.o(null);
                ArrayList n10 = org.telegram.messenger.f10.n();
                if (!TextUtils.isEmpty(w21Var2.X1)) {
                    w21Var2.d1(F, linearLayout3, true, l21.K0(l21.O0(w21Var2.X1, null, null)), null);
                }
                int size = o4.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    final org.telegram.messenger.y00 y00Var = (org.telegram.messenger.y00) o4.get(i12);
                    if (!TextUtils.equals(y00Var.f26569a, w21Var2.X1)) {
                        w21Var2.d1(F, linearLayout3, false, y00Var.f26570b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        w21 w21Var3 = w21Var2;
                                        w21Var3.e1();
                                        String str = y00Var.f26569a;
                                        w21Var3.X1 = str;
                                        l21.S0(str);
                                        w21Var3.f1();
                                        return;
                                    default:
                                        w21 w21Var4 = w21Var2;
                                        w21Var4.e1();
                                        String str2 = y00Var.f26569a;
                                        w21Var4.X1 = str2;
                                        l21.S0(str2);
                                        w21Var4.f1();
                                        return;
                                }
                            }
                        });
                    }
                    i12 = i13;
                }
                View d1Var2 = new org.telegram.ui.ActionBar.d1(w21Var2.getContext(), w21Var2.I0);
                d1Var2.setTag(2131296437, 1);
                linearLayout3.addView(d1Var2, c8.ha.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.y00 y00Var2 = (org.telegram.messenger.y00) obj;
                    w21Var2.d1(F, linearLayout3, TextUtils.equals(y00Var2.f26569a, w21Var2.X1), y00Var2.f26570b, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    w21 w21Var3 = w21Var2;
                                    w21Var3.e1();
                                    String str = y00Var2.f26569a;
                                    w21Var3.X1 = str;
                                    l21.S0(str);
                                    w21Var3.f1();
                                    return;
                                default:
                                    w21 w21Var4 = w21Var2;
                                    w21Var4.e1();
                                    String str2 = y00Var2.f26569a;
                                    w21Var4.X1 = str2;
                                    l21.S0(str2);
                                    w21Var4.f1();
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
