package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
public final class r21 implements View.OnClickListener {
    public final int f38833a;
    public final a31 f38834b;

    public r21(a31 a31Var, int i7) {
        this.f38833a = i7;
        this.f38834b = a31Var;
    }

    @Override
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z10;
        int i7 = this.f38833a;
        a31 a31Var = this.f38834b;
        switch (i7) {
            case 0:
                a31Var.dismiss();
                return;
            case 1:
                a31Var.dismiss();
                return;
            case 2:
                a31Var.dismiss();
                return;
            case 3:
                CharSequence charSequence = a31Var.Y1;
                if (charSequence != null) {
                    a31Var.Z1.a(charSequence);
                }
                a31Var.dismiss();
                return;
            default:
                final a31 a31Var2 = this.f38834b;
                m60 F = m60.F(a31Var2.f29685c, a31Var2.J0, view);
                F.X = org.telegram.messenger.g0.L(450.0f);
                int i10 = 0;
                F.f37112t = false;
                F.Y = true;
                ScrollView scrollView = new ScrollView(a31Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(a31Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                F.q(scrollView);
                int i11 = 0;
                while (i11 < a31Var2.d2.length) {
                    if (a31Var2.f32837c2 == i11) {
                        linearLayout = linearLayout2;
                        z10 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z10 = false;
                    }
                    a31Var2.d1(F, linearLayout, z10, a31Var2.f32838e2[i11], new a2(a31Var2, i11, 13));
                    i11++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View d1Var = new org.telegram.ui.ActionBar.d1(a31Var2.getContext(), a31Var2.J0);
                d1Var.setTag(2131296437, 1);
                linearLayout3.addView(d1Var, c8.ja.o(-1, 8));
                ArrayList o4 = org.telegram.messenger.c10.o(null);
                ArrayList n10 = org.telegram.messenger.c10.n();
                if (!TextUtils.isEmpty(a31Var2.f32836b2)) {
                    a31Var2.d1(F, linearLayout3, true, p21.K0(p21.O0(a31Var2.f32836b2, null, null)), null);
                }
                int size = o4.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    final org.telegram.messenger.v00 v00Var = (org.telegram.messenger.v00) o4.get(i12);
                    if (!TextUtils.equals(v00Var.f26916a, a31Var2.f32836b2)) {
                        a31Var2.d1(F, linearLayout3, false, v00Var.f26917b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        a31 a31Var3 = a31Var2;
                                        a31Var3.e1();
                                        String str = v00Var.f26916a;
                                        a31Var3.f32836b2 = str;
                                        p21.T0(str);
                                        a31Var3.f1();
                                        return;
                                    default:
                                        a31 a31Var4 = a31Var2;
                                        a31Var4.e1();
                                        String str2 = v00Var.f26916a;
                                        a31Var4.f32836b2 = str2;
                                        p21.T0(str2);
                                        a31Var4.f1();
                                        return;
                                }
                            }
                        });
                    }
                    i12 = i13;
                }
                View d1Var2 = new org.telegram.ui.ActionBar.d1(a31Var2.getContext(), a31Var2.J0);
                d1Var2.setTag(2131296437, 1);
                linearLayout3.addView(d1Var2, c8.ja.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.v00 v00Var2 = (org.telegram.messenger.v00) obj;
                    a31Var2.d1(F, linearLayout3, TextUtils.equals(v00Var2.f26916a, a31Var2.f32836b2), v00Var2.f26917b, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    a31 a31Var3 = a31Var2;
                                    a31Var3.e1();
                                    String str = v00Var2.f26916a;
                                    a31Var3.f32836b2 = str;
                                    p21.T0(str);
                                    a31Var3.f1();
                                    return;
                                default:
                                    a31 a31Var4 = a31Var2;
                                    a31Var4.e1();
                                    String str2 = v00Var2.f26916a;
                                    a31Var4.f32836b2 = str2;
                                    p21.T0(str2);
                                    a31Var4.f1();
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
