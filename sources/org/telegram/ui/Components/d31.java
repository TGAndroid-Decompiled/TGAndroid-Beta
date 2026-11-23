package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
public final class d31 implements View.OnClickListener {
    public final int f34367a;
    public final m31 f34368b;

    public d31(m31 m31Var, int i7) {
        this.f34367a = i7;
        this.f34368b = m31Var;
    }

    @Override
    public final void onClick(View view) {
        LinearLayout linearLayout;
        boolean z10;
        int i7 = this.f34367a;
        m31 m31Var = this.f34368b;
        switch (i7) {
            case 0:
                m31Var.dismiss();
                return;
            case 1:
                m31Var.dismiss();
                return;
            case 2:
                m31Var.dismiss();
                return;
            case 3:
                CharSequence charSequence = m31Var.Y1;
                if (charSequence != null) {
                    m31Var.Z1.a(charSequence);
                }
                m31Var.dismiss();
                return;
            default:
                final m31 m31Var2 = this.f34368b;
                a70 G = a70.G(m31Var2.f30179c, m31Var2.J0, view);
                G.f33365a0 = org.telegram.messenger.g0.L(450.0f);
                int i10 = 0;
                G.f33399t = false;
                G.f33367b0 = true;
                ScrollView scrollView = new ScrollView(m31Var2.getContext());
                LinearLayout linearLayout2 = new LinearLayout(m31Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                G.q(scrollView);
                int i11 = 0;
                while (i11 < m31Var2.d2.length) {
                    if (m31Var2.f37404c2 == i11) {
                        linearLayout = linearLayout2;
                        z10 = true;
                    } else {
                        linearLayout = linearLayout2;
                        z10 = false;
                    }
                    m31Var2.e1(G, linearLayout, z10, m31Var2.f37405e2[i11], new org.telegram.ui.ii(m31Var2, i11, 16));
                    i11++;
                    linearLayout2 = linearLayout;
                }
                LinearLayout linearLayout3 = linearLayout2;
                View d1Var = new org.telegram.ui.ActionBar.d1(m31Var2.getContext(), m31Var2.J0);
                d1Var.setTag(2131296439, 1);
                linearLayout3.addView(d1Var, c8.ma.o(-1, 8));
                ArrayList o4 = org.telegram.messenger.a10.o(null);
                ArrayList n10 = org.telegram.messenger.a10.n();
                if (!TextUtils.isEmpty(m31Var2.f37403b2)) {
                    m31Var2.e1(G, linearLayout3, true, b31.L0(b31.P0(m31Var2.f37403b2, null, null)), null);
                }
                int size = o4.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    final org.telegram.messenger.t00 t00Var = (org.telegram.messenger.t00) o4.get(i12);
                    if (!TextUtils.equals(t00Var.f26941a, m31Var2.f37403b2)) {
                        m31Var2.e1(G, linearLayout3, false, t00Var.f26942b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        m31 m31Var3 = m31Var2;
                                        m31Var3.f1();
                                        String str = t00Var.f26941a;
                                        m31Var3.f37403b2 = str;
                                        b31.U0(str);
                                        m31Var3.g1();
                                        return;
                                    default:
                                        m31 m31Var4 = m31Var2;
                                        m31Var4.f1();
                                        String str2 = t00Var.f26941a;
                                        m31Var4.f37403b2 = str2;
                                        b31.U0(str2);
                                        m31Var4.g1();
                                        return;
                                }
                            }
                        });
                    }
                    i12 = i13;
                }
                View d1Var2 = new org.telegram.ui.ActionBar.d1(m31Var2.getContext(), m31Var2.J0);
                d1Var2.setTag(2131296439, 1);
                linearLayout3.addView(d1Var2, c8.ma.o(-1, 8));
                int size2 = n10.size();
                while (i10 < size2) {
                    Object obj = n10.get(i10);
                    i10++;
                    final org.telegram.messenger.t00 t00Var2 = (org.telegram.messenger.t00) obj;
                    m31Var2.e1(G, linearLayout3, TextUtils.equals(t00Var2.f26941a, m31Var2.f37403b2), t00Var2.f26942b, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    m31 m31Var3 = m31Var2;
                                    m31Var3.f1();
                                    String str = t00Var2.f26941a;
                                    m31Var3.f37403b2 = str;
                                    b31.U0(str);
                                    m31Var3.g1();
                                    return;
                                default:
                                    m31 m31Var4 = m31Var2;
                                    m31Var4.f1();
                                    String str2 = t00Var2.f26941a;
                                    m31Var4.f37403b2 = str2;
                                    b31.U0(str2);
                                    m31Var4.g1();
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
