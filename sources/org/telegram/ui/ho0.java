package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ho0 implements org.telegram.ui.Cells.u5 {
    public final fg.j f37845a;

    public ho0(fg.j jVar) {
        this.f37845a = jVar;
    }

    public final void a() {
        un unVar;
        TLRPC.Chat chat;
        jo0 jo0Var = (jo0) this.f37845a.e;
        if (jo0Var.I && (unVar = jo0Var.U) != null && (chat = unVar.e) != null && !org.telegram.messenger.w3.N(chat) && chat.slowmode_enabled && jo0Var.W != 2) {
            org.telegram.ui.Components.s4.t0(jo0Var, org.telegram.messenger.dd.L0(2131745328, null), org.telegram.messenger.dd.L0(2131745321, null), null);
            if (jo0Var.W == 1) {
                jo0Var.W = 2;
            }
        }
    }

    @Override
    public final void d(org.telegram.ui.Cells.v5 v5Var) {
        boolean z10;
        int intValue = ((Integer) v5Var.getTag()).intValue();
        jo0 jo0Var = (jo0) this.f37845a.e;
        org.telegram.messenger.xe xeVar = jo0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (xeVar != null) {
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) xeVar.e.get(intValue);
            boolean containsKey = jo0Var.f38484b.containsKey(Integer.valueOf(ffVar.C));
            z10 = !containsKey;
            if (!containsKey && jo0Var.H > 0 && jo0Var.f38484b.size() >= jo0Var.H) {
                a();
                return;
            }
            if (jo0Var.e && !containsKey) {
                i10 = jo0Var.f38486c.size();
            }
            v5Var.b(i10, z10, true);
            jo0Var.d0(intValue, ffVar);
        } else {
            org.telegram.messenger.i0.v1(jo0Var.getParentActivity().getCurrentFocus());
            org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) jo0Var.f38490f.get(intValue);
            boolean containsKey2 = jo0Var.f38484b.containsKey(jfVar.B);
            z10 = !containsKey2;
            if (!containsKey2 && jo0Var.H > 0 && jo0Var.f38484b.size() >= jo0Var.H) {
                a();
                return;
            }
            if (jo0Var.e && !containsKey2) {
                i10 = jo0Var.f38486c.size();
            }
            v5Var.b(i10, z10, true);
            jo0Var.d0(intValue, jfVar);
        }
        if (!z10) {
            i11 = 2;
        }
        jo0Var.n0(i11);
        jo0Var.f38506s0.y();
    }
}
