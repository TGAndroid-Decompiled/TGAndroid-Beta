package org.telegram.ui.ActionBar;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v80;
public final class o5 implements Runnable {
    public final int f19478a;
    public final Object f19479b;
    public final Object f19480c;
    public final Object d;
    public final Object e;

    public o5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19478a = i10;
        this.f19479b = obj;
        this.f19480c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.o5.run():void");
    }

    public o5(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.f19478a = i10;
        this.f19480c = obj;
        this.d = obj2;
        this.f19479b = tLObject;
        this.e = obj3;
    }

    public o5(o2 o2Var, TLObject tLObject, TLObject tLObject2, Object obj, int i10) {
        this.f19478a = i10;
        this.f19480c = o2Var;
        this.f19479b = tLObject;
        this.d = tLObject2;
        this.e = obj;
    }

    public o5(v80 v80Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.f19478a = 26;
        this.f19480c = v80Var;
        this.d = tL_chatInviteExported;
        this.e = tL_error;
        this.f19479b = tLObject;
    }
}
