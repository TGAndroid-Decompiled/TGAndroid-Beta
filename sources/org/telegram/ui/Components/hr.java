package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class hr extends sa {
    public final boolean T1;
    public final e70 U1;
    public TLRPC.InputPeer V1;
    public final boolean W1;
    public String X1;
    public String Y1;
    public SpannableStringBuilder Z1;
    public z41 f35952a2;
    public final boolean f35953b2;
    public ai.r2 f35954c2;

    public hr(Context context, int i7, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.v1 v1Var, fi.b bVar) {
        int i10;
        TLRPC.Chat O0;
        hr saVar = new sa(context, null, false, false, bVar);
        saVar.T1 = true;
        saVar.f39541v1 = 0.126f;
        saVar.U1 = null;
        saVar.W1 = false;
        long n10 = org.telegram.messenger.n5.n(getgroupcallstreamrtmpurl.peer);
        boolean z10 = v1Var != null && (n10 >= 0 || ((O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-n10))) != null && O0.creator));
        if (v1Var != null) {
            saVar.f35953b2 = true;
            hi.d dVar = new hi.d(context, bVar, true);
            dVar.i(org.telegram.messenger.gd.M0(2131748610, null), false, true);
            saVar.f30192b.addView(dVar, c8.ma.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar.setOnClickListener(new ah.h((Object) saVar, v1Var, dVar, 27));
            if (z10) {
                hi.d dVar2 = new hi.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29656r7, false));
                dVar2.d.x(org.telegram.messenger.g0.o());
                dVar2.i(org.telegram.messenger.gd.M0(2131748608, null), false, true);
                saVar = this;
                dVar2.setOnClickListener(new di.y9(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i7));
                saVar.f30192b.addView(dVar2, c8.ma.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        v4.k kVar = new v4.k();
        kVar.f59151m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        saVar.f39534o1.setItemAnimator(kVar);
        ck0 ck0Var = saVar.f39534o1;
        int i11 = saVar.f30227u0;
        if (saVar.f35953b2) {
            i10 = org.telegram.messenger.g0.L(z10 ? 124.0f : 72.0f);
        } else {
            i10 = 0;
        }
        ck0Var.setPadding(i11, 0, i11, i10);
        saVar.O();
        saVar.c1();
        saVar.X1 = groupcallstreamrtmpurl.url;
        saVar.Y1 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(saVar.Y1);
        saVar.Z1 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f34537a |= 256;
        obj.f34538b = 0;
        obj.f34539c = spannableStringBuilder.length();
        saVar.Z1.setSpan(new ez0(obj, 0), 0, saVar.Z1.length(), 0);
        saVar.f35952a2.O(false);
    }

    @Override
    public final void L() {
        TLRPC.InputPeer inputPeer;
        super.L();
        e70 e70Var = this.U1;
        if (e70Var != null && (inputPeer = this.V1) != null) {
            e70Var.a(inputPeer, this.W1, false, true);
        }
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(ck0Var, getContext(), this.f30189a, 0, true, new d(this, 8), this.J0);
        this.f35952a2 = z41Var;
        return z41Var;
    }

    @Override
    public final CharSequence P0() {
        return org.telegram.messenger.gd.M0(2131744203, null);
    }

    public hr(org.telegram.ui.ActionBar.h2 h2Var, TLRPC.Peer peer, long j3, boolean z10, e70 e70Var) {
        super(h2Var, false);
        this.T1 = false;
        this.f39541v1 = 0.26f;
        this.U1 = e70Var;
        this.W1 = z10;
        Context context = this.f30192b.getContext();
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.f30189a).O0(Long.valueOf(-j3));
        boolean z11 = O0 != null && O0.creator;
        this.f35953b2 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.gd.M0(2131743219, null));
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, this.J0);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, this.J0);
        int i10 = org.telegram.ui.ActionBar.n6.f29396d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i10, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w02, o4, o4);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i10, 120);
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(textView, k02, M, g10, i6Var);
        this.f30192b.addView(textView, c8.ma.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z11 ? 52 : 0) + 12));
        textView.setOnClickListener(new y7(7, this, peer));
        if (z11) {
            hi.d dVar = new hi.d(context, this.J0, false);
            dVar.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29656r7, false));
            dVar.d.x(org.telegram.messenger.g0.o());
            dVar.i(org.telegram.messenger.gd.M0(2131748608, null), false, true);
            dVar.setOnClickListener(new fr(this, context, dVar, j3, 0));
            this.f30192b.addView(dVar, c8.ma.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        ck0 ck0Var = this.f39534o1;
        int i11 = this.f30227u0;
        ck0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L((z11 ? 52 : 0) + 72));
        v4.k kVar = new v4.k();
        kVar.f59151m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        this.f39534o1.setItemAnimator(kVar);
        O();
        c1();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = org.telegram.messenger.mp.u1(this.f30189a).l1(j3);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.f30189a).sendRequest(getgroupcallstreamrtmpurl, new e2(this, 1));
    }
}
