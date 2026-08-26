package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.FilterGLThread$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.ReactedUsersListView;
import org.telegram.ui.Components.ReactedUsersListView$$ExternalSyntheticLambda5;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.TopicsTabsView;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsReactionsSheet;

public final class LinkManager$$ExternalSyntheticLambda3 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;

    public LinkManager$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLObject tLObject2;
        String string;
        String[] strArr;
        int i = 20;
        int i2 = 18;
        int i3 = 2;
        int i4 = 9;
        int i5 = 1;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                LinkManager linkManager = (LinkManager) obj;
                linkManager.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(i3, linkManager, tLObject));
                break;
            case 1:
                ReactedUsersListView reactedUsersListView = (ReactedUsersListView) obj;
                reactedUsersListView.getClass();
                AndroidUtilities.runOnUIThread(new ReactedUsersListView$$ExternalSyntheticLambda5(reactedUsersListView, tLObject, 0));
                break;
            case 2:
                SharedMediaLayout.CommonGroupsAdapter commonGroupsAdapter = (SharedMediaLayout.CommonGroupsAdapter) obj;
                commonGroupsAdapter.getClass();
                AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1(commonGroupsAdapter, tL_error, tLObject, 29));
                break;
            case 3:
                StickersAlert stickersAlert = (StickersAlert) obj;
                stickersAlert.getClass();
                AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(stickersAlert, tL_error, tLObject, 6));
                break;
            case 4:
                TopicsTabsView topicsTabsView = (TopicsTabsView) obj;
                topicsTabsView.getClass();
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(topicsTabsView.currentAccount).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda29(26, topicsTabsView, updates), 1000L);
                    }
                }
                break;
            case 5:
                TranslateAlert2 translateAlert2 = (TranslateAlert2) obj;
                translateAlert2.getClass();
                AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda29(28, translateAlert2, tLObject));
                break;
            case 6:
                TrendingStickersLayout.TrendingStickersAdapter trendingStickersAdapter = (TrendingStickersLayout.TrendingStickersAdapter) obj;
                trendingStickersAdapter.getClass();
                AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(trendingStickersAdapter, tL_error, tLObject, i4));
                break;
            case 7:
                UndoView undoView = (UndoView) obj;
                undoView.getClass();
                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda8(3, undoView, tLObject));
                break;
            case 8:
                ContactAddActivity contactAddActivity = (ContactAddActivity) obj;
                contactAddActivity.getClass();
                AndroidUtilities.runOnUIThread(new ContactAddActivity$$ExternalSyntheticLambda1(contactAddActivity, i3));
                break;
            case 9:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                dataSettingsActivity.getClass();
                AndroidUtilities.runOnUIThread(new DataSettingsActivity$$ExternalSyntheticLambda1(dataSettingsActivity, 1));
                break;
            case 10:
                FilterCreateActivity.FilterInvitesBottomSheet filterInvitesBottomSheet = (FilterCreateActivity.FilterInvitesBottomSheet) obj;
                filterInvitesBottomSheet.getClass();
                AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(filterInvitesBottomSheet, tL_error, tLObject, i));
                break;
            case 11:
                GroupCallActivity.AnonymousClass6 anonymousClass6 = (GroupCallActivity.AnonymousClass6) obj;
                anonymousClass6.getClass();
                if (tLObject instanceof TLRPC.TL_updates) {
                    GroupCallActivity.this.accountInstance.getMessagesController().processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda13(15, (GroupStickersActivity) obj, tL_error));
                break;
            case 13:
                LoginActivity.LoginActivityRegisterView loginActivityRegisterView = (LoginActivity.LoginActivityRegisterView) obj;
                loginActivityRegisterView.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(loginActivityRegisterView, tLObject, tL_error, 13));
                break;
            case 14:
                LoginActivity.LoginActivityResetWaitView loginActivityResetWaitView = (LoginActivity.LoginActivityResetWaitView) obj;
                loginActivityResetWaitView.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(11, loginActivityResetWaitView, tL_error));
                break;
            case 15:
                LoginActivity.LoginActivitySmsView loginActivitySmsView = (LoginActivity.LoginActivitySmsView) obj;
                loginActivitySmsView.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(loginActivitySmsView, tL_error, tLObject, false, 16));
                break;
            case 16:
                LoginActivity.LoginPayView loginPayView = (LoginActivity.LoginPayView) obj;
                loginPayView.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(loginPayView, tLObject, tL_error, i2));
                break;
            case 17:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.getClass();
                AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda6(notificationsSettingsActivity, 27));
                break;
            case 18:
                PassportActivity.PhoneConfirmationView.AnonymousClass5 anonymousClass5 = (PassportActivity.PhoneConfirmationView.AnonymousClass5) obj;
                if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda7(i3, anonymousClass5, tL_error));
                    break;
                }
                break;
            case 19:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.getClass();
                AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda8(premiumPreviewFragment, tL_error, tLObject, i4));
                break;
            case 20:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                privacyControlActivity.getClass();
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda7(i, privacyControlActivity, tLObject));
                break;
            case 21:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                privacySettingsActivity.getClass();
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda7(22, privacySettingsActivity, (TL_account.Password) tLObject));
                }
                break;
            case 22:
                ProfileActivity.SearchAdapter searchAdapter = (ProfileActivity.SearchAdapter) obj;
                searchAdapter.getClass();
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    int i6 = searchAdapter.currentAccount;
                    MessagesController.getInstance(i6).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i6).putChats(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
                } else {
                    tLObject2 = tLObject;
                }
                if (tLObject2 instanceof TLRPC.WebPage) {
                    ArrayList arrayList = new ArrayList();
                    TLRPC.WebPage webPage = (TLRPC.WebPage) tLObject2;
                    TL_iv.Page page = webPage.cached_page;
                    if (page != null) {
                        int size = page.blocks.size();
                        int i7 = 0;
                        while (i7 < size) {
                            TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i7);
                            if (pageBlock instanceof TL_iv.pageBlockList) {
                                if (i7 != 0) {
                                    TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(i7 - 1);
                                    if (pageBlock2 instanceof TL_iv.pageBlockParagraph) {
                                        string = ArticleViewer.getPlainText(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                    } else {
                                        string = null;
                                    }
                                } else {
                                    string = null;
                                }
                                TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                int size2 = pageblocklist.items.size();
                                int i8 = 0;
                                while (i8 < size2) {
                                    TL_iv.PageListItem pageListItem = pageblocklist.items.get(i8);
                                    if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                        TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                        String url = ArticleViewer.getUrl(tL_pageListItemText.text);
                                        String string2 = ArticleViewer.getPlainText(tL_pageListItemText.text).toString();
                                        if (!TextUtils.isEmpty(url) && !TextUtils.isEmpty(string2)) {
                                            if (string != null) {
                                                strArr = new String[2];
                                                strArr[0] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                strArr[i5] = string;
                                            } else {
                                                strArr = new String[i5];
                                                strArr[0] = LocaleController.getString(R.string.SettingsSearchFaq);
                                            }
                                            arrayList.add(new MessagesController.FaqSearchResult(string2, strArr, url));
                                        }
                                    }
                                    i8++;
                                    i5 = 1;
                                }
                            } else if (pageBlock instanceof TL_iv.pageBlockAnchor) {
                                searchAdapter.faqWebPage = webPage;
                            }
                            i7++;
                            i5 = 1;
                        }
                        searchAdapter.faqWebPage = webPage;
                    }
                    AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda17(i4, searchAdapter, arrayList));
                }
                searchAdapter.loadingFaqPage = false;
                break;
            case 23:
                BotStarsActivity botStarsActivity = (BotStarsActivity) obj;
                botStarsActivity.getClass();
                AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda8(botStarsActivity, tLObject, tL_error, i2));
                break;
            case 24:
                BotStarsController.ChannelConnectedBots channelConnectedBots = (BotStarsController.ChannelConnectedBots) obj;
                channelConnectedBots.getClass();
                AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda17(24, channelConnectedBots, tLObject));
                break;
            case 25:
                BotStarsController.ChannelSuggestedBots channelSuggestedBots = (BotStarsController.ChannelSuggestedBots) obj;
                channelSuggestedBots.getClass();
                AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda17(25, channelSuggestedBots, tLObject));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new StickersActivity$$ExternalSyntheticLambda18(i4, tLObject, (VoIPFragment$$ExternalSyntheticLambda7) obj));
                break;
            case 27:
                StarsController.GiftsList giftsList = (StarsController.GiftsList) obj;
                giftsList.getClass();
                AndroidUtilities.runOnUIThread(new StickersActivity$$ExternalSyntheticLambda18(10, giftsList, tLObject));
                break;
            case 28:
                StarsReactionsSheet starsReactionsSheet = (StarsReactionsSheet) obj;
                starsReactionsSheet.getClass();
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(starsReactionsSheet.currentAccount).putMessages(new ArrayList<>(Arrays.asList(starsReactionsSheet.messageObject.messageOwner)), true, true, true, 0, 0, 0L);
                }
                break;
            default:
                StickersActivity stickersActivity = (StickersActivity) obj;
                stickersActivity.getClass();
                AndroidUtilities.runOnUIThread(new StickersActivity$$ExternalSyntheticLambda5(stickersActivity, 1));
                break;
        }
    }
}
