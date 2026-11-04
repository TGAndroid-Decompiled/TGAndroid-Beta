package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
public final class h21 implements View.OnClickListener {
    public final int f34283a;
    public final q21 f34284b;

    public h21(q21 q21Var, int i3) {
        this.f34283a = i3;
        this.f34284b = q21Var;
    }

    @Override
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z10;
        int i3 = this.f34283a;
        q21 q21Var = this.f34284b;
        switch (i3) {
            case 0:
                q21Var.dismiss();
                return;
            case 1:
                q21Var.dismiss();
                return;
            case 2:
                q21Var.dismiss();
                return;
            case 3:
                CharSequence charSequence = q21Var.V1;
                if (charSequence != null) {
                    q21Var.W1.a(charSequence);
                }
                q21Var.dismiss();
                return;
            default:
                final q21 q21Var2 = this.f34284b;
                f60 F = f60.F(q21Var2.f28589c, q21Var2.J0, view);
                F.X = org.telegram.messenger.g0.L(450.0f);
                int i10 = 0;
                F.f33748t = false;
                F.Y = true;
                ScrollView scrollView = new ScrollView(q21Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(q21Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                F.q(scrollView);
                int i11 = 0;
                while (i11 < q21Var2.f37328a2.length) {
                    if (q21Var2.Z1 == i11) {
                        linearLayout = linearLayout2;
                        z10 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z10 = false;
                    }
                    q21Var2.d1(F, linearLayout, z10, q21Var2.f37329b2[i11], new o2(q21Var2, i11, 10));
                    i11++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View c1Var = new org.telegram.ui.ActionBar.c1(q21Var2.getContext(), q21Var2.J0);
                c1Var.setTag(2131296437, 1);
                linearLayout3.addView(c1Var, b8.mf.o(-1, 8));
                ArrayList o10 = org.telegram.messenger.x00.o(null);
                ArrayList n4 = org.telegram.messenger.x00.n();
                if (!TextUtils.isEmpty(q21Var2.Y1)) {
                    q21Var2.d1(F, linearLayout3, true, f21.K0(f21.O0(q21Var2.Y1, null, null)), null);
                }
                int size = o10.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    final org.telegram.messenger.q00 q00Var = (org.telegram.messenger.q00) o10.get(i12);
                    if (!TextUtils.equals(q00Var.f24844a, q21Var2.Y1)) {
                        q21Var2.d1(F, linearLayout3, false, q00Var.f24845b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        q21 q21Var3 = q21Var2;
                                        q21Var3.e1();
                                        String str = q00Var.f24844a;
                                        q21Var3.Y1 = str;
                                        f21.S0(str);
                                        q21Var3.f1();
                                        return;
                                    default:
                                        q21 q21Var4 = q21Var2;
                                        q21Var4.e1();
                                        String str2 = q00Var.f24844a;
                                        q21Var4.Y1 = str2;
                                        f21.S0(str2);
                                        q21Var4.f1();
                                        return;
                                }
                            }
                        });
                    }
                    i12 = i13;
                }
                View c1Var2 = new org.telegram.ui.ActionBar.c1(q21Var2.getContext(), q21Var2.J0);
                c1Var2.setTag(2131296437, 1);
                linearLayout3.addView(c1Var2, b8.mf.o(-1, 8));
                int size2 = n4.size();
                while (i10 < size2) {
                    Object obj = n4.get(i10);
                    i10++;
                    final org.telegram.messenger.q00 q00Var2 = (org.telegram.messenger.q00) obj;
                    q21Var2.d1(F, linearLayout3, TextUtils.equals(q00Var2.f24844a, q21Var2.Y1), q00Var2.f24845b, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    q21 q21Var3 = q21Var2;
                                    q21Var3.e1();
                                    String str = q00Var2.f24844a;
                                    q21Var3.Y1 = str;
                                    f21.S0(str);
                                    q21Var3.f1();
                                    return;
                                default:
                                    q21 q21Var4 = q21Var2;
                                    q21Var4.e1();
                                    String str2 = q00Var2.f24844a;
                                    q21Var4.Y1 = str2;
                                    f21.S0(str2);
                                    q21Var4.f1();
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
