package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class c30 extends s4.o {
    public final ArrayList f23923b;
    public final ArrayList f23924c;
    public final f30 d;

    public c30(f30 f30Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = f30Var;
        this.f23923b = arrayList;
        this.f23924c = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f23923b;
        int size = arrayList.size();
        f30 f30Var = this.d;
        if (i10 < size && i11 < f30Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(f30Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - f30Var.e.size();
        ArrayList arrayList2 = this.f23924c;
        if (size3 >= 0 && size3 < f30Var.f24874f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != MessageObject.getPeerId(((TLRPC.GroupCallParticipant) f30Var.f24874f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i10 < arrayList.size()) {
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i11 < f30Var.e.size()) {
            groupCallParticipant2 = ((ChatObject.VideoParticipant) f30Var.e.get(i11)).participant;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) f30Var.f24874f.get(size3);
        }
        if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        f30 f30Var = this.d;
        return f30Var.f24874f.size() + f30Var.e.size();
    }

    @Override
    public final int e() {
        return this.f23924c.size() + this.f23923b.size();
    }
}
