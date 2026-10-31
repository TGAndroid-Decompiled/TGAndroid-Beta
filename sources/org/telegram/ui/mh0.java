package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh0 implements RequestDelegate {
    public final int f39706a;
    public final sh0 f39707b;

    public mh0(sh0 sh0Var, int i10) {
        this.f39706a = i10;
        this.f39707b = sh0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39706a) {
            case 0:
                final sh0 sh0Var = this.f39707b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                sh0.Y(sh0Var, tL_error, tLObject);
                                return;
                            case 1:
                                sh0.a0(sh0Var, tL_error, tLObject);
                                return;
                            default:
                                sh0.Z(sh0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final sh0 sh0Var2 = this.f39707b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                sh0.Y(sh0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                sh0.a0(sh0Var2, tL_error, tLObject);
                                return;
                            default:
                                sh0.Z(sh0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final sh0 sh0Var3 = this.f39707b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                sh0.Y(sh0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                sh0.a0(sh0Var3, tL_error, tLObject);
                                return;
                            default:
                                sh0.Z(sh0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
