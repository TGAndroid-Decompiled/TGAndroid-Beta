package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda17;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftLinkBottomSheet;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.Premium.boosts.adapters.GiftInfoAdapter;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda87;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda6;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.PreviewView$$ExternalSyntheticLambda12;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda6;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda5;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;
import org.telegram.ui.iv.ChatAttachAlertRichLayout;
import org.telegram.ui.iv.RichCaptionController;
import org.telegram.ui.iv.RichCommandSuggestions$MenuFactory;
import org.telegram.ui.iv.RichEditText;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda48;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichInlineButtonEditor;
import org.telegram.ui.iv.RichTableCell;
import org.telegram.ui.iv.RichTableCellHost;
import org.telegram.ui.iv.TableModel;
import org.telegram.ui.web.BookmarksFragment;

public final class RateCallLayout$$ExternalSyntheticLambda1 implements AlertDialog.OnButtonClickListener, PaymentFormActivity.PaymentFormCallback, DialogsActivity.DialogsActivityDelegate, SelectAnimatedEmojiDialog.BackgroundDelegate, ViewPositionWatcher.OnChangedListener, StarGiftSheet.BoughtGiftCallback, Utilities.Callback5, RecyclerListView.OnItemClickListenerExtended, TwoStepVerificationActivity.TwoStepVerificationActivityDelegate, StoryPrivacyBottomSheet.DoneCallback, RecyclerListView.OnItemLongClickListener, RichCommandSuggestions$MenuFactory, EditTextCaption.EditTextCaptionDelegate, RichInlineButtonEditor.UserPicked {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public RateCallLayout$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public boolean canSelectStories() {
        switch (this.$r8$classId) {
            case 6:
                break;
        }
        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
    }

