package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class l60 extends s4.o {
    public final ArrayList f35253b;
    public final m60 f35254c;

    public l60(m60 m60Var, ArrayList arrayList) {
        this.f35254c = m60Var;
        this.f35253b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f35253b;
        if (i10 < arrayList.size()) {
            m60 m60Var = this.f35254c;
            if (i11 < m60Var.e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(m60Var.e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f35254c.e.size();
    }

    @Override
    public final int e() {
        return this.f35253b.size();
    }
}
