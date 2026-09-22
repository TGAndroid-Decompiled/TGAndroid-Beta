package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dj0 implements RequestDelegate {
    public final int f33037a;
    public final jj0 f33038b;

    public dj0(jj0 jj0Var, int i10) {
        this.f33037a = i10;
        this.f33038b = jj0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f33037a) {
            case 0:
                final jj0 jj0Var = this.f33038b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                jj0.U(jj0Var, tL_error, tLObject);
                                return;
                            case 1:
                                jj0.W(jj0Var, tL_error, tLObject);
                                return;
                            default:
                                jj0.V(jj0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final jj0 jj0Var2 = this.f33038b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                jj0.U(jj0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                jj0.W(jj0Var2, tL_error, tLObject);
                                return;
                            default:
                                jj0.V(jj0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final jj0 jj0Var3 = this.f33038b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                jj0.U(jj0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                jj0.W(jj0Var3, tL_error, tLObject);
                                return;
                            default:
                                jj0.V(jj0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
