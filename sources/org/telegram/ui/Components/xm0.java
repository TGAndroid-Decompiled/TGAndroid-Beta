package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class xm0 extends f2.q {
    public final int f30667b;
    public final int f30668c;
    public final int d;
    public final int e;
    public final int f30669f;
    public final ArrayList f30670g;
    public final int h;
    public final int f30671i;
    public final ArrayList f30672j;
    public final cn0 f30673k;

    public xm0(cn0 cn0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f30673k = cn0Var;
        this.f30667b = i10;
        this.f30668c = i11;
        this.d = i12;
        this.e = i13;
        this.f30669f = i14;
        this.f30670g = arrayList;
        this.h = i15;
        this.f30671i = i16;
        this.f30672j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        cn0 cn0Var = this.f30673k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f30668c && i11 == cn0Var.f23979s) {
                return true;
            }
            if (i10 == this.d && i11 == cn0Var.f23981x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f30669f) {
            messageObject = (MessageObject) this.f30670g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f30671i) {
                messageObject = (MessageObject) this.f30672j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = cn0Var.v;
        if (i11 >= i14 && i11 < cn0Var.f23980w) {
            messageObject2 = (MessageObject) cn0Var.e.get(i11 - i14);
        } else {
            int i15 = cn0Var.f23982y;
            if (i11 >= i15 && i11 < cn0Var.B) {
                messageObject2 = (MessageObject) cn0Var.f23976f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f19165id == messageObject.getDocument().f19165id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f30673k.f23978r;
    }

    @Override
    public final int e() {
        return this.f30667b;
    }
}
