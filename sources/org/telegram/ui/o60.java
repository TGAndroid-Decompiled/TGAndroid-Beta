package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class o60 extends s4.o {
    public final ArrayList f35401b;
    public final p60 f35402c;

    public o60(p60 p60Var, ArrayList arrayList) {
        this.f35402c = p60Var;
        this.f35401b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f35401b;
        if (i10 < arrayList.size()) {
            p60 p60Var = this.f35402c;
            if (i11 < p60Var.e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(p60Var.e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f35402c.e.size();
    }

    @Override
    public final int e() {
        return this.f35401b.size();
    }
}
