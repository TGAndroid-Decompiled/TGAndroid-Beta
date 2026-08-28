package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a20 extends f2.s {
    public final ArrayList f26632b;
    public final ArrayList f26633c;
    public final c20 d;

    public a20(c20 c20Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = c20Var;
        this.f26632b = arrayList;
        this.f26633c = arrayList2;
    }

    @Override
    public final boolean a(int i9, int i10) {
        return true;
    }

    @Override
    public final boolean b(int i9, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f26632b;
        int size = arrayList.size();
        c20 c20Var = this.d;
        if (i9 < size && i10 < c20Var.f27350e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i9)).equals(c20Var.f27350e.get(i10));
        }
        int size2 = i9 - arrayList.size();
        int size3 = i10 - c20Var.f27350e.size();
        ArrayList arrayList2 = this.f26633c;
        if (size3 >= 0 && size3 < c20Var.f27351f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != MessageObject.getPeerId(((TLRPC.GroupCallParticipant) c20Var.f27351f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i9 < arrayList.size()) {
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i9)).participant;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i10 < c20Var.f27350e.size()) {
            groupCallParticipant2 = ((ChatObject.VideoParticipant) c20Var.f27350e.get(i10)).participant;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) c20Var.f27351f.get(size3);
        }
        if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        c20 c20Var = this.d;
        return c20Var.f27351f.size() + c20Var.f27350e.size();
    }

    @Override
    public final int e() {
        return this.f26633c.size() + this.f26632b.size();
    }
}
