package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dc0 implements Runnable {
    public final int f38581a;
    public final long f38582b;
    public final Object f38583c;
    public final Object d;

    public dc0(Object obj, long j10, Object obj2, int i10) {
        this.f38581a = i10;
        this.f38583c = obj;
        this.f38582b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f38581a) {
            case 0:
                rc0 rc0Var = (rc0) this.f38583c;
                TLObject tLObject = (TLObject) this.d;
                long j10 = this.f38582b;
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
                    rc0Var.j0(messages_messages.messages);
                    rc0Var.getLocationController().markLiveLoactionsAsRead(rc0Var.f42928e0);
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
                zv0 zv0Var = (zv0) this.f38583c;
                long j11 = this.f38582b;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.d;
                zv0Var.getClass();
                Bundle bundle = new Bundle();
                if (j11 > 0) {
                    bundle.putLong("user_id", j11);
                } else {
                    bundle.putLong("chat_id", -j11);
                }
                r2Var.presentFragment(new ProfileActivity(bundle, null));
                zv0Var.c(false);
                return;
            case 2:
                ti.e eVar = (ti.e) this.f38583c;
                ti.d dVar = (ti.d) this.d;
                long j12 = this.f38582b;
                if (((ti.d) eVar.f49220c) == dVar) {
                    ti.b bVar = (ti.b) eVar.e;
                    if (bVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        eVar.e = null;
                    }
                    synchronized (ti.j.f49228y) {
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
                    eVar.f49220c = null;
                    dVar.f49216c.run(j12);
                    eVar.r();
                    return;
                }
                return;
            case 3:
                long j13 = this.f38582b;
                Exception exc = (Exception) this.d;
                ui.o oVar = (ui.o) ((dc.e) this.f38583c).f8321c;
                if (j13 == oVar.f49996p) {
                    oVar.f49995o = null;
                    ui.m mVar = oVar.f49994n;
                    if (mVar != ui.m.f49982s && mVar != ui.m.f49981r) {
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
                zh.p1 p1Var = (zh.p1) this.f38583c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                long j14 = this.f38582b;
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

    public dc0(Object obj, Object obj2, long j10, int i10) {
        this.f38581a = i10;
        this.f38583c = obj;
        this.d = obj2;
        this.f38582b = j10;
    }
}
