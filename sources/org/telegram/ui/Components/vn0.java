package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class vn0 implements Runnable {
    public final int f29226a;
    public final Object f29227b;
    public final Object f29228c;
    public final Object d;
    public final Object e;

    public vn0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f29226a = i10;
        this.f29227b = obj;
        this.f29228c = obj2;
        this.e = obj3;
        this.d = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vn0.run():void");
    }

    public vn0(k31 k31Var, y70 y70Var, MessagesController messagesController, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f29226a = 6;
        this.f29227b = k31Var;
        this.d = y70Var;
        this.f29228c = messagesController;
        this.e = tL_forumTopic;
    }
}
