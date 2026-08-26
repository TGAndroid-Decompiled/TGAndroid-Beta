package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper$$ExternalSyntheticLambda2;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class MessageSeenView$$ExternalSyntheticLambda4 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final int f$2;
    public final Object f$3;

    public MessageSeenView$$ExternalSyntheticLambda4(Object obj, int i, Object obj2, long j, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$3 = obj2;
        this.f$1 = j;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((MessageSeenView) this.f$0).lambda$new$5(this.f$1, this.f$2, (TLRPC.Chat) this.f$3, tLObject, tL_error);
                break;
            case 1:
                ((ChatMessagesMetadataController) this.f$0).lambda$loadStoriesForMessages$2(this.f$2, (MessageObject) this.f$3, this.f$1, tLObject, tL_error);
                break;
            case 2:
                ((MediaDataController) this.f$0).lambda$loadStickers$101(this.f$2, (Utilities.Callback) this.f$3, this.f$1, tLObject, tL_error);
                break;
            case 3:
                ((MessagesController) this.f$0).lambda$checkPromoInfoInternal$167(this.f$2, (TLRPC.TL_help_promoData) this.f$3, this.f$1, tLObject, tL_error);
                break;
            case 4:
                BotStarsController botStarsController = (BotStarsController) this.f$0;
                botStarsController.getClass();
                AndroidUtilities.runOnUIThread(new BotForumHelper$$ExternalSyntheticLambda2(botStarsController, (BotStarsController.TransactionsState) this.f$3, this.f$2, tLObject, this.f$1, 10));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda0((ButtonWithCounterView) this.f$0, (BottomSheet[]) this.f$3, this.f$2, this.f$1, 13));
                break;
            default:
                StoriesController storiesController = (StoriesController) this.f$0;
                storiesController.getClass();
                AndroidUtilities.runOnUIThread(new BotForumHelper$$ExternalSyntheticLambda2(storiesController, tLObject, this.f$2, (String) this.f$3, this.f$1, 12));
                break;
        }
    }

    public MessageSeenView$$ExternalSyntheticLambda4(Object obj, Object obj2, int i, long j, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$3 = obj2;
        this.f$2 = i;
        this.f$1 = j;
    }

    public MessageSeenView$$ExternalSyntheticLambda4(MessageSeenView messageSeenView, long j, int i, TLRPC.Chat chat) {
        this.$r8$classId = 0;
        this.f$0 = messageSeenView;
        this.f$1 = j;
        this.f$2 = i;
        this.f$3 = chat;
    }
}
