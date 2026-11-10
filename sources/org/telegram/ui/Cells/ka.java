package org.telegram.ui.Cells;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.wp;
import org.telegram.ui.cn;
import org.telegram.ui.zw;
public final class ka implements View.OnClickListener {
    public final int f29471a = 1;
    public final boolean f29472b;
    public final int f29473c;
    public final org.telegram.ui.ActionBar.f2 d;
    public final Serializable f29474e;

    public ka(cn cnVar, TLRPC.User user, String str, boolean z9, int i7) {
        this.d = cnVar;
        this.f29474e = str;
        this.f29472b = z9;
        this.f29473c = i7;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        int i11 = this.f29471a;
        int i12 = this.f29473c;
        boolean z9 = this.f29472b;
        Serializable serializable = this.f29474e;
        org.telegram.ui.ActionBar.f2 f2Var = this.d;
        switch (i11) {
            case 0:
                zw zwVar = (zw) f2Var;
                ArrayList arrayList = (ArrayList) serializable;
                String M0 = id.M0(2131743907, null);
                int i13 = org.telegram.ui.ActionBar.m6.uj;
                SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(M0, i13, 0, new f(zwVar, 11), null);
                SpannableString spannableString = new SpannableString(">");
                wp wpVar = new wp(2131230875, 0);
                wpVar.f40042y = org.telegram.ui.ActionBar.m6.x0(null, i13, false);
                wpVar.H = 0.7f;
                wpVar.I = 0.7f;
                wpVar.E = org.telegram.messenger.g0.L(12.0f);
                spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
                org.telegram.messenger.g0.K2(S2, spannableString, ">");
                gc a02 = gc.a0(zwVar);
                if (z9) {
                    i7 = 2131743908;
                } else {
                    i7 = 2131743909;
                }
                a02.I(2131623989, id.M0(i7, null), S2).j();
                qp.s1(i12).U1().f(true, arrayList, new di.e(8));
                qp.s1(i12).U1().a();
                return;
            default:
                cn cnVar = (cn) f2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.u4.f38507a;
                if (cnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w2 h = org.telegram.messenger.camera.q.h(cnVar.getParentActivity(), false, 1, null);
                    if (z9) {
                        i10 = 2131752194;
                    } else {
                        i10 = 2131752193;
                    }
                    h.O = id.M0(i10, null);
                    h.P = true;
                    LinearLayout linearLayout = new LinearLayout(cnVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(cnVar.getParentActivity());
                    linearLayout.addView(textView, c8.ha.t(-1, -1, 0, 21, 0, 21, 8));
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setText(org.telegram.messenger.g0.X2(id.a0("ChatWithAdminMessage", null, 2131752192, str, id.s(i12, false))));
                    TextView textView2 = new TextView(cnVar.getParentActivity());
                    textView2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setText(id.M0(2131749274, null));
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Gi, null);
                    int L = org.telegram.messenger.g0.L(8.0f);
                    int i14 = org.telegram.ui.ActionBar.m6.Ci;
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, i14, false);
                    int i15 = org.telegram.ui.ActionBar.m6.Ei;
                    int x03 = org.telegram.ui.ActionBar.m6.x0(null, i15, false);
                    y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, x02, x03, x03);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
                    org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i15);
                    textView2.setBackground(k02);
                    org.telegram.ui.ActionBar.t6.j(textView2, k02, M, M2, null);
                    linearLayout.addView(textView2, c8.ha.t(-1, 48, 0, 16, 12, 16, 8));
                    h.N = linearLayout;
                    h.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.x2(h, 0));
                    return;
                }
                return;
        }
    }

    public ka(zw zwVar, boolean z9, int i7, ArrayList arrayList) {
        this.d = zwVar;
        this.f29472b = z9;
        this.f29473c = i7;
        this.f29474e = arrayList;
    }
}