    @Override
    public void didEnterPassword(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
        switch (this.$r8$classId) {
            case 16:
                ((BotStarsActivity) this.f$0).initWithdraw(false, 0L, inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f$1);
                break;
            default:
                ((StarGiftSheet) this.f$0).initTONTransfer(inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f$1);
                break;
        }
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        switch (this.$r8$classId) {
            case 6:
                PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet = (PremiumPreviewGiftLinkBottomSheet) this.f$0;
                premiumPreviewGiftLinkBottomSheet.getClass();
                long j = 0;
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    long j2 = ((MessagesStorage.TopicKey) arrayList.get(i3)).dialogId;
                    premiumPreviewGiftLinkBottomSheet.getBaseFragment().getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f$1, j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i3++;
                    j = j2;
                }
                dialogsActivity.finishFragment();
                BoostDialogs.showGiftLinkForwardedBulletin(j);
                break;
            default:
                GiftInfoAdapter giftInfoAdapter = (GiftInfoAdapter) this.f$0;
                giftInfoAdapter.getClass();
                long j3 = 0;
                int i4 = 0;
                while (i4 < arrayList.size()) {
                    long j4 = ((MessagesStorage.TopicKey) arrayList.get(i4)).dialogId;
                    giftInfoAdapter.baseFragment.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f$1, j4, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i4++;
                    j3 = j4;
                }
                dialogsActivity.finishFragment();
                BoostDialogs.showGiftLinkForwardedBulletin(j3);
                break;
        }
        return true;
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        int i = this.$r8$classId;
        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity);
    }

    @Override
    public void done(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.InputPeer inputPeer, int i, ButtonWithCounterView$$ExternalSyntheticLambda1 buttonWithCounterView$$ExternalSyntheticLambda1, PreviewView$$ExternalSyntheticLambda12 previewView$$ExternalSyntheticLambda12) {
        switch (this.$r8$classId) {
            case 19:
                PeerStoriesView peerStoriesView = (PeerStoriesView) this.f$0;
                peerStoriesView.getClass();
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                MessagesController messagesController = MessagesController.getInstance(peerStoriesView.currentAccount);
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f$1;
                tL_stories_editStory.peer = messagesController.getInputPeer(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = storyPrivacy.rules;
                ConnectionsManager.getInstance(peerStoriesView.currentAccount).sendRequest(tL_stories_editStory, new GiftSheet$$ExternalSyntheticLambda16(8, peerStoriesView, buttonWithCounterView$$ExternalSyntheticLambda1, storyItem, storyPrivacy));
                break;
            default:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass8.this$0;
                PeerStoriesView.StoryItemHolder storyItemHolder = anonymousClass1.currentStory;
                TL_stories.StoryItem storyItem2 = storyItemHolder.storyItem;
                if ((storyItem2 != null && storyItem2.pinned) != z3) {
                    MessagesController.getInstance(anonymousClass1.currentAccount).getStoriesController().updateStoriesPinned(anonymousClass1.dialogId, anonymousClass1.storyItems, z3, null);
                }
                TL_stories.StoryItem storyItem3 = storyItemHolder.storyItem;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i);
                        ConnectionsManager.getInstance(anonymousClass1.currentAccount).sendRequest(togglegroupcallsettings, new StarGiftSheet$$ExternalSyntheticLambda0(24, anonymousClass8, (StoryPrivacyBottomSheet) this.f$1));
                    }
                }
                break;
        }
    }

    @Override
    public void drawRect(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2) {
        CustomEmojiReactionsWindow customEmojiReactionsWindow = (CustomEmojiReactionsWindow) this.f$0;
        customEmojiReactionsWindow.getClass();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(i, i2, i3, i4);
        ReactionsContainerLayout.ReactionsContainerDelegate delegate = ((ReactionsContainerLayout) this.f$1).getDelegate();
        CustomEmojiReactionsWindow.ContainerView containerView = customEmojiReactionsWindow.containerView;
        delegate.drawRoundRect(canvas, rectF, 0.0f, containerView.getX() + f, (customEmojiReactionsWindow.type == 1 ? containerView.getY() - AndroidUtilities.statusBarHeight : containerView.getY() + customEmojiReactionsWindow.windowView.getY()) + f2, 255, true);
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        int i2 = this.$r8$classId;
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public ItemOptions make(RichEditText richEditText) {
        ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(chatAttachAlertRichLayout, (Theme.ResourcesProvider) this.f$1, richEditText, false, false, true);
        chatAttachAlertRichLayout.menu = itemOptionsMakeOptions;
        return itemOptionsMakeOptions;
    }

    @Override
    public void onBoughtGift(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, boolean z) {
        ProfileGiftsContainer.Page page = (ProfileGiftsContainer.Page) this.f$0;
        page.list.gifts.remove((TL_stars.SavedStarGift) this.f$1);
        page.update(true);
        int i = page.currentAccount;
        long clientUserId = UserConfig.getInstance(i).getClientUserId();
        ProfileGiftsContainer profileGiftsContainer = page.parent;
        if (j == clientUserId) {
            BulletinFactory bulletinFactoryOf = BulletinFactory.of(profileGiftsContainer.fragment);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i2 = R.string.BoughtResoldGiftText;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            bulletinFactoryOf.createSimpleBulletin(document, string, LocaleController.formatString(i2, BillingController$$ExternalSyntheticOutline0.m(tL_starGiftUnique.num, ',', sb))).hideAfterBottomSheet(false).show();
        } else {
            BulletinFactory.of(profileGiftsContainer.fragment).createSimpleBulletin(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i, j))).hideAfterBottomSheet(false).show();
        }
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null) {
            launchActivity.getFireworksOverlay().start(true);
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                ((LimitReachedBottomSheet) this.f$0).lambda$revokeLinks$25((ArrayList) this.f$1, alertDialog, i);
                break;
            case 2:
                ((AtomicBoolean) this.f$0).set(true);
                ((SelectorBottomSheet$$ExternalSyntheticLambda0) this.f$1).run();
                break;
            case 3:
                ((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$0).run((TLRPC.TL_premiumGiftCodeOption) this.f$1);
                break;
            case 10:
                Activity activity = (Activity) this.f$0;
                Intent intent = new Intent(activity, (Class<?>) LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f$1));
                activity.startActivity(intent);
                break;
            case 11:
                AuctionBidSheet auctionBidSheet = (AuctionBidSheet) this.f$0;
                auctionBidSheet.getClass();
                AuctionBidSheet.AnonymousClass4 anonymousClass4 = (AuctionBidSheet.AnonymousClass4) this.f$1;
                try {
                    int i2 = Integer.parseInt(anonymousClass4.getText().toString().trim());
                    auctionBidSheet.sendBid(i2);
                    auctionBidSheet.slider.setValue(i2);
                    alertDialog.dismiss();
                } catch (Throwable th) {
                    AndroidUtilities.shakeView(anonymousClass4);
                    FileLog.e(th);
                    return;
                }
                break;
            case 12:
                ProfileGiftsContainer.lambda$openEnterNameAlert$15((ProfileGiftsContainer.AnonymousClass5) this.f$0, (Utilities.Callback) this.f$1, alertDialog, i);
                break;
            case 17:
                StarGiftSheet starGiftSheet = (StarGiftSheet) this.f$0;
                starGiftSheet.getClass();
                Browser.Progress progressMakeButtonLoading = alertDialog.makeButtonLoading(i, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                twoStepVerificationActivity.setDelegate(2, new RateCallLayout$$ExternalSyntheticLambda1(18, starGiftSheet, twoStepVerificationActivity));
                twoStepVerificationActivity.setDelegateString(starGiftSheet.getGiftName());
                progressMakeButtonLoading.init();
                twoStepVerificationActivity.preload(new Theme$$ExternalSyntheticLambda17(22, starGiftSheet, (UserSelectorBottomSheet[]) this.f$1, progressMakeButtonLoading, twoStepVerificationActivity));
                break;
            case 21:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
                LivePlayer livePlayer = ((StoryViewer) this.f$1).livePlayer;
                if (livePlayer == null) {
                    anonymousClass8.this$0.deleteStory();
                    break;
                } else if (!livePlayer.destroyed) {
                    TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                    discardgroupcall.call = livePlayer.inputCall;
                    ConnectionsManager.getInstance(livePlayer.currentAccount).sendRequest(discardgroupcall, new LivePlayer$$ExternalSyntheticLambda6(livePlayer, 5));
                    livePlayer.destroy();
                    break;
                }
                break;
            case 23:
                ((ChannelAffiliateProgramsFragment) this.f$0).lambda$createView$6((TL_payments.connectedBotStarRef) this.f$1);
                break;
            default:
                ((BookmarksFragment) this.f$0).lambda$deleteSelectedMessages$0((HashSet) this.f$1);
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        int i2 = this.$r8$classId;
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
        switch (this.$r8$classId) {
            case 4:
                if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PAID) {
                    ((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$0).run(null);
                } else if (invoiceStatus != PaymentFormActivity.InvoiceStatus.PENDING) {
                    ((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$1).run(null);
                }
                break;
            default:
                if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PAID) {
                    ((Utilities.Callback) this.f$0).run(null);
                } else if (invoiceStatus != PaymentFormActivity.InvoiceStatus.PENDING) {
                    ((Utilities.Callback) this.f$1).run(null);
                }
                break;
        }
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        switch (this.$r8$classId) {
            case 15:
                ((ResaleGiftsFragment.SelectGiftSheet) this.f$0).lambda$new$22((ResaleGiftsFragment.SelectGiftSheet.State) this.f$1, i);
                break;
            default:
                final StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) this.f$0;
                if (i < 0) {
                    page.getClass();
                    break;
                } else {
                    ArrayList arrayList2 = page.items;
                    if (i < arrayList2.size()) {
                        StoryPrivacyBottomSheet.ItemInner itemInner = (StoryPrivacyBottomSheet.ItemInner) arrayList2.get(i);
                        int i2 = itemInner.viewType;
                        int i3 = 0;
                        StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                        if (i2 == 3) {
                            if (itemInner.sendAs && storyPrivacyBottomSheet.canChangePeer) {
                                new StoryPrivacyBottomSheet.ChoosePeerSheet((Context) this.f$1, ((BottomSheet) storyPrivacyBottomSheet).currentAccount, storyPrivacyBottomSheet.isLive, storyPrivacyBottomSheet.selectedPeer, new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda6(page, 1), ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider).show();
                            } else {
                                int i4 = itemInner.type;
                                if (i4 == 1) {
                                    if (storyPrivacyBottomSheet.selectedType == 1 || StoryPrivacyBottomSheet.access$6500(storyPrivacyBottomSheet).isEmpty()) {
                                        storyPrivacyBottomSheet.activePage = 1;
                                        storyPrivacyBottomSheet.viewPager.scrollToPosition(1);
                                    }
                                    storyPrivacyBottomSheet.selectedType = 1;
                                    page.updateCheckboxes$1(true);
                                } else if (i4 == 3) {
                                    if (storyPrivacyBottomSheet.selectedType == 3 || (storyPrivacyBottomSheet.selectedContacts.isEmpty() && storyPrivacyBottomSheet.selectedContactsByGroup.isEmpty())) {
                                        storyPrivacyBottomSheet.activePage = 3;
                                        storyPrivacyBottomSheet.viewPager.scrollToPosition(1);
                                    }
                                    storyPrivacyBottomSheet.selectedType = 3;
                                    page.updateCheckboxes$1(true);
                                } else if (i4 == 2) {
                                    if (storyPrivacyBottomSheet.selectedType == 2) {
                                        storyPrivacyBottomSheet.activePage = 2;
                                        storyPrivacyBottomSheet.viewPager.scrollToPosition(1);
                                    }
                                    storyPrivacyBottomSheet.selectedType = 2;
                                    page.updateCheckboxes$1(true);
                                } else if (i4 != 4) {
                                    ArrayList arrayList3 = page.selectedUsers;
                                    HashMap map = page.selectedUsersByGroup;
                                    StoryPrivacyBottomSheet.Page.AnonymousClass1 anonymousClass1 = page.searchField;
                                    if (i4 > 0) {
                                        arrayList3.clear();
                                        map.clear();
                                        storyPrivacyBottomSheet.selectedType = itemInner.type;
                                        anonymousClass1.spansContainer.removeAllSpans();
                                    } else {
                                        TLRPC.Chat chat = itemInner.chat;
                                        LongSparseArray longSparseArray = page.changelog;
                                        if (chat != null) {
                                            long j = chat.id;
                                            if (StoryPrivacyBottomSheet.access$9900(storyPrivacyBottomSheet, chat) > 200) {
                                                try {
                                                    page.performHapticFeedback(3, 1);
                                                    break;
                                                } catch (Throwable unused) {
                                                }
                                                ChatActivity$$ExternalSyntheticOutline0.m(R.string.OK, new AlertDialog.Builder(page.getContext(), 0, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider).setTitle(LocaleController.getString(R.string.GroupTooLarge)).setMessage(LocaleController.getString(R.string.GroupTooLargeMessage)), null);
                                            } else if (map.containsKey(Long.valueOf(j))) {
                                                ArrayList arrayList4 = (ArrayList) map.get(Long.valueOf(j));
                                                if (arrayList4 != null) {
                                                    int size = arrayList4.size();
                                                    while (i3 < size) {
                                                        Object obj = arrayList4.get(i3);
                                                        i3++;
                                                        longSparseArray.put(Boolean.FALSE, ((Long) obj).longValue());
                                                    }
                                                }
                                                map.remove(Long.valueOf(j));
                                                page.updateSpans(true);
                                            } else {
                                                TLRPC.Chat chat2 = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount).getChat(Long.valueOf(j));
                                                TLRPC.ChatFull chatFull = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount).getChatFull(j);
                                                if (chatFull == null || (chatParticipants = chatFull.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || chatFull.participants.participants.size() < chatFull.participants_count - 1) {
                                                    AlertDialog alertDialog = page.progressDialog;
                                                    if (alertDialog != null) {
                                                        alertDialog.dismiss();
                                                        page.progressDialog = null;
                                                    }
                                                    page.waitingForChatId = j;
                                                    AlertDialog alertDialog2 = new AlertDialog(page.getContext(), 3, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider);
                                                    page.progressDialog = alertDialog2;
                                                    AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog2.showRunnable;
                                                    AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                                                    AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 50L);
                                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount);
                                                    messagesStorage.getStorageQueue().postRunnable(new StarsController$$ExternalSyntheticLambda87(page, chat2, messagesStorage, j));
                                                } else {
                                                    page.selectChat(j, chatFull.participants);
                                                }
                                                if (!TextUtils.isEmpty(page.query)) {
                                                    anonymousClass1.setText("");
                                                    page.query = null;
                                                    page.updateItems(false, true);
                                                }
                                            }
                                        } else {
                                            TLRPC.User user = itemInner.user;
                                            if (user != null) {
                                                if (page.pageType == 0) {
                                                    storyPrivacyBottomSheet.selectedType = 0;
                                                }
                                                long j2 = user.id;
                                                HashSet hashSet = new HashSet(arrayList3);
                                                if (arrayList3.contains(Long.valueOf(j2))) {
                                                    Iterator it = map.entrySet().iterator();
                                                    while (it.hasNext()) {
                                                        Map.Entry entry = (Map.Entry) it.next();
                                                        if (((ArrayList) entry.getValue()).contains(Long.valueOf(j2))) {
                                                            it.remove();
                                                            hashSet.addAll((Collection) entry.getValue());
                                                        }
                                                    }
                                                    hashSet.remove(Long.valueOf(j2));
                                                    longSparseArray.put(Boolean.FALSE, j2);
                                                } else {
                                                    Iterator it2 = map.entrySet().iterator();
                                                    while (it2.hasNext()) {
                                                        Map.Entry entry2 = (Map.Entry) it2.next();
                                                        if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j2))) {
                                                            it2.remove();
                                                            hashSet.addAll((Collection) entry2.getValue());
                                                        }
                                                    }
                                                    hashSet.add(Long.valueOf(j2));
                                                    if (!TextUtils.isEmpty(page.query)) {
                                                        anonymousClass1.setText("");
                                                        page.query = null;
                                                        page.updateItems(false, true);
                                                    }
                                                    longSparseArray.put(Boolean.TRUE, j2);
                                                }
                                                arrayList3.clear();
                                                arrayList3.addAll(hashSet);
                                                page.updateSpans(true);
                                            }
                                        }
                                    }
                                    page.updateCheckboxes$1(true);
                                    page.updateButton(true);
                                    anonymousClass1.scroll = true;
                                } else {
                                    if (storyPrivacyBottomSheet.selectedType == 4) {
                                        storyPrivacyBottomSheet.activePage = 4;
                                        storyPrivacyBottomSheet.viewPager.scrollToPosition(1);
                                    }
                                    storyPrivacyBottomSheet.selectedType = 4;
                                    page.updateCheckboxes$1(true);
                                }
                            }
                            break;
                        } else if (i2 != 7) {
                            if (i2 == 9) {
                                int i5 = itemInner.id;
                                if (i5 == 0) {
                                    StoryRecorder$$ExternalSyntheticLambda5 storyRecorder$$ExternalSyntheticLambda5 = storyPrivacyBottomSheet.whenCoverClicked;
                                    if (storyRecorder$$ExternalSyntheticLambda5 != null) {
                                        storyRecorder$$ExternalSyntheticLambda5.run();
                                    }
                                } else if (i5 == 1) {
                                    TLRPC.InputPeer inputPeer = storyPrivacyBottomSheet.selectedPeer;
                                    long peerDialogId = inputPeer != null ? DialogObject.getPeerDialogId(inputPeer) : UserConfig.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount).getClientUserId();
                                    ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(page, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider, view);
                                    itemOptionsMakeOptions.add(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new RichEditor$$ExternalSyntheticLambda48(page, peerDialogId, 17));
                                    itemOptionsMakeOptions.addGap();
                                    ItemOptions.addAlbumsItemOptions(itemOptionsMakeOptions, storyPrivacyBottomSheet.getStoriesController().getStoryAlbumsList(peerDialogId, true), storyPrivacyBottomSheet.selectedAlbums, false, null, new GiftSheet$$ExternalSyntheticLambda4(20, page, itemOptionsMakeOptions));
                                    itemOptionsMakeOptions.show();
                                } else if (i5 == 5) {
                                    final AlertDialog alertDialog3 = new AlertDialog(page.getContext(), 3, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider);
                                    AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda2 = alertDialog3.showRunnable;
                                    AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda2);
                                    AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda2, 500L);
                                    final TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                                    getgroupcallstreamrtmpurl.live_story = true;
                                    TLRPC.InputPeer tL_inputPeerSelf = storyPrivacyBottomSheet.selectedPeer;
                                    if (tL_inputPeerSelf == null) {
                                        tL_inputPeerSelf = new TLRPC.TL_inputPeerSelf();
                                    }
                                    getgroupcallstreamrtmpurl.peer = tL_inputPeerSelf;
                                    ConnectionsManager.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount).sendRequest(getgroupcallstreamrtmpurl, new RequestDelegate() {
                                        @Override
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            StoryPrivacyBottomSheet.Page page2 = page;
                                            page2.getClass();
                                            AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16(page2, alertDialog3, tLObject, getgroupcallstreamrtmpurl, tL_error));
                                        }
                                    });
                                } else if (i5 == 6) {
                                    storyPrivacyBottomSheet.isRtmpStream = false;
                                    page.updateItems(true, true);
                                }
                            }
                            break;
                        } else if (view instanceof TextCell) {
                            TextCell textCell = (TextCell) view;
                            textCell.setChecked(!textCell.isChecked());
                            itemInner.checked = textCell.isChecked();
                            int i6 = itemInner.resId;
                            if (i6 == 0) {
                                boolean zIsChecked = textCell.isChecked();
                                storyPrivacyBottomSheet.allowScreenshots = zIsChecked;
                                i3 = storyPrivacyBottomSheet.selectedType == 4 ? 1 : 0;
                                if (!zIsChecked) {
                                    BulletinFactory.of(storyPrivacyBottomSheet.container, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider).createSimpleBulletin(R.raw.passcode_lock_close, LocaleController.getString(i3 != 0 ? R.string.StoryDisabledScreenshotsShare : R.string.StoryDisabledScreenshots), 4).setDuration(5000).show(true);
                                } else {
                                    BulletinFactory.of(storyPrivacyBottomSheet.container, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider).createSimpleBulletin(R.raw.ic_save_to_gallery, LocaleController.getString(i3 != 0 ? R.string.StoryEnabledScreenshotsShare : R.string.StoryEnabledScreenshots), 4).setDuration(5000).show(true);
                                }
                            } else if (i6 == 1) {
                                boolean zIsChecked2 = textCell.isChecked();
                                storyPrivacyBottomSheet.keepOnMyPage = zIsChecked2;
                                boolean z = storyPrivacyBottomSheet.selectedPeer instanceof TLRPC.TL_inputPeerChannel;
                                if (zIsChecked2) {
                                    BulletinFactory.of(storyPrivacyBottomSheet.container, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider).createSimpleBulletin(R.raw.msg_story_keep, LocaleController.getString(z ? R.string.StoryChannelEnableKeep : R.string.StoryEnableKeep), 4).setDuration(5000).show(true);
                                } else {
                                    BulletinFactory.of(storyPrivacyBottomSheet.container, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider).createSimpleBulletin(R.raw.fire_on, LocaleController.getString(z ? R.string.StoryChannelDisableKeep : R.string.StoryDisableKeep), 4).setDuration(5000).show(true);
                                }
                                page.updateItems(true, true);
                            } else if (i6 == 2) {
                                storyPrivacyBottomSheet.allowComments = textCell.isChecked();
                                page.updateItems(true, true);
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override
    public void onPositionChanged(View view, RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.top;
        BlurredBackgroundDrawable blurredBackgroundDrawable = (BlurredBackgroundDrawable) this.f$0;
        if (blurredBackgroundDrawable.sourceOffsetX != f || blurredBackgroundDrawable.sourceOffsetY != f2) {
            blurredBackgroundDrawable.sourceOffsetX = f;
            blurredBackgroundDrawable.sourceOffsetY = f2;
            blurredBackgroundDrawable.onSourceOffsetChange();
        }
        ((View) this.f$1).invalidate();
    }

    @Override
    public void onSpansChanged() {
        switch (this.$r8$classId) {
            case 26:
                ((RichCaptionController) this.f$0).persist();
                ((RichCaptionController.Host) this.f$1).onCaptionSpansChanged();
                break;
            default:
                RichTableCell richTableCell = (RichTableCell) this.f$0;
                richTableCell.getClass();
                RichTableCellHost richTableCellHost = (RichTableCellHost) this.f$1;
                TL_iv.pageTableCell pagetablecell = richTableCellHost.cell;
                if (pagetablecell != null) {
                    TableModel.applyStyledText(pagetablecell, richTableCellHost.editText.getText());
                }
                RichEditorListView.AnonymousClass12 anonymousClass12 = richTableCell.delegate;
                if (anonymousClass12 != null && richTableCell.currentRow != null) {
                    RichEditorListView.access$3700(RichEditorListView.this);
                    break;
                }
                break;
        }
    }

    @Override
    public void run(long j) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j;
        ((RichEditorListView.BlockButtonEdit) this.f$0).apply((String) this.f$1, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ProfileGiftsContainer.UnpinSheet unpinSheet = (ProfileGiftsContainer.UnpinSheet) this.f$0;
        unpinSheet.getClass();
        long j = ((TL_stars.SavedStarGift) ((UItem) obj).object).gift.id;
        if (unpinSheet.selectedGift == j) {
            unpinSheet.selectedGift = 0L;
        } else {
            unpinSheet.selectedGift = j;
        }
        ((ButtonWithCounterView) this.f$1).setEnabled(unpinSheet.selectedGift != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof PeerColorActivity.GiftCell) {
                    PeerColorActivity.GiftCell giftCell = (PeerColorActivity.GiftCell) childAt;
                    giftCell.setSelected(unpinSheet.selectedGift == giftCell.getGiftId(), true);
                }
            }
        }
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return ((ChannelAffiliateProgramsFragment) this.f$0).lambda$createView$8((Context) this.f$1, view, i);
    }
}
