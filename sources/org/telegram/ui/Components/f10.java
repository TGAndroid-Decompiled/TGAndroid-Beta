package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f10 extends v4.o {
    public final ArrayList f33439b;
    public final ArrayList f33440c;
    public final h10 d;

    public f10(h10 h10Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = h10Var;
        this.f33439b = arrayList;
        this.f33440c = arrayList2;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return true;
    }

    @Override
    public final boolean b(int i7, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f33439b;
        int size = arrayList.size();
        h10 h10Var = this.d;
        if (i7 < size && i10 < h10Var.f34130e.size()) {
            return ((org.telegram.messenger.s3) arrayList.get(i7)).equals(h10Var.f34130e.get(i10));
        }
        int size2 = i7 - arrayList.size();
        int size3 = i10 - h10Var.f34130e.size();
        ArrayList arrayList2 = this.f33440c;
        if (size3 >= 0 && size3 < h10Var.f34131f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (org.telegram.messenger.ij.C1(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != org.telegram.messenger.ij.C1(((TLRPC.GroupCallParticipant) h10Var.f34131f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i7 < arrayList.size()) {
            groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i7)).f25405a;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i10 < h10Var.f34130e.size()) {
            groupCallParticipant2 = ((org.telegram.messenger.s3) h10Var.f34130e.get(i10)).f25405a;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) h10Var.f34131f.get(size3);
        }
        if (org.telegram.messenger.ij.C1(groupCallParticipant.peer) != org.telegram.messenger.ij.C1(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        h10 h10Var = this.d;
        return h10Var.f34131f.size() + h10Var.f34130e.size();
    }

    @Override
    public final int e() {
        return this.f33440c.size() + this.f33439b.size();
    }
}
