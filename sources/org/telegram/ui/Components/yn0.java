package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class yn0 implements Runnable {
    public final int f30746a;
    public final Object f30747b;
    public final Object f30748c;
    public final Object d;
    public final Object e;

    public yn0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f30746a = i10;
        this.f30747b = obj;
        this.f30748c = obj2;
        this.e = obj3;
        this.d = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yn0.run():void");
    }

    public yn0(n31 n31Var, b80 b80Var, MessagesController messagesController, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f30746a = 6;
        this.f30747b = n31Var;
        this.d = b80Var;
        this.f30748c = messagesController;
        this.e = tL_forumTopic;
    }
}
