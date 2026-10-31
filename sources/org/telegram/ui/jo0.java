package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class jo0 implements org.telegram.ui.Cells.u5 {
    public final fg.j f38560a;

    public jo0(fg.j jVar) {
        this.f38560a = jVar;
    }

    public final void a() {
        un unVar;
        TLRPC.Chat chat;
        lo0 lo0Var = (lo0) this.f38560a.e;
        if (lo0Var.I && (unVar = lo0Var.U) != null && (chat = unVar.e) != null && !org.telegram.messenger.w3.N(chat) && chat.slowmode_enabled && lo0Var.W != 2) {
            org.telegram.ui.Components.s4.t0(lo0Var, org.telegram.messenger.cd.L0(2131745328, null), org.telegram.messenger.cd.L0(2131745321, null), null);
            if (lo0Var.W == 1) {
                lo0Var.W = 2;
            }
        }
    }

    @Override
    public final void d(org.telegram.ui.Cells.v5 v5Var) {
        boolean z10;
        int intValue = ((Integer) v5Var.getTag()).intValue();
        lo0 lo0Var = (lo0) this.f38560a.e;
        org.telegram.messenger.we weVar = lo0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (weVar != null) {
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) weVar.e.get(intValue);
            boolean containsKey = lo0Var.f39329b.containsKey(Integer.valueOf(efVar.C));
            z10 = !containsKey;
            if (!containsKey && lo0Var.H > 0 && lo0Var.f39329b.size() >= lo0Var.H) {
                a();
                return;
            }
            if (lo0Var.e && !containsKey) {
                i10 = lo0Var.f39331c.size();
            }
            v5Var.b(i10, z10, true);
            lo0Var.c0(intValue, efVar);
        } else {
            org.telegram.messenger.i0.v1(lo0Var.getParentActivity().getCurrentFocus());
            org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) lo0Var.f39335f.get(intValue);
            boolean containsKey2 = lo0Var.f39329b.containsKey(hfVar.B);
            z10 = !containsKey2;
            if (!containsKey2 && lo0Var.H > 0 && lo0Var.f39329b.size() >= lo0Var.H) {
                a();
                return;
            }
            if (lo0Var.e && !containsKey2) {
                i10 = lo0Var.f39331c.size();
            }
            v5Var.b(i10, z10, true);
            lo0Var.c0(intValue, hfVar);
        }
        if (!z10) {
            i11 = 2;
        }
        lo0Var.m0(i11);
        lo0Var.f39351s0.y();
    }
}
