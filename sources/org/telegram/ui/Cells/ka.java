package org.telegram.ui.Cells;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.cd;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.ay;
import org.telegram.ui.un;
public final class ka implements View.OnClickListener {
    public final int f22197a = 0;
    public final boolean f22198b;
    public final int f22199c;
    public final org.telegram.ui.ActionBar.k2 d;
    public final Serializable e;

    public ka(un unVar, TLRPC.User user, String str, boolean z10, int i10) {
        this.d = unVar;
        this.e = str;
        this.f22198b = z10;
        this.f22199c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12 = this.f22197a;
        int i13 = this.f22199c;
        boolean z10 = this.f22198b;
        Serializable serializable = this.e;
        org.telegram.ui.ActionBar.k2 k2Var = this.d;
        switch (i12) {
            case 0:
                ay ayVar = (ay) k2Var;
                ArrayList arrayList = (ArrayList) serializable;
                String L0 = cd.L0(2131743932, null);
                int i14 = org.telegram.ui.ActionBar.t6.uj;
                SpannableStringBuilder R2 = org.telegram.messenger.i0.R2(L0, i14, 0, new f(ayVar, 10), null);
                SpannableString spannableString = new SpannableString(">");
                dq dqVar = new dq(2131230875, 0);
                dqVar.f25512y = org.telegram.ui.ActionBar.t6.x0(null, i14, false);
                dqVar.H = 0.7f;
                dqVar.I = 0.7f;
                dqVar.E = org.telegram.messenger.i0.L(12.0f);
                spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
                org.telegram.messenger.i0.J2(R2, spannableString, ">");
                cc a02 = cc.a0(ayVar);
                if (z10) {
                    i10 = 2131743933;
                } else {
                    i10 = 2131743934;
                }
                a02.I(2131623989, cd.L0(i10, null), R2).j();
                vp.r1(i13).T1().f(true, arrayList, new ag.z0(7));
                vp.r1(i13).T1().a();
                return;
            default:
                un unVar = (un) k2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.s4.f30123a;
                if (unVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.z2 h = z20.h(unVar.getParentActivity(), false, 1, null);
                    if (z10) {
                        i11 = 2131752194;
                    } else {
                        i11 = 2131752193;
                    }
                    h.O = cd.L0(i11, null);
                    h.P = true;
                    LinearLayout linearLayout = new LinearLayout(unVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(unVar.getParentActivity());
                    linearLayout.addView(textView, w7.b6.t(-1, -1, 0, 21, 0, 21, 8));
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setText(org.telegram.messenger.i0.W2(cd.a0("ChatWithAdminMessage", null, 2131752192, str, cd.s(i13, false))));
                    TextView textView2 = new TextView(unVar.getParentActivity());
                    textView2.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(org.telegram.messenger.i0.o());
                    textView2.setText(cd.L0(2131749283, null));
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Gi, null);
                    int L = org.telegram.messenger.i0.L(8.0f);
                    int i15 = org.telegram.ui.ActionBar.t6.Ci;
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, i15, false);
                    int i16 = org.telegram.ui.ActionBar.t6.Ei;
                    int x03 = org.telegram.ui.ActionBar.t6.x0(null, i16, false);
                    y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, x02, x03, x03);
                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
                    org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i16);
                    textView2.setBackground(k02);
                    org.telegram.ui.ActionBar.a7.k(textView2, k02, N, N2, null);
                    linearLayout.addView(textView2, w7.b6.t(-1, 48, 0, 16, 12, 16, 8));
                    h.N = linearLayout;
                    h.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.y2(h, 0));
                    return;
                }
                return;
        }
    }

    public ka(ay ayVar, boolean z10, int i10, ArrayList arrayList) {
        this.d = ayVar;
        this.f22198b = z10;
        this.f22199c = i10;
        this.e = arrayList;
    }
}
