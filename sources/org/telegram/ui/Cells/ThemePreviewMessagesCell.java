package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
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
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatBackgroundDrawable;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.Stories.recorder.StoryEntry;

public class ThemePreviewMessagesCell extends LinearLayout {
    private Drawable backgroundDrawable;
    private BackgroundGradientDrawable.Disposable backgroundGradientDisposable;
    private final Runnable cancelProgress;
    private ChatMessageCell[] cells;
    public boolean customAnimation;
    public BaseFragment fragment;
    private final Runnable invalidateRunnable;
    private Drawable oldBackgroundDrawable;
    private BackgroundGradientDrawable.Disposable oldBackgroundGradientDisposable;
    private Drawable overrideDrawable;
    private final AnimatedFloat overrideDrawableUpdate;
    private INavigationLayout parentLayout;
    private int progress;
    private Drawable shadowDrawable;
    private final int type;

    @Override
    protected void dispatchSetPressed(boolean z) {
    }

    public void lambda$new$0() {
        this.progress = -1;
        int i = 0;
        while (true) {
            ChatMessageCell[] chatMessageCellArr = this.cells;
            if (i >= chatMessageCellArr.length) {
                return;
            }
            ChatMessageCell chatMessageCell = chatMessageCellArr[i];
            if (chatMessageCell != null) {
                chatMessageCell.invalidate();
            }
            i++;
        }
    }

    public ThemePreviewMessagesCell(Context context, INavigationLayout iNavigationLayout, int i) {
        this(context, iNavigationLayout, i, 0L);
    }

    public ThemePreviewMessagesCell(Context context, INavigationLayout iNavigationLayout, int i, long j) {
        this(context, iNavigationLayout, i, j, null);
    }

