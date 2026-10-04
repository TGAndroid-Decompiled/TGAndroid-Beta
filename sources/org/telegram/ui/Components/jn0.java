package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class jn0 extends s4.o {
    public final int f27866b;
    public final int f27867c;
    public final int d;
    public final int f27868e;
    public final int f27869f;
    public final ArrayList f27870g;
    public final int h;
    public final int f27871i;
    public final ArrayList f27872j;
    public final on0 f27873k;

    public jn0(on0 on0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f27873k = on0Var;
        this.f27866b = i10;
        this.f27867c = i11;
        this.d = i12;
        this.f27868e = i13;
        this.f27869f = i14;
        this.f27870g = arrayList;
        this.h = i15;
        this.f27871i = i16;
        this.f27872j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        on0 on0Var = this.f27873k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f27867c && i11 == on0Var.f29419s) {
                return true;
            }
            if (i10 == this.d && i11 == on0Var.f29421x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.f27868e;
        if (i10 >= i12 && i10 < this.f27869f) {
            messageObject = (MessageObject) this.f27870g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f27871i) {
                messageObject = (MessageObject) this.f27872j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = on0Var.v;
        if (i11 >= i14 && i11 < on0Var.f29420w) {
            messageObject2 = (MessageObject) on0Var.f29415e.get(i11 - i14);
        } else {
            int i15 = on0Var.f29422y;
            if (i11 >= i15 && i11 < on0Var.E) {
                messageObject2 = (MessageObject) on0Var.f29416f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f20048id == messageObject.getDocument().f20048id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f27873k.f29418r;
    }

    @Override
    public final int e() {
        return this.f27866b;
    }
}
