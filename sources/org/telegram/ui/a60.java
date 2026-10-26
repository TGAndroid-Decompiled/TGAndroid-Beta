package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class a60 extends s4.p {
    public final ArrayList f37653b;
    public final b60 f37654c;

    public a60(b60 b60Var, ArrayList arrayList) {
        this.f37654c = b60Var;
        this.f37653b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f37653b;
        if (i10 < arrayList.size()) {
            b60 b60Var = this.f37654c;
            if (i11 < b60Var.e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(b60Var.e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f37654c.e.size();
    }

    @Override
    public final int e() {
        return this.f37653b.size();
    }
}
