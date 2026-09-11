package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class p20 extends s4.o {
    public final ArrayList f29263b;
    public final ArrayList f29264c;
    public final s20 d;

    public p20(s20 s20Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = s20Var;
        this.f29263b = arrayList;
        this.f29264c = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f29263b;
        int size = arrayList.size();
        s20 s20Var = this.d;
        if (i10 < size && i11 < s20Var.f30171e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(s20Var.f30171e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - s20Var.f30171e.size();
        ArrayList arrayList2 = this.f29264c;
        if (size3 >= 0 && size3 < s20Var.f30172f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != MessageObject.getPeerId(((TLRPC.GroupCallParticipant) s20Var.f30172f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i10 < arrayList.size()) {
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i11 < s20Var.f30171e.size()) {
            groupCallParticipant2 = ((ChatObject.VideoParticipant) s20Var.f30171e.get(i11)).participant;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) s20Var.f30172f.get(size3);
        }
        if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        s20 s20Var = this.d;
        return s20Var.f30172f.size() + s20Var.f30171e.size();
    }

    @Override
    public final int e() {
        return this.f29264c.size() + this.f29263b.size();
    }
}
