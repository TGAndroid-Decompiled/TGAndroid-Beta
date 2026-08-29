package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class l20 extends f2.q {
    public final ArrayList f30206b;
    public final ArrayList f30207c;
    public final o20 d;

    public l20(o20 o20Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = o20Var;
        this.f30206b = arrayList;
        this.f30207c = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f30206b;
        int size = arrayList.size();
        o20 o20Var = this.d;
        if (i10 < size && i11 < o20Var.f31236e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(o20Var.f31236e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - o20Var.f31236e.size();
        ArrayList arrayList2 = this.f30207c;
        if (size3 >= 0 && size3 < o20Var.f31237f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != MessageObject.getPeerId(((TLRPC.GroupCallParticipant) o20Var.f31237f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i10 < arrayList.size()) {
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i11 < o20Var.f31236e.size()) {
            groupCallParticipant2 = ((ChatObject.VideoParticipant) o20Var.f31236e.get(i11)).participant;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) o20Var.f31237f.get(size3);
        }
        if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        o20 o20Var = this.d;
        return o20Var.f31237f.size() + o20Var.f31236e.size();
    }

    @Override
    public final int e() {
        return this.f30207c.size() + this.f30206b.size();
    }
}
