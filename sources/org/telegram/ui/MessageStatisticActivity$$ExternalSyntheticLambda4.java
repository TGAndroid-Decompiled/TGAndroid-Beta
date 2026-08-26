package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MessageStatisticActivity$$ExternalSyntheticLambda4 implements RequestDelegate {
    public final int $r8$classId;
    public final MessageStatisticActivity f$0;

    public MessageStatisticActivity$$ExternalSyntheticLambda4(MessageStatisticActivity messageStatisticActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = messageStatisticActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final MessageStatisticActivity messageStatisticActivity = this.f$0;
                messageStatisticActivity.getClass();
                final int i = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                messageStatisticActivity.lambda$loadChats$4(tLObject, tL_error);
                                break;
                            case 1:
                                messageStatisticActivity.lambda$loadStat$11(tLObject, tL_error);
                                break;
                            default:
                                messageStatisticActivity.lambda$loadChats$6(tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final MessageStatisticActivity messageStatisticActivity2 = this.f$0;
                messageStatisticActivity2.getClass();
                final int i2 = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                messageStatisticActivity2.lambda$loadChats$4(tLObject, tL_error);
                                break;
                            case 1:
                                messageStatisticActivity2.lambda$loadStat$11(tLObject, tL_error);
                                break;
                            default:
                                messageStatisticActivity2.lambda$loadChats$6(tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final MessageStatisticActivity messageStatisticActivity3 = this.f$0;
                messageStatisticActivity3.getClass();
                final int i3 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i3) {
                            case 0:
                                messageStatisticActivity3.lambda$loadChats$4(tLObject, tL_error);
                                break;
                            case 1:
                                messageStatisticActivity3.lambda$loadStat$11(tLObject, tL_error);
                                break;
                            default:
                                messageStatisticActivity3.lambda$loadChats$6(tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
