package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class d20 extends f2.q {

    public final ArrayList f27620b;

    public final ArrayList f27621c;
    public final f20 d;

    public d20(f20 f20Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = f20Var;
        this.f27620b = arrayList;
        this.f27621c = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f27620b;
        int size = arrayList.size();
        f20 f20Var = this.d;
        if (i10 < size && i11 < f20Var.f28234e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(f20Var.f28234e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - f20Var.f28234e.size();
        ArrayList arrayList2 = this.f27621c;
        if (size3 < 0 || size3 >= f20Var.f28235f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return MessageObject.getPeerId((i10 < arrayList.size() ? ((ChatObject.VideoParticipant) arrayList.get(i10)).participant : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId((i11 < f20Var.f28234e.size() ? ((ChatObject.VideoParticipant) f20Var.f28234e.get(i11)).participant : (TLRPC.GroupCallParticipant) f20Var.f28235f.get(size3)).peer);
        }
        return MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId(((TLRPC.GroupCallParticipant) f20Var.f28235f.get(size3)).peer);
    }

    @Override
    public final int d() {
        f20 f20Var = this.d;
        return f20Var.f28235f.size() + f20Var.f28234e.size();
    }

    @Override
    public final int e() {
        return this.f27621c.size() + this.f27620b.size();
    }
}
