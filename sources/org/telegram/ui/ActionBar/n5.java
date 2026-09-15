package org.telegram.ui.ActionBar;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v80;
public final class n5 implements Runnable {
    public final int f19451a;
    public final Object f19452b;
    public final Object f19453c;
    public final Object d;
    public final Object e;

    public n5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19451a = i10;
        this.f19452b = obj;
        this.f19453c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.n5.run():void");
    }

    public n5(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.f19451a = i10;
        this.f19453c = obj;
        this.d = obj2;
        this.f19452b = tLObject;
        this.e = obj3;
    }

    public n5(n2 n2Var, TLObject tLObject, TLObject tLObject2, Object obj, int i10) {
        this.f19451a = i10;
        this.f19453c = n2Var;
        this.f19452b = tLObject;
        this.d = tLObject2;
        this.e = obj;
    }

    public n5(v80 v80Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.f19451a = 26;
        this.f19453c = v80Var;
        this.d = tL_chatInviteExported;
        this.e = tL_error;
        this.f19452b = tLObject;
    }
}
