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
public final class r70 implements Runnable {
    public final int f28401a = 1;
    public final org.telegram.ui.ActionBar.d2 f28402b;
    public final Context f28403c;
    public final int d;
    public final long e;
    public final TLObject f28404f;
    public final Object h;
    public final Object f28405n;
    public final Object f28406r;
    public final Object f28407s;

    public r70(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.web.u uVar, dh.v vVar) {
        this.f28402b = d2Var;
        this.f28403c = context;
        this.d = i10;
        this.e = j10;
        this.f28404f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f28405n = f6Var;
        this.f28406r = uVar;
        this.f28407s = vVar;
    }

    @Override
    public final void run() {
        switch (this.f28401a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = this.f28402b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                w70 w70Var = (w70) this.f28405n;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f28406r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f28407s;
                try {
                    d2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f28404f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        w70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    y70.D = joinaspeers.peers;
                    long j10 = this.e;
                    y70.F = j10;
                    y70.E = SystemClock.elapsedRealtime();
                    y70.G = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    y70.v(this.f28403c, j10, joinaspeers.peers, p2Var, this.d, peer, w70Var);
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f28404f;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f28405n;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.f28406r;
                dh.v vVar = (dh.v) this.f28407s;
                this.f28402b.dismiss();
                new rh.f1(this.f28403c, this.d, this.e, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, f6Var, uVar, vVar).show();
                return;
        }
    }

    public r70(org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, AccountInstance accountInstance, w70 w70Var, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer) {
        this.f28402b = d2Var;
        this.f28404f = tLObject;
        this.h = accountInstance;
        this.f28405n = w70Var;
        this.e = j10;
        this.f28403c = context;
        this.f28406r = p2Var;
        this.d = i10;
        this.f28407s = peer;
    }
}
