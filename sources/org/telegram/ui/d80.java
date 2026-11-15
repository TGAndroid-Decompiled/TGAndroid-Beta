package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d80 implements Runnable {
    public final int f46307a;
    public final long f46308b;
    public final Object f46309c;
    public final Object d;

    public d80(Object obj, long j3, Object obj2, int i7) {
        this.f46307a = i7;
        this.f46309c = obj;
        this.f46308b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f46307a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.f46309c;
                long j3 = this.f46308b;
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new tp(launchActivity, org.telegram.messenger.vr.a0(launchActivity.P).j0(j3), (w70) this.d, 19));
                return;
            case 1:
                pa0 pa0Var = (pa0) this.f46309c;
                TLObject tLObject = (TLObject) this.d;
                long j10 = this.f46308b;
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
                    pa0Var.getMessagesController().Y3(messages_messages.users, false);
                    pa0Var.getMessagesController().S3(messages_messages.chats, false);
                    pa0Var.getLocationController().f26279c.k(messages_messages.messages, j10);
                    pa0Var.getNotificationCenter().k(282, Long.valueOf(j10));
                    pa0Var.p0(messages_messages.messages);
                    pa0Var.getLocationController().j(pa0Var.m0);
                    if (pa0Var.L0 == null) {
                        y90 y90Var = new y90(pa0Var, 0);
                        pa0Var.L0 = y90Var;
                        org.telegram.messenger.g0.i3(y90Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                xr0 xr0Var = (xr0) this.f46309c;
                long j11 = this.f46308b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                xr0Var.getClass();
                Bundle bundle = new Bundle();
                if (j11 > 0) {
                    bundle.putLong("user_id", j11);
                } else {
                    bundle.putLong("chat_id", -j11);
                }
                e2Var.presentFragment(new ProfileActivity(bundle, null));
                xr0Var.c(false);
                return;
            case 3:
                xi.e eVar = (xi.e) this.f46309c;
                xi.d dVar = (xi.d) this.d;
                long j12 = this.f46308b;
                if (((xi.d) eVar.f60056b) == dVar) {
                    xi.b bVar = (xi.b) eVar.d;
                    if (bVar != null) {
                        org.telegram.messenger.g0.r(bVar);
                        eVar.d = null;
                    }
                    synchronized (xi.i.f60064y) {
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
                    eVar.f60056b = null;
                    dVar.f60053c.run(j12);
                    eVar.G();
                    return;
                }
                return;
            default:
                long j13 = this.f46308b;
                Exception exc = (Exception) this.d;
                yi.j jVar = (yi.j) ((ac.e) this.f46309c).f1023c;
                if (j13 == jVar.f60764o) {
                    jVar.f60763n = null;
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

    public d80(Object obj, Object obj2, long j3, int i7) {
        this.f46307a = i7;
        this.f46309c = obj;
        this.d = obj2;
        this.f46308b = j3;
    }
}
