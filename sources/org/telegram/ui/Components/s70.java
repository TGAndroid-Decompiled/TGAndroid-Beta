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
public final class s70 implements Runnable {
    public final int f28683a = 1;
    public final org.telegram.ui.ActionBar.d2 f28684b;
    public final Context f28685c;
    public final int d;
    public final long e;
    public final TLObject f28686f;
    public final Object h;
    public final Object f28687n;
    public final Object f28688r;
    public final Object f28689s;

    public s70(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.web.t tVar, kh.a0 a0Var) {
        this.f28684b = d2Var;
        this.f28685c = context;
        this.d = i10;
        this.e = j10;
        this.f28686f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f28687n = f6Var;
        this.f28688r = tVar;
        this.f28689s = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f28683a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = this.f28684b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                x70 x70Var = (x70) this.f28687n;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f28688r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f28689s;
                try {
                    d2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f28686f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        x70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    z70.D = joinaspeers.peers;
                    long j10 = this.e;
                    z70.F = j10;
                    z70.E = SystemClock.elapsedRealtime();
                    z70.G = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    z70.v(this.f28685c, j10, joinaspeers.peers, p2Var, this.d, peer, x70Var);
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f28686f;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f28687n;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.f28688r;
                kh.a0 a0Var = (kh.a0) this.f28689s;
                this.f28684b.dismiss();
                new rh.e1(this.f28685c, this.d, this.e, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, f6Var, tVar, a0Var).show();
                return;
        }
    }

    public s70(org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, AccountInstance accountInstance, x70 x70Var, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer) {
        this.f28684b = d2Var;
        this.f28686f = tLObject;
        this.h = accountInstance;
        this.f28687n = x70Var;
        this.e = j10;
        this.f28685c = context;
        this.f28688r = p2Var;
        this.d = i10;
        this.f28689s = peer;
    }
}
