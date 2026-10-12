package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class tn0 extends s4.o {
    public final int f29467b;
    public final int f29468c;
    public final int d;
    public final int e;
    public final int f29469f;
    public final ArrayList f29470g;
    public final int h;
    public final int f29471i;
    public final ArrayList f29472j;
    public final yn0 f29473k;

    public tn0(yn0 yn0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f29473k = yn0Var;
        this.f29467b = i10;
        this.f29468c = i11;
        this.d = i12;
        this.e = i13;
        this.f29469f = i14;
        this.f29470g = arrayList;
        this.h = i15;
        this.f29471i = i16;
        this.f29472j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        yn0 yn0Var = this.f29473k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f29468c && i11 == yn0Var.f31659s) {
                return true;
            }
            if (i10 == this.d && i11 == yn0Var.f31661x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f29469f) {
            messageObject = (MessageObject) this.f29470g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f29471i) {
                messageObject = (MessageObject) this.f29472j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = yn0Var.v;
        if (i11 >= i14 && i11 < yn0Var.f31660w) {
            messageObject2 = (MessageObject) yn0Var.e.get(i11 - i14);
        } else {
            int i15 = yn0Var.f31662y;
            if (i11 >= i15 && i11 < yn0Var.E) {
                messageObject2 = (MessageObject) yn0Var.f31656f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f19222id == messageObject.getDocument().f19222id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f29473k.f31658r;
    }

    @Override
    public final int e() {
        return this.f29467b;
    }
}
