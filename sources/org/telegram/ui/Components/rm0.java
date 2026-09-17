package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class rm0 extends s4.o {
    public final int f27650b;
    public final int f27651c;
    public final int d;
    public final int e;
    public final int f27652f;
    public final ArrayList f27653g;
    public final int h;
    public final int f27654i;
    public final ArrayList f27655j;
    public final wm0 f27656k;

    public rm0(wm0 wm0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f27656k = wm0Var;
        this.f27650b = i10;
        this.f27651c = i11;
        this.d = i12;
        this.e = i13;
        this.f27652f = i14;
        this.f27653g = arrayList;
        this.h = i15;
        this.f27654i = i16;
        this.f27655j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        wm0 wm0Var = this.f27656k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f27651c && i11 == wm0Var.f29700s) {
                return true;
            }
            if (i10 == this.d && i11 == wm0Var.f29702x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f27652f) {
            messageObject = (MessageObject) this.f27653g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f27654i) {
                messageObject = (MessageObject) this.f27655j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = wm0Var.v;
        if (i11 >= i14 && i11 < wm0Var.f29701w) {
            messageObject2 = (MessageObject) wm0Var.e.get(i11 - i14);
        } else {
            int i15 = wm0Var.f29703y;
            if (i11 >= i15 && i11 < wm0Var.E) {
                messageObject2 = (MessageObject) wm0Var.f29697f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f18127id == messageObject.getDocument().f18127id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f27656k.f29699r;
    }

    @Override
    public final int e() {
        return this.f27650b;
    }
}
