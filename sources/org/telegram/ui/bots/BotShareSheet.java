package org.telegram.ui.bots;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda147;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda5;

public final class BotShareSheet extends BottomSheetWithRecyclerListView {
    public UniversalAdapter adapter;
    public final String botName;
    public final AnonymousClass5 chatView;
    public final int currentAccount;
    public boolean openedDialogsActivity;
    public boolean sent;
    public final OAuthSheet$$ExternalSyntheticLambda18 whenDone;

    public final class AnonymousClass2 implements ChatActionCell.ChatActionCellDelegate {
        @Override
        public final boolean canDrawOutboundsContent() {
            return true;
        }

        @Override
        public final void didClickButton(ChatActionCell chatActionCell) {
        }

        @Override
        public final void didClickImage(ChatActionCell chatActionCell) {
        }

        @Override
        public final boolean didLongPress(ChatActionCell chatActionCell, float f, float f2) {
            return false;
        }

        @Override
        public final void didOpenPremiumGift(ChatActionCell chatActionCell, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        }

        @Override
        public final void didOpenPremiumGiftChannel(ChatActionCell chatActionCell, String str) {
        }

        @Override
        public final void didPressReaction(ChatActionCell chatActionCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        }

        @Override
        public final void didPressReplyMessage(ChatActionCell chatActionCell, int i) {
        }

        @Override
        public final void didPressTaskLink(ChatActionCell chatActionCell, int i, int i2) {
        }

        @Override
        public final void forceUpdate(ChatActionCell chatActionCell) {
        }

        @Override
        public final BaseFragment getBaseFragment() {
            return null;
        }

        @Override
        public final long getDialogId() {
            return 0L;
        }

        @Override
        public final long getTopicId() {
            return 0L;
        }

        @Override
        public final void needOpenInviteLink(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        }

        @Override
        public final void needOpenUserProfile(long j) {
        }

        @Override
        public final void needShowEffectOverlay(ChatActionCell chatActionCell, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        }

        @Override
        public final void onTopicClick(ChatActionCell chatActionCell) {
        }
    }

    public final class AnonymousClass3 extends ChatMessageCell {
        @Override
        public final boolean isDrawSelectionBackground() {
            return false;
        }
    }

    public final class AnonymousClass4 implements ChatMessageCell.ChatMessageCellDelegate {
        @Override
        public final boolean allowAddPollOptions() {
            return false;
        }

        @Override
        public final boolean canDrawOutboundsContent() {
            return true;
        }

        @Override
        public final boolean canPerformActions() {
            return false;
        }

        @Override
        public final boolean canPerformReply() {
            return false;
        }

        @Override
        public final boolean canSaveRichDocument(ChatMessageCell chatMessageCell) {
            return false;
        }

        @Override
        public final boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell) {
            return false;
        }

        @Override
        public final void didLongPress(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        @Override
        public final void didLongPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        }

