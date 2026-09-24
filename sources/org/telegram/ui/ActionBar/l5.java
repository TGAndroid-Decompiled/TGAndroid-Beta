package org.telegram.ui.ActionBar;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g90;
public final class l5 implements Runnable {
    public final int f19608a;
    public final Object f19609b;
    public final Object f19610c;
    public final Object d;
    public final Object e;

    public l5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19608a = i10;
        this.f19609b = obj;
        this.f19610c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l5.run():void");
    }

    public l5(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.f19608a = i10;
        this.f19610c = obj;
        this.d = obj2;
        this.f19609b = tLObject;
        this.e = obj3;
    }

    public l5(m2 m2Var, TLObject tLObject, TLObject tLObject2, Object obj, int i10) {
        this.f19608a = i10;
        this.f19610c = m2Var;
        this.f19609b = tLObject;
        this.d = tLObject2;
        this.e = obj;
    }

    public l5(g90 g90Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.f19608a = 26;
        this.f19610c = g90Var;
        this.d = tL_chatInviteExported;
        this.e = tL_error;
        this.f19609b = tLObject;
    }
}
