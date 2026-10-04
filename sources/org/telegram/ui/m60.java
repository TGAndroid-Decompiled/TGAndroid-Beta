package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class m60 extends s4.o {
    public final ArrayList f38431b;
    public final n60 f38432c;

    public m60(n60 n60Var, ArrayList arrayList) {
        this.f38432c = n60Var;
        this.f38431b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f38431b;
        if (i10 < arrayList.size()) {
            n60 n60Var = this.f38432c;
            if (i11 < n60Var.f38827e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(n60Var.f38827e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f38432c.f38827e.size();
    }

    @Override
    public final int e() {
        return this.f38431b.size();
    }
}
