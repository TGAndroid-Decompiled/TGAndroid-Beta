package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class fn0 extends s4.o {
    public final int f24359b;
    public final int f24360c;
    public final int d;
    public final int e;
    public final int f24361f;
    public final ArrayList f24362g;
    public final int h;
    public final int f24363i;
    public final ArrayList f24364j;
    public final kn0 f24365k;

    public fn0(kn0 kn0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f24365k = kn0Var;
        this.f24359b = i10;
        this.f24360c = i11;
        this.d = i12;
        this.e = i13;
        this.f24361f = i14;
        this.f24362g = arrayList;
        this.h = i15;
        this.f24363i = i16;
        this.f24364j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        kn0 kn0Var = this.f24365k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f24360c && i11 == kn0Var.f25803s) {
                return true;
            }
            if (i10 == this.d && i11 == kn0Var.f25805x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f24361f) {
            messageObject = (MessageObject) this.f24362g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f24363i) {
                messageObject = (MessageObject) this.f24364j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = kn0Var.v;
        if (i11 >= i14 && i11 < kn0Var.f25804w) {
            messageObject2 = (MessageObject) kn0Var.e.get(i11 - i14);
        } else {
            int i15 = kn0Var.f25806y;
            if (i11 >= i15 && i11 < kn0Var.E) {
                messageObject2 = (MessageObject) kn0Var.f25800f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f18335id == messageObject.getDocument().f18335id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f24365k.f25802r;
    }

    @Override
    public final int e() {
        return this.f24359b;
    }
}
