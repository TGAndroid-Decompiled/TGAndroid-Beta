package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class dn0 extends s4.o {
    public final int f23614b;
    public final int f23615c;
    public final int d;
    public final int e;
    public final int f23616f;
    public final ArrayList f23617g;
    public final int h;
    public final int f23618i;
    public final ArrayList f23619j;
    public final in0 f23620k;

    public dn0(in0 in0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f23620k = in0Var;
        this.f23614b = i10;
        this.f23615c = i11;
        this.d = i12;
        this.e = i13;
        this.f23616f = i14;
        this.f23617g = arrayList;
        this.h = i15;
        this.f23618i = i16;
        this.f23619j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        in0 in0Var = this.f23620k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f23615c && i11 == in0Var.f25092s) {
                return true;
            }
            if (i10 == this.d && i11 == in0Var.f25094x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f23616f) {
            messageObject = (MessageObject) this.f23617g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f23618i) {
                messageObject = (MessageObject) this.f23619j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = in0Var.v;
        if (i11 >= i14 && i11 < in0Var.f25093w) {
            messageObject2 = (MessageObject) in0Var.e.get(i11 - i14);
        } else {
            int i15 = in0Var.f25095y;
            if (i11 >= i15 && i11 < in0Var.E) {
                messageObject2 = (MessageObject) in0Var.f25089f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f18334id == messageObject.getDocument().f18334id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f23620k.f25091r;
    }

    @Override
    public final int e() {
        return this.f23614b;
    }
}
