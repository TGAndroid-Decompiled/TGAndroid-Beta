package org.telegram.p009ui.Cells;

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
import android.text.style.CharacterStyle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.ActionBarLayout;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Cells.ChatMessageCell;
import org.telegram.p009ui.Cells.TextSelectionHelper;
import org.telegram.p009ui.Cells.ThemePreviewMessagesCell;
import org.telegram.p009ui.Components.BackgroundGradientDrawable;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.MotionBackgroundDrawable;
import org.telegram.p009ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.p009ui.PinchToZoomHelper;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$KeyboardButton;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageEntityTextUrl;
import org.telegram.tgnet.TLRPC$TL_messageMediaEmpty;
import org.telegram.tgnet.TLRPC$TL_messageReplyHeader;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_reactionCount;
import org.telegram.tgnet.TLRPC$User;

public class ThemePreviewMessagesCell extends LinearLayout {
    private Drawable backgroundDrawable;
    private BackgroundGradientDrawable.Disposable backgroundGradientDisposable;
    private ChatMessageCell[] cells = new ChatMessageCell[2];
    public BaseFragment fragment;
    private Drawable oldBackgroundDrawable;
    private BackgroundGradientDrawable.Disposable oldBackgroundGradientDisposable;
    private ActionBarLayout parentLayout;
    private Drawable shadowDrawable;
    private final int type;

