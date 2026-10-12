package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class co0 extends s4.o {
    public final int f24984b;
    public final int f24985c;
    public final int d;
    public final int f24986e;
    public final int f24987f;
    public final ArrayList f24988g;
    public final int h;
    public final int f24989i;
    public final ArrayList f24990j;
    public final ho0 f24991k;

    public co0(ho0 ho0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f24991k = ho0Var;
        this.f24984b = i10;
        this.f24985c = i11;
        this.d = i12;
        this.f24986e = i13;
        this.f24987f = i14;
        this.f24988g = arrayList;
        this.h = i15;
        this.f24989i = i16;
        this.f24990j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        ho0 ho0Var = this.f24991k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f24985c && i11 == ho0Var.f26860s) {
                return true;
            }
            if (i10 == this.d && i11 == ho0Var.f26862x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.f24986e;
        if (i10 >= i12 && i10 < this.f24987f) {
            messageObject = (MessageObject) this.f24988g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f24989i) {
                messageObject = (MessageObject) this.f24990j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = ho0Var.v;
        if (i11 >= i14 && i11 < ho0Var.f26861w) {
            messageObject2 = (MessageObject) ho0Var.f26856e.get(i11 - i14);
        } else {
            int i15 = ho0Var.f26863y;
            if (i11 >= i15 && i11 < ho0Var.E) {
                messageObject2 = (MessageObject) ho0Var.f26857f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f19808id == messageObject.getDocument().f19808id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f24991k.f26859r;
    }

    @Override
    public final int e() {
        return this.f24984b;
    }
}
