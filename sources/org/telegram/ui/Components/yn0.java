package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class yn0 extends s4.p {
    public final int f35113b;
    public final int f35114c;
    public final int d;
    public final int e;
    public final int f35115f;
    public final ArrayList f35116g;
    public final int h;
    public final int f35117i;
    public final ArrayList f35118j;
    public final do0 f35119k;

    public yn0(do0 do0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f35119k = do0Var;
        this.f35113b = i10;
        this.f35114c = i11;
        this.d = i12;
        this.e = i13;
        this.f35115f = i14;
        this.f35116g = arrayList;
        this.h = i15;
        this.f35117i = i16;
        this.f35118j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        do0 do0Var = this.f35119k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f35114c && i11 == do0Var.f27506s) {
                return true;
            }
            if (i10 == this.d && i11 == do0Var.f27508x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f35115f) {
            messageObject = (MessageObject) this.f35116g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f35117i) {
                messageObject = (MessageObject) this.f35118j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = do0Var.v;
        if (i11 >= i14 && i11 < do0Var.f27507w) {
            messageObject2 = (MessageObject) do0Var.e.get(i11 - i14);
        } else {
            int i15 = do0Var.f27509y;
            if (i11 >= i15 && i11 < do0Var.E) {
                messageObject2 = (MessageObject) do0Var.f27503f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f22034id == messageObject.getDocument().f22034id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f35119k.f27505r;
    }

    @Override
    public final int e() {
        return this.f35113b;
    }
}
