package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class i60 extends f2.q {
    public final ArrayList f37758b;
    public final j60 f37759c;

    public i60(j60 j60Var, ArrayList arrayList) {
        this.f37759c = j60Var;
        this.f37758b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f37758b;
        if (i10 < arrayList.size()) {
            j60 j60Var = this.f37759c;
            if (i11 < j60Var.f38021e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(j60Var.f38021e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f37759c.f38021e.size();
    }

    @Override
    public final int e() {
        return this.f37758b.size();
    }
}
