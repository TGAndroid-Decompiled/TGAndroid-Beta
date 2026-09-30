package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class gn0 extends s4.o {
    public final int f24644b;
    public final int f24645c;
    public final int d;
    public final int e;
    public final int f24646f;
    public final ArrayList f24647g;
    public final int h;
    public final int f24648i;
    public final ArrayList f24649j;
    public final ln0 f24650k;

    public gn0(ln0 ln0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f24650k = ln0Var;
        this.f24644b = i10;
        this.f24645c = i11;
        this.d = i12;
        this.e = i13;
        this.f24646f = i14;
        this.f24647g = arrayList;
        this.h = i15;
        this.f24648i = i16;
        this.f24649j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        ln0 ln0Var = this.f24650k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f24645c && i11 == ln0Var.f26065s) {
                return true;
            }
            if (i10 == this.d && i11 == ln0Var.f26067x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f24646f) {
            messageObject = (MessageObject) this.f24647g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f24648i) {
                messageObject = (MessageObject) this.f24649j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = ln0Var.v;
        if (i11 >= i14 && i11 < ln0Var.f26066w) {
            messageObject2 = (MessageObject) ln0Var.e.get(i11 - i14);
        } else {
            int i15 = ln0Var.f26068y;
            if (i11 >= i15 && i11 < ln0Var.E) {
                messageObject2 = (MessageObject) ln0Var.f26062f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f18358id == messageObject.getDocument().f18358id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f24650k.f26064r;
    }

    @Override
    public final int e() {
        return this.f24644b;
    }
}
