package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class yn0 extends s4.o {
    public final int f33309b;
    public final int f33310c;
    public final int d;
    public final int f33311e;
    public final int f33312f;
    public final ArrayList f33313g;
    public final int h;
    public final int f33314i;
    public final ArrayList f33315j;
    public final do0 f33316k;

    public yn0(do0 do0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f33316k = do0Var;
        this.f33309b = i10;
        this.f33310c = i11;
        this.d = i12;
        this.f33311e = i13;
        this.f33312f = i14;
        this.f33313g = arrayList;
        this.h = i15;
        this.f33314i = i16;
        this.f33315j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        do0 do0Var = this.f33316k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f33310c && i11 == do0Var.f25650s) {
                return true;
            }
            if (i10 == this.d && i11 == do0Var.f25652x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.f33311e;
        if (i10 >= i12 && i10 < this.f33312f) {
            messageObject = (MessageObject) this.f33313g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f33314i) {
                messageObject = (MessageObject) this.f33315j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = do0Var.v;
        if (i11 >= i14 && i11 < do0Var.f25651w) {
            messageObject2 = (MessageObject) do0Var.f25646e.get(i11 - i14);
        } else {
            int i15 = do0Var.f25653y;
            if (i11 >= i15 && i11 < do0Var.E) {
                messageObject2 = (MessageObject) do0Var.f25647f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f20038id == messageObject.getDocument().f20038id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f33316k.f25649r;
    }

    @Override
    public final int e() {
        return this.f33309b;
    }
}
