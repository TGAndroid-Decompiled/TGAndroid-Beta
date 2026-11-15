package org.telegram.ui.Cells;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.an;
import org.telegram.ui.yw;
public final class ka implements View.OnClickListener {
    public final int f30574a = 1;
    public final boolean f30575b;
    public final int f30576c;
    public final org.telegram.ui.ActionBar.e2 d;
    public final Serializable f30577e;

    public ka(an anVar, TLRPC.User user, String str, boolean z10, int i7) {
        this.d = anVar;
        this.f30577e = str;
        this.f30575b = z10;
        this.f30576c = i7;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        int i11 = this.f30574a;
        int i12 = this.f30576c;
        boolean z10 = this.f30575b;
        Serializable serializable = this.f30577e;
        org.telegram.ui.ActionBar.e2 e2Var = this.d;
        switch (i11) {
            case 0:
                yw ywVar = (yw) e2Var;
                ArrayList arrayList = (ArrayList) serializable;
                String M0 = hd.M0(2131743907, null);
                int i13 = org.telegram.ui.ActionBar.j6.xj;
                SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(M0, i13, 0, new f(ywVar, 12), null);
                SpannableString spannableString = new SpannableString(">");
                eq eqVar = new eq(2131230875, 0);
                eqVar.f34419y = org.telegram.ui.ActionBar.j6.x0(null, i13, false);
                eqVar.I = 0.7f;
                eqVar.J = 0.7f;
                eqVar.F = org.telegram.messenger.g0.L(12.0f);
                spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
                org.telegram.messenger.g0.K2(S2, spannableString, ">");
                cc a02 = cc.a0(ywVar);
                if (z10) {
                    i7 = 2131743908;
                } else {
                    i7 = 2131743909;
                }
                a02.I(2131623990, hd.M0(i7, null), S2).j();
                np.s1(i12).U1().f(true, arrayList, new fi.e(8));
                np.s1(i12).U1().a();
                return;
            default:
                an anVar = (an) e2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.t4.f39507a;
                if (anVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u2 i14 = i20.i(anVar.getParentActivity(), false, 1, null);
                    if (z10) {
                        i10 = 2131752194;
                    } else {
                        i10 = 2131752193;
                    }
                    i14.P = hd.M0(i10, null);
                    i14.Q = true;
                    LinearLayout linearLayout = new LinearLayout(anVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(anVar.getParentActivity());
                    linearLayout.addView(textView, c8.ja.t(-1, -1, 0, 21, 0, 21, 8));
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setText(org.telegram.messenger.g0.X2(hd.a0("ChatWithAdminMessage", null, 2131752192, str, hd.s(i12, false))));
                    TextView textView2 = new TextView(anVar.getParentActivity());
                    textView2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setText(hd.M0(2131749274, null));
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.Ji, null);
                    int L = org.telegram.messenger.g0.L(8.0f);
                    int i15 = org.telegram.ui.ActionBar.j6.Fi;
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, i15, false);
                    int i16 = org.telegram.ui.ActionBar.j6.Hi;
                    int x03 = org.telegram.ui.ActionBar.j6.x0(null, i16, false);
                    y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, x02, x03, x03);
                    org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i15);
                    org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i16);
                    textView2.setBackground(k02);
                    org.telegram.ui.ActionBar.q6.j(textView2, k02, M, M2, null);
                    linearLayout.addView(textView2, c8.ja.t(-1, 48, 0, 16, 12, 16, 8));
                    i14.O = linearLayout;
                    i14.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.w2(i14, 0));
                    return;
                }
                return;
        }
    }

    public ka(yw ywVar, boolean z10, int i7, ArrayList arrayList) {
        this.d = ywVar;
        this.f30575b = z10;
        this.f30576c = i7;
        this.f30577e = arrayList;
    }
}
