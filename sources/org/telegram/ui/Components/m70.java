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
public final class m70 implements Runnable {
    public final int f30584a = 1;
    public final org.telegram.ui.ActionBar.c2 f30585b;
    public final Context f30586c;
    public final int d;
    public final long f30587e;
    public final TLObject f30588f;
    public final Object h;
    public final Object f30589n;
    public final Object f30590r;
    public final Object f30591s;

    public m70(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.web.u uVar, bh.v vVar) {
        this.f30585b = c2Var;
        this.f30586c = context;
        this.d = i10;
        this.f30587e = j10;
        this.f30588f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f30589n = c6Var;
        this.f30590r = uVar;
        this.f30591s = vVar;
    }

    @Override
    public final void run() {
        switch (this.f30584a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = this.f30585b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                r70 r70Var = (r70) this.f30589n;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f30590r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f30591s;
                try {
                    c2Var.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                TLObject tLObject = this.f30588f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        r70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    t70.C = joinaspeers.peers;
                    long j10 = this.f30587e;
                    t70.E = j10;
                    t70.D = SystemClock.elapsedRealtime();
                    t70.F = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    t70.v(this.f30586c, j10, joinaspeers.peers, o2Var, this.d, peer, r70Var);
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f30588f;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f30589n;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.f30590r;
                bh.v vVar = (bh.v) this.f30591s;
                this.f30585b.dismiss();
                new ph.e1(this.f30586c, this.d, this.f30587e, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, c6Var, uVar, vVar).show();
                return;
        }
    }

    public m70(org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, AccountInstance accountInstance, r70 r70Var, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer) {
        this.f30585b = c2Var;
        this.f30588f = tLObject;
        this.h = accountInstance;
        this.f30589n = r70Var;
        this.f30587e = j10;
        this.f30586c = context;
        this.f30590r = o2Var;
        this.d = i10;
        this.f30591s = peer;
    }
}
