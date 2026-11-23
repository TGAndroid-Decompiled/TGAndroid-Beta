package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class t10 extends v4.o {
    public final ArrayList f39750b;
    public final ArrayList f39751c;
    public final v10 d;

    public t10(v10 v10Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = v10Var;
        this.f39750b = arrayList;
        this.f39751c = arrayList2;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return true;
    }

    @Override
    public final boolean b(int i7, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f39750b;
        int size = arrayList.size();
        v10 v10Var = this.d;
        if (i7 < size && i10 < v10Var.f40628e.size()) {
            return ((org.telegram.messenger.u3) arrayList.get(i7)).equals(v10Var.f40628e.get(i10));
        }
        int size2 = i7 - arrayList.size();
        int size3 = i10 - v10Var.f40628e.size();
        ArrayList arrayList2 = this.f39751c;
        if (size3 >= 0 && size3 < v10Var.f40629f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (org.telegram.messenger.gj.B1(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != org.telegram.messenger.gj.B1(((TLRPC.GroupCallParticipant) v10Var.f40629f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i7 < arrayList.size()) {
            groupCallParticipant = ((org.telegram.messenger.u3) arrayList.get(i7)).f27155a;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i10 < v10Var.f40628e.size()) {
            groupCallParticipant2 = ((org.telegram.messenger.u3) v10Var.f40628e.get(i10)).f27155a;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) v10Var.f40629f.get(size3);
        }
        if (org.telegram.messenger.gj.B1(groupCallParticipant.peer) != org.telegram.messenger.gj.B1(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        v10 v10Var = this.d;
        return v10Var.f40629f.size() + v10Var.f40628e.size();
    }

    @Override
    public final int e() {
        return this.f39751c.size() + this.f39750b.size();
    }
}
