package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class po0 implements Runnable {
    public final int f29827a;
    public final Object f29828b;
    public final Object f29829c;
    public final Object d;
    public final Object f29830e;

    public po0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f29827a = i10;
        this.f29828b = obj;
        this.f29829c = obj2;
        this.f29830e = obj3;
        this.d = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.po0.run():void");
    }

    public po0(d41 d41Var, q80 q80Var, MessagesController messagesController, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f29827a = 6;
        this.f29828b = d41Var;
        this.d = q80Var;
        this.f29829c = messagesController;
        this.f29830e = tL_forumTopic;
    }
}
