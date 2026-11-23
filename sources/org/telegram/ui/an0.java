package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class an0 implements org.telegram.ui.Cells.r5 {
    public final l4 f45618a;

    public an0(l4 l4Var) {
        this.f45618a = l4Var;
    }

    public final void a() {
        bn bnVar;
        TLRPC.Chat chat;
        cn0 cn0Var = (cn0) this.f45618a.f49452e;
        if (cn0Var.J && (bnVar = cn0Var.V) != null && (chat = bnVar.f45958e) != null && !org.telegram.messenger.v3.N(chat) && chat.slowmode_enabled && cn0Var.X != 2) {
            org.telegram.ui.Components.c5.r0(cn0Var, org.telegram.messenger.hd.N0(2131745114, null), org.telegram.messenger.hd.N0(2131745107, null), null);
            if (cn0Var.X == 1) {
                cn0Var.X = 2;
            }
        }
    }

    @Override
    public final void e(org.telegram.ui.Cells.s5 s5Var) {
        boolean z10;
        int intValue = ((Integer) s5Var.getTag()).intValue();
        cn0 cn0Var = (cn0) this.f45618a.f49452e;
        org.telegram.messenger.ve veVar = cn0Var.K;
        int i7 = -1;
        int i10 = 1;
        if (veVar != null) {
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) veVar.f27321e.get(intValue);
            boolean containsKey = cn0Var.f46581b.containsKey(Integer.valueOf(ffVar.C));
            z10 = !containsKey;
            if (!containsKey && cn0Var.I > 0 && cn0Var.f46581b.size() >= cn0Var.I) {
                a();
                return;
            }
            if (cn0Var.f46586e && !containsKey) {
                i7 = cn0Var.f46583c.size();
            }
            s5Var.b(i7, z10, true);
            cn0Var.d0(intValue, ffVar);
        } else {
            org.telegram.messenger.g0.v1(cn0Var.getParentActivity().getCurrentFocus());
            org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) cn0Var.f46588f.get(intValue);
            boolean containsKey2 = cn0Var.f46581b.containsKey(jfVar.B);
            z10 = !containsKey2;
            if (!containsKey2 && cn0Var.I > 0 && cn0Var.f46581b.size() >= cn0Var.I) {
                a();
                return;
            }
            if (cn0Var.f46586e && !containsKey2) {
                i7 = cn0Var.f46583c.size();
            }
            s5Var.b(i7, z10, true);
            cn0Var.d0(intValue, jfVar);
        }
        if (!z10) {
            i10 = 2;
        }
        cn0Var.n0(i10);
        cn0Var.f46605t0.u();
    }
}
