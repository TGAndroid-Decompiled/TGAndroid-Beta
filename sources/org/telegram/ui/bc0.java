package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bc0 implements Runnable {
    public final int f38030a;
    public final long f38031b;
    public final Object f38032c;
    public final Object d;

    public bc0(Object obj, long j10, Object obj2, int i10) {
        this.f38030a = i10;
        this.f38032c = obj;
        this.f38031b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f38030a) {
            case 0:
                pc0 pc0Var = (pc0) this.f38032c;
                TLObject tLObject = (TLObject) this.d;
                long j10 = this.f38031b;
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
                    pc0Var.j0(messages_messages.messages);
                    pc0Var.getLocationController().markLiveLoactionsAsRead(pc0Var.f42435e0);
                    if (pc0Var.I0 == null) {
                        xb0 xb0Var = new xb0(pc0Var, 4);
                        pc0Var.I0 = xb0Var;
                        AndroidUtilities.runOnUIThread(xb0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                xv0 xv0Var = (xv0) this.f38032c;
                long j11 = this.f38031b;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.d;
                xv0Var.getClass();
                Bundle bundle = new Bundle();
                if (j11 > 0) {
                    bundle.putLong("user_id", j11);
                } else {
                    bundle.putLong("chat_id", -j11);
                }
                r2Var.presentFragment(new ProfileActivity(bundle, null));
                xv0Var.c(false);
                return;
            case 2:
                ti.e eVar = (ti.e) this.f38032c;
                ti.d dVar = (ti.d) this.d;
                long j12 = this.f38031b;
                if (((ti.d) eVar.f49185c) == dVar) {
                    ti.b bVar = (ti.b) eVar.e;
                    if (bVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        eVar.e = null;
                    }
                    synchronized (ti.j.f49193y) {
                        try {
                            ti.j jVar = ti.j.A;
                            if (jVar != null) {
                                jVar.o();
                                ti.j.A = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    eVar.f49185c = null;
                    dVar.f49181c.run(j12);
                    eVar.r();
                    return;
                }
                return;
            case 3:
                long j13 = this.f38031b;
                Exception exc = (Exception) this.d;
                ui.o oVar = (ui.o) ((dc.e) this.f38032c).f8321c;
                if (j13 == oVar.f49961p) {
                    oVar.f49960o = null;
                    ui.m mVar = oVar.f49959n;
                    if (mVar != ui.m.f49947s && mVar != ui.m.f49946r) {
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
                zh.p1 p1Var = (zh.p1) this.f38032c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                long j14 = this.f38031b;
                p1Var.getClass();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.dismiss();
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

    public bc0(Object obj, Object obj2, long j10, int i10) {
        this.f38030a = i10;
        this.f38032c = obj;
        this.d = obj2;
        this.f38031b = j10;
    }
}
