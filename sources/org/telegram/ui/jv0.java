package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class jv0 implements Runnable {
    public final int f38228a;
    public final long f38229b;
    public final Object f38230c;
    public final Object d;

    public jv0(Object obj, long j10, Object obj2, int i10) {
        this.f38228a = i10;
        this.f38230c = obj;
        this.f38229b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f38228a) {
            case 0:
                tv0 tv0Var = (tv0) this.f38230c;
                long j10 = this.f38229b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                tv0Var.getClass();
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                p2Var.presentFragment(new ProfileActivity(bundle, null));
                tv0Var.c(false);
                return;
            case 1:
                qh.x7 x7Var = (qh.x7) this.f38230c;
                long j11 = this.f38229b;
                x7Var.getClass();
                x7Var.d(j11, ((TLRPC.ChatFull) this.d).participants);
                return;
            case 2:
                sf.e eVar = (sf.e) this.f38230c;
                sf.d dVar = (sf.d) this.d;
                long j12 = this.f38229b;
                if (((sf.d) eVar.f47316c) == dVar) {
                    sf.b bVar = (sf.b) eVar.f47317e;
                    if (bVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        eVar.f47317e = null;
                    }
                    synchronized (sf.j.f47326t) {
                        try {
                            sf.j jVar = sf.j.v;
                            if (jVar != null) {
                                jVar.m();
                                sf.j.v = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    eVar.f47316c = null;
                    dVar.f47312c.run(j12);
                    eVar.D();
                    return;
                }
                return;
            default:
                ((long[]) this.f38230c)[0] = this.f38229b;
                ((eg.d3) this.d).run();
                return;
        }
    }

    public jv0(sf.e eVar, sf.d dVar, long j10) {
        this.f38228a = 2;
        this.f38230c = eVar;
        this.d = dVar;
        this.f38229b = j10;
    }
}