        @Override
        public final boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat) {
            return false;
        }

        @Override
        public final boolean didLongPressPollOption(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer) {
            return false;
        }

        @Override
        public final boolean didLongPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem) {
            return false;
        }

        @Override
        public final boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user) {
            return false;
        }

        @Override
        public final void didPressAboutRevenueSharingAds() {
        }

        @Override
        public final void didPressAddPollOptionButton(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didPressAdmin(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final boolean didPressAnimatedEmoji(AnimatedEmojiSpan animatedEmojiSpan) {
            return false;
        }

        @Override
        public final void didPressAppUpdateButton() {
        }

        @Override
        public final void didPressBoostCounter(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        }

        @Override
        public final void didPressCancelSendButton(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
        }

        @Override
        public final void didPressChannelRecommendation(ChatMessageCell chatMessageCell, TLObject tLObject, boolean z) {
        }

        @Override
        public final void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didPressCodeCopy(MessageObject.TextLayoutBlock textLayoutBlock) {
        }

        @Override
        public final void didPressCommentButton(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
        }

        @Override
        public final void didPressEffect(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        }

        @Override
        public final void didPressFactCheck(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didPressFactCheckWhat(ChatMessageCell chatMessageCell, int i, int i2) {
        }

        @Override
        public final void didPressGiveawayChatButton(int i, ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didPressGroupImage(ChatMessageCell chatMessageCell, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        }

        @Override
        public final void didPressHiddenForward(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didPressHint(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didPressImage(ChatMessageCell chatMessageCell, float f, float f2, boolean z) {
        }

        @Override
        public final void didPressInstantButton(int i, ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didPressMoreChannelRecommendations() {
        }

        @Override
        public final void didPressOther(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        @Override
        public final void didPressPollMedia(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        }

        @Override
        public final void didPressReaction(ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        }

        @Override
        public final void didPressReplyMessage(ChatMessageCell chatMessageCell, int i, float f, float f2, boolean z) {
        }

        @Override
        public final void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didPressRichDocumentOptions(ChatMessageCell chatMessageCell, TLRPC.Document document) {
        }

        @Override
        public final void didPressShowMore(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didPressSideButton(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didPressSponsoredClose(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didPressSponsoredInfo(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        @Override
        public final void didPressSummarize(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didPressTime() {
        }

        @Override
        public final boolean didPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem, boolean z) {
            return false;
        }

        @Override
        public final void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
        }

        @Override
        public final void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2) {
        }

        @Override
        public final void didPressUserStatus(ChatMessageCell chatMessageCell, TLRPC.User user, TLRPC.Document document, String str) {
        }

        @Override
        public final void didPressViaBot(String str) {
        }

        @Override
        public final void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j) {
        }

        @Override
        public final void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList arrayList, int i, int i2, int i3) {
        }

        @Override
        public final void didPressWebPage(ChatMessageCell chatMessageCell, TLRPC.WebPage webPage, String str, boolean z) {
            ArticleViewer.IBlock.CC.$default$didPressWebPage(chatMessageCell, str);
        }

        @Override
        public final void didQuickShareEnd(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didQuickShareMove(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        @Override
        public final void didQuickShareStart(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didStartVideoStream(MessageObject messageObject) {
        }

        @Override
        public final void didTogglePollPreview(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell, FileLoader$$ExternalSyntheticLambda1 fileLoader$$ExternalSyntheticLambda1) {
        }

        @Override
        public final boolean doNotShowLoadingReply(MessageObject messageObject) {
            return ArticleViewer.IBlock.CC.$default$doNotShowLoadingReply(messageObject);
        }

        @Override
        public final void drawPollMode(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void forceUpdate(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final void forceUpdateNoAnimation(ChatMessageCell chatMessageCell) {
        }

        @Override
        public final int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell) {
            return 0;
        }

        @Override
        public final String getAdminRank(long j) {
            return null;
        }

        @Override
        public final int getChatMode() {
            return 0;
        }

        @Override
        public final ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
            return null;
        }

        @Override
        public final PinchToZoomHelper getPinchToZoomHelper() {
            return null;
        }

        @Override
        public final String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell) {
            return null;
        }

        @Override
        public final CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell) {
            return null;
        }

        @Override
        public final TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
            return null;
        }

        @Override
        public final boolean hasSelectedMessages() {
            return false;
        }

        @Override
        public final void invalidateBlur() {
        }

        @Override
        public final boolean isAdmin(long j) {
            return false;
        }

        @Override
        public final boolean isLandscape() {
            return false;
        }

        @Override
        public final boolean isOwner(long j) {
            return false;
        }

        @Override
        public final boolean isProgressLoading(int i, ChatMessageCell chatMessageCell) {
            return false;
        }

        @Override
        public final boolean isReplyOrSelf() {
            return false;
        }

        @Override
        public final boolean keyboardIsOpened() {
            return false;
        }

        @Override
        public final void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i, int i2) {
        }

        @Override
        public final boolean needPlayMessage(ChatMessageCell chatMessageCell, MessageObject messageObject) {
            return false;
        }

        @Override
        public final void needReloadPolls() {
        }

        @Override
        public final void needShowPremiumBulletin(int i) {
        }

        @Override
        public final boolean onAccessibilityAction(int i) {
            return false;
        }

        @Override
        public final void onDiceFinished() {
        }

        @Override
        public final void openArticlePhoto(ChatMessageCell chatMessageCell, TL_iv.PageBlock pageBlock) {
        }

        @Override
        public final void setShouldNotRepeatSticker(MessageObject messageObject) {
        }

        @Override
        public final boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell, boolean z) {
            return false;
        }

        @Override
        public final boolean shouldRepeatSticker(MessageObject messageObject) {
            return true;
        }

        @Override
        public final void videoTimerReached() {
        }

        @Override
        public final void forceUpdate(ChatMessageCell chatMessageCell, boolean z) {
        }
    }

    public final class AnonymousClass5 extends SizeNotifierFrameLayout {
        @Override
        public final boolean isActionBarVisible() {
            return false;
        }

        @Override
        public final boolean isStatusBarVisible$1() {
            return false;
        }

        @Override
        public final boolean useRootView() {
            return false;
        }
    }

    public final class AnonymousClass7 extends MessageObject {
        @Override
        public final boolean isOut() {
            return false;
        }

        @Override
        public final boolean isOutOwner() {
            return false;
        }
    }

    public BotShareSheet(Context context, int i, long j, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File file, TLRPC.WebPage webPage, Theme.ResourcesProvider resourcesProvider, BotWebViewContainer$$ExternalSyntheticLambda5 botWebViewContainer$$ExternalSyntheticLambda5, OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18) {
        BotShareSheet botShareSheet;
        ?? r13;
        ?? r11;
        int i2;
        AnonymousClass7 anonymousClass7Convert;
        TLRPC.TL_document tL_document;
        TLRPC.TL_document tL_document2;
        Object obj;
        TLRPC.TL_photo tL_photo;
        TLRPC.TL_photo tL_photoGeneratePhotoSizes;
        TLRPC.TL_photo tL_photo2;
        super(context, null, false, false, false, resourcesProvider);
        this.openedDialogsActivity = false;
        this.sent = false;
        this.currentAccount = i;
        this.botName = UserObject.getUserName(MessagesController.getInstance(i).getUser(Long.valueOf(j)));
        this.whenDone = oAuthSheet$$ExternalSyntheticLambda18;
        setSlidingActionBar();
        this.headerPaddingTop = AndroidUtilities.dp(4.0f);
        this.headerPaddingBottom = AndroidUtilities.dp(-10.0f);
        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
        if (file != null && file.exists() && webPage == null) {
            String str = botInlineResult.type;
            String absolutePath = file.getAbsolutePath();
            str.getClass();
            switch (str) {
                case "sticker":
                case "gif":
                case "file":
                case "audio":
                case "video":
                case "voice":
                    tL_document = new TLRPC.TL_document();
                    tL_document.id = 0L;
                    tL_document.size = 0L;
                    tL_document.dc_id = 0;
                    tL_document.mime_type = botInlineResult.content.mime_type;
                    tL_document.file_reference = new byte[0];
                    tL_document.date = ConnectionsManager.getInstance(i).getCurrentTime();
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_document.attributes.add(tL_documentAttributeFilename);
                    switch (str) {
                        case "sticker":
                            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                            tL_documentAttributeSticker.alt = "";
                            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_document.attributes.add(tL_documentAttributeSticker);
                            TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
                            tL_documentAttributeImageSize.w = inlineResultWidthAndHeight[0];
                            tL_documentAttributeImageSize.h = inlineResultWidthAndHeight[1];
                            tL_document.attributes.add(tL_documentAttributeImageSize);
                            tL_documentAttributeFilename.file_name = "sticker.webp";
                            try {
                                if (botInlineResult.thumb == null) {
                                    tL_document2 = null;
                                } else {
                                    tL_document2 = null;
                                    try {
                                        Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(new File(FileLoader.getDirectory(4), Utilities.MD5(botInlineResult.thumb.url) + "." + ImageLoader.getHttpUrlExtension(botInlineResult.thumb.url, "webp")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                        if (bitmapLoadBitmap != null) {
                                            TLRPC.PhotoSize photoSizeScaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmapLoadBitmap, 90.0f, 90.0f, 55, false);
                                            if (photoSizeScaleAndSaveImage != null) {
                                                tL_document.thumbs.add(photoSizeScaleAndSaveImage);
                                                tL_document.flags |= 1;
                                            }
                                            bitmapLoadBitmap.recycle();
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        FileLog.e(th);
                                    }
                                }
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                                tL_document2 = null;
                            }
                            break;
                        case "gif":
                            tL_documentAttributeFilename.file_name = "animation.gif";
                            if (absolutePath.endsWith("mp4")) {
                                tL_document.mime_type = "video/mp4";
                                tL_document.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                            } else {
                                tL_document.mime_type = "image/gif";
                            }
                            tL_document2 = null;
                            break;
                        case "file":
                            int iLastIndexOf = botInlineResult.content.mime_type.lastIndexOf(47);
                            if (iLastIndexOf != -1) {
                                tL_documentAttributeFilename.file_name = "file." + botInlineResult.content.mime_type.substring(iLastIndexOf + 1);
                            } else {
                                tL_documentAttributeFilename.file_name = "file";
                            }
                            tL_document2 = null;
                            break;
                        case "audio":
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio.duration = MessageObject.getInlineResultDuration(botInlineResult);
                            tL_documentAttributeAudio.title = botInlineResult.title;
                            int i3 = tL_documentAttributeAudio.flags;
                            tL_documentAttributeAudio.flags = i3 | 1;
                            String str2 = botInlineResult.description;
                            if (str2 != null) {
                                tL_documentAttributeAudio.performer = str2;
                                tL_documentAttributeAudio.flags = i3 | 3;
                            }
                            tL_documentAttributeFilename.file_name = "audio.mp3";
                            tL_document.attributes.add(tL_documentAttributeAudio);
                            tL_document2 = null;
                            break;
                        case "video":
                            tL_documentAttributeFilename.file_name = "video.mp4";
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                            int[] inlineResultWidthAndHeight2 = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
                            tL_documentAttributeVideo.w = inlineResultWidthAndHeight2[0];
                            tL_documentAttributeVideo.h = inlineResultWidthAndHeight2[1];
                            tL_documentAttributeVideo.duration = MessageObject.getInlineResultDuration(botInlineResult);
                            tL_documentAttributeVideo.supports_streaming = true;
                            tL_document.attributes.add(tL_documentAttributeVideo);
                            try {
                                if (botInlineResult.thumb != null) {
                                    Bitmap bitmapLoadBitmap2 = ImageLoader.loadBitmap(new File(FileLoader.getDirectory(4), Utilities.MD5(botInlineResult.thumb.url) + "." + ImageLoader.getHttpUrlExtension(botInlineResult.thumb.url, "jpg")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                    if (bitmapLoadBitmap2 != null) {
                                        TLRPC.PhotoSize photoSizeScaleAndSaveImage2 = ImageLoader.scaleAndSaveImage(bitmapLoadBitmap2, 90.0f, 90.0f, 55, false);
                                        if (photoSizeScaleAndSaveImage2 != null) {
                                            tL_document.thumbs.add(photoSizeScaleAndSaveImage2);
                                            tL_document.flags |= 1;
                                        }
                                        bitmapLoadBitmap2.recycle();
                                    }
                                }
                                break;
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                            }
                            tL_document2 = null;
                            break;
                        case "voice":
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio2.duration = MessageObject.getInlineResultDuration(botInlineResult);
                            tL_documentAttributeAudio2.voice = true;
                            tL_documentAttributeFilename.file_name = "audio.ogg";
                            tL_document.attributes.add(tL_documentAttributeAudio2);
                            tL_document2 = null;
                            break;
                        default:
                            tL_document2 = null;
                            break;
                    }
                    if (tL_documentAttributeFilename.file_name == null) {
                        tL_documentAttributeFilename.file_name = "file";
                    }
                    if (tL_document.mime_type == null) {
                        tL_document.mime_type = "application/octet-stream";
                    }
                    if (tL_document.thumbs.isEmpty()) {
                        TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                        int[] inlineResultWidthAndHeight3 = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
                        tL_photoSize.w = inlineResultWidthAndHeight3[0];
                        tL_photoSize.h = inlineResultWidthAndHeight3[1];
                        tL_photoSize.size = 0;
                        tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_photoSize.type = "x";
                        tL_document.thumbs.add(tL_photoSize);
                        tL_document.flags |= 1;
                    }
                    obj = tL_document2;
                    break;
                case "photo":
                    if (file.exists()) {
                        tL_photoGeneratePhotoSizes = SendMessagesHelper.getInstance(i).generatePhotoSizes(absolutePath, null);
                    } else {
                        tL_photo = null;
                    }
                    if (tL_photo == null) {
                        tL_photo = tL_photoGeneratePhotoSizes;
                        tL_photo = new TLRPC.TL_photo();
                        tL_photo.date = ConnectionsManager.getInstance(i).getCurrentTime();
                        tL_photo.file_reference = new byte[0];
                        TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                        int[] inlineResultWidthAndHeight4 = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
                        tL_photoSize2.w = inlineResultWidthAndHeight4[0];
                        tL_photoSize2.h = inlineResultWidthAndHeight4[1];
                        tL_photoSize2.size = 1;
                        tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_photoSize2.type = "x";
                        tL_photo.sizes.add(tL_photoSize2);
                    }
                    tL_photo = tL_photoGeneratePhotoSizes;
                    tL_document = null;
                    tL_photo2 = tL_photo;
                    tL_document2 = tL_document;
                    obj = tL_photo2;
                    break;
                default:
                    tL_photo2 = null;
                    tL_document = null;
                    tL_document2 = tL_document;
                    obj = tL_photo2;
                    break;
            }
            botShareSheet = this;
            r13 = tL_document2;
            r11 = 0;
            i2 = -1;
            anonymousClass7Convert = convert(i, j, botInlineResult, obj, tL_document, null);
        } else {
            botShareSheet = this;
            r13 = 0;
            r11 = 0;
            i2 = -1;
            anonymousClass7Convert = convert(i, j, botInlineResult, null, null, webPage);
        }
        AnonymousClass7 anonymousClass7 = anonymousClass7Convert;
        ChatActionCell chatActionCell = new ChatActionCell(context, resourcesProvider, r11);
        chatActionCell.setDelegate(new AnonymousClass2());
        chatActionCell.setCustomText(LocaleController.getString(R.string.BotShareMessagePreview));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(context, i, false, null, null);
        anonymousClass3.setDelegate(new AnonymousClass4());
        anonymousClass3.setMessageObject(anonymousClass7, null, false, false, false, false);
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        linearLayoutM.addView(chatActionCell, LayoutHelper.createLinear(i2, -2));
        linearLayoutM.addView(anonymousClass3, LayoutHelper.createLinear(i2, -2));
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(context, r13);
        botShareSheet.chatView = anonymousClass5;
        anonymousClass5.setBackgroundImage(PreviewView.getBackgroundDrawable((Drawable) r13, i, j, Theme.currentTheme.isDark()));
        anonymousClass5.addView(linearLayoutM, LayoutHelper.createFrame(-1, -1.0f, 119, 4.0f, 8.0f, 4.0f, 8.0f));
        ?? frameLayout = new FrameLayout(context);
        ?? M = zzlp.m(context, resourcesProvider, true);
        M.setText(LocaleController.getString(R.string.BotShareMessageShare), r11, true);
        BotShareSheet botShareSheet2 = botShareSheet;
        M.setOnClickListener(new BotShareSheet$$ExternalSyntheticLambda10(botShareSheet2, tL_messages_preparedInlineMessage, oAuthSheet$$ExternalSyntheticLambda18, i, j, botWebViewContainer$$ExternalSyntheticLambda5));
        frameLayout.addView(M, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? r0 = botShareSheet2.containerView;
        int i4 = botShareSheet2.backgroundPaddingLeft;
        r0.addView(frameLayout, LayoutHelper.createFrameMarginPx(-2.0f, 87, i4, 0, i4, 0));
        ?? r1 = botShareSheet2.recyclerListView;
        int i5 = botShareSheet2.backgroundPaddingLeft;
        r1.setPadding(i5, r11, i5, AndroidUtilities.dp(68.0f) + 1);
        botShareSheet2.recyclerListView.setSections();
        int i6 = Theme.key_windowBackgroundGray;
        botShareSheet2.setBackgroundColor(botShareSheet2.getThemedColor(i6));
        botShareSheet2.fixNavigationBar(botShareSheet2.getThemedColor(i6));
        botShareSheet2.adapter.update(r11);
    }

    public static AnonymousClass7 convert(int i, long j, TLRPC.BotInlineResult botInlineResult, TLRPC.TL_photo tL_photo, TLRPC.TL_document tL_document, TLRPC.WebPage webPage) {
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.Photo photo;
        TLRPC.Photo photo2 = tL_photo;
        if (tL_photo == null) {
            photo = botInlineResult.photo;
        }
        if (tL_document == 0) {
            photo2 = photo;
            tL_document = botInlineResult.document;
        }
        photo2 = photo;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = false;
        tL_message.flags |= 2048;
        tL_message.via_bot_id = j;
        tL_message.date = ConnectionsManager.getInstance(i).getCurrentTime();
        tL_message.peer_id = MessagesController.getInstance(i).getPeer(UserConfig.getInstance(i).getClientUserId());
        tL_message.from_id = MessagesController.getInstance(i).getPeer(UserConfig.getInstance(i).getClientUserId());
        TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
        if (botInlineMessage != null) {
            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageText) {
                TLRPC.TL_botInlineMessageText tL_botInlineMessageText = (TLRPC.TL_botInlineMessageText) botInlineMessage;
                tL_message.message = tL_botInlineMessageText.message;
                tL_message.entities = tL_botInlineMessageText.entities;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaContact) {
                TLRPC.TL_botInlineMessageMediaContact tL_botInlineMessageMediaContact = (TLRPC.TL_botInlineMessageMediaContact) botInlineMessage;
                TLRPC.TL_messageMediaContact tL_messageMediaContact = new TLRPC.TL_messageMediaContact();
                tL_messageMediaContact.phone_number = tL_botInlineMessageMediaContact.phone_number;
                tL_messageMediaContact.first_name = tL_botInlineMessageMediaContact.first_name;
                tL_messageMediaContact.last_name = tL_botInlineMessageMediaContact.last_name;
                tL_messageMediaContact.vcard = tL_botInlineMessageMediaContact.vcard;
                tL_message.flags |= 512;
                tL_message.media = tL_messageMediaContact;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) {
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = ((TLRPC.TL_botInlineMessageMediaGeo) botInlineMessage).geo;
                tL_message.flags |= 512;
                tL_message.media = tL_messageMediaGeo;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
                TLRPC.TL_botInlineMessageMediaVenue tL_botInlineMessageMediaVenue = (TLRPC.TL_botInlineMessageMediaVenue) botInlineMessage;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                tL_messageMediaVenue.geo = tL_botInlineMessageMediaVenue.geo;
                tL_messageMediaVenue.title = tL_botInlineMessageMediaVenue.title;
                tL_messageMediaVenue.address = tL_botInlineMessageMediaVenue.address;
                tL_messageMediaVenue.venue_id = tL_botInlineMessageMediaVenue.venue_id;
                tL_messageMediaVenue.provider = tL_botInlineMessageMediaVenue.venue_type;
                tL_message.flags |= 512;
                tL_message.media = tL_messageMediaVenue;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaAuto) {
                TLRPC.TL_botInlineMessageMediaAuto tL_botInlineMessageMediaAuto = (TLRPC.TL_botInlineMessageMediaAuto) botInlineMessage;
                tL_message.message = tL_botInlineMessageMediaAuto.message;
                if (TLObject.hasFlag(tL_botInlineMessageMediaAuto.flags, 2)) {
                    tL_message.flags |= 128;
                    tL_message.entities = tL_botInlineMessageMediaAuto.entities;
                }
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                TLRPC.TL_botInlineMessageMediaInvoice tL_botInlineMessageMediaInvoice = (TLRPC.TL_botInlineMessageMediaInvoice) botInlineMessage;
                TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice = new TLRPC.TL_messageMediaInvoice();
                tL_messageMediaInvoice.shipping_address_requested = tL_botInlineMessageMediaInvoice.shipping_address_requested;
                tL_messageMediaInvoice.test = tL_botInlineMessageMediaInvoice.test;
                tL_messageMediaInvoice.title = tL_botInlineMessageMediaInvoice.title;
                tL_messageMediaInvoice.description = tL_botInlineMessageMediaInvoice.description;
                if (TLObject.hasFlag(tL_botInlineMessageMediaInvoice.flags, 1)) {
                    tL_messageMediaInvoice.flags |= 128;
                    tL_messageMediaInvoice.webPhoto = tL_botInlineMessageMediaInvoice.photo;
                }
                tL_messageMediaInvoice.currency = tL_botInlineMessageMediaInvoice.currency;
                tL_messageMediaInvoice.total_amount = tL_botInlineMessageMediaInvoice.total_amount;
                tL_message.flags |= 512;
                tL_message.media = tL_messageMediaInvoice;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage) {
                TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_messageMediaWebPage.force_large_media = tL_botInlineMessageMediaWebPage.force_large_media;
                tL_messageMediaWebPage.force_small_media = tL_botInlineMessageMediaWebPage.force_small_media;
                tL_messageMediaWebPage.manual = tL_botInlineMessageMediaWebPage.manual;
                tL_messageMediaWebPage.safe = tL_botInlineMessageMediaWebPage.safe;
                tL_message.invert_media = tL_botInlineMessageMediaWebPage.invert_media;
                tL_message.message = tL_botInlineMessageMediaWebPage.message;
                if (webPage != null) {
                    tL_messageMediaWebPage.webpage = webPage;
                } else {
                    TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                    if (TLObject.hasFlag(tL_botInlineMessageMediaWebPage.flags, 2)) {
                        tL_message.flags |= 128;
                        tL_message.entities = tL_botInlineMessageMediaWebPage.entities;
                    }
                    String str = tL_botInlineMessageMediaWebPage.url;
                    tL_webPage.display_url = str;
                    tL_webPage.url = str;
                    tL_messageMediaWebPage.webpage = tL_webPage;
                }
                tL_message.flags |= 512;
                tL_message.media = tL_messageMediaWebPage;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageRichMessage) {
                tL_message.flags2 |= 8192;
                tL_message.rich_message = ((TLRPC.TL_botInlineMessageRichMessage) botInlineMessage).rich_message;
            }
        }
        if (photo2 != null) {
            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
            tL_messageMediaPhoto.photo = photo2;
            tL_message.flags |= 512;
            tL_message.media = tL_messageMediaPhoto;
        } else if (tL_document != 0) {
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_messageMediaDocument.flags |= 1;
            tL_messageMediaDocument.voice = "voice".equalsIgnoreCase(botInlineResult.type);
            tL_messageMediaDocument.round = "round".equalsIgnoreCase(botInlineResult.type);
            tL_messageMediaDocument.document = tL_document;
            tL_message.flags |= 512;
            tL_message.media = tL_messageMediaDocument;
        }
        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
        if (botInlineMessage2 != null && (replyMarkup = botInlineMessage2.reply_markup) != null) {
            tL_message.flags |= 64;
            tL_message.reply_markup = replyMarkup;
        }
        return new AnonymousClass7(i, tL_message, true, true);
    }

    public static void share(Context context, int i, long j, String str, Theme.ResourcesProvider resourcesProvider, BotWebViewContainer$$ExternalSyntheticLambda5 botWebViewContainer$$ExternalSyntheticLambda5, OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18) {
        AlertDialog alertDialog = new AlertDialog(context, 3, null);
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
        TLRPC.TL_messages_getPreparedInlineMessage tL_messages_getPreparedInlineMessage = new TLRPC.TL_messages_getPreparedInlineMessage();
        tL_messages_getPreparedInlineMessage.bot = MessagesController.getInstance(i).getInputUser(j);
        tL_messages_getPreparedInlineMessage.id = str;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getPreparedInlineMessage, new LaunchActivity$$ExternalSyntheticLambda147(i, alertDialog, context, j, resourcesProvider, botWebViewContainer$$ExternalSyntheticLambda5, oAuthSheet$$ExternalSyntheticLambda18));
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new TodoItemMenu$$ExternalSyntheticLambda17(this, 11), this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        if (this.openedDialogsActivity || this.sent) {
            return;
        }
        this.sent = true;
        OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18 = this.whenDone;
        if (oAuthSheet$$ExternalSyntheticLambda18 != null) {
            oAuthSheet$$ExternalSyntheticLambda18.run("USER_DECLINED", null);
        }
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.BotShareMessage);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RecyclerListView recyclerListView = this.recyclerListView;
        recyclerListView.scrollToPosition(Math.max((recyclerListView.getAdapter() == null ? 0 : recyclerListView.getAdapter().getItemCount()) - 1, 0));
    }
}
