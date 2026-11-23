package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class r10 extends v4.p {
    public final ArrayList f39150b;
    public final ArrayList f39151c;
    public final t10 d;

    public r10(t10 t10Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = t10Var;
        this.f39150b = arrayList;
        this.f39151c = arrayList2;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return true;
    }

    @Override
    public final boolean b(int i7, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f39150b;
        int size = arrayList.size();
        t10 t10Var = this.d;
        if (i7 < size && i10 < t10Var.f39776e.size()) {
            return ((org.telegram.messenger.u3) arrayList.get(i7)).equals(t10Var.f39776e.get(i10));
        }
        int size2 = i7 - arrayList.size();
        int size3 = i10 - t10Var.f39776e.size();
        ArrayList arrayList2 = this.f39151c;
        if (size3 >= 0 && size3 < t10Var.f39777f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (org.telegram.messenger.fj.B1(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != org.telegram.messenger.fj.B1(((TLRPC.GroupCallParticipant) t10Var.f39777f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i7 < arrayList.size()) {
            groupCallParticipant = ((org.telegram.messenger.u3) arrayList.get(i7)).f27215a;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i10 < t10Var.f39776e.size()) {
            groupCallParticipant2 = ((org.telegram.messenger.u3) t10Var.f39776e.get(i10)).f27215a;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) t10Var.f39777f.get(size3);
        }
        if (org.telegram.messenger.fj.B1(groupCallParticipant.peer) != org.telegram.messenger.fj.B1(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        t10 t10Var = this.d;
        return t10Var.f39777f.size() + t10Var.f39776e.size();
    }

    @Override
    public final int e() {
        return this.f39151c.size() + this.f39150b.size();
    }
}
