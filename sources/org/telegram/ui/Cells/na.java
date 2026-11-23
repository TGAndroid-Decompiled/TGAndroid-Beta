package org.telegram.ui.Cells;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kq;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
public final class na implements View.OnClickListener {
    public final int f31220a = 1;
    public final boolean f31221b;
    public final int f31222c;
    public final org.telegram.ui.ActionBar.g2 d;
    public final Serializable f31223e;

    public na(bn bnVar, TLRPC.User user, String str, boolean z10, int i7) {
        this.d = bnVar;
        this.f31223e = str;
        this.f31221b = z10;
        this.f31222c = i7;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        int i11 = this.f31220a;
        int i12 = this.f31222c;
        boolean z10 = this.f31221b;
        Serializable serializable = this.f31223e;
        org.telegram.ui.ActionBar.g2 g2Var = this.d;
        switch (i11) {
            case 0:
                bx bxVar = (bx) g2Var;
                ArrayList arrayList = (ArrayList) serializable;
                String N0 = gd.N0(2131743660, null);
                int i13 = org.telegram.ui.ActionBar.n6.xj;
                SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(N0, i13, 0, new f(bxVar, 12), null);
                SpannableString spannableString = new SpannableString(">");
                kq kqVar = new kq(2131230875, 0);
                kqVar.f36857y = org.telegram.ui.ActionBar.n6.x0(null, i13, false);
                kqVar.I = 0.7f;
                kqVar.J = 0.7f;
                kqVar.F = org.telegram.messenger.g0.L(12.0f);
                spannableString.setSpan(kqVar, 0, spannableString.length(), 33);
                org.telegram.messenger.g0.K2(R2, spannableString, ">");
                kc b02 = kc.b0(bxVar);
                if (z10) {
                    i7 = 2131743661;
                } else {
                    i7 = 2131743662;
                }
                b02.I(2131623990, gd.N0(i7, null), R2).j();
                mp.u1(i12).W1().f(true, arrayList, new fi.e(8));
                mp.u1(i12).W1().a();
                return;
            default:
                bn bnVar = (bn) g2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.b5.f33627a;
                if (bnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w2 j3 = m10.j(bnVar.getParentActivity(), false, 1, null);
                    if (z10) {
                        i10 = 2131752182;
                    } else {
                        i10 = 2131752181;
                    }
                    j3.P = gd.N0(i10, null);
                    j3.Q = true;
                    LinearLayout linearLayout = new LinearLayout(bnVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(bnVar.getParentActivity());
                    linearLayout.addView(textView, c8.na.t(-1, -1, 0, 21, 0, 21, 8));
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setText(org.telegram.messenger.g0.W2(gd.a0("ChatWithAdminMessage", null, 2131752180, str, gd.s(i12, false))));
                    TextView textView2 = new TextView(bnVar.getParentActivity());
                    textView2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setText(gd.N0(2131749081, null));
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.Ji, null);
                    int L = org.telegram.messenger.g0.L(8.0f);
                    int i14 = org.telegram.ui.ActionBar.n6.Fi;
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, i14, false);
                    int i15 = org.telegram.ui.ActionBar.n6.Hi;
                    int x03 = org.telegram.ui.ActionBar.n6.x0(null, i15, false);
                    y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, x02, x03, x03);
                    org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
                    org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i15);
                    textView2.setBackground(k02);
                    org.telegram.ui.ActionBar.u6.j(textView2, k02, M, M2, null);
                    linearLayout.addView(textView2, c8.na.t(-1, 48, 0, 16, 12, 16, 8));
                    j3.O = linearLayout;
                    j3.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.e3(j3, 0));
                    return;
                }
                return;
        }
    }

    public na(bx bxVar, boolean z10, int i7, ArrayList arrayList) {
        this.d = bxVar;
        this.f31221b = z10;
        this.f31222c = i7;
        this.f31223e = arrayList;
    }
}
