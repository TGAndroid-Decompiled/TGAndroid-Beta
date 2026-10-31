package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class yj implements Runnable {
    public final int f19397a;
    public final vp f19398b;
    public final TLRPC.User f19399c;

    public yj(vp vpVar, TLRPC.User user, int i10) {
        this.f19397a = i10;
        this.f19398b = vpVar;
        this.f19399c = user;
    }

    @Override
    public final void run() {
        switch (this.f19397a) {
            case 0:
                this.f19398b.f18876q1.remove(Long.valueOf(this.f19399c.f19942id));
                return;
            default:
                this.f19398b.getContactsController().a(this.f19399c);
                return;
        }
    }
}
