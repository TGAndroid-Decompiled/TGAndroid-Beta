package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class bm0 extends f2.s {
    public final int f27245b;
    public final int f27246c;
    public final int d;
    public final int f27247e;
    public final int f27248f;
    public final ArrayList f27249g;
    public final int h;
    public final int f27250i;
    public final ArrayList f27251j;
    public final gm0 f27252k;

    public bm0(gm0 gm0Var, int i9, int i10, int i11, int i12, int i13, ArrayList arrayList, int i14, int i15, ArrayList arrayList2) {
        this.f27252k = gm0Var;
        this.f27245b = i9;
        this.f27246c = i10;
        this.d = i11;
        this.f27247e = i12;
        this.f27248f = i13;
        this.f27249g = arrayList;
        this.h = i14;
        this.f27250i = i15;
        this.f27251j = arrayList2;
    }

    @Override
    public final boolean a(int i9, int i10) {
        return b(i9, i10);
    }

    @Override
    public final boolean b(int i9, int i10) {
        MessageObject messageObject;
        gm0 gm0Var = this.f27252k;
        if (i9 >= 0 && i10 >= 0) {
            if (i9 == this.f27246c && i10 == gm0Var.f28815s) {
                return true;
            }
            if (i9 == this.d && i10 == gm0Var.f28817x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i11 = this.f27247e;
        if (i9 >= i11 && i9 < this.f27248f) {
            messageObject = (MessageObject) this.f27249g.get(i9 - i11);
        } else {
            int i12 = this.h;
            if (i9 >= i12 && i9 < this.f27250i) {
                messageObject = (MessageObject) this.f27251j.get(i9 - i12);
            } else {
                messageObject = null;
            }
        }
        int i13 = gm0Var.v;
        if (i10 >= i13 && i10 < gm0Var.f28816w) {
            messageObject2 = (MessageObject) gm0Var.f28811e.get(i10 - i13);
        } else {
            int i14 = gm0Var.f28818y;
            if (i10 >= i14 && i10 < gm0Var.A) {
                messageObject2 = (MessageObject) gm0Var.f28812f.get(i10 - i14);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f22386id == messageObject.getDocument().f22386id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f27252k.f28814r;
    }

    @Override
    public final int e() {
        return this.f27245b;
    }
}
