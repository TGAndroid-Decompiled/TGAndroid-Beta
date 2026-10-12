package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class j30 extends s4.o {
    public final ArrayList f27349b;
    public final ArrayList f27350c;
    public final m30 d;

    public j30(m30 m30Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = m30Var;
        this.f27349b = arrayList;
        this.f27350c = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f27349b;
        int size = arrayList.size();
        m30 m30Var = this.d;
        if (i10 < size && i11 < m30Var.f28366e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(m30Var.f28366e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - m30Var.f28366e.size();
        ArrayList arrayList2 = this.f27350c;
        if (size3 >= 0 && size3 < m30Var.f28367f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != MessageObject.getPeerId(((TLRPC.GroupCallParticipant) m30Var.f28367f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i10 < arrayList.size()) {
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i11 < m30Var.f28366e.size()) {
            groupCallParticipant2 = ((ChatObject.VideoParticipant) m30Var.f28366e.get(i11)).participant;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) m30Var.f28367f.get(size3);
        }
        if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        m30 m30Var = this.d;
        return m30Var.f28367f.size() + m30Var.f28366e.size();
    }

    @Override
    public final int e() {
        return this.f27350c.size() + this.f27349b.size();
    }
}
