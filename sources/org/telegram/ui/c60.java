package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class c60 extends s4.p {
    public final ArrayList f38181b;
    public final d60 f38182c;

    public c60(d60 d60Var, ArrayList arrayList) {
        this.f38182c = d60Var;
        this.f38181b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f38181b;
        if (i10 < arrayList.size()) {
            d60 d60Var = this.f38182c;
            if (i11 < d60Var.e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(d60Var.e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f38182c.e.size();
    }

    @Override
    public final int e() {
        return this.f38181b.size();
    }
}
