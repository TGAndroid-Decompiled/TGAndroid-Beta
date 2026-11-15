package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class eg implements Runnable {
    public final int f46773a;
    public final an f46774b;
    public final TLRPC.User f46775c;

    public eg(an anVar, TLRPC.User user, int i7) {
        this.f46773a = i7;
        this.f46774b = anVar;
        this.f46775c = user;
    }

    @Override
    public final void run() {
        switch (this.f46773a) {
            case 0:
                an anVar = this.f46774b;
                anVar.getClass();
                anVar.presentFragment(an.ua(this.f46775c.f28200id));
                return;
            default:
                this.f46774b.Pa(this.f46775c);
                return;
        }
    }
}
