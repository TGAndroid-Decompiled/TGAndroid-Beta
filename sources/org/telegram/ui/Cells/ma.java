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
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nq;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
public final class ma implements View.OnClickListener {
    public final int f31115a = 1;
    public final boolean f31116b;
    public final int f31117c;
    public final org.telegram.ui.ActionBar.g2 d;
    public final Serializable f31118e;

    public ma(bn bnVar, TLRPC.User user, String str, boolean z10, int i7) {
        this.d = bnVar;
        this.f31118e = str;
        this.f31116b = z10;
        this.f31117c = i7;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        int i11 = this.f31115a;
        int i12 = this.f31117c;
        boolean z10 = this.f31116b;
        Serializable serializable = this.f31118e;
        org.telegram.ui.ActionBar.g2 g2Var = this.d;
        switch (i11) {
            case 0:
                cx cxVar = (cx) g2Var;
                ArrayList arrayList = (ArrayList) serializable;
                String N0 = hd.N0(2131743662, null);
                int i13 = org.telegram.ui.ActionBar.m6.xj;
                SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(N0, i13, 0, new f(cxVar, 12), null);
                SpannableString spannableString = new SpannableString(">");
                nq nqVar = new nq(2131230875, 0);
                nqVar.f37954y = org.telegram.ui.ActionBar.m6.x0(null, i13, false);
                nqVar.I = 0.7f;
                nqVar.J = 0.7f;
                nqVar.F = org.telegram.messenger.g0.L(12.0f);
                spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
                org.telegram.messenger.g0.K2(R2, spannableString, ">");
                lc b02 = lc.b0(cxVar);
                if (z10) {
                    i7 = 2131743663;
                } else {
                    i7 = 2131743664;
                }
                b02.I(2131623990, hd.N0(i7, null), R2).j();
                np.u1(i12).W1().f(true, arrayList, new fi.e(8));
                np.u1(i12).W1().a();
                return;
            default:
                bn bnVar = (bn) g2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.c5.f34013a;
                if (bnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w2 j3 = o10.j(bnVar.getParentActivity(), false, 1, null);
                    if (z10) {
                        i10 = 2131752182;
                    } else {
                        i10 = 2131752181;
                    }
                    j3.P = hd.N0(i10, null);
                    j3.Q = true;
                    LinearLayout linearLayout = new LinearLayout(bnVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(bnVar.getParentActivity());
                    linearLayout.addView(textView, c8.ma.t(-1, -1, 0, 21, 0, 21, 8));
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setText(org.telegram.messenger.g0.W2(hd.a0("ChatWithAdminMessage", null, 2131752180, str, hd.s(i12, false))));
                    TextView textView2 = new TextView(bnVar.getParentActivity());
                    textView2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setText(hd.N0(2131749081, null));
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Ji, null);
                    int L = org.telegram.messenger.g0.L(8.0f);
                    int i14 = org.telegram.ui.ActionBar.m6.Fi;
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, i14, false);
                    int i15 = org.telegram.ui.ActionBar.m6.Hi;
                    int x03 = org.telegram.ui.ActionBar.m6.x0(null, i15, false);
                    y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, x02, x03, x03);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
                    org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i15);
                    textView2.setBackground(k02);
                    org.telegram.ui.ActionBar.t6.j(textView2, k02, M, M2, null);
                    linearLayout.addView(textView2, c8.ma.t(-1, 48, 0, 16, 12, 16, 8));
                    j3.O = linearLayout;
                    j3.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.f3(j3, 0));
                    return;
                }
                return;
        }
    }

    public ma(cx cxVar, boolean z10, int i7, ArrayList arrayList) {
        this.d = cxVar;
        this.f31116b = z10;
        this.f31117c = i7;
        this.f31118e = arrayList;
    }
}
