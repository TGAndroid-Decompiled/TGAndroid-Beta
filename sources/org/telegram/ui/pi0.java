package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pi0 implements RequestDelegate {
    public final int f40122a;
    public final vi0 f40123b;

    public pi0(vi0 vi0Var, int i10) {
        this.f40122a = i10;
        this.f40123b = vi0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40122a) {
            case 0:
                final vi0 vi0Var = this.f40123b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                vi0.U(vi0Var, tL_error, tLObject);
                                return;
                            case 1:
                                vi0.W(vi0Var, tL_error, tLObject);
                                return;
                            default:
                                vi0.V(vi0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final vi0 vi0Var2 = this.f40123b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                vi0.U(vi0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                vi0.W(vi0Var2, tL_error, tLObject);
                                return;
                            default:
                                vi0.V(vi0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final vi0 vi0Var3 = this.f40123b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                vi0.U(vi0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                vi0.W(vi0Var3, tL_error, tLObject);
                                return;
                            default:
                                vi0.V(vi0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
