package org.telegram.ui.Stories;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.StarAppsSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.Stars.StarReactionsOverlay;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stars.StarsReactionsSheet$$ExternalSyntheticLambda11;
import org.telegram.ui.Stars.StarsReactionsSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacySelector;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda5;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda6;

public final class LivePlayer$$ExternalSyntheticLambda17 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public LivePlayer$$ExternalSyntheticLambda17(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.TL_messageReactions tL_messageReactions2;
        ArrayList arrayList;
        BottomSheet bottomSheet;
        BaseFragment baseFragment;
        LivePlayer livePlayer;
        StoryRecorder.WindowView windowView;
        StoryViewer.VideoPlayerHolder videoPlayerHolder;
        int i = 7;
        ArrayList<TLRPC.MessageReactor> arrayList2 = null;
        str = null;
        String str = null;
        arrayList2 = null;
        arrayList2 = null;
        arrayList2 = null;
        int i2 = 1;
        switch (this.$r8$classId) {
            case 0:
                LivePlayer livePlayer2 = (LivePlayer) this.f$0;
                livePlayer2.getClass();
                ArrayList arrayList3 = (ArrayList) this.f$1;
                int size = arrayList3.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList3.get(i3);
                    i3++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    NotificationCenter.getInstance(livePlayer2.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                break;
            case 1:
                ((StarGiftSheet) this.f$0).getClass();
                BaseFragment baseFragmentCreate = StatisticActivity.create((TLRPC.Chat) this.f$1);
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    safeLastFragment.showAsSheet(baseFragmentCreate, bottomSheetParams);
                    break;
                }
                break;
            case 2:
                ((StarGiftSheet) this.f$0).getBulletinFactory().showForError((TLRPC.TL_error) this.f$1);
                break;
            case 3:
                ((StarGiftSheet) this.f$0).lambda$doUpgrade$124((TLObject) this.f$1);
                break;
            case 4:
                StarGiftSheet starGiftSheet = (StarGiftSheet) this.f$0;
                starGiftSheet.getClass();
                ((boolean[]) this.f$1)[0] = true;
                starGiftSheet.button.setLoading(false);
                starGiftSheet.doUpgrade();
                break;
            case 5:
                StarGiftSheet starGiftSheet2 = (StarGiftSheet) this.f$0;
                starGiftSheet2.getClass();
                BulletinFactory.of((ChatActivity) this.f$1).createSimpleBulletin(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(starGiftSheet2.dialogId))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new StarGiftSheet$$ExternalSyntheticLambda4(starGiftSheet2, 5)).show(true);
                break;
            case 6:
                BulletinFactory bulletinFactory = ((StarGiftSheet) this.f$0).getBulletinFactory();
                int i4 = R.raw.ic_delete;
                int i5 = R.string.GiftRemovedDescription;
                StringBuilder sb = new StringBuilder();
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f$1;
                sb.append(tL_starGiftUnique.title);
                sb.append(" #");
                sb.append(tL_starGiftUnique.num);
                bulletinFactory.createSimpleBulletin(i4, AndroidUtilities.replaceTags(LocaleController.formatString(i5, sb.toString()))).show();
                break;
            case 7:
                ((StarGiftSheet) this.f$0).showDeleteDescriptionAlert((CharSequence) this.f$1);
                break;
            case 8:
                ((StarGiftSheet) this.f$0).lambda$show$109((TL_stars.TL_payments_uniqueStarGift) this.f$1);
                break;
            case 9:
                ((AlertDialog) this.f$0).dismiss();
                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment2 != null) {
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$1;
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.UniqueGiftNotFound, BulletinFactory.of(safeLastFragment2), R.raw.error);
                    } else {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.UniqueGiftNotFoundBurned, BulletinFactory.of(safeLastFragment2), R.raw.fire_on);
                    }
                }
                break;
            case 10:
                StarReactionsOverlay starReactionsOverlay = (StarReactionsOverlay) this.f$0;
                BaseCell baseCell = starReactionsOverlay.cell;
                if (baseCell != null) {
                    try {
                        baseCell.performHapticFeedback(0);
                        break;
                    } catch (Exception unused) {
                    }
                    starReactionsOverlay.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    BaseCell baseCell2 = starReactionsOverlay.cell;
                    if (baseCell2 instanceof ChatMessageCell) {
                        messageObject = ((ChatMessageCell) baseCell2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.messageOwner;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList2 = tL_messageReactions2.top_reactors;
                            }
                        }
                    } else if ((baseCell2 instanceof ChatActionCell) && (messageObject = ((ChatActionCell) baseCell2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList2 = tL_messageReactions.top_reactors;
                        }
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList4 = arrayList2;
                    StarsController.PendingPaidReactions pendingPaidReactions = StarsController.getInstance(messageObject.currentAccount, false).currentPendingReactions;
                    if (pendingPaidReactions != null) {
                        pendingPaidReactions.close();
                    }
                    ChatActivity chatActivity = (ChatActivity) this.f$1;
                    TLRPC.ChatFull currentChatInfo = chatActivity.getCurrentChatInfo();
                    MessageObject messageObject2 = messageObject;
                    StarsReactionsSheet starsReactionsSheet = new StarsReactionsSheet(starReactionsOverlay.getContext(), chatActivity.getCurrentAccount(), chatActivity.getDialogId(), chatActivity, messageObject2, arrayList4, currentChatInfo == null || currentChatInfo.paid_reactions_available, false, 0L, chatActivity.getResourceProvider());
                    messageObject2.getId();
                    BaseCell baseCell3 = starReactionsOverlay.cell;
                    starsReactionsSheet.chatActivity = chatActivity;
                    starsReactionsSheet.messageCell = baseCell3;
                    starsReactionsSheet.show();
                    break;
                }
                break;
            case 11:
                TLObject tLObject = (TLObject) this.f$0;
                boolean z = tLObject instanceof TL_stars.StarGifts;
                DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6 = (DialogCell$$ExternalSyntheticLambda6) this.f$1;
                if (z) {
                    dialogCell$$ExternalSyntheticLambda6.run((TL_stars.StarGifts) tLObject);
                } else {
                    dialogCell$$ExternalSyntheticLambda6.run(null);
                }
                break;
            case 12:
                TLObject tLObject2 = (TLObject) this.f$0;
                boolean z2 = tLObject2 instanceof TL_account.paidMessagesRevenue;
                Utilities.Callback callback = (Utilities.Callback) this.f$1;
                if (z2) {
                    callback.run(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                } else {
                    callback.run(0L);
                }
                break;
            case 13:
                StarsController.GiftsList giftsList = (StarsController.GiftsList) this.f$0;
                giftsList.getClass();
                TLObject tLObject3 = (TLObject) this.f$1;
                if (tLObject3 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                    int i6 = giftsList.currentAccount;
                    MessagesController.getInstance(i6).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i6).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i7 = 0;
                        while (true) {
                            arrayList = giftsList.gifts;
                            if (i7 < arrayList.size() && ((TL_stars.SavedStarGift) arrayList.get(i7)).pinned_to_top) {
                                i7++;
                            }
                        }
                        arrayList.add(i7, savedStarGift);
                        NotificationCenter.getInstance(i6).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(giftsList.dialogId), giftsList);
                    }
                }
                break;
            case 14:
                ((MessagesController) this.f$0).processUpdates((TLRPC.Updates) ((TLObject) this.f$1), false);
                break;
            case 15:
                BulletinFactory.of(((BottomSheet[]) this.f$0)[0].topBulletinContainer, (Theme.ResourcesProvider) this.f$1).createSimpleBulletin(R.raw.copy, LocaleController.getString(R.string.StarsTransactionIDCopied)).show(false);
                break;
            case 16:
                StarAppsSheet starAppsSheet = new StarAppsSheet((Context) this.f$0);
                if (!AndroidUtilities.isTablet()) {
                    BottomSheet[] bottomSheetArr = (BottomSheet[]) this.f$1;
                    if (!AndroidUtilities.hasDialogOnTop(bottomSheetArr[0].attachedFragment) && (bottomSheet = bottomSheetArr[0]) != null && (baseFragment = bottomSheet.attachedFragment) != null) {
                        starAppsSheet.makeAttached(baseFragment);
                    }
                }
                starAppsSheet.show();
                break;
            case 17:
                ((Runnable) this.f$0).run();
                ((Runnable) this.f$1).run();
                break;
            case 18:
                StarsReactionsSheet starsReactionsSheet2 = (StarsReactionsSheet) this.f$0;
                starsReactionsSheet2.sending = true;
                starsReactionsSheet2.animate3dIcon(new StarsReactionsSheet$$ExternalSyntheticLambda13((StarsController.PendingPaidReactions) this.f$1, 0));
                AndroidUtilities.runOnUIThread(new StarsReactionsSheet$$ExternalSyntheticLambda11(starsReactionsSheet2, 1), 240L);
                break;
            case 19:
                ((StoryViewer) this.f$0).presentFragment(ProfileActivity.of(((LiveCommentsView.Message) this.f$1).dialogId));
                break;
            case 20:
                PeerStoriesView.AnonymousClass10 anonymousClass10 = (PeerStoriesView.AnonymousClass10) this.f$0;
                AndroidUtilities.addToClipboard(((LiveCommentsView.LiveCommentView) this.f$1).text);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(anonymousClass10.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                }
                break;
            case 21:
                PeerStoriesView.AnonymousClass10 anonymousClass11 = (PeerStoriesView.AnonymousClass10) this.f$0;
                LiveCommentsView.Message message3 = (LiveCommentsView.Message) this.f$1;
                long j = message3.dialogId;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass11.this$0;
                if (j != UserConfig.getInstance(anonymousClass1.currentAccount).getClientUserId() && ((livePlayer = anonymousClass11.val$storyViewer.livePlayer) == null || j != DialogObject.getPeerDialogId(livePlayer.getDefaultSendAs()))) {
                    if (anonymousClass1.sendAsPeersObj != null) {
                        for (int i8 = 0; i8 < anonymousClass1.sendAsPeersObj.peers.size(); i8++) {
                            if (j != DialogObject.getPeerDialogId(anonymousClass1.sendAsPeersObj.peers.get(i8).peer)) {
                            }
                        }
                    }
                    Context context = anonymousClass11.getContext();
                    long j2 = message3.dialogId;
                    BotBiometry$$ExternalSyntheticLambda6 botBiometry$$ExternalSyntheticLambda6 = new BotBiometry$$ExternalSyntheticLambda6(i2, anonymousClass11, message3);
                    LiveCommentsView.AnonymousClass8 anonymousClass8 = new LiveCommentsView.AnonymousClass8();
                    BottomSheet bottomSheet2 = new BottomSheet(context, false, false, anonymousClass8);
                    bottomSheet2.fixNavigationBar();
                    LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
                    TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 20.0f);
                    textViewM.setTextColor(anonymousClass8.getColor(Theme.key_dialogTextBlack));
                    textViewM.setTypeface(AndroidUtilities.bold());
                    textViewM.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    linearLayoutM.addView(textViewM, LayoutHelper.createLinear(-1, -2, 22.0f, 12.0f, 22.0f, 0.0f));
                    HeaderCell headerCell = new HeaderCell(context, anonymousClass8);
                    headerCell.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    linearLayoutM.addView(headerCell, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 4.0f));
                    final CheckBoxCell checkBoxCell = new CheckBoxCell(context, 4, 21, true, anonymousClass8);
                    CheckBox2 checkBoxRound = checkBoxCell.getCheckBoxRound();
                    int i9 = Theme.key_switch2TrackChecked;
                    int i10 = Theme.key_radioBackground;
                    int i11 = Theme.key_checkboxCheck;
                    checkBoxRound.setColor(i9, i10, i11);
                    checkBoxCell.setText(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    final Object[] objArr = null == true ? 1 : 0;
                    checkBoxCell.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (objArr) {
                                case 0:
                                    CheckBoxCell checkBoxCell2 = checkBoxCell;
                                    checkBoxCell2.setChecked(!checkBoxCell2.isChecked(), true);
                                    break;
                                case 1:
                                    CheckBoxCell checkBoxCell3 = checkBoxCell;
                                    checkBoxCell3.setChecked(!checkBoxCell3.isChecked(), true);
                                    break;
                                default:
                                    CheckBoxCell checkBoxCell4 = checkBoxCell;
                                    checkBoxCell4.setChecked(!checkBoxCell4.isChecked(), true);
                                    break;
                            }
                        }
                    });
                    int i12 = Theme.key_listSelector;
                    checkBoxCell.setBackground(Theme.createSelectorDrawable(anonymousClass8.getColor(i12), 2, -1));
                    linearLayoutM.addView(checkBoxCell, LayoutHelper.createLinear(-1, -2));
                    final CheckBoxCell checkBoxCell2 = new CheckBoxCell(context, 4, 21, true, anonymousClass8);
                    checkBoxCell2.getCheckBoxRound().setColor(i9, i10, i11);
                    final int i13 = 1;
                    checkBoxCell2.setText(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j2)), null, false, true, false);
                    checkBoxCell2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    CheckBoxCell checkBoxCell3 = checkBoxCell2;
                                    checkBoxCell3.setChecked(!checkBoxCell3.isChecked(), true);
                                    break;
                                case 1:
                                    CheckBoxCell checkBoxCell4 = checkBoxCell2;
                                    checkBoxCell4.setChecked(!checkBoxCell4.isChecked(), true);
                                    break;
                                default:
                                    CheckBoxCell checkBoxCell5 = checkBoxCell2;
                                    checkBoxCell5.setChecked(!checkBoxCell5.isChecked(), true);
                                    break;
                            }
                        }
                    });
                    checkBoxCell2.setBackground(Theme.createSelectorDrawable(anonymousClass8.getColor(i12), 2, -1));
                    linearLayoutM.addView(checkBoxCell2, LayoutHelper.createLinear(-1, -2));
                    final CheckBoxCell checkBoxCell3 = new CheckBoxCell(context, 4, 21, true, anonymousClass8);
                    checkBoxCell3.getCheckBoxRound().setColor(i9, i10, i11);
                    checkBoxCell3.setText(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j2)), null, false, false, false);
                    final int i14 = 2;
                    checkBoxCell3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i14) {
                                case 0:
                                    CheckBoxCell checkBoxCell4 = checkBoxCell3;
                                    checkBoxCell4.setChecked(!checkBoxCell4.isChecked(), true);
                                    break;
                                case 1:
                                    CheckBoxCell checkBoxCell5 = checkBoxCell3;
                                    checkBoxCell5.setChecked(!checkBoxCell5.isChecked(), true);
                                    break;
                                default:
                                    CheckBoxCell checkBoxCell6 = checkBoxCell3;
                                    checkBoxCell6.setChecked(!checkBoxCell6.isChecked(), true);
                                    break;
                            }
                        }
                    });
                    checkBoxCell3.setBackground(Theme.createSelectorDrawable(anonymousClass8.getColor(i12), 2, -1));
                    linearLayoutM.addView(checkBoxCell3, LayoutHelper.createLinear(-1, -2));
                    TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, anonymousClass8);
                    textInfoPrivacyCell.setBackgroundColor(-16777216);
                    textInfoPrivacyCell.setFixedSize(12);
                    linearLayoutM.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, anonymousClass8);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.DeleteProceedBtn), false);
                    buttonWithCounterView.setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda18(checkBoxCell, checkBoxCell2, checkBoxCell3, botBiometry$$ExternalSyntheticLambda6, bottomSheet2, 1));
                    frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
                    bottomSheet2.setCustomView(linearLayoutM);
                    bottomSheet2.show();
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = anonymousClass11.inputCall;
                deletegroupcallmessages.messages.add(Integer.valueOf(message3.id));
                ConnectionsManager.getInstance(anonymousClass11.currentAccount).sendRequest(deletegroupcallmessages, null);
                anonymousClass11.delete(message3.id);
                break;
            case 22:
                ((LivePlayer) this.f$0).currentStreamRequestTimestamp.remove((String) this.f$1);
                break;
            case 23:
                PeerStoriesView peerStoriesView = (PeerStoriesView) this.f$0;
                HintView2 hintView2 = (HintView2) this.f$1;
                peerStoriesView.removeView(hintView2);
                if (peerStoriesView.highlightMessageHintView == hintView2) {
                    peerStoriesView.highlightMessageHintView = null;
                }
                break;
            case 24:
                PeerStoriesView peerStoriesView2 = (PeerStoriesView) this.f$0;
                StoryRecorder storyRecorder = StoryRecorder.getInstance((Activity) this.f$1, peerStoriesView2.currentAccount);
                PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = peerStoriesView2.playerSharedScope;
                long j3 = (videoPlayerSharedScope == null || (videoPlayerHolder = videoPlayerSharedScope.player) == null) ? 0L : videoPlayerHolder.currentPosition;
                File path = peerStoriesView2.currentStory.getPath();
                TL_stories.StoryItem storyItem = peerStoriesView2.currentStory.storyItem;
                StoryEntry storyEntry = new StoryEntry();
                storyEntry.isRepost = true;
                storyEntry.repostMedia = storyItem.media;
                storyEntry.repostPeer = MessagesController.getInstance(storyEntry.currentAccount).getPeer(storyItem.dialogId);
                storyEntry.repostStoryId = storyItem.id;
                storyEntry.repostCaption = storyItem.caption;
                storyEntry.file = path;
                storyEntry.fileDeletable = false;
                storyEntry.width = 720;
                storyEntry.height = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    storyEntry.isVideo = false;
                    if (path != null) {
                        storyEntry.decodeBounds(path.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    storyEntry.isVideo = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        for (int i15 = 0; i15 < storyItem.media.document.attributes.size(); i15++) {
                            TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i15);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                storyEntry.width = documentAttribute.w;
                                storyEntry.height = documentAttribute.h;
                                storyEntry.fileDuration = documentAttribute.duration;
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str2 = storyItem.firstFramePath;
                        if (str2 != null) {
                            storyEntry.thumbPath = str2;
                        } else if (document2.thumbs != null) {
                            for (int i16 = 0; i16 < storyItem.media.document.thumbs.size(); i16++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i16);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    storyEntry.thumbPathBitmap = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(storyEntry.currentAccount).getPathToAttach(photoSize, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        storyEntry.thumbPath = pathToAttach.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                storyEntry.setupMatrix();
                storyEntry.checkStickers(storyItem);
                StoryRecorder.SourceView.AnonymousClass2 anonymousClass2FromStoryViewer = StoryRecorder.SourceView.fromStoryViewer(peerStoriesView2.storyViewer);
                if (!storyRecorder.isShown) {
                    int i17 = storyRecorder.currentAccount;
                    if (MessagesController.getInstance(i17).isFrozen()) {
                        AccountFrozenAlert.show(i17);
                    } else {
                        storyRecorder.isReposting = false;
                        storyRecorder.prepareClosing = false;
                        storyRecorder.forceBackgroundVisible = false;
                        WindowManager windowManager = storyRecorder.windowManager;
                        if (windowManager != null && (windowView = storyRecorder.windowView) != null && windowView.getParent() == null) {
                            StoryRecorder.WindowView windowView2 = storyRecorder.windowView;
                            WindowManager.LayoutParams layoutParams = storyRecorder.windowLayoutParams;
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, windowView2, layoutParams);
                            windowManager.addView(storyRecorder.windowView, layoutParams);
                            storyRecorder.setupBackDispatcher();
                        }
                        storyRecorder.outputEntry = storyEntry;
                        StoryPrivacySelector.applySaved(i17, storyEntry);
                        StoryEntry storyEntry2 = storyRecorder.outputEntry;
                        storyRecorder.mode = (storyEntry2 == null || !storyEntry2.isVideo) ? 0 : 1;
                        storyRecorder.videoTextureHolder.active = false;
                        RectF rectF = storyRecorder.fromRect;
                        if (anonymousClass2FromStoryViewer != null) {
                            storyRecorder.fromSourceView = anonymousClass2FromStoryViewer;
                            storyRecorder.openType = anonymousClass2FromStoryViewer.type;
                            rectF.set(anonymousClass2FromStoryViewer.screenRect);
                            storyRecorder.fromRounding = anonymousClass2FromStoryViewer.rounding;
                            storyRecorder.fromSourceView.hide();
                        } else {
                            storyRecorder.openType = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            storyRecorder.fromRounding = AndroidUtilities.dp(8.0f);
                        }
                        storyRecorder.containerView.updateBackground();
                        StoryRecorder.AnonymousClass3 anonymousClass3 = storyRecorder.previewContainer;
                        int i18 = storyRecorder.openType;
                        anonymousClass3.setBackgroundColor((i18 == 1 || i18 == 0) ? 0 : -14737633);
                        storyRecorder.containerView.setTranslationX(0.0f);
                        storyRecorder.containerView.setTranslationY(0.0f);
                        storyRecorder.containerView.setTranslationY2(0.0f);
                        storyRecorder.containerView.setScaleX(1.0f);
                        storyRecorder.containerView.setScaleY(1.0f);
                        storyRecorder.dismissProgress = 0.0f;
                        AndroidUtilities.lockOrientation(storyRecorder.activity, 1);
                        StoryEntry storyEntry3 = storyRecorder.outputEntry;
                        if (storyEntry3 != null) {
                            storyRecorder.captionEdit.setText(storyEntry3.caption);
                        }
                        storyRecorder.navigateToPreviewWithPlayerAwait(j3, new StoryRecorder$$ExternalSyntheticLambda5(storyRecorder, 7));
                        storyRecorder.previewButtons.appear(true, false);
                        storyRecorder.navigateTo(1, false);
                        storyRecorder.switchToEditMode(-1, false, false);
                        storyRecorder.addNotificationObservers();
                        storyRecorder.botId = 0L;
                        storyRecorder.botLang = "";
                    }
                }
                storyRecorder.onFullyOpenListener = new PeerStoriesView$$ExternalSyntheticLambda3(peerStoriesView2, i);
                storyRecorder.onClosePrepareListener = new PeerStoriesView$$ExternalSyntheticLambda56(null == true ? 1 : 0, peerStoriesView2, storyRecorder);
                break;
            case 25:
                StoryViewer.this.showDialog(new PremiumFeatureBottomSheet(((StoryViewer) this.f$1).fragment, 14, false));
                break;
            case 26:
                SelfStoryViewsPage.AnonymousClass5 anonymousClass5 = (SelfStoryViewsPage.AnonymousClass5) this.f$0;
                anonymousClass5.runnable = null;
                SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass2 = anonymousClass5.this$0;
                anonymousClass2.isSearchDebounce = false;
                anonymousClass2.state.searchQuery = ((String) this.f$1).toLowerCase();
                SelfStoryViewsPage.access$600(anonymousClass2);
                break;
            case 27:
                PeerStoriesView$38$$ExternalSyntheticLambda1 peerStoriesView$38$$ExternalSyntheticLambda1 = (PeerStoriesView$38$$ExternalSyntheticLambda1) this.f$0;
                if (peerStoriesView$38$$ExternalSyntheticLambda1 != null) {
                    peerStoriesView$38$$ExternalSyntheticLambda1.run(Boolean.valueOf(((TLRPC.TL_error) this.f$1) == null));
                }
                break;
            case 28:
                StoriesController.SearchStoriesList searchStoriesList = (StoriesController.SearchStoriesList) this.f$0;
                searchStoriesList.reqId = 0;
                TLObject tLObject4 = (TLObject) this.f$1;
                if (tLObject4 instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject4;
                    int i19 = searchStoriesList.currentAccount;
                    MessagesController.getInstance(i19).putUsers(tL_foundStories.users, false);
                    MessagesController.getInstance(i19).putChats(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList5 = tL_foundStories.stories;
                    int size2 = arrayList5.size();
                    int i20 = 0;
                    while (true) {
                        ArrayList arrayList6 = searchStoriesList.messageObjects;
                        if (i20 >= size2) {
                            searchStoriesList.count = Math.max(arrayList6.size(), tL_foundStories.count);
                            if (tL_foundStories.stories.isEmpty()) {
                                searchStoriesList.count = arrayList6.size();
                            }
                            if (arrayList6.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                                str = tL_foundStories.next_offset;
                            }
                            searchStoriesList.last_offset = str;
                            searchStoriesList.loading = false;
                            StoriesController$StoriesList$$ExternalSyntheticLambda1 storiesController$StoriesList$$ExternalSyntheticLambda1 = searchStoriesList.notify;
                            AndroidUtilities.cancelRunOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda1);
                            AndroidUtilities.runOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda1);
                        } else {
                            TL_stories.TL_foundStory tL_foundStory = arrayList5.get(i20);
                            i20++;
                            TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                            tL_foundStory2.storyItem.dialogId = DialogObject.getPeerDialogId(tL_foundStory2.peer);
                            tL_foundStory2.storyItem.messageId = arrayList6.size();
                            MessageObject messageObject3 = new MessageObject(i19, tL_foundStory2.storyItem);
                            messageObject3.generateThumbs(false);
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.add(Integer.valueOf(arrayList6.size()));
                            searchStoriesList.fakeDays.add(arrayList7);
                            arrayList6.add(messageObject3);
                        }
                    }
                }
                break;
            default:
                StoriesController.StoriesCollections storiesCollections = (StoriesController.StoriesCollections) this.f$0;
                ArrayList arrayList8 = storiesCollections.collections;
                arrayList8.clear();
                arrayList8.addAll((List) this.f$1);
                storiesCollections.loadedCache = true;
                storiesCollections.loading = false;
                storiesCollections.load();
                NotificationCenter.getInstance(storiesCollections.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(storiesCollections.dialogId), storiesCollections);
                break;
        }
    }
}
