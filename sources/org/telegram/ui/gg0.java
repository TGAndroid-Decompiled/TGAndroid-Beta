package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gg0 implements RequestDelegate {
    public final int f48050a;
    public final og0 f48051b;

    public gg0(og0 og0Var, int i7) {
        this.f48050a = i7;
        this.f48051b = og0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f48050a) {
            case 0:
                final og0 og0Var = this.f48051b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                og0.Z(og0Var, tL_error, tLObject);
                                return;
                            case 1:
                                og0.b0(og0Var, tL_error, tLObject);
                                return;
                            default:
                                og0.a0(og0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final og0 og0Var2 = this.f48051b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                og0.Z(og0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                og0.b0(og0Var2, tL_error, tLObject);
                                return;
                            default:
                                og0.a0(og0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final og0 og0Var3 = this.f48051b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                og0.Z(og0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                og0.b0(og0Var3, tL_error, tLObject);
                                return;
                            default:
                                og0.a0(og0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
