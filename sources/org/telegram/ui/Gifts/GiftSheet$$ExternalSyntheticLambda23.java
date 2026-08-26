package org.telegram.ui.Gifts;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda33;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda54;
import org.telegram.ui.ChannelColorActivity;
import org.telegram.ui.ChannelCreateActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda218;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier;
import org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet;
import org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftLinkBottomSheet;
import org.telegram.ui.Components.Premium.boosts.ReassignBoostBottomSheet;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.IntroActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda13;
import org.telegram.ui.LinkManager$3$$ExternalSyntheticLambda0;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda14;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.bots.BotStorage;
import org.telegram.ui.web.BotWebViewContainer;

public final class GiftSheet$$ExternalSyntheticLambda23 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public GiftSheet$$ExternalSyntheticLambda23(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void run(Object obj) {
        char c;
        String string;
        ActionBarPopupWindow actionBarPopupWindow;
        int i = 14;
        String str = "";
        int i2 = 0;
        Object obj2 = this.f$3;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        Object obj5 = this.f$2;
        switch (this.$r8$classId) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                GiftSheet giftSheet = (GiftSheet) obj4;
                giftSheet.getClass();
                ((Browser.Progress) obj3).end();
                Utilities.Callback callback = (Utilities.Callback) obj5;
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                giftSheet.lambda$showGiftOfferSheet$15();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda13(7, (GiftSheet.AnonymousClass8) obj2, tL_error));
                } else {
                    giftSheet.lambda$showGiftOfferSheet$15();
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                Runnable[] runnableArr = (Runnable[]) obj4;
                AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) obj3;
                ValueAnimator valueAnimator = valueAnimatorArr[0];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                TextView textView = (TextView) obj5;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(textView.getAlpha(), bool.booleanValue() ? 1.0f : 0.0f);
                valueAnimatorArr[0] = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(2, textView, (TextView) obj2));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    AndroidUtilities.runOnUIThread(runnableArr[0], 5320L);
                }
                break;
            case 2:
                ChannelColorActivity channelColorActivity = (ChannelColorActivity) obj4;
                channelColorActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(channelColorActivity, (boolean[]) obj3, (int[]) obj5, (int[]) obj2, (TLRPC.TL_error) obj, 9));
                break;
            case 3:
                final TLRPC.User user = (TLRPC.User) obj;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                chatActivityEnterView.getClass();
                if (user != null) {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                    MessageObject messageObject = (MessageObject) obj3;
                    tL_messages_sendBotRequestedPeer.peer = MessagesController.getInstance(chatActivityEnterView.currentAccount).getInputPeer(messageObject.messageOwner.peer_id);
                    tL_messages_sendBotRequestedPeer.flags |= 1;
                    tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
                    tL_messages_sendBotRequestedPeer.button_id = ((TL_keyboard.TL_buttonTypeRequestPeer) obj5).button_id;
                    tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInputPeer(user));
                    ConnectionsManager.getInstance(chatActivityEnterView.currentAccount).sendRequest(tL_messages_sendBotRequestedPeer, null);
                    final TLRPC.User user2 = (TLRPC.User) obj2;
                    final long j = user2.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    ChatActivity chatActivity = new ChatActivity(bundle) {
                        public boolean shownToast;
                        public final TLRPC.User val$bot;
                        public final long val$managerId;
                        public final TLRPC.User val$newBot;

                        public AnonymousClass77(Bundle bundle2) {
                            super(bundle2);
                            user = user;
                            user = user2;
                            j = j;
                        }

                        @Override
                        public final void onBecomeFullyVisible() {
                            super.onBecomeFullyVisible();
                            if (this.shownToast) {
                                return;
                            }
                            this.shownToast = true;
                            BulletinFactory.of(this).createSimpleBulletin(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(user)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(user)), new LinkManager$3$$ExternalSyntheticLambda0(this, j, 11)), R.raw.contact_check).show();
                        }
                    };
                    ChatActivity chatActivity2 = chatActivityEnterView.parentFragment;
                    if (chatActivity2 != null) {
                        chatActivity2.presentFragment(chatActivity);
                    }
                }
                break;
            case 4:
                ((ChatAttachAlertLocationLayout) obj4).lambda$new$6((ChatActivity) obj3, (TLRPC.TL_messageMediaGeo) obj5, (Theme.ResourcesProvider) obj2, (Long) obj);
                break;
            case 5:
                ((ChatAttachAlertLocationLayout) obj4).lambda$new$8((ChatActivity) obj3, (TLRPC.TL_messageMediaVenue) obj5, (Theme.ResourcesProvider) obj2);
                break;
            case 6:
                Long l = (Long) obj;
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = (ChatAttachAlertPollLayout) obj4;
                chatAttachAlertPollLayout.getClass();
                ChatActivity chatActivity3 = (ChatActivity) obj3;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj5;
                ArrayList arrayList = (ArrayList) obj2;
                if (chatActivity3.isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(chatActivity3.getParentActivity(), chatActivity3.getDialogId(), new ArticleViewer$$ExternalSyntheticLambda54(chatAttachAlertPollLayout, tL_messageMediaPoll, arrayList, l, 7));
                } else {
                    chatAttachAlertPollLayout.delegate.sendPoll(tL_messageMediaPoll, chatAttachAlertPollLayout.descriptionString, chatAttachAlertPollLayout.attachedMedia, arrayList, true, 0, l.longValue());
                    chatAttachAlertPollLayout.parentAlert.dismiss(true);
                }
                break;
            case 7:
                ArrayList arrayList2 = (ArrayList) obj;
                EmojiView.EmojiSearchAdapter emojiSearchAdapter = (EmojiView.EmojiSearchAdapter) obj4;
                if (((String) obj3).equals(emojiSearchAdapter.lastSearchEmojiString)) {
                    AnimatedEmojiDrawable.getDocumentFetcher(EmojiView.this.currentAccount).putDocuments(arrayList2);
                    int size = arrayList2.size();
                    while (i2 < size) {
                        Object obj6 = arrayList2.get(i2);
                        i2++;
                        MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                        keywordResult.emoji = "animated_" + ((TLRPC.Document) obj6).id;
                        keywordResult.keyword = null;
                        ((ArrayList) obj5).add(keywordResult);
                    }
                    ((Runnable) obj2).run();
                    break;
                }
                break;
            case 8:
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj4).get()) {
                    BaseFragment baseFragment = (BaseFragment) obj5;
                    if (baseFragment.getParentActivity() != null) {
                        String str2 = (String) obj2;
                        if (tL_payments_checkedGiftCode.from_id == null) {
                            TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                            tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                            TLRPC.User currentUser = baseFragment instanceof ChatActivity ? ((ChatActivity) baseFragment).getCurrentUser() : null;
                            if (currentUser == null || currentUser.self) {
                                currentUser = new TLRPC.TL_user();
                            }
                            TLRPC.User user3 = currentUser;
                            boolean z = tL_payments_checkedGiftCode.used_date != 0;
                            BaseFragment lastFragment = LaunchActivity.getLastFragment();
                            if (lastFragment != null && PremiumPreviewGiftLinkBottomSheet.instance == null) {
                                PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet = new PremiumPreviewGiftLinkBottomSheet(lastFragment, UserConfig.selectedAccount, user3, new GiftPremiumBottomSheet$GiftTier(tL_premiumGiftOption), str2, z, lastFragment.getResourceProvider());
                                premiumPreviewGiftLinkBottomSheet.show();
                                PremiumPreviewGiftLinkBottomSheet.instance = premiumPreviewGiftLinkBottomSheet;
                            }
                        } else {
                            baseFragment.showDialog(new GiftInfoBottomSheet(baseFragment, tL_payments_checkedGiftCode, str2));
                        }
                        Browser.Progress progress = (Browser.Progress) obj3;
                        if (progress != null) {
                            progress.end();
                        }
                        break;
                    }
                }
                break;
            case 9:
                ((ReassignBoostBottomSheet) obj4).lambda$new$1((TLRPC.Chat) obj3, (ArrayList) obj5, (HashSet) obj2, (TL_stories.TL_premium_myBoosts) obj);
                break;
            case 10:
                ((SharedMediaLayout) obj4).lambda$onItemLongClick$55((HashSet) obj3, (TL_stories.StoryItem) obj5, (ItemOptions) obj2, (StoriesController.StoryAlbum) obj);
                break;
            case 11:
                DialogsActivity dialogsActivity = (DialogsActivity) obj4;
                dialogsActivity.showSendToBotAlert(dialogsActivity.getMessagesController().getChat((Long) obj3), (Runnable) obj, new IntroActivity$$ExternalSyntheticLambda5(dialogsActivity, (ChannelCreateActivity) obj5, (BaseFragment) obj2, i));
                break;
            case 12:
                Runnable runnable = (Runnable) obj;
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = (SelectAnimatedEmojiDialog) obj4;
                int i3 = selectAnimatedEmojiDialog.currentAccount;
                if (ConnectionsManager.getInstance(i3).getConnectionState() != 3) {
                    runnable.run();
                } else {
                    String[] strArr = (String[]) obj3;
                    if (strArr != null && strArr.length != 0) {
                        str = strArr[0];
                    }
                    MediaDataController.getInstance(i3).searchStickers(true, str, (String) obj5, new ArticleViewer$$ExternalSyntheticLambda33(selectAnimatedEmojiDialog, (LinkedHashSet) obj2, runnable, 15));
                }
                break;
            case 13:
                Runnable runnable2 = (Runnable) obj;
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = (SelectAnimatedEmojiDialog) obj4;
                if (selectAnimatedEmojiDialog2.type != 4) {
                    runnable2.run();
                    break;
                } else {
                    ArrayList arrayList3 = new ArrayList(0);
                    LongSparseArray longSparseArray = new LongSparseArray(0);
                    int i4 = selectAnimatedEmojiDialog2.currentAccount;
                    HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(i4).getAllStickers();
                    String str3 = (String) obj3;
                    ArrayList arrayList4 = (ArrayList) obj5;
                    if (str3.length() <= 14) {
                        int length = str3.length();
                        CharSequence charSequenceConcat = str3;
                        int i5 = 0;
                        while (i5 < length) {
                            if (i5 < length - 1) {
                                if (charSequenceConcat.charAt(i5) == 55356) {
                                    int i6 = i5 + 1;
                                    c = 1;
                                    if (charSequenceConcat.charAt(i6) < 57339 || charSequenceConcat.charAt(i6) > 57343) {
                                    }
                                    CharSequence charSequenceSubSequence = charSequenceConcat.subSequence(0, i5);
                                    CharSequence charSequenceSubSequence2 = charSequenceConcat.subSequence(i5 + 2, charSequenceConcat.length());
                                    CharSequence[] charSequenceArr = new CharSequence[2];
                                    charSequenceArr[0] = charSequenceSubSequence;
                                    charSequenceArr[c] = charSequenceSubSequence2;
                                    charSequenceConcat = TextUtils.concat(charSequenceArr);
                                    length -= 2;
                                    i5--;
                                    i5++;
                                } else {
                                    c = 1;
                                }
                                if (charSequenceConcat.charAt(i5) == 8205) {
                                    int i7 = i5 + 1;
                                    if (charSequenceConcat.charAt(i7) == 9792 || charSequenceConcat.charAt(i7) == 9794) {
                                        CharSequence charSequenceSubSequence3 = charSequenceConcat.subSequence(0, i5);
                                        CharSequence charSequenceSubSequence4 = charSequenceConcat.subSequence(i5 + 2, charSequenceConcat.length());
                                        CharSequence[] charSequenceArr2 = new CharSequence[2];
                                        charSequenceArr2[0] = charSequenceSubSequence3;
                                        charSequenceArr2[c] = charSequenceSubSequence4;
                                        charSequenceConcat = TextUtils.concat(charSequenceArr2);
                                        length -= 2;
                                    }
                                    i5--;
                                    i5++;
                                }
                            } else {
                                c = 1;
                            }
                            if (charSequenceConcat.charAt(i5) == 65039) {
                                CharSequence charSequenceSubSequence5 = charSequenceConcat.subSequence(0, i5);
                                CharSequence charSequenceSubSequence6 = charSequenceConcat.subSequence(i5 + 1, charSequenceConcat.length());
                                CharSequence[] charSequenceArr3 = new CharSequence[2];
                                charSequenceArr3[0] = charSequenceSubSequence5;
                                charSequenceArr3[c] = charSequenceSubSequence6;
                                charSequenceConcat = TextUtils.concat(charSequenceArr3);
                                length--;
                                i5--;
                            }
                            i5++;
                        }
                        ArrayList<TLRPC.Document> arrayList5 = allStickers != null ? allStickers.get(charSequenceConcat.toString()) : null;
                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                            arrayList3.addAll(arrayList5);
                            int size2 = arrayList5.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                TLRPC.Document document = arrayList5.get(i8);
                                longSparseArray.put(document.id, document);
                            }
                            arrayList4.add(arrayList3);
                        }
                    }
                    if (allStickers != null && !allStickers.isEmpty() && str3.length() > 1) {
                        MediaDataController.getInstance(i4).getEmojiSuggestions(SelectAnimatedEmojiDialog.lastSearchKeyboardLanguage, str3, false, new ArticleViewer$$ExternalSyntheticLambda54(allStickers, (HashMap) obj2, arrayList4, runnable2, 15), false);
                        break;
                    }
                }
                break;
            case 14:
                Long l2 = (Long) obj;
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj3;
                SendMessagesHelper.getInstance(peerStoriesView.currentAccount).sendSticker(tL_document, (String) obj5, peerStoriesView.dialogId, null, null, peerStoriesView.currentStory.storyItem, null, null, true, 0, 0, false, this.f$3, null, l2.longValue(), peerStoriesView.chatActivityEnterView.getSendMonoForumPeerId(), peerStoriesView.chatActivityEnterView.getSendMessageSuggestionParams());
                peerStoriesView.chatActivityEnterView.addStickerToRecent(tL_document);
                peerStoriesView.chatActivityEnterView.setFieldText("");
                peerStoriesView.afterMessageSend(l2.longValue() <= 0);
                break;
            case 15:
                StoriesController.StoryAlbum storyAlbum = (StoriesController.StoryAlbum) obj;
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) obj4;
                anonymousClass8.getClass();
                boolean zContains = ((HashSet) obj3).contains(Integer.valueOf(storyAlbum.album_id));
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass8.this$0;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj5;
                if (zContains) {
                    StoriesController storiesController = anonymousClass1.storiesController;
                    long j2 = anonymousClass1.dialogId;
                    int i9 = storyAlbum.album_id;
                    storiesController.getClass();
                    ArrayList arrayList6 = new ArrayList(1);
                    arrayList6.add(storyItem);
                    storiesController.addStoriesToAlbum(i9, j2, arrayList6);
                    string = LocaleController.formatString(R.string.StoryAddedToAlbumX, storyAlbum.title);
                } else {
                    StoriesController storiesController2 = anonymousClass1.storiesController;
                    long j3 = anonymousClass1.dialogId;
                    int i10 = storyAlbum.album_id;
                    storiesController2.getClass();
                    ArrayList arrayList7 = new ArrayList(1);
                    arrayList7.add(storyItem);
                    storiesController2.removeStoriesFromAlbum(i10, j3, arrayList7);
                    string = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, storyAlbum.title);
                }
                new BulletinFactory(anonymousClass1.storyContainer, (DarkThemeResourceProvider) obj2).createSimpleBulletinWithIconSize(R.raw.contact_check, 36, AndroidUtilities.replaceTags(string)).show();
                PeerStoriesView.AnonymousClass8 anonymousClass9 = anonymousClass1.popupMenu;
                if (anonymousClass9 != null && (actionBarPopupWindow = anonymousClass9.popupWindow) != null) {
                    actionBarPopupWindow.dismiss(true);
                    break;
                }
                break;
            default:
                BotStorage botStorage = (BotStorage) obj5;
                String str4 = (String) obj2;
                String str5 = (String) obj;
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) obj4;
                botWebViewContainer.getClass();
                String str6 = (String) obj3;
                if (str5 == null) {
                    botWebViewContainer.notifyEvent("secure_storage_failed", BotWebViewContainer.obj("req_id", str6, "error", "RESTORE_CANCELLED"));
                } else {
                    try {
                        botStorage.restoreFrom(str5);
                        botWebViewContainer.notifyEvent("secure_storage_key_restored", BotWebViewContainer.obj("req_id", str6, "value", (String) botStorage.getKey(str4).first));
                    } catch (Exception e) {
                        botWebViewContainer.notifyEvent("secure_storage_failed", BotWebViewContainer.obj("req_id", str6, "error", e.getMessage()));
                    }
                }
                break;
        }
    }

    public GiftSheet$$ExternalSyntheticLambda23(AtomicBoolean atomicBoolean, BaseFragment baseFragment, String str, Browser.Progress progress) {
        this.$r8$classId = 8;
        this.f$0 = atomicBoolean;
        this.f$2 = baseFragment;
        this.f$3 = str;
        this.f$1 = progress;
    }
}
