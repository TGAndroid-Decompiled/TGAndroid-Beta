package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class wn0 implements Runnable {
    public final int f30149a;
    public final Object f30150b;
    public final Object f30151c;
    public final Object d;
    public final Object e;

    public wn0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f30149a = i10;
        this.f30150b = obj;
        this.f30151c = obj2;
        this.e = obj3;
        this.d = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wn0.run():void");
    }

    public wn0(l31 l31Var, z70 z70Var, MessagesController messagesController, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f30149a = 6;
        this.f30150b = l31Var;
        this.d = z70Var;
        this.f30151c = messagesController;
        this.e = tL_forumTopic;
    }
}
