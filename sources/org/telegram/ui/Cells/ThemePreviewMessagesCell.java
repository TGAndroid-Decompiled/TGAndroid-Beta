package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$KeyboardButton;
import org.telegram.tgnet.TLRPC$ReactionCount;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageEntityCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_messageEntityTextUrl;
import org.telegram.tgnet.TLRPC$TL_messageMediaEmpty;
import org.telegram.tgnet.TLRPC$TL_messageReplyHeader;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Cells.ThemePreviewMessagesCell;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.PinchToZoomHelper;
public class ThemePreviewMessagesCell extends LinearLayout {
    private Drawable backgroundDrawable;
    private BackgroundGradientDrawable.Disposable backgroundGradientDisposable;
    private ChatMessageCell[] cells;
    public BaseFragment fragment;
    private Drawable oldBackgroundDrawable;
    private BackgroundGradientDrawable.Disposable oldBackgroundGradientDisposable;
    private INavigationLayout parentLayout;
    private Drawable shadowDrawable;
    private final int type;

    @Override
    protected void dispatchSetPressed(boolean z) {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ThemePreviewMessagesCell(Context context, INavigationLayout iNavigationLayout, int i) {
        super(context);
        int i2;
        MessageObject messageObject;
        MessageObject messageObject2;
        new Runnable() {
            @Override
            public final void run() {
                ThemePreviewMessagesCell.this.invalidate();
            }
        };
        this.cells = new ChatMessageCell[2];
        this.type = i;
        int i3 = UserConfig.selectedAccount;
        this.parentLayout = iNavigationLayout;
        setWillNotDraw(false);
        setOrientation(1);
        setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        this.shadowDrawable = Theme.getThemedDrawable(context, R.drawable.greydivider_bottom, "windowBackgroundGrayShadow");
        int currentTimeMillis = ((int) (System.currentTimeMillis() / 1000)) - 3600;
        if (i == 2) {
            TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
            tLRPC$TL_message.message = LocaleController.getString("DoubleTapPreviewMessage", R.string.DoubleTapPreviewMessage);
            tLRPC$TL_message.date = currentTimeMillis + 60;
            tLRPC$TL_message.dialog_id = 1L;
            tLRPC$TL_message.flags = 259;
            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
            tLRPC$TL_message.from_id = tLRPC$TL_peerUser;
            tLRPC$TL_peerUser.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            tLRPC$TL_message.id = 1;
            tLRPC$TL_message.media = new TLRPC$TL_messageMediaEmpty();
            tLRPC$TL_message.out = false;
            TLRPC$TL_peerUser tLRPC$TL_peerUser2 = new TLRPC$TL_peerUser();
            tLRPC$TL_message.peer_id = tLRPC$TL_peerUser2;
            tLRPC$TL_peerUser2.user_id = 0L;
            MessageObject messageObject3 = new MessageObject(UserConfig.selectedAccount, tLRPC$TL_message, true, false);
            messageObject3.resetLayout();
            messageObject3.eventId = 1L;
            messageObject3.customName = LocaleController.getString("DoubleTapPreviewSenderName", R.string.DoubleTapPreviewSenderName);
            messageObject3.customAvatarDrawable = ContextCompat.getDrawable(context, R.drawable.dino_pic);
            messageObject = messageObject3;
            i2 = i3;
            messageObject2 = null;
        } else {
            TLRPC$TL_message tLRPC$TL_message2 = new TLRPC$TL_message();
            if (i == 0) {
                tLRPC$TL_message2.message = LocaleController.getString("FontSizePreviewReply", R.string.FontSizePreviewReply);
            } else {
                tLRPC$TL_message2.message = LocaleController.getString("NewThemePreviewReply", R.string.NewThemePreviewReply);
            }
            int indexOf = tLRPC$TL_message2.message.indexOf("👋");
            if (indexOf >= 0) {
                TLRPC$TL_messageEntityCustomEmoji tLRPC$TL_messageEntityCustomEmoji = new TLRPC$TL_messageEntityCustomEmoji();
                tLRPC$TL_messageEntityCustomEmoji.offset = indexOf;
                tLRPC$TL_messageEntityCustomEmoji.length = 2;
                i2 = i3;
                tLRPC$TL_messageEntityCustomEmoji.document_id = 5386654653003864312L;
                tLRPC$TL_message2.entities.add(tLRPC$TL_messageEntityCustomEmoji);
            } else {
                i2 = i3;
            }
            int i4 = currentTimeMillis + 60;
            tLRPC$TL_message2.date = i4;
            tLRPC$TL_message2.dialog_id = 1L;
            tLRPC$TL_message2.flags = 259;
            TLRPC$TL_peerUser tLRPC$TL_peerUser3 = new TLRPC$TL_peerUser();
            tLRPC$TL_message2.from_id = tLRPC$TL_peerUser3;
            tLRPC$TL_peerUser3.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            tLRPC$TL_message2.id = 1;
            tLRPC$TL_message2.media = new TLRPC$TL_messageMediaEmpty();
            tLRPC$TL_message2.out = true;
            TLRPC$TL_peerUser tLRPC$TL_peerUser4 = new TLRPC$TL_peerUser();
            tLRPC$TL_message2.peer_id = tLRPC$TL_peerUser4;
            tLRPC$TL_peerUser4.user_id = 0L;
            MessageObject messageObject4 = new MessageObject(UserConfig.selectedAccount, tLRPC$TL_message2, true, false);
            TLRPC$TL_message tLRPC$TL_message3 = new TLRPC$TL_message();
            if (i == 0) {
                tLRPC$TL_message3.message = LocaleController.getString("FontSizePreviewLine2", R.string.FontSizePreviewLine2);
            } else {
                String string = LocaleController.getString("NewThemePreviewLine3", R.string.NewThemePreviewLine3);
                StringBuilder sb = new StringBuilder(string);
                int indexOf2 = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf2 != -1 && lastIndexOf != -1) {
                    sb.replace(lastIndexOf, lastIndexOf + 1, "");
                    sb.replace(indexOf2, indexOf2 + 1, "");
                    TLRPC$TL_messageEntityTextUrl tLRPC$TL_messageEntityTextUrl = new TLRPC$TL_messageEntityTextUrl();
                    tLRPC$TL_messageEntityTextUrl.offset = indexOf2;
                    tLRPC$TL_messageEntityTextUrl.length = (lastIndexOf - indexOf2) - 1;
                    tLRPC$TL_messageEntityTextUrl.url = "https://telegram.org";
                    tLRPC$TL_message3.entities.add(tLRPC$TL_messageEntityTextUrl);
                }
                tLRPC$TL_message3.message = sb.toString();
            }
            int indexOf3 = tLRPC$TL_message3.message.indexOf("😎");
            if (indexOf3 >= 0) {
                TLRPC$TL_messageEntityCustomEmoji tLRPC$TL_messageEntityCustomEmoji2 = new TLRPC$TL_messageEntityCustomEmoji();
                tLRPC$TL_messageEntityCustomEmoji2.offset = indexOf3;
                tLRPC$TL_messageEntityCustomEmoji2.length = 2;
                tLRPC$TL_messageEntityCustomEmoji2.document_id = 5373141891321699086L;
                tLRPC$TL_message3.entities.add(tLRPC$TL_messageEntityCustomEmoji2);
            }
            tLRPC$TL_message3.date = currentTimeMillis + 960;
            tLRPC$TL_message3.dialog_id = 1L;
            tLRPC$TL_message3.flags = 259;
            TLRPC$TL_peerUser tLRPC$TL_peerUser5 = new TLRPC$TL_peerUser();
            tLRPC$TL_message3.from_id = tLRPC$TL_peerUser5;
            tLRPC$TL_peerUser5.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            tLRPC$TL_message3.id = 1;
            tLRPC$TL_message3.media = new TLRPC$TL_messageMediaEmpty();
            tLRPC$TL_message3.out = true;
            TLRPC$TL_peerUser tLRPC$TL_peerUser6 = new TLRPC$TL_peerUser();
            tLRPC$TL_message3.peer_id = tLRPC$TL_peerUser6;
            tLRPC$TL_peerUser6.user_id = 0L;
            MessageObject messageObject5 = new MessageObject(UserConfig.selectedAccount, tLRPC$TL_message3, true, false);
            messageObject5.resetLayout();
            messageObject5.eventId = 1L;
            TLRPC$TL_message tLRPC$TL_message4 = new TLRPC$TL_message();
            if (i == 0) {
                tLRPC$TL_message4.message = LocaleController.getString("FontSizePreviewLine1", R.string.FontSizePreviewLine1);
            } else {
                tLRPC$TL_message4.message = LocaleController.getString("NewThemePreviewLine1", R.string.NewThemePreviewLine1);
            }
            tLRPC$TL_message4.date = i4;
            tLRPC$TL_message4.dialog_id = 1L;
            tLRPC$TL_message4.flags = 265;
            tLRPC$TL_message4.from_id = new TLRPC$TL_peerUser();
            tLRPC$TL_message4.id = 1;
            TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
            tLRPC$TL_message4.reply_to = tLRPC$TL_messageReplyHeader;
            tLRPC$TL_messageReplyHeader.reply_to_msg_id = 5;
            tLRPC$TL_message4.media = new TLRPC$TL_messageMediaEmpty();
            tLRPC$TL_message4.out = false;
            TLRPC$TL_peerUser tLRPC$TL_peerUser7 = new TLRPC$TL_peerUser();
            tLRPC$TL_message4.peer_id = tLRPC$TL_peerUser7;
            tLRPC$TL_peerUser7.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            MessageObject messageObject6 = new MessageObject(UserConfig.selectedAccount, tLRPC$TL_message4, true, false);
            if (i == 0) {
                messageObject6.customReplyName = LocaleController.getString("FontSizePreviewName", R.string.FontSizePreviewName);
            } else {
                messageObject6.customReplyName = LocaleController.getString("NewThemePreviewName", R.string.NewThemePreviewName);
            }
            messageObject6.eventId = 1L;
            messageObject6.resetLayout();
            messageObject6.replyMessageObject = messageObject4;
            messageObject = messageObject5;
            messageObject2 = messageObject6;
        }
        int i5 = 0;
        while (true) {
            ChatMessageCell[] chatMessageCellArr = this.cells;
            if (i5 >= chatMessageCellArr.length) {
                return;
            }
            chatMessageCellArr[i5] = new ChatMessageCell(context, context, i2, i) {
                private GestureDetector gestureDetector;
                final Context val$context;
                final int val$currentAccount;
                final int val$type;

                public class C00121 extends GestureDetector.SimpleOnGestureListener {
                    C00121() {
                    }

                    @Override
                    public boolean onDoubleTap(MotionEvent motionEvent) {
                        if (MediaDataController.getInstance(AnonymousClass1.this.val$currentAccount).getDoubleTapReaction() == null) {
                            return false;
                        }
                        boolean selectReaction = getMessageObject().selectReaction(ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(MediaDataController.getInstance(AnonymousClass1.this.val$currentAccount).getDoubleTapReaction()), false, false);
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        anonymousClass1.setMessageObject(anonymousClass1.getMessageObject(), null, false, false);
                        requestLayout();
                        ReactionsEffectOverlay.removeCurrent(false);
                        if (selectReaction) {
                            ThemePreviewMessagesCell themePreviewMessagesCell = ThemePreviewMessagesCell.this;
                            ReactionsEffectOverlay.show(themePreviewMessagesCell.fragment, null, themePreviewMessagesCell.cells[1], null, motionEvent.getX(), motionEvent.getY(), ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(MediaDataController.getInstance(AnonymousClass1.this.val$currentAccount).getDoubleTapReaction()), AnonymousClass1.this.val$currentAccount, 0);
                            ReactionsEffectOverlay.startAnimation();
                        }
                        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC00131());
                        return true;
                    }

                    public class ViewTreeObserver$OnPreDrawListenerC00131 implements ViewTreeObserver.OnPreDrawListener {
                        ViewTreeObserver$OnPreDrawListenerC00131() {
                        }

                        @Override
                        public boolean onPreDraw() {
                            getViewTreeObserver().removeOnPreDrawListener(this);
                            getTransitionParams().resetAnimation();
                            getTransitionParams().animateChange();
                            getTransitionParams().animateChange = true;
                            getTransitionParams().animateChangeProgress = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ThemePreviewMessagesCell.AnonymousClass1.C00121.ViewTreeObserver$OnPreDrawListenerC00131.this.lambda$onPreDraw$0(valueAnimator);
                                }
                            });
                            ofFloat.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    super.onAnimationEnd(animator);
                                    getTransitionParams().resetAnimation();
                                    getTransitionParams().animateChange = false;
                                    getTransitionParams().animateChangeProgress = 1.0f;
                                }
                            });
                            ofFloat.start();
                            return false;
                        }

                        public void lambda$onPreDraw$0(ValueAnimator valueAnimator) {
                            getTransitionParams().animateChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            invalidate();
                        }
                    }
                }

                {
                    this.val$context = context;
                    this.val$currentAccount = i2;
                    this.val$type = i;
                    this.gestureDetector = new GestureDetector(context, new C00121());
                }

                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    this.gestureDetector.onTouchEvent(motionEvent);
                    return true;
                }

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    if (getAvatarImage() != null && getAvatarImage().getImageHeight() != 0.0f) {
                        getAvatarImage().setImageCoords(getAvatarImage().getImageX(), (getMeasuredHeight() - getAvatarImage().getImageHeight()) - AndroidUtilities.dp(4.0f), getAvatarImage().getImageWidth(), getAvatarImage().getImageHeight());
                        getAvatarImage().setRoundRadius((int) (getAvatarImage().getImageHeight() / 2.0f));
                        getAvatarImage().draw(canvas);
                    } else if (this.val$type == 2) {
                        invalidate();
                    }
                    super.dispatchDraw(canvas);
                }
            };
            this.cells[i5].setDelegate(new ChatMessageCell.ChatMessageCellDelegate(this) {
                @Override
                public boolean canDrawOutboundsContent() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canDrawOutboundsContent(this);
                }

                @Override
                public boolean canPerformActions() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canPerformActions(this);
                }

                @Override
                public void didLongPress(ChatMessageCell chatMessageCell, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPress(this, chatMessageCell, f, f2);
                }

                @Override
                public void didLongPressBotButton(ChatMessageCell chatMessageCell, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressBotButton(this, chatMessageCell, tLRPC$KeyboardButton);
                }

                @Override
                public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, int i6, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressChannelAvatar(this, chatMessageCell, tLRPC$Chat, i6, f, f2);
                }

                @Override
                public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressUserAvatar(this, chatMessageCell, tLRPC$User, f, f2);
                }

                @Override
                public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell, AnimatedEmojiSpan animatedEmojiSpan) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAnimatedEmoji(this, chatMessageCell, animatedEmojiSpan);
                }

                @Override
                public void didPressBotButton(ChatMessageCell chatMessageCell, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBotButton(this, chatMessageCell, tLRPC$KeyboardButton);
                }

                @Override
                public void didPressCancelSendButton(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCancelSendButton(this, chatMessageCell);
                }

                @Override
                public void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, int i6, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelAvatar(this, chatMessageCell, tLRPC$Chat, i6, f, f2);
                }

                @Override
                public void didPressCommentButton(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCommentButton(this, chatMessageCell);
                }

                @Override
                public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressExtendedMediaPreview(this, chatMessageCell, tLRPC$KeyboardButton);
                }

                @Override
                public void didPressHiddenForward(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHiddenForward(this, chatMessageCell);
                }

                @Override
                public void didPressHint(ChatMessageCell chatMessageCell, int i6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHint(this, chatMessageCell, i6);
                }

                @Override
                public void didPressImage(ChatMessageCell chatMessageCell, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressImage(this, chatMessageCell, f, f2);
                }

                @Override
                public void didPressInstantButton(ChatMessageCell chatMessageCell, int i6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressInstantButton(this, chatMessageCell, i6);
                }

                @Override
                public void didPressOther(ChatMessageCell chatMessageCell, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressOther(this, chatMessageCell, f, f2);
                }

                @Override
                public void didPressReaction(ChatMessageCell chatMessageCell, TLRPC$ReactionCount tLRPC$ReactionCount, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReaction(this, chatMessageCell, tLRPC$ReactionCount, z);
                }

                @Override
                public void didPressReplyMessage(ChatMessageCell chatMessageCell, int i6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReplyMessage(this, chatMessageCell, i6);
                }

                @Override
                public void didPressSideButton(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSideButton(this, chatMessageCell);
                }

                @Override
                public void didPressTime(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressTime(this, chatMessageCell);
                }

                @Override
                public void didPressTopicButton(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressTopicButton(this, chatMessageCell);
                }

                @Override
                public void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUrl(this, chatMessageCell, characterStyle, z);
                }

                @Override
                public void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserAvatar(this, chatMessageCell, tLRPC$User, f, f2);
                }

                @Override
                public void didPressViaBot(ChatMessageCell chatMessageCell, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBot(this, chatMessageCell, str);
                }

                @Override
                public void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBotNotInline(this, chatMessageCell, j);
                }

                @Override
                public void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList arrayList, int i6, int i7, int i8) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressVoteButtons(this, chatMessageCell, arrayList, i6, i7, i8);
                }

                @Override
                public void didStartVideoStream(MessageObject messageObject7) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didStartVideoStream(this, messageObject7);
                }

                @Override
                public String getAdminRank(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAdminRank(this, j);
                }

                @Override
                public PinchToZoomHelper getPinchToZoomHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getPinchToZoomHelper(this);
                }

                @Override
                public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingBotButtonUrl(this, chatMessageCell);
                }

                @Override
                public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingLink(this, chatMessageCell);
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
                public boolean isLandscape() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isLandscape(this);
                }

                @Override
                public boolean isProgressLoading(ChatMessageCell chatMessageCell, int i6) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isProgressLoading(this, chatMessageCell, i6);
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
                public void needOpenWebView(MessageObject messageObject7, String str, String str2, String str3, String str4, int i6, int i7) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needOpenWebView(this, messageObject7, str, str2, str3, str4, i6, i7);
                }

                @Override
                public boolean needPlayMessage(MessageObject messageObject7, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$needPlayMessage(this, messageObject7, z);
                }

                @Override
                public void needReloadPolls() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needReloadPolls(this);
                }

                @Override
                public void needShowPremiumBulletin(int i6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needShowPremiumBulletin(this, i6);
                }

                @Override
                public boolean onAccessibilityAction(int i6, Bundle bundle) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$onAccessibilityAction(this, i6, bundle);
                }

                @Override
                public void onDiceFinished() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$onDiceFinished(this);
                }

                @Override
                public void setShouldNotRepeatSticker(MessageObject messageObject7) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$setShouldNotRepeatSticker(this, messageObject7);
                }

                @Override
                public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldDrawThreadProgress(this, chatMessageCell);
                }

                @Override
                public boolean shouldRepeatSticker(MessageObject messageObject7) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldRepeatSticker(this, messageObject7);
                }

                @Override
                public boolean shouldShowTopicButton() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldShowTopicButton(this);
                }

                @Override
                public void videoTimerReached() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$videoTimerReached(this);
                }
            });
            ChatMessageCell[] chatMessageCellArr2 = this.cells;
            chatMessageCellArr2[i5].isChat = i == 2;
            chatMessageCellArr2[i5].setFullyDraw(true);
            MessageObject messageObject7 = i5 == 0 ? messageObject2 : messageObject;
            if (messageObject7 != null) {
                this.cells[i5].setMessageObject(messageObject7, null, false, false);
                addView(this.cells[i5], LayoutHelper.createLinear(-1, -2));
            }
            i5++;
        }
    }

    public ChatMessageCell[] getCells() {
        return this.cells;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        int i = 0;
        while (true) {
            ChatMessageCell[] chatMessageCellArr = this.cells;
            if (i >= chatMessageCellArr.length) {
                return;
            }
            chatMessageCellArr[i].invalidate();
            i++;
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Drawable cachedWallpaperNonBlocking = Theme.getCachedWallpaperNonBlocking();
        if (Theme.wallpaperLoadTask != null) {
            invalidate();
        }
        if (cachedWallpaperNonBlocking != this.backgroundDrawable && cachedWallpaperNonBlocking != null) {
            if (Theme.isAnimatingColor()) {
                this.oldBackgroundDrawable = this.backgroundDrawable;
                this.oldBackgroundGradientDisposable = this.backgroundGradientDisposable;
            } else {
                BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
                if (disposable != null) {
                    disposable.dispose();
                    this.backgroundGradientDisposable = null;
                }
            }
            this.backgroundDrawable = cachedWallpaperNonBlocking;
        }
        float themeAnimationValue = this.parentLayout.getThemeAnimationValue();
        int i = 0;
        while (i < 2) {
            Drawable drawable = i == 0 ? this.oldBackgroundDrawable : this.backgroundDrawable;
            if (drawable != null) {
                int i2 = (i != 1 || this.oldBackgroundDrawable == null || this.parentLayout == null) ? 255 : (int) (255.0f * themeAnimationValue);
                if (i2 > 0) {
                    drawable.setAlpha(i2);
                    if ((drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof MotionBackgroundDrawable)) {
                        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable instanceof BackgroundGradientDrawable) {
                            this.backgroundGradientDisposable = ((BackgroundGradientDrawable) drawable).drawExactBoundsSize(canvas, this);
                        } else {
                            drawable.draw(canvas);
                        }
                    } else if (drawable instanceof BitmapDrawable) {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                        bitmapDrawable.setFilterBitmap(true);
                        if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                            canvas.save();
                            float f = 2.0f / AndroidUtilities.density;
                            canvas.scale(f, f);
                            drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getMeasuredHeight() / f));
                        } else {
                            int measuredHeight = getMeasuredHeight();
                            float max = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight / drawable.getIntrinsicHeight());
                            int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max);
                            int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max);
                            int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                            int i3 = (measuredHeight - ceil2) / 2;
                            canvas.save();
                            canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                            drawable.setBounds(measuredWidth, i3, ceil + measuredWidth, ceil2 + i3);
                        }
                        drawable.draw(canvas);
                        canvas.restore();
                    }
                    if (i == 0 && this.oldBackgroundDrawable != null && themeAnimationValue >= 1.0f) {
                        BackgroundGradientDrawable.Disposable disposable2 = this.oldBackgroundGradientDisposable;
                        if (disposable2 != null) {
                            disposable2.dispose();
                            this.oldBackgroundGradientDisposable = null;
                        }
                        this.oldBackgroundDrawable = null;
                        invalidate();
                    }
                }
            }
            i++;
        }
        this.shadowDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.shadowDrawable.draw(canvas);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
        if (disposable != null) {
            disposable.dispose();
            this.backgroundGradientDisposable = null;
        }
        BackgroundGradientDrawable.Disposable disposable2 = this.oldBackgroundGradientDisposable;
        if (disposable2 != null) {
            disposable2.dispose();
            this.oldBackgroundGradientDisposable = null;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.type == 2) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.type == 2) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.type == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
