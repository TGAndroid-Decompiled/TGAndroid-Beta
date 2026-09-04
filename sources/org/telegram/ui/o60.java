package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class o60 extends s4.o {
    public final ArrayList f39116b;
    public final p60 f39117c;

    public o60(p60 p60Var, ArrayList arrayList) {
        this.f39117c = p60Var;
        this.f39116b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f39116b;
        if (i10 < arrayList.size()) {
            p60 p60Var = this.f39117c;
            if (i11 < p60Var.f39411e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(p60Var.f39411e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f39117c.f39411e.size();
    }

    @Override
    public final int e() {
        return this.f39116b.size();
    }
}
