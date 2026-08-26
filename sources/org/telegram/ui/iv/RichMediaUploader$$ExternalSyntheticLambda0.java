package org.telegram.ui.iv;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.Stories.LivePlayer$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.PeerStoriesView$38$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoryViewer$5$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.SelectAudioAlert;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryLinkSheet;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda8;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda9;
import org.telegram.ui.TooManyCommunitiesActivity;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.VoIPFragment$8$$ExternalSyntheticLambda1;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.web.WebInstantView;

public final class RichMediaUploader$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;

    public RichMediaUploader$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i = 16;
        int i2 = 24;
        int i3 = 27;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                RichMediaUploader richMediaUploader = (RichMediaUploader) obj;
                richMediaUploader.getClass();
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(i, richMediaUploader, tLObject));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new StickersActivity$$ExternalSyntheticLambda18(i2, (PeerStoriesView$38$$ExternalSyntheticLambda1) obj, tL_error));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new LivePlayer$1$$ExternalSyntheticLambda0((StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1) obj, 14));
                break;
            case 3:
                StoriesController.SearchStoriesList searchStoriesList = (StoriesController.SearchStoriesList) obj;
                searchStoriesList.getClass();
                AndroidUtilities.runOnUIThread(new StickersActivity$$ExternalSyntheticLambda18(25, searchStoriesList, tLObject));
                break;
            case 4:
                StoriesController.StoriesCollections storiesCollections = (StoriesController.StoriesCollections) obj;
                storiesCollections.getClass();
                AndroidUtilities.runOnUIThread(new StickersActivity$$ExternalSyntheticLambda18(i3, storiesCollections, tLObject));
                break;
            case 5:
                EmojiBottomSheet.GifPage.GifAdapter gifAdapter = (EmojiBottomSheet.GifPage.GifAdapter) obj;
                gifAdapter.getClass();
                AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(i, gifAdapter, tLObject));
                break;
            case 6:
                SelectAudioAlert selectAudioAlert = (SelectAudioAlert) obj;
                selectAudioAlert.getClass();
                AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(i3, selectAudioAlert, tLObject));
                break;
            case 7:
                StoryEntry storyEntry = (StoryEntry) obj;
                storyEntry.getClass();
                AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(28, storyEntry, tLObject));
                break;
            case 8:
                StoryLinkSheet storyLinkSheet = (StoryLinkSheet) obj;
                storyLinkSheet.getClass();
                AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(29, storyLinkSheet, tLObject));
                break;
            case 9:
                TooManyCommunitiesActivity tooManyCommunitiesActivity = (TooManyCommunitiesActivity) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < tL_messages_inactiveChats.chats.size(); i4++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i4);
                        int currentTime = (tooManyCommunitiesActivity.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i4).intValue()) / 86400;
                        String pluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                        if (ChatObject.isMegagroup(chat)) {
                            arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), pluralString));
                        } else if (ChatObject.isChannel(chat)) {
                            arrayList.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, pluralString));
                        } else {
                            arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), pluralString));
                        }
                    }
                    AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda8(tooManyCommunitiesActivity, arrayList, tL_messages_inactiveChats, 20));
                }
                break;
            case 10:
                UserInfoActivity.AdminedChannelsFetcher adminedChannelsFetcher = (UserInfoActivity.AdminedChannelsFetcher) obj;
                adminedChannelsFetcher.getClass();
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda9(22, adminedChannelsFetcher, tLObject));
                break;
            case 11:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.getClass();
                AndroidUtilities.runOnUIThread(new VoIPFragment$8$$ExternalSyntheticLambda1(wallpapersListActivity, 3));
                break;
            case 12:
                WallpapersListActivity.SearchAdapter searchAdapter = (WallpapersListActivity.SearchAdapter) obj;
                searchAdapter.getClass();
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda9(i3, searchAdapter, tLObject));
                }
                break;
            case 13:
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) obj;
                chatAttachAlertBotWebViewLayout.getClass();
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(6, chatAttachAlertBotWebViewLayout, tL_error));
                break;
            case 14:
                RichAIComposeSheet richAIComposeSheet = (RichAIComposeSheet) obj;
                richAIComposeSheet.getClass();
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(11, richAIComposeSheet, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(i2, (WebInstantView.Loader) obj, tLObject));
                break;
        }
    }
}
