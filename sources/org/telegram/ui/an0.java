package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class an0 implements org.telegram.ui.Cells.r5 {
    public final l4 f45610a;

    public an0(l4 l4Var) {
        this.f45610a = l4Var;
    }

    public final void a() {
        bn bnVar;
        TLRPC.Chat chat;
        cn0 cn0Var = (cn0) this.f45610a.f49432e;
        if (cn0Var.J && (bnVar = cn0Var.V) != null && (chat = bnVar.f45978e) != null && !org.telegram.messenger.v3.N(chat) && chat.slowmode_enabled && cn0Var.X != 2) {
            org.telegram.ui.Components.b5.r0(cn0Var, org.telegram.messenger.gd.M0(2131745115, null), org.telegram.messenger.gd.M0(2131745108, null), null);
            if (cn0Var.X == 1) {
                cn0Var.X = 2;
            }
        }
    }

    @Override
    public final void e(org.telegram.ui.Cells.s5 s5Var) {
        boolean z10;
        int intValue = ((Integer) s5Var.getTag()).intValue();
        cn0 cn0Var = (cn0) this.f45610a.f49432e;
        org.telegram.messenger.ue ueVar = cn0Var.K;
        int i7 = -1;
        int i10 = 1;
        if (ueVar != null) {
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ueVar.f27158e.get(intValue);
            boolean containsKey = cn0Var.f46539b.containsKey(Integer.valueOf(efVar.C));
            z10 = !containsKey;
            if (!containsKey && cn0Var.I > 0 && cn0Var.f46539b.size() >= cn0Var.I) {
                a();
                return;
            }
            if (cn0Var.f46544e && !containsKey) {
                i7 = cn0Var.f46541c.size();
            }
            s5Var.b(i7, z10, true);
            cn0Var.d0(intValue, efVar);
        } else {
            org.telegram.messenger.g0.v1(cn0Var.getParentActivity().getCurrentFocus());
            org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) cn0Var.f46546f.get(intValue);
            boolean containsKey2 = cn0Var.f46539b.containsKey(hfVar.B);
            z10 = !containsKey2;
            if (!containsKey2 && cn0Var.I > 0 && cn0Var.f46539b.size() >= cn0Var.I) {
                a();
                return;
            }
            if (cn0Var.f46544e && !containsKey2) {
                i7 = cn0Var.f46541c.size();
            }
            s5Var.b(i7, z10, true);
            cn0Var.d0(intValue, hfVar);
        }
        if (!z10) {
            i10 = 2;
        }
        cn0Var.n0(i10);
        cn0Var.f46563t0.u();
    }
}
