package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class StarGiftSheet$$ExternalSyntheticLambda64 implements RequestDelegate {
    public final int $r8$classId;
    public final StarGiftSheet f$0;

    public StarGiftSheet$$ExternalSyntheticLambda64(StarGiftSheet starGiftSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = starGiftSheet;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final StarGiftSheet starGiftSheet = this.f$0;
                starGiftSheet.getClass();
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                starGiftSheet.lambda$openUpgrade$117(tLObject, tL_error);
                                break;
                            default:
                                starGiftSheet.lambda$tickUpgradePrice$121(tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final StarGiftSheet starGiftSheet2 = this.f$0;
                starGiftSheet2.getClass();
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                starGiftSheet2.lambda$openUpgrade$117(tLObject, tL_error);
                                break;
                            default:
                                starGiftSheet2.lambda$tickUpgradePrice$121(tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
