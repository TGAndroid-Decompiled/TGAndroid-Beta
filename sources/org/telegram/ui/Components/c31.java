package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
public final class c31 implements View.OnClickListener {
    public final int f33919a;
    public final l31 f33920b;

    public c31(l31 l31Var, int i7) {
        this.f33919a = i7;
        this.f33920b = l31Var;
    }

    @Override
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z10;
        int i7 = this.f33919a;
        l31 l31Var = this.f33920b;
        switch (i7) {
            case 0:
                l31Var.dismiss();
                return;
            case 1:
                l31Var.dismiss();
                return;
            case 2:
                l31Var.dismiss();
                return;
            case 3:
                CharSequence charSequence = l31Var.Y1;
                if (charSequence != null) {
                    l31Var.Z1.a(charSequence);
                }
                l31Var.dismiss();
                return;
            default:
                final l31 l31Var2 = this.f33920b;
                x60 G = x60.G(l31Var2.f30229c, l31Var2.J0, view);
                G.f41860a0 = org.telegram.messenger.g0.L(450.0f);
                int i10 = 0;
                G.f41894t = false;
                G.f41862b0 = true;
                ScrollView scrollView = new ScrollView(l31Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(l31Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                G.q(scrollView);
                int i11 = 0;
                while (i11 < l31Var2.d2.length) {
                    if (l31Var2.f37012c2 == i11) {
                        linearLayout = linearLayout2;
                        z10 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z10 = false;
                    }
                    l31Var2.e1(G, linearLayout, z10, l31Var2.f37013e2[i11], new org.telegram.ui.ii(l31Var2, i11, 18));
                    i11++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View d1Var = new org.telegram.ui.ActionBar.d1(l31Var2.getContext(), l31Var2.J0);
                d1Var.setTag(2131296439, 1);
                linearLayout3.addView(d1Var, c8.na.o(-1, 8));
                ArrayList o4 = org.telegram.messenger.y00.o(null);
                ArrayList n10 = org.telegram.messenger.y00.n();
                if (!TextUtils.isEmpty(l31Var2.f37011b2)) {
                    l31Var2.e1(G, linearLayout3, true, a31.L0(a31.P0(l31Var2.f37011b2, null, null)), null);
                }
                int size = o4.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    final org.telegram.messenger.r00 r00Var = (org.telegram.messenger.r00) o4.get(i12);
                    if (!TextUtils.equals(r00Var.f26618a, l31Var2.f37011b2)) {
                        l31Var2.e1(G, linearLayout3, false, r00Var.f26619b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        l31 l31Var3 = l31Var2;
                                        l31Var3.f1();
                                        String str = r00Var.f26618a;
                                        l31Var3.f37011b2 = str;
                                        a31.U0(str);
                                        l31Var3.g1();
                                        return;
                                    default:
                                        l31 l31Var4 = l31Var2;
                                        l31Var4.f1();
                                        String str2 = r00Var.f26618a;
                                        l31Var4.f37011b2 = str2;
                                        a31.U0(str2);
                                        l31Var4.g1();
                                        return;
                                }
                            }
                        });
                    }
                    i12 = i13;
                }
                View d1Var2 = new org.telegram.ui.ActionBar.d1(l31Var2.getContext(), l31Var2.J0);
                d1Var2.setTag(2131296439, 1);
                linearLayout3.addView(d1Var2, c8.na.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.r00 r00Var2 = (org.telegram.messenger.r00) obj;
                    l31Var2.e1(G, linearLayout3, TextUtils.equals(r00Var2.f26618a, l31Var2.f37011b2), r00Var2.f26619b, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    l31 l31Var3 = l31Var2;
                                    l31Var3.f1();
                                    String str = r00Var2.f26618a;
                                    l31Var3.f37011b2 = str;
                                    a31.U0(str);
                                    l31Var3.g1();
                                    return;
                                default:
                                    l31 l31Var4 = l31Var2;
                                    l31Var4.f1();
                                    String str2 = r00Var2.f26618a;
                                    l31Var4.f37011b2 = str2;
                                    a31.U0(str2);
                                    l31Var4.g1();
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
