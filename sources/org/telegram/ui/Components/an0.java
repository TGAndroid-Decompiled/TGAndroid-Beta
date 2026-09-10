package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class an0 extends s4.o {
    public final int f21544b;
    public final int f21545c;
    public final int d;
    public final int e;
    public final int f21546f;
    public final ArrayList f21547g;
    public final int h;
    public final int f21548i;
    public final ArrayList f21549j;
    public final fn0 f21550k;

    public an0(fn0 fn0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f21550k = fn0Var;
        this.f21544b = i10;
        this.f21545c = i11;
        this.d = i12;
        this.e = i13;
        this.f21546f = i14;
        this.f21547g = arrayList;
        this.h = i15;
        this.f21548i = i16;
        this.f21549j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        fn0 fn0Var = this.f21550k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f21545c && i11 == fn0Var.f23045s) {
                return true;
            }
            if (i10 == this.d && i11 == fn0Var.f23047x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f21546f) {
            messageObject = (MessageObject) this.f21547g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f21548i) {
                messageObject = (MessageObject) this.f21549j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = fn0Var.v;
        if (i11 >= i14 && i11 < fn0Var.f23046w) {
            messageObject2 = (MessageObject) fn0Var.e.get(i11 - i14);
        } else {
            int i15 = fn0Var.f23048y;
            if (i11 >= i15 && i11 < fn0Var.E) {
                messageObject2 = (MessageObject) fn0Var.f23042f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f17201id == messageObject.getDocument().f17201id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f21550k.f23044r;
    }

    @Override
    public final int e() {
        return this.f21544b;
    }
}