    @Override
    protected void dispatchSetPressed(boolean z) {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ThemePreviewMessagesCell(Context context, ActionBarLayout actionBarLayout, int i) {
        super(context);
        MessageObject messageObject;
        MessageObject messageObject2;
        new Runnable() {
            @Override
            public final void run() {
                ThemePreviewMessagesCell.this.invalidate();
            }
        };
        this.type = i;
        int i2 = UserConfig.selectedAccount;
        this.parentLayout = actionBarLayout;
        setWillNotDraw(false);
        setOrientation(1);
        setPadding(0, AndroidUtilities.m34dp(11.0f), 0, AndroidUtilities.m34dp(11.0f));
        this.shadowDrawable = Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow");
        int currentTimeMillis = ((int) (System.currentTimeMillis() / 1000)) - 3600;
        if (i == 2) {
            TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
            tLRPC$TL_message.message = LocaleController.getString("DoubleTapPreviewMessage", C0952R.string.DoubleTapPreviewMessage);
            tLRPC$TL_message.date = currentTimeMillis + 60;
            tLRPC$TL_message.dialog_id = 1L;
            tLRPC$TL_message.flags = 259;
            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
            tLRPC$TL_message.from_id = tLRPC$TL_peerUser;
            tLRPC$TL_peerUser.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            tLRPC$TL_message.f877id = 1;
            tLRPC$TL_message.media = new TLRPC$TL_messageMediaEmpty();
            tLRPC$TL_message.out = false;
            TLRPC$TL_peerUser tLRPC$TL_peerUser2 = new TLRPC$TL_peerUser();
            tLRPC$TL_message.peer_id = tLRPC$TL_peerUser2;
            tLRPC$TL_peerUser2.user_id = 0L;
            MessageObject messageObject3 = new MessageObject(UserConfig.selectedAccount, tLRPC$TL_message, true, false);
            messageObject3.resetLayout();
            messageObject3.eventId = 1L;
            messageObject3.customName = LocaleController.getString("DoubleTapPreviewSenderName", C0952R.string.DoubleTapPreviewSenderName);
            messageObject3.customAvatarDrawable = ContextCompat.getDrawable(context, C0952R.C0953drawable.dino_pic);
            messageObject2 = messageObject3;
            messageObject = null;
        } else {
            TLRPC$TL_message tLRPC$TL_message2 = new TLRPC$TL_message();
            if (i == 0) {
                tLRPC$TL_message2.message = LocaleController.getString("FontSizePreviewReply", C0952R.string.FontSizePreviewReply);
            } else {
                tLRPC$TL_message2.message = LocaleController.getString("NewThemePreviewReply", C0952R.string.NewThemePreviewReply);
            }
            int i3 = currentTimeMillis + 60;
            tLRPC$TL_message2.date = i3;
            tLRPC$TL_message2.dialog_id = 1L;
            tLRPC$TL_message2.flags = 259;
            TLRPC$TL_peerUser tLRPC$TL_peerUser3 = new TLRPC$TL_peerUser();
            tLRPC$TL_message2.from_id = tLRPC$TL_peerUser3;
            tLRPC$TL_peerUser3.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            tLRPC$TL_message2.f877id = 1;
            tLRPC$TL_message2.media = new TLRPC$TL_messageMediaEmpty();
            tLRPC$TL_message2.out = true;
            TLRPC$TL_peerUser tLRPC$TL_peerUser4 = new TLRPC$TL_peerUser();
            tLRPC$TL_message2.peer_id = tLRPC$TL_peerUser4;
            tLRPC$TL_peerUser4.user_id = 0L;
            MessageObject messageObject4 = new MessageObject(UserConfig.selectedAccount, tLRPC$TL_message2, true, false);
            TLRPC$TL_message tLRPC$TL_message3 = new TLRPC$TL_message();
            if (i == 0) {
                tLRPC$TL_message3.message = LocaleController.getString("FontSizePreviewLine2", C0952R.string.FontSizePreviewLine2);
            } else {
                String string = LocaleController.getString("NewThemePreviewLine3", C0952R.string.NewThemePreviewLine3);
                StringBuilder sb = new StringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (!(indexOf == -1 || lastIndexOf == -1)) {
                    sb.replace(lastIndexOf, lastIndexOf + 1, "");
                    sb.replace(indexOf, indexOf + 1, "");
                    TLRPC$TL_messageEntityTextUrl tLRPC$TL_messageEntityTextUrl = new TLRPC$TL_messageEntityTextUrl();
                    tLRPC$TL_messageEntityTextUrl.offset = indexOf;
                    tLRPC$TL_messageEntityTextUrl.length = (lastIndexOf - indexOf) - 1;
                    tLRPC$TL_messageEntityTextUrl.url = "https://telegram.org";
                    tLRPC$TL_message3.entities.add(tLRPC$TL_messageEntityTextUrl);
                }
                tLRPC$TL_message3.message = sb.toString();
            }
            tLRPC$TL_message3.date = currentTimeMillis + 960;
            tLRPC$TL_message3.dialog_id = 1L;
            tLRPC$TL_message3.flags = 259;
            TLRPC$TL_peerUser tLRPC$TL_peerUser5 = new TLRPC$TL_peerUser();
            tLRPC$TL_message3.from_id = tLRPC$TL_peerUser5;
            tLRPC$TL_peerUser5.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            tLRPC$TL_message3.f877id = 1;
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
                tLRPC$TL_message4.message = LocaleController.getString("FontSizePreviewLine1", C0952R.string.FontSizePreviewLine1);
            } else {
                tLRPC$TL_message4.message = LocaleController.getString("NewThemePreviewLine1", C0952R.string.NewThemePreviewLine1);
            }
            tLRPC$TL_message4.date = i3;
            tLRPC$TL_message4.dialog_id = 1L;
            tLRPC$TL_message4.flags = 265;
            tLRPC$TL_message4.from_id = new TLRPC$TL_peerUser();
            tLRPC$TL_message4.f877id = 1;
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
                messageObject6.customReplyName = LocaleController.getString("FontSizePreviewName", C0952R.string.FontSizePreviewName);
            } else {
                messageObject6.customReplyName = LocaleController.getString("NewThemePreviewName", C0952R.string.NewThemePreviewName);
            }
            messageObject6.eventId = 1L;
            messageObject6.resetLayout();
            messageObject6.replyMessageObject = messageObject4;
            messageObject2 = messageObject5;
            messageObject = messageObject6;
        }
        int i4 = 0;
        while (true) {
            ChatMessageCell[] chatMessageCellArr = this.cells;
            if (i4 < chatMessageCellArr.length) {
                chatMessageCellArr[i4] = new ChatMessageCell(context, context, i2, i) {
                    private GestureDetector gestureDetector;
                    final Context val$context;
                    final int val$currentAccount;
                    final int val$type;

                    public class C12871 extends GestureDetector.SimpleOnGestureListener {
                        C12871() {
                        }

                        @Override
                        public boolean onDoubleTap(MotionEvent motionEvent) {
                            boolean selectReaction = getMessageObject().selectReaction(MediaDataController.getInstance(C12861.this.val$currentAccount).getDoubleTapReaction(), false, false);
                            C12861 r1 = C12861.this;
                            r1.setMessageObject(r1.getMessageObject(), null, false, false);
                            requestLayout();
                            ReactionsEffectOverlay.removeCurrent(false);
                            if (selectReaction) {
                                ThemePreviewMessagesCell themePreviewMessagesCell = ThemePreviewMessagesCell.this;
                                ReactionsEffectOverlay.show(themePreviewMessagesCell.fragment, null, themePreviewMessagesCell.cells[1], motionEvent.getX(), motionEvent.getY(), MediaDataController.getInstance(C12861.this.val$currentAccount).getDoubleTapReaction(), C12861.this.val$currentAccount, 0);
                                ReactionsEffectOverlay.startAnimation();
                            }
                            getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC12881());
                            return true;
                        }

                        public class ViewTreeObserver$OnPreDrawListenerC12881 implements ViewTreeObserver.OnPreDrawListener {
                            ViewTreeObserver$OnPreDrawListenerC12881() {
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
                                        ThemePreviewMessagesCell.C12861.C12871.ViewTreeObserver$OnPreDrawListenerC12881.this.lambda$onPreDraw$0(valueAnimator);
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
                        this.gestureDetector = new GestureDetector(context, new C12871());
                    }

                    @Override
                    public boolean onTouchEvent(MotionEvent motionEvent) {
                        this.gestureDetector.onTouchEvent(motionEvent);
                        return true;
                    }

                    @Override
                    protected void dispatchDraw(Canvas canvas) {
                        if (getAvatarImage() != null && getAvatarImage().getImageHeight() != 0.0f) {
                            getAvatarImage().setImageCoords(getAvatarImage().getImageX(), (getMeasuredHeight() - getAvatarImage().getImageHeight()) - AndroidUtilities.m34dp(4.0f), getAvatarImage().getImageWidth(), getAvatarImage().getImageHeight());
                            getAvatarImage().setRoundRadius((int) (getAvatarImage().getImageHeight() / 2.0f));
                            getAvatarImage().draw(canvas);
                        } else if (this.val$type == 2) {
                            invalidate();
                        }
                        super.dispatchDraw(canvas);
                    }
                };
                this.cells[i4].setDelegate(new ChatMessageCell.ChatMessageCellDelegate(this) {
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
                    public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, int i5, float f, float f2) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressChannelAvatar(this, chatMessageCell, tLRPC$Chat, i5, f, f2);
                    }

                    @Override
                    public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, float f, float f2) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressUserAvatar(this, chatMessageCell, tLRPC$User, f, f2);
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
                    public void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, int i5, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelAvatar(this, chatMessageCell, tLRPC$Chat, i5, f, f2);
                    }

                    @Override
                    public void didPressCommentButton(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCommentButton(this, chatMessageCell);
                    }

                    @Override
                    public void didPressHiddenForward(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHiddenForward(this, chatMessageCell);
                    }

                    @Override
                    public void didPressHint(ChatMessageCell chatMessageCell, int i5) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHint(this, chatMessageCell, i5);
                    }

