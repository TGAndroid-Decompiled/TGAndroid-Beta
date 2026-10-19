package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class y20 extends s4.o {
    public final ArrayList f32535b;
    public final ArrayList f32536c;
    public final a30 d;

    public y20(a30 a30Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = a30Var;
        this.f32535b = arrayList;
        this.f32536c = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f32535b;
        int size = arrayList.size();
        a30 a30Var = this.d;
        if (i10 < size && i11 < a30Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(a30Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - a30Var.e.size();
        ArrayList arrayList2 = this.f32536c;
        if (size3 >= 0 && size3 < a30Var.f24470f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != MessageObject.getPeerId(((TLRPC.GroupCallParticipant) a30Var.f24470f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i10 < arrayList.size()) {
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i11 < a30Var.e.size()) {
            groupCallParticipant2 = ((ChatObject.VideoParticipant) a30Var.e.get(i11)).participant;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) a30Var.f24470f.get(size3);
        }
        if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        a30 a30Var = this.d;
        return a30Var.f24470f.size() + a30Var.e.size();
    }

    @Override
    public final int e() {
        return this.f32536c.size() + this.f32535b.size();
    }
}
