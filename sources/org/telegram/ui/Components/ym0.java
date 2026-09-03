package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class ym0 extends f2.q {
    public final int f33565b;
    public final int f33566c;
    public final int d;
    public final int f33567e;
    public final int f33568f;
    public final ArrayList f33569g;
    public final int h;
    public final int f33570i;
    public final ArrayList f33571j;
    public final dn0 f33572k;

    public ym0(dn0 dn0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f33572k = dn0Var;
        this.f33565b = i10;
        this.f33566c = i11;
        this.d = i12;
        this.f33567e = i13;
        this.f33568f = i14;
        this.f33569g = arrayList;
        this.h = i15;
        this.f33570i = i16;
        this.f33571j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        dn0 dn0Var = this.f33572k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f33566c && i11 == dn0Var.f26316s) {
                return true;
            }
            if (i10 == this.d && i11 == dn0Var.f26318x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.f33567e;
        if (i10 >= i12 && i10 < this.f33568f) {
            messageObject = (MessageObject) this.f33569g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f33570i) {
                messageObject = (MessageObject) this.f33571j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = dn0Var.v;
        if (i11 >= i14 && i11 < dn0Var.f26317w) {
            messageObject2 = (MessageObject) dn0Var.f26312e.get(i11 - i14);
        } else {
            int i15 = dn0Var.f26319y;
            if (i11 >= i15 && i11 < dn0Var.B) {
                messageObject2 = (MessageObject) dn0Var.f26313f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f20851id == messageObject.getDocument().f20851id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f33572k.f26315r;
    }

    @Override
    public final int e() {
        return this.f33565b;
    }
}
