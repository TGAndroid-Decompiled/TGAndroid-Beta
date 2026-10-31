package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class c70 implements RequestDelegate {
    public final int f25014a;
    public final long f25015b;
    public final Object f25016c;
    public final Object d;
    public final Object e;

    public c70(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f25014a = i10;
        this.f25016c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f25015b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25014a) {
            case 0:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.g((org.telegram.ui.ActionBar.x1) this.f25016c, tLObject, this.f25015b, (org.telegram.messenger.c) this.d, (org.telegram.messenger.zr) this.e, 5));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.q00((org.telegram.ui.ActionBar.k2) this.f25016c, tLObject, (org.telegram.messenger.ap) this.d, tL_error, (Runnable) this.e, this.f25015b, 3));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.g((rh.r) this.d, (org.telegram.ui.ActionBar.x1) this.f25016c, tLObject, this.f25015b, (org.telegram.messenger.q20) this.e));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.q00((rh.e4) this.f25016c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.e, tL_error, this.f25015b, 4));
                return;
            default:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.g((rh.e6) this.f25016c, tLObject, (org.telegram.messenger.jj) this.d, this.f25015b, (Runnable) this.e, 12));
                return;
        }
    }

    public c70(org.telegram.ui.ActionBar.x1 x1Var, long j10, org.telegram.messenger.c cVar, org.telegram.messenger.zr zrVar) {
        this.f25014a = 0;
        this.f25016c = x1Var;
        this.f25015b = j10;
        this.d = cVar;
        this.e = zrVar;
    }

    public c70(rh.r rVar, org.telegram.ui.ActionBar.x1 x1Var, long j10, org.telegram.messenger.q20 q20Var) {
        this.f25014a = 2;
        this.d = rVar;
        this.f25016c = x1Var;
        this.f25015b = j10;
        this.e = q20Var;
    }

    public c70(rh.e6 e6Var, org.telegram.messenger.jj jjVar, long j10, Runnable runnable) {
        this.f25014a = 4;
        this.f25016c = e6Var;
        this.d = jjVar;
        this.f25015b = j10;
        this.e = runnable;
    }
}
