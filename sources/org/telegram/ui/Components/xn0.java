package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class xn0 extends s4.p {
    public final int f34780b;
    public final int f34781c;
    public final int d;
    public final int e;
    public final int f34782f;
    public final ArrayList f34783g;
    public final int h;
    public final int f34784i;
    public final ArrayList f34785j;
    public final co0 f34786k;

    public xn0(co0 co0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f34786k = co0Var;
        this.f34780b = i10;
        this.f34781c = i11;
        this.d = i12;
        this.e = i13;
        this.f34782f = i14;
        this.f34783g = arrayList;
        this.h = i15;
        this.f34784i = i16;
        this.f34785j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        co0 co0Var = this.f34786k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f34781c && i11 == co0Var.f27221s) {
                return true;
            }
            if (i10 == this.d && i11 == co0Var.f27223x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f34782f) {
            messageObject = (MessageObject) this.f34783g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f34784i) {
                messageObject = (MessageObject) this.f34785j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = co0Var.v;
        if (i11 >= i14 && i11 < co0Var.f27222w) {
            messageObject2 = (MessageObject) co0Var.e.get(i11 - i14);
        } else {
            int i15 = co0Var.f27224y;
            if (i11 >= i15 && i11 < co0Var.E) {
                messageObject2 = (MessageObject) co0Var.f27218f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f22033id == messageObject.getDocument().f22033id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f34786k.f27220r;
    }

    @Override
    public final int e() {
        return this.f34780b;
    }
}
