package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class xn0 extends s4.o {
    public final int f33035b;
    public final int f33036c;
    public final int d;
    public final int f33037e;
    public final int f33038f;
    public final ArrayList f33039g;
    public final int h;
    public final int f33040i;
    public final ArrayList f33041j;
    public final co0 f33042k;

    public xn0(co0 co0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f33042k = co0Var;
        this.f33035b = i10;
        this.f33036c = i11;
        this.d = i12;
        this.f33037e = i13;
        this.f33038f = i14;
        this.f33039g = arrayList;
        this.h = i15;
        this.f33040i = i16;
        this.f33041j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        co0 co0Var = this.f33042k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f33036c && i11 == co0Var.f25410s) {
                return true;
            }
            if (i10 == this.d && i11 == co0Var.f25412x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.f33037e;
        if (i10 >= i12 && i10 < this.f33038f) {
            messageObject = (MessageObject) this.f33039g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f33040i) {
                messageObject = (MessageObject) this.f33041j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = co0Var.v;
        if (i11 >= i14 && i11 < co0Var.f25411w) {
            messageObject2 = (MessageObject) co0Var.f25406e.get(i11 - i14);
        } else {
            int i15 = co0Var.f25413y;
            if (i11 >= i15 && i11 < co0Var.E) {
                messageObject2 = (MessageObject) co0Var.f25407f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f20074id == messageObject.getDocument().f20074id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f33042k.f25409r;
    }

    @Override
    public final int e() {
        return this.f33035b;
    }
}