    public ThemePreviewMessagesCell(Context context, INavigationLayout iNavigationLayout, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        MessageObject messageObject;
        int i2;
        ChatMessageCell[] chatMessageCellArr;
        boolean z;
        MessageObject messageObject2;
        super(context);
        this.invalidateRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.invalidate();
            }
        };
        this.cells = new ChatMessageCell[2];
        this.progress = -1;
        this.cancelProgress = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0();
            }
        };
        this.overrideDrawableUpdate = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.type = i;
        int i3 = UserConfig.selectedAccount;
        this.parentLayout = iNavigationLayout;
        setWillNotDraw(false);
        setOrientation(1);
        setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        this.shadowDrawable = Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow, resourcesProvider);
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        MessageObject messageObject3 = null;
        if (i == 3) {
            boolean z2 = j < 0;
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = LocaleController.getString(z2 ? R.string.ChannelColorPreview : R.string.UserColorPreview);
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_message.reply_to = tL_messageReplyHeader;
            tL_messageReplyHeader.flags |= 1;
            if (j == 0) {
                tL_messageReplyHeader.reply_to_peer_id = new TLRPC.TL_peerUser();
                tL_message.reply_to.reply_to_peer_id.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            } else {
                tL_messageReplyHeader.reply_to_peer_id = new TLRPC.TL_peerChannel();
                tL_message.reply_to.reply_to_peer_id.channel_id = -j;
            }
            TLRPC.Message message = new TLRPC.Message();
            tL_message.replyMessage = message;
            message.media = new TLRPC.TL_messageMediaEmpty();
            if (j == 0) {
                tL_message.replyMessage.from_id = new TLRPC.TL_peerUser();
                tL_message.replyMessage.from_id.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                tL_message.replyMessage.peer_id = new TLRPC.TL_peerUser();
                tL_message.replyMessage.peer_id.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            } else {
                tL_message.replyMessage.from_id = new TLRPC.TL_peerChannel();
                TLRPC.Message message2 = tL_message.replyMessage;
                long j2 = -j;
                message2.from_id.channel_id = j2;
                message2.peer_id = new TLRPC.TL_peerChannel();
                tL_message.replyMessage.peer_id.channel_id = j2;
            }
            tL_message.replyMessage.message = LocaleController.getString(z2 ? R.string.ChannelColorPreviewReply : R.string.UserColorPreviewReply);
            TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
            tL_message.media = tL_messageMediaWebPage;
            tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
            TLRPC.WebPage webPage = tL_message.media.webpage;
            webPage.embed_url = "https://telegram.org/";
            webPage.flags |= 2;
            webPage.site_name = LocaleController.getString(R.string.AppName);
            TLRPC.WebPage webPage2 = tL_message.media.webpage;
            webPage2.flags |= 4;
            webPage2.title = LocaleController.getString(z2 ? R.string.ChannelColorPreviewLinkTitle : R.string.UserColorPreviewLinkTitle);
            TLRPC.WebPage webPage3 = tL_message.media.webpage;
            webPage3.flags |= 8;
            webPage3.description = LocaleController.getString(z2 ? R.string.ChannelColorPreviewLinkDescription : R.string.UserColorPreviewLinkDescription);
            tL_message.date = iCurrentTimeMillis - 3540;
            tL_message.dialog_id = 1L;
            tL_message.flags = 259;
            if (j == 0) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            } else {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_message.from_id = tL_peerChannel;
                tL_peerChannel.channel_id = -j;
            }
            tL_message.id = 1;
            tL_message.out = false;
            if (j == 0) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = 0L;
            } else {
                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                tL_message.peer_id = tL_peerChannel2;
                tL_peerChannel2.channel_id = -j;
            }
            MessageObject messageObject4 = new MessageObject(UserConfig.selectedAccount, tL_message, true, false);
            messageObject4.notime = true;
            messageObject4.forceAvatar = true;
            messageObject4.resetLayout();
            messageObject4.eventId = 1L;
            messageObject = messageObject4;
        } else {
            if (i == 2) {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.message = LocaleController.getString(R.string.DoubleTapPreviewMessage);
                tL_message2.date = iCurrentTimeMillis - 3540;
                tL_message2.dialog_id = 1L;
                tL_message2.flags = 259;
                TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                tL_message2.from_id = tL_peerUser3;
                tL_peerUser3.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                tL_message2.id = 1;
                tL_message2.media = new TLRPC.TL_messageMediaEmpty();
                tL_message2.out = false;
                TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                tL_message2.peer_id = tL_peerUser4;
                tL_peerUser4.user_id = 0L;
                MessageObject messageObject5 = new MessageObject(UserConfig.selectedAccount, tL_message2, true, false);
                messageObject5.resetLayout();
                messageObject5.eventId = 1L;
                messageObject5.customName = LocaleController.getString(R.string.DoubleTapPreviewSenderName);
                messageObject5.customAvatarDrawable = ContextCompat.getDrawable(context, R.drawable.dino_pic);
                messageObject5.overrideLinkColor = 5;
                messageObject5.overrideLinkEmoji = 0L;
                messageObject = messageObject5;
            } else {
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                if (i == 0) {
                    tL_message3.message = LocaleController.getString(R.string.FontSizePreviewReply);
                } else {
                    tL_message3.message = LocaleController.getString(R.string.NewThemePreviewReply);
                }
                int iIndexOf = tL_message3.message.indexOf("👋");
                if (iIndexOf >= 0) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.offset = iIndexOf;
                    tL_messageEntityCustomEmoji.length = 2;
                    tL_messageEntityCustomEmoji.document_id = 5386654653003864312L;
                    tL_message3.entities.add(tL_messageEntityCustomEmoji);
                }
                int i4 = iCurrentTimeMillis - 3540;
                tL_message3.date = i4;
                tL_message3.dialog_id = 1L;
                tL_message3.flags = 259;
                TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
                tL_message3.from_id = tL_peerUser5;
                tL_peerUser5.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                tL_message3.id = 1;
                tL_message3.media = new TLRPC.TL_messageMediaEmpty();
                tL_message3.out = true;
                TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
                tL_message3.peer_id = tL_peerUser6;
                tL_peerUser6.user_id = 0L;
                MessageObject messageObject6 = new MessageObject(UserConfig.selectedAccount, tL_message3, true, false);
                TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                if (i == 0) {
                    tL_message4.message = LocaleController.getString(R.string.FontSizePreviewLine2);
                } else {
                    String string = LocaleController.getString(R.string.NewThemePreviewLine3);
                    StringBuilder sb = new StringBuilder(string);
                    int iIndexOf2 = string.indexOf(42);
                    int iLastIndexOf = string.lastIndexOf(42);
                    if (iIndexOf2 != -1 && iLastIndexOf != -1) {
                        sb.replace(iLastIndexOf, iLastIndexOf + 1, "");
                        sb.replace(iIndexOf2, iIndexOf2 + 1, "");
                        TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                        tL_messageEntityTextUrl.offset = iIndexOf2;
                        tL_messageEntityTextUrl.length = (iLastIndexOf - iIndexOf2) - 1;
                        tL_messageEntityTextUrl.url = "https://telegram.org";
                        tL_message4.entities.add(tL_messageEntityTextUrl);
                    }
                    tL_message4.message = sb.toString();
                }
                int iIndexOf3 = tL_message4.message.indexOf("😎");
                if (iIndexOf3 >= 0) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji2.offset = iIndexOf3;
                    tL_messageEntityCustomEmoji2.length = 2;
                    tL_messageEntityCustomEmoji2.document_id = 5373141891321699086L;
                    tL_message4.entities.add(tL_messageEntityCustomEmoji2);
                }
                tL_message4.date = iCurrentTimeMillis - 2640;
                tL_message4.dialog_id = 1L;
                tL_message4.flags = 259;
                TLRPC.TL_peerUser tL_peerUser7 = new TLRPC.TL_peerUser();
                tL_message4.from_id = tL_peerUser7;
                tL_peerUser7.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                tL_message4.id = 1;
                tL_message4.media = new TLRPC.TL_messageMediaEmpty();
                tL_message4.out = true;
                TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
                tL_message4.peer_id = tL_peerUser8;
                tL_peerUser8.user_id = 0L;
                MessageObject messageObject7 = new MessageObject(UserConfig.selectedAccount, tL_message4, true, false);
                messageObject7.resetLayout();
                messageObject7.overrideLinkColor = 5;
                messageObject7.overrideLinkEmoji = 0L;
                messageObject7.eventId = 1L;
                TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
                if (i == 0) {
                    tL_message5.message = LocaleController.getString(R.string.FontSizePreviewLine1);
                } else {
                    tL_message5.message = LocaleController.getString(R.string.NewThemePreviewLine1);
                }
                tL_message5.date = i4;
                tL_message5.dialog_id = 1L;
                tL_message5.flags = 265;
                tL_message5.from_id = new TLRPC.TL_peerUser();
                tL_message5.id = 1;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
                tL_message5.reply_to = tL_messageReplyHeader2;
                tL_messageReplyHeader2.flags |= 16;
                tL_messageReplyHeader2.reply_to_msg_id = 5;
                tL_message5.media = new TLRPC.TL_messageMediaEmpty();
                tL_message5.out = false;
                TLRPC.TL_peerUser tL_peerUser9 = new TLRPC.TL_peerUser();
                tL_message5.peer_id = tL_peerUser9;
                tL_peerUser9.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                MessageObject messageObject8 = new MessageObject(UserConfig.selectedAccount, tL_message5, true, false);
                if (i != 0) {
                    messageObject8.customReplyName = LocaleController.getString(R.string.NewThemePreviewName);
                }
                messageObject8.eventId = 1L;
                messageObject8.resetLayout();
                messageObject8.replyMessageObject = messageObject6;
                if (i == 4) {
                    TLRPC.TL_user tL_user = new TLRPC.TL_user();
                    String string2 = LocaleController.getString(R.string.GroupThemePreviewSenderName);
                    tL_user.first_name = string2;
                    messageObject8.customName = string2;
                    messageObject8.customAvatarDrawable = new AvatarDrawable((TLRPC.User) tL_user, false);
                }
                messageObject = messageObject7;
                messageObject3 = messageObject8;
            }
            i2 = 0;
            while (true) {
                chatMessageCellArr = this.cells;
                if (i2 < chatMessageCellArr.length) {
                    return;
                }
                chatMessageCellArr[i2] = new ChatMessageCell(context, i3, false, null, resourcesProvider, context, i) {
                    private final AnimatedColor color1;
                    private final AnimatedColor color2;
                    private GestureDetector gestureDetector;
                    final Context val$context;
                    final int val$type;

                    class C00181 extends GestureDetector.SimpleOnGestureListener {
                        C00181() {
                        }

                        @Override
                        public boolean onDoubleTap(MotionEvent motionEvent) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            if (anonymousClass1.val$type != 2 || MediaDataController.getInstance(anonymousClass1.currentAccount).getDoubleTapReaction() == null) {
                                return false;
                            }
                            boolean zSelectReaction = getMessageObject().selectReaction(ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(MediaDataController.getInstance(AnonymousClass1.this.currentAccount).getDoubleTapReaction()), false, false);
                            AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                            anonymousClass2.setMessageObject(anonymousClass2.getMessageObject(), null, false, false, false);
                            requestLayout();
                            ReactionsEffectOverlay.removeCurrent(false);
                            if (zSelectReaction) {
                                ThemePreviewMessagesCell themePreviewMessagesCell = ThemePreviewMessagesCell.this;
                                ReactionsEffectOverlay.show(themePreviewMessagesCell.fragment, null, themePreviewMessagesCell.cells[1], null, motionEvent.getX(), motionEvent.getY(), ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(MediaDataController.getInstance(AnonymousClass1.this.currentAccount).getDoubleTapReaction()), AnonymousClass1.this.currentAccount, 0);
                                ReactionsEffectOverlay.startAnimation();
                            }
                            getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC00191());
                            return true;
                        }

                        class ViewTreeObserverOnPreDrawListenerC00191 implements ViewTreeObserver.OnPreDrawListener {
                            ViewTreeObserverOnPreDrawListenerC00191() {
                            }

                            @Override
                            public boolean onPreDraw() {
                                getViewTreeObserver().removeOnPreDrawListener(this);
                                getTransitionParams().resetAnimation();
                                getTransitionParams().animateChange();
                                getTransitionParams().animateChange = true;
                                getTransitionParams().animateChangeProgress = 0.0f;
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        this.f$0.lambda$onPreDraw$0(valueAnimator);
                                    }
                                });
                                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animator) {
                                        super.onAnimationEnd(animator);
                                        getTransitionParams().resetAnimation();
                                        getTransitionParams().animateChange = false;
                                        getTransitionParams().animateChangeProgress = 1.0f;
                                    }
                                });
                                valueAnimatorOfFloat.start();
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
                        this.val$type = i;
                        this.gestureDetector = new GestureDetector(context, new C00181());
                        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
                        this.color1 = new AnimatedColor(this, 0L, 180L, cubicBezierInterpolator);
                        this.color2 = new AnimatedColor(this, 0L, 180L, cubicBezierInterpolator);
                    }

                    @Override
                    public boolean onTouchEvent(MotionEvent motionEvent) {
                        if (ThemePreviewMessagesCell.this.allowLoadingOnTouch()) {
                            return super.onTouchEvent(motionEvent);
                        }
                        this.gestureDetector.onTouchEvent(motionEvent);
                        return true;
                    }

                    @Override
                    protected void dispatchDraw(Canvas canvas) {
                        int themedColor;
                        int themedColor2;
                        if (getMessageObject() != null && getMessageObject().overrideLinkColor >= 0) {
                            int i5 = getMessageObject().overrideLinkColor;
                            if (i5 >= 14) {
                                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                                MessagesController.PeerColors peerColors = messagesController != null ? messagesController.peerColors : null;
                                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i5) : null;
                                if (color != null) {
                                    int color1 = color.getColor1();
                                    themedColor = getThemedColor(Theme.keys_avatar_background[AvatarDrawable.getPeerColorIndex(color1)]);
                                    themedColor2 = getThemedColor(Theme.keys_avatar_background2[AvatarDrawable.getPeerColorIndex(color1)]);
                                } else {
                                    long j3 = i5;
                                    themedColor = getThemedColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(j3)]);
                                    themedColor2 = getThemedColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(j3)]);
                                }
                            } else {
                                long j4 = i5;
                                themedColor = getThemedColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(j4)]);
                                themedColor2 = getThemedColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(j4)]);
                            }
                            this.avatarDrawable.setColor(this.color1.set(themedColor), this.color2.set(themedColor2));
                        } else {
                            this.color1.set(this.avatarDrawable.getColor());
                            this.color2.set(this.avatarDrawable.getColor2());
                        }
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
                this.cells[i2].setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
                    @Override
                    public boolean allowAddPollOptions() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$allowAddPollOptions(this);
                    }

                    @Override
                    public boolean canDrawOutboundsContent() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canDrawOutboundsContent(this);
                    }

                    @Override
                    public boolean canPerformReply() {
                        return canPerformActions();
                    }

                    @Override
                    public boolean canSaveRichDocument(ChatMessageCell chatMessageCell) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canSaveRichDocument(this, chatMessageCell);
                    }

                    @Override
                    public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canToggleRichMessageCheckbox(this, chatMessageCell);
                    }

                    @Override
                    public void didLongPress(ChatMessageCell chatMessageCell, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPress(this, chatMessageCell, f, f2);
                    }

                    @Override
                    public void didLongPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressBotButton(this, chatMessageCell, keyboardButtonProto);
                    }

                    @Override
                    public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i5, float f, float f2) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressChannelAvatar(this, chatMessageCell, chat, i5, f, f2);
                    }

                    @Override
                    public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressCustomBotButton(this, chatMessageCell, buttonCustom);
                    }

                    @Override
                    public boolean didLongPressPollOption(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressPollOption(this, chatMessageCell, pollAnswer);
                    }

                    @Override
                    public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressToDoButton(this, chatMessageCell, todoItem);
                    }

                    @Override
                    public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressUserAvatar(this, chatMessageCell, user, f, f2);
                    }

                    @Override
                    public void didPressAboutRevenueSharingAds() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAboutRevenueSharingAds(this);
                    }

                    @Override
                    public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAddPollOptionButton(this, chatMessageCell);
                    }

                    @Override
                    public void didPressAdmin(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAdmin(this, chatMessageCell);
                    }

                    @Override
                    public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell, AnimatedEmojiSpan animatedEmojiSpan) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAnimatedEmoji(this, chatMessageCell, animatedEmojiSpan);
                    }

                    @Override
                    public void didPressAppUpdateButton() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAppUpdateButton(this);
                    }

                    @Override
                    public void didPressBoostCounter(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBoostCounter(this, chatMessageCell);
                    }

                    @Override
                    public void didPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBotButton(this, chatMessageCell, keyboardButtonProto);
                    }

                    @Override
                    public void didPressCancelSendButton(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCancelSendButton(this, chatMessageCell);
                    }

                    @Override
                    public void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i5, float f, float f2, boolean z3) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelAvatar(this, chatMessageCell, chat, i5, f, f2, z3);
                    }

                    @Override
                    public void didPressChannelRecommendation(ChatMessageCell chatMessageCell, TLObject tLObject, boolean z3) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendation(this, chatMessageCell, tLObject, z3);
                    }

                    @Override
                    public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendationsClose(this, chatMessageCell);
                    }

                    @Override
                    public void didPressCodeCopy(ChatMessageCell chatMessageCell, MessageObject.TextLayoutBlock textLayoutBlock) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCodeCopy(this, chatMessageCell, textLayoutBlock);
                    }

                    @Override
                    public void didPressCommentButton(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCommentButton(this, chatMessageCell);
                    }

                    @Override
                    public void didPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCustomBotButton(this, chatMessageCell, buttonCustom);
                    }

                    @Override
                    public void didPressEffect(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressEffect(this, chatMessageCell);
                    }

                    @Override
                    public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressExtendedMediaPreview(this, chatMessageCell, keyboardInlineButton);
                    }

                    @Override
                    public void didPressFactCheck(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheck(this, chatMessageCell);
                    }

                    @Override
                    public void didPressFactCheckWhat(ChatMessageCell chatMessageCell, int i5, int i6) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheckWhat(this, chatMessageCell, i5, i6);
                    }

                    @Override
                    public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell, int i5) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGiveawayChatButton(this, chatMessageCell, i5);
                    }

                    @Override
                    public void didPressGroupImage(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGroupImage(this, chatMessageCell, imageReceiver, messageExtendedMedia, f, f2);
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
                    public void didPressImage(ChatMessageCell chatMessageCell, float f, float f2, boolean z3) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressImage(this, chatMessageCell, f, f2, z3);
                    }

                    @Override
                    public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressMoreChannelRecommendations(this, chatMessageCell);
                    }

                    @Override
                    public void didPressOther(ChatMessageCell chatMessageCell, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressOther(this, chatMessageCell, f, f2);
                    }

                    @Override
                    public void didPressPollMedia(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i5) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressPollMedia(this, chatMessageCell, imageReceiver, pollAnswer, messageMedia, f, f2, i5);
                    }

                    @Override
                    public void didPressReaction(ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z3, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReaction(this, chatMessageCell, reactionCount, z3, f, f2);
                    }

                    @Override
                    public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRevealSensitiveContent(this, chatMessageCell);
                    }

                    @Override
                    public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell, TLRPC.Document document, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRichDocumentOptions(this, chatMessageCell, document, f, f2);
                    }

                    @Override
                    public void didPressShowMore(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressShowMore(this, chatMessageCell);
                    }

                    @Override
                    public void didPressSideButton(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSideButton(this, chatMessageCell);
                    }

                    @Override
                    public void didPressSponsoredClose(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredClose(this, chatMessageCell);
                    }

                    @Override
                    public void didPressSponsoredInfo(ChatMessageCell chatMessageCell, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredInfo(this, chatMessageCell, f, f2);
                    }

                    @Override
                    public void didPressSummarize(ChatMessageCell chatMessageCell, boolean z3) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSummarize(this, chatMessageCell, z3);
                    }

                    @Override
                    public void didPressTime(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressTime(this, chatMessageCell);
                    }

                    @Override
                    public boolean didPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem, boolean z3) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressToDoButton(this, chatMessageCell, todoItem, z3);
                    }

                    @Override
                    public void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z3) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUrl(this, chatMessageCell, characterStyle, z3);
                    }

                    @Override
                    public void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2, boolean z3) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserAvatar(this, chatMessageCell, user, f, f2, z3);
                    }

                    @Override
                    public void didPressUserStatus(ChatMessageCell chatMessageCell, TLRPC.User user, TLRPC.Document document, String str) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserStatus(this, chatMessageCell, user, document, str);
                    }

                    @Override
                    public void didPressViaBot(ChatMessageCell chatMessageCell, String str) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBot(this, chatMessageCell, str);
                    }

                    @Override
                    public void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j3) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBotNotInline(this, chatMessageCell, j3);
                    }

                    @Override
                    public void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList arrayList, int i5, int i6, int i7) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressVoteButtons(this, chatMessageCell, arrayList, i5, i6, i7);
                    }

                    @Override
                    public void didPressWebPage(ChatMessageCell chatMessageCell, TLRPC.WebPage webPage4, String str, boolean z3) {
                        Browser.openUrl(chatMessageCell.getContext(), str);
                    }

                    @Override
                    public void didQuickShareEnd(ChatMessageCell chatMessageCell, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareEnd(this, chatMessageCell, f, f2);
                    }

                    @Override
                    public void didQuickShareMove(ChatMessageCell chatMessageCell, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareMove(this, chatMessageCell, f, f2);
                    }

                    @Override
                    public void didQuickShareStart(ChatMessageCell chatMessageCell, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareStart(this, chatMessageCell, f, f2);
                    }

                    @Override
                    public void didStartVideoStream(MessageObject messageObject9) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didStartVideoStream(this, messageObject9);
                    }

                    @Override
                    public void didTogglePollPreview(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didTogglePollPreview(this, chatMessageCell);
                    }

                    @Override
                    public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell, boolean z3, Runnable runnable) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didToggleRichMessageCheckbox(this, chatMessageCell, z3, runnable);
                    }

                    @Override
                    public boolean doNotShowLoadingReply(MessageObject messageObject9) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$doNotShowLoadingReply(this, messageObject9);
                    }

                    @Override
                    public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$drawPollMode(this, canvas, chatMessageCell);
                    }

                    @Override
                    public void forceUpdate(ChatMessageCell chatMessageCell, boolean z3) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdate(this, chatMessageCell, z3);
                    }

                    @Override
                    public void forceUpdate(ChatMessageCell chatMessageCell, boolean z3, boolean z4) {
                        forceUpdate(chatMessageCell, z3);
                    }

                    @Override
                    public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell, boolean z3) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdateNoAnimation(this, chatMessageCell, z3);
                    }

                    @Override
                    public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAddPollOptionInputFieldHeight(this, chatMessageCell);
                    }

                    @Override
                    public String getAdminRank(long j3) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAdminRank(this, j3);
                    }

                    @Override
                    public int getChatMode() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getChatMode(this);
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
                    public boolean isAdmin(long j3) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isAdmin(this, j3);
                    }

                    @Override
                    public boolean isLandscape() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isLandscape(this);
                    }

                    @Override
                    public boolean isOwner(long j3) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isOwner(this, j3);
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
                    public boolean needPlayMessage(ChatMessageCell chatMessageCell, MessageObject messageObject9, boolean z3) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$needPlayMessage(this, chatMessageCell, messageObject9, z3);
                    }

                    @Override
                    public void needReloadPolls() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$needReloadPolls(this);
                    }

                    @Override
                    public void needShowPremiumBulletin(int i5) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$needShowPremiumBulletin(this, i5);
                    }

                    @Override
                    public boolean onAccessibilityAction(int i5, Bundle bundle) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$onAccessibilityAction(this, i5, bundle);
                    }

                    @Override
                    public void onDiceFinished() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$onDiceFinished(this);
                    }

                    @Override
                    public boolean openArticlePhoto(ChatMessageCell chatMessageCell, TL_iv.PageBlock pageBlock) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$openArticlePhoto(this, chatMessageCell, pageBlock);
                    }

                    @Override
                    public void setShouldNotRepeatSticker(MessageObject messageObject9) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$setShouldNotRepeatSticker(this, messageObject9);
                    }

                    @Override
                    public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell, boolean z3) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldDrawThreadProgress(this, chatMessageCell, z3);
                    }

                    @Override
                    public boolean shouldRepeatSticker(MessageObject messageObject9) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldRepeatSticker(this, messageObject9);
                    }

                    @Override
                    public void videoTimerReached() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$videoTimerReached(this);
                    }

                    @Override
                    public boolean canPerformActions() {
                        return ThemePreviewMessagesCell.this.allowLoadingOnTouch();
                    }

                    @Override
                    public void didPressReplyMessage(ChatMessageCell chatMessageCell, int i5, float f, float f2, boolean z3) {
                        if (ThemePreviewMessagesCell.this.allowLoadingOnTouch()) {
                            ThemePreviewMessagesCell.this.progress = 0;
                            chatMessageCell.invalidate();
                            AndroidUtilities.cancelRunOnUIThread(ThemePreviewMessagesCell.this.cancelProgress);
                            AndroidUtilities.runOnUIThread(ThemePreviewMessagesCell.this.cancelProgress, 5000L);
                        }
                    }

                    @Override
                    public void needOpenWebView(MessageObject messageObject9, String str, String str2, String str3, String str4, int i5, int i6) {
                        if (ThemePreviewMessagesCell.this.allowLoadingOnTouch()) {
                            ThemePreviewMessagesCell.this.progress = 2;
                            AndroidUtilities.cancelRunOnUIThread(ThemePreviewMessagesCell.this.cancelProgress);
                            AndroidUtilities.runOnUIThread(ThemePreviewMessagesCell.this.cancelProgress, 5000L);
                        }
                    }

                    @Override
                    public void didPressInstantButton(ChatMessageCell chatMessageCell, int i5) {
                        if (ThemePreviewMessagesCell.this.allowLoadingOnTouch()) {
                            ThemePreviewMessagesCell.this.progress = 2;
                            chatMessageCell.invalidate();
                            AndroidUtilities.cancelRunOnUIThread(ThemePreviewMessagesCell.this.cancelProgress);
                            AndroidUtilities.runOnUIThread(ThemePreviewMessagesCell.this.cancelProgress, 5000L);
                        }
                    }

                    @Override
                    public boolean isProgressLoading(ChatMessageCell chatMessageCell, int i5) {
                        return i5 == ThemePreviewMessagesCell.this.progress;
                    }
                });
                ChatMessageCell chatMessageCell = this.cells[i2];
                if (i != 2 || i == 4) {
                    z = true;
                } else {
                    z = false;
                }
                chatMessageCell.isChat = z;
                chatMessageCell.setFullyDraw(true);
                if (i2 == 0) {
                    messageObject2 = messageObject3;
                } else {
                    messageObject2 = messageObject;
                }
                if (messageObject2 == null) {
                    this.cells[i2].setMessageObject(messageObject2, null, false, false, false);
                    addView(this.cells[i2], LayoutHelper.createLinear(-1, -2));
                }
                i2++;
            }
        }
        i2 = 0;
        while (true) {
            chatMessageCellArr = this.cells;
            if (i2 < chatMessageCellArr.length) {
                return;
            }
            chatMessageCellArr[i2] = new ChatMessageCell(context, i3, false, null, resourcesProvider, context, i) {
                private final AnimatedColor color1;
                private final AnimatedColor color2;
                private GestureDetector gestureDetector;
                final Context val$context;
                final int val$type;

                class C00181 extends GestureDetector.SimpleOnGestureListener {
                    C00181() {
                    }

                    @Override
                    public boolean onDoubleTap(MotionEvent motionEvent) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        if (anonymousClass1.val$type != 2 || MediaDataController.getInstance(anonymousClass1.currentAccount).getDoubleTapReaction() == null) {
                            return false;
                        }
                        boolean zSelectReaction = getMessageObject().selectReaction(ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(MediaDataController.getInstance(AnonymousClass1.this.currentAccount).getDoubleTapReaction()), false, false);
                        AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                        anonymousClass2.setMessageObject(anonymousClass2.getMessageObject(), null, false, false, false);
                        requestLayout();
                        ReactionsEffectOverlay.removeCurrent(false);
                        if (zSelectReaction) {
                            ThemePreviewMessagesCell themePreviewMessagesCell = ThemePreviewMessagesCell.this;
                            ReactionsEffectOverlay.show(themePreviewMessagesCell.fragment, null, themePreviewMessagesCell.cells[1], null, motionEvent.getX(), motionEvent.getY(), ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(MediaDataController.getInstance(AnonymousClass1.this.currentAccount).getDoubleTapReaction()), AnonymousClass1.this.currentAccount, 0);
                            ReactionsEffectOverlay.startAnimation();
                        }
                        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC00191());
                        return true;
                    }

                    class ViewTreeObserverOnPreDrawListenerC00191 implements ViewTreeObserver.OnPreDrawListener {
                        ViewTreeObserverOnPreDrawListenerC00191() {
                        }

                        @Override
                        public boolean onPreDraw() {
                            getViewTreeObserver().removeOnPreDrawListener(this);
                            getTransitionParams().resetAnimation();
                            getTransitionParams().animateChange();
                            getTransitionParams().animateChange = true;
                            getTransitionParams().animateChangeProgress = 0.0f;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    this.f$0.lambda$onPreDraw$0(valueAnimator);
                                }
                            });
                            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    super.onAnimationEnd(animator);
                                    getTransitionParams().resetAnimation();
                                    getTransitionParams().animateChange = false;
                                    getTransitionParams().animateChangeProgress = 1.0f;
                                }
                            });
                            valueAnimatorOfFloat.start();
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
                    this.val$type = i;
                    this.gestureDetector = new GestureDetector(context, new C00181());
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
                    this.color1 = new AnimatedColor(this, 0L, 180L, cubicBezierInterpolator);
                    this.color2 = new AnimatedColor(this, 0L, 180L, cubicBezierInterpolator);
                }

                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (ThemePreviewMessagesCell.this.allowLoadingOnTouch()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.gestureDetector.onTouchEvent(motionEvent);
                    return true;
                }

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    int themedColor;
                    int themedColor2;
                    if (getMessageObject() != null && getMessageObject().overrideLinkColor >= 0) {
                        int i5 = getMessageObject().overrideLinkColor;
                        if (i5 >= 14) {
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            MessagesController.PeerColors peerColors = messagesController != null ? messagesController.peerColors : null;
                            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i5) : null;
                            if (color != null) {
                                int color1 = color.getColor1();
                                themedColor = getThemedColor(Theme.keys_avatar_background[AvatarDrawable.getPeerColorIndex(color1)]);
                                themedColor2 = getThemedColor(Theme.keys_avatar_background2[AvatarDrawable.getPeerColorIndex(color1)]);
                            } else {
                                long j3 = i5;
                                themedColor = getThemedColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(j3)]);
                                themedColor2 = getThemedColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(j3)]);
                            }
                        } else {
                            long j4 = i5;
                            themedColor = getThemedColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(j4)]);
                            themedColor2 = getThemedColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(j4)]);
                        }
                        this.avatarDrawable.setColor(this.color1.set(themedColor), this.color2.set(themedColor2));
                    } else {
                        this.color1.set(this.avatarDrawable.getColor());
                        this.color2.set(this.avatarDrawable.getColor2());
                    }
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
            this.cells[i2].setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
                @Override
                public boolean allowAddPollOptions() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$allowAddPollOptions(this);
                }

                @Override
                public boolean canDrawOutboundsContent() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canDrawOutboundsContent(this);
                }

                @Override
                public boolean canPerformReply() {
                    return canPerformActions();
                }

                @Override
                public boolean canSaveRichDocument(ChatMessageCell chatMessageCell2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canSaveRichDocument(this, chatMessageCell2);
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
                public void didLongPressBotButton(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressBotButton(this, chatMessageCell2, keyboardButtonProto);
                }

                @Override
                public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i5, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressChannelAvatar(this, chatMessageCell2, chat, i5, f, f2);
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
                public void didPressAppUpdateButton() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAppUpdateButton(this);
                }

                @Override
                public void didPressBoostCounter(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBoostCounter(this, chatMessageCell2);
                }

                @Override
                public void didPressBotButton(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBotButton(this, chatMessageCell2, keyboardButtonProto);
                }

                @Override
                public void didPressCancelSendButton(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCancelSendButton(this, chatMessageCell2);
                }

                @Override
                public void didPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i5, float f, float f2, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelAvatar(this, chatMessageCell2, chat, i5, f, f2, z3);
                }

                @Override
                public void didPressChannelRecommendation(ChatMessageCell chatMessageCell2, TLObject tLObject, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendation(this, chatMessageCell2, tLObject, z3);
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
                public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressExtendedMediaPreview(this, chatMessageCell2, keyboardInlineButton);
                }

                @Override
                public void didPressFactCheck(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheck(this, chatMessageCell2);
                }

                @Override
                public void didPressFactCheckWhat(ChatMessageCell chatMessageCell2, int i5, int i6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheckWhat(this, chatMessageCell2, i5, i6);
                }

                @Override
                public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell2, int i5) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGiveawayChatButton(this, chatMessageCell2, i5);
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
                public void didPressHint(ChatMessageCell chatMessageCell2, int i5) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHint(this, chatMessageCell2, i5);
                }

                @Override
                public void didPressImage(ChatMessageCell chatMessageCell2, float f, float f2, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressImage(this, chatMessageCell2, f, f2, z3);
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
                public void didPressPollMedia(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i5) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressPollMedia(this, chatMessageCell2, imageReceiver, pollAnswer, messageMedia, f, f2, i5);
                }

                @Override
                public void didPressReaction(ChatMessageCell chatMessageCell2, TLRPC.ReactionCount reactionCount, boolean z3, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReaction(this, chatMessageCell2, reactionCount, z3, f, f2);
                }

                @Override
                public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRevealSensitiveContent(this, chatMessageCell2);
                }

                @Override
                public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell2, TLRPC.Document document, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRichDocumentOptions(this, chatMessageCell2, document, f, f2);
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
                public void didPressSummarize(ChatMessageCell chatMessageCell2, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSummarize(this, chatMessageCell2, z3);
                }

                @Override
                public void didPressTime(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressTime(this, chatMessageCell2);
                }

                @Override
                public boolean didPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem, boolean z3) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressToDoButton(this, chatMessageCell2, todoItem, z3);
                }

                @Override
                public void didPressUrl(ChatMessageCell chatMessageCell2, CharacterStyle characterStyle, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUrl(this, chatMessageCell2, characterStyle, z3);
                }

                @Override
                public void didPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user, float f, float f2, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserAvatar(this, chatMessageCell2, user, f, f2, z3);
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
                public void didPressViaBotNotInline(ChatMessageCell chatMessageCell2, long j3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBotNotInline(this, chatMessageCell2, j3);
                }

                @Override
                public void didPressVoteButtons(ChatMessageCell chatMessageCell2, ArrayList arrayList, int i5, int i6, int i7) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressVoteButtons(this, chatMessageCell2, arrayList, i5, i6, i7);
                }

                @Override
                public void didPressWebPage(ChatMessageCell chatMessageCell2, TLRPC.WebPage webPage4, String str, boolean z3) {
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
                public void didStartVideoStream(MessageObject messageObject9) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didStartVideoStream(this, messageObject9);
                }

                @Override
                public void didTogglePollPreview(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didTogglePollPreview(this, chatMessageCell2);
                }

                @Override
                public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2, boolean z3, Runnable runnable) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didToggleRichMessageCheckbox(this, chatMessageCell2, z3, runnable);
                }

                @Override
                public boolean doNotShowLoadingReply(MessageObject messageObject9) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$doNotShowLoadingReply(this, messageObject9);
                }

                @Override
                public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$drawPollMode(this, canvas, chatMessageCell2);
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell2, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdate(this, chatMessageCell2, z3);
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell2, boolean z3, boolean z4) {
                    forceUpdate(chatMessageCell2, z3);
                }

                @Override
                public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell2, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdateNoAnimation(this, chatMessageCell2, z3);
                }

                @Override
                public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAddPollOptionInputFieldHeight(this, chatMessageCell2);
                }

                @Override
                public String getAdminRank(long j3) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAdminRank(this, j3);
                }

                @Override
                public int getChatMode() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getChatMode(this);
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
                public boolean isAdmin(long j3) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isAdmin(this, j3);
                }

                @Override
                public boolean isLandscape() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isLandscape(this);
                }

                @Override
                public boolean isOwner(long j3) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isOwner(this, j3);
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
                public boolean needPlayMessage(ChatMessageCell chatMessageCell2, MessageObject messageObject9, boolean z3) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$needPlayMessage(this, chatMessageCell2, messageObject9, z3);
                }

                @Override
                public void needReloadPolls() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needReloadPolls(this);
                }

                @Override
                public void needShowPremiumBulletin(int i5) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needShowPremiumBulletin(this, i5);
                }

                @Override
                public boolean onAccessibilityAction(int i5, Bundle bundle) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$onAccessibilityAction(this, i5, bundle);
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
                public void setShouldNotRepeatSticker(MessageObject messageObject9) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$setShouldNotRepeatSticker(this, messageObject9);
                }

                @Override
                public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell2, boolean z3) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldDrawThreadProgress(this, chatMessageCell2, z3);
                }

                @Override
                public boolean shouldRepeatSticker(MessageObject messageObject9) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldRepeatSticker(this, messageObject9);
                }

                @Override
                public void videoTimerReached() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$videoTimerReached(this);
                }

                @Override
                public boolean canPerformActions() {
                    return ThemePreviewMessagesCell.this.allowLoadingOnTouch();
                }

                @Override
                public void didPressReplyMessage(ChatMessageCell chatMessageCell2, int i5, float f, float f2, boolean z3) {
                    if (ThemePreviewMessagesCell.this.allowLoadingOnTouch()) {
                        ThemePreviewMessagesCell.this.progress = 0;
                        chatMessageCell2.invalidate();
                        AndroidUtilities.cancelRunOnUIThread(ThemePreviewMessagesCell.this.cancelProgress);
                        AndroidUtilities.runOnUIThread(ThemePreviewMessagesCell.this.cancelProgress, 5000L);
                    }
                }

                @Override
                public void needOpenWebView(MessageObject messageObject9, String str, String str2, String str3, String str4, int i5, int i6) {
                    if (ThemePreviewMessagesCell.this.allowLoadingOnTouch()) {
                        ThemePreviewMessagesCell.this.progress = 2;
                        AndroidUtilities.cancelRunOnUIThread(ThemePreviewMessagesCell.this.cancelProgress);
                        AndroidUtilities.runOnUIThread(ThemePreviewMessagesCell.this.cancelProgress, 5000L);
                    }
                }

                @Override
                public void didPressInstantButton(ChatMessageCell chatMessageCell2, int i5) {
                    if (ThemePreviewMessagesCell.this.allowLoadingOnTouch()) {
                        ThemePreviewMessagesCell.this.progress = 2;
                        chatMessageCell2.invalidate();
                        AndroidUtilities.cancelRunOnUIThread(ThemePreviewMessagesCell.this.cancelProgress);
                        AndroidUtilities.runOnUIThread(ThemePreviewMessagesCell.this.cancelProgress, 5000L);
                    }
                }

                @Override
                public boolean isProgressLoading(ChatMessageCell chatMessageCell2, int i5) {
                    return i5 == ThemePreviewMessagesCell.this.progress;
                }
            });
            ChatMessageCell chatMessageCell2 = this.cells[i2];
            if (i != 2) {
                z = true;
            } else {
                z = true;
            }
            chatMessageCell2.isChat = z;
            chatMessageCell2.setFullyDraw(true);
            if (i2 == 0) {
                messageObject2 = messageObject3;
            } else {
                messageObject2 = messageObject;
            }
            if (messageObject2 == null) {
                this.cells[i2].setMessageObject(messageObject2, null, false, false, false);
                addView(this.cells[i2], LayoutHelper.createLinear(-1, -2));
            }
            i2++;
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

    public void setOverrideBackground(Drawable drawable) {
        this.overrideDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if ((this.overrideDrawable instanceof ChatBackgroundDrawable) && isAttachedToWindow()) {
            ((ChatBackgroundDrawable) this.overrideDrawable).onAttachedToWindow(this);
        }
        invalidate();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.overrideDrawable;
        if (drawable instanceof ChatBackgroundDrawable) {
            ((ChatBackgroundDrawable) drawable).onAttachedToWindow(this);
        }
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.overrideDrawable || drawable == this.oldBackgroundDrawable || super.verifyDrawable(drawable);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Drawable cachedWallpaperNonBlocking = this.overrideDrawable;
        if (cachedWallpaperNonBlocking == null) {
            cachedWallpaperNonBlocking = Theme.getCachedWallpaperNonBlocking();
        }
        if (Theme.wallpaperLoadTask != null) {
            invalidate();
        }
        if (cachedWallpaperNonBlocking != this.backgroundDrawable && cachedWallpaperNonBlocking != null) {
            if (Theme.isAnimatingColor() || this.customAnimation) {
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
            this.overrideDrawableUpdate.set(0.0f, true);
        }
        float themeAnimationValue = this.customAnimation ? this.overrideDrawableUpdate.set(1.0f) : this.parentLayout.getThemeAnimationValue();
        int i = 0;
        while (i < 2) {
            Drawable drawable = i == 0 ? this.oldBackgroundDrawable : this.backgroundDrawable;
            if (drawable != null) {
                int i2 = (i != 1 || this.oldBackgroundDrawable == null || (this.parentLayout == null && !this.customAnimation)) ? 255 : (int) (255.0f * themeAnimationValue);
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
                            float fMax = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight / drawable.getIntrinsicHeight());
                            int iCeil = (int) Math.ceil(drawable.getIntrinsicWidth() * fMax);
                            int iCeil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * fMax);
                            int measuredWidth = (getMeasuredWidth() - iCeil) / 2;
                            int i3 = (measuredHeight - iCeil2) / 2;
                            canvas.save();
                            canvas.clipRect(0, 0, iCeil, getMeasuredHeight());
                            drawable.setBounds(measuredWidth, i3, iCeil + measuredWidth, iCeil2 + i3);
                        }
                        drawable.draw(canvas);
                        canvas.restore();
                    } else {
                        StoryEntry.drawBackgroundDrawable(canvas, drawable, getWidth(), getHeight());
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

    public boolean allowLoadingOnTouch() {
        int i = this.type;
        return i == 3 || i == 0;
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
        Drawable drawable = this.overrideDrawable;
        if (drawable instanceof ChatBackgroundDrawable) {
            ((ChatBackgroundDrawable) drawable).onDetachedFromWindow(this);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.type == 2 || allowLoadingOnTouch()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.type == 2 || allowLoadingOnTouch()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.type == 2 || allowLoadingOnTouch()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
