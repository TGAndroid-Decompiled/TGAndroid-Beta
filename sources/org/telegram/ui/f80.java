package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f80 implements Runnable {
    public final int f47721a;
    public final long f47722b;
    public final Object f47723c;
    public final Object d;

    public f80(Object obj, long j3, Object obj2, int i7) {
        this.f47721a = i7;
        this.f47723c = obj;
        this.f47722b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f47721a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.f47723c;
                long j3 = this.f47722b;
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new up(launchActivity, org.telegram.messenger.tr.a0(launchActivity.P).j0(j3), (x70) this.d, 19));
                return;
            case 1:
                pa0 pa0Var = (pa0) this.f47723c;
                TLObject tLObject = (TLObject) this.d;
                long j10 = this.f47722b;
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
                    pa0Var.getLocationController().f26493c.k(messages_messages.messages, j10);
                    pa0Var.getNotificationCenter().k(285, Long.valueOf(j10));
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
                zr0 zr0Var = (zr0) this.f47723c;
                long j11 = this.f47722b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                zr0Var.getClass();
                Bundle bundle = new Bundle();
                if (j11 > 0) {
                    bundle.putLong("user_id", j11);
                } else {
                    bundle.putLong("chat_id", -j11);
                }
                g2Var.presentFragment(new ProfileActivity(bundle, null));
                zr0Var.c(false);
                return;
            case 3:
                xi.e eVar = (xi.e) this.f47723c;
                xi.d dVar = (xi.d) this.d;
                long j12 = this.f47722b;
                if (((xi.d) eVar.f60750b) == dVar) {
                    xi.b bVar = (xi.b) eVar.d;
                    if (bVar != null) {
                        org.telegram.messenger.g0.r(bVar);
                        eVar.d = null;
                    }
                    synchronized (xi.i.f60758y) {
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
                    eVar.f60750b = null;
                    dVar.f60747c.run(j12);
                    eVar.J();
                    return;
                }
                return;
            default:
                long j13 = this.f47722b;
                Exception exc = (Exception) this.d;
                yi.j jVar = (yi.j) ((ac.e) this.f47723c).f1022c;
                if (j13 == jVar.f61458o) {
                    jVar.f61457n = null;
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
        this.f47721a = i7;
        this.f47723c = obj;
        this.d = obj2;
        this.f47722b = j3;
    }
}
