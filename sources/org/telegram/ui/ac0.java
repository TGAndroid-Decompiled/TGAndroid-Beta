package org.telegram.ui;

import android.os.Bundle;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ac0 implements Runnable {
    public final int f35408a;
    public final long f35409b;
    public final Object f35410c;
    public final Object d;

    public ac0(Object obj, long j10, Object obj2, int i10) {
        this.f35408a = i10;
        this.f35410c = obj;
        this.f35409b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f35408a) {
            case 0:
                pc0 pc0Var = (pc0) this.f35410c;
                TLObject tLObject = (TLObject) this.d;
                long j10 = this.f35409b;
                if (pc0Var.I != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i10 = 0;
                    while (i10 < messages_messages.messages.size()) {
                        if (!(messages_messages.messages.get(i10).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                            messages_messages.messages.remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                    pc0Var.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    pc0Var.getMessagesController().putUsers(messages_messages.users, false);
                    pc0Var.getMessagesController().putChats(messages_messages.chats, false);
                    pc0Var.getLocationController().locationsCache.k(messages_messages.messages, j10);
                    pc0Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j10));
                    pc0Var.h0(messages_messages.messages);
                    pc0Var.getLocationController().markLiveLoactionsAsRead(pc0Var.f40063e0);
                    if (pc0Var.J0 == null) {
                        xb0 xb0Var = new xb0(pc0Var, 4);
                        pc0Var.J0 = xb0Var;
                        AndroidUtilities.runOnUIThread(xb0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                sv0 sv0Var = (sv0) this.f35410c;
                long j11 = this.f35409b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
                sv0Var.getClass();
                Bundle bundle = new Bundle();
                if (j11 > 0) {
                    bundle.putLong("user_id", j11);
                } else {
                    bundle.putLong("chat_id", -j11);
                }
                n2Var.presentFragment(new ProfileActivity(bundle, null));
                sv0Var.c(false);
                return;
            case 2:
                qi.e eVar = (qi.e) this.f35410c;
                qi.d dVar = (qi.d) this.d;
                long j12 = this.f35409b;
                if (((qi.d) eVar.f44798b) == dVar) {
                    qi.b bVar = (qi.b) eVar.d;
                    if (bVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        eVar.d = null;
                    }
                    synchronized (qi.i.f44805y) {
                        try {
                            qi.i iVar = qi.i.A;
                            if (iVar != null) {
                                iVar.o();
                                qi.i.A = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    eVar.f44798b = null;
                    dVar.f44796c.run(j12);
                    eVar.D();
                    return;
                }
                return;
            case 3:
                ri.p pVar = (ri.p) this.f35410c;
                long j13 = this.f35409b;
                File file = (File) this.d;
                if (pVar.f45882m == ri.n.f45868f) {
                    pVar.f45885p = j13;
                    pVar.f45887r = 0L;
                    pVar.f45888s = ri.p.q(j13);
                    pVar.d();
                    pVar.t(file);
                    return;
                }
                return;
            case 4:
                long j14 = this.f35409b;
                Exception exc = (Exception) this.d;
                ri.p pVar2 = (ri.p) ((cc.e) this.f35410c).f5096c;
                if (j14 == pVar2.f45884o) {
                    pVar2.f45883n = null;
                    pVar2.g(exc);
                    return;
                }
                return;
            default:
                yh.p1 p1Var = (yh.p1) this.f35410c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                long j15 = this.f35409b;
                p1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.dismiss();
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", j15);
                    bundle2.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle2, null));
                    return;
                }
                return;
        }
    }

    public ac0(Object obj, Object obj2, long j10, int i10) {
        this.f35408a = i10;
        this.f35410c = obj;
        this.d = obj2;
        this.f35409b = j10;
    }
}
