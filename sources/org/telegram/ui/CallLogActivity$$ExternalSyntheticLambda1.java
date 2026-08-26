package org.telegram.ui;

import android.os.Build;
import androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda2;
import j$.util.Objects;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.vkryl.android.util.ClickHelper$$ExternalSyntheticLambda0;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ringtone.RingtoneDataStore;
import org.telegram.messenger.ringtone.RingtoneUploader;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Adapters.BaseLocationAdapter;
import org.telegram.ui.Business.AwayMessagesActivity;
import org.telegram.ui.Business.BusinessChatbotController;
import org.telegram.ui.Business.BusinessIntroActivity;
import org.telegram.ui.Business.GreetMessagesActivity;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.ThemesHorizontalListCell;
import org.telegram.ui.Components.BlockingUpdateView;
import org.telegram.ui.Components.CreateRtmpStreamBottomSheet;
import org.telegram.ui.Components.DialogsBotsAdapter;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.EmojiView$2$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.FilterGLThread$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.ImageUpdater$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.InviteLinkBottomSheet;
import org.telegram.ui.Components.InviteMembersBottomSheet;
import org.telegram.ui.Components.MessagePrivateSeenView;
import org.telegram.ui.Components.PostsSearchContainer;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.ReactedHeaderView;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda0;

