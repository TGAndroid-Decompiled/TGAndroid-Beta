package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class tq extends ma {
    public final boolean Q1;
    public final m60 R1;
    public TLRPC.InputPeer S1;
    public final boolean T1;
    public String U1;
    public String V1;
    public SpannableStringBuilder W1;
    public f41 X1;
    public final boolean Y1;
    public ci.q Z1;

    public tq(Context context, int i3, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.o1 o1Var, ei.b bVar) {
        int i10;
        TLRPC.Chat M0;
        tq maVar = new ma(context, null, false, false, bVar);
        maVar.Q1 = true;
        maVar.f36108s1 = 0.126f;
        maVar.R1 = null;
        maVar.T1 = false;
        long n4 = org.telegram.messenger.m5.n(getgroupcallstreamrtmpurl.peer);
        boolean z10 = o1Var != null && (n4 >= 0 || ((M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-n4))) != null && M0.creator));
        if (o1Var != null) {
            maVar.Y1 = true;
            gi.d dVar = new gi.d(context, bVar, true);
            dVar.i(org.telegram.messenger.bd.M0(2131748810, null), false, true);
            maVar.f28586b.addView(dVar, b8.mf.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar.setOnClickListener(new ai.h(maVar, o1Var, dVar, 27));
            if (z10) {
                gi.d dVar2 = new gi.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28141r7, false));
                dVar2.d.x(org.telegram.messenger.g0.o());
                dVar2.i(org.telegram.messenger.bd.M0(2131748808, null), false, true);
                maVar = this;
                dVar2.setOnClickListener(new ci.ga(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i3));
                maVar.f28586b.addView(dVar2, b8.mf.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        maVar.f36102l1.setItemAnimator(kVar);
        tj0 tj0Var = maVar.f36102l1;
        int i11 = maVar.f28618u0;
        if (maVar.Y1) {
            i10 = org.telegram.messenger.g0.L(z10 ? 124.0f : 72.0f);
        } else {
            i10 = 0;
        }
        tj0Var.setPadding(i11, 0, i11, i10);
        maVar.N();
        maVar.b1();
        maVar.U1 = groupcallstreamrtmpurl.url;
        maVar.V1 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(maVar.V1);
        maVar.W1 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f38578a |= 256;
        obj.f38579b = 0;
        obj.f38580c = spannableStringBuilder.length();
        maVar.W1.setSpan(new uy0(obj, 0), 0, maVar.W1.length(), 0);
        maVar.X1.O(false);
    }

    @Override
    public final void K() {
        TLRPC.InputPeer inputPeer;
        super.K();
        m60 m60Var = this.R1;
        if (m60Var != null && (inputPeer = this.S1) != null) {
            m60Var.a(inputPeer, this.T1, false, true);
        }
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.f28583a, 0, true, new e(this, 7), this.J0);
        this.X1 = f41Var;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.bd.M0(2131744448, null);
    }

    public tq(org.telegram.ui.ActionBar.d2 d2Var, TLRPC.Peer peer, long j10, boolean z10, m60 m60Var) {
        super(d2Var, false);
        this.Q1 = false;
        this.f36108s1 = 0.26f;
        this.R1 = m60Var;
        this.T1 = z10;
        Context context = this.f28586b.getContext();
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.f28583a).M0(Long.valueOf(-j10));
        boolean z11 = M0 != null && M0.creator;
        this.Y1 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.bd.M0(2131743466, null));
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, this.J0);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, this.J0);
        int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, o10, o10);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i10, 120);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(textView, k02, N, h, e6Var);
        this.f28586b.addView(textView, b8.mf.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z11 ? 52 : 0) + 12));
        textView.setOnClickListener(new q2(10, this, peer));
        if (z11) {
            gi.d dVar = new gi.d(context, this.J0, false);
            dVar.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28141r7, false));
            dVar.d.x(org.telegram.messenger.g0.o());
            dVar.i(org.telegram.messenger.bd.M0(2131748808, null), false, true);
            dVar.setOnClickListener(new rq(this, context, dVar, j10, 0));
            this.f28586b.addView(dVar, b8.mf.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        tj0 tj0Var = this.f36102l1;
        int i11 = this.f28618u0;
        tj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L((z11 ? 52 : 0) + 72));
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f36102l1.setItemAnimator(kVar);
        N();
        b1();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = org.telegram.messenger.hp.s1(this.f28583a).j1(j10);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.f28583a).sendRequest(getgroupcallstreamrtmpurl, new w1(this, 1));
    }
}
