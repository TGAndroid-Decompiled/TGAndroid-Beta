package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class rn0 extends s4.o {
    public final int f30236b;
    public final int f30237c;
    public final int d;
    public final int e;
    public final int f30238f;
    public final ArrayList f30239g;
    public final int h;
    public final int f30240i;
    public final ArrayList f30241j;
    public final wn0 f30242k;

    public rn0(wn0 wn0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f30242k = wn0Var;
        this.f30236b = i10;
        this.f30237c = i11;
        this.d = i12;
        this.e = i13;
        this.f30238f = i14;
        this.f30239g = arrayList;
        this.h = i15;
        this.f30240i = i16;
        this.f30241j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        wn0 wn0Var = this.f30242k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f30237c && i11 == wn0Var.f32308s) {
                return true;
            }
            if (i10 == this.d && i11 == wn0Var.f32310x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f30238f) {
            messageObject = (MessageObject) this.f30239g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f30240i) {
                messageObject = (MessageObject) this.f30241j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = wn0Var.v;
        if (i11 >= i14 && i11 < wn0Var.f32309w) {
            messageObject2 = (MessageObject) wn0Var.e.get(i11 - i14);
        } else {
            int i15 = wn0Var.f32311y;
            if (i11 >= i15 && i11 < wn0Var.E) {
                messageObject2 = (MessageObject) wn0Var.f32305f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f20350id == messageObject.getDocument().f20350id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f30242k.f32307r;
    }

    @Override
    public final int e() {
        return this.f30236b;
    }
}
