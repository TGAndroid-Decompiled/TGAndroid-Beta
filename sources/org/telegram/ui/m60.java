package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class m60 extends s4.o {
    public final ArrayList f38488b;
    public final n60 f38489c;

    public m60(n60 n60Var, ArrayList arrayList) {
        this.f38489c = n60Var;
        this.f38488b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f38488b;
        if (i10 < arrayList.size()) {
            n60 n60Var = this.f38489c;
            if (i11 < n60Var.f38813e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(n60Var.f38813e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f38489c.f38813e.size();
    }

    @Override
    public final int e() {
        return this.f38488b.size();
    }
}
