package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class t70 implements Runnable {
    public final int f31292a = 1;
    public final org.telegram.ui.ActionBar.d2 f31293b;
    public final Context f31294c;
    public final int d;
    public final long f31295e;
    public final TLObject f31296f;
    public final Object h;
    public final Object f31297n;
    public final Object f31298r;
    public final Object f31299s;

    public t70(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.web.u uVar, eh.w wVar) {
        this.f31293b = d2Var;
        this.f31294c = context;
        this.d = i10;
        this.f31295e = j10;
        this.f31296f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f31297n = g6Var;
        this.f31298r = uVar;
        this.f31299s = wVar;
    }

    @Override
    public final void run() {
        switch (this.f31292a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = this.f31293b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                y70 y70Var = (y70) this.f31297n;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f31298r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f31299s;
                try {
                    d2Var.dismiss();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                TLObject tLObject = this.f31296f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        y70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    a80.D = joinaspeers.peers;
                    long j10 = this.f31295e;
                    a80.F = j10;
                    a80.E = SystemClock.elapsedRealtime();
                    a80.G = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    a80.v(this.f31294c, j10, joinaspeers.peers, p2Var, this.d, peer, y70Var);
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f31296f;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f31297n;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.f31298r;
                eh.w wVar = (eh.w) this.f31299s;
                this.f31293b.dismiss();
                new sh.e1(this.f31294c, this.d, this.f31295e, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, g6Var, uVar, wVar).show();
                return;
        }
    }

    public t70(org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, AccountInstance accountInstance, y70 y70Var, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer) {
        this.f31293b = d2Var;
        this.f31296f = tLObject;
        this.h = accountInstance;
        this.f31297n = y70Var;
        this.f31295e = j10;
        this.f31294c = context;
        this.f31298r = p2Var;
        this.d = i10;
        this.f31299s = peer;
    }
}
