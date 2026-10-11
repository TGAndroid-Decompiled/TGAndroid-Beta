package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class k60 extends s4.o {
    public final ArrayList f39248b;
    public final l60 f39249c;

    public k60(l60 l60Var, ArrayList arrayList) {
        this.f39249c = l60Var;
        this.f39248b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f39248b;
        if (i10 < arrayList.size()) {
            l60 l60Var = this.f39249c;
            if (i11 < l60Var.f39556e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(l60Var.f39556e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f39249c.f39556e.size();
    }

    @Override
    public final int e() {
        return this.f39248b.size();
    }
}
