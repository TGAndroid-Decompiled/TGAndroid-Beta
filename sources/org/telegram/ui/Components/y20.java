package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class y20 extends s4.o {
    public final ArrayList f29227b;
    public final ArrayList f29228c;
    public final b30 d;

    public y20(b30 b30Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = b30Var;
        this.f29227b = arrayList;
        this.f29228c = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f29227b;
        int size = arrayList.size();
        b30 b30Var = this.d;
        if (i10 < size && i11 < b30Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(b30Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - b30Var.e.size();
        ArrayList arrayList2 = this.f29228c;
        if (size3 >= 0 && size3 < b30Var.f21694f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != MessageObject.getPeerId(((TLRPC.GroupCallParticipant) b30Var.f21694f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i10 < arrayList.size()) {
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i11 < b30Var.e.size()) {
            groupCallParticipant2 = ((ChatObject.VideoParticipant) b30Var.e.get(i11)).participant;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) b30Var.f21694f.get(size3);
        }
        if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        b30 b30Var = this.d;
        return b30Var.f21694f.size() + b30Var.e.size();
    }

    @Override
    public final int e() {
        return this.f29228c.size() + this.f29227b.size();
    }
}
