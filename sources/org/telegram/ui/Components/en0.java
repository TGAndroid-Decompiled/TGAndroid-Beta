package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class en0 extends s4.o {
    public final int f24018b;
    public final int f24019c;
    public final int d;
    public final int e;
    public final int f24020f;
    public final ArrayList f24021g;
    public final int h;
    public final int f24022i;
    public final ArrayList f24023j;
    public final jn0 f24024k;

    public en0(jn0 jn0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f24024k = jn0Var;
        this.f24018b = i10;
        this.f24019c = i11;
        this.d = i12;
        this.e = i13;
        this.f24020f = i14;
        this.f24021g = arrayList;
        this.h = i15;
        this.f24022i = i16;
        this.f24023j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        jn0 jn0Var = this.f24024k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f24019c && i11 == jn0Var.f25479s) {
                return true;
            }
            if (i10 == this.d && i11 == jn0Var.f25481x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f24020f) {
            messageObject = (MessageObject) this.f24021g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f24022i) {
                messageObject = (MessageObject) this.f24023j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = jn0Var.v;
        if (i11 >= i14 && i11 < jn0Var.f25480w) {
            messageObject2 = (MessageObject) jn0Var.e.get(i11 - i14);
        } else {
            int i15 = jn0Var.f25482y;
            if (i11 >= i15 && i11 < jn0Var.E) {
                messageObject2 = (MessageObject) jn0Var.f25476f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f18341id == messageObject.getDocument().f18341id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f24024k.f25478r;
    }

    @Override
    public final int e() {
        return this.f24018b;
    }
}
