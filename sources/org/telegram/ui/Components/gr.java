package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class gr extends ra {
    public final boolean T1;
    public final d70 U1;
    public TLRPC.InputPeer V1;
    public final boolean W1;
    public String X1;
    public String Y1;
    public SpannableStringBuilder Z1;
    public b51 f35519a2;
    public final boolean f35520b2;
    public ai.l2 f35521c2;

    public gr(Context context, int i7, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.s1 s1Var, fi.b bVar) {
        int i10;
        TLRPC.Chat O0;
        gr raVar = new ra(context, null, false, false, bVar);
        raVar.T1 = true;
        raVar.f39253v1 = 0.126f;
        raVar.U1 = null;
        raVar.W1 = false;
        long n10 = org.telegram.messenger.n5.n(getgroupcallstreamrtmpurl.peer);
        boolean z10 = s1Var != null && (n10 >= 0 || ((O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-n10))) != null && O0.creator));
        if (s1Var != null) {
            raVar.f35520b2 = true;
            hi.e eVar = new hi.e(context, bVar, true);
            eVar.i(org.telegram.messenger.gd.N0(2131748609, null), false, true);
            raVar.f30226b.addView(eVar, c8.na.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            eVar.setOnClickListener(new ah.h((Object) raVar, s1Var, eVar, 27));
            if (z10) {
                hi.e eVar2 = new hi.e(context, bVar, false);
                eVar2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29711r7, false));
                eVar2.d.x(org.telegram.messenger.g0.o());
                eVar2.i(org.telegram.messenger.gd.N0(2131748607, null), false, true);
                raVar = this;
                eVar2.setOnClickListener(new di.z9(this, context, bVar, eVar2, getgroupcallstreamrtmpurl, i7));
                raVar.f30226b.addView(eVar2, c8.na.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        v4.l lVar = new v4.l();
        lVar.f59274m = false;
        lVar.C = false;
        lVar.o(kr.h);
        lVar.n(350L);
        raVar.f39246o1.setItemAnimator(lVar);
        ek0 ek0Var = raVar.f39246o1;
        int i11 = raVar.f30261u0;
        if (raVar.f35520b2) {
            i10 = org.telegram.messenger.g0.L(z10 ? 124.0f : 72.0f);
        } else {
            i10 = 0;
        }
        ek0Var.setPadding(i11, 0, i11, i10);
        raVar.O();
        raVar.c1();
        raVar.X1 = groupcallstreamrtmpurl.url;
        raVar.Y1 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(raVar.Y1);
        raVar.Z1 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f34924a |= 256;
        obj.f34925b = 0;
        obj.f34926c = spannableStringBuilder.length();
        raVar.Z1.setSpan(new fz0(obj, 0), 0, raVar.Z1.length(), 0);
        raVar.f35519a2.O(false);
    }

    @Override
    public final void L() {
        TLRPC.InputPeer inputPeer;
        super.L();
        d70 d70Var = this.U1;
        if (d70Var != null && (inputPeer = this.V1) != null) {
            d70Var.a(inputPeer, this.W1, false, true);
        }
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(ek0Var, getContext(), this.f30223a, 0, true, new d(this, 8), this.J0);
        this.f35519a2 = b51Var;
        return b51Var;
    }

    @Override
    public final CharSequence P0() {
        return org.telegram.messenger.gd.N0(2131744193, null);
    }

    public gr(org.telegram.ui.ActionBar.g2 g2Var, TLRPC.Peer peer, long j3, boolean z10, d70 d70Var) {
        super(g2Var, false);
        this.T1 = false;
        this.f39253v1 = 0.26f;
        this.U1 = d70Var;
        this.W1 = z10;
        Context context = this.f30226b.getContext();
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.f30223a).O0(Long.valueOf(-j3));
        boolean z11 = O0 != null && O0.creator;
        this.f35520b2 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.gd.N0(2131743206, null));
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, this.J0);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, this.J0);
        int i10 = org.telegram.ui.ActionBar.n6.f29451d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i10, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w02, o4, o4);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i10, 120);
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(textView, k02, M, g10, i6Var);
        this.f30226b.addView(textView, c8.na.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z11 ? 52 : 0) + 12));
        textView.setOnClickListener(new l8(6, this, peer));
        if (z11) {
            hi.e eVar = new hi.e(context, this.J0, false);
            eVar.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29711r7, false));
            eVar.d.x(org.telegram.messenger.g0.o());
            eVar.i(org.telegram.messenger.gd.N0(2131748607, null), false, true);
            eVar.setOnClickListener(new er(this, context, eVar, j3, 0));
            this.f30226b.addView(eVar, c8.na.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        ek0 ek0Var = this.f39246o1;
        int i11 = this.f30261u0;
        ek0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L((z11 ? 52 : 0) + 72));
        v4.l lVar = new v4.l();
        lVar.f59274m = false;
        lVar.C = false;
        lVar.o(kr.h);
        lVar.n(350L);
        this.f39246o1.setItemAnimator(lVar);
        O();
        c1();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = org.telegram.messenger.mp.u1(this.f30223a).l1(j3);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.f30223a).sendRequest(getgroupcallstreamrtmpurl, new e2(this, 1));
    }
}
