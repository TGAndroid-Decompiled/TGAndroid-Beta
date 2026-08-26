package org.telegram.ui.bots;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda8;

public final class BotWebViewSheet$3$$ExternalSyntheticLambda2 implements RequestDelegate {
    public final int $r8$classId;
    public final BotWebViewSheet.AnonymousClass3 f$0;

    public BotWebViewSheet$3$$ExternalSyntheticLambda2(BotWebViewSheet.AnonymousClass3 anonymousClass3, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                BotWebViewSheet.AnonymousClass3 anonymousClass3 = this.f$0;
                anonymousClass3.getClass();
                boolean z = tLObject instanceof TLRPC.TL_updates;
                BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
                if (z) {
                    MessagesController.getInstance(botWebViewSheet.currentAccount).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new BotWebViewSheet$$ExternalSyntheticLambda0(botWebViewSheet, 17));
                break;
            default:
                BotWebViewSheet.AnonymousClass3 anonymousClass4 = this.f$0;
                anonymousClass4.getClass();
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda8(anonymousClass4, tLObject, tL_error, 26));
                break;
        }
    }
}
