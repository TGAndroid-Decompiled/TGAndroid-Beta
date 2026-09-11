package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class qm0 extends s4.o {
    public final int f29774b;
    public final int f29775c;
    public final int d;
    public final int f29776e;
    public final int f29777f;
    public final ArrayList f29778g;
    public final int h;
    public final int f29779i;
    public final ArrayList f29780j;
    public final vm0 f29781k;

    public qm0(vm0 vm0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f29781k = vm0Var;
        this.f29774b = i10;
        this.f29775c = i11;
        this.d = i12;
        this.f29776e = i13;
        this.f29777f = i14;
        this.f29778g = arrayList;
        this.h = i15;
        this.f29779i = i16;
        this.f29780j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        vm0 vm0Var = this.f29781k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f29775c && i11 == vm0Var.f31370s) {
                return true;
            }
            if (i10 == this.d && i11 == vm0Var.f31372x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.f29776e;
        if (i10 >= i12 && i10 < this.f29777f) {
            messageObject = (MessageObject) this.f29778g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f29779i) {
                messageObject = (MessageObject) this.f29780j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = vm0Var.v;
        if (i11 >= i14 && i11 < vm0Var.f31371w) {
            messageObject2 = (MessageObject) vm0Var.f31366e.get(i11 - i14);
        } else {
            int i15 = vm0Var.f31373y;
            if (i11 >= i15 && i11 < vm0Var.E) {
                messageObject2 = (MessageObject) vm0Var.f31367f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f19875id == messageObject.getDocument().f19875id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f29781k.f31369r;
    }

    @Override
    public final int e() {
        return this.f29774b;
    }
}
