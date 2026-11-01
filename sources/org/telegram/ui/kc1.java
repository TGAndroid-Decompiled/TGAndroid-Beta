package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kc1 implements RequestDelegate {
    public final int f38804a;
    public final rc1 f38805b;

    public kc1(rc1 rc1Var, int i10) {
        this.f38804a = i10;
        this.f38805b = rc1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f38804a) {
            case 0:
                final rc1 rc1Var = this.f38805b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                rc1.g0(rc1Var, tL_error, tLObject);
                                return;
                            default:
                                rc1.m0(rc1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                org.telegram.messenger.i0.g3(new nc1(this.f38805b, tL_error, 0));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new nc1(this.f38805b, tL_error, 1));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new nc1(this.f38805b, tL_error, 2));
                return;
            default:
                final rc1 rc1Var2 = this.f38805b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                rc1.g0(rc1Var2, tL_error, tLObject);
                                return;
                            default:
                                rc1.m0(rc1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
