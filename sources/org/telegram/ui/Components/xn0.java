package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class xn0 implements Runnable {
    public final int f30418a;
    public final Object f30419b;
    public final Object f30420c;
    public final Object d;
    public final Object e;

    public xn0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f30418a = i10;
        this.f30419b = obj;
        this.f30420c = obj2;
        this.e = obj3;
        this.d = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xn0.run():void");
    }

    public xn0(m31 m31Var, a80 a80Var, MessagesController messagesController, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f30418a = 6;
        this.f30419b = m31Var;
        this.d = a80Var;
        this.f30420c = messagesController;
        this.e = tL_forumTopic;
    }
}
