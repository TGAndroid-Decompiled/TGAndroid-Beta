package org.telegram.ui.ActionBar;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v80;
public final class o5 implements Runnable {
    public final int f19479a;
    public final Object f19480b;
    public final Object f19481c;
    public final Object d;
    public final Object e;

    public o5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19479a = i10;
        this.f19480b = obj;
        this.f19481c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.o5.run():void");
    }

    public o5(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.f19479a = i10;
        this.f19481c = obj;
        this.d = obj2;
        this.f19480b = tLObject;
        this.e = obj3;
    }

    public o5(o2 o2Var, TLObject tLObject, TLObject tLObject2, Object obj, int i10) {
        this.f19479a = i10;
        this.f19481c = o2Var;
        this.f19480b = tLObject;
        this.d = tLObject2;
        this.e = obj;
    }

    public o5(v80 v80Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.f19479a = 26;
        this.f19481c = v80Var;
        this.d = tL_chatInviteExported;
        this.e = tL_error;
        this.f19480b = tLObject;
    }
}
