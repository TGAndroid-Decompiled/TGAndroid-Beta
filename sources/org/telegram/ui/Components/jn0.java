package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class jn0 extends s4.o {
    public final int f27933b;
    public final int f27934c;
    public final int d;
    public final int f27935e;
    public final int f27936f;
    public final ArrayList f27937g;
    public final int h;
    public final int f27938i;
    public final ArrayList f27939j;
    public final on0 f27940k;

    public jn0(on0 on0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f27940k = on0Var;
        this.f27933b = i10;
        this.f27934c = i11;
        this.d = i12;
        this.f27935e = i13;
        this.f27936f = i14;
        this.f27937g = arrayList;
        this.h = i15;
        this.f27938i = i16;
        this.f27939j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        on0 on0Var = this.f27940k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f27934c && i11 == on0Var.f29519s) {
                return true;
            }
            if (i10 == this.d && i11 == on0Var.f29521x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.f27935e;
        if (i10 >= i12 && i10 < this.f27936f) {
            messageObject = (MessageObject) this.f27937g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f27938i) {
                messageObject = (MessageObject) this.f27939j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = on0Var.v;
        if (i11 >= i14 && i11 < on0Var.f29520w) {
            messageObject2 = (MessageObject) on0Var.f29515e.get(i11 - i14);
        } else {
            int i15 = on0Var.f29522y;
            if (i11 >= i15 && i11 < on0Var.E) {
                messageObject2 = (MessageObject) on0Var.f29516f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f20053id == messageObject.getDocument().f20053id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f27940k.f29518r;
    }

    @Override
    public final int e() {
        return this.f27933b;
    }
}
