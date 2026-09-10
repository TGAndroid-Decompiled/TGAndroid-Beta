package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nj implements ll0, sj {
    public final bk f25531a;

    public nj(bk bkVar) {
        this.f25531a = bkVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z10, int i10, long j3) {
        bk bkVar = this.f25531a;
        bkVar.f26422b.dismiss(true);
        bkVar.J.a(user, z10, i10, j3);
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        bk bkVar = this.f25531a;
        s4.h0 adapter = bkVar.f21845s.getAdapter();
        xj xjVar = bkVar.F;
        if (adapter == xjVar) {
            O = xjVar.E(i10);
        } else {
            vj vjVar = bkVar.E;
            O = vjVar.O(vjVar.S(i10), vjVar.Q(i10));
        }
        if (O != null) {
            bkVar.L((ak) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
    }
}
