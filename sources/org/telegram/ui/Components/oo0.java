package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class oo0 implements Runnable {
    public final int f29550a;
    public final Object f29551b;
    public final Object f29552c;
    public final Object d;
    public final Object f29553e;

    public oo0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f29550a = i10;
        this.f29551b = obj;
        this.f29552c = obj2;
        this.f29553e = obj3;
        this.d = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oo0.run():void");
    }

    public oo0(c41 c41Var, p80 p80Var, MessagesController messagesController, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f29550a = 6;
        this.f29551b = c41Var;
        this.d = p80Var;
        this.f29552c = messagesController;
        this.f29553e = tL_forumTopic;
    }
}
