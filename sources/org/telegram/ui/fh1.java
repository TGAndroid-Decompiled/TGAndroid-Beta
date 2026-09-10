package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fh1 implements RequestDelegate {
    public final int f32836a;
    public final mh1 f32837b;

    public fh1(mh1 mh1Var, int i10) {
        this.f32836a = i10;
        this.f32837b = mh1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f32836a) {
            case 0:
                final mh1 mh1Var = this.f32837b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                mh1.b0(mh1Var, tL_error, tLObject);
                                return;
                            default:
                                mh1.h0(mh1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ih1(this.f32837b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ih1(this.f32837b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ih1(this.f32837b, tL_error, 2));
                return;
            default:
                final mh1 mh1Var2 = this.f32837b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                mh1.b0(mh1Var2, tL_error, tLObject);
                                return;
                            default:
                                mh1.h0(mh1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
