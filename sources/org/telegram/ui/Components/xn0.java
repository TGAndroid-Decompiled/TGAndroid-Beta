package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class xn0 extends s4.o {
    public final int f32997b;
    public final int f32998c;
    public final int d;
    public final int f32999e;
    public final int f33000f;
    public final ArrayList f33001g;
    public final int h;
    public final int f33002i;
    public final ArrayList f33003j;
    public final co0 f33004k;

    public xn0(co0 co0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f33004k = co0Var;
        this.f32997b = i10;
        this.f32998c = i11;
        this.d = i12;
        this.f32999e = i13;
        this.f33000f = i14;
        this.f33001g = arrayList;
        this.h = i15;
        this.f33002i = i16;
        this.f33003j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        co0 co0Var = this.f33004k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f32998c && i11 == co0Var.f25348s) {
                return true;
            }
            if (i10 == this.d && i11 == co0Var.f25350x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.f32999e;
        if (i10 >= i12 && i10 < this.f33000f) {
            messageObject = (MessageObject) this.f33001g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f33002i) {
                messageObject = (MessageObject) this.f33003j.get(i10 - i13);
            } else {
                messageObject = null;
            }
        }
        int i14 = co0Var.v;
        if (i11 >= i14 && i11 < co0Var.f25349w) {
            messageObject2 = (MessageObject) co0Var.f25344e.get(i11 - i14);
        } else {
            int i15 = co0Var.f25351y;
            if (i11 >= i15 && i11 < co0Var.E) {
                messageObject2 = (MessageObject) co0Var.f25345f.get(i11 - i15);
            }
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getDocument() != null && messageObject.getDocument() != null && messageObject2.getDocument().f20048id == messageObject.getDocument().f20048id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f33004k.f25347r;
    }

    @Override
    public final int e() {
        return this.f32997b;
    }
}
