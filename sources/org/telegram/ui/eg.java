package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class eg implements Runnable {
    public final int f46783a;
    public final an f46784b;
    public final TLRPC.User f46785c;

    public eg(an anVar, TLRPC.User user, int i7) {
        this.f46783a = i7;
        this.f46784b = anVar;
        this.f46785c = user;
    }

    @Override
    public final void run() {
        switch (this.f46783a) {
            case 0:
                an anVar = this.f46784b;
                anVar.getClass();
                anVar.presentFragment(an.ua(this.f46785c.f28200id));
                return;
            default:
                this.f46784b.Pa(this.f46785c);
                return;
        }
    }
}
