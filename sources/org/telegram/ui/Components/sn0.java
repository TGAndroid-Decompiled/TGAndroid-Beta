package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class sn0 extends s4.o {
    public final int f28865b;
    public final int f28866c;
    public final int d;
    public final int e;
    public final int f28867f;
    public final ArrayList f28868g;
    public final int h;
    public final int f28869i;
    public final ArrayList f28870j;
    public final xn0 f28871k;

    public sn0(xn0 xn0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f28871k = xn0Var;
        this.f28865b = i10;
        this.f28866c = i11;
        this.d = i12;
        this.e = i13;
        this.f28867f = i14;
        this.f28868g = arrayList;
        this.h = i15;
        this.f28869i = i16;
        this.f28870j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        xn0 xn0Var = this.f28871k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f28866c && i11 == xn0Var.f30971s) {
                return true;
            }
            if (i10 == this.d && i11 == xn0Var.f30973x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f28867f) {
            messageObject = (MessageObject) this.f28868g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f28869i) {
                messageObject = (MessageObject) this.f28870j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = xn0Var.v;
        if (i11 >= i14 && i11 < xn0Var.f30972w) {
            messageObject2 = (MessageObject) xn0Var.e.get(i11 - i14);
        } else {
            int i15 = xn0Var.f30974y;
            if (i11 >= i15 && i11 < xn0Var.E) {
                messageObject2 = (MessageObject) xn0Var.f30968f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f18922id == messageObject.getDocument().f18922id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f28871k.f30970r;
    }

    @Override
    public final int e() {
        return this.f28865b;
    }
}
