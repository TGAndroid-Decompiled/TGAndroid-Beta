package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class sn0 extends s4.o {
    public final int f30527b;
    public final int f30528c;
    public final int d;
    public final int e;
    public final int f30529f;
    public final ArrayList f30530g;
    public final int h;
    public final int f30531i;
    public final ArrayList f30532j;
    public final xn0 f30533k;

    public sn0(xn0 xn0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f30533k = xn0Var;
        this.f30527b = i10;
        this.f30528c = i11;
        this.d = i12;
        this.e = i13;
        this.f30529f = i14;
        this.f30530g = arrayList;
        this.h = i15;
        this.f30531i = i16;
        this.f30532j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        xn0 xn0Var = this.f30533k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f30528c && i11 == xn0Var.f32612s) {
                return true;
            }
            if (i10 == this.d && i11 == xn0Var.f32614x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f30529f) {
            messageObject = (MessageObject) this.f30530g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f30531i) {
                messageObject = (MessageObject) this.f30532j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = xn0Var.v;
        if (i11 >= i14 && i11 < xn0Var.f32613w) {
            messageObject2 = (MessageObject) xn0Var.e.get(i11 - i14);
        } else {
            int i15 = xn0Var.f32615y;
            if (i11 >= i15 && i11 < xn0Var.E) {
                messageObject2 = (MessageObject) xn0Var.f32609f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f20349id == messageObject.getDocument().f20349id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f30533k.f32611r;
    }

    @Override
    public final int e() {
        return this.f30527b;
    }
}
