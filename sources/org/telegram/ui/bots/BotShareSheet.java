package org.telegram.ui.bots;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.web.HttpGetFileTask;

public class BotShareSheet extends BottomSheetWithRecyclerListView {
    private final ChatActionCell actionCell;
    private UniversalAdapter adapter;
    private final long botId;
    private final String botName;
    private final ButtonWithCounterView button;
    private final FrameLayout buttonContainer;
    private final LinearLayout chatListView;
    private final SizeNotifierFrameLayout chatView;
    private final int currentAccount;
    private final TLRPC.TL_messages_preparedInlineMessage message;
    private final ChatMessageCell messageCell;
    private MessageObject messageObject;
    private boolean openedDialogsActivity;
    private boolean sent;
    private final Utilities.Callback2 whenDone;

    public static void share(final Context context, final int i, final long j, String str, final Theme.ResourcesProvider resourcesProvider, final Runnable runnable, final Utilities.Callback2 callback2) {
        final AlertDialog alertDialog = new AlertDialog(context, 3);
        alertDialog.showDelayed(500L);
        TLRPC.TL_messages_getPreparedInlineMessage tL_messages_getPreparedInlineMessage = new TLRPC.TL_messages_getPreparedInlineMessage();
        tL_messages_getPreparedInlineMessage.bot = MessagesController.getInstance(i).getInputUser(j);
        tL_messages_getPreparedInlineMessage.id = str;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getPreparedInlineMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                BotShareSheet.lambda$share$6(i, alertDialog, context, j, resourcesProvider, runnable, callback2, tLObject, tL_error);
            }
        });
    }

    public static void lambda$share$6(final int i, final AlertDialog alertDialog, final Context context, final long j, final Theme.ResourcesProvider resourcesProvider, final Runnable runnable, final Utilities.Callback2 callback2, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotShareSheet.lambda$share$5(tLObject, i, alertDialog, context, j, resourcesProvider, runnable, callback2);
            }
        });
    }

    public static void lambda$share$5(TLObject tLObject, final int i, final AlertDialog alertDialog, final Context context, final long j, final Theme.ResourcesProvider resourcesProvider, final Runnable runnable, final Utilities.Callback2 callback2) {
        String extensionByMimeType;
        if (!(tLObject instanceof TLRPC.TL_messages_preparedInlineMessage)) {
            if (callback2 != null) {
                callback2.run("MESSAGE_EXPIRED", null);
                return;
            }
            return;
        }
        final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject;
        TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage) {
            TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
            if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                final Runnable runnableLoadWebPagePreview = loadWebPagePreview(i, tL_botInlineMessageMediaWebPage.url, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        BotShareSheet.lambda$share$0(alertDialog, context, i, j, tL_messages_preparedInlineMessage, resourcesProvider, runnable, callback2, (TLRPC.WebPage) obj);
                    }
                });
                alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public final void onCancel(DialogInterface dialogInterface) {
                        runnableLoadWebPagePreview.run();
                    }
                });
                return;
            }
        }
        final File[] fileArr = new File[1];
        final Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                BotShareSheet.lambda$share$2(alertDialog, context, i, j, tL_messages_preparedInlineMessage, fileArr, resourcesProvider, runnable, callback2);
            }
        };
        TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
        if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
            TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
            TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
            if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                String str = botInlineResult.content.url;
                String httpUrlExtension = ImageLoader.getHttpUrlExtension(str, null);
                if (TextUtils.isEmpty(httpUrlExtension)) {
                    extensionByMimeType = FileLoader.getExtensionByMimeType(tL_messages_preparedInlineMessage.result.content.mime_type);
                } else {
                    extensionByMimeType = "." + httpUrlExtension;
                }
                File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str) + extensionByMimeType);
                if (!file.exists()) {
                    final HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            BotShareSheet.lambda$share$3(fileArr, runnable2, (File) obj);
                        }
                    }, null);
                    httpGetFileTask.setDestFile(file);
                    httpGetFileTask.setMaxSize(8388608L);
                    httpGetFileTask.execute(str);
                    alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            httpGetFileTask.cancel(true);
                        }
                    });
                    return;
                }
                runnable2.run();
                return;
            }
        }
        runnable2.run();
    }

    public static void lambda$share$0(AlertDialog alertDialog, Context context, int i, long j, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, Theme.ResourcesProvider resourcesProvider, Runnable runnable, Utilities.Callback2 callback2, TLRPC.WebPage webPage) {
        alertDialog.dismiss();
        new BotShareSheet(context, i, j, tL_messages_preparedInlineMessage, null, webPage, resourcesProvider, runnable, callback2).show();
    }

    public static void lambda$share$2(AlertDialog alertDialog, Context context, int i, long j, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, Theme.ResourcesProvider resourcesProvider, Runnable runnable, Utilities.Callback2 callback2) {
        alertDialog.dismiss();
        new BotShareSheet(context, i, j, tL_messages_preparedInlineMessage, fileArr[0], null, resourcesProvider, runnable, callback2).show();
    }

    public static void lambda$share$3(File[] fileArr, Runnable runnable, File file) {
        fileArr[0] = file;
        runnable.run();
    }

    public static Runnable loadWebPagePreview(final int i, String str, final Utilities.Callback callback) {
        final int[] iArr = new int[1];
        final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = str;
        iArr[0] = ConnectionsManager.getInstance(i).sendRequestTyped(getwebpagepreview, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                BotShareSheet.lambda$loadWebPagePreview$7(iArr, callback, notificationCenterDelegateArr, i, (TL_account.webPagePreview) obj, (TLRPC.TL_error) obj2);
            }
        });
        return new Runnable() {
            @Override
            public final void run() {
                BotShareSheet.lambda$loadWebPagePreview$8(iArr, i, notificationCenterDelegateArr);
            }
        };
    }

    public static void lambda$loadWebPagePreview$7(int[] iArr, final Utilities.Callback callback, final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr, final int i, TL_account.webPagePreview webpagepreview, TLRPC.TL_error tL_error) {
        iArr[0] = -1;
        TLRPC.MessageMedia messageMedia = webpagepreview.media;
        if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (!(webPage instanceof TLRPC.TL_webPageEmpty)) {
                if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                    if (webPage instanceof TLRPC.TL_webPagePending) {
                        final long j = webPage.id;
                        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = new NotificationCenter.NotificationCenterDelegate() {
                            @Override
                            public void didReceivedNotification(int i2, int i3, Object... objArr) {
                                LongSparseArray longSparseArray;
                                int i4 = NotificationCenter.didReceivedWebpagesInUpdates;
                                if (i2 == i4 && (longSparseArray = (LongSparseArray) objArr[0]) != null && longSparseArray.containsKey(j)) {
                                    TLRPC.WebPage webPage2 = (TLRPC.WebPage) longSparseArray.get(j);
                                    if (notificationCenterDelegateArr[0] != null) {
                                        NotificationCenter.getInstance(i).addObserver(notificationCenterDelegateArr[0], i4);
                                        notificationCenterDelegateArr[0] = null;
                                    }
                                    Utilities.Callback callback2 = callback;
                                    if (!(webPage2 instanceof TLRPC.TL_webPage)) {
                                        webPage2 = null;
                                    }
                                    callback2.run(webPage2);
                                }
                            }
                        };
                        notificationCenterDelegateArr[0] = notificationCenterDelegate;
                        NotificationCenter.getInstance(i).addObserver(notificationCenterDelegate, NotificationCenter.didReceivedWebpagesInUpdates);
                        return;
                    }
                    callback.run(webPage instanceof TLRPC.TL_webPage ? webPage : null);
                    return;
                }
                callback.run(null);
                return;
            }
        }
        callback.run(null);
    }

    public static void lambda$loadWebPagePreview$8(int[] iArr, int i, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        if (iArr[0] >= 0) {
            ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
            iArr[0] = -1;
        }
        if (notificationCenterDelegateArr[0] != null) {
            NotificationCenter.getInstance(i).addObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
            notificationCenterDelegateArr[0] = null;
        }
    }

    public BotShareSheet(Context context, final int i, final long j, final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File file, TLRPC.WebPage webPage, Theme.ResourcesProvider resourcesProvider, final Runnable runnable, final Utilities.Callback2 callback2) {
        super(context, null, false, false, false, resourcesProvider);
        this.openedDialogsActivity = false;
        this.sent = false;
        this.currentAccount = i;
        this.message = tL_messages_preparedInlineMessage;
        this.botId = j;
        this.botName = UserObject.getUserName(MessagesController.getInstance(i).getUser(Long.valueOf(j)));
        this.whenDone = callback2;
        setSlidingActionBar();
        this.headerPaddingTop = AndroidUtilities.dp(4.0f);
        this.headerPaddingBottom = AndroidUtilities.dp(-10.0f);
        this.messageObject = convert(i, j, tL_messages_preparedInlineMessage.result, file, webPage);
        ChatActionCell chatActionCell = new ChatActionCell(context, false, resourcesProvider);
        this.actionCell = chatActionCell;
        chatActionCell.setDelegate(new ChatActionCell.ChatActionCellDelegate() {
            @Override
            public boolean canDrawOutboundsContent() {
                return ChatActionCell.ChatActionCellDelegate.CC.$default$canDrawOutboundsContent(this);
            }

            @Override
            public void didClickButton(ChatActionCell chatActionCell2) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didClickButton(this, chatActionCell2);
            }

            @Override
            public void didClickImage(ChatActionCell chatActionCell2) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didClickImage(this, chatActionCell2);
            }

            @Override
            public boolean didLongPress(ChatActionCell chatActionCell2, float f, float f2) {
                return ChatActionCell.ChatActionCellDelegate.CC.$default$didLongPress(this, chatActionCell2, f, f2);
            }

            @Override
            public void didOpenPremiumGift(ChatActionCell chatActionCell2, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str, boolean z) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didOpenPremiumGift(this, chatActionCell2, tL_premiumGiftOption, str, z);
            }

            @Override
            public void didOpenPremiumGiftChannel(ChatActionCell chatActionCell2, String str, boolean z) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didOpenPremiumGiftChannel(this, chatActionCell2, str, z);
            }

            @Override
            public void didPressReaction(ChatActionCell chatActionCell2, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didPressReaction(this, chatActionCell2, reactionCount, z, f, f2);
            }

            @Override
            public void didPressReplyMessage(ChatActionCell chatActionCell2, int i2) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didPressReplyMessage(this, chatActionCell2, i2);
            }

            @Override
            public void didPressTaskLink(ChatActionCell chatActionCell2, int i2, int i3) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didPressTaskLink(this, chatActionCell2, i2, i3);
            }

            @Override
            public void forceUpdate(ChatActionCell chatActionCell2, boolean z) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$forceUpdate(this, chatActionCell2, z);
            }

            @Override
            public BaseFragment getBaseFragment() {
                return ChatActionCell.ChatActionCellDelegate.CC.$default$getBaseFragment(this);
            }

            @Override
            public long getDialogId() {
                return ChatActionCell.ChatActionCellDelegate.CC.$default$getDialogId(this);
            }

            @Override
            public long getTopicId() {
                return ChatActionCell.ChatActionCellDelegate.CC.$default$getTopicId(this);
            }

            @Override
            public void needOpenInviteLink(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$needOpenInviteLink(this, tL_chatInviteExported);
            }

            @Override
            public void needOpenUserProfile(long j2) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$needOpenUserProfile(this, j2);
            }

            @Override
            public void needShowEffectOverlay(ChatActionCell chatActionCell2, TLRPC.Document document, TLRPC.VideoSize videoSize) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$needShowEffectOverlay(this, chatActionCell2, document, videoSize);
            }

            @Override
            public void onTopicClick(ChatActionCell chatActionCell2) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$onTopicClick(this, chatActionCell2);
            }
        });
        chatActionCell.setCustomText(LocaleController.getString(R.string.BotShareMessagePreview));
        ChatMessageCell chatMessageCell = new ChatMessageCell(context, i) {
            @Override
            public boolean isDrawSelectionBackground() {
                return false;
            }
        };
        this.messageCell = chatMessageCell;
        chatMessageCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
            @Override
            public boolean allowAddPollOptions() {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$allowAddPollOptions(this);
            }

            @Override
            public boolean canDrawOutboundsContent() {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canDrawOutboundsContent(this);
            }

            @Override
            public boolean canPerformActions() {
                return false;
            }

            @Override
            public boolean canPerformReply() {
                return canPerformActions();
            }

            @Override
            public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canToggleRichMessageCheckbox(this, chatMessageCell2);
            }

            @Override
            public void didLongPress(ChatMessageCell chatMessageCell2, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPress(this, chatMessageCell2, f, f2);
            }

            @Override
            public void didLongPressBotButton(ChatMessageCell chatMessageCell2, TLRPC.KeyboardButton keyboardButton) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressBotButton(this, chatMessageCell2, keyboardButton);
            }

            @Override
            public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i2, float f, float f2) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressChannelAvatar(this, chatMessageCell2, chat, i2, f, f2);
            }

            @Override
            public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressCustomBotButton(this, chatMessageCell2, buttonCustom);
            }

            @Override
            public boolean didLongPressPollOption(ChatMessageCell chatMessageCell2, TLRPC.PollAnswer pollAnswer) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressPollOption(this, chatMessageCell2, pollAnswer);
            }

            @Override
            public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressToDoButton(this, chatMessageCell2, todoItem);
            }

            @Override
            public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user, float f, float f2) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressUserAvatar(this, chatMessageCell2, user, f, f2);
            }

            @Override
            public void didPressAboutRevenueSharingAds() {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAboutRevenueSharingAds(this);
            }

            @Override
            public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAddPollOptionButton(this, chatMessageCell2);
            }

            @Override
            public void didPressAdmin(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAdmin(this, chatMessageCell2);
            }

            @Override
            public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell2, AnimatedEmojiSpan animatedEmojiSpan) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAnimatedEmoji(this, chatMessageCell2, animatedEmojiSpan);
            }

            @Override
            public void didPressBoostCounter(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBoostCounter(this, chatMessageCell2);
            }

            @Override
            public void didPressBotButton(ChatMessageCell chatMessageCell2, TLRPC.KeyboardButton keyboardButton) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBotButton(this, chatMessageCell2, keyboardButton);
            }

            @Override
            public void didPressCancelSendButton(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCancelSendButton(this, chatMessageCell2);
            }

            @Override
            public void didPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i2, float f, float f2, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelAvatar(this, chatMessageCell2, chat, i2, f, f2, z);
            }

            @Override
            public void didPressChannelRecommendation(ChatMessageCell chatMessageCell2, TLObject tLObject, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendation(this, chatMessageCell2, tLObject, z);
            }

            @Override
            public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendationsClose(this, chatMessageCell2);
            }

            @Override
            public void didPressCodeCopy(ChatMessageCell chatMessageCell2, MessageObject.TextLayoutBlock textLayoutBlock) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCodeCopy(this, chatMessageCell2, textLayoutBlock);
            }

            @Override
            public void didPressCommentButton(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCommentButton(this, chatMessageCell2);
            }

            @Override
            public void didPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCustomBotButton(this, chatMessageCell2, buttonCustom);
            }

            @Override
            public void didPressEffect(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressEffect(this, chatMessageCell2);
            }

            @Override
            public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell2, TLRPC.KeyboardButton keyboardButton) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressExtendedMediaPreview(this, chatMessageCell2, keyboardButton);
            }

            @Override
            public void didPressFactCheck(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheck(this, chatMessageCell2);
            }

            @Override
            public void didPressFactCheckWhat(ChatMessageCell chatMessageCell2, int i2, int i3) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheckWhat(this, chatMessageCell2, i2, i3);
            }

            @Override
            public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell2, int i2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGiveawayChatButton(this, chatMessageCell2, i2);
            }

            @Override
            public void didPressGroupImage(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGroupImage(this, chatMessageCell2, imageReceiver, messageExtendedMedia, f, f2);
            }

            @Override
            public void didPressHiddenForward(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHiddenForward(this, chatMessageCell2);
            }

            @Override
            public void didPressHint(ChatMessageCell chatMessageCell2, int i2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHint(this, chatMessageCell2, i2);
            }

            @Override
            public void didPressImage(ChatMessageCell chatMessageCell2, float f, float f2, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressImage(this, chatMessageCell2, f, f2, z);
            }

            @Override
            public void didPressInstantButton(ChatMessageCell chatMessageCell2, int i2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressInstantButton(this, chatMessageCell2, i2);
            }

            @Override
            public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressMoreChannelRecommendations(this, chatMessageCell2);
            }

            @Override
            public void didPressOther(ChatMessageCell chatMessageCell2, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressOther(this, chatMessageCell2, f, f2);
            }

            @Override
            public void didPressPollMedia(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressPollMedia(this, chatMessageCell2, imageReceiver, pollAnswer, messageMedia, f, f2, i2);
            }

            @Override
            public void didPressReaction(ChatMessageCell chatMessageCell2, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReaction(this, chatMessageCell2, reactionCount, z, f, f2);
            }

            @Override
            public void didPressReplyMessage(ChatMessageCell chatMessageCell2, int i2, float f, float f2, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReplyMessage(this, chatMessageCell2, i2, f, f2, z);
            }

            @Override
            public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRevealSensitiveContent(this, chatMessageCell2);
            }

            @Override
            public void didPressShowMore(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressShowMore(this, chatMessageCell2);
            }

            @Override
            public void didPressSideButton(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSideButton(this, chatMessageCell2);
            }

            @Override
            public void didPressSponsoredClose(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredClose(this, chatMessageCell2);
            }

            @Override
            public void didPressSponsoredInfo(ChatMessageCell chatMessageCell2, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredInfo(this, chatMessageCell2, f, f2);
            }

            @Override
            public void didPressSummarize(ChatMessageCell chatMessageCell2, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSummarize(this, chatMessageCell2, z);
            }

            @Override
            public void didPressTime(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressTime(this, chatMessageCell2);
            }

            @Override
            public boolean didPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem, boolean z) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressToDoButton(this, chatMessageCell2, todoItem, z);
            }

            @Override
            public void didPressUrl(ChatMessageCell chatMessageCell2, CharacterStyle characterStyle, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUrl(this, chatMessageCell2, characterStyle, z);
            }

            @Override
            public void didPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user, float f, float f2, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserAvatar(this, chatMessageCell2, user, f, f2, z);
            }

            @Override
            public void didPressUserStatus(ChatMessageCell chatMessageCell2, TLRPC.User user, TLRPC.Document document, String str) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserStatus(this, chatMessageCell2, user, document, str);
            }

            @Override
            public void didPressViaBot(ChatMessageCell chatMessageCell2, String str) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBot(this, chatMessageCell2, str);
            }

            @Override
            public void didPressViaBotNotInline(ChatMessageCell chatMessageCell2, long j2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBotNotInline(this, chatMessageCell2, j2);
            }

            @Override
            public void didPressVoteButtons(ChatMessageCell chatMessageCell2, ArrayList arrayList, int i2, int i3, int i4) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressVoteButtons(this, chatMessageCell2, arrayList, i2, i3, i4);
            }

            @Override
            public void didPressWebPage(ChatMessageCell chatMessageCell2, TLRPC.WebPage webPage2, String str, boolean z) {
                Browser.openUrl(chatMessageCell2.getContext(), str);
            }

            @Override
            public void didQuickShareEnd(ChatMessageCell chatMessageCell2, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareEnd(this, chatMessageCell2, f, f2);
            }

            @Override
            public void didQuickShareMove(ChatMessageCell chatMessageCell2, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareMove(this, chatMessageCell2, f, f2);
            }

            @Override
            public void didQuickShareStart(ChatMessageCell chatMessageCell2, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareStart(this, chatMessageCell2, f, f2);
            }

            @Override
            public void didStartVideoStream(MessageObject messageObject) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didStartVideoStream(this, messageObject);
            }

            @Override
            public void didTogglePollPreview(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didTogglePollPreview(this, chatMessageCell2);
            }

            @Override
            public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2, boolean z, Runnable runnable2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didToggleRichMessageCheckbox(this, chatMessageCell2, z, runnable2);
            }

            @Override
            public boolean doNotShowLoadingReply(MessageObject messageObject) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$doNotShowLoadingReply(this, messageObject);
            }

            @Override
            public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$drawPollMode(this, canvas, chatMessageCell2);
            }

            @Override
            public void forceUpdate(ChatMessageCell chatMessageCell2, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdate(this, chatMessageCell2, z);
            }

            @Override
            public void forceUpdate(ChatMessageCell chatMessageCell2, boolean z, boolean z2) {
                forceUpdate(chatMessageCell2, z);
            }

            @Override
            public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell2, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdateNoAnimation(this, chatMessageCell2, z);
            }

            @Override
            public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell2) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAddPollOptionInputFieldHeight(this, chatMessageCell2);
            }

            @Override
            public String getAdminRank(long j2) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAdminRank(this, j2);
            }

            @Override
            public ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getDraftMessageMeasureController(this);
            }

            @Override
            public PinchToZoomHelper getPinchToZoomHelper() {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getPinchToZoomHelper(this);
            }

            @Override
            public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell2) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingBotButtonUrl(this, chatMessageCell2);
            }

            @Override
            public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell2) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingLink(this, chatMessageCell2);
            }

            @Override
            public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getTextSelectionHelper(this);
            }

            @Override
            public boolean hasSelectedMessages() {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$hasSelectedMessages(this);
            }

            @Override
            public void invalidateBlur() {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$invalidateBlur(this);
            }

            @Override
            public boolean isAdmin(long j2) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isAdmin(this, j2);
            }

            @Override
            public boolean isLandscape() {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isLandscape(this);
            }

            @Override
            public boolean isOwner(long j2) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isOwner(this, j2);
            }

            @Override
            public boolean isProgressLoading(ChatMessageCell chatMessageCell2, int i2) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isProgressLoading(this, chatMessageCell2, i2);
            }

            @Override
            public boolean isReplyOrSelf() {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isReplyOrSelf(this);
            }

            @Override
            public boolean keyboardIsOpened() {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$keyboardIsOpened(this);
            }

            @Override
            public void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i2, int i3) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$needOpenWebView(this, messageObject, str, str2, str3, str4, i2, i3);
            }

            @Override
            public boolean needPlayMessage(ChatMessageCell chatMessageCell2, MessageObject messageObject, boolean z) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$needPlayMessage(this, chatMessageCell2, messageObject, z);
            }

            @Override
            public void needReloadPolls() {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$needReloadPolls(this);
            }

            @Override
            public void needShowPremiumBulletin(int i2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$needShowPremiumBulletin(this, i2);
            }

            @Override
            public boolean onAccessibilityAction(int i2, Bundle bundle) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$onAccessibilityAction(this, i2, bundle);
            }

            @Override
            public void onDiceFinished() {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$onDiceFinished(this);
            }

            @Override
            public boolean openArticlePhoto(ChatMessageCell chatMessageCell2, TL_iv.PageBlock pageBlock) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$openArticlePhoto(this, chatMessageCell2, pageBlock);
            }

            @Override
            public void setShouldNotRepeatSticker(MessageObject messageObject) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$setShouldNotRepeatSticker(this, messageObject);
            }

            @Override
            public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell2, boolean z) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldDrawThreadProgress(this, chatMessageCell2, z);
            }

            @Override
            public boolean shouldRepeatSticker(MessageObject messageObject) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldRepeatSticker(this, messageObject);
            }

            @Override
            public void videoTimerReached() {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$videoTimerReached(this);
            }
        });
        chatMessageCell.setMessageObject(this.messageObject, null, false, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.chatListView = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.addView(chatActionCell, LayoutHelper.createLinear(-1, -2));
        linearLayout.addView(chatMessageCell, LayoutHelper.createLinear(-1, -2));
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            @Override
            protected boolean isActionBarVisible() {
                return false;
            }

            @Override
            public boolean isStatusBarVisible() {
                return false;
            }

            @Override
            protected boolean useRootView() {
                return false;
            }
        };
        this.chatView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setBackgroundImage(PreviewView.getBackgroundDrawable((Drawable) null, i, j, Theme.isCurrentThemeDark()), false);
        sizeNotifierFrameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 4.0f, 8.0f, 4.0f, 8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonContainer = frameLayout;
        ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
        this.button = round;
        round.setText(LocaleController.getString(R.string.BotShareMessageShare), false);
        round.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$10(tL_messages_preparedInlineMessage, callback2, i, j, runnable, view);
            }
        });
        frameLayout.addView(round, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ViewGroup viewGroup = this.containerView;
        int i2 = this.backgroundPaddingLeft;
        viewGroup.addView(frameLayout, LayoutHelper.createFrameMarginPx(-1, -2.0f, 87, i2, 0, i2, 0));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i3 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i3, 0, i3, AndroidUtilities.dp(68.0f) + 1);
        this.recyclerListView.setSections();
        int i4 = Theme.key_windowBackgroundGray;
        setBackgroundColor(getThemedColor(i4));
        fixNavigationBar(getThemedColor(i4));
        this.adapter.update(false);
    }

    public void lambda$new$10(final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, final Utilities.Callback2 callback2, final int i, final long j, Runnable runnable, View view) {
        final BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        this.openedDialogsActivity = true;
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("canSelectTopics", true);
        bundle.putInt("dialogsType", 1);
        if (!tL_messages_preparedInlineMessage.peer_types.isEmpty()) {
            bundle.putBoolean("allowGroups", false);
            bundle.putBoolean("allowMegagroups", false);
            bundle.putBoolean("allowLegacyGroups", false);
            bundle.putBoolean("allowUsers", false);
            bundle.putBoolean("allowChannels", false);
            bundle.putBoolean("allowBots", false);
            Iterator<TLRPC.InlineQueryPeerType> it = tL_messages_preparedInlineMessage.peer_types.iterator();
            while (it.hasNext()) {
                TLRPC.InlineQueryPeerType next = it.next();
                if (next instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                    bundle.putBoolean("allowUsers", true);
                } else if (next instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                    bundle.putBoolean("allowBots", true);
                } else if (next instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                    bundle.putBoolean("allowChannels", true);
                } else if (next instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                    bundle.putBoolean("allowLegacyGroups", true);
                } else if (next instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                    bundle.putBoolean("allowMegagroups", true);
                }
            }
        }
        DialogsActivity dialogsActivity = new DialogsActivity(bundle) {
            @Override
            public boolean clickSelectsDialog() {
                return true;
            }

            @Override
            public void onFragmentDestroy() {
                super.onFragmentDestroy();
                if (BotShareSheet.this.sent) {
                    return;
                }
                BotShareSheet.this.sent = true;
                Utilities.Callback2 callback22 = callback2;
                if (callback22 != null) {
                    callback22.run("USER_DECLINED", null);
                }
            }
        };
        dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
            @Override
            public boolean canSelectStories() {
                return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
            }

            @Override
            public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i2, int i3, TopicsFragment topicsFragment) {
                return this.f$0.lambda$new$9(i, tL_messages_preparedInlineMessage, j, safeLastFragment, callback2, dialogsActivity2, arrayList, charSequence, z, z2, i2, i3, topicsFragment);
            }

            @Override
            public boolean didSelectStories(DialogsActivity dialogsActivity2) {
                return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity2);
            }
        });
        safeLastFragment.presentFragment(dialogsActivity);
        lambda$new$0();
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean lambda$new$9(int i, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, long j, BaseFragment baseFragment, Utilities.Callback2 callback2, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i2, int i3, TopicsFragment topicsFragment) {
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            MessageObject messageObject = null;
            if (!it.hasNext()) {
                break;
            }
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) it.next();
            long j2 = topicKey.dialogId;
            long j3 = topicKey.topicId;
            if (!DialogObject.isEncryptedDialog(j2)) {
                if (j3 != 0 && (tL_forumTopicFindTopic = MessagesController.getInstance(i).getTopicsController().findTopic(-j2, j3)) != null && tL_forumTopicFindTopic.topicStartMessage != null) {
                    messageObject = new MessageObject(i, tL_forumTopicFindTopic.topicStartMessage, false, false);
                    messageObject.isTopicMainMessage = true;
                }
                HashMap map = new HashMap();
                map.put("query_id", "" + tL_messages_preparedInlineMessage.query_id);
                map.put("id", "" + tL_messages_preparedInlineMessage.result.id);
                map.put("bot", "" + j);
                SendMessagesHelper.prepareSendingBotContextResult(baseFragment, AccountInstance.getInstance(i), tL_messages_preparedInlineMessage.result, map, j2, messageObject, messageObject, null, null, z2, i2, 0, null, 0, 0L);
                if (charSequence != null) {
                    SendMessagesHelper.getInstance(i).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j2, messageObject, messageObject, null, true, null, null, null, true, 0, 0, null, false));
                }
                arrayList2.add(Long.valueOf(j2));
            }
        }
        if (!this.sent) {
            this.sent = true;
            if (callback2 != null) {
                callback2.run(arrayList2.size() <= 0 ? "USER_DECLINED" : null, arrayList2);
            }
        }
        if (topicsFragment != null) {
            topicsFragment.finishFragment();
            dialogsActivity.removeSelfFromStack();
        } else {
            dialogsActivity.finishFragment();
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.recyclerListView.scrollToPosition(Math.max((this.recyclerListView.getAdapter() == null ? 0 : this.recyclerListView.getAdapter().getItemCount()) - 1, 0));
    }

    @Override
    public void lambda$new$0() {
        super.lambda$new$0();
        if (this.openedDialogsActivity || this.sent) {
            return;
        }
        this.sent = true;
        Utilities.Callback2 callback2 = this.whenDone;
        if (callback2 != null) {
            callback2.run("USER_DECLINED", null);
        }
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.BotShareMessage);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asCustom(-1, this.chatView));
        arrayList.add(UItem.asShadow(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, this.botName))));
    }

    public static org.telegram.messenger.MessageObject convert(int r19, long r20, org.telegram.tgnet.TLRPC.BotInlineResult r22, java.io.File r23, org.telegram.tgnet.TLRPC.WebPage r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bots.BotShareSheet.convert(int, long, org.telegram.tgnet.TLRPC$BotInlineResult, java.io.File, org.telegram.tgnet.TLRPC$WebPage):org.telegram.messenger.MessageObject");
    }

    public static MessageObject convert(int i, long j, TLRPC.BotInlineResult botInlineResult, TLRPC.Photo photo, TLRPC.Document document, TLRPC.WebPage webPage) {
        TLRPC.ReplyMarkup replyMarkup;
        if (photo == null) {
            photo = botInlineResult.photo;
        }
        if (document == null) {
            document = botInlineResult.document;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = false;
        tL_message.flags |= 2048;
        tL_message.via_bot_id = j;
        tL_message.date = ConnectionsManager.getInstance(i).getCurrentTime();
        tL_message.peer_id = MessagesController.getInstance(i).getPeer(UserConfig.getInstance(i).getClientUserId());
        tL_message.from_id = MessagesController.getInstance(i).getPeer(UserConfig.getInstance(i).getClientUserId());
        TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
        boolean z = true;
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
        if (photo != null) {
            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
            tL_messageMediaPhoto.photo = photo;
            tL_message.flags |= 512;
            tL_message.media = tL_messageMediaPhoto;
        } else if (document != null) {
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_messageMediaDocument.flags |= 1;
            tL_messageMediaDocument.voice = "voice".equalsIgnoreCase(botInlineResult.type);
            tL_messageMediaDocument.round = "round".equalsIgnoreCase(botInlineResult.type);
            tL_messageMediaDocument.document = document;
            tL_message.flags |= 512;
            tL_message.media = tL_messageMediaDocument;
        }
        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
        if (botInlineMessage2 != null && (replyMarkup = botInlineMessage2.reply_markup) != null) {
            tL_message.flags |= 64;
            tL_message.reply_markup = replyMarkup;
        }
        return new MessageObject(i, tL_message, z, z) {
            @Override
            public boolean isOut() {
                return false;
            }

            @Override
            public boolean isOutOwner() {
                return false;
            }
        };
    }
}
