package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g80 implements Runnable {
    public final int f48007a;
    public final long f48008b;
    public final Object f48009c;
    public final Object d;

    public g80(Object obj, long j3, Object obj2, int i7) {
        this.f48007a = i7;
        this.f48009c = obj;
        this.f48008b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f48007a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.f48009c;
                long j3 = this.f48008b;
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new up(launchActivity, org.telegram.messenger.ur.a0(launchActivity.P).j0(j3), (y70) this.d, 19));
                return;
            case 1:
                qa0 qa0Var = (qa0) this.f48009c;
                TLObject tLObject = (TLObject) this.d;
                long j10 = this.f48008b;
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
                    qa0Var.getLocationController().f26592c.k(messages_messages.messages, j10);
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
                as0 as0Var = (as0) this.f48009c;
                long j11 = this.f48008b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                as0Var.getClass();
                Bundle bundle = new Bundle();
                if (j11 > 0) {
                    bundle.putLong("user_id", j11);
                } else {
                    bundle.putLong("chat_id", -j11);
                }
                g2Var.presentFragment(new ProfileActivity(bundle, null));
                as0Var.c(false);
                return;
            case 3:
                xi.e eVar = (xi.e) this.f48009c;
                xi.d dVar = (xi.d) this.d;
                long j12 = this.f48008b;
                if (((xi.d) eVar.f60667b) == dVar) {
                    xi.b bVar = (xi.b) eVar.d;
                    if (bVar != null) {
                        org.telegram.messenger.g0.r(bVar);
                        eVar.d = null;
                    }
                    synchronized (xi.i.f60675y) {
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
                    eVar.f60667b = null;
                    dVar.f60664c.run(j12);
                    eVar.K();
                    return;
                }
                return;
            default:
                long j13 = this.f48008b;
                Exception exc = (Exception) this.d;
                yi.j jVar = (yi.j) ((ac.e) this.f48009c).f1022c;
                if (j13 == jVar.f61374o) {
                    jVar.f61373n = null;
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
        this.f48007a = i7;
        this.f48009c = obj;
        this.d = obj2;
        this.f48008b = j3;
    }
}
