package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class jr extends sa {
    public final boolean T1;
    public final g70 U1;
    public TLRPC.InputPeer V1;
    public final boolean W1;
    public String X1;
    public String Y1;
    public SpannableStringBuilder Z1;
    public c51 f36541a2;
    public final boolean f36542b2;
    public ai.k2 f36543c2;

    public jr(Context context, int i7, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.r1 r1Var, fi.b bVar) {
        int i10;
        TLRPC.Chat O0;
        jr saVar = new sa(context, null, false, false, bVar);
        saVar.T1 = true;
        saVar.f39494v1 = 0.126f;
        saVar.U1 = null;
        saVar.W1 = false;
        long n10 = org.telegram.messenger.n5.n(getgroupcallstreamrtmpurl.peer);
        boolean z10 = r1Var != null && (n10 >= 0 || ((O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(-n10))) != null && O0.creator));
        if (r1Var != null) {
            saVar.f36542b2 = true;
            hi.d dVar = new hi.d(context, bVar, true);
            dVar.i(org.telegram.messenger.hd.N0(2131748609, null), false, true);
            saVar.f30142b.addView(dVar, c8.na.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar.setOnClickListener(new ah.h((Object) saVar, r1Var, dVar, 27));
            if (z10) {
                hi.d dVar2 = new hi.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29607r7, false));
                dVar2.d.x(org.telegram.messenger.g0.o());
                dVar2.i(org.telegram.messenger.hd.N0(2131748607, null), false, true);
                saVar = this;
                dVar2.setOnClickListener(new di.z9(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i7));
                saVar.f30142b.addView(dVar2, c8.na.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        v4.k kVar = new v4.k();
        kVar.f59139m = false;
        kVar.C = false;
        kVar.o(nr.h);
        kVar.n(350L);
        saVar.f39487o1.setItemAnimator(kVar);
        ek0 ek0Var = saVar.f39487o1;
        int i11 = saVar.f30177u0;
        if (saVar.f36542b2) {
            i10 = org.telegram.messenger.g0.L(z10 ? 124.0f : 72.0f);
        } else {
            i10 = 0;
        }
        ek0Var.setPadding(i11, 0, i11, i10);
        saVar.O();
        saVar.c1();
        saVar.X1 = groupcallstreamrtmpurl.url;
        saVar.Y1 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(saVar.Y1);
        saVar.Z1 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f35299a |= 256;
        obj.f35300b = 0;
        obj.f35301c = spannableStringBuilder.length();
        saVar.Z1.setSpan(new gz0(obj, 0), 0, saVar.Z1.length(), 0);
        saVar.f36541a2.O(false);
    }

    @Override
    public final void L() {
        TLRPC.InputPeer inputPeer;
        super.L();
        g70 g70Var = this.U1;
        if (g70Var != null && (inputPeer = this.V1) != null) {
            g70Var.a(inputPeer, this.W1, false, true);
        }
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.f30139a, 0, true, new d(this, 8), this.J0);
        this.f36541a2 = c51Var;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        return org.telegram.messenger.hd.N0(2131744197, null);
    }

    public jr(org.telegram.ui.ActionBar.g2 g2Var, TLRPC.Peer peer, long j3, boolean z10, g70 g70Var) {
        super(g2Var, false);
        this.T1 = false;
        this.f39494v1 = 0.26f;
        this.U1 = g70Var;
        this.W1 = z10;
        Context context = this.f30142b.getContext();
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.f30139a).O0(Long.valueOf(-j3));
        boolean z11 = O0 != null && O0.creator;
        this.f36542b2 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.hd.N0(2131743213, null));
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Ji, this.J0);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i7 = org.telegram.ui.ActionBar.m6.Fi;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, this.J0);
        int i10 = org.telegram.ui.ActionBar.m6.f29347d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i10, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w02, o4, o4);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i10, 120);
        org.telegram.ui.ActionBar.h6 h6Var = this.J0;
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(textView, k02, M, g10, h6Var);
        this.f30142b.addView(textView, c8.na.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z11 ? 52 : 0) + 12));
        textView.setOnClickListener(new m8(6, this, peer));
        if (z11) {
            hi.d dVar = new hi.d(context, this.J0, false);
            dVar.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29607r7, false));
            dVar.d.x(org.telegram.messenger.g0.o());
            dVar.i(org.telegram.messenger.hd.N0(2131748607, null), false, true);
            dVar.setOnClickListener(new hr(this, context, dVar, j3, 0));
            this.f30142b.addView(dVar, c8.na.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        ek0 ek0Var = this.f39487o1;
        int i11 = this.f30177u0;
        ek0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L((z11 ? 52 : 0) + 72));
        v4.k kVar = new v4.k();
        kVar.f59139m = false;
        kVar.C = false;
        kVar.o(nr.h);
        kVar.n(350L);
        this.f39487o1.setItemAnimator(kVar);
        O();
        c1();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = org.telegram.messenger.np.u1(this.f30139a).l1(j3);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.f30139a).sendRequest(getgroupcallstreamrtmpurl, new f2(this, 1));
    }
}
