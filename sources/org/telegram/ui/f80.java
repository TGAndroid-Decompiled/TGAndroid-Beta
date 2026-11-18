package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f80 implements Runnable {
    public final int f47609a;
    public final long f47610b;
    public final Object f47611c;
    public final Object d;

    public f80(Object obj, long j3, Object obj2, int i7) {
        this.f47609a = i7;
        this.f47611c = obj;
        this.f47610b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f47609a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.f47611c;
                long j3 = this.f47610b;
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new up(launchActivity, org.telegram.messenger.tr.a0(launchActivity.P).j0(j3), (x70) this.d, 19));
                return;
            case 1:
                pa0 pa0Var = (pa0) this.f47611c;
                TLObject tLObject = (TLObject) this.d;
                long j10 = this.f47610b;
                if (pa0Var.F != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i7 = 0;
                    while (i7 < messages_messages.messages.size()) {
                        if (!(messages_messages.messages.get(i7).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                            messages_messages.messages.remove(i7);
                            i7--;
                        }
                        i7++;
                    }
                    pa0Var.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                    pa0Var.getMessagesController().f4(messages_messages.users, false);
                    pa0Var.getMessagesController().Z3(messages_messages.chats, false);
                    pa0Var.getLocationController().f26383c.k(messages_messages.messages, j10);
                    pa0Var.getNotificationCenter().k(284, Long.valueOf(j10));
                    pa0Var.p0(messages_messages.messages);
                    pa0Var.getLocationController().j(pa0Var.m0);
                    if (pa0Var.Q0 == null) {
                        z90 z90Var = new z90(pa0Var, 0);
                        pa0Var.Q0 = z90Var;
                        org.telegram.messenger.g0.h3(z90Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                as0 as0Var = (as0) this.f47611c;
                long j11 = this.f47610b;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.d;
                as0Var.getClass();
                Bundle bundle = new Bundle();
                if (j11 > 0) {
                    bundle.putLong("user_id", j11);
                } else {
                    bundle.putLong("chat_id", -j11);
                }
                h2Var.presentFragment(new ProfileActivity(bundle, null));
                as0Var.c(false);
                return;
            case 3:
                xi.e eVar = (xi.e) this.f47611c;
                xi.d dVar = (xi.d) this.d;
                long j12 = this.f47610b;
                if (((xi.d) eVar.f60621b) == dVar) {
                    xi.b bVar = (xi.b) eVar.d;
                    if (bVar != null) {
                        org.telegram.messenger.g0.r(bVar);
                        eVar.d = null;
                    }
                    synchronized (xi.i.f60629y) {
                        try {
                            xi.i iVar = xi.i.A;
                            if (iVar != null) {
                                iVar.q();
                                xi.i.A = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    eVar.f60621b = null;
                    dVar.f60618c.run(j12);
                    eVar.K();
                    return;
                }
                return;
            default:
                long j13 = this.f47610b;
                Exception exc = (Exception) this.d;
                yi.j jVar = (yi.j) ((ac.e) this.f47611c).f1022c;
                if (j13 == jVar.f61328o) {
                    jVar.f61327n = null;
                    int i10 = jVar.G;
                    if (i10 != 10 && i10 != 9) {
                        jVar.g(exc);
                        return;
                    }
                    jVar.h.a("capture error after session end", exc);
                    jVar.c();
                    jVar.t();
                    return;
                }
                return;
        }
    }

    public f80(Object obj, Object obj2, long j3, int i7) {
        this.f47609a = i7;
        this.f47611c = obj;
        this.d = obj2;
        this.f47610b = j3;
    }
}
