package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class k60 extends s4.o {
    public final ArrayList f39104b;
    public final l60 f39105c;

    public k60(l60 l60Var, ArrayList arrayList) {
        this.f39105c = l60Var;
        this.f39104b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f39104b;
        if (i10 < arrayList.size()) {
            l60 l60Var = this.f39105c;
            if (i11 < l60Var.f39442e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(l60Var.f39442e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f39105c.f39442e.size();
    }

    @Override
    public final int e() {
        return this.f39104b.size();
    }
}
