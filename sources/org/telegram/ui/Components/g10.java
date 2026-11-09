package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class g10 extends v4.o {
    public final ArrayList f33844b;
    public final ArrayList f33845c;
    public final i10 d;

    public g10(i10 i10Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = i10Var;
        this.f33844b = arrayList;
        this.f33845c = arrayList2;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return true;
    }

    @Override
    public final boolean b(int i7, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f33844b;
        int size = arrayList.size();
        i10 i10Var = this.d;
        if (i7 < size && i10 < i10Var.f34515e.size()) {
            return ((org.telegram.messenger.s3) arrayList.get(i7)).equals(i10Var.f34515e.get(i10));
        }
        int size2 = i7 - arrayList.size();
        int size3 = i10 - i10Var.f34515e.size();
        ArrayList arrayList2 = this.f33845c;
        if (size3 >= 0 && size3 < i10Var.f34516f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (org.telegram.messenger.ij.B1(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != org.telegram.messenger.ij.B1(((TLRPC.GroupCallParticipant) i10Var.f34516f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i7 < arrayList.size()) {
            groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i7)).f25409a;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i10 < i10Var.f34515e.size()) {
            groupCallParticipant2 = ((org.telegram.messenger.s3) i10Var.f34515e.get(i10)).f25409a;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) i10Var.f34516f.get(size3);
        }
        if (org.telegram.messenger.ij.B1(groupCallParticipant.peer) != org.telegram.messenger.ij.B1(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        i10 i10Var = this.d;
        return i10Var.f34516f.size() + i10Var.f34515e.size();
    }

    @Override
    public final int e() {
        return this.f33845c.size() + this.f33844b.size();
    }
}
