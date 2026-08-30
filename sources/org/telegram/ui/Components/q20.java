package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class q20 extends f2.q {
    public final ArrayList f28043b;
    public final ArrayList f28044c;
    public final t20 d;

    public q20(t20 t20Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = t20Var;
        this.f28043b = arrayList;
        this.f28044c = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f28043b;
        int size = arrayList.size();
        t20 t20Var = this.d;
        if (i10 < size && i11 < t20Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(t20Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - t20Var.e.size();
        ArrayList arrayList2 = this.f28044c;
        if (size3 >= 0 && size3 < t20Var.f28872f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != MessageObject.getPeerId(((TLRPC.GroupCallParticipant) t20Var.f28872f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i10 < arrayList.size()) {
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i11 < t20Var.e.size()) {
            groupCallParticipant2 = ((ChatObject.VideoParticipant) t20Var.e.get(i11)).participant;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) t20Var.f28872f.get(size3);
        }
        if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        t20 t20Var = this.d;
        return t20Var.f28872f.size() + t20Var.e.size();
    }

    @Override
    public final int e() {
        return this.f28044c.size() + this.f28043b.size();
    }
}
