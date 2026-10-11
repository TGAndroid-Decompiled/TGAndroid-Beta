package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class k60 extends s4.o {
    public final ArrayList f39214b;
    public final l60 f39215c;

    public k60(l60 l60Var, ArrayList arrayList) {
        this.f39215c = l60Var;
        this.f39214b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f39214b;
        if (i10 < arrayList.size()) {
            l60 l60Var = this.f39215c;
            if (i11 < l60Var.f39522e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(l60Var.f39522e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f39215c.f39522e.size();
    }

    @Override
    public final int e() {
        return this.f39214b.size();
    }
}
