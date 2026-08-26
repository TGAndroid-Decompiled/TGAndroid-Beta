package org.telegram.ui.bots;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class AffiliateProgramFragment$$ExternalSyntheticLambda13 implements RequestDelegate {
    public final int $r8$classId;
    public final AffiliateProgramFragment f$0;
    public final AlertDialog f$1;

    public AffiliateProgramFragment$$ExternalSyntheticLambda13(AffiliateProgramFragment affiliateProgramFragment, AlertDialog alertDialog, int i) {
        this.$r8$classId = i;
        this.f$0 = affiliateProgramFragment;
        this.f$1 = alertDialog;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final AffiliateProgramFragment affiliateProgramFragment = this.f$0;
                affiliateProgramFragment.getClass();
                final AlertDialog alertDialog = this.f$1;
                final int i = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                affiliateProgramFragment.lambda$createView$0(alertDialog, tLObject, tL_error);
                                break;
                            default:
                                affiliateProgramFragment.lambda$end$8(alertDialog, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final AffiliateProgramFragment affiliateProgramFragment2 = this.f$0;
                affiliateProgramFragment2.getClass();
                final AlertDialog alertDialog2 = this.f$1;
                final int i2 = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                affiliateProgramFragment2.lambda$createView$0(alertDialog2, tLObject, tL_error);
                                break;
                            default:
                                affiliateProgramFragment2.lambda$end$8(alertDialog2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
