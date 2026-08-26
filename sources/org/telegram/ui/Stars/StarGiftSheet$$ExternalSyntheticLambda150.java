package org.telegram.ui.Stars;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda54;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda22;

public final class StarGiftSheet$$ExternalSyntheticLambda150 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final long f$3;

    public StarGiftSheet$$ExternalSyntheticLambda150(Object obj, Object obj2, long j, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = j;
        this.f$2 = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                StarGiftSheet starGiftSheet = (StarGiftSheet) this.f$0;
                starGiftSheet.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda54(starGiftSheet, tLObject, (String) this.f$1, (TL_stars.InputSavedStarGift) this.f$2, tL_error, this.f$3, 3));
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$deleteSavedDialog$143(this.f$3, (int[]) this.f$1, (TLRPC.InputPeer) this.f$2, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.f$0).lambda$getSavedReactionTags$486(this.f$3, (TLRPC.messages_SavedReactionTags) this.f$1, (TLRPC.TL_messages_getSavedReactionTags) this.f$2, tLObject, tL_error);
                break;
            case 3:
                ((MessagesController) this.f$0).lambda$addUsersToChannel$274((BaseFragment) this.f$1, (TLRPC.TL_channels_inviteToChannel) this.f$2, this.f$3, tLObject, tL_error);
                break;
            case 4:
                ((TopicsController) this.f$0).lambda$pinTopic$20((BaseFragment) this.f$1, this.f$3, (ArrayList) this.f$2, tLObject, tL_error);
                break;
            case 5:
                BotStarsController botStarsController = (BotStarsController) this.f$0;
                botStarsController.getClass();
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda22(botStarsController, (AlertDialog) this.f$1, tLObject, this.f$3, (Utilities.Callback) this.f$2, 9));
                break;
            default:
                StarsController starsController = (StarsController) this.f$0;
                starsController.getClass();
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda22(starsController, tLObject, (MessageObject) this.f$1, this.f$3, (Runnable) this.f$2, 13));
                break;
        }
    }

    public StarGiftSheet$$ExternalSyntheticLambda150(MessagesController messagesController, long j, Object obj, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$3 = j;
        this.f$1 = obj;
        this.f$2 = tLObject;
    }

    public StarGiftSheet$$ExternalSyntheticLambda150(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TLObject tLObject, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
        this.f$1 = obj;
        this.f$2 = tLObject;
        this.f$3 = j;
    }
}
