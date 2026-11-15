package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qa1 implements RequestDelegate {
    public final int f50544a;
    public final xa1 f50545b;

    public qa1(xa1 xa1Var, int i7) {
        this.f50544a = i7;
        this.f50545b = xa1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f50544a) {
            case 0:
                final xa1 xa1Var = this.f50545b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                xa1.g0(xa1Var, tL_error, tLObject);
                                return;
                            default:
                                xa1.m0(xa1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ta1(this.f50545b, tL_error, 0));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ta1(this.f50545b, tL_error, 1));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ta1(this.f50545b, tL_error, 2));
                return;
            default:
                final xa1 xa1Var2 = this.f50545b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                xa1.g0(xa1Var2, tL_error, tLObject);
                                return;
                            default:
                                xa1.m0(xa1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
