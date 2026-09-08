package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class qm0 extends s4.o {
    public final int f29801b;
    public final int f29802c;
    public final int d;
    public final int f29803e;
    public final int f29804f;
    public final ArrayList f29805g;
    public final int h;
    public final int f29806i;
    public final ArrayList f29807j;
    public final vm0 f29808k;

    public qm0(vm0 vm0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f29808k = vm0Var;
        this.f29801b = i10;
        this.f29802c = i11;
        this.d = i12;
        this.f29803e = i13;
        this.f29804f = i14;
        this.f29805g = arrayList;
        this.h = i15;
        this.f29806i = i16;
        this.f29807j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        vm0 vm0Var = this.f29808k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f29802c && i11 == vm0Var.f31397s) {
                return true;
            }
            if (i10 == this.d && i11 == vm0Var.f31399x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.f29803e;
        if (i10 >= i12 && i10 < this.f29804f) {
            messageObject = (MessageObject) this.f29805g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f29806i) {
                messageObject = (MessageObject) this.f29807j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = vm0Var.v;
        if (i11 >= i14 && i11 < vm0Var.f31398w) {
            messageObject2 = (MessageObject) vm0Var.f31393e.get(i11 - i14);
        } else {
            int i15 = vm0Var.f31400y;
            if (i11 >= i15 && i11 < vm0Var.E) {
                messageObject2 = (MessageObject) vm0Var.f31394f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f19902id == messageObject.getDocument().f19902id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f29808k.f31396r;
    }

    @Override
    public final int e() {
        return this.f29801b;
    }
}
