package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;

public final class LaunchActivity$$ExternalSyntheticLambda63 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public LaunchActivity$$ExternalSyntheticLambda63(int i, LaunchActivity$$ExternalSyntheticLambda105 launchActivity$$ExternalSyntheticLambda105) {
        this.$r8$classId = 6;
        this.f$1 = i;
        this.f$0 = launchActivity$$ExternalSyntheticLambda105;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                launchActivity.getClass();
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda17(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, this.f$1, 21));
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(16));
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(tL_error));
                }
                break;
            case 1:
                ((VoIPService) this.f$0).lambda$startScreenCapture$60(this.f$1, tLObject, tL_error);
                break;
            case 2:
                SharedMediaLayout.SavedMessagesSearchAdapter savedMessagesSearchAdapter = (SharedMediaLayout.SavedMessagesSearchAdapter) this.f$0;
                savedMessagesSearchAdapter.getClass();
                AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda17(savedMessagesSearchAdapter, tLObject, this.f$1, 7));
                break;
            case 3:
                MessageAuthorView messageAuthorView = (MessageAuthorView) this.f$0;
                messageAuthorView.getClass();
                AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda17(messageAuthorView, tLObject, this.f$1, 23));
                break;
            case 4:
                ((StarGiftSheet) this.f$0).lambda$repollMessage$97(this.f$1, tLObject);
                break;
            case 5:
                StarsController starsController = (StarsController) this.f$0;
                starsController.getClass();
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda2(starsController, this.f$1, tLObject, 5));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda2(tLObject, this.f$1, (LaunchActivity$$ExternalSyntheticLambda105) this.f$0, 8));
                break;
            case 7:
                StoriesController.StoriesList storiesList = (StoriesController.StoriesList) this.f$0;
                storiesList.getClass();
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i = 0; i < tL_stories_stories.stories.size(); i++) {
                        TL_stories.StoryItem storyItem = tL_stories_stories.stories.get(i);
                        storyItem.dialogId = storiesList.dialogId;
                        storyItem.messageId = storyItem.id;
                        MessageObject messageObject = new MessageObject(storiesList.currentAccount, storyItem);
                        messageObject.generateThumbs(false);
                        arrayList.add(messageObject);
                    }
                    AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda2(storiesList, arrayList, tL_stories_stories, this.f$1, 12));
                } else {
                    AndroidUtilities.runOnUIThread(new StoriesController$StoriesList$$ExternalSyntheticLambda0(storiesList, 1));
                }
                break;
            case 8:
                WallpapersListActivity.SearchAdapter searchAdapter = (WallpapersListActivity.SearchAdapter) this.f$0;
                searchAdapter.getClass();
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda2(searchAdapter, this.f$1, tLObject, 15));
                break;
            default:
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda2((ChatAttachAlertBotWebViewLayout) this.f$0, tLObject, this.f$1, 17));
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda63(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }
}
