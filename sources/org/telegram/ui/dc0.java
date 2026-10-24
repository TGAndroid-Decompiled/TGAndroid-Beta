package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dc0 implements Runnable {
    public final int f36580a;
    public final long f36581b;
    public final Object f36582c;
    public final Object d;

    public dc0(Object obj, long j10, Object obj2, int i10) {
        this.f36580a = i10;
        this.f36582c = obj;
        this.f36581b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f36580a) {
            case 0:
                rc0 rc0Var = (rc0) this.f36582c;
                TLObject tLObject = (TLObject) this.d;
                long j10 = this.f36581b;
                if (rc0Var.I != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i10 = 0;
                    while (i10 < messages_messages.messages.size()) {
                        if (!(messages_messages.messages.get(i10).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                            messages_messages.messages.remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                    rc0Var.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    rc0Var.getMessagesController().putUsers(messages_messages.users, false);
                    rc0Var.getMessagesController().putChats(messages_messages.chats, false);
                    rc0Var.getLocationController().locationsCache.k(messages_messages.messages, j10);
                    rc0Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j10));
                    rc0Var.i0(messages_messages.messages);
                    rc0Var.getLocationController().markLiveLoactionsAsRead(rc0Var.f41099e0);
                    if (rc0Var.I0 == null) {
                        zb0 zb0Var = new zb0(rc0Var, 4);
                        rc0Var.I0 = zb0Var;
                        AndroidUtilities.runOnUIThread(zb0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                tv0 tv0Var = (tv0) this.f36582c;
                long j11 = this.f36581b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                tv0Var.getClass();
                Bundle bundle = new Bundle();
                if (j11 > 0) {
                    bundle.putLong("user_id", j11);
                } else {
                    bundle.putLong("chat_id", -j11);
                }
                o2Var.presentFragment(new ProfileActivity(bundle, null));
                tv0Var.c(false);
                return;
            case 2:
                qi.e eVar = (qi.e) this.f36582c;
                qi.d dVar = (qi.d) this.d;
                long j12 = this.f36581b;
                if (((qi.d) eVar.f45176b) == dVar) {
                    qi.b bVar = (qi.b) eVar.d;
                    if (bVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        eVar.d = null;
                    }
                    synchronized (qi.i.f45183y) {
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
                    eVar.f45176b = null;
                    dVar.f45174c.run(j12);
                    eVar.D();
                    return;
                }
                return;
            case 3:
                long j13 = this.f36581b;
                Exception exc = (Exception) this.d;
                ri.o oVar = (ri.o) ((cc.e) this.f36582c).f5098c;
                if (j13 == oVar.f46268p) {
                    oVar.f46267o = null;
                    ri.m mVar = oVar.f46266n;
                    if (mVar != ri.m.f46254s && mVar != ri.m.f46253r) {
                        oVar.g(exc);
                        return;
                    }
                    oVar.h.a("capture error after session end", exc);
                    oVar.c();
                    oVar.s();
                    return;
                }
                return;
            default:
                yh.o1 o1Var = (yh.o1) this.f36582c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                long j14 = this.f36581b;
                o1Var.getClass();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    o1Var.dismiss();
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", j14);
                    bundle2.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle2, null));
                    return;
                }
                return;
        }
    }

    public dc0(Object obj, Object obj2, long j10, int i10) {
        this.f36580a = i10;
        this.f36582c = obj;
        this.d = obj2;
        this.f36581b = j10;
    }
}
