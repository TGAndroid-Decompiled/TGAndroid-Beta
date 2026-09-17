package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class p60 extends s4.o {
    public final ArrayList f36540b;
    public final q60 f36541c;

    public p60(q60 q60Var, ArrayList arrayList) {
        this.f36541c = q60Var;
        this.f36540b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f36540b;
        if (i10 < arrayList.size()) {
            q60 q60Var = this.f36541c;
            if (i11 < q60Var.e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(q60Var.e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f36541c.e.size();
    }

    @Override
    public final int e() {
        return this.f36540b.size();
    }
}
