package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class zm0 extends f2.q {
    public final int f33921b;
    public final int f33922c;
    public final int d;
    public final int f33923e;
    public final int f33924f;
    public final ArrayList f33925g;
    public final int h;
    public final int f33926i;
    public final ArrayList f33927j;
    public final en0 f33928k;

    public zm0(en0 en0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f33928k = en0Var;
        this.f33921b = i10;
        this.f33922c = i11;
        this.d = i12;
        this.f33923e = i13;
        this.f33924f = i14;
        this.f33925g = arrayList;
        this.h = i15;
        this.f33926i = i16;
        this.f33927j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        en0 en0Var = this.f33928k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f33922c && i11 == en0Var.f26590s) {
                return true;
            }
            if (i10 == this.d && i11 == en0Var.f26592x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.f33923e;
        if (i10 >= i12 && i10 < this.f33924f) {
            messageObject = (MessageObject) this.f33925g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f33926i) {
                messageObject = (MessageObject) this.f33927j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = en0Var.v;
        if (i11 >= i14 && i11 < en0Var.f26591w) {
            messageObject2 = (MessageObject) en0Var.f26586e.get(i11 - i14);
        } else {
            int i15 = en0Var.f26593y;
            if (i11 >= i15 && i11 < en0Var.B) {
                messageObject2 = (MessageObject) en0Var.f26587f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f20849id == messageObject.getDocument().f20849id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f33928k.f26589r;
    }

    @Override
    public final int e() {
        return this.f33921b;
    }
}
