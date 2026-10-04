package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class m60 extends s4.o {
    public final ArrayList f38437b;
    public final n60 f38438c;

    public m60(n60 n60Var, ArrayList arrayList) {
        this.f38438c = n60Var;
        this.f38437b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f38437b;
        if (i10 < arrayList.size()) {
            n60 n60Var = this.f38438c;
            if (i11 < n60Var.f38833e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(n60Var.f38833e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f38438c.f38833e.size();
    }

    @Override
    public final int e() {
        return this.f38437b.size();
    }
}
