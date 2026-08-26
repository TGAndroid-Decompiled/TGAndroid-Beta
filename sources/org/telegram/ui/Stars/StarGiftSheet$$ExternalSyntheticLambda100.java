package org.telegram.ui.Stars;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda53;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda1;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda8;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.iv.RichTextCell$2$$ExternalSyntheticLambda1;

public final class StarGiftSheet$$ExternalSyntheticLambda100 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public StarGiftSheet$$ExternalSyntheticLambda100(int i, LaunchActivity$$ExternalSyntheticLambda53 launchActivity$$ExternalSyntheticLambda53) {
        this.$r8$classId = 3;
        this.f$1 = i;
        this.f$0 = launchActivity$$ExternalSyntheticLambda53;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((StarGiftSheet) this.f$0).lambda$repollMessage$97(this.f$1, tLObject);
                break;
            case 1:
                ((VoIPService) this.f$0).lambda$startScreenCapture$60(this.f$1, tLObject, tL_error);
                break;
            case 2:
                StarsController starsController = (StarsController) this.f$0;
                starsController.getClass();
                AndroidUtilities.runOnUIThread(new RichTextCell$2$$ExternalSyntheticLambda1(starsController, this.f$1, tLObject, 15));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new RichTextCell$2$$ExternalSyntheticLambda1(tLObject, this.f$1, (LaunchActivity$$ExternalSyntheticLambda53) this.f$0, 18));
                break;
            case 4:
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
                    AndroidUtilities.runOnUIThread(new BotBiometry$$ExternalSyntheticLambda8(storiesList, arrayList, tL_stories_stories, this.f$1));
                } else {
                    AndroidUtilities.runOnUIThread(new StoriesController$StoriesList$$ExternalSyntheticLambda1(storiesList, 1));
                }
                break;
            default:
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) this.f$0;
                chatAttachAlertBotWebViewLayout.getClass();
                AndroidUtilities.runOnUIThread(new RichTextCell$2$$ExternalSyntheticLambda1(chatAttachAlertBotWebViewLayout, tLObject, this.f$1, 26));
                break;
        }
    }

    public StarGiftSheet$$ExternalSyntheticLambda100(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }
}
