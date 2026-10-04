package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class jn0 extends s4.o {
    public final int f27860b;
    public final int f27861c;
    public final int d;
    public final int f27862e;
    public final int f27863f;
    public final ArrayList f27864g;
    public final int h;
    public final int f27865i;
    public final ArrayList f27866j;
    public final on0 f27867k;

    public jn0(on0 on0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f27867k = on0Var;
        this.f27860b = i10;
        this.f27861c = i11;
        this.d = i12;
        this.f27862e = i13;
        this.f27863f = i14;
        this.f27864g = arrayList;
        this.h = i15;
        this.f27865i = i16;
        this.f27866j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        on0 on0Var = this.f27867k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f27861c && i11 == on0Var.f29413s) {
                return true;
            }
            if (i10 == this.d && i11 == on0Var.f29415x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.f27862e;
        if (i10 >= i12 && i10 < this.f27863f) {
            messageObject = (MessageObject) this.f27864g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f27865i) {
                messageObject = (MessageObject) this.f27866j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = on0Var.v;
        if (i11 >= i14 && i11 < on0Var.f29414w) {
            messageObject2 = (MessageObject) on0Var.f29409e.get(i11 - i14);
        } else {
            int i15 = on0Var.f29416y;
            if (i11 >= i15 && i11 < on0Var.E) {
                messageObject2 = (MessageObject) on0Var.f29410f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f20043id == messageObject.getDocument().f20043id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f27867k.f29412r;
    }

    @Override
    public final int e() {
        return this.f27860b;
    }
}
