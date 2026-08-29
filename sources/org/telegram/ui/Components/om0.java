package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class om0 extends f2.q {
    public final int f31391b;
    public final int f31392c;
    public final int d;
    public final int f31393e;
    public final int f31394f;
    public final ArrayList f31395g;
    public final int h;
    public final int f31396i;
    public final ArrayList f31397j;
    public final tm0 f31398k;

    public om0(tm0 tm0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f31398k = tm0Var;
        this.f31391b = i10;
        this.f31392c = i11;
        this.d = i12;
        this.f31393e = i13;
        this.f31394f = i14;
        this.f31395g = arrayList;
        this.h = i15;
        this.f31396i = i16;
        this.f31397j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        tm0 tm0Var = this.f31398k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f31392c && i11 == tm0Var.f32984s) {
                return true;
            }
            if (i10 == this.d && i11 == tm0Var.f32986x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.f31393e;
        if (i10 >= i12 && i10 < this.f31394f) {
            messageObject = (MessageObject) this.f31395g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f31396i) {
                messageObject = (MessageObject) this.f31397j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = tm0Var.v;
        if (i11 >= i14 && i11 < tm0Var.f32985w) {
            messageObject2 = (MessageObject) tm0Var.f32980e.get(i11 - i14);
        } else {
            int i15 = tm0Var.f32987y;
            if (i11 >= i15 && i11 < tm0Var.A) {
                messageObject2 = (MessageObject) tm0Var.f32981f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f22398id == messageObject.getDocument().f22398id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f31398k.f32983r;
    }

    @Override
    public final int e() {
        return this.f31391b;
    }
}
