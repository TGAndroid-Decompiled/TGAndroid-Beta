package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ga0 implements Runnable {
    public final int f45944a;
    public final long f45945b;
    public final Object f45946c;
    public final Object d;

    public ga0(Object obj, long j3, Object obj2, int i7) {
        this.f45944a = i7;
        this.f45946c = obj;
        this.f45945b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f45944a) {
            case 0:
                ra0 ra0Var = (ra0) this.f45946c;
                TLObject tLObject = (TLObject) this.d;
                long j3 = this.f45945b;
                if (ra0Var.E != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i7 = 0;
                    while (i7 < messages_messages.messages.size()) {
                        if (!(messages_messages.messages.get(i7).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                            messages_messages.messages.remove(i7);
                            i7--;
                        }
                        i7++;
                    }
                    ra0Var.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                    ra0Var.getMessagesController().Y3(messages_messages.users, false);
                    ra0Var.getMessagesController().S3(messages_messages.chats, false);
                    ra0Var.getLocationController().f25457c.k(messages_messages.messages, j3);
                    ra0Var.getNotificationCenter().k(282, Long.valueOf(j3));
                    ra0Var.p0(messages_messages.messages);
                    ra0Var.getLocationController().j(ra0Var.f49374l0);
                    if (ra0Var.K0 == null) {
                        z90 z90Var = new z90(ra0Var, 0);
                        ra0Var.K0 = z90Var;
                        org.telegram.messenger.g0.i3(z90Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                bs0 bs0Var = (bs0) this.f45946c;
                long j10 = this.f45945b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.d;
                bs0Var.getClass();
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                f2Var.presentFragment(new ProfileActivity(bundle, null));
                bs0Var.c(false);
                return;
            case 2:
                ui.e eVar = (ui.e) this.f45946c;
                ui.d dVar = (ui.d) this.d;
                long j11 = this.f45945b;
                if (((ui.d) eVar.f56944c) == dVar) {
                    ui.b bVar = (ui.b) eVar.f56945e;
                    if (bVar != null) {
                        org.telegram.messenger.g0.r(bVar);
                        eVar.f56945e = null;
                    }
                    synchronized (ui.i.f56952y) {
                        try {
                            ui.i iVar = ui.i.A;
                            if (iVar != null) {
                                iVar.q();
                                ui.i.A = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    eVar.f56944c = null;
                    dVar.f56940c.run(j11);
                    eVar.S();
                    return;
                }
                return;
            case 3:
                long j12 = this.f45945b;
                Exception exc = (Exception) this.d;
                vi.h hVar = (vi.h) ((ac.e) this.f45946c).f1025c;
                if (j12 == hVar.f57565o) {
                    hVar.f57564n = null;
                    int i10 = hVar.G;
                    if (i10 != 10 && i10 != 9) {
                        hVar.g(exc);
                        return;
                    }
                    hVar.h.a("capture error after session end", exc);
                    hVar.c();
                    hVar.t();
                    return;
                }
                return;
            default:
                zh.g1 g1Var = (zh.g1) this.f45946c;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.d;
                long j13 = this.f45945b;
                g1Var.getClass();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    g1Var.dismiss();
                    if (c20Var != null) {
                        c20Var.a(Boolean.FALSE);
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", j13);
                    bundle2.putBoolean("open_gifts", true);
                    T.presentFragment(new ProfileActivity(bundle2, null));
                    return;
                }
                return;
        }
    }

    public ga0(Object obj, Object obj2, long j3, int i7) {
        this.f45944a = i7;
        this.f45946c = obj;
        this.d = obj2;
        this.f45945b = j3;
    }
}
