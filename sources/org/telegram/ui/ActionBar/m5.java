package org.telegram.ui.ActionBar;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w80;
public final class m5 implements Runnable {
    public final int f19395a;
    public final Object f19396b;
    public final Object f19397c;
    public final Object d;
    public final Object e;

    public m5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19395a = i10;
        this.f19396b = obj;
        this.f19397c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.m5.run():void");
    }

    public m5(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.f19395a = i10;
        this.f19397c = obj;
        this.d = obj2;
        this.f19396b = tLObject;
        this.e = obj3;
    }

    public m5(n2 n2Var, TLObject tLObject, TLObject tLObject2, Object obj, int i10) {
        this.f19395a = i10;
        this.f19397c = n2Var;
        this.f19396b = tLObject;
        this.d = tLObject2;
        this.e = obj;
    }

    public m5(w80 w80Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.f19395a = 26;
        this.f19397c = w80Var;
        this.d = tL_chatInviteExported;
        this.e = tL_error;
        this.f19396b = tLObject;
    }
}
