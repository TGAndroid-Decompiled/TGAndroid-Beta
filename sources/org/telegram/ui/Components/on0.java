package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class on0 extends s4.o {
    public final int f29005b;
    public final int f29006c;
    public final int d;
    public final int e;
    public final int f29007f;
    public final ArrayList f29008g;
    public final int h;
    public final int f29009i;
    public final ArrayList f29010j;
    public final tn0 f29011k;

    public on0(tn0 tn0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f29011k = tn0Var;
        this.f29005b = i10;
        this.f29006c = i11;
        this.d = i12;
        this.e = i13;
        this.f29007f = i14;
        this.f29008g = arrayList;
        this.h = i15;
        this.f29009i = i16;
        this.f29010j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        tn0 tn0Var = this.f29011k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f29006c && i11 == tn0Var.f30674s) {
                return true;
            }
            if (i10 == this.d && i11 == tn0Var.f30676x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f29007f) {
            messageObject = (MessageObject) this.f29008g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f29009i) {
                messageObject = (MessageObject) this.f29010j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = tn0Var.v;
        if (i11 >= i14 && i11 < tn0Var.f30675w) {
            messageObject2 = (MessageObject) tn0Var.e.get(i11 - i14);
        } else {
            int i15 = tn0Var.f30677y;
            if (i11 >= i15 && i11 < tn0Var.E) {
                messageObject2 = (MessageObject) tn0Var.f30671f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f20278id == messageObject.getDocument().f20278id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f29011k.f30673r;
    }

    @Override
    public final int e() {
        return this.f29005b;
    }
}
