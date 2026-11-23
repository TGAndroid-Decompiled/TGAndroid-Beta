package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fg0 implements RequestDelegate {
    public final int f47831a;
    public final mg0 f47832b;

    public fg0(mg0 mg0Var, int i7) {
        this.f47831a = i7;
        this.f47832b = mg0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f47831a) {
            case 0:
                final mg0 mg0Var = this.f47832b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                mg0.Z(mg0Var, tL_error, tLObject);
                                return;
                            case 1:
                                mg0.b0(mg0Var, tL_error, tLObject);
                                return;
                            default:
                                mg0.a0(mg0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final mg0 mg0Var2 = this.f47832b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                mg0.Z(mg0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                mg0.b0(mg0Var2, tL_error, tLObject);
                                return;
                            default:
                                mg0.a0(mg0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final mg0 mg0Var3 = this.f47832b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                mg0.Z(mg0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                mg0.b0(mg0Var3, tL_error, tLObject);
                                return;
                            default:
                                mg0.a0(mg0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
