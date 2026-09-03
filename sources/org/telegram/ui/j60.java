package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class j60 extends f2.q {
    public final ArrayList f35097b;
    public final k60 f35098c;

    public j60(k60 k60Var, ArrayList arrayList) {
        this.f35098c = k60Var;
        this.f35097b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f35097b;
        if (i10 < arrayList.size()) {
            k60 k60Var = this.f35098c;
            if (i11 < k60Var.e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(k60Var.e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f35098c.e.size();
    }

    @Override
    public final int e() {
        return this.f35097b.size();
    }
}
