package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class fn0 extends s4.o {
    public final int f24299b;
    public final int f24300c;
    public final int d;
    public final int e;
    public final int f24301f;
    public final ArrayList f24302g;
    public final int h;
    public final int f24303i;
    public final ArrayList f24304j;
    public final kn0 f24305k;

    public fn0(kn0 kn0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f24305k = kn0Var;
        this.f24299b = i10;
        this.f24300c = i11;
        this.d = i12;
        this.e = i13;
        this.f24301f = i14;
        this.f24302g = arrayList;
        this.h = i15;
        this.f24303i = i16;
        this.f24304j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        kn0 kn0Var = this.f24305k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f24300c && i11 == kn0Var.f25773s) {
                return true;
            }
            if (i10 == this.d && i11 == kn0Var.f25775x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f24301f) {
            messageObject = (MessageObject) this.f24302g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f24303i) {
                messageObject = (MessageObject) this.f24304j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = kn0Var.v;
        if (i11 >= i14 && i11 < kn0Var.f25774w) {
            messageObject2 = (MessageObject) kn0Var.e.get(i11 - i14);
        } else {
            int i15 = kn0Var.f25776y;
            if (i11 >= i15 && i11 < kn0Var.E) {
                messageObject2 = (MessageObject) kn0Var.f25770f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f18343id == messageObject.getDocument().f18343id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f24305k.f25772r;
    }

    @Override
    public final int e() {
        return this.f24299b;
    }
}
