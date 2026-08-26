package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileRefController$$ExternalSyntheticLambda21;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Reactions.AnimatedEmojiEffect;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.Reactions.ReactionsUtils;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.LivePlayer$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.PeerStoriesView$40$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda54;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.StoriesLikeButton;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.ViewsForPeerStoriesRequester;
import org.telegram.ui.Stories.recorder.DominantColors;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.BotBiometry;
import org.telegram.ui.bots.BotVerifySheet$$ExternalSyntheticLambda1;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichTableCell;
import org.telegram.ui.web.BotWebViewContainer;

public final class TodoItemMenu$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public TodoItemMenu$$ExternalSyntheticLambda8(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        AnimatedEmojiDrawable animatedEmojiDrawable;
        ActionBarPopupWindow actionBarPopupWindow;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        MessageObject messageObject;
        int id;
        int[] iArr;
        File file;
        Bitmap bitmapDecodeFile;
        int i;
        boolean zContains;
        RichTableCell richTableCell;
        int i2 = 2;
        ChatActivity.ReplyQuote replyQuote = null;
        colorsSync = null;
        colorsSync = null;
        colorsSync = null;
        colorsSync = null;
        int[] colorsSync = null;
        Bitmap bitmap = null;
        Pair pair = null;
        replyQuote = null;
        replyQuote = null;
        int i3 = 0;
        z = false;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                TodoItemMenu todoItemMenu = (TodoItemMenu) obj3;
                MessageObject messageObject2 = todoItemMenu.messageObject;
                int i7 = ((TLRPC.TodoItem) obj).id;
                if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject2.getDialogId();
                    replyQuote = new ChatActivity.ReplyQuote(messageObject2, i7);
                }
                ((ChatActivity) obj2).showFieldPanelForReplyQuote(messageObject2, replyQuote);
                todoItemMenu.dismiss(false);
                return;
            case 1:
                PeerStoriesView.AnonymousClass40 anonymousClass40 = (PeerStoriesView.AnonymousClass40) obj3;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass40.this$0;
                anonymousClass1.movingReaction = true;
                boolean[] zArr = {false};
                StoriesLikeButton storiesLikeButton = anonymousClass1.storiesLikeButton;
                storiesLikeButton.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new PeerStoriesView.AnonymousClass16(1, storiesLikeButton)).setDuration(150L).start();
                int iDp = AndroidUtilities.dp(8.0f);
                StoriesLikeButton storiesLikeButton2 = new StoriesLikeButton(anonymousClass1.getContext(), anonymousClass1.sharedResources);
                anonymousClass1.storiesLikeButton = storiesLikeButton2;
                storiesLikeButton2.setPadding(iDp, iDp, iDp, iDp);
                anonymousClass1.likeButtonContainer.addView(anonymousClass1.storiesLikeButton, LayoutHelper.createFrame(40, 40, 3));
                AnimatedEmojiDrawable animatedEmojiDrawable2 = anonymousClass1.reactionMoveDrawable;
                if (animatedEmojiDrawable2 != null) {
                    animatedEmojiDrawable2.removeView(anonymousClass1);
                    anonymousClass1.reactionMoveDrawable = null;
                }
                AnimatedEmojiEffect animatedEmojiEffect = anonymousClass1.emojiReactionEffect;
                if (animatedEmojiEffect != null) {
                    animatedEmojiEffect.removeView(anonymousClass1);
                    anonymousClass1.emojiReactionEffect = null;
                }
                anonymousClass1.drawAnimatedEmojiAsMovingReaction = false;
                ReactionsLayoutInBubble.VisibleReaction visibleReaction = (ReactionsLayoutInBubble.VisibleReaction) obj2;
                if (visibleReaction.documentId != 0) {
                    anonymousClass1.drawAnimatedEmojiAsMovingReaction = true;
                    AnimatedEmojiDrawable animatedEmojiDrawable3 = new AnimatedEmojiDrawable(2, anonymousClass1.currentAccount, visibleReaction.documentId);
                    anonymousClass1.reactionMoveDrawable = animatedEmojiDrawable3;
                    animatedEmojiDrawable3.addView(anonymousClass1);
                } else if (visibleReaction.emojicon != null && (tL_availableReaction = MediaDataController.getInstance(anonymousClass1.currentAccount).getReactionsMap().get(visibleReaction.emojicon)) != null) {
                    anonymousClass1.reactionMoveImageReceiver.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    TLRPC.Document document3 = tL_availableReaction.around_animation;
                    String filterForAroundAnimation = ReactionsEffectOverlay.getFilterForAroundAnimation();
                    ImageReceiver imageReceiver = anonymousClass1.reactionEffectImageReceiver;
                    imageReceiver.setImage(ImageLocation.getForDocument(document3), filterForAroundAnimation, null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                    }
                }
                anonymousClass1.storiesLikeButton.setReaction(visibleReaction);
                boolean z2 = anonymousClass1.isChannel;
                PeerStoriesView.StoryItemHolder storyItemHolder = anonymousClass1.currentStory;
                if (z2) {
                    TL_stories.StoryItem storyItem3 = storyItemHolder.storyItem;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = storyItemHolder.storyItem;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        ReactionsUtils.applyForStoryViews(null, storyItem4.sent_reaction, storyViews);
                        anonymousClass1.updateUserViews(true);
                    }
                }
                if (visibleReaction.documentId != 0 && (animatedEmojiDrawable = anonymousClass1.storiesLikeButton.emojiDrawable) != null) {
                    AnimatedEmojiEffect animatedEmojiEffect2 = new AnimatedEmojiEffect(animatedEmojiDrawable, UserConfig.selectedAccount, false, true);
                    anonymousClass1.emojiReactionEffect = animatedEmojiEffect2;
                    animatedEmojiEffect2.setView(anonymousClass1);
                }
                anonymousClass1.storiesController.setStoryReaction(anonymousClass1.dialogId, storyItemHolder.storyItem, visibleReaction);
                int[] iArr2 = new int[2];
                View view = (View) obj;
                view.getLocationInWindow(iArr2);
                int[] iArr3 = new int[2];
                anonymousClass1.getLocationInWindow(iArr3);
                anonymousClass1.movingReactionFromX = iArr2[0] - iArr3[0];
                anonymousClass1.movingReactionFromY = iArr2[1] - iArr3[1];
                anonymousClass1.movingReactionFromSize = view.getMeasuredHeight();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                anonymousClass1.movingReactionProgress = 0.0f;
                anonymousClass1.invalidate();
                StoriesLikeButton storiesLikeButton3 = anonymousClass1.storiesLikeButton;
                storiesLikeButton3.setAllowDrawReaction(false);
                if (visibleReaction.documentId == 0 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(visibleReaction.emojicon)) != null) {
                    ImageReceiver imageReceiver2 = storiesLikeButton3.animateReactionImageReceiver;
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.setAutoRepeat(0);
                }
                valueAnimatorOfFloat.addUpdateListener(new PeerStoriesView$40$$ExternalSyntheticLambda1(anonymousClass40, valueAnimatorOfFloat, zArr, i3));
                valueAnimatorOfFloat.addListener(new EmojiView.AnonymousClass35(anonymousClass40, zArr, storiesLikeButton3, 8));
                valueAnimatorOfFloat.setDuration(220L);
                valueAnimatorOfFloat.start();
                anonymousClass1.showLikesReaction(false);
                return;
            case 2:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) obj3;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass8.this$0;
                DarkThemeResourceProvider darkThemeResourceProvider = (DarkThemeResourceProvider) obj2;
                AlertsCreator.createStoriesAlbumEnterNameForCreate(anonymousClass2.getContext(), null, darkThemeResourceProvider, new VoIPFragment$$ExternalSyntheticLambda42(anonymousClass8, (TL_stories.StoryItem) obj, darkThemeResourceProvider, 20));
                PeerStoriesView.AnonymousClass8 anonymousClass9 = anonymousClass2.popupMenu;
                if (anonymousClass9 == null || (actionBarPopupWindow = anonymousClass9.popupWindow) == null) {
                    return;
                }
                actionBarPopupWindow.dismiss(true);
                return;
            case 3:
                while (true) {
                    StoriesController.BotPreviewsList botPreviewsList = (StoriesController.BotPreviewsList) obj3;
                    Utilities.Callback callback = (Utilities.Callback) obj;
                    if (i5 >= botPreviewsList.messageObjects.size()) {
                        callback.run(null);
                        return;
                    }
                    MessageObject messageObject3 = (MessageObject) botPreviewsList.messageObjects.get(i5);
                    if (messageObject3 != null && (storyItem = messageObject3.storyItem) != null && (messageMedia = storyItem.media) != null && (document = ((TL_stories.StoryItem) obj2).media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                        callback.run(document2);
                        return;
                    }
                    i5++;
                }
                break;
            case 4:
                StoriesController storiesController = (StoriesController) obj3;
                storiesController.storyLimitFetched = true;
                TLObject tLObject = (TLObject) obj2;
                boolean z3 = tLObject instanceof TLRPC.TL_boolTrue;
                int i8 = storiesController.currentAccount;
                if (z3) {
                    storiesController.storyLimitCached = null;
                    NotificationCenter.getInstance(i8).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else if (!(tLObject instanceof TL_stories.canSendStoryCount)) {
                    storiesController.checkStoryError((TLRPC.TL_error) obj);
                    return;
                } else {
                    storiesController.storyLimitCached = new StoriesController.StoryLimit(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    NotificationCenter.getInstance(i8).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                }
            case 5:
                while (true) {
                    ArrayList arrayList = ((StoriesController.BotPreviewsList) obj3).messageObjects;
                    FileRefController$$ExternalSyntheticLambda21 fileRefController$$ExternalSyntheticLambda21 = (FileRefController$$ExternalSyntheticLambda21) obj;
                    if (i4 >= arrayList.size()) {
                        fileRefController$$ExternalSyntheticLambda21.run(null);
                        return;
                    }
                    MessageObject messageObject4 = (MessageObject) arrayList.get(i4);
                    if (messageObject4 != null && (storyItem2 = messageObject4.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = ((StoriesController.BotPreview) obj2).media;
                        TLRPC.Document document4 = messageMedia3.document;
                        if (document4 == null) {
                            photo = messageMedia3.photo;
                            if (photo != null && (photo2 = messageMedia2.photo) != null && photo2.id == photo.id) {
                                fileRefController$$ExternalSyntheticLambda21.run((StoriesController.BotPreview) storyItem2);
                                return;
                            }
                        } else {
                            TLRPC.Document document5 = messageMedia2.document;
                            if (document5 != null) {
                                if (document5.id == document4.id) {
                                    fileRefController$$ExternalSyntheticLambda21.run((StoriesController.BotPreview) storyItem2);
                                    return;
                                }
                                photo = messageMedia3.photo;
                                if (photo != null) {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i4++;
                }
                break;
            case 6:
                StoriesController.BotPreviewsList botPreviewsList2 = (StoriesController.BotPreviewsList) obj3;
                botPreviewsList2.reqId = 0;
                botPreviewsList2.loading = false;
                botPreviewsList2.loaded = true;
                botPreviewsList2.done = true;
                ArrayList arrayList2 = new ArrayList();
                TLObject tLObject2 = (TLObject) obj2;
                if (tLObject2 instanceof Vector) {
                    ArrayList<T> arrayList3 = ((Vector) tLObject2).objects;
                    int size = arrayList3.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj4 = arrayList3.get(i9);
                        i9++;
                        arrayList2.add((TL_bots.botPreviewMedia) obj4);
                    }
                } else {
                    if (!(tLObject2 instanceof TL_bots.previewInfo)) {
                        return;
                    }
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject2;
                    ArrayList arrayList4 = botPreviewsList2.lang_codes;
                    arrayList4.clear();
                    arrayList4.addAll(previewinfo.lang_codes);
                    arrayList2.addAll(previewinfo.media);
                }
                ArrayList arrayList5 = botPreviewsList2.messageObjects;
                ArrayList arrayList6 = new ArrayList(arrayList5);
                arrayList5.clear();
                ArrayList arrayList7 = botPreviewsList2.fakeDays;
                arrayList7.clear();
                int size2 = arrayList2.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj5 = arrayList2.get(i10);
                    i10 += i6;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj5;
                    Object obj6 = obj;
                    MessageObject messageObject5 = new MessageObject(botPreviewsList2.currentAccount, new StoriesController.BotPreview(botPreviewsList2, botPreviewsList2.dialogId, botpreviewmedia));
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList6.size()) {
                            messageObject = null;
                        } else if (MessagesController.equals(((MessageObject) arrayList6.get(i11)).storyItem.media, botpreviewmedia.media)) {
                            messageObject = (MessageObject) arrayList6.get(i11);
                        } else {
                            i11++;
                        }
                    }
                    TL_stories.StoryItem storyItem5 = messageObject5.storyItem;
                    TLRPC.Message message2 = messageObject5.messageOwner;
                    if (messageObject == null) {
                        id = botPreviewsList2.lastId;
                        botPreviewsList2.lastId = id + 1;
                    } else {
                        id = messageObject.getId();
                    }
                    message2.id = id;
                    storyItem5.id = id;
                    messageObject5.parentStoriesList = botPreviewsList2;
                    messageObject5.generateThumbs(false);
                    if (arrayList7.isEmpty()) {
                        arrayList7.add(new ArrayList());
                    }
                    ((ArrayList) arrayList7.get(0)).add(Integer.valueOf(messageObject5.getId()));
                    arrayList5.add(messageObject5);
                    obj = obj6;
                    i6 = 1;
                }
                StoriesController$StoriesList$$ExternalSyntheticLambda0 storiesController$StoriesList$$ExternalSyntheticLambda0 = botPreviewsList2.notify;
                AndroidUtilities.cancelRunOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda0);
                AndroidUtilities.runOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda0);
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 7:
                StoryViewer storyViewer = StoryViewer.this;
                storyViewer.storiesViewPager.setDays(storyViewer.currentAccount, ((StoriesController.StoriesList) obj2).dialogId, (ArrayList) obj);
                return;
            case 8:
                ViewsForPeerStoriesRequester viewsForPeerStoriesRequester = (ViewsForPeerStoriesRequester) obj3;
                viewsForPeerStoriesRequester.getClass();
                ViewsForPeerStoriesRequester.lastRequestTime = System.currentTimeMillis();
                TLObject tLObject3 = (TLObject) obj2;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    int i12 = viewsForPeerStoriesRequester.currentAccount;
                    MessagesController.getInstance(i12).putUsers(tL_stories_storyViews.users, false);
                    if (!viewsForPeerStoriesRequester.updateStories(((TL_stories.TL_stories_getStoriesViews) obj).id, tL_stories_storyViews)) {
                        viewsForPeerStoriesRequester.currentReqId = 0;
                        viewsForPeerStoriesRequester.isRunning = false;
                        return;
                    }
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                }
                viewsForPeerStoriesRequester.currentReqId = 0;
                if (viewsForPeerStoriesRequester.isRunning) {
                    LivePlayer$1$$ExternalSyntheticLambda0 livePlayer$1$$ExternalSyntheticLambda0 = viewsForPeerStoriesRequester.scheduleRequestRunnable;
                    AndroidUtilities.cancelRunOnUIThread(livePlayer$1$$ExternalSyntheticLambda0);
                    AndroidUtilities.runOnUIThread(livePlayer$1$$ExternalSyntheticLambda0, 10000L);
                    return;
                }
                return;
            case 9:
                EmojiBottomSheet.Page.Adapter adapter = (EmojiBottomSheet.Page.Adapter) obj3;
                if (TextUtils.equals((String) obj2, adapter.query)) {
                    adapter.itemsCount = 0;
                    ArrayList arrayList8 = adapter.documents;
                    arrayList8.clear();
                    ArrayList arrayList9 = adapter.documentIds;
                    arrayList9.clear();
                    adapter.positionToSection.clear();
                    adapter.stickerSets.clear();
                    adapter.itemsCount++;
                    arrayList8.add(null);
                    arrayList9.add(0L);
                    TLObject tLObject4 = (TLObject) obj;
                    if (tLObject4 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject4;
                        arrayList8.addAll(tL_messages_stickers.stickers);
                        adapter.itemsCount = tL_messages_stickers.stickers.size() + adapter.itemsCount;
                    }
                    adapter.activeQuery = adapter.query;
                    adapter.mObservable.notifyChanged();
                    EmojiBottomSheet.Page page = EmojiBottomSheet.Page.this;
                    EmojiBottomSheet.EmojiListView.access$4100(page.listView, 0, 0);
                    page.searchField.showProgress(false);
                    EmojiBottomSheet.Page.AnonymousClass3 anonymousClass3 = page.tabsStrip;
                    anonymousClass3.showSelected = false;
                    anonymousClass3.contentView.invalidate();
                    return;
                }
                return;
            case 10:
                GalleryListView.Cell cell = (GalleryListView.Cell) obj3;
                cell.getClass();
                if (obj2 != null) {
                    int iMin = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
                    if (obj2 instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        String str = photoEntry.thumbPath;
                        if (str != null) {
                            BitmapFactory.decodeFile(str, options);
                        } else if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                            MediaStore.Images.Thumbnails.getThumbnail(cell.getContext().getContentResolver(), photoEntry.imageId, 1, options);
                        } else {
                            MediaStore.Video.Thumbnails.getThumbnail(cell.getContext().getContentResolver(), photoEntry.imageId, 1, options);
                        }
                        StoryEntry.setupScale(options, iMin);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        String str2 = photoEntry.thumbPath;
                        bitmapDecodeFile = str2 != null ? BitmapFactory.decodeFile(str2, options) : (!photoEntry.isVideo || photoEntry.isLivePhoto()) ? MediaStore.Images.Thumbnails.getThumbnail(cell.getContext().getContentResolver(), photoEntry.imageId, 1, options) : MediaStore.Video.Thumbnails.getThumbnail(cell.getContext().getContentResolver(), photoEntry.imageId, 1, options);
                        if (bitmapDecodeFile != null && bitmapDecodeFile.getHeight() / bitmapDecodeFile.getWidth() < cell.aspectRatio) {
                            if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && !bitmapDecodeFile.isRecycled()) {
                                colorsSync = DominantColors.getColorsSync(bitmapDecodeFile, true);
                                photoEntry.gradientTopColor = colorsSync[0];
                                photoEntry.gradientBottomColor = colorsSync[1];
                            } else {
                                int i13 = photoEntry.gradientTopColor;
                                if (i13 != 0 && (i = photoEntry.gradientBottomColor) != 0) {
                                    colorsSync = new int[]{i13, i};
                                }
                            }
                        }
                    } else {
                        if (!(obj2 instanceof StoryEntry) || (file = ((StoryEntry) obj2).draftThumbFile) == null) {
                            iArr = null;
                        } else {
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(file.getPath(), options2);
                            StoryEntry.setupScale(options2, iMin);
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath(), options2);
                        }
                        pair = new Pair(bitmap, iArr);
                    }
                    int[] iArr4 = colorsSync;
                    bitmap = bitmapDecodeFile;
                    iArr = iArr4;
                    pair = new Pair(bitmap, iArr);
                }
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda8(cell, (String) obj, pair, 11));
                return;
            case 11:
                GalleryListView.Cell cell2 = (GalleryListView.Cell) obj3;
                cell2.getClass();
                Pair pair2 = (Pair) obj;
                Bitmap bitmap2 = (Bitmap) pair2.first;
                int[] iArr5 = (int[]) pair2.second;
                if (bitmap2 == null) {
                    return;
                }
                String str3 = (String) obj2;
                if (str3 != null) {
                    GalleryListView.Cell.bitmapsCache.put(str3, bitmap2);
                    HashMap map = GalleryListView.Cell.bitmapsUseCounts;
                    Integer num = (Integer) map.get(str3);
                    if (num != null) {
                        map.put(str3, Integer.valueOf(num.intValue() + 1));
                    } else {
                        map.put(str3, 1);
                    }
                }
                if (!TextUtils.equals(str3, cell2.currentKey)) {
                    GalleryListView.Cell.releaseBitmap(str3);
                    return;
                }
                cell2.bitmap = bitmap2;
                Paint paint = cell2.gradientPaint;
                if (iArr5 == null) {
                    paint.setShader(null);
                    cell2.gradient = null;
                } else {
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr5, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    cell2.gradient = linearGradient;
                    paint.setShader(linearGradient);
                }
                cell2.updateMatrix();
                cell2.invalidate();
                return;
            case 12:
                GalleryListView.SearchAdapter searchAdapter = (GalleryListView.SearchAdapter) obj3;
                searchAdapter.triedResolvingBot = true;
                searchAdapter.loading = false;
                TLObject tLObject5 = (TLObject) obj2;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    MessagesController messagesController = (MessagesController) obj;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(GalleryListView.this.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    searchAdapter.loadInternal();
                    return;
                }
                return;
            case 13:
                break;
            case 14:
                AnimatedFileNative.getVideoInfo((String) obj3, ((int[][]) obj2)[0], 0L);
                AndroidUtilities.runOnUIThread((ProfileActivity$$ExternalSyntheticLambda149) obj);
                return;
            case 15:
                StoryPrivacyBottomSheet.Page page2 = (StoryPrivacyBottomSheet.Page) obj3;
                page2.button.setLoading(false);
                TLObject tLObject6 = (TLObject) obj2;
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                if (tLObject6 != null) {
                    int i14 = StoryPrivacyBottomSheet.$r8$clinit;
                    ArrayList contacts = storyPrivacyBottomSheet.getContacts();
                    for (int i15 = 0; i15 < contacts.size(); i15++) {
                        TLRPC.User user = (TLRPC.User) contacts.get(i15);
                        if (user != null && (zContains = page2.selectedUsers.contains(Long.valueOf(user.id))) != user.close_friend) {
                            user.close_friend = zContains;
                            user.flags2 = zContains ? user.flags2 | 4 : user.flags2 & (-5);
                            ((MessagesController) obj).putUser(user, false);
                        }
                    }
                }
                storyPrivacyBottomSheet.closeKeyboard();
                if (storyPrivacyBottomSheet.isEdit) {
                    storyPrivacyBottomSheet.done(new StoryPrivacyBottomSheet.StoryPrivacy(1, ((BottomSheet) storyPrivacyBottomSheet).currentAccount, (ArrayList) null), new PeerStoriesView$8$$ExternalSyntheticLambda54(storyPrivacyBottomSheet, 1), false);
                    return;
                } else {
                    storyPrivacyBottomSheet.closeKeyboard();
                    storyPrivacyBottomSheet.viewPager.scrollToPosition$1(0);
                    return;
                }
            case 16:
                StoryRecorder storyRecorder = (StoryRecorder) obj3;
                storyRecorder.getClass();
                ((StoryEntry) obj2).draftThumbFile = (File) obj;
                StoryRecorder.AnonymousClass11 anonymousClass11 = storyRecorder.storiesSelector;
                if (anonymousClass11 != null) {
                    anonymousClass11.listView.adapter.update(false);
                    return;
                }
                return;
            case 17:
                StoryRecorder storyRecorder2 = (StoryRecorder) obj3;
                storyRecorder2.getClass();
                Bitmap bitmap3 = (Bitmap) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (bitmap3 != null) {
                    try {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap3, 0, 0, bitmap3.getWidth(), bitmap3.getHeight(), storyRecorder2.cameraView.getMatrix(), true);
                        bitmap3.recycle();
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, 80, (int) (bitmapCreateBitmap.getHeight() / (bitmapCreateBitmap.getWidth() / 80.0f)), true);
                        if (bitmapCreateScaledBitmap != null) {
                            if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                                bitmapCreateBitmap.recycle();
                            }
                            Utilities.blurBitmap(bitmapCreateScaledBitmap, 7);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg"));
                            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            bitmapCreateScaledBitmap.recycle();
                            fileOutputStream.close();
                        }
                    } catch (Throwable unused) {
                        AndroidUtilities.runOnUIThread(runnable2);
                        return;
                    }
                    break;
                }
                AndroidUtilities.runOnUIThread(runnable2);
                return;
            case 18:
                ThemeSetUrlActivity themeSetUrlActivity = (ThemeSetUrlActivity) obj3;
                themeSetUrlActivity.checkReqId = 0;
                String str4 = themeSetUrlActivity.lastCheckName;
                if (str4 != null) {
                    String str5 = (String) obj2;
                    if (str4.equals(str5)) {
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        if (tL_error == null || !("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                            themeSetUrlActivity.setCheckText(Theme.key_windowBackgroundWhiteGreenText, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str5));
                            return;
                        } else {
                            themeSetUrlActivity.setCheckText(Theme.key_text_RedRegular, LocaleController.getString(R.string.SetUrlInUse));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 19:
                ((ThemeSetUrlActivity) obj3).lambda$saveTheme$11((TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                return;
            case 20:
                TooManyCommunitiesActivity tooManyCommunitiesActivity = (TooManyCommunitiesActivity) obj3;
                ArrayList arrayList10 = tooManyCommunitiesActivity.inactiveChatsSignatures;
                arrayList10.clear();
                ArrayList arrayList11 = tooManyCommunitiesActivity.inactiveChats;
                arrayList11.clear();
                arrayList10.addAll((ArrayList) obj2);
                arrayList11.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                TooManyCommunitiesActivity.Adapter adapter2 = tooManyCommunitiesActivity.adapter;
                adapter2.updateRows$2();
                adapter2.mObservable.notifyChanged();
                if (tooManyCommunitiesActivity.listView.getMeasuredHeight() > 0) {
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    tooManyCommunitiesActivity.enterAnimator = valueAnimatorOfFloat2;
                    valueAnimatorOfFloat2.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(tooManyCommunitiesActivity, 19));
                    tooManyCommunitiesActivity.enterAnimator.setDuration(100L);
                    tooManyCommunitiesActivity.enterAnimator.start();
                } else {
                    tooManyCommunitiesActivity.enterProgress = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(tooManyCommunitiesActivity.showProgressRunnable);
                if (tooManyCommunitiesActivity.progressBar.getVisibility() == 0) {
                    tooManyCommunitiesActivity.progressBar.animate().alpha(0.0f).setListener(new TooManyCommunitiesActivity.AnonymousClass6(tooManyCommunitiesActivity, i2)).start();
                    return;
                }
                return;
            case 21:
                TopicsFragment topicsFragment = (TopicsFragment) obj3;
                topicsFragment.topicsController.deleteTopics(topicsFragment.chatId, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 22:
                TopicsFragment.MessagesSearchContainer messagesSearchContainer = (TopicsFragment.MessagesSearchContainer) obj3;
                String str6 = (String) obj2;
                if (str6.equals(messagesSearchContainer.searchString)) {
                    int i16 = messagesSearchContainer.rowCount;
                    messagesSearchContainer.messagesIsLoading = false;
                    messagesSearchContainer.isLoading = false;
                    TLObject tLObject7 = (TLObject) obj;
                    if (tLObject7 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject7;
                        int i17 = 0;
                        while (true) {
                            int size3 = messages_messages.messages.size();
                            ArrayList arrayList12 = messagesSearchContainer.searchResultMessages;
                            if (i17 < size3) {
                                MessageObject messageObject6 = new MessageObject(((BaseFragment) TopicsFragment.this).currentAccount, messages_messages.messages.get(i17), false, false);
                                messageObject6.setQuery(str6);
                                arrayList12.add(messageObject6);
                                i17++;
                            } else {
                                messagesSearchContainer.updateRows$20();
                                if (arrayList12.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                                    z = true;
                                }
                                messagesSearchContainer.canLoadMore = z;
                            }
                        }
                    } else {
                        messagesSearchContainer.canLoadMore = false;
                    }
                    if (messagesSearchContainer.rowCount == 0) {
                        messagesSearchContainer.emptyView.showProgress(messagesSearchContainer.isLoading, true);
                    }
                    messagesSearchContainer.itemsEnterAnimator.showItemsAnimated(i16);
                    return;
                }
                return;
            case 23:
                UsersSelectActivity.GroupCreateAdapter groupCreateAdapter = (UsersSelectActivity.GroupCreateAdapter) obj3;
                if (groupCreateAdapter.searching) {
                    groupCreateAdapter.searchRunnable = null;
                    ArrayList arrayList13 = (ArrayList) obj2;
                    groupCreateAdapter.searchResult = arrayList13;
                    groupCreateAdapter.searchResultNames = (ArrayList) obj;
                    SearchAdapterHelper searchAdapterHelper = groupCreateAdapter.searchAdapterHelper;
                    searchAdapterHelper.mergeResults(arrayList13, null);
                    if (groupCreateAdapter.searching && !searchAdapterHelper.isSearchInProgress()) {
                        UsersSelectActivity.this.emptyView.showProgress(false, true);
                    }
                    groupCreateAdapter.mObservable.notifyChanged();
                    return;
                }
                return;
            case 24:
                ArrayList arrayList14 = new ArrayList();
                int i18 = 0;
                while (true) {
                    ArrayList arrayList15 = (ArrayList) obj3;
                    if (i18 >= arrayList15.size()) {
                        ((Utilities.Callback) obj).run(arrayList14);
                        return;
                    }
                    TLRPC.User user2 = (TLRPC.User) arrayList15.get(i18);
                    Boolean bool = (Boolean) ((HashMap) obj2).get(Long.valueOf(user2.id));
                    arrayList14.add(new BotBiometry.Bot(user2, bool == null || !bool.booleanValue()));
                    i18++;
                }
                break;
            case 25:
                ((boolean[]) obj3)[0] = false;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    ((BotVerifySheet$$ExternalSyntheticLambda1) obj).run(Boolean.TRUE);
                    return;
                }
                return;
            case 26:
                BotWebViewSheet.AnonymousClass3 anonymousClass4 = (BotWebViewSheet.AnonymousClass3) obj3;
                anonymousClass4.getClass();
                boolean z4 = ((TLObject) obj2) instanceof TLRPC.TL_boolTrue;
                BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
                if (!z4) {
                    new BulletinFactory(botWebViewSheet.bulletinContainer, botWebViewSheet.resourcesProvider).makeForError((TLRPC.TL_error) obj).show(true);
                    return;
                }
                BotWebViewSheet.AnonymousClass2 anonymousClass5 = botWebViewSheet.webViewContainer;
                anonymousClass5.getClass();
                anonymousClass5.notifyEvent("emoji_status_access_requested", BotWebViewContainer.obj("cancelled", "status"));
                return;
            case 27:
                ChannelAffiliateProgramsFragment channelAffiliateProgramsFragment = (ChannelAffiliateProgramsFragment) obj3;
                channelAffiliateProgramsFragment.getClass();
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj2;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                BulletinFactory.of(channelAffiliateProgramsFragment).createSimpleBulletin(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, AffiliateProgramFragment.percents(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) obj))), R.raw.copy).show();
                return;
            case 28:
                ((ChannelAffiliateProgramsFragment) obj3).lambda$createView$4((TLObject) obj2, (AlertDialog) obj);
                return;
            default:
                RichEditorListView richEditorListView = (RichEditorListView) obj3;
                if (richEditorListView.tableCellMenu != ((ItemOptions) obj2)) {
                    return;
                }
                richEditorListView.tableCellMenu = null;
                if (richEditorListView.clearDraggedMultiCellSelectionOnMenuDismiss && richEditorListView.activeCellSelectionTable == (richTableCell = (RichTableCell) obj) && !richTableCell.selectedCells.isEmpty()) {
                    richEditorListView.exitCellSelectionMode();
                    return;
                }
                return;
        }
        while (true) {
            String[] strArr = (String[]) obj3;
            if (i3 >= strArr.length) {
                AndroidUtilities.runOnUIThread((ProfileActivity$$ExternalSyntheticLambda149) obj);
                return;
            }
            String str7 = strArr[i3];
            if (str7 != null) {
                AnimatedFileNative.getVideoInfo(str7, ((int[][]) obj2)[i3], 0L);
            }
            i3++;
        }
    }
}
