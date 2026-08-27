package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

public final class em0 extends f2.q {

    public final int f28092b;

    public final int f28093c;
    public final int d;

    public final int f28094e;

    public final int f28095f;

    public final ArrayList f28096g;
    public final int h;

    public final int f28097i;

    public final ArrayList f28098j;

    public final jm0 f28099k;

    public em0(jm0 jm0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f28099k = jm0Var;
        this.f28092b = i10;
        this.f28093c = i11;
        this.d = i12;
        this.f28094e = i13;
        this.f28095f = i14;
        this.f28096g = arrayList;
        this.h = i15;
        this.f28097i = i16;
        this.f28098j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        jm0 jm0Var = this.f28099k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f28093c && i11 == jm0Var.f29734s) {
                return true;
            }
            if (i10 == this.d && i11 == jm0Var.f29736x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.f28094e;
        if (i10 < i12 || i10 >= this.f28095f) {
            int i13 = this.h;
            messageObject = (i10 < i13 || i10 >= this.f28097i) ? null : (MessageObject) this.f28098j.get(i10 - i13);
        } else {
            messageObject = (MessageObject) this.f28096g.get(i10 - i12);
        }
        int i14 = jm0Var.v;
        if (i11 < i14 || i11 >= jm0Var.f29735w) {
            int i15 = jm0Var.f29737y;
            if (i11 >= i15 && i11 < jm0Var.A) {
                messageObject2 = (MessageObject) jm0Var.f29731f.get(i11 - i15);
            }
        } else {
            messageObject2 = (MessageObject) jm0Var.f29730e.get(i11 - i14);
        }
        return (messageObject2 == null || messageObject == null || messageObject2.getDocument() == null || messageObject.getDocument() == null || messageObject2.getDocument().f22386id != messageObject.getDocument().f22386id) ? false : true;
    }

    @Override
    public final int d() {
        return this.f28099k.f29733r;
    }

    @Override
    public final int e() {
        return this.f28092b;
    }
}
