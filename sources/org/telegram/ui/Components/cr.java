package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class cr extends ha {
    public final boolean P1;
    public final i70 Q1;
    public TLRPC.InputPeer R1;
    public final boolean S1;
    public String T1;
    public String U1;
    public SpannableStringBuilder V1;
    public p51 W1;
    public final boolean X1;
    public jg.z2 Y1;

    public cr(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, rh.e3 e3Var, th.b bVar) {
        int i11;
        TLRPC.Chat L0;
        cr haVar = new ha(context, null, false, false, bVar);
        haVar.P1 = true;
        haVar.f26672r1 = 0.126f;
        haVar.Q1 = null;
        haVar.S1 = false;
        long n10 = org.telegram.messenger.o5.n(getgroupcallstreamrtmpurl.peer);
        boolean z10 = e3Var != null && (n10 >= 0 || ((L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-n10))) != null && L0.creator));
        if (e3Var != null) {
            haVar.X1 = true;
            vh.d dVar = new vh.d(context, bVar, true);
            dVar.i(org.telegram.messenger.cd.L0(2131748812, null), false, true);
            haVar.f21586b.addView(dVar, w7.b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar.setOnClickListener(new ag.i(haVar, e3Var, dVar, 12));
            if (z10) {
                vh.d dVar2 = new vh.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21187r7, false));
                dVar2.d.x(org.telegram.messenger.i0.o());
                dVar2.i(org.telegram.messenger.cd.L0(2131748810, null), false, true);
                haVar = this;
                dVar2.setOnClickListener(new org.telegram.ui.vf(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i10, 2));
                haVar.f21586b.addView(dVar2, w7.b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        s4.j jVar = new s4.j();
        jVar.f47927m = false;
        jVar.C = false;
        jVar.o(gr.h);
        jVar.n(350L);
        haVar.f26666k1.setItemAnimator(jVar);
        tk0 tk0Var = haVar.f26666k1;
        int i12 = haVar.f21615t0;
        if (haVar.X1) {
            i11 = org.telegram.messenger.i0.L(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        tk0Var.setPadding(i12, 0, i12, i11);
        haVar.O();
        haVar.b1();
        haVar.T1 = groupcallstreamrtmpurl.url;
        haVar.U1 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(haVar.U1);
        haVar.V1 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f32850a |= 256;
        obj.f32851b = 0;
        obj.f32852c = spannableStringBuilder.length();
        haVar.V1.setSpan(new zz0(obj, 0), 0, haVar.V1.length(), 0);
        haVar.W1.O(false);
    }

    @Override
    public final void L() {
        TLRPC.InputPeer inputPeer;
        super.L();
        i70 i70Var = this.Q1;
        if (i70Var != null && (inputPeer = this.R1) != null) {
            i70Var.a(inputPeer, this.S1, false, true);
        }
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(tk0Var, getContext(), this.f21583a, 0, true, new d(this, 7), this.I0);
        this.W1 = p51Var;
        return p51Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.cd.L0(2131744464, null);
    }

    public cr(org.telegram.ui.ActionBar.k2 k2Var, TLRPC.Peer peer, long j10, boolean z10, i70 i70Var) {
        super(k2Var, false);
        this.P1 = false;
        this.f26672r1 = 0.26f;
        this.Q1 = i70Var;
        this.S1 = z10;
        Context context = this.f21586b.getContext();
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.f21583a).L0(Long.valueOf(-j10));
        boolean z11 = L0 != null && L0.creator;
        this.X1 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(org.telegram.messenger.cd.L0(2131743482, null));
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, this.I0);
        int L = org.telegram.messenger.i0.L(8.0f);
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, this.I0);
        int i11 = org.telegram.ui.ActionBar.t6.f20929d6;
        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i11, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w02, o10, o10);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i11, 120);
        org.telegram.ui.ActionBar.p6 p6Var = this.I0;
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(textView, k02, N, h, p6Var);
        this.f21586b.addView(textView, w7.b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z11 ? 52 : 0) + 12));
        textView.setOnClickListener(new org.telegram.ui.ud(27, this, peer));
        if (z11) {
            vh.d dVar = new vh.d(context, this.I0, false);
            dVar.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21187r7, false));
            dVar.d.x(org.telegram.messenger.i0.o());
            dVar.i(org.telegram.messenger.cd.L0(2131748810, null), false, true);
            dVar.setOnClickListener(new mg.u0(this, context, dVar, j10, 1));
            this.f21586b.addView(dVar, w7.b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        tk0 tk0Var = this.f26666k1;
        int i12 = this.f21615t0;
        tk0Var.setPadding(i12, 0, i12, org.telegram.messenger.i0.L((z11 ? 52 : 0) + 72));
        s4.j jVar = new s4.j();
        jVar.f47927m = false;
        jVar.C = false;
        jVar.o(gr.h);
        jVar.n(350L);
        this.f26666k1.setItemAnimator(jVar);
        O();
        b1();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = org.telegram.messenger.vp.r1(this.f21583a).i1(j10);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.f21583a).sendRequest(getgroupcallstreamrtmpurl, new x1(this, 1));
    }
}
