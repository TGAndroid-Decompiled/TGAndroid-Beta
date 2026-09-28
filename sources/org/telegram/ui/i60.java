package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class i60 extends s4.o {
    public final ArrayList f34420b;
    public final j60 f34421c;

    public i60(j60 j60Var, ArrayList arrayList) {
        this.f34421c = j60Var;
        this.f34420b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f34420b;
        if (i10 < arrayList.size()) {
            j60 j60Var = this.f34421c;
            if (i11 < j60Var.e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(j60Var.e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f34421c.e.size();
    }

    @Override
    public final int e() {
        return this.f34420b.size();
    }
}
