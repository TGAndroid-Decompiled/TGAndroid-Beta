package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g80 implements Runnable {
    public final int f47954a;
    public final long f47955b;
    public final Object f47956c;
    public final Object d;

    public g80(Object obj, long j3, Object obj2, int i7) {
        this.f47954a = i7;
        this.f47956c = obj;
        this.f47955b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f47954a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.f47956c;
                long j3 = this.f47955b;
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new up(launchActivity, org.telegram.messenger.ur.a0(launchActivity.P).j0(j3), (y70) this.d, 19));
                return;
            case 1:
                qa0 qa0Var = (qa0) this.f47956c;
                TLObject tLObject = (TLObject) this.d;
                long j10 = this.f47955b;
                if (qa0Var.F != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i7 = 0;
                    while (i7 < messages_messages.messages.size()) {
                        if (!(messages_messages.messages.get(i7).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                            messages_messages.messages.remove(i7);
                            i7--;
                        }
                        i7++;
                    }
                    qa0Var.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                    qa0Var.getMessagesController().f4(messages_messages.users, false);
                    qa0Var.getMessagesController().Z3(messages_messages.chats, false);
                    qa0Var.getLocationController().f26556c.k(messages_messages.messages, j10);
                    qa0Var.getNotificationCenter().k(285, Long.valueOf(j10));
                    qa0Var.p0(messages_messages.messages);
                    qa0Var.getLocationController().j(qa0Var.m0);
                    if (qa0Var.Q0 == null) {
                        aa0 aa0Var = new aa0(qa0Var, 0);
                        qa0Var.Q0 = aa0Var;
                        org.telegram.messenger.g0.h3(aa0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                bs0 bs0Var = (bs0) this.f47956c;
                long j11 = this.f47955b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                bs0Var.getClass();
                Bundle bundle = new Bundle();
                if (j11 > 0) {
                    bundle.putLong("user_id", j11);
                } else {
                    bundle.putLong("chat_id", -j11);
                }
                g2Var.presentFragment(new ProfileActivity(bundle, null));
                bs0Var.c(false);
                return;
            case 3:
                xi.e eVar = (xi.e) this.f47956c;
                xi.d dVar = (xi.d) this.d;
                long j12 = this.f47955b;
                if (((xi.d) eVar.f60632b) == dVar) {
                    xi.b bVar = (xi.b) eVar.d;
                    if (bVar != null) {
                        org.telegram.messenger.g0.r(bVar);
                        eVar.d = null;
                    }
                    synchronized (xi.i.f60640y) {
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
                    eVar.f60632b = null;
                    dVar.f60629c.run(j12);
                    eVar.K();
                    return;
                }
                return;
            default:
                long j13 = this.f47955b;
                Exception exc = (Exception) this.d;
                yi.j jVar = (yi.j) ((ac.e) this.f47956c).f1022c;
                if (j13 == jVar.f61339o) {
                    jVar.f61338n = null;
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

    public g80(Object obj, Object obj2, long j3, int i7) {
        this.f47954a = i7;
        this.f47956c = obj;
        this.d = obj2;
        this.f47955b = j3;
    }
}
