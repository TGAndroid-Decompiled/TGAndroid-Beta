package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zj implements Runnable {
    public final int f19725a;
    public final wp f19726b;
    public final TLRPC.User f19727c;

    public zj(wp wpVar, TLRPC.User user, int i10) {
        this.f19725a = i10;
        this.f19726b = wpVar;
        this.f19727c = user;
    }

    @Override
    public final void run() {
        switch (this.f19725a) {
            case 0:
                this.f19726b.f19219q1.remove(Long.valueOf(this.f19727c.f19943id));
                return;
            default:
                this.f19726b.getContactsController().a(this.f19727c);
                return;
        }
    }
}
