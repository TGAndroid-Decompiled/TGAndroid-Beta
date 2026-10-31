package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o2 implements RequestDelegate {
    public final int f28936a;
    public final long f28937b;
    public final int f28938c;
    public final Object d;
    public final Object e;

    public o2(int i10, int i11, long j10, Object obj, Object obj2) {
        this.f28936a = i11;
        this.d = obj;
        this.e = obj2;
        this.f28938c = i10;
        this.f28937b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28936a) {
            case 0:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.n00(tLObject, this.f28938c, (vh.d) this.d, (org.telegram.ui.ActionBar.z2) this.e, this.f28937b, tL_error));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.n00((org.telegram.ui.rg0) this.d, tL_error, tLObject, this.f28937b, this.f28938c, (TLRPC.Chat) this.e, 3));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Cells.e1((rh.r) this.d, (rh.q) this.e, this.f28938c, tLObject, this.f28937b, 2));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new org.telegram.ui.z(this.f28938c, 7, this.f28937b, (vh.d) this.d, (org.telegram.ui.ActionBar.z2[]) this.e));
                return;
            default:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Cells.e1((th.e5) this.d, tLObject, this.f28938c, (String) this.e, this.f28937b, 4));
                return;
        }
    }

    public o2(int i10, vh.d dVar, org.telegram.ui.ActionBar.z2 z2Var, long j10) {
        this.f28936a = 0;
        this.f28938c = i10;
        this.d = dVar;
        this.e = z2Var;
        this.f28937b = j10;
    }

    public o2(org.telegram.ui.rg0 rg0Var, long j10, int i10, TLRPC.Chat chat) {
        this.f28936a = 1;
        this.d = rg0Var;
        this.f28937b = j10;
        this.f28938c = i10;
        this.e = chat;
    }

    public o2(th.e5 e5Var, int i10, String str, long j10) {
        this.f28936a = 4;
        this.d = e5Var;
        this.f28938c = i10;
        this.e = str;
        this.f28937b = j10;
    }
}
