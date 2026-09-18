package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class p20 extends s4.o {
    public final ArrayList f27093b;
    public final ArrayList f27094c;
    public final s20 d;

    public p20(s20 s20Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = s20Var;
        this.f27093b = arrayList;
        this.f27094c = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f27093b;
        int size = arrayList.size();
        s20 s20Var = this.d;
        if (i10 < size && i11 < s20Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(s20Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - s20Var.e.size();
        ArrayList arrayList2 = this.f27094c;
        if (size3 >= 0 && size3 < s20Var.f28034f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != MessageObject.getPeerId(((TLRPC.GroupCallParticipant) s20Var.f28034f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i10 < arrayList.size()) {
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i11 < s20Var.e.size()) {
            groupCallParticipant2 = ((ChatObject.VideoParticipant) s20Var.e.get(i11)).participant;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) s20Var.f28034f.get(size3);
        }
        if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        s20 s20Var = this.d;
        return s20Var.f28034f.size() + s20Var.e.size();
    }

    @Override
    public final int e() {
        return this.f27094c.size() + this.f27093b.size();
    }
}
