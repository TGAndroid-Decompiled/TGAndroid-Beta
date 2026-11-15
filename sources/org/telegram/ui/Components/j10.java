package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class j10 extends v4.o {
    public final ArrayList f35819b;
    public final ArrayList f35820c;
    public final l10 d;

    public j10(l10 l10Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = l10Var;
        this.f35819b = arrayList;
        this.f35820c = arrayList2;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return true;
    }

    @Override
    public final boolean b(int i7, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f35819b;
        int size = arrayList.size();
        l10 l10Var = this.d;
        if (i7 < size && i10 < l10Var.f36683e.size()) {
            return ((org.telegram.messenger.s3) arrayList.get(i7)).equals(l10Var.f36683e.get(i10));
        }
        int size2 = i7 - arrayList.size();
        int size3 = i10 - l10Var.f36683e.size();
        ArrayList arrayList2 = this.f35820c;
        if (size3 >= 0 && size3 < l10Var.f36684f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (org.telegram.messenger.gj.B1(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != org.telegram.messenger.gj.B1(((TLRPC.GroupCallParticipant) l10Var.f36684f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i7 < arrayList.size()) {
            groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i7)).f26403a;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i10 < l10Var.f36683e.size()) {
            groupCallParticipant2 = ((org.telegram.messenger.s3) l10Var.f36683e.get(i10)).f26403a;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) l10Var.f36684f.get(size3);
        }
        if (org.telegram.messenger.gj.B1(groupCallParticipant.peer) != org.telegram.messenger.gj.B1(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        l10 l10Var = this.d;
        return l10Var.f36684f.size() + l10Var.f36683e.size();
    }

    @Override
    public final int e() {
        return this.f35820c.size() + this.f35819b.size();
    }
}
