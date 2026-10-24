package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class k91 extends dq {
    public final boolean[] f38877e1;
    public final t91 f38878f1;
    public final m91 f38879g1;

    public k91(m91 m91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, t91 t91Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f38879g1 = m91Var;
        this.f38877e1 = zArr;
        this.f38878f1 = t91Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f38877e1[0]) {
            t91 t91Var = this.f38878f1;
            if (org.telegram.ui.Components.vc.a(t91Var)) {
                org.telegram.ui.Components.vc.C(t91Var, this.f38879g1.f39519a.first_name).j();
            }
        }
    }
}
