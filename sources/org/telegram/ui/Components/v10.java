package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class v10 extends s4.n {
    public final ArrayList f31113b;
    public final ArrayList f31114c;
    public final z10 d;

    public v10(z10 z10Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = z10Var;
        this.f31113b = arrayList;
        this.f31114c = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f31113b;
        int size = arrayList.size();
        z10 z10Var = this.d;
        if (i10 < size && i11 < z10Var.e.size()) {
            return ((org.telegram.messenger.v3) arrayList.get(i10)).equals(z10Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - z10Var.e.size();
        ArrayList arrayList2 = this.f31114c;
        if (size3 >= 0 && size3 < z10Var.f32869f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (org.telegram.messenger.jj.C1(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != org.telegram.messenger.jj.C1(((TLRPC.GroupCallParticipant) z10Var.f32869f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i10 < arrayList.size()) {
            groupCallParticipant = ((org.telegram.messenger.v3) arrayList.get(i10)).f18477a;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i11 < z10Var.e.size()) {
            groupCallParticipant2 = ((org.telegram.messenger.v3) z10Var.e.get(i11)).f18477a;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) z10Var.f32869f.get(size3);
        }
        if (org.telegram.messenger.jj.C1(groupCallParticipant.peer) != org.telegram.messenger.jj.C1(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        z10 z10Var = this.d;
        return z10Var.f32869f.size() + z10Var.e.size();
    }

    @Override
    public final int e() {
        return this.f31114c.size() + this.f31113b.size();
    }
}
