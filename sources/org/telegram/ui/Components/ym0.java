package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class ym0 extends f2.q {
    public final int f31052b;
    public final int f31053c;
    public final int d;
    public final int e;
    public final int f31054f;
    public final ArrayList f31055g;
    public final int h;
    public final int f31056i;
    public final ArrayList f31057j;
    public final dn0 f31058k;

    public ym0(dn0 dn0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f31058k = dn0Var;
        this.f31052b = i10;
        this.f31053c = i11;
        this.d = i12;
        this.e = i13;
        this.f31054f = i14;
        this.f31055g = arrayList;
        this.h = i15;
        this.f31056i = i16;
        this.f31057j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        dn0 dn0Var = this.f31058k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f31053c && i11 == dn0Var.f24313s) {
                return true;
            }
            if (i10 == this.d && i11 == dn0Var.f24315x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f31054f) {
            messageObject = (MessageObject) this.f31055g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f31056i) {
                messageObject = (MessageObject) this.f31057j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = dn0Var.v;
        if (i11 >= i14 && i11 < dn0Var.f24314w) {
            messageObject2 = (MessageObject) dn0Var.e.get(i11 - i14);
        } else {
            int i15 = dn0Var.f24316y;
            if (i11 >= i15 && i11 < dn0Var.B) {
                messageObject2 = (MessageObject) dn0Var.f24310f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f19190id == messageObject.getDocument().f19190id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f31058k.f24312r;
    }

    @Override
    public final int e() {
        return this.f31052b;
    }
}
