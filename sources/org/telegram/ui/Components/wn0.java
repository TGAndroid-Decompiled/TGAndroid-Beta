package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class wn0 extends s4.o {
    public final int f32645b;
    public final int f32646c;
    public final int d;
    public final int f32647e;
    public final int f32648f;
    public final ArrayList f32649g;
    public final int h;
    public final int f32650i;
    public final ArrayList f32651j;
    public final bo0 f32652k;

    public wn0(bo0 bo0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f32652k = bo0Var;
        this.f32645b = i10;
        this.f32646c = i11;
        this.d = i12;
        this.f32647e = i13;
        this.f32648f = i14;
        this.f32649g = arrayList;
        this.h = i15;
        this.f32650i = i16;
        this.f32651j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        bo0 bo0Var = this.f32652k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f32646c && i11 == bo0Var.f25073s) {
                return true;
            }
            if (i10 == this.d && i11 == bo0Var.f25075x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.f32647e;
        if (i10 >= i12 && i10 < this.f32648f) {
            messageObject = (MessageObject) this.f32649g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f32650i) {
                messageObject = (MessageObject) this.f32651j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = bo0Var.v;
        if (i11 >= i14 && i11 < bo0Var.f25074w) {
            messageObject2 = (MessageObject) bo0Var.f25069e.get(i11 - i14);
        } else {
            int i15 = bo0Var.f25076y;
            if (i11 >= i15 && i11 < bo0Var.E) {
                messageObject2 = (MessageObject) bo0Var.f25070f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f20044id == messageObject.getDocument().f20044id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f32652k.f25072r;
    }

    @Override
    public final int e() {
        return this.f32645b;
    }
}
