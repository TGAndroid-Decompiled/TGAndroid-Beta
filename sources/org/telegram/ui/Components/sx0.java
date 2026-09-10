package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sx0 implements Runnable {
    public final int f27226a;
    public final Object f27227b;
    public final Object f27228c;
    public final Object d;

    public sx0(Object obj, Object obj2, Object obj3, int i10) {
        this.f27226a = i10;
        this.f27227b = obj;
        this.f27228c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sx0.run():void");
    }

    public sx0(Object obj, TLObject tLObject, Object obj2, int i10) {
        this.f27226a = i10;
        this.f27227b = obj;
        this.d = tLObject;
        this.f27228c = obj2;
    }

    public sx0(TLObject tLObject, MessagesController messagesController, sg.z0 z0Var) {
        this.f27226a = 17;
        this.d = tLObject;
        this.f27227b = messagesController;
        this.f27228c = z0Var;
    }

    public sx0(TLRPC.TL_error tL_error, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f27226a = 18;
        this.f27228c = tL_error;
        this.f27227b = callback;
        this.d = callback2;
    }
}