                    @Override
                    public void didPressImage(ChatMessageCell chatMessageCell, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressImage(this, chatMessageCell, f, f2);
                    }

                    @Override
                    public void didPressInstantButton(ChatMessageCell chatMessageCell, int i5) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressInstantButton(this, chatMessageCell, i5);
                    }

                    @Override
                    public void didPressOther(ChatMessageCell chatMessageCell, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressOther(this, chatMessageCell, f, f2);
                    }

                    @Override
                    public void didPressReaction(ChatMessageCell chatMessageCell, TLRPC$TL_reactionCount tLRPC$TL_reactionCount, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReaction(this, chatMessageCell, tLRPC$TL_reactionCount, z);
                    }

                    @Override
                    public void didPressReplyMessage(ChatMessageCell chatMessageCell, int i5) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReplyMessage(this, chatMessageCell, i5);
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
                    public void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList arrayList, int i5, int i6, int i7) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressVoteButtons(this, chatMessageCell, arrayList, i5, i6, i7);
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
                    public boolean keyboardIsOpened() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$keyboardIsOpened(this);
                    }

                    @Override
                    public void needOpenWebView(MessageObject messageObject7, String str, String str2, String str3, String str4, int i5, int i6) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$needOpenWebView(this, messageObject7, str, str2, str3, str4, i5, i6);
                    }

                    @Override
                    public boolean needPlayMessage(MessageObject messageObject7) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$needPlayMessage(this, messageObject7);
                    }

                    @Override
                    public void needReloadPolls() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$needReloadPolls(this);
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
                    public void videoTimerReached() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$videoTimerReached(this);
                    }
                });
                ChatMessageCell[] chatMessageCellArr2 = this.cells;
                chatMessageCellArr2[i4].isChat = i == 2;
                chatMessageCellArr2[i4].setFullyDraw(true);
                MessageObject messageObject7 = i4 == 0 ? messageObject : messageObject2;
                if (messageObject7 != null) {
                    this.cells[i4].setMessageObject(messageObject7, null, false, false);
                    addView(this.cells[i4], LayoutHelper.createLinear(-1, -2));
                }
                i4++;
            } else {
                return;
            }
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
            if (i < chatMessageCellArr.length) {
                chatMessageCellArr[i].invalidate();
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Drawable cachedWallpaperNonBlocking = Theme.getCachedWallpaperNonBlocking();
        if (!(cachedWallpaperNonBlocking == this.backgroundDrawable || cachedWallpaperNonBlocking == null)) {
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
                if (i != 1 || this.oldBackgroundDrawable == null || this.parentLayout == null) {
                    drawable.setAlpha(255);
                } else {
                    drawable.setAlpha((int) (255.0f * themeAnimationValue));
                }
                if ((drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof MotionBackgroundDrawable)) {
                    drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    if (drawable instanceof BackgroundGradientDrawable) {
                        this.backgroundGradientDisposable = ((BackgroundGradientDrawable) drawable).drawExactBoundsSize(canvas, this);
                    } else {
                        drawable.draw(canvas);
                    }
                } else if (drawable instanceof BitmapDrawable) {
                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
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
                        int i2 = (measuredHeight - ceil2) / 2;
                        canvas.save();
                        canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                        drawable.setBounds(measuredWidth, i2, ceil + measuredWidth, ceil2 + i2);
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
