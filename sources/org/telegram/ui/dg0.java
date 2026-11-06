package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dg0 implements RequestDelegate {
    public final int f45067a;
    public final jg0 f45068b;

    public dg0(jg0 jg0Var, int i7) {
        this.f45067a = i7;
        this.f45068b = jg0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f45067a) {
            case 0:
                final jg0 jg0Var = this.f45068b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                jg0.Z(jg0Var, tL_error, tLObject);
                                return;
                            case 1:
                                jg0.b0(jg0Var, tL_error, tLObject);
                                return;
                            default:
                                jg0.a0(jg0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final jg0 jg0Var2 = this.f45068b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                jg0.Z(jg0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                jg0.b0(jg0Var2, tL_error, tLObject);
                                return;
                            default:
                                jg0.a0(jg0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final jg0 jg0Var3 = this.f45068b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                jg0.Z(jg0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                jg0.b0(jg0Var3, tL_error, tLObject);
                                return;
                            default:
                                jg0.a0(jg0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
