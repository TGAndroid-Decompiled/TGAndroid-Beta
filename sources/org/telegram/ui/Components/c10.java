package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c10 extends u4.o {
    public final ArrayList f32499b;
    public final ArrayList f32500c;
    public final e10 d;

    public c10(e10 e10Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = e10Var;
        this.f32499b = arrayList;
        this.f32500c = arrayList2;
    }

    @Override
    public final boolean a(int i3, int i10) {
        return true;
    }

    @Override
    public final boolean b(int i3, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.f32499b;
        int size = arrayList.size();
        e10 e10Var = this.d;
        if (i3 < size && i10 < e10Var.f33265e.size()) {
            return ((org.telegram.messenger.s3) arrayList.get(i3)).equals(e10Var.f33265e.get(i10));
        }
        int size2 = i3 - arrayList.size();
        int size3 = i10 - e10Var.f33265e.size();
        ArrayList arrayList2 = this.f32500c;
        if (size3 >= 0 && size3 < e10Var.f33266f.size() && size2 >= 0 && size2 < arrayList2.size()) {
            if (org.telegram.messenger.zi.C1(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) != org.telegram.messenger.zi.C1(((TLRPC.GroupCallParticipant) e10Var.f33266f.get(size3)).peer)) {
                return false;
            }
            return true;
        }
        if (i3 < arrayList.size()) {
            groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i3)).f25270a;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(size2);
        }
        if (i10 < e10Var.f33265e.size()) {
            groupCallParticipant2 = ((org.telegram.messenger.s3) e10Var.f33265e.get(i10)).f25270a;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) e10Var.f33266f.get(size3);
        }
        if (org.telegram.messenger.zi.C1(groupCallParticipant.peer) != org.telegram.messenger.zi.C1(groupCallParticipant2.peer)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        e10 e10Var = this.d;
        return e10Var.f33266f.size() + e10Var.f33265e.size();
    }

    @Override
    public final int e() {
        return this.f32500c.size() + this.f32499b.size();
    }
}
