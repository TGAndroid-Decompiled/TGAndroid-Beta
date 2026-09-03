package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ov0 implements Runnable {
    public final int f39812a;
    public final long f39813b;
    public final Object f39814c;
    public final Object d;

    public ov0(Object obj, long j10, Object obj2, int i10) {
        this.f39812a = i10;
        this.f39814c = obj;
        this.f39813b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f39812a) {
            case 0:
                yv0 yv0Var = (yv0) this.f39814c;
                long j10 = this.f39813b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                yv0Var.getClass();
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                p2Var.presentFragment(new ProfileActivity(bundle, null));
                yv0Var.c(false);
                return;
            case 1:
                qh.w7 w7Var = (qh.w7) this.f39814c;
                long j11 = this.f39813b;
                w7Var.getClass();
                w7Var.d(j11, ((TLRPC.ChatFull) this.d).participants);
                return;
            case 2:
                sf.f fVar = (sf.f) this.f39814c;
                sf.e eVar = (sf.e) this.d;
                long j12 = this.f39813b;
                if (((sf.e) fVar.f47352c) == eVar) {
                    sf.c cVar = (sf.c) fVar.f47353e;
                    if (cVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(cVar);
                        fVar.f47353e = null;
                    }
                    synchronized (sf.k.f47362t) {
                        try {
                            sf.k kVar = sf.k.v;
                            if (kVar != null) {
                                kVar.m();
                                sf.k.v = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    fVar.f47352c = null;
                    eVar.f47348c.run(j12);
                    fVar.D();
                    return;
                }
                return;
            default:
                ((long[]) this.f39814c)[0] = this.f39813b;
                ((eg.d3) this.d).run();
                return;
        }
    }

    public ov0(sf.f fVar, sf.e eVar, long j10) {
        this.f39812a = 2;
        this.f39814c = fVar;
        this.d = eVar;
        this.f39813b = j10;
    }
}
