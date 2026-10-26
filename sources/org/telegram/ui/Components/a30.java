package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a30 extends s4.p {
    public final ArrayList f26402b;
    public final ArrayList f26403c;
    public final c30 d;

    public a30(c30 c30Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = c30Var;
        this.f26402b = arrayList;
        this.f26403c = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f26402b;
        int size = arrayList.size();
        c30 c30Var = this.d;
        if (i10 < size && i11 < c30Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(c30Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - c30Var.e.size();
        ArrayList arrayList2 = this.f26403c;
        if (size3 >= 0 && size3 < c30Var.f27046f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != MessageObject.getPeerId(((TLRPC.GroupCallParticipant) c30Var.f27046f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i10 < arrayList.size()) {
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i11 < c30Var.e.size()) {
            groupCallParticipant2 = ((ChatObject.VideoParticipant) c30Var.e.get(i11)).participant;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) c30Var.f27046f.get(size3);
        }
        if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        c30 c30Var = this.d;
        return c30Var.f27046f.size() + c30Var.e.size();
    }

    @Override
    public final int e() {
        return this.f26403c.size() + this.f26402b.size();
    }
}
