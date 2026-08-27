package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class pi0 implements RequestDelegate {

    public final int f41369a;

    public final vi0 f41370b;

    public pi0(vi0 vi0Var, int i10) {
        this.f41369a = i10;
        this.f41370b = vi0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f41369a) {
            case 0:
                final int i10 = 0;
                final vi0 vi0Var = this.f41370b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                vi0.U(vi0Var, tL_error, tLObject);
                                break;
                            case 1:
                                vi0.W(vi0Var, tL_error, tLObject);
                                break;
                            default:
                                vi0.V(vi0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final vi0 vi0Var2 = this.f41370b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                vi0.U(vi0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                vi0.W(vi0Var2, tL_error, tLObject);
                                break;
                            default:
                                vi0.V(vi0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final vi0 vi0Var3 = this.f41370b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i12) {
                            case 0:
                                vi0.U(vi0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                vi0.W(vi0Var3, tL_error, tLObject);
                                break;
                            default:
                                vi0.V(vi0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
