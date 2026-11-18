package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class q10 extends v4.o {
    public final ArrayList f38679b;
    public final ArrayList f38680c;
    public final s10 d;

    public q10(s10 s10Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = s10Var;
        this.f38679b = arrayList;
        this.f38680c = arrayList2;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return true;
    }

    @Override
    public final boolean b(int i7, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f38679b;
        int size = arrayList.size();
        s10 s10Var = this.d;
        if (i7 < size && i10 < s10Var.f39443e.size()) {
            return ((org.telegram.messenger.u3) arrayList.get(i7)).equals(s10Var.f39443e.get(i10));
        }
        int size2 = i7 - arrayList.size();
        int size3 = i10 - s10Var.f39443e.size();
        ArrayList arrayList2 = this.f38680c;
        if (size3 >= 0 && size3 < s10Var.f39444f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (org.telegram.messenger.fj.B1(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != org.telegram.messenger.fj.B1(((TLRPC.GroupCallParticipant) s10Var.f39444f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i7 < arrayList.size()) {
            groupCallParticipant = ((org.telegram.messenger.u3) arrayList.get(i7)).f27119a;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i10 < s10Var.f39443e.size()) {
            groupCallParticipant2 = ((org.telegram.messenger.u3) s10Var.f39443e.get(i10)).f27119a;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) s10Var.f39444f.get(size3);
        }
        if (org.telegram.messenger.fj.B1(groupCallParticipant.peer) != org.telegram.messenger.fj.B1(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        s10 s10Var = this.d;
        return s10Var.f39444f.size() + s10Var.f39443e.size();
    }

    @Override
    public final int e() {
        return this.f38680c.size() + this.f38679b.size();
    }
}
