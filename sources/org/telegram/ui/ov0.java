package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ov0 implements Runnable {
    public final int f36888a;
    public final long f36889b;
    public final Object f36890c;
    public final Object d;

    public ov0(Object obj, long j10, Object obj2, int i10) {
        this.f36888a = i10;
        this.f36890c = obj;
        this.f36889b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f36888a) {
            case 0:
                yv0 yv0Var = (yv0) this.f36890c;
                long j10 = this.f36889b;
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
                ph.y7 y7Var = (ph.y7) this.f36890c;
                long j11 = this.f36889b;
                y7Var.getClass();
                y7Var.d(j11, ((TLRPC.ChatFull) this.d).participants);
                return;
            case 2:
                rf.f fVar = (rf.f) this.f36890c;
                rf.e eVar = (rf.e) this.d;
                long j12 = this.f36889b;
                if (((rf.e) fVar.f43491c) == eVar) {
                    rf.c cVar = (rf.c) fVar.e;
                    if (cVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(cVar);
                        fVar.e = null;
                    }
                    synchronized (rf.j.f43497t) {
                        try {
                            rf.j jVar = rf.j.v;
                            if (jVar != null) {
                                jVar.m();
                                rf.j.v = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    fVar.f43491c = null;
                    eVar.f43487c.run(j12);
                    fVar.D();
                    return;
                }
                return;
            default:
                ((long[]) this.f36890c)[0] = this.f36889b;
                ((dg.f3) this.d).run();
                return;
        }
    }

    public ov0(rf.f fVar, rf.e eVar, long j10) {
        this.f36888a = 2;
        this.f36890c = fVar;
        this.d = eVar;
        this.f36889b = j10;
    }
}
