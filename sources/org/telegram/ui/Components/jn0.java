package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class jn0 extends s4.o {
    public final int f27861b;
    public final int f27862c;
    public final int d;
    public final int f27863e;
    public final int f27864f;
    public final ArrayList f27865g;
    public final int h;
    public final int f27866i;
    public final ArrayList f27867j;
    public final on0 f27868k;

    public jn0(on0 on0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f27868k = on0Var;
        this.f27861b = i10;
        this.f27862c = i11;
        this.d = i12;
        this.f27863e = i13;
        this.f27864f = i14;
        this.f27865g = arrayList;
        this.h = i15;
        this.f27866i = i16;
        this.f27867j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        on0 on0Var = this.f27868k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f27862c && i11 == on0Var.f29414s) {
                return true;
            }
            if (i10 == this.d && i11 == on0Var.f29416x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.f27863e;
        if (i10 >= i12 && i10 < this.f27864f) {
            messageObject = (MessageObject) this.f27865g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f27866i) {
                messageObject = (MessageObject) this.f27867j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = on0Var.v;
        if (i11 >= i14 && i11 < on0Var.f29415w) {
            messageObject2 = (MessageObject) on0Var.f29410e.get(i11 - i14);
        } else {
            int i15 = on0Var.f29417y;
            if (i11 >= i15 && i11 < on0Var.E) {
                messageObject2 = (MessageObject) on0Var.f29411f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f20044id == messageObject.getDocument().f20044id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f27868k.f29413r;
    }

    @Override
    public final int e() {
        return this.f27861b;
    }
}
