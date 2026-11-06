package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class tq extends na {
    public final boolean P1;
    public final r60 Q1;
    public TLRPC.InputPeer R1;
    public final boolean S1;
    public String T1;
    public String U1;
    public SpannableStringBuilder V1;
    public k41 W1;
    public final boolean X1;
    public bi.t Y1;

    public tq(Context context, int i7, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.f1 f1Var, di.b bVar) {
        int i10;
        TLRPC.Chat M0;
        tq naVar = new na(context, null, false, false, bVar);
        naVar.P1 = true;
        naVar.f36227r1 = 0.126f;
        naVar.Q1 = null;
        naVar.S1 = false;
        long n10 = org.telegram.messenger.m5.n(getgroupcallstreamrtmpurl.peer);
        boolean z9 = f1Var != null && (n10 >= 0 || ((M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-n10))) != null && M0.creator));
        if (f1Var != null) {
            naVar.X1 = true;
            fi.d dVar = new fi.d(context, bVar, true);
            dVar.i(org.telegram.messenger.hd.M0(2131748801, null), false, true);
            naVar.f28615b.addView(dVar, c8.ha.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z9 ? 52 : 0) + 12));
            dVar.setOnClickListener(new ah.g((Object) naVar, f1Var, dVar, 22));
            if (z9) {
                fi.d dVar2 = new fi.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28108r7, false));
                dVar2.d.x(org.telegram.messenger.g0.o());
                dVar2.i(org.telegram.messenger.hd.M0(2131748799, null), false, true);
                naVar = this;
                dVar2.setOnClickListener(new bi.jb(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i7));
                naVar.f28615b.addView(dVar2, c8.ha.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        v4.k kVar = new v4.k();
        kVar.f56979m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        naVar.f36222k1.setItemAnimator(kVar);
        pj0 pj0Var = naVar.f36222k1;
        int i11 = naVar.f28645t0;
        if (naVar.X1) {
            i10 = org.telegram.messenger.g0.L(z9 ? 124.0f : 72.0f);
        } else {
            i10 = 0;
        }
        pj0Var.setPadding(i11, 0, i11, i10);
        naVar.N();
        naVar.b1();
        naVar.T1 = groupcallstreamrtmpurl.url;
        naVar.U1 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(naVar.U1);
        naVar.V1 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f38433a |= 256;
        obj.f38434b = 0;
        obj.f38435c = spannableStringBuilder.length();
        naVar.V1.setSpan(new uy0(obj, 0), 0, naVar.V1.length(), 0);
        naVar.W1.O(false);
    }

    @Override
    public final void K() {
        TLRPC.InputPeer inputPeer;
        super.K();
        r60 r60Var = this.Q1;
        if (r60Var != null && (inputPeer = this.R1) != null) {
            r60Var.a(inputPeer, this.S1, false, true);
        }
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        k41 k41Var = new k41(pj0Var, getContext(), this.f28612a, 0, true, new d(this, 7), this.I0);
        this.W1 = k41Var;
        return k41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131744439, null);
    }

    public tq(org.telegram.ui.ActionBar.f2 f2Var, TLRPC.Peer peer, long j3, boolean z9, r60 r60Var) {
        super(f2Var, false);
        this.P1 = false;
        this.f36227r1 = 0.26f;
        this.Q1 = r60Var;
        this.S1 = z9;
        Context context = this.f28615b.getContext();
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.f28612a).M0(Long.valueOf(-j3));
        boolean z10 = M0 != null && M0.creator;
        this.X1 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.hd.M0(2131743457, null));
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, this.I0);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i7 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, this.I0);
        int i10 = org.telegram.ui.ActionBar.k6.f27848d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, o4, o4);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i10, 120);
        org.telegram.ui.ActionBar.f6 f6Var = this.I0;
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(textView, k02, N, h, f6Var);
        this.f28615b.addView(textView, c8.ha.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
        textView.setOnClickListener(new lk(4, this, peer));
        if (z10) {
            fi.d dVar = new fi.d(context, this.I0, false);
            dVar.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28108r7, false));
            dVar.d.x(org.telegram.messenger.g0.o());
            dVar.i(org.telegram.messenger.hd.M0(2131748799, null), false, true);
            dVar.setOnClickListener(new rq(this, context, dVar, j3, 0));
            this.f28615b.addView(dVar, c8.ha.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        pj0 pj0Var = this.f36222k1;
        int i11 = this.f28645t0;
        pj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L((z10 ? 52 : 0) + 72));
        v4.k kVar = new v4.k();
        kVar.f56979m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f36222k1.setItemAnimator(kVar);
        N();
        b1();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = org.telegram.messenger.qp.s1(this.f28612a).j1(j3);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.f28612a).sendRequest(getgroupcallstreamrtmpurl, new x1(this, 1));
    }
}
