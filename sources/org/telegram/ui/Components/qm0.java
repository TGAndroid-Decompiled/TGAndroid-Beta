package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class qm0 extends s4.o {
    public final int f27392b;
    public final int f27393c;
    public final int d;
    public final int e;
    public final int f27394f;
    public final ArrayList f27395g;
    public final int h;
    public final int f27396i;
    public final ArrayList f27397j;
    public final vm0 f27398k;

    public qm0(vm0 vm0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f27398k = vm0Var;
        this.f27392b = i10;
        this.f27393c = i11;
        this.d = i12;
        this.e = i13;
        this.f27394f = i14;
        this.f27395g = arrayList;
        this.h = i15;
        this.f27396i = i16;
        this.f27397j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        vm0 vm0Var = this.f27398k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f27393c && i11 == vm0Var.f28838s) {
                return true;
            }
            if (i10 == this.d && i11 == vm0Var.f28840x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f27394f) {
            messageObject = (MessageObject) this.f27395g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f27396i) {
                messageObject = (MessageObject) this.f27397j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = vm0Var.v;
        if (i11 >= i14 && i11 < vm0Var.f28839w) {
            messageObject2 = (MessageObject) vm0Var.e.get(i11 - i14);
        } else {
            int i15 = vm0Var.f28841y;
            if (i11 >= i15 && i11 < vm0Var.E) {
                messageObject2 = (MessageObject) vm0Var.f28835f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f18118id == messageObject.getDocument().f18118id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f27398k.f28837r;
    }

    @Override
    public final int e() {
        return this.f27392b;
    }
}
