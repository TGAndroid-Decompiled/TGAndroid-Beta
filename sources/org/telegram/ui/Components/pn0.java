package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class pn0 extends s4.o {
    public final int f29345b;
    public final int f29346c;
    public final int d;
    public final int e;
    public final int f29347f;
    public final ArrayList f29348g;
    public final int h;
    public final int f29349i;
    public final ArrayList f29350j;
    public final un0 f29351k;

    public pn0(un0 un0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f29351k = un0Var;
        this.f29345b = i10;
        this.f29346c = i11;
        this.d = i12;
        this.e = i13;
        this.f29347f = i14;
        this.f29348g = arrayList;
        this.h = i15;
        this.f29349i = i16;
        this.f29350j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        un0 un0Var = this.f29351k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f29346c && i11 == un0Var.f30985s) {
                return true;
            }
            if (i10 == this.d && i11 == un0Var.f30987x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f29347f) {
            messageObject = (MessageObject) this.f29348g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f29349i) {
                messageObject = (MessageObject) this.f29350j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = un0Var.v;
        if (i11 >= i14 && i11 < un0Var.f30986w) {
            messageObject2 = (MessageObject) un0Var.e.get(i11 - i14);
        } else {
            int i15 = un0Var.f30988y;
            if (i11 >= i15 && i11 < un0Var.E) {
                messageObject2 = (MessageObject) un0Var.f30982f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f20285id == messageObject.getDocument().f20285id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f29351k.f30984r;
    }

    @Override
    public final int e() {
        return this.f29345b;
    }
}