public final class CallLogActivity$$ExternalSyntheticLambda1 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;

    public CallLogActivity$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Comparator chatActivity$$ExternalSyntheticLambda18;
        Comparator chatActivity$$ExternalSyntheticLambda19;
        switch (this.$r8$classId) {
            case 0:
                CallLogActivity callLogActivity = (CallLogActivity) this.f$0;
                callLogActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda102(callLogActivity, tL_error, tLObject, 3));
                break;
            case 1:
                RingtoneDataStore ringtoneDataStore = (RingtoneDataStore) this.f$0;
                ringtoneDataStore.getClass();
                AndroidUtilities.runOnUIThread(new ClickHelper$$ExternalSyntheticLambda0(6, ringtoneDataStore, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2((RingtoneUploader) this.f$0, tLObject, tL_error, 7));
                break;
            case 3:
                BaseLocationAdapter baseLocationAdapter = (BaseLocationAdapter) this.f$0;
                baseLocationAdapter.getClass();
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda8(1, baseLocationAdapter, tLObject));
                }
                break;
            case 4:
                SearchViewPager.AnonymousClass1 anonymousClass1 = (SearchViewPager.AnonymousClass1) this.f$0;
                anonymousClass1.getClass();
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda8(2, anonymousClass1, tLObject));
                break;
            case 5:
                ArchivedStickersActivity archivedStickersActivity = (ArchivedStickersActivity) this.f$0;
                archivedStickersActivity.getClass();
                AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(archivedStickersActivity, tL_error, tLObject, 19));
                break;
            case 6:
                AwayMessagesActivity awayMessagesActivity = (AwayMessagesActivity) this.f$0;
                awayMessagesActivity.getClass();
                AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(awayMessagesActivity, tL_error, tLObject, 21));
                break;
            case 7:
                BusinessChatbotController businessChatbotController = (BusinessChatbotController) this.f$0;
                businessChatbotController.getClass();
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda8(11, businessChatbotController, tLObject));
                break;
            case 8:
                BusinessIntroActivity businessIntroActivity = (BusinessIntroActivity) this.f$0;
                businessIntroActivity.getClass();
                AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(businessIntroActivity, tL_error, tLObject, 22));
                break;
            case 9:
                GreetMessagesActivity greetMessagesActivity = (GreetMessagesActivity) this.f$0;
                greetMessagesActivity.getClass();
                AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(greetMessagesActivity, tL_error, tLObject, 26));
                break;
            case 10:
                OpeningHoursActivity openingHoursActivity = (OpeningHoursActivity) this.f$0;
                openingHoursActivity.getClass();
                AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(openingHoursActivity, tL_error, tLObject, 27));
                break;
            case 11:
                QuickRepliesController quickRepliesController = (QuickRepliesController) this.f$0;
                quickRepliesController.getClass();
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda8(17, quickRepliesController, tLObject));
                break;
            case 12:
                ThemesHorizontalListCell.InnerThemeView innerThemeView = (ThemesHorizontalListCell.InnerThemeView) this.f$0;
                innerThemeView.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda7(4, innerThemeView, tLObject));
                break;
            case 13:
                ChatEditActivity.AnonymousClass1 anonymousClass2 = (ChatEditActivity.AnonymousClass1) this.f$0;
                anonymousClass2.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda174(anonymousClass2, 22));
                break;
            case 14:
                ChatLinkActivity chatLinkActivity = (ChatLinkActivity) this.f$0;
                chatLinkActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda9(0, chatLinkActivity, tLObject));
                break;
            case 15:
                ChatUsersActivity chatUsersActivity = (ChatUsersActivity) this.f$0;
                chatUsersActivity.getClass();
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    chatUsersActivity.getMessagesController().processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda9(12, chatUsersActivity, updates), 1000L);
                    }
                }
                break;
            case 16:
                if (tLObject instanceof TLRPC.Updates) {
                    ((AccountInstance) this.f$0).getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                }
                break;
            case 17:
                BlockingUpdateView blockingUpdateView = (BlockingUpdateView) this.f$0;
                blockingUpdateView.getClass();
                AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda9(17, blockingUpdateView, tLObject));
                break;
            case 18:
                CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet = (CreateRtmpStreamBottomSheet) this.f$0;
                createRtmpStreamBottomSheet.getClass();
                AndroidUtilities.runOnUIThread(new EmojiView$2$$ExternalSyntheticLambda1(14, createRtmpStreamBottomSheet, tLObject));
                break;
            case 19:
                DialogsBotsAdapter.PopularBots popularBots = (DialogsBotsAdapter.PopularBots) this.f$0;
                popularBots.getClass();
                AndroidUtilities.runOnUIThread(new EmojiView$2$$ExternalSyntheticLambda1(15, popularBots, tLObject));
                break;
            case 20:
                EmojiView.AnonymousClass2 anonymousClass3 = (EmojiView.AnonymousClass2) this.f$0;
                anonymousClass3.getClass();
                AndroidUtilities.runOnUIThread(new EmojiView$2$$ExternalSyntheticLambda1(20, anonymousClass3, tLObject));
                break;
            case 21:
                EmojiView.GifAdapter gifAdapter = (EmojiView.GifAdapter) this.f$0;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new EmojiView$2$$ExternalSyntheticLambda1(25, gifAdapter, tLObject));
                }
                break;
            case 22:
                InviteLinkBottomSheet inviteLinkBottomSheet = (InviteLinkBottomSheet) this.f$0;
                inviteLinkBottomSheet.getClass();
                AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(3, inviteLinkBottomSheet, tLObject));
                break;
            case 23:
                InviteMembersBottomSheet inviteMembersBottomSheet = (InviteMembersBottomSheet) this.f$0;
                inviteMembersBottomSheet.getClass();
                AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1(inviteMembersBottomSheet, tL_error, tLObject, 13));
                break;
            case 24:
                MessagePrivateSeenView messagePrivateSeenView = (MessagePrivateSeenView) this.f$0;
                messagePrivateSeenView.getClass();
                AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1(messagePrivateSeenView, tL_error, tLObject, 16));
                break;
            case 25:
                PostsSearchContainer postsSearchContainer = (PostsSearchContainer) this.f$0;
                postsSearchContainer.getClass();
                AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(17, postsSearchContainer, tLObject));
                break;
            case 26:
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap map = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < tL_help_countriesList.countries.size(); i++) {
                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i);
                        String str = tL_help_country.name;
                        if (str != null) {
                            tL_help_country.default_name = str;
                        }
                        if (!tL_help_country.hidden && !tL_help_country.iso2.equalsIgnoreCase("FT")) {
                            String upperCase = tL_help_country.default_name.substring(0, 1).toUpperCase();
                            List arrayList2 = (List) map.get(upperCase);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                map.put(upperCase, arrayList2);
                                arrayList.add(upperCase);
                            }
                            arrayList2.add(tL_help_country);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Collator collator = Collator.getInstance(LocaleController.getInstance().getCurrentLocale() != null ? LocaleController.getInstance().getCurrentLocale() : Locale.getDefault());
                        Objects.requireNonNull(collator);
                        chatActivity$$ExternalSyntheticLambda18 = new TableModel$$ExternalSyntheticLambda0(collator, 6);
                    } else {
                        chatActivity$$ExternalSyntheticLambda18 = new ChatActivity$$ExternalSyntheticLambda18(18);
                    }
                    Collections.sort(arrayList, chatActivity$$ExternalSyntheticLambda18);
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new CountrySelectActivity$CountryAdapter$$ExternalSyntheticLambda0(chatActivity$$ExternalSyntheticLambda18, 1));
                    }
                    AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1((SelectorBottomSheet$$ExternalSyntheticLambda7) this.f$0, map, arrayList, 20));
                }
                break;
            case 27:
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList2 = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap map2 = new HashMap();
                    ArrayList arrayList3 = new ArrayList();
                    for (int i2 = 0; i2 < tL_help_countriesList2.countries.size(); i2++) {
                        TLRPC.TL_help_country tL_help_country2 = tL_help_countriesList2.countries.get(i2);
                        boolean zEqualsIgnoreCase = tL_help_country2.iso2.equalsIgnoreCase("FT");
                        String str2 = tL_help_country2.name;
                        if (str2 != null) {
                            tL_help_country2.default_name = str2;
                        }
                        if (!tL_help_country2.hidden || zEqualsIgnoreCase) {
                            if (zEqualsIgnoreCase) {
                                String string = LocaleController.getString(R.string.Fragment);
                                tL_help_country2.default_name = string;
                                tL_help_country2.name = string;
                            }
                            String upperCase2 = tL_help_country2.default_name.substring(0, 1).toUpperCase();
                            List arrayList4 = (List) map2.get(upperCase2);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                map2.put(upperCase2, arrayList4);
                                arrayList3.add(upperCase2);
                            }
                            arrayList4.add(tL_help_country2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Collator collator2 = Collator.getInstance(LocaleController.getInstance().getCurrentLocale() != null ? LocaleController.getInstance().getCurrentLocale() : Locale.getDefault());
                        Objects.requireNonNull(collator2);
                        chatActivity$$ExternalSyntheticLambda19 = new TableModel$$ExternalSyntheticLambda0(collator2, 6);
                    } else {
                        chatActivity$$ExternalSyntheticLambda19 = new ChatActivity$$ExternalSyntheticLambda18(18);
                    }
                    Collections.sort(arrayList3, chatActivity$$ExternalSyntheticLambda19);
                    Iterator it2 = map2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new CountrySelectActivity$CountryAdapter$$ExternalSyntheticLambda0(chatActivity$$ExternalSyntheticLambda19, 2));
                    }
                    AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1((PollItemMenu$$ExternalSyntheticLambda14) this.f$0, map2, arrayList3, 23));
                }
                break;
            case 28:
                UserSelectorBottomSheet userSelectorBottomSheet = (UserSelectorBottomSheet) this.f$0;
                userSelectorBottomSheet.getClass();
                AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(28, userSelectorBottomSheet, tLObject));
                break;
            default:
                ReactedHeaderView reactedHeaderView = (ReactedHeaderView) this.f$0;
                reactedHeaderView.getClass();
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i3 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    reactedHeaderView.post(new ChatActivity$$ExternalSyntheticLambda17(reactedHeaderView, i3, tL_messages_messageReactionsList, 27));
                }
                break;
        }
    }
}
