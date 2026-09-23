package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class k60 extends s4.o {
    public final ArrayList f34584b;
    public final l60 f34585c;

    public k60(l60 l60Var, ArrayList arrayList) {
        this.f34585c = l60Var;
        this.f34584b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f34584b;
        if (i10 < arrayList.size()) {
            l60 l60Var = this.f34585c;
            if (i11 < l60Var.e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(l60Var.e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f34585c.e.size();
    }

    @Override
    public final int e() {
        return this.f34584b.size();
    }
}
