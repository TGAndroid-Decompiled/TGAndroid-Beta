package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class n60 extends s4.o {
    public final ArrayList f35825b;
    public final o60 f35826c;

    public n60(o60 o60Var, ArrayList arrayList) {
        this.f35826c = o60Var;
        this.f35825b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f35825b;
        if (i10 < arrayList.size()) {
            o60 o60Var = this.f35826c;
            if (i11 < o60Var.e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(o60Var.e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f35826c.e.size();
    }

    @Override
    public final int e() {
        return this.f35825b.size();
    }
}
