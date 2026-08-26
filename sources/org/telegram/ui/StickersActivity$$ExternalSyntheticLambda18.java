package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
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
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.StickerSetCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.Stars.StarReactionsOverlay;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stars.StarsReactionsSheet$$ExternalSyntheticLambda11;
import org.telegram.ui.Stars.StarsReactionsSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.LiveCommentsView$$ExternalSyntheticLambda25;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda3;
import org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda51;
import org.telegram.ui.Stories.PeerStoriesView$38$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.SelfStoryViewsPage;
import org.telegram.ui.Stories.SelfStoryViewsView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacySelector;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda7;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda8;

public final class StickersActivity$$ExternalSyntheticLambda18 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public StickersActivity$$ExternalSyntheticLambda18(int i, Object obj, Object obj2) {
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
        char c = 1;
        int i2 = 0;
        switch (this.$r8$classId) {
            case 0:
                ((StickersActivity) this.f$0).toggleSelected((StickerSetCell) this.f$1);
                break;
            case 1:
                ((StarGiftSheet) this.f$0).lambda$doUpgrade$124((TLObject) this.f$1);
                break;
            case 2:
                StarGiftSheet starGiftSheet = (StarGiftSheet) this.f$0;
                starGiftSheet.getClass();
                ((boolean[]) this.f$1)[0] = true;
                starGiftSheet.button.setLoading(false);
                starGiftSheet.doUpgrade();
                break;
            case 3:
                BulletinFactory bulletinFactory = ((StarGiftSheet) this.f$0).getBulletinFactory();
                int i3 = R.raw.ic_delete;
                int i4 = R.string.GiftRemovedDescription;
                StringBuilder sb = new StringBuilder();
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f$1;
                sb.append(tL_starGiftUnique.title);
                sb.append(" #");
                sb.append(tL_starGiftUnique.num);
                bulletinFactory.createSimpleBulletinWithIconSize(i3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i4, sb.toString()))).show();
                break;
            case 4:
                StarGiftSheet starGiftSheet2 = (StarGiftSheet) this.f$0;
                starGiftSheet2.getClass();
                BulletinFactory.of((ChatActivity) this.f$1).createSimpleBulletin(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(starGiftSheet2.dialogId))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new StarGiftSheet$$ExternalSyntheticLambda3(starGiftSheet2, 0)).show(true);
                break;
            case 5:
                ((StarGiftSheet) this.f$0).showDeleteDescriptionAlert((CharSequence) this.f$1);
                break;
            case 6:
                ((StarGiftSheet) this.f$0).lambda$show$109((TL_stars.TL_payments_uniqueStarGift) this.f$1);
                break;
            case 7:
                ((AlertDialog) this.f$0).dismiss();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$1;
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.UniqueGiftNotFound, BulletinFactory.of(safeLastFragment), R.raw.error, 36);
                    } else {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.UniqueGiftNotFoundBurned, BulletinFactory.of(safeLastFragment), R.raw.fire_on, 36);
                    }
                }
                break;
            case 8:
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
                    ArrayList<TLRPC.MessageReactor> arrayList3 = arrayList2;
                    StarsController.PendingPaidReactions pendingPaidReactions = StarsController.getInstance(messageObject.currentAccount, false).currentPendingReactions;
                    if (pendingPaidReactions != null) {
                        pendingPaidReactions.close();
                    }
                    ChatActivity chatActivity = (ChatActivity) this.f$1;
                    TLRPC.ChatFull chatFull = chatActivity.chatInfo;
                    MessageObject messageObject2 = messageObject;
                    StarsReactionsSheet starsReactionsSheet = new StarsReactionsSheet(starReactionsOverlay.getContext(), chatActivity.getCurrentAccount(), chatActivity.getDialogId(), chatActivity, messageObject2, arrayList3, chatFull == null || chatFull.paid_reactions_available, false, 0L, chatActivity.getResourceProvider());
                    messageObject2.getId();
                    BaseCell baseCell3 = starReactionsOverlay.cell;
                    starsReactionsSheet.chatActivity = chatActivity;
                    starsReactionsSheet.messageCell = baseCell3;
                    starsReactionsSheet.show();
                    break;
                }
                break;
            case 9:
                TLObject tLObject = (TLObject) this.f$0;
                boolean z = tLObject instanceof TL_stars.StarGifts;
                VoIPFragment$$ExternalSyntheticLambda7 voIPFragment$$ExternalSyntheticLambda7 = (VoIPFragment$$ExternalSyntheticLambda7) this.f$1;
                if (z) {
                    voIPFragment$$ExternalSyntheticLambda7.run((TL_stars.StarGifts) tLObject);
                } else {
                    voIPFragment$$ExternalSyntheticLambda7.run(null);
                }
                break;
            case 10:
                StarsController.GiftsList giftsList = (StarsController.GiftsList) this.f$0;
                giftsList.getClass();
                TLObject tLObject2 = (TLObject) this.f$1;
                if (tLObject2 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject2;
                    int i5 = giftsList.currentAccount;
                    MessagesController.getInstance(i5).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i5).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i6 = 0;
                        while (true) {
                            arrayList = giftsList.gifts;
                            if (i6 < arrayList.size() && ((TL_stars.SavedStarGift) arrayList.get(i6)).pinned_to_top) {
                                i6++;
                            }
                        }
                        arrayList.add(i6, savedStarGift);
                        NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(giftsList.dialogId), giftsList);
                    }
                }
                break;
            case 11:
                ((MessagesController) this.f$0).processUpdates((TLRPC.Updates) ((TLObject) this.f$1), false);
                break;
            case 12:
                new BulletinFactory(((BottomSheet[]) this.f$0)[0].topBulletinContainer, (Theme.ResourcesProvider) this.f$1).createSimpleBulletinWithIconSize(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).show(false);
                break;
            case 13:
                ((Runnable) this.f$0).run();
                ((Runnable) this.f$1).run();
                break;
            case 14:
                StarsReactionsSheet starsReactionsSheet2 = (StarsReactionsSheet) this.f$0;
                starsReactionsSheet2.sending = true;
                starsReactionsSheet2.animate3dIcon(new StarsReactionsSheet$$ExternalSyntheticLambda13((StarsController.PendingPaidReactions) this.f$1, 0));
                AndroidUtilities.runOnUIThread(new StarsReactionsSheet$$ExternalSyntheticLambda11(starsReactionsSheet2, 1), 240L);
                break;
            case 15:
                ((StoryViewer) this.f$0).presentFragment(ProfileActivity.of(((LiveCommentsView.Message) this.f$1).dialogId));
                break;
            case 16:
                PeerStoriesView.AnonymousClass10 anonymousClass10 = (PeerStoriesView.AnonymousClass10) this.f$0;
                AndroidUtilities.addToClipboard(((LiveCommentsView.LiveCommentView) this.f$1).text);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(anonymousClass10.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                }
                break;
            case 17:
                PeerStoriesView.AnonymousClass10 anonymousClass11 = (PeerStoriesView.AnonymousClass10) this.f$0;
                LiveCommentsView.Message message3 = (LiveCommentsView.Message) this.f$1;
                long j = message3.dialogId;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass11.this$0;
                if (j != UserConfig.getInstance(anonymousClass1.currentAccount).getClientUserId() && ((livePlayer = anonymousClass11.val$storyViewer.livePlayer) == null || j != DialogObject.getPeerDialogId(livePlayer.getDefaultSendAs()))) {
                    if (anonymousClass1.sendAsPeersObj != null) {
                        for (int i7 = 0; i7 < anonymousClass1.sendAsPeersObj.peers.size(); i7++) {
                            if (j != DialogObject.getPeerDialogId(anonymousClass1.sendAsPeersObj.peers.get(i7).peer)) {
                            }
                        }
                    }
                    Context context = anonymousClass11.getContext();
                    long j2 = message3.dialogId;
                    BotBiometry$$ExternalSyntheticLambda8 botBiometry$$ExternalSyntheticLambda8 = new BotBiometry$$ExternalSyntheticLambda8(c == true ? 1 : 0, anonymousClass11, message3);
                    LiveCommentsView.AnonymousClass8 anonymousClass8 = new LiveCommentsView.AnonymousClass8();
                    BottomSheet bottomSheet = new BottomSheet(context, anonymousClass8, false, false);
                    bottomSheet.fixNavigationBar();
                    LinearLayout linearLayoutM = zzkf.m(context, 1);
                    TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 20.0f);
                    textViewM.setTextColor(anonymousClass8.getColor(Theme.key_dialogTextBlack));
                    textViewM.setTypeface(AndroidUtilities.bold());
                    textViewM.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    linearLayoutM.addView(textViewM, LayoutHelper.createLinear(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    HeaderCell headerCell = new HeaderCell(context, anonymousClass8);
                    headerCell.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    linearLayoutM.addView(headerCell, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    CheckBoxCell checkBoxCell = new CheckBoxCell(context, 4, 21, true, anonymousClass8);
                    CheckBox2 checkBoxRound = checkBoxCell.getCheckBoxRound();
                    int i8 = Theme.key_switch2TrackChecked;
                    int i9 = Theme.key_radioBackground;
                    int i10 = Theme.key_checkboxCheck;
                    checkBoxRound.checkBoxBase.setColor(i8, i9, i10);
                    checkBoxCell.setText(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    checkBoxCell.setOnClickListener(new LiveCommentsView$$ExternalSyntheticLambda25(checkBoxCell, 0));
                    int i11 = Theme.key_listSelector;
                    checkBoxCell.setBackground(Theme.createSelectorDrawable(anonymousClass8.getColor(i11), 2, -1));
                    linearLayoutM.addView(checkBoxCell, LayoutHelper.createLinear(-1, -2));
                    CheckBoxCell checkBoxCell2 = new CheckBoxCell(context, 4, 21, true, anonymousClass8);
                    checkBoxCell2.getCheckBoxRound().checkBoxBase.setColor(i8, i9, i10);
                    checkBoxCell2.setText(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j2)), null, false, true, false);
                    checkBoxCell2.setOnClickListener(new LiveCommentsView$$ExternalSyntheticLambda25(checkBoxCell2, 2));
                    checkBoxCell2.setBackground(Theme.createSelectorDrawable(anonymousClass8.getColor(i11), 2, -1));
                    linearLayoutM.addView(checkBoxCell2, LayoutHelper.createLinear(-1, -2));
                    CheckBoxCell checkBoxCell3 = new CheckBoxCell(context, 4, 21, true, anonymousClass8);
                    checkBoxCell3.getCheckBoxRound().checkBoxBase.setColor(i8, i9, i10);
                    checkBoxCell3.setText(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j2)), null, false, false, false);
                    checkBoxCell3.setOnClickListener(new LiveCommentsView$$ExternalSyntheticLambda25(checkBoxCell3, 3));
                    checkBoxCell3.setBackground(Theme.createSelectorDrawable(anonymousClass8.getColor(i11), 2, -1));
                    linearLayoutM.addView(checkBoxCell3, LayoutHelper.createLinear(-1, -2));
                    TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, anonymousClass8);
                    textInfoPrivacyCell.setBackgroundColor(-16777216);
                    textInfoPrivacyCell.setFixedSize(12);
                    linearLayoutM.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, anonymousClass8, true);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    buttonWithCounterView.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda6((Object) checkBoxCell, (Object) checkBoxCell2, (Object) checkBoxCell3, (Object) botBiometry$$ExternalSyntheticLambda8, bottomSheet, 11));
                    frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
                    bottomSheet.setCustomView(linearLayoutM);
                    bottomSheet.show();
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = anonymousClass11.inputCall;
                deletegroupcallmessages.messages.add(Integer.valueOf(message3.id));
                ConnectionsManager.getInstance(anonymousClass11.currentAccount).sendRequest(deletegroupcallmessages, null);
                anonymousClass11.delete(message3.id);
                break;
            case 18:
                LivePlayer livePlayer2 = (LivePlayer) this.f$0;
                livePlayer2.getClass();
                ArrayList arrayList4 = (ArrayList) this.f$1;
                int size = arrayList4.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList4.get(i12);
                    i12++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    NotificationCenter.getInstance(livePlayer2.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                break;
            case 19:
                ((LivePlayer) this.f$0).currentStreamRequestTimestamp.remove((String) this.f$1);
                break;
            case 20:
                PeerStoriesView peerStoriesView = (PeerStoriesView) this.f$0;
                HintView2 hintView2 = (HintView2) this.f$1;
                peerStoriesView.removeView(hintView2);
                if (peerStoriesView.highlightMessageHintView == hintView2) {
                    peerStoriesView.highlightMessageHintView = null;
                }
                break;
            case 21:
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
                        for (int i13 = 0; i13 < storyItem.media.document.attributes.size(); i13++) {
                            TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i13);
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
                            for (int i14 = 0; i14 < storyItem.media.document.thumbs.size(); i14++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i14);
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
                StoryRecorder.SourceView.AnonymousClass1 anonymousClass1FromStoryViewer = StoryRecorder.SourceView.fromStoryViewer(peerStoriesView2.storyViewer);
                if (!storyRecorder.isShown) {
                    int i15 = storyRecorder.currentAccount;
                    if (MessagesController.getInstance(i15).isFrozen()) {
                        AccountFrozenAlert.show(i15);
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
                        StoryPrivacySelector.applySaved(i15, storyEntry);
                        StoryEntry storyEntry2 = storyRecorder.outputEntry;
                        storyRecorder.mode = (storyEntry2 == null || !storyEntry2.isVideo) ? 0 : 1;
                        storyRecorder.videoTextureHolder.active = false;
                        RectF rectF = storyRecorder.fromRect;
                        if (anonymousClass1FromStoryViewer != null) {
                            storyRecorder.fromSourceView = anonymousClass1FromStoryViewer;
                            storyRecorder.openType = anonymousClass1FromStoryViewer.type;
                            rectF.set(anonymousClass1FromStoryViewer.screenRect);
                            storyRecorder.fromRounding = anonymousClass1FromStoryViewer.rounding;
                            storyRecorder.fromSourceView.hide();
                        } else {
                            storyRecorder.openType = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            storyRecorder.fromRounding = AndroidUtilities.dp(8.0f);
                        }
                        storyRecorder.containerView.updateBackground();
                        ThemePreviewActivity.AnonymousClass14 anonymousClass14 = storyRecorder.previewContainer;
                        int i16 = storyRecorder.openType;
                        anonymousClass14.setBackgroundColor((i16 == 1 || i16 == 0) ? 0 : -14737633);
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
                        storyRecorder.navigateToPreviewWithPlayerAwait(j3, new StoryRecorder$$ExternalSyntheticLambda7(storyRecorder, 7));
                        storyRecorder.previewButtons.appear(true, false);
                        storyRecorder.navigateTo(1, false);
                        storyRecorder.switchToEditMode(-1, false, false);
                        storyRecorder.addNotificationObservers();
                        storyRecorder.botId = 0L;
                        storyRecorder.botLang = "";
                    }
                }
                storyRecorder.onFullyOpenListener = new PeerStoriesView$$ExternalSyntheticLambda3(peerStoriesView2, i);
                storyRecorder.onClosePrepareListener = new PeerStoriesView$$ExternalSyntheticLambda51(i2, peerStoriesView2, storyRecorder);
                break;
            case 22:
                PeerStoriesView.AnonymousClass8 anonymousClass9 = (PeerStoriesView.AnonymousClass8) this.f$0;
                anonymousClass9.getClass();
                StoryViewer.this.showDialog(new PremiumFeatureBottomSheet(((StoryViewer) this.f$1).fragment, 14, false));
                break;
            case 23:
                SelfStoryViewsPage.AnonymousClass5 anonymousClass5 = (SelfStoryViewsPage.AnonymousClass5) this.f$0;
                anonymousClass5.runnable = null;
                SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass2 = anonymousClass5.this$0;
                anonymousClass2.isSearchDebounce = false;
                anonymousClass2.state.searchQuery = ((String) this.f$1).toLowerCase();
                SelfStoryViewsPage.access$600(anonymousClass2);
                break;
            case 24:
                PeerStoriesView$38$$ExternalSyntheticLambda1 peerStoriesView$38$$ExternalSyntheticLambda1 = (PeerStoriesView$38$$ExternalSyntheticLambda1) this.f$0;
                if (peerStoriesView$38$$ExternalSyntheticLambda1 != null) {
                    peerStoriesView$38$$ExternalSyntheticLambda1.run(Boolean.valueOf(((TLRPC.TL_error) this.f$1) == null));
                }
                break;
            case 25:
                StoriesController.SearchStoriesList searchStoriesList = (StoriesController.SearchStoriesList) this.f$0;
                searchStoriesList.reqId = 0;
                TLObject tLObject3 = (TLObject) this.f$1;
                if (tLObject3 instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject3;
                    int i17 = searchStoriesList.currentAccount;
                    MessagesController.getInstance(i17).putUsers(tL_foundStories.users, false);
                    MessagesController.getInstance(i17).putChats(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList5 = tL_foundStories.stories;
                    int size2 = arrayList5.size();
                    int i18 = 0;
                    while (true) {
                        ArrayList arrayList6 = searchStoriesList.messageObjects;
                        if (i18 >= size2) {
                            searchStoriesList.count = Math.max(arrayList6.size(), tL_foundStories.count);
                            if (tL_foundStories.stories.isEmpty()) {
                                searchStoriesList.count = arrayList6.size();
                            }
                            if (arrayList6.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                                str = tL_foundStories.next_offset;
                            }
                            searchStoriesList.last_offset = str;
                            searchStoriesList.loading = false;
                            StoriesController$StoriesList$$ExternalSyntheticLambda0 storiesController$StoriesList$$ExternalSyntheticLambda0 = searchStoriesList.notify;
                            AndroidUtilities.cancelRunOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda0);
                            AndroidUtilities.runOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda0);
                        } else {
                            TL_stories.TL_foundStory tL_foundStory = arrayList5.get(i18);
                            i18++;
                            TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                            tL_foundStory2.storyItem.dialogId = DialogObject.getPeerDialogId(tL_foundStory2.peer);
                            tL_foundStory2.storyItem.messageId = arrayList6.size();
                            MessageObject messageObject3 = new MessageObject(i17, tL_foundStory2.storyItem);
                            messageObject3.generateThumbs(false);
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.add(Integer.valueOf(arrayList6.size()));
                            searchStoriesList.fakeDays.add(arrayList7);
                            arrayList6.add(messageObject3);
                        }
                    }
                }
                break;
            case 26:
                StoriesController.StoriesCollections storiesCollections = (StoriesController.StoriesCollections) this.f$0;
                ArrayList arrayList8 = storiesCollections.collections;
                arrayList8.clear();
                arrayList8.addAll((List) this.f$1);
                storiesCollections.loadedCache = true;
                storiesCollections.loading = false;
                storiesCollections.load();
                NotificationCenter.getInstance(storiesCollections.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(storiesCollections.dialogId), storiesCollections);
                break;
            case 27:
                StoriesController.StoriesCollections storiesCollections2 = (StoriesController.StoriesCollections) this.f$0;
                storiesCollections2.getClass();
                TLObject tLObject4 = (TLObject) this.f$1;
                boolean z2 = tLObject4 instanceof TL_stories.TL_albums;
                ArrayList arrayList9 = storiesCollections2.lastCollections;
                ArrayList arrayList10 = storiesCollections2.collections;
                if (z2) {
                    TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject4;
                    ArrayList arrayList11 = new ArrayList(tL_albums.albums.size());
                    ArrayList<TL_stories.TL_storyAlbum> arrayList12 = tL_albums.albums;
                    int size3 = arrayList12.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList12.get(i19);
                        i19++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        StoriesController.StoryAlbum storyAlbum = new StoriesController.StoryAlbum();
                        storyAlbum.album_id = tL_storyAlbum2.album_id;
                        storyAlbum.title = tL_storyAlbum2.title;
                        storyAlbum.icon_photo = tL_storyAlbum2.icon_photo;
                        storyAlbum.icon_video = tL_storyAlbum2.icon_video;
                        arrayList11.add(storyAlbum);
                    }
                    arrayList10.clear();
                    arrayList10.addAll(arrayList11);
                    arrayList9.clear();
                    arrayList9.addAll(arrayList11);
                    storiesCollections2.loaded = true;
                    storiesCollections2.loading = false;
                    storiesCollections2.updateAlbumsListCache(true);
                } else if (tLObject4 instanceof TL_stories.TL_albumsNotModified) {
                    arrayList10.clear();
                    arrayList10.addAll(arrayList9);
                    storiesCollections2.loaded = true;
                    storiesCollections2.loading = false;
                    NotificationCenter.getInstance(storiesCollections2.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(storiesCollections2.dialogId), storiesCollections2);
                }
                break;
            case 28:
                StoriesController.StoriesList storiesList = (StoriesController.StoriesList) this.f$0;
                storiesList.getClass();
                ((Utilities.Callback) this.f$1).run(storiesList);
                break;
            default:
                MessagesController.getInstance(StoriesController.this.currentAccount).getStoriesController().processUpdate((TL_stories.TL_updateStory) this.f$1);
                break;
        }
    }
}
