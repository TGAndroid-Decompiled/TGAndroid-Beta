package org.telegram.ui.ActionBar;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e90;
public final class n5 implements Runnable {
    public final int f19639a;
    public final Object f19640b;
    public final Object f19641c;
    public final Object d;
    public final Object e;

    public n5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19639a = i10;
        this.f19640b = obj;
        this.f19641c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.n5.run():void");
    }

    public n5(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.f19639a = i10;
        this.f19641c = obj;
        this.d = obj2;
        this.f19640b = tLObject;
        this.e = obj3;
    }

    public n5(n2 n2Var, TLObject tLObject, TLObject tLObject2, Object obj, int i10) {
        this.f19639a = i10;
        this.f19641c = n2Var;
        this.f19640b = tLObject;
        this.d = tLObject2;
        this.e = obj;
    }

    public n5(e90 e90Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.f19639a = 26;
        this.f19641c = e90Var;
        this.d = tL_chatInviteExported;
        this.e = tL_error;
        this.f19640b = tLObject;
    }
}
