package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class k60 extends s4.o {
    public final ArrayList f39150b;
    public final l60 f39151c;

    public k60(l60 l60Var, ArrayList arrayList) {
        this.f39151c = l60Var;
        this.f39150b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f39150b;
        if (i10 < arrayList.size()) {
            l60 l60Var = this.f39151c;
            if (i11 < l60Var.f39488e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(l60Var.f39488e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f39151c.f39488e.size();
    }

    @Override
    public final int e() {
        return this.f39150b.size();
    }
}
