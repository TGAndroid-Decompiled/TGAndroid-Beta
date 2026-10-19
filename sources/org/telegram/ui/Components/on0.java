package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class on0 extends s4.o {
    public final int f29031b;
    public final int f29032c;
    public final int d;
    public final int e;
    public final int f29033f;
    public final ArrayList f29034g;
    public final int h;
    public final int f29035i;
    public final ArrayList f29036j;
    public final tn0 f29037k;

    public on0(tn0 tn0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f29037k = tn0Var;
        this.f29031b = i10;
        this.f29032c = i11;
        this.d = i12;
        this.e = i13;
        this.f29033f = i14;
        this.f29034g = arrayList;
        this.h = i15;
        this.f29035i = i16;
        this.f29036j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        tn0 tn0Var = this.f29037k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f29032c && i11 == tn0Var.f30634s) {
                return true;
            }
            if (i10 == this.d && i11 == tn0Var.f30636x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f29033f) {
            messageObject = (MessageObject) this.f29034g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f29035i) {
                messageObject = (MessageObject) this.f29036j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = tn0Var.v;
        if (i11 >= i14 && i11 < tn0Var.f30635w) {
            messageObject2 = (MessageObject) tn0Var.e.get(i11 - i14);
        } else {
            int i15 = tn0Var.f30637y;
            if (i11 >= i15 && i11 < tn0Var.E) {
                messageObject2 = (MessageObject) tn0Var.f30631f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f20279id == messageObject.getDocument().f20279id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f29037k.f30633r;
    }

    @Override
    public final int e() {
        return this.f29031b;
    }
}
