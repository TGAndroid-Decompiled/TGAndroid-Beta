package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class p91 extends iq {
    public final boolean[] f42357c1;
    public final y91 f42358d1;
    public final r91 f42359e1;

    public p91(r91 r91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, y91 y91Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f42359e1 = r91Var;
        this.f42357c1 = zArr;
        this.f42358d1 = y91Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f42357c1[0]) {
            y91 y91Var = this.f42358d1;
            if (org.telegram.ui.Components.wc.a(y91Var)) {
                org.telegram.ui.Components.wc.C(y91Var, this.f42359e1.f42896a.first_name).j();
            }
        }
    }
}
