package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class g30 extends s4.o {
    public final ArrayList f26568b;
    public final ArrayList f26569c;
    public final j30 d;

    public g30(j30 j30Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = j30Var;
        this.f26568b = arrayList;
        this.f26569c = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f26568b;
        int size = arrayList.size();
        j30 j30Var = this.d;
        if (i10 < size && i11 < j30Var.f27566e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(j30Var.f27566e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - j30Var.f27566e.size();
        ArrayList arrayList2 = this.f26569c;
        if (size3 >= 0 && size3 < j30Var.f27567f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != MessageObject.getPeerId(((TLRPC.GroupCallParticipant) j30Var.f27567f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i10 < arrayList.size()) {
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i11 < j30Var.f27566e.size()) {
            groupCallParticipant2 = ((ChatObject.VideoParticipant) j30Var.f27566e.get(i11)).participant;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) j30Var.f27567f.get(size3);
        }
        if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        j30 j30Var = this.d;
        return j30Var.f27567f.size() + j30Var.f27566e.size();
    }

    @Override
    public final int e() {
        return this.f26569c.size() + this.f26568b.size();
    }
}
