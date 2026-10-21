package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class pn0 extends s4.o {
    public final int f29342b;
    public final int f29343c;
    public final int d;
    public final int e;
    public final int f29344f;
    public final ArrayList f29345g;
    public final int h;
    public final int f29346i;
    public final ArrayList f29347j;
    public final un0 f29348k;

    public pn0(un0 un0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f29348k = un0Var;
        this.f29342b = i10;
        this.f29343c = i11;
        this.d = i12;
        this.e = i13;
        this.f29344f = i14;
        this.f29345g = arrayList;
        this.h = i15;
        this.f29346i = i16;
        this.f29347j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        un0 un0Var = this.f29348k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f29343c && i11 == un0Var.f30982s) {
                return true;
            }
            if (i10 == this.d && i11 == un0Var.f30984x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f29344f) {
            messageObject = (MessageObject) this.f29345g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f29346i) {
                messageObject = (MessageObject) this.f29347j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = un0Var.v;
        if (i11 >= i14 && i11 < un0Var.f30983w) {
            messageObject2 = (MessageObject) un0Var.e.get(i11 - i14);
        } else {
            int i15 = un0Var.f30985y;
            if (i11 >= i15 && i11 < un0Var.E) {
                messageObject2 = (MessageObject) un0Var.f30979f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f20282id == messageObject.getDocument().f20282id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f29348k.f30981r;
    }

    @Override
    public final int e() {
        return this.f29342b;
    }
}
