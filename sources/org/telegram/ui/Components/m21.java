package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
public final class m21 implements View.OnClickListener {
    public final int f35870a;
    public final v21 f35871b;

    public m21(v21 v21Var, int i7) {
        this.f35870a = i7;
        this.f35871b = v21Var;
    }

    @Override
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z9;
        int i7 = this.f35870a;
        v21 v21Var = this.f35871b;
        switch (i7) {
            case 0:
                v21Var.dismiss();
                return;
            case 1:
                v21Var.dismiss();
                return;
            case 2:
                v21Var.dismiss();
                return;
            case 3:
                CharSequence charSequence = v21Var.U1;
                if (charSequence != null) {
                    v21Var.V1.a(charSequence);
                }
                v21Var.dismiss();
                return;
            default:
                final v21 v21Var2 = this.f35871b;
                k60 F = k60.F(v21Var2.f28622c, v21Var2.I0, view);
                F.X = org.telegram.messenger.g0.L(450.0f);
                int i10 = 0;
                F.f35232t = false;
                F.Y = true;
                ScrollView scrollView = new ScrollView(v21Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(v21Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                F.q(scrollView);
                int i11 = 0;
                while (i11 < v21Var2.Z1.length) {
                    if (v21Var2.Y1 == i11) {
                        linearLayout = linearLayout2;
                        z9 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z9 = false;
                    }
                    v21Var2.d1(F, linearLayout, z9, v21Var2.f38832a2[i11], new r2(v21Var2, i11, 10));
                    i11++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View d1Var = new org.telegram.ui.ActionBar.d1(v21Var2.getContext(), v21Var2.I0);
                d1Var.setTag(2131296437, 1);
                linearLayout3.addView(d1Var, c8.ha.o(-1, 8));
                ArrayList o4 = org.telegram.messenger.f10.o(null);
                ArrayList n10 = org.telegram.messenger.f10.n();
                if (!TextUtils.isEmpty(v21Var2.X1)) {
                    v21Var2.d1(F, linearLayout3, true, k21.K0(k21.O0(v21Var2.X1, null, null)), null);
                }
                int size = o4.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    final org.telegram.messenger.y00 y00Var = (org.telegram.messenger.y00) o4.get(i12);
                    if (!TextUtils.equals(y00Var.f26569a, v21Var2.X1)) {
                        v21Var2.d1(F, linearLayout3, false, y00Var.f26570b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        v21 v21Var3 = v21Var2;
                                        v21Var3.e1();
                                        String str = y00Var.f26569a;
                                        v21Var3.X1 = str;
                                        k21.S0(str);
                                        v21Var3.f1();
                                        return;
                                    default:
                                        v21 v21Var4 = v21Var2;
                                        v21Var4.e1();
                                        String str2 = y00Var.f26569a;
                                        v21Var4.X1 = str2;
                                        k21.S0(str2);
                                        v21Var4.f1();
                                        return;
                                }
                            }
                        });
                    }
                    i12 = i13;
                }
                View d1Var2 = new org.telegram.ui.ActionBar.d1(v21Var2.getContext(), v21Var2.I0);
                d1Var2.setTag(2131296437, 1);
                linearLayout3.addView(d1Var2, c8.ha.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.y00 y00Var2 = (org.telegram.messenger.y00) obj;
                    v21Var2.d1(F, linearLayout3, TextUtils.equals(y00Var2.f26569a, v21Var2.X1), y00Var2.f26570b, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    v21 v21Var3 = v21Var2;
                                    v21Var3.e1();
                                    String str = y00Var2.f26569a;
                                    v21Var3.X1 = str;
                                    k21.S0(str);
                                    v21Var3.f1();
                                    return;
                                default:
                                    v21 v21Var4 = v21Var2;
                                    v21Var4.e1();
                                    String str2 = y00Var2.f26569a;
                                    v21Var4.X1 = str2;
                                    k21.S0(str2);
                                    v21Var4.f1();
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
