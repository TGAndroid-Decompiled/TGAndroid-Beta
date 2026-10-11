package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class h30 extends s4.o {
    public final ArrayList f26897b;
    public final ArrayList f26898c;
    public final k30 d;

    public h30(k30 k30Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = k30Var;
        this.f26897b = arrayList;
        this.f26898c = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f26897b;
        int size = arrayList.size();
        k30 k30Var = this.d;
        if (i10 < size && i11 < k30Var.f27828e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(k30Var.f27828e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - k30Var.f27828e.size();
        ArrayList arrayList2 = this.f26898c;
        if (size3 >= 0 && size3 < k30Var.f27829f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != MessageObject.getPeerId(((TLRPC.GroupCallParticipant) k30Var.f27829f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i10 < arrayList.size()) {
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i11 < k30Var.f27828e.size()) {
            groupCallParticipant2 = ((ChatObject.VideoParticipant) k30Var.f27828e.get(i11)).participant;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) k30Var.f27829f.get(size3);
        }
        if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        k30 k30Var = this.d;
        return k30Var.f27829f.size() + k30Var.f27828e.size();
    }

    @Override
    public final int e() {
        return this.f26898c.size() + this.f26897b.size();
    }
}
