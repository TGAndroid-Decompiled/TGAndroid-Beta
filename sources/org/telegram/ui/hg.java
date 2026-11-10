package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hg implements Runnable {
    public final int f46345a;
    public final cn f46346b;
    public final TLRPC.User f46347c;

    public hg(cn cnVar, TLRPC.User user, int i7) {
        this.f46345a = i7;
        this.f46346b = cnVar;
        this.f46347c = user;
    }

    @Override
    public final void run() {
        switch (this.f46345a) {
            case 0:
                cn cnVar = this.f46346b;
                cnVar.getClass();
                cnVar.presentFragment(cn.ta(this.f46347c.f27109id));
                return;
            default:
                this.f46346b.Oa(this.f46347c);
                return;
        }
    }
}
