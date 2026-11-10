package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class sq extends ma {
    public final boolean S1;
    public final r60 T1;
    public TLRPC.InputPeer U1;
    public final boolean V1;
    public String W1;
    public String X1;
    public SpannableStringBuilder Y1;
    public m41 Z1;
    public final boolean f38042a2;
    public bi.t f38043b2;

    public sq(Context context, int i7, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.f1 f1Var, di.b bVar) {
        int i10;
        TLRPC.Chat M0;
        sq maVar = new ma(context, null, false, false, bVar);
        maVar.S1 = true;
        maVar.f35908u1 = 0.126f;
        maVar.T1 = null;
        maVar.V1 = false;
        long n10 = org.telegram.messenger.m5.n(getgroupcallstreamrtmpurl.peer);
        boolean z9 = f1Var != null && (n10 >= 0 || ((M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-n10))) != null && M0.creator));
        if (f1Var != null) {
            maVar.f38042a2 = true;
            fi.d dVar = new fi.d(context, bVar, true);
            dVar.i(org.telegram.messenger.id.M0(2131748802, null), false, true);
            maVar.f28672b.addView(dVar, c8.ha.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z9 ? 52 : 0) + 12));
            dVar.setOnClickListener(new ah.g((Object) maVar, f1Var, dVar, 22));
            if (z9) {
                fi.d dVar2 = new fi.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28150r7, false));
                dVar2.d.x(org.telegram.messenger.g0.o());
                dVar2.i(org.telegram.messenger.id.M0(2131748800, null), false, true);
                maVar = this;
                dVar2.setOnClickListener(new bi.jb(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i7));
                maVar.f28672b.addView(dVar2, c8.ha.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        v4.k kVar = new v4.k();
        kVar.f57079m = false;
        kVar.C = false;
        kVar.o(wq.h);
        kVar.n(350L);
        maVar.n1.setItemAnimator(kVar);
        pj0 pj0Var = maVar.n1;
        int i11 = maVar.f28705t0;
        if (maVar.f38042a2) {
            i10 = org.telegram.messenger.g0.L(z9 ? 124.0f : 72.0f);
        } else {
            i10 = 0;
        }
        pj0Var.setPadding(i11, 0, i11, i10);
        maVar.N();
        maVar.b1();
        maVar.W1 = groupcallstreamrtmpurl.url;
        maVar.X1 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(maVar.X1);
        maVar.Y1 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f38777a |= 256;
        obj.f38778b = 0;
        obj.f38779c = spannableStringBuilder.length();
        maVar.Y1.setSpan(new vy0(obj, 0), 0, maVar.Y1.length(), 0);
        maVar.Z1.O(false);
    }

    @Override
    public final void K() {
        TLRPC.InputPeer inputPeer;
        super.K();
        r60 r60Var = this.T1;
        if (r60Var != null && (inputPeer = this.U1) != null) {
            r60Var.a(inputPeer, this.V1, false, true);
        }
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.f28669a, 0, true, new d(this, 7), this.I0);
        this.Z1 = m41Var;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131744438, null);
    }

    public sq(org.telegram.ui.ActionBar.f2 f2Var, TLRPC.Peer peer, long j3, boolean z9, r60 r60Var) {
        super(f2Var, false);
        this.S1 = false;
        this.f35908u1 = 0.26f;
        this.T1 = r60Var;
        this.V1 = z9;
        Context context = this.f28672b.getContext();
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.f28669a).M0(Long.valueOf(-j3));
        boolean z10 = M0 != null && M0.creator;
        this.f38042a2 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.id.M0(2131743456, null));
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Gi, this.I0);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i7 = org.telegram.ui.ActionBar.m6.Ci;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, this.I0);
        int i10 = org.telegram.ui.ActionBar.m6.f27890d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i10, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w02, o4, o4);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i10, 120);
        org.telegram.ui.ActionBar.h6 h6Var = this.I0;
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(textView, k02, M, g10, h6Var);
        this.f28672b.addView(textView, c8.ha.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
        textView.setOnClickListener(new kk(4, this, peer));
        if (z10) {
            fi.d dVar = new fi.d(context, this.I0, false);
            dVar.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28150r7, false));
            dVar.d.x(org.telegram.messenger.g0.o());
            dVar.i(org.telegram.messenger.id.M0(2131748800, null), false, true);
            dVar.setOnClickListener(new qq(this, context, dVar, j3, 0));
            this.f28672b.addView(dVar, c8.ha.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        pj0 pj0Var = this.n1;
        int i11 = this.f28705t0;
        pj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L((z10 ? 52 : 0) + 72));
        v4.k kVar = new v4.k();
        kVar.f57079m = false;
        kVar.C = false;
        kVar.o(wq.h);
        kVar.n(350L);
        this.n1.setItemAnimator(kVar);
        N();
        b1();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = org.telegram.messenger.qp.s1(this.f28669a).j1(j3);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.f28669a).sendRequest(getgroupcallstreamrtmpurl, new w1(this, 1));
    }
}
