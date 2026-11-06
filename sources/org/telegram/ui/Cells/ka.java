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
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.wp;
import org.telegram.ui.an;
import org.telegram.ui.ww;
public final class ka implements View.OnClickListener {
    public final int f29452a = 1;
    public final boolean f29453b;
    public final int f29454c;
    public final org.telegram.ui.ActionBar.f2 d;
    public final Serializable f29455e;

    public ka(an anVar, TLRPC.User user, String str, boolean z9, int i7) {
        this.d = anVar;
        this.f29455e = str;
        this.f29453b = z9;
        this.f29454c = i7;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        int i11 = this.f29452a;
        int i12 = this.f29454c;
        boolean z9 = this.f29453b;
        Serializable serializable = this.f29455e;
        org.telegram.ui.ActionBar.f2 f2Var = this.d;
        switch (i11) {
            case 0:
                ww wwVar = (ww) f2Var;
                ArrayList arrayList = (ArrayList) serializable;
                String M0 = hd.M0(2131743908, null);
                int i13 = org.telegram.ui.ActionBar.k6.uj;
                SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(M0, i13, 0, new f(wwVar, 11), null);
                SpannableString spannableString = new SpannableString(">");
                wp wpVar = new wp(2131230875, 0);
                wpVar.f40059y = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
                wpVar.H = 0.7f;
                wpVar.I = 0.7f;
                wpVar.E = org.telegram.messenger.g0.L(12.0f);
                spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
                org.telegram.messenger.g0.K2(S2, spannableString, ">");
                hc a02 = hc.a0(wwVar);
                if (z9) {
                    i7 = 2131743909;
                } else {
                    i7 = 2131743910;
                }
                a02.I(2131623989, hd.M0(i7, null), S2).j();
                qp.s1(i12).U1().f(true, arrayList, new di.e(8));
                qp.s1(i12).U1().a();
                return;
            default:
                an anVar = (an) f2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.v4.f38823a;
                if (anVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(anVar.getParentActivity(), false, 1, null);
                    if (z9) {
                        i10 = 2131752194;
                    } else {
                        i10 = 2131752193;
                    }
                    h.O = hd.M0(i10, null);
                    h.P = true;
                    LinearLayout linearLayout = new LinearLayout(anVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(anVar.getParentActivity());
                    linearLayout.addView(textView, c8.ha.t(-1, -1, 0, 21, 0, 21, 8));
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setText(org.telegram.messenger.g0.X2(hd.a0("ChatWithAdminMessage", null, 2131752192, str, hd.s(i12, false))));
                    TextView textView2 = new TextView(anVar.getParentActivity());
                    textView2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setText(hd.M0(2131749273, null));
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Gi, null);
                    int L = org.telegram.messenger.g0.L(8.0f);
                    int i14 = org.telegram.ui.ActionBar.k6.Ci;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
                    int i15 = org.telegram.ui.ActionBar.k6.Ei;
                    int x03 = org.telegram.ui.ActionBar.k6.x0(null, i15, false);
                    y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x02, x03, x03);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                    org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i15);
                    textView2.setBackground(k02);
                    org.telegram.ui.ActionBar.r6.k(textView2, k02, N, N2, null);
                    linearLayout.addView(textView2, c8.ha.t(-1, 48, 0, 16, 12, 16, 8));
                    h.N = linearLayout;
                    h.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.y2(h, 0));
                    return;
                }
                return;
        }
    }

    public ka(ww wwVar, boolean z9, int i7, ArrayList arrayList) {
        this.d = wwVar;
        this.f29453b = z9;
        this.f29454c = i7;
        this.f29455e = arrayList;
    }
}
