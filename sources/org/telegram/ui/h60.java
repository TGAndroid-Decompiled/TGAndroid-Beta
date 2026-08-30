package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class h60 extends f2.q {
    public final ArrayList f34769b;
    public final i60 f34770c;

    public h60(i60 i60Var, ArrayList arrayList) {
        this.f34770c = i60Var;
        this.f34769b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f34769b;
        if (i10 < arrayList.size()) {
            i60 i60Var = this.f34770c;
            if (i11 < i60Var.e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(i60Var.e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f34770c.e.size();
    }

    @Override
    public final int e() {
        return this.f34769b.size();
    }
}
