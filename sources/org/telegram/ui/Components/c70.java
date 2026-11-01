package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class c70 implements RequestDelegate {
    public final int f25039a;
    public final long f25040b;
    public final Object f25041c;
    public final Object d;
    public final Object e;

    public c70(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f25039a = i10;
        this.f25041c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f25040b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25039a) {
            case 0:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.g((org.telegram.ui.ActionBar.x1) this.f25041c, tLObject, this.f25040b, (org.telegram.messenger.c) this.d, (org.telegram.messenger.as) this.e, 5));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.r00((org.telegram.ui.ActionBar.k2) this.f25041c, tLObject, (org.telegram.messenger.bp) this.d, tL_error, (Runnable) this.e, this.f25040b, 3));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.g((rh.r) this.d, (org.telegram.ui.ActionBar.x1) this.f25041c, tLObject, this.f25040b, (org.telegram.messenger.r20) this.e));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.r00((rh.e4) this.f25041c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.e, tL_error, this.f25040b, 4));
                return;
            default:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.g((rh.e6) this.f25041c, tLObject, (org.telegram.messenger.kj) this.d, this.f25040b, (Runnable) this.e, 12));
                return;
        }
    }

    public c70(org.telegram.ui.ActionBar.x1 x1Var, long j10, org.telegram.messenger.c cVar, org.telegram.messenger.as asVar) {
        this.f25039a = 0;
        this.f25041c = x1Var;
        this.f25040b = j10;
        this.d = cVar;
        this.e = asVar;
    }

    public c70(rh.r rVar, org.telegram.ui.ActionBar.x1 x1Var, long j10, org.telegram.messenger.r20 r20Var) {
        this.f25039a = 2;
        this.d = rVar;
        this.f25041c = x1Var;
        this.f25040b = j10;
        this.e = r20Var;
    }

    public c70(rh.e6 e6Var, org.telegram.messenger.kj kjVar, long j10, Runnable runnable) {
        this.f25039a = 4;
        this.f25041c = e6Var;
        this.d = kjVar;
        this.f25040b = j10;
        this.e = runnable;
    }
}
