package org.telegram.ui.ActionBar;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w80;
public final class n5 implements Runnable {
    public final int f21244a;
    public final Object f21245b;
    public final Object f21246c;
    public final Object d;
    public final Object f21247e;

    public n5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f21244a = i10;
        this.f21245b = obj;
        this.f21246c = obj2;
        this.d = obj3;
        this.f21247e = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.n5.run():void");
    }

    public n5(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.f21244a = i10;
        this.f21246c = obj;
        this.d = obj2;
        this.f21245b = tLObject;
        this.f21247e = obj3;
    }

    public n5(n2 n2Var, TLObject tLObject, TLObject tLObject2, Object obj, int i10) {
        this.f21244a = i10;
        this.f21246c = n2Var;
        this.f21245b = tLObject;
        this.d = tLObject2;
        this.f21247e = obj;
    }

    public n5(w80 w80Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.f21244a = 26;
        this.f21246c = w80Var;
        this.d = tL_chatInviteExported;
        this.f21247e = tL_error;
        this.f21245b = tLObject;
    }
}
