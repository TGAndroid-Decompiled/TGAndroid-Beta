package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class t20 extends s4.o {
    public final ArrayList f31036b;
    public final ArrayList f31037c;
    public final w20 d;

    public t20(w20 w20Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = w20Var;
        this.f31036b = arrayList;
        this.f31037c = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f31036b;
        int size = arrayList.size();
        w20 w20Var = this.d;
        if (i10 < size && i11 < w20Var.f32480e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(w20Var.f32480e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - w20Var.f32480e.size();
        ArrayList arrayList2 = this.f31037c;
        if (size3 >= 0 && size3 < w20Var.f32481f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != MessageObject.getPeerId(((TLRPC.GroupCallParticipant) w20Var.f32481f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i10 < arrayList.size()) {
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i11 < w20Var.f32480e.size()) {
            groupCallParticipant2 = ((ChatObject.VideoParticipant) w20Var.f32480e.get(i11)).participant;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) w20Var.f32481f.get(size3);
        }
        if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        w20 w20Var = this.d;
        return w20Var.f32481f.size() + w20Var.f32480e.size();
    }

    @Override
    public final int e() {
        return this.f31037c.size() + this.f31036b.size();
    }
}
