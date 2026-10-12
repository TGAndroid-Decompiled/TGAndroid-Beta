package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class m60 extends s4.o {
    public final ArrayList f39932b;
    public final n60 f39933c;

    public m60(n60 n60Var, ArrayList arrayList) {
        this.f39933c = n60Var;
        this.f39932b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f39932b;
        if (i10 < arrayList.size()) {
            n60 n60Var = this.f39933c;
            if (i11 < n60Var.f40239e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(n60Var.f40239e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f39933c.f40239e.size();
    }

    @Override
    public final int e() {
        return this.f39932b.size();
    }
}
