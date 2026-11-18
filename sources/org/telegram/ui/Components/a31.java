package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
public final class a31 implements View.OnClickListener {
    public final int f33238a;
    public final k31 f33239b;

    public a31(k31 k31Var, int i7) {
        this.f33238a = i7;
        this.f33239b = k31Var;
    }

    @Override
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z10;
        int i7 = this.f33238a;
        k31 k31Var = this.f33239b;
        switch (i7) {
            case 0:
                k31Var.dismiss();
                return;
            case 1:
                k31Var.dismiss();
                return;
            case 2:
                k31Var.dismiss();
                return;
            case 3:
                CharSequence charSequence = k31Var.Y1;
                if (charSequence != null) {
                    k31Var.Z1.a(charSequence);
                }
                k31Var.dismiss();
                return;
            default:
                final k31 k31Var2 = this.f33239b;
                y60 G = y60.G(k31Var2.f30195c, k31Var2.J0, view);
                G.f42343a0 = org.telegram.messenger.g0.L(450.0f);
                int i10 = 0;
                G.f42377t = false;
                G.f42345b0 = true;
                ScrollView scrollView = new ScrollView(k31Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(k31Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                G.q(scrollView);
                int i11 = 0;
                while (i11 < k31Var2.d2.length) {
                    if (k31Var2.f36667c2 == i11) {
                        linearLayout = linearLayout2;
                        z10 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z10 = false;
                    }
                    k31Var2.e1(G, linearLayout, z10, k31Var2.f36668e2[i11], new org.telegram.ui.ii(k31Var2, i11, 16));
                    i11++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View e1Var = new org.telegram.ui.ActionBar.e1(k31Var2.getContext(), k31Var2.J0);
                e1Var.setTag(2131296437, 1);
                linearLayout3.addView(e1Var, c8.ma.o(-1, 8));
                ArrayList o4 = org.telegram.messenger.z00.o(null);
                ArrayList n10 = org.telegram.messenger.z00.n();
                if (!TextUtils.isEmpty(k31Var2.f36666b2)) {
                    k31Var2.e1(G, linearLayout3, true, y21.L0(y21.P0(k31Var2.f36666b2, null, null)), null);
                }
                int size = o4.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    final org.telegram.messenger.s00 s00Var = (org.telegram.messenger.s00) o4.get(i12);
                    if (!TextUtils.equals(s00Var.f26718a, k31Var2.f36666b2)) {
                        k31Var2.e1(G, linearLayout3, false, s00Var.f26719b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        k31 k31Var3 = k31Var2;
                                        k31Var3.f1();
                                        String str = s00Var.f26718a;
                                        k31Var3.f36666b2 = str;
                                        y21.U0(str);
                                        k31Var3.g1();
                                        return;
                                    default:
                                        k31 k31Var4 = k31Var2;
                                        k31Var4.f1();
                                        String str2 = s00Var.f26718a;
                                        k31Var4.f36666b2 = str2;
                                        y21.U0(str2);
                                        k31Var4.g1();
                                        return;
                                }
                            }
                        });
                    }
                    i12 = i13;
                }
                View e1Var2 = new org.telegram.ui.ActionBar.e1(k31Var2.getContext(), k31Var2.J0);
                e1Var2.setTag(2131296437, 1);
                linearLayout3.addView(e1Var2, c8.ma.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.s00 s00Var2 = (org.telegram.messenger.s00) obj;
                    k31Var2.e1(G, linearLayout3, TextUtils.equals(s00Var2.f26718a, k31Var2.f36666b2), s00Var2.f26719b, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    k31 k31Var3 = k31Var2;
                                    k31Var3.f1();
                                    String str = s00Var2.f26718a;
                                    k31Var3.f36666b2 = str;
                                    y21.U0(str);
                                    k31Var3.g1();
                                    return;
                                default:
                                    k31 k31Var4 = k31Var2;
                                    k31Var4.f1();
                                    String str2 = s00Var2.f26718a;
                                    k31Var4.f36666b2 = str2;
                                    y21.U0(str2);
                                    k31Var4.g1();
                                    return;
                            }
                        }
                    });
                }
                G.a0();
                return;
        }
    }
}
