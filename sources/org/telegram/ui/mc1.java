package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mc1 implements RequestDelegate {
    public final int f39645a;
    public final tc1 f39646b;

    public mc1(tc1 tc1Var, int i10) {
        this.f39645a = i10;
        this.f39646b = tc1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39645a) {
            case 0:
                final tc1 tc1Var = this.f39646b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                tc1.f0(tc1Var, tL_error, tLObject);
                                return;
                            default:
                                tc1.l0(tc1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                org.telegram.messenger.i0.g3(new pc1(this.f39646b, tL_error, 0));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new pc1(this.f39646b, tL_error, 1));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new pc1(this.f39646b, tL_error, 2));
                return;
            default:
                final tc1 tc1Var2 = this.f39646b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                tc1.f0(tc1Var2, tL_error, tLObject);
                                return;
                            default:
                                tc1.l0(tc1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
