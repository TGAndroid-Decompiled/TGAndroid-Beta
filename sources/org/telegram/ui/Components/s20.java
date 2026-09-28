package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class s20 extends s4.o {
    public final ArrayList f28111b;
    public final ArrayList f28112c;
    public final v20 d;

    public s20(v20 v20Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = v20Var;
        this.f28111b = arrayList;
        this.f28112c = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f28111b;
        int size = arrayList.size();
        v20 v20Var = this.d;
        if (i10 < size && i11 < v20Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(v20Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - v20Var.e.size();
        ArrayList arrayList2 = this.f28112c;
        if (size3 >= 0 && size3 < v20Var.f28957f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != MessageObject.getPeerId(((TLRPC.GroupCallParticipant) v20Var.f28957f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i10 < arrayList.size()) {
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i11 < v20Var.e.size()) {
            groupCallParticipant2 = ((ChatObject.VideoParticipant) v20Var.e.get(i11)).participant;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) v20Var.f28957f.get(size3);
        }
        if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        v20 v20Var = this.d;
        return v20Var.f28957f.size() + v20Var.e.size();
    }

    @Override
    public final int e() {
        return this.f28112c.size() + this.f28111b.size();
    }
}
