package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class m60 extends s4.o {
    public final ArrayList f38432b;
    public final n60 f38433c;

    public m60(n60 n60Var, ArrayList arrayList) {
        this.f38433c = n60Var;
        this.f38432b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f38432b;
        if (i10 < arrayList.size()) {
            n60 n60Var = this.f38433c;
            if (i11 < n60Var.f38828e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(n60Var.f38828e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f38433c.f38828e.size();
    }

    @Override
    public final int e() {
        return this.f38432b.size();
    }
}
