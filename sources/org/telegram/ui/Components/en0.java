package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class en0 extends s4.o {
    public final int f23906b;
    public final int f23907c;
    public final int d;
    public final int e;
    public final int f23908f;
    public final ArrayList f23909g;
    public final int h;
    public final int f23910i;
    public final ArrayList f23911j;
    public final jn0 f23912k;

    public en0(jn0 jn0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f23912k = jn0Var;
        this.f23906b = i10;
        this.f23907c = i11;
        this.d = i12;
        this.e = i13;
        this.f23908f = i14;
        this.f23909g = arrayList;
        this.h = i15;
        this.f23910i = i16;
        this.f23911j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        jn0 jn0Var = this.f23912k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f23907c && i11 == jn0Var.f25385s) {
                return true;
            }
            if (i10 == this.d && i11 == jn0Var.f25387x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f23908f) {
            messageObject = (MessageObject) this.f23909g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f23910i) {
                messageObject = (MessageObject) this.f23911j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = jn0Var.v;
        if (i11 >= i14 && i11 < jn0Var.f25386w) {
            messageObject2 = (MessageObject) jn0Var.e.get(i11 - i14);
        } else {
            int i15 = jn0Var.f25388y;
            if (i11 >= i15 && i11 < jn0Var.E) {
                messageObject2 = (MessageObject) jn0Var.f25382f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f18302id == messageObject.getDocument().f18302id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f23912k.f25384r;
    }

    @Override
    public final int e() {
        return this.f23906b;
    }
}
