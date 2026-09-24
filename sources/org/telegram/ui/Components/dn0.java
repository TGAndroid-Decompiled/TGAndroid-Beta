package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class dn0 extends s4.o {
    public final int f23678b;
    public final int f23679c;
    public final int d;
    public final int e;
    public final int f23680f;
    public final ArrayList f23681g;
    public final int h;
    public final int f23682i;
    public final ArrayList f23683j;
    public final in0 f23684k;

    public dn0(in0 in0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f23684k = in0Var;
        this.f23678b = i10;
        this.f23679c = i11;
        this.d = i12;
        this.e = i13;
        this.f23680f = i14;
        this.f23681g = arrayList;
        this.h = i15;
        this.f23682i = i16;
        this.f23683j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        in0 in0Var = this.f23684k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f23679c && i11 == in0Var.f25099s) {
                return true;
            }
            if (i10 == this.d && i11 == in0Var.f25101x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f23680f) {
            messageObject = (MessageObject) this.f23681g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f23682i) {
                messageObject = (MessageObject) this.f23683j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = in0Var.v;
        if (i11 >= i14 && i11 < in0Var.f25100w) {
            messageObject2 = (MessageObject) in0Var.e.get(i11 - i14);
        } else {
            int i15 = in0Var.f25102y;
            if (i11 >= i15 && i11 < in0Var.E) {
                messageObject2 = (MessageObject) in0Var.f25096f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f18327id == messageObject.getDocument().f18327id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f23684k.f25098r;
    }

    @Override
    public final int e() {
        return this.f23678b;
    }
}
