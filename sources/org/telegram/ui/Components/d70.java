package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
public final class d70 implements Runnable {
    public final int f25425a = 2;
    public final long f25426b;
    public final int f25427c;
    public final Object d;
    public final TLObject e;
    public final Object f25428f;
    public final Object h;
    public final Object f25429n;
    public final Object f25430r;
    public final Object f25431s;

    public d70(org.telegram.ui.ActionBar.x1 x1Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.web.q qVar, org.telegram.tgnet.e eVar) {
        this.d = x1Var;
        this.f25429n = context;
        this.f25427c = i10;
        this.f25426b = j10;
        this.e = tL_messages_preparedInlineMessage;
        this.f25428f = fileArr;
        this.h = p6Var;
        this.f25430r = qVar;
        this.f25431s = eVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.h0 h0Var;
        String i10;
        org.telegram.ui.Wallet.a2 a2Var;
        switch (this.f25425a) {
            case 0:
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.d;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.f25428f;
                i70 i70Var = (i70) this.h;
                Context context = (Context) this.f25429n;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f25430r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f25431s;
                try {
                    x1Var.dismiss();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                TLObject tLObject = this.e;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        i70Var.a(org.telegram.messenger.wp.r1(cVar.f15043a).i1(org.telegram.messenger.kj.C1(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    k70.f27741z1 = joinaspeers.peers;
                    long j10 = this.f25426b;
                    k70.B1 = j10;
                    k70.A1 = SystemClock.elapsedRealtime();
                    int i11 = cVar.f15043a;
                    k70.C1 = i11;
                    org.telegram.messenger.wp.r1(i11).P3(joinaspeers.chats, false);
                    org.telegram.messenger.wp.r1(cVar.f15043a).V3(joinaspeers.users, false);
                    k70.L0(context, j10, joinaspeers.peers, k2Var, this.f25427c, peer, i70Var);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.d;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.e;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f25428f;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.h;
                String str = (String) this.f25429n;
                byte[] bArr = (byte[]) this.f25430r;
                ih.s sVar = (ih.s) this.f25431s;
                e2Var.getClass();
                try {
                    h0Var = h0Var2;
                } catch (Exception e7) {
                    e = e7;
                    h0Var = h0Var2;
                }
                try {
                    a2Var = new org.telegram.ui.Wallet.a2(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.e2.g(h0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, e2Var.f34453f.getCurrentTime()), str, bArr);
                    i10 = null;
                } catch (Exception e10) {
                    e = e10;
                    i10 = org.telegram.ui.Wallet.e2.i("decode request", e);
                    a2Var = null;
                    org.telegram.messenger.i0.g3(new org.telegram.messenger.rb(e2Var, a2Var, sVar, i10, this.f25426b, this.f25427c, h0Var));
                    return;
                }
                org.telegram.messenger.i0.g3(new org.telegram.messenger.rb(e2Var, a2Var, sVar, i10, this.f25426b, this.f25427c, h0Var));
                return;
            default:
                Context context2 = (Context) this.f25429n;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.e;
                ((org.telegram.ui.ActionBar.x1) this.d).dismiss();
                new xh.c1(context2, this.f25427c, this.f25426b, tL_messages_preparedInlineMessage, ((File[]) this.f25428f)[0], null, (org.telegram.ui.ActionBar.p6) this.h, (org.telegram.ui.web.q) this.f25430r, (org.telegram.tgnet.e) this.f25431s).show();
                return;
        }
    }

    public d70(org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, org.telegram.messenger.c cVar, i70 i70Var, long j10, Context context, org.telegram.ui.ActionBar.k2 k2Var, int i10, TLRPC.Peer peer) {
        this.d = x1Var;
        this.e = tLObject;
        this.f25428f = cVar;
        this.h = i70Var;
        this.f25426b = j10;
        this.f25429n = context;
        this.f25430r = k2Var;
        this.f25427c = i10;
        this.f25431s = peer;
    }

    public d70(org.telegram.ui.Wallet.e2 e2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.h0 h0Var, String str, byte[] bArr, ih.s sVar, long j10, int i10) {
        this.d = e2Var;
        this.e = tonconnectpending;
        this.f25428f = tonconnectrequest;
        this.h = h0Var;
        this.f25429n = str;
        this.f25430r = bArr;
        this.f25431s = sVar;
        this.f25426b = j10;
        this.f25427c = i10;
    }
}
