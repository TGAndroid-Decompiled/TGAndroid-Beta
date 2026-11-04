package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ia1 implements RequestDelegate {
    public final int f46227a;
    public final ra1 f46228b;

    public ia1(ra1 ra1Var, int i3) {
        this.f46227a = i3;
        this.f46228b = ra1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f46227a) {
            case 0:
                final ra1 ra1Var = this.f46228b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ra1.g0(ra1Var, tL_error, tLObject);
                                return;
                            default:
                                ra1.m0(ra1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                org.telegram.messenger.g0.h3(new la1(this.f46228b, tL_error, 0));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new la1(this.f46228b, tL_error, 1));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new la1(this.f46228b, tL_error, 2));
                return;
            default:
                final ra1 ra1Var2 = this.f46228b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ra1.g0(ra1Var2, tL_error, tLObject);
                                return;
                            default:
                                ra1.m0(ra1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
