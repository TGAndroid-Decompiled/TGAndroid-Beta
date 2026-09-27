package org.telegram.ui.ActionBar;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i90;
public final class n5 implements Runnable {
    public final int f19674a;
    public final Object f19675b;
    public final Object f19676c;
    public final Object d;
    public final Object e;

    public n5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19674a = i10;
        this.f19675b = obj;
        this.f19676c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.n5.run():void");
    }

    public n5(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.f19674a = i10;
        this.f19676c = obj;
        this.d = obj2;
        this.f19675b = tLObject;
        this.e = obj3;
    }

    public n5(o2 o2Var, TLObject tLObject, TLObject tLObject2, Object obj, int i10) {
        this.f19674a = i10;
        this.f19676c = o2Var;
        this.f19675b = tLObject;
        this.d = tLObject2;
        this.e = obj;
    }

    public n5(i90 i90Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.f19674a = 26;
        this.f19676c = i90Var;
        this.d = tL_chatInviteExported;
        this.e = tL_error;
        this.f19675b = tLObject;
    }
}
