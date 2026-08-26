package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.biometric.BiometricPrompt$AuthenticationResult;
import androidx.biometric.BiometricPrompt$CryptoObject;
import com.google.android.gms.internal.mlkit_vision_common.zzks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.DialogsBotsAdapter;
import org.telegram.ui.Components.DialogsChannelsAdapter;
import org.telegram.ui.Components.ImageUpdater$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.LocationView;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.poll.PollAttachedMedia;
import org.telegram.ui.Components.poll.WebPageLoader;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaLink;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.LiveCommentsView$$ExternalSyntheticLambda2;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.UserListPoller;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;
import org.telegram.ui.web.BotWebViewContainer;

public final class OAuthSheet$$ExternalSyntheticLambda18 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public OAuthSheet$$ExternalSyntheticLambda18(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TLRPC.TL_contacts_found tL_contacts_found;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.TL_contacts_found tL_contacts_found2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.WebPage webPage;
        TLRPC.EmojiStatus tL_emojiStatusEmpty;
        int i;
        int i2;
        boolean z;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        switch (this.$r8$classId) {
            case 0:
                ((boolean[]) this.f$0)[0] = true;
                ((BottomSheet) this.f$1).lambda$showGiftOfferSheet$15();
                break;
            case 1:
                Boolean bool = (Boolean) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (bool.booleanValue()) {
                        ((ArticleViewer$$ExternalSyntheticLambda33) this.f$0).run(Boolean.TRUE);
                    }
                    ((ArticleViewer$$ExternalSyntheticLambda32) this.f$1).run();
                }
                break;
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ChatActionCell chatActionCell = (ChatActionCell) this.f$0;
                if (updates != null) {
                    MessagesController.getInstance(chatActionCell.currentAccount).processUpdates(updates, false);
                }
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda8(27, (BaseFragment) this.f$1, tL_error));
                }
                break;
            case 3:
                ((ChatActivity) this.f$0).lambda$processSelectedOption$324((MessageObject) this.f$1, (Long) obj, (Runnable) obj2);
                break;
            case 4:
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.linkSearchRequestId = 0;
                if (webpagepreview != null) {
                    chatActivity.getMessagesController().putUsers(webpagepreview.users, false);
                    chatActivity.getMessagesController().putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                    } else {
                        tL_messageMediaWebPage = null;
                    }
                } else {
                    tL_messageMediaWebPage = null;
                }
                ChatActivity$$ExternalSyntheticLambda464 chatActivity$$ExternalSyntheticLambda464 = (ChatActivity$$ExternalSyntheticLambda464) this.f$1;
                if (tL_messageMediaWebPage == null) {
                    chatActivity$$ExternalSyntheticLambda464.run(Boolean.FALSE, null);
                } else {
                    TLRPC.WebPage webPage2 = tL_messageMediaWebPage.webpage;
                    if (webPage2 != null && "telegram_story".equals(webPage2.type)) {
                        if (tL_messageMediaWebPage.webpage.attributes != null) {
                            while (true) {
                                if (i6 >= tL_messageMediaWebPage.webpage.attributes.size()) {
                                    tL_webPageAttributeStory = null;
                                } else if (tL_messageMediaWebPage.webpage.attributes.get(i6) instanceof TLRPC.TL_webPageAttributeStory) {
                                    tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) tL_messageMediaWebPage.webpage.attributes.get(i6);
                                } else {
                                    i6++;
                                }
                            }
                        } else {
                            tL_webPageAttributeStory = null;
                        }
                        if (tL_webPageAttributeStory == null) {
                            chatActivity$$ExternalSyntheticLambda464.run(Boolean.FALSE, null);
                        } else if (tL_webPageAttributeStory.storyItem == null) {
                            chatActivity.getMessagesStorage().getStorageQueue().postRunnable(new ChatActivity$$ExternalSyntheticLambda271(chatActivity, tL_messageMediaWebPage, tL_webPageAttributeStory, chatActivity$$ExternalSyntheticLambda464, 28));
                        } else {
                            chatActivity$$ExternalSyntheticLambda464.run(Boolean.TRUE, tL_messageMediaWebPage.webpage);
                        }
                    } else {
                        chatActivity$$ExternalSyntheticLambda464.run(Boolean.valueOf(tL_messageMediaWebPage.webpage != null), tL_messageMediaWebPage.webpage);
                    }
                }
                break;
            case 5:
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = (ChatActivity.ChatMessageCellDelegate) this.f$0;
                if (tL_channels_channelParticipant == null) {
                    chatMessageCellDelegate.getClass();
                } else {
                    ChatActivity chatActivity2 = ChatActivity.this;
                    chatActivity2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                    chatActivity2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant != null) {
                        chatMessageCellDelegate.didPressAdmin((ChatMessageCell) this.f$1, channelParticipant);
                    }
                }
                break;
            case 6:
                ChatEditActivity chatEditActivity = (ChatEditActivity) this.f$0;
                View view = (View) this.f$1;
                chatEditActivity.getClass();
                chatEditActivity.forum = ((Boolean) obj).booleanValue();
                chatEditActivity.forumTabs = ((Boolean) obj2).booleanValue();
                UserCell.AnonymousClass2 anonymousClass2 = chatEditActivity.avatarImage;
                int iDp = AndroidUtilities.dp(chatEditActivity.forum ? 16.0f : 32.0f);
                if (anonymousClass2.getRoundRadius()[0] != iDp) {
                    ValueAnimator valueAnimator = anonymousClass2.roundRadiusAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(anonymousClass2.getRoundRadius()[0], iDp);
                    anonymousClass2.roundRadiusAnimator = valueAnimatorOfInt;
                    valueAnimatorOfInt.addUpdateListener(new ChatActivity.AnonymousClass133(anonymousClass2, 6));
                    anonymousClass2.roundRadiusAnimator.setDuration(200L);
                    anonymousClass2.roundRadiusAnimator.start();
                }
                ((TextCell) view).setChecked(chatEditActivity.forum);
                chatEditActivity.updateFields(false, true);
                if (!chatEditActivity.donePressed) {
                    TLRPC.Chat chat3 = chatEditActivity.currentChat;
                    if (chat3.forum != chatEditActivity.forum || chat3.forum_tabs != chatEditActivity.forumTabs) {
                        if (ChatObject.isChannel(chat3) || !chatEditActivity.forum) {
                            char c = chatEditActivity.currentChat.forum_tabs != chatEditActivity.forumTabs ? (char) 1 : (char) 0;
                            chatEditActivity.getMessagesController().toggleChannelForum(chatEditActivity.chatId, chatEditActivity.forum, chatEditActivity.forumTabs);
                            TLRPC.Chat chat4 = chatEditActivity.currentChat;
                            chat4.forum = chatEditActivity.forum;
                            chat4.forum_tabs = chatEditActivity.forumTabs;
                            if (c != 0) {
                                chatEditActivity.updatePastFragmentsOnTabs();
                            }
                            break;
                        } else {
                            Context parentActivity = chatEditActivity.getParentActivity();
                            if (parentActivity == null) {
                                parentActivity = LaunchActivity.instance;
                            }
                            if (parentActivity == null) {
                                parentActivity = ApplicationLoader.applicationContext;
                            }
                            if (parentActivity != null) {
                                AlertDialog alertDialog = new AlertDialog(parentActivity, 3, null);
                                chatEditActivity.donePressed = true;
                                AndroidUtilities.cancelRunOnUIThread(alertDialog.showRunnable);
                                AndroidUtilities.runOnUIThread(alertDialog.showRunnable, 250L);
                                chatEditActivity.getMessagesController().convertToMegaGroup(chatEditActivity.getParentActivity(), chatEditActivity.chatId, chatEditActivity, new ChatActivity$$ExternalSyntheticLambda189(6, chatEditActivity, alertDialog));
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                Long l = (Long) obj;
                ChatAttachAlert chatAttachAlert = (ChatAttachAlert) this.f$0;
                chatAttachAlert.getClass();
                ((Runnable) obj2).run();
                chatAttachAlert.photoLayout.setStarsPrice(l.longValue());
                long jLongValue = l.longValue();
                ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) this.f$1;
                if (jLongValue <= 0) {
                    actionBarMenuSubItem.setText(LocaleController.getString(R.string.PaidMediaButton));
                    actionBarMenuSubItem.setSubtext(null);
                    chatAttachAlert.messageSendPreview.setStars(0L);
                } else {
                    actionBarMenuSubItem.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                    actionBarMenuSubItem.setSubtext(LocaleController.formatPluralString("Stars", (int) l.longValue(), new Object[0]));
                    chatAttachAlert.messageSendPreview.setStars(l.longValue());
                }
                break;
            case 8:
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = (ChatAttachAlertPollLayout) this.f$0;
                chatAttachAlertPollLayout.getClass();
                chatAttachAlertPollLayout.checkPollLinkMedia((PollAttachedMediaLink) ((PollAttachedMedia) this.f$1), true);
                break;
            case 9:
                TLRPC.TL_contacts_found tL_contacts_found3 = (TLRPC.TL_contacts_found) obj;
                DialogsBotsAdapter dialogsBotsAdapter = (DialogsBotsAdapter) this.f$0;
                dialogsBotsAdapter.getClass();
                if (TextUtils.equals(((TLRPC.TL_contacts_search) this.f$1).q, dialogsBotsAdapter.query) && !TextUtils.isEmpty(dialogsBotsAdapter.query)) {
                    dialogsBotsAdapter.loadingBots = false;
                    int i7 = dialogsBotsAdapter.currentAccount;
                    if (tL_contacts_found3 != null) {
                        MessagesStorage.getInstance(i7).putUsersAndChats(tL_contacts_found3.users, tL_contacts_found3.chats, true, true);
                        MessagesController.getInstance(i7).putUsers(tL_contacts_found3.users, false);
                        MessagesController.getInstance(i7).putChats(tL_contacts_found3.chats, false);
                        tL_contacts_found = tL_contacts_found3;
                    } else {
                        tL_contacts_found = null;
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = dialogsBotsAdapter.searchMine;
                    arrayList.clear();
                    if (tL_contacts_found != null) {
                        ArrayList<TLRPC.Peer> arrayList2 = tL_contacts_found.my_results;
                        int size = arrayList2.size();
                        int i8 = 0;
                        while (i8 < size) {
                            TLRPC.Peer peer = arrayList2.get(i8);
                            i8++;
                            TLRPC.Peer peer2 = peer;
                            if ((peer2 instanceof TLRPC.TL_peerUser) && (user2 = MessagesController.getInstance(i7).getUser(Long.valueOf(peer2.user_id))) != null && user2.bot && !hashSet.contains(Long.valueOf(user2.id))) {
                                hashSet.add(Long.valueOf(user2.id));
                                arrayList.add(user2);
                            }
                        }
                    }
                    ArrayList arrayList3 = dialogsBotsAdapter.searchGlobal;
                    arrayList3.clear();
                    if (tL_contacts_found != null) {
                        ArrayList<TLRPC.Peer> arrayList4 = tL_contacts_found.results;
                        int size2 = arrayList4.size();
                        int i9 = 0;
                        while (i9 < size2) {
                            TLRPC.Peer peer3 = arrayList4.get(i9);
                            i9++;
                            TLRPC.Peer peer4 = peer3;
                            if ((peer4 instanceof TLRPC.TL_peerUser) && (user = MessagesController.getInstance(i7).getUser(Long.valueOf(peer4.user_id))) != null && user.bot && !hashSet.contains(Long.valueOf(user.id))) {
                                hashSet.add(Long.valueOf(user.id));
                                arrayList3.add(user);
                            }
                        }
                    }
                    RecyclerListView recyclerListView = dialogsBotsAdapter.listView;
                    if (recyclerListView != null) {
                        recyclerListView.scrollToPosition(0);
                    }
                    dialogsBotsAdapter.update(true);
                    break;
                }
                break;
            case 10:
                TLRPC.TL_contacts_found tL_contacts_found4 = (TLRPC.TL_contacts_found) obj;
                DialogsChannelsAdapter dialogsChannelsAdapter = (DialogsChannelsAdapter) this.f$0;
                dialogsChannelsAdapter.getClass();
                if (TextUtils.equals(((TLRPC.TL_contacts_search) this.f$1).q, dialogsChannelsAdapter.query) && !TextUtils.isEmpty(dialogsChannelsAdapter.query)) {
                    dialogsChannelsAdapter.loadingChannels = false;
                    boolean z2 = tL_contacts_found4 != null;
                    int i10 = dialogsChannelsAdapter.currentAccount;
                    if (z2) {
                        MessagesStorage.getInstance(i10).putUsersAndChats(tL_contacts_found4.users, tL_contacts_found4.chats, true, true);
                        MessagesController.getInstance(i10).putUsers(tL_contacts_found4.users, false);
                        MessagesController.getInstance(i10).putChats(tL_contacts_found4.chats, false);
                        tL_contacts_found2 = tL_contacts_found4;
                    } else {
                        tL_contacts_found2 = null;
                    }
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList5 = dialogsChannelsAdapter.searchMyChannels;
                    arrayList5.clear();
                    if (tL_contacts_found2 != null) {
                        ArrayList<TLRPC.Peer> arrayList6 = tL_contacts_found2.my_results;
                        int size3 = arrayList6.size();
                        int i11 = 0;
                        while (i11 < size3) {
                            TLRPC.Peer peer5 = arrayList6.get(i11);
                            i11++;
                            TLRPC.Peer peer6 = peer5;
                            if ((peer6 instanceof TLRPC.TL_peerChannel) && (chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(peer6.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat2) && !hashSet2.contains(Long.valueOf(chat2.id))) {
                                hashSet2.add(Long.valueOf(chat2.id));
                                arrayList5.add(chat2);
                            }
                        }
                    }
                    ArrayList arrayList7 = dialogsChannelsAdapter.searchRecommendedChannels;
                    arrayList7.clear();
                    String lowerCase = dialogsChannelsAdapter.query.toLowerCase();
                    String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
                    MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(i10).getCachedChannelRecommendations(0L);
                    if (cachedChannelRecommendations != null && !cachedChannelRecommendations.chats.isEmpty()) {
                        ArrayList<TLObject> arrayList8 = cachedChannelRecommendations.chats;
                        int size4 = arrayList8.size();
                        int i12 = 0;
                        while (i12 < size4) {
                            TLObject tLObject = arrayList8.get(i12);
                            i12++;
                            TLObject tLObject2 = tLObject;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat5 = (TLRPC.Chat) tLObject2;
                                if (ChatObject.isChannelAndNotMegaGroup(chat5)) {
                                    TLRPC.Chat chat6 = MessagesController.getInstance(i10).getChat(Long.valueOf(chat5.id));
                                    if (ChatObject.isNotInChat(chat5) && (chat6 == null || ChatObject.isNotInChat(chat6))) {
                                        String lowerCase2 = chat5.title.toLowerCase();
                                        String strTranslitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                                        if (lowerCase2.startsWith(lowerCase) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", lowerCase, lowerCase2) || strTranslitSafe2.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, strTranslitSafe2)) {
                                            if (!hashSet2.contains(Long.valueOf(chat5.id))) {
                                                hashSet2.add(Long.valueOf(chat5.id));
                                                arrayList7.add(chat5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ArrayList arrayList9 = dialogsChannelsAdapter.searchChannels;
                    arrayList9.clear();
                    if (tL_contacts_found2 != null) {
                        ArrayList<TLRPC.Peer> arrayList10 = tL_contacts_found2.results;
                        int size5 = arrayList10.size();
                        while (i5 < size5) {
                            TLRPC.Peer peer7 = arrayList10.get(i5);
                            i5++;
                            TLRPC.Peer peer8 = peer7;
                            if ((peer8 instanceof TLRPC.TL_peerChannel) && (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(peer8.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat) && !hashSet2.contains(Long.valueOf(chat.id))) {
                                hashSet2.add(Long.valueOf(chat.id));
                                arrayList9.add(chat);
                            }
                        }
                    }
                    dialogsChannelsAdapter.update(true);
                    break;
                }
                break;
            case 11:
                Boolean bool2 = (Boolean) obj;
                String str = (String) obj2;
                BoostViaGiftsBottomSheet boostViaGiftsBottomSheet = (BoostViaGiftsBottomSheet) this.f$0;
                boostViaGiftsBottomSheet.actionBtn.button.setLoading(false);
                if (boostViaGiftsBottomSheet.getContext() != null) {
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    LaunchActivity.AnonymousClass5 anonymousClass5 = LaunchActivity.instance.fireworksOverlay;
                    if (safeLastFragment != null) {
                        if (bool2.booleanValue()) {
                            boostViaGiftsBottomSheet.lambda$showGiftOfferSheet$15();
                            ChatActivity chatActivityOf = ChatActivity.of(-boostViaGiftsBottomSheet.currentChat.id);
                            safeLastFragment.presentFragment(chatActivityOf);
                            safeLastFragment.whenFullyVisible(new ImageUpdater$$ExternalSyntheticLambda2(26, chatActivityOf, (TL_stars.TL_starsGiveawayOption) this.f$1));
                            if (anonymousClass5 != null) {
                                anonymousClass5.start(true);
                            }
                        } else if (str != null) {
                            boostViaGiftsBottomSheet.lambda$showGiftOfferSheet$15();
                            zzks.m(R.string.UnknownErrorCode, new Object[]{str}, BulletinFactory.of(safeLastFragment), R.raw.error);
                        }
                        break;
                    }
                }
                break;
            case 12:
                ((TranslateAlert2) this.f$0).lambda$translate$3((TLRPC.TL_textWithEntities) this.f$1, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                break;
            case 13:
                TL_account.webPagePreview webpagepreview2 = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                WebPageLoader webPageLoader = (WebPageLoader) this.f$0;
                if (webpagepreview2 != null) {
                    int i13 = webPageLoader.currentAccount;
                    MessagesController.getInstance(i13).putUsers(webpagepreview2.users, false);
                    MessagesController.getInstance(i13).putChats(webpagepreview2.chats, false);
                    TLRPC.MessageMedia messageMedia2 = webpagepreview2.media;
                    if (messageMedia2 != null) {
                        webPage = messageMedia2.webpage;
                    } else {
                        webPage = null;
                    }
                } else {
                    webPage = null;
                }
                HashMap map = webPageLoader.pages;
                String str2 = (String) this.f$1;
                map.put(str2, webPage);
                ArrayList arrayList11 = (ArrayList) webPageLoader.callbacks.remove(str2);
                if (arrayList11 != null) {
                    int size6 = arrayList11.size();
                    while (i4 < size6) {
                        Object obj3 = arrayList11.get(i4);
                        i4++;
                        ((Utilities.Callback2) obj3).run(webPage, tL_error2);
                    }
                }
                break;
            case 14:
                ArrayList arrayList12 = (ArrayList) obj;
                ProfileGiftsContainer.UnpinSheet unpinSheet = (ProfileGiftsContainer.UnpinSheet) this.f$0;
                unpinSheet.getClass();
                ArrayList arrayList13 = ((StarsController.GiftsList) this.f$1).gifts;
                int size7 = arrayList13.size();
                int i14 = 0;
                while (i14 < size7) {
                    Object obj4 = arrayList13.get(i14);
                    i14++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                    if (savedStarGift.pinned_to_top) {
                        int i15 = PeerColorActivity.GiftCell.Factory.$r8$clinit;
                        UItem uItemOfFactory = UItem.ofFactory(PeerColorActivity.GiftCell.Factory.class);
                        uItemOfFactory.object = savedStarGift;
                        uItemOfFactory.setChecked(unpinSheet.selectedGift == savedStarGift.gift.id);
                        uItemOfFactory.spanCount = 1;
                        arrayList12.add(uItemOfFactory);
                    }
                }
                break;
            case 15:
                ((GroupCallActivity) this.f$0).lambda$new$23((ChatObject.Call) this.f$1, (Boolean) obj, (HashSet) obj2);
                break;
            case 16:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                LinkManager linkManager = (LinkManager) this.f$0;
                linkManager.done();
                if (passkeys != null) {
                    linkManager.presentFragment(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase((String) this.f$1)) {
                        linkManager.scrollTo("addPasskeyRow");
                    }
                    break;
                }
                break;
            case 17:
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                LinkManager linkManager2 = (LinkManager) this.f$0;
                linkManager2.done();
                if (tL_error3 == null) {
                    OAuthSheet.handle(linkManager2.isExternalIntent, linkManager2.currentAccount, (TLRPC.TL_messages_requestUrlAuth) this.f$1, urlAuthResult, null, null, null, false, null);
                } else if (!"URL_EXPIRED".equalsIgnoreCase(tL_error3.text)) {
                    LinkManager.getBulletinFactory().showForError(false, tL_error3);
                } else {
                    LinkManager.getBulletinFactory().createSimpleBulletin(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).show();
                }
                break;
            case 18:
                ((Browser.Progress) this.f$0).end();
                ((OAuthSheet$$ExternalSyntheticLambda13) this.f$1).run((Boolean) obj);
                break;
            case 19:
                Long l2 = (Long) obj;
                Integer num = (Integer) obj2;
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f$0;
                premiumPreviewFragment.getClass();
                if (l2 == null) {
                    tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
                } else {
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    tL_emojiStatus.document_id = l2.longValue();
                    if (num != null) {
                        tL_emojiStatus.flags |= 1;
                        tL_emojiStatus.until = num.intValue();
                    }
                    tL_emojiStatusEmpty = tL_emojiStatus;
                }
                premiumPreviewFragment.getMessagesController().updateEmojiStatus(tL_emojiStatusEmpty);
                ((PremiumFeatureCell) this.f$1).setEmoji(l2 != null ? l2.longValue() : 0L, true);
                break;
            case 20:
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                StarGiftSheet.CraftTopView craftTopView = (StarGiftSheet.CraftTopView) this.f$0;
                HintView2 hintView2 = craftTopView.currentHint;
                if (hintView2 != null) {
                    hintView2.hide(true);
                    craftTopView.currentHint = null;
                }
                craftTopView.crafted = true;
                craftTopView.failed = starGift == null;
                craftTopView.openCraftedGift = runnable;
                StarGiftSheet.CraftTopView.Cube3D.AnimSequence animSequence = new StarGiftSheet.CraftTopView.Cube3D.AnimSequence(craftTopView.cube);
                ArrayList arrayList14 = new ArrayList();
                int i16 = 0;
                while (true) {
                    StarGiftSheet.CraftTopView.SelectGiftView[] selectGiftViewArr = craftTopView.gifts;
                    if (i16 >= selectGiftViewArr.length) {
                        int i17 = 4;
                        if (arrayList14.size() == 1) {
                            animSequence.put(selectGiftViewArr[((Integer) arrayList14.get(0)).intValue()], 5, 0.0f);
                            animSequence.friction(false);
                            animSequence.fling(26.0f, -26.0f);
                            animSequence.delay(90);
                            animSequence.friction(true);
                            animSequence.delay(20);
                            i2 = 40;
                        } else {
                            int[] iArr = {5, 0, 2, 3, 4};
                            StarGiftSheet.CraftTopView.SelectGiftView selectGiftView = selectGiftViewArr[0];
                            if (selectGiftView == null) {
                                i = 0;
                            } else {
                                TL_stars.StarGift starGift2 = selectGiftView.gift;
                                if (starGift2 == null) {
                                    starGift2 = null;
                                }
                                if (starGift2 != null) {
                                    animSequence.put(selectGiftView, iArr[0], 0.0f);
                                    animSequence.fling(25.0f, -22.0f);
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                            }
                            StarGiftSheet.CraftTopView.SelectGiftView selectGiftView2 = selectGiftViewArr[1];
                            if (selectGiftView2 != null) {
                                TL_stars.StarGift starGift3 = selectGiftView2.gift;
                                if (starGift3 == null) {
                                    starGift3 = null;
                                }
                                if (starGift3 != null) {
                                    if (i > 0) {
                                        animSequence.delay(42);
                                    }
                                    animSequence.put(selectGiftViewArr[1], iArr[i], 0.0f);
                                    animSequence.fling(25.0f, 31.0f);
                                    i++;
                                }
                            }
                            StarGiftSheet.CraftTopView.SelectGiftView selectGiftView3 = selectGiftViewArr[2];
                            if (selectGiftView3 != null) {
                                TL_stars.StarGift starGift4 = selectGiftView3.gift;
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                if (starGift4 != null) {
                                    if (i > 0) {
                                        animSequence.delay(42);
                                    }
                                    animSequence.put(selectGiftViewArr[2], iArr[i], 180.0f);
                                    animSequence.fling(-36.0f, -36.0f);
                                    i++;
                                }
                            }
                            StarGiftSheet.CraftTopView.SelectGiftView selectGiftView4 = selectGiftViewArr[3];
                            if (selectGiftView4 != null) {
                                TL_stars.StarGift starGift5 = selectGiftView4.gift;
                                if ((starGift5 != null ? starGift5 : null) != null) {
                                    if (i > 0) {
                                        animSequence.delay(42);
                                    }
                                    animSequence.put(selectGiftViewArr[3], iArr[i], 0.0f);
                                    animSequence.fling(-31.0f, 31.0f);
                                    i++;
                                }
                            }
                            animSequence.friction(false);
                            animSequence.delay(40);
                            animSequence.friction(true);
                            animSequence.delay(40);
                            i17 = iArr[i];
                            i2 = 80;
                        }
                        TodoItemMenu$$ExternalSyntheticLambda2 todoItemMenu$$ExternalSyntheticLambda2 = new TodoItemMenu$$ExternalSyntheticLambda2(craftTopView, i17, starGift, 3);
                        ArrayList arrayList15 = animSequence.commands;
                        arrayList15.add(new StarGiftSheet.CraftTopView.Cube3D.AnimSequence.Cmd(1, 0.0f, 0.0f, 0, -1, 0.0f, null, todoItemMenu$$ExternalSyntheticLambda2));
                        arrayList15.add(new StarGiftSheet.CraftTopView.Cube3D.AnimSequence.Cmd(4, 0.0f, 0.0f, i2, i17, -90, null, null));
                        animSequence.onComplete = new ProfileActivity$$ExternalSyntheticLambda149(craftTopView, starGift, (ArrayList) this.f$1, runnable, 14);
                        animSequence.cancelled = false;
                        animSequence.currentIndex = 0;
                        animSequence.waitingForPull = false;
                        int size8 = arrayList15.size();
                        while (true) {
                            StarGiftSheet.CraftTopView.Cube3D cube3D = animSequence.cube;
                            if (i3 >= size8) {
                                cube3D.sequence = animSequence;
                                animSequence.executeNext();
                                break;
                            } else {
                                Object obj5 = arrayList15.get(i3);
                                i3++;
                                StarGiftSheet.CraftTopView.Cube3D.AnimSequence.Cmd cmd = (StarGiftSheet.CraftTopView.Cube3D.AnimSequence.Cmd) obj5;
                                int i18 = cmd.face;
                                if (i18 >= 0 && i18 < 6) {
                                    float f = cmd.rotation;
                                    if (f != 0.0f) {
                                        cube3D.faceRotations[i18] = f;
                                    }
                                }
                            }
                        }
                    } else {
                        StarGiftSheet.CraftTopView.SelectGiftView selectGiftView5 = selectGiftViewArr[i16];
                        if (selectGiftView5 != null) {
                            TL_stars.StarGift starGift6 = selectGiftView5.gift;
                            if (starGift6 == null) {
                                starGift6 = null;
                            }
                            if (starGift6 != null) {
                                arrayList14.add(Integer.valueOf(i16));
                            }
                        }
                        i16++;
                    }
                }
                break;
            case 21:
                ((StarsIntroActivity) this.f$0).lambda$onItemClick$8((UItem) this.f$1, (Boolean) obj, (String) obj2);
                break;
            case 22:
                ((StarsIntroActivity.StarsNeededSheet) this.f$0).lambda$onItemClick$2((UItem) this.f$1, (Boolean) obj, (String) obj2);
                break;
            case 23:
                ((StarsIntroActivity.StarsOptionsSheet) this.f$0).lambda$onItemClick$2$1((UItem) this.f$1, (Boolean) obj, (String) obj2);
                break;
            case 24:
                TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
                PeerStoriesView.AnonymousClass10 anonymousClass10 = (PeerStoriesView.AnonymousClass10) this.f$0;
                anonymousClass10.polling = false;
                TLRPC.InputGroupCall inputGroupCall = anonymousClass10.inputCall;
                if (inputGroupCall != null && inputGroupCall.id == ((TL_phone.getGroupCallStars) this.f$1).call.id) {
                    if (groupcallstars != null) {
                        int i19 = anonymousClass10.currentAccount;
                        MessagesController.getInstance(i19).putUsers(groupcallstars.users, false);
                        MessagesController.getInstance(i19).putChats(groupcallstars.chats, false);
                        int i20 = 0;
                        while (true) {
                            if (i20 < groupcallstars.top_donors.size()) {
                                if (groupcallstars.top_donors.get(i20).my) {
                                    z = groupcallstars.top_donors.get(i20).stars > 0;
                                } else {
                                    i20++;
                                }
                            }
                        }
                        long j = groupcallstars.total_stars;
                        char c2 = (j == anonymousClass10.totalStars && anonymousClass10.sentStars == z) ? (char) 0 : (char) 1;
                        anonymousClass10.totalStars = j;
                        anonymousClass10.topDonors = groupcallstars.top_donors;
                        anonymousClass10.sentStars = z;
                        if (c2 != 0) {
                            anonymousClass10.onStarsCountUpdated();
                        }
                        anonymousClass10.updateMessagesPlaces();
                    }
                    if (anonymousClass10.isAttachedToWindow()) {
                        LiveCommentsView$$ExternalSyntheticLambda2 liveCommentsView$$ExternalSyntheticLambda2 = anonymousClass10.pollStarsRunnable;
                        AndroidUtilities.cancelRunOnUIThread(liveCommentsView$$ExternalSyntheticLambda2);
                        AndroidUtilities.runOnUIThread(liveCommentsView$$ExternalSyntheticLambda2, 5000L);
                    }
                    break;
                }
                break;
            case 25:
                Vector vector = (Vector) obj;
                UserListPoller.AnonymousClass1 anonymousClass1 = (UserListPoller.AnonymousClass1) this.f$0;
                anonymousClass1.getClass();
                if (vector != null) {
                    ArrayList arrayList16 = new ArrayList();
                    ArrayList arrayList17 = new ArrayList();
                    int i21 = 0;
                    while (true) {
                        int size9 = vector.objects.size();
                        UserListPoller userListPoller = anonymousClass1.this$0;
                        if (i21 >= size9) {
                            MessagesStorage.getInstance(userListPoller.currentAccount).putUsersAndChats(arrayList16, arrayList17, true, true);
                            NotificationCenter.getInstance(userListPoller.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                        } else {
                            ArrayList arrayList18 = (ArrayList) this.f$1;
                            if (((Long) arrayList18.get(i21)).longValue() > 0) {
                                TLRPC.User user3 = MessagesController.getInstance(userListPoller.currentAccount).getUser((Long) arrayList18.get(i21));
                                if (user3 != null) {
                                    TLRPC.TL_recentStory tL_recentStory = (TLRPC.TL_recentStory) vector.objects.get(i21);
                                    user3.stories_max_id = tL_recentStory;
                                    if (tL_recentStory != null) {
                                        user3.flags2 |= 32;
                                    } else {
                                        user3.flags2 &= -33;
                                    }
                                    arrayList16.add(user3);
                                }
                            } else {
                                TLRPC.Chat chat7 = MessagesController.getInstance(userListPoller.currentAccount).getChat((Long) arrayList18.get(i21));
                                if (chat7 != null) {
                                    TLRPC.TL_recentStory tL_recentStory2 = (TLRPC.TL_recentStory) vector.objects.get(i21);
                                    chat7.stories_max_id = tL_recentStory2;
                                    if (tL_recentStory2 != null) {
                                        chat7.flags2 |= 16;
                                    } else {
                                        chat7.flags2 &= -17;
                                    }
                                    arrayList17.add(chat7);
                                }
                            }
                            i21++;
                        }
                    }
                }
                break;
            case 26:
                PaintView paintView = (PaintView) this.f$0;
                paintView.getClass();
                EntityView entityView = (EntityView) this.f$1;
                ((LocationView) entityView).setLocation(paintView.currentAccount, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                paintView.appearAnimation(entityView);
                break;
            case 27:
                ((Utilities.Callback3) this.f$0).run((Boolean) obj, (BiometricPrompt$AuthenticationResult) obj2, (BiometricPrompt$CryptoObject) this.f$1);
                break;
            default:
                String str3 = (String) obj;
                ArrayList arrayList19 = (ArrayList) obj2;
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.f$0;
                botWebViewContainer.getClass();
                if (!TextUtils.isEmpty(str3)) {
                    botWebViewContainer.notifyEvent("prepared_message_failed", BotWebViewContainer.obj(str3, "error"));
                } else {
                    botWebViewContainer.notifyEvent("prepared_message_sent", null);
                    BotWebViewContainer.Delegate delegate = botWebViewContainer.delegate;
                    if (delegate != null) {
                        delegate.onOpenBackFromTabs();
                    }
                    AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(18, (BotWebViewContainer.BotWebViewProxy) this.f$1, arrayList19), 500L);
                }
                break;
        }
    }
}
