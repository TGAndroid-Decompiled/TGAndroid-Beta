package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class r20 extends s4.o {
    public final ArrayList f27814b;
    public final ArrayList f27815c;
    public final u20 d;

    public r20(u20 u20Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = u20Var;
        this.f27814b = arrayList;
        this.f27815c = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f27814b;
        int size = arrayList.size();
        u20 u20Var = this.d;
        if (i10 < size && i11 < u20Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(u20Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - u20Var.e.size();
        ArrayList arrayList2 = this.f27815c;
        if (size3 >= 0 && size3 < u20Var.f28681f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != MessageObject.getPeerId(((TLRPC.GroupCallParticipant) u20Var.f28681f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i10 < arrayList.size()) {
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i11 < u20Var.e.size()) {
            groupCallParticipant2 = ((ChatObject.VideoParticipant) u20Var.e.get(i11)).participant;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) u20Var.f28681f.get(size3);
        }
        if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        u20 u20Var = this.d;
        return u20Var.f28681f.size() + u20Var.e.size();
    }

    @Override
    public final int e() {
        return this.f27815c.size() + this.f27814b.size();
    }
}
