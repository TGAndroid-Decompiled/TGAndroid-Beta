package org.telegram.ui.Cells;

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
import org.telegram.ui.ActionBar.ActionBarLayout;
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
    public static final int TYPE_GROUP_PEER_COLOR = 4;
    public static final int TYPE_PEER_COLOR = 3;
    public static final int TYPE_REACTIONS_DOUBLE_TAP = 2;
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

    public ThemePreviewMessagesCell(Context context, INavigationLayout iNavigationLayout, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        MessageObject messageObject;
        MessageObject messageObject2;
        int i2;
        ChatMessageCell[] chatMessageCellArr;
        int i3;
        boolean z;
        MessageObject messageObject3;
        super(context);
        Context context2 = context;
        int i4 = i;
        final int i5 = 0;
        this.invalidateRunnable = new Runnable(this) {
            public final ThemePreviewMessagesCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i5) {
                    case 0:
                        this.f$0.invalidate();
                        break;
                    default:
                        this.f$0.lambda$new$0();
                        break;
                }
            }
        };
        this.cells = new ChatMessageCell[2];
        this.progress = -1;
        final int i6 = 1;
        this.cancelProgress = new Runnable(this) {
            public final ThemePreviewMessagesCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i6) {
                    case 0:
                        this.f$0.invalidate();
                        break;
                    default:
                        this.f$0.lambda$new$0();
                        break;
                }
            }
        };
        this.overrideDrawableUpdate = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.type = i4;
        int i7 = UserConfig.selectedAccount;
        this.parentLayout = iNavigationLayout;
        setWillNotDraw(false);
        setOrientation(1);
        setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
        this.shadowDrawable = Theme.getThemedDrawable(context2, R.drawable.greydivider_bottom, Theme.getColor(Theme.key_windowBackgroundGrayShadow, resourcesProvider2));
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i4 == 3) {
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
            if (i4 == 2) {
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
                messageObject5.customAvatarDrawable = context2.getDrawable(R.drawable.dino_pic);
                messageObject5.overrideLinkColor = 5;
                messageObject5.overrideLinkEmoji = 0L;
                messageObject = messageObject5;
            } else {
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                if (i4 == 0) {
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
                int i8 = iCurrentTimeMillis - 3540;
                tL_message3.date = i8;
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
                if (i4 == 0) {
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
                if (i4 == 0) {
                    tL_message5.message = LocaleController.getString(R.string.FontSizePreviewLine1);
                } else {
                    tL_message5.message = LocaleController.getString(R.string.NewThemePreviewLine1);
                }
                tL_message5.date = i8;
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
                if (i4 != 0) {
                    messageObject8.customReplyName = LocaleController.getString(R.string.NewThemePreviewName);
                }
                messageObject8.eventId = 1L;
                messageObject8.resetLayout();
                messageObject8.replyMessageObject = messageObject6;
                if (i4 == 4) {
                    TLRPC.TL_user tL_user = new TLRPC.TL_user();
                    String string2 = LocaleController.getString(R.string.GroupThemePreviewSenderName);
                    tL_user.first_name = string2;
                    messageObject8.customName = string2;
                    messageObject8.customAvatarDrawable = new AvatarDrawable((TLRPC.User) tL_user, false);
                }
                messageObject = messageObject7;
                messageObject2 = messageObject8;
            }
            i2 = 0;
            while (true) {
                chatMessageCellArr = this.cells;
                if (i2 < chatMessageCellArr.length) {
                    return;
                }
                i3 = i4;
                chatMessageCellArr[i2] = new ChatMessageCell(context2, i7, resourcesProvider2, context, i3) {
                    public final AnimatedColor color1;
                    public final AnimatedColor color2;
                    public final GestureDetector gestureDetector;
                    public final int val$type;

                    public final class C00081 extends GestureDetector.SimpleOnGestureListener {

                        public final class ViewTreeObserverOnPreDrawListenerC00091 implements ViewTreeObserver.OnPreDrawListener {
                            public ViewTreeObserverOnPreDrawListenerC00091() {
                            }

                            @Override
                            public final boolean onPreDraw() {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                anonymousClass1.getViewTreeObserver().removeOnPreDrawListener(this);
                                anonymousClass1.getTransitionParams().resetAnimation();
                                anonymousClass1.getTransitionParams().animateChange();
                                anonymousClass1.getTransitionParams().animateChange = true;
                                anonymousClass1.getTransitionParams().animateChangeProgress = 0.0f;
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 9));
                                valueAnimatorOfFloat.addListener(new BotButton.AnonymousClass1(this, 8));
                                valueAnimatorOfFloat.start();
                                return false;
                            }
                        }

                        public C00081() {
                        }

                        @Override
                        public final boolean onDoubleTap(MotionEvent motionEvent) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            if (anonymousClass1.val$type != 2 || MediaDataController.getInstance(anonymousClass1.currentAccount).getDoubleTapReaction() == null) {
                                return false;
                            }
                            boolean zSelectReaction = anonymousClass1.getMessageObject().selectReaction(ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(MediaDataController.getInstance(anonymousClass1.currentAccount).getDoubleTapReaction()), false, false);
                            anonymousClass1.setMessageObject(anonymousClass1.getMessageObject(), null, false, false, false);
                            anonymousClass1.requestLayout();
                            ReactionsEffectOverlay.removeCurrent(false);
                            if (zSelectReaction) {
                                ThemePreviewMessagesCell themePreviewMessagesCell = ThemePreviewMessagesCell.this;
                                ReactionsEffectOverlay.show(themePreviewMessagesCell.fragment, null, themePreviewMessagesCell.cells[1], null, motionEvent.getX(), motionEvent.getY(), ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(MediaDataController.getInstance(anonymousClass1.currentAccount).getDoubleTapReaction()), anonymousClass1.currentAccount, 0);
                                ReactionsEffectOverlay.startAnimation();
                            }
                            anonymousClass1.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC00091());
                            return true;
                        }
                    }

                    {
                        this.val$type = i3;
                        this.gestureDetector = new GestureDetector(context, new C00081());
                        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
                        this.color1 = new AnimatedColor(this, 0L, 180L, cubicBezierInterpolator);
                        this.color2 = new AnimatedColor(this, 0L, 180L, cubicBezierInterpolator);
                    }

                    @Override
                    public final void dispatchDraw(Canvas canvas) {
                        int themedColor;
                        int themedColor2;
                        MessageObject messageObject9 = getMessageObject();
                        AnimatedColor animatedColor = this.color2;
                        AnimatedColor animatedColor2 = this.color1;
                        if (messageObject9 == null || getMessageObject().overrideLinkColor < 0) {
                            animatedColor2.set(this.avatarDrawable.getColor());
                            animatedColor.set(this.avatarDrawable.getColor2());
                        } else {
                            int i9 = getMessageObject().overrideLinkColor;
                            if (i9 >= 14) {
                                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                                MessagesController.PeerColors peerColors = messagesController != null ? messagesController.peerColors : null;
                                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i9) : null;
                                if (color != null) {
                                    int color1 = color.getColor1();
                                    themedColor = getThemedColor(Theme.keys_avatar_background[AvatarDrawable.getPeerColorIndex(color1)]);
                                    themedColor2 = getThemedColor(Theme.keys_avatar_background2[AvatarDrawable.getPeerColorIndex(color1)]);
                                } else {
                                    long j3 = i9;
                                    themedColor = getThemedColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(j3)]);
                                    themedColor2 = getThemedColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(j3)]);
                                }
                            } else {
                                long j4 = i9;
                                themedColor = getThemedColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(j4)]);
                                themedColor2 = getThemedColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(j4)]);
                            }
                            this.avatarDrawable.setColor(animatedColor2.set(themedColor), animatedColor.set(themedColor2));
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

                    @Override
                    public final boolean onTouchEvent(MotionEvent motionEvent) {
                        if (ThemePreviewMessagesCell.access$100(ThemePreviewMessagesCell.this)) {
                            return super.onTouchEvent(motionEvent);
                        }
                        this.gestureDetector.onTouchEvent(motionEvent);
                        return true;
                    }
                };
                this.cells[i2].setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
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
                        return ThemePreviewMessagesCell.access$100(ThemePreviewMessagesCell.this);
                    }

                    @Override
                    public final boolean canPerformReply() {
                        return canPerformActions();
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
                    public final boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i9, float f, float f2) {
                        return false;
                    }

                    @Override
                    public final void didLongPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
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
                    public final boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2) {
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
                    public final boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell, AnimatedEmojiSpan animatedEmojiSpan) {
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
                    public final void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i9, float f, float f2, boolean z3) {
                    }

                    @Override
                    public final void didPressChannelRecommendation(ChatMessageCell chatMessageCell, TLObject tLObject, boolean z3) {
                    }

                    @Override
                    public final void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public final void didPressCodeCopy(ChatMessageCell chatMessageCell, MessageObject.TextLayoutBlock textLayoutBlock) {
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
                    public final void didPressFactCheckWhat(ChatMessageCell chatMessageCell, int i9, int i10) {
                    }

                    @Override
                    public final void didPressGiveawayChatButton(ChatMessageCell chatMessageCell, int i9) {
                    }

                    @Override
                    public final void didPressGroupImage(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                    }

                    @Override
                    public final void didPressHiddenForward(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public final void didPressHint(ChatMessageCell chatMessageCell, int i9) {
                    }

                    @Override
                    public final void didPressImage(ChatMessageCell chatMessageCell, float f, float f2, boolean z3) {
                    }

                    @Override
                    public final void didPressInstantButton(ChatMessageCell chatMessageCell, int i9) {
                        ThemePreviewMessagesCell themePreviewMessagesCell = ThemePreviewMessagesCell.this;
                        if (ThemePreviewMessagesCell.access$100(themePreviewMessagesCell)) {
                            themePreviewMessagesCell.progress = 2;
                            chatMessageCell.invalidate();
                            AndroidUtilities.cancelRunOnUIThread(themePreviewMessagesCell.cancelProgress);
                            AndroidUtilities.runOnUIThread(themePreviewMessagesCell.cancelProgress, 5000L);
                        }
                    }

                    @Override
                    public final void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public final void didPressOther(ChatMessageCell chatMessageCell, float f, float f2) {
                    }

                    @Override
                    public final void didPressPollMedia(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i9) {
                    }

                    @Override
                    public final void didPressReaction(ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z3, float f, float f2) {
                    }

                    @Override
                    public final void didPressReplyMessage(ChatMessageCell chatMessageCell, int i9, float f, float f2, boolean z3) {
                        ThemePreviewMessagesCell themePreviewMessagesCell = ThemePreviewMessagesCell.this;
                        if (ThemePreviewMessagesCell.access$100(themePreviewMessagesCell)) {
                            themePreviewMessagesCell.progress = 0;
                            chatMessageCell.invalidate();
                            AndroidUtilities.cancelRunOnUIThread(themePreviewMessagesCell.cancelProgress);
                            AndroidUtilities.runOnUIThread(themePreviewMessagesCell.cancelProgress, 5000L);
                        }
                    }

                    @Override
                    public final void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public final void didPressRichDocumentOptions(ChatMessageCell chatMessageCell, TLRPC.Document document, float f, float f2) {
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
                    public final void didPressSummarize(ChatMessageCell chatMessageCell, boolean z3) {
                    }

                    @Override
                    public final void didPressTime(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public final boolean didPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem, boolean z3) {
                        return false;
                    }

                    @Override
                    public final void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z3) {
                    }

                    @Override
                    public final void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2, boolean z3) {
                    }

                    @Override
                    public final void didPressUserStatus(ChatMessageCell chatMessageCell, TLRPC.User user, TLRPC.Document document, String str) {
                    }

                    @Override
                    public final void didPressViaBot(ChatMessageCell chatMessageCell, String str) {
                    }

                    @Override
                    public final void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j3) {
                    }

                    @Override
                    public final void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList arrayList, int i9, int i10, int i11) {
                    }

                    @Override
                    public final void didPressWebPage(ChatMessageCell chatMessageCell, TLRPC.WebPage webPage4, String str, boolean z3) {
                        Browser.openUrl(chatMessageCell.getContext(), str);
                    }

                    @Override
                    public final void didQuickShareEnd(ChatMessageCell chatMessageCell, float f, float f2) {
                    }

                    @Override
                    public final void didQuickShareMove(ChatMessageCell chatMessageCell, float f, float f2) {
                    }

                    @Override
                    public final void didQuickShareStart(ChatMessageCell chatMessageCell, float f, float f2) {
                    }

                    @Override
                    public final void didStartVideoStream(MessageObject messageObject9) {
                    }

                    @Override
                    public final void didTogglePollPreview(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public final void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell, boolean z3, Runnable runnable) {
                    }

                    @Override
                    public final boolean doNotShowLoadingReply(MessageObject messageObject9) {
                        return Theme.ResourcesProvider.CC.$default$doNotShowLoadingReply(messageObject9);
                    }

                    @Override
                    public final void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public final void forceUpdate(ChatMessageCell chatMessageCell, boolean z3) {
                    }

                    @Override
                    public final void forceUpdateNoAnimation(ChatMessageCell chatMessageCell, boolean z3) {
                    }

                    @Override
                    public final int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell) {
                        return 0;
                    }

                    @Override
                    public final String getAdminRank(long j3) {
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
                    public final boolean isAdmin(long j3) {
                        return false;
                    }

                    @Override
                    public final boolean isLandscape() {
                        return false;
                    }

                    @Override
                    public final boolean isOwner(long j3) {
                        return false;
                    }

                    @Override
                    public final boolean isProgressLoading(ChatMessageCell chatMessageCell, int i9) {
                        return i9 == ThemePreviewMessagesCell.this.progress;
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
                    public final void needOpenWebView(MessageObject messageObject9, String str, String str2, String str3, String str4, int i9, int i10) {
                        ThemePreviewMessagesCell themePreviewMessagesCell = ThemePreviewMessagesCell.this;
                        if (ThemePreviewMessagesCell.access$100(themePreviewMessagesCell)) {
                            themePreviewMessagesCell.progress = 2;
                            AndroidUtilities.cancelRunOnUIThread(themePreviewMessagesCell.cancelProgress);
                            AndroidUtilities.runOnUIThread(themePreviewMessagesCell.cancelProgress, 5000L);
                        }
                    }

                    @Override
                    public final boolean needPlayMessage(ChatMessageCell chatMessageCell, MessageObject messageObject9, boolean z3) {
                        return false;
                    }

                    @Override
                    public final void needReloadPolls() {
                    }

                    @Override
                    public final void needShowPremiumBulletin(int i9) {
                    }

                    @Override
                    public final boolean onAccessibilityAction(int i9, Bundle bundle) {
                        return false;
                    }

                    @Override
                    public final void onDiceFinished() {
                    }

                    @Override
                    public final boolean openArticlePhoto(ChatMessageCell chatMessageCell, TL_iv.PageBlock pageBlock) {
                        return false;
                    }

                    @Override
                    public final void setShouldNotRepeatSticker(MessageObject messageObject9) {
                    }

                    @Override
                    public final boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell, boolean z3) {
                        return false;
                    }

                    @Override
                    public final boolean shouldRepeatSticker(MessageObject messageObject9) {
                        return true;
                    }

                    @Override
                    public final void videoTimerReached() {
                    }

                    @Override
                    public final void forceUpdate(ChatMessageCell chatMessageCell, boolean z3, boolean z4) {
                    }
                });
                ChatMessageCell chatMessageCell = this.cells[i2];
                if (i3 != 2 || i3 == 4) {
                    z = true;
                } else {
                    z = false;
                }
                chatMessageCell.isChat = z;
                chatMessageCell.setFullyDraw(true);
                if (i2 == 0) {
                    messageObject3 = messageObject2;
                } else {
                    messageObject3 = messageObject;
                }
                if (messageObject3 == null) {
                    this.cells[i2].setMessageObject(messageObject3, null, false, false, false);
                    addView(this.cells[i2], LayoutHelper.createLinear(-1, -2));
                }
                i2++;
                context2 = context;
                resourcesProvider2 = resourcesProvider;
                i4 = i3;
            }
        }
        messageObject2 = null;
        i2 = 0;
        while (true) {
            chatMessageCellArr = this.cells;
            if (i2 < chatMessageCellArr.length) {
                return;
            }
            i3 = i4;
            chatMessageCellArr[i2] = new ChatMessageCell(context2, i7, resourcesProvider2, context, i3) {
                public final AnimatedColor color1;
                public final AnimatedColor color2;
                public final GestureDetector gestureDetector;
                public final int val$type;

                public final class C00081 extends GestureDetector.SimpleOnGestureListener {

                    public final class ViewTreeObserverOnPreDrawListenerC00091 implements ViewTreeObserver.OnPreDrawListener {
                        public ViewTreeObserverOnPreDrawListenerC00091() {
                        }

                        @Override
                        public final boolean onPreDraw() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            anonymousClass1.getViewTreeObserver().removeOnPreDrawListener(this);
                            anonymousClass1.getTransitionParams().resetAnimation();
                            anonymousClass1.getTransitionParams().animateChange();
                            anonymousClass1.getTransitionParams().animateChange = true;
                            anonymousClass1.getTransitionParams().animateChangeProgress = 0.0f;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 9));
                            valueAnimatorOfFloat.addListener(new BotButton.AnonymousClass1(this, 8));
                            valueAnimatorOfFloat.start();
                            return false;
                        }
                    }

                    public C00081() {
                    }

                    @Override
                    public final boolean onDoubleTap(MotionEvent motionEvent) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        if (anonymousClass1.val$type != 2 || MediaDataController.getInstance(anonymousClass1.currentAccount).getDoubleTapReaction() == null) {
                            return false;
                        }
                        boolean zSelectReaction = anonymousClass1.getMessageObject().selectReaction(ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(MediaDataController.getInstance(anonymousClass1.currentAccount).getDoubleTapReaction()), false, false);
                        anonymousClass1.setMessageObject(anonymousClass1.getMessageObject(), null, false, false, false);
                        anonymousClass1.requestLayout();
                        ReactionsEffectOverlay.removeCurrent(false);
                        if (zSelectReaction) {
                            ThemePreviewMessagesCell themePreviewMessagesCell = ThemePreviewMessagesCell.this;
                            ReactionsEffectOverlay.show(themePreviewMessagesCell.fragment, null, themePreviewMessagesCell.cells[1], null, motionEvent.getX(), motionEvent.getY(), ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(MediaDataController.getInstance(anonymousClass1.currentAccount).getDoubleTapReaction()), anonymousClass1.currentAccount, 0);
                            ReactionsEffectOverlay.startAnimation();
                        }
                        anonymousClass1.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC00091());
                        return true;
                    }
                }

                {
                    this.val$type = i3;
                    this.gestureDetector = new GestureDetector(context, new C00081());
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
                    this.color1 = new AnimatedColor(this, 0L, 180L, cubicBezierInterpolator);
                    this.color2 = new AnimatedColor(this, 0L, 180L, cubicBezierInterpolator);
                }

                @Override
                public final void dispatchDraw(Canvas canvas) {
                    int themedColor;
                    int themedColor2;
                    MessageObject messageObject9 = getMessageObject();
                    AnimatedColor animatedColor = this.color2;
                    AnimatedColor animatedColor2 = this.color1;
                    if (messageObject9 == null || getMessageObject().overrideLinkColor < 0) {
                        animatedColor2.set(this.avatarDrawable.getColor());
                        animatedColor.set(this.avatarDrawable.getColor2());
                    } else {
                        int i9 = getMessageObject().overrideLinkColor;
                        if (i9 >= 14) {
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            MessagesController.PeerColors peerColors = messagesController != null ? messagesController.peerColors : null;
                            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i9) : null;
                            if (color != null) {
                                int color1 = color.getColor1();
                                themedColor = getThemedColor(Theme.keys_avatar_background[AvatarDrawable.getPeerColorIndex(color1)]);
                                themedColor2 = getThemedColor(Theme.keys_avatar_background2[AvatarDrawable.getPeerColorIndex(color1)]);
                            } else {
                                long j3 = i9;
                                themedColor = getThemedColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(j3)]);
                                themedColor2 = getThemedColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(j3)]);
                            }
                        } else {
                            long j4 = i9;
                            themedColor = getThemedColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(j4)]);
                            themedColor2 = getThemedColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(j4)]);
                        }
                        this.avatarDrawable.setColor(animatedColor2.set(themedColor), animatedColor.set(themedColor2));
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

                @Override
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    if (ThemePreviewMessagesCell.access$100(ThemePreviewMessagesCell.this)) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.gestureDetector.onTouchEvent(motionEvent);
                    return true;
                }
            };
            this.cells[i2].setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
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
                    return ThemePreviewMessagesCell.access$100(ThemePreviewMessagesCell.this);
                }

                @Override
                public final boolean canPerformReply() {
                    return canPerformActions();
                }

                @Override
                public final boolean canSaveRichDocument(ChatMessageCell chatMessageCell2) {
                    return false;
                }

                @Override
                public final boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2) {
                    return false;
                }

                @Override
                public final void didLongPress(ChatMessageCell chatMessageCell2, float f, float f2) {
                }

                @Override
                public final void didLongPressBotButton(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                }

                @Override
                public final boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i9, float f, float f2) {
                    return false;
                }

                @Override
                public final void didLongPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                }

                @Override
                public final boolean didLongPressPollOption(ChatMessageCell chatMessageCell2, TLRPC.PollAnswer pollAnswer) {
                    return false;
                }

                @Override
                public final boolean didLongPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem) {
                    return false;
                }

                @Override
                public final boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user, float f, float f2) {
                    return false;
                }

                @Override
                public final void didPressAboutRevenueSharingAds() {
                }

                @Override
                public final void didPressAddPollOptionButton(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public final void didPressAdmin(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public final boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell2, AnimatedEmojiSpan animatedEmojiSpan) {
                    return false;
                }

                @Override
                public final void didPressAppUpdateButton() {
                }

                @Override
                public final void didPressBoostCounter(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public final void didPressBotButton(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                }

                @Override
                public final void didPressCancelSendButton(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public final void didPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i9, float f, float f2, boolean z3) {
                }

                @Override
                public final void didPressChannelRecommendation(ChatMessageCell chatMessageCell2, TLObject tLObject, boolean z3) {
                }

                @Override
                public final void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public final void didPressCodeCopy(ChatMessageCell chatMessageCell2, MessageObject.TextLayoutBlock textLayoutBlock) {
                }

                @Override
                public final void didPressCommentButton(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public final void didPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                }

                @Override
                public final void didPressEffect(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public final void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                }

                @Override
                public final void didPressFactCheck(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public final void didPressFactCheckWhat(ChatMessageCell chatMessageCell2, int i9, int i10) {
                }

                @Override
                public final void didPressGiveawayChatButton(ChatMessageCell chatMessageCell2, int i9) {
                }

                @Override
                public final void didPressGroupImage(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                }

                @Override
                public final void didPressHiddenForward(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public final void didPressHint(ChatMessageCell chatMessageCell2, int i9) {
                }

                @Override
                public final void didPressImage(ChatMessageCell chatMessageCell2, float f, float f2, boolean z3) {
                }

                @Override
                public final void didPressInstantButton(ChatMessageCell chatMessageCell2, int i9) {
                    ThemePreviewMessagesCell themePreviewMessagesCell = ThemePreviewMessagesCell.this;
                    if (ThemePreviewMessagesCell.access$100(themePreviewMessagesCell)) {
                        themePreviewMessagesCell.progress = 2;
                        chatMessageCell2.invalidate();
                        AndroidUtilities.cancelRunOnUIThread(themePreviewMessagesCell.cancelProgress);
                        AndroidUtilities.runOnUIThread(themePreviewMessagesCell.cancelProgress, 5000L);
                    }
                }

                @Override
                public final void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public final void didPressOther(ChatMessageCell chatMessageCell2, float f, float f2) {
                }

                @Override
                public final void didPressPollMedia(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i9) {
                }

                @Override
                public final void didPressReaction(ChatMessageCell chatMessageCell2, TLRPC.ReactionCount reactionCount, boolean z3, float f, float f2) {
                }

                @Override
                public final void didPressReplyMessage(ChatMessageCell chatMessageCell2, int i9, float f, float f2, boolean z3) {
                    ThemePreviewMessagesCell themePreviewMessagesCell = ThemePreviewMessagesCell.this;
                    if (ThemePreviewMessagesCell.access$100(themePreviewMessagesCell)) {
                        themePreviewMessagesCell.progress = 0;
                        chatMessageCell2.invalidate();
                        AndroidUtilities.cancelRunOnUIThread(themePreviewMessagesCell.cancelProgress);
                        AndroidUtilities.runOnUIThread(themePreviewMessagesCell.cancelProgress, 5000L);
                    }
                }

                @Override
                public final void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public final void didPressRichDocumentOptions(ChatMessageCell chatMessageCell2, TLRPC.Document document, float f, float f2) {
                }

                @Override
                public final void didPressShowMore(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public final void didPressSideButton(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public final void didPressSponsoredClose(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public final void didPressSponsoredInfo(ChatMessageCell chatMessageCell2, float f, float f2) {
                }

                @Override
                public final void didPressSummarize(ChatMessageCell chatMessageCell2, boolean z3) {
                }

                @Override
                public final void didPressTime(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public final boolean didPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem, boolean z3) {
                    return false;
                }

                @Override
                public final void didPressUrl(ChatMessageCell chatMessageCell2, CharacterStyle characterStyle, boolean z3) {
                }

                @Override
                public final void didPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user, float f, float f2, boolean z3) {
                }

                @Override
                public final void didPressUserStatus(ChatMessageCell chatMessageCell2, TLRPC.User user, TLRPC.Document document, String str) {
                }

                @Override
                public final void didPressViaBot(ChatMessageCell chatMessageCell2, String str) {
                }

                @Override
                public final void didPressViaBotNotInline(ChatMessageCell chatMessageCell2, long j3) {
                }

                @Override
                public final void didPressVoteButtons(ChatMessageCell chatMessageCell2, ArrayList arrayList, int i9, int i10, int i11) {
                }

                @Override
                public final void didPressWebPage(ChatMessageCell chatMessageCell2, TLRPC.WebPage webPage4, String str, boolean z3) {
                    Browser.openUrl(chatMessageCell2.getContext(), str);
                }

                @Override
                public final void didQuickShareEnd(ChatMessageCell chatMessageCell2, float f, float f2) {
                }

                @Override
                public final void didQuickShareMove(ChatMessageCell chatMessageCell2, float f, float f2) {
                }

                @Override
                public final void didQuickShareStart(ChatMessageCell chatMessageCell2, float f, float f2) {
                }

                @Override
                public final void didStartVideoStream(MessageObject messageObject9) {
                }

                @Override
                public final void didTogglePollPreview(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public final void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2, boolean z3, Runnable runnable) {
                }

                @Override
                public final boolean doNotShowLoadingReply(MessageObject messageObject9) {
                    return Theme.ResourcesProvider.CC.$default$doNotShowLoadingReply(messageObject9);
                }

                @Override
                public final void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell2) {
                }

                @Override
                public final void forceUpdate(ChatMessageCell chatMessageCell2, boolean z3) {
                }

                @Override
                public final void forceUpdateNoAnimation(ChatMessageCell chatMessageCell2, boolean z3) {
                }

                @Override
                public final int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell2) {
                    return 0;
                }

                @Override
                public final String getAdminRank(long j3) {
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
                public final String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell2) {
                    return null;
                }

                @Override
                public final CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell2) {
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
                public final boolean isAdmin(long j3) {
                    return false;
                }

                @Override
                public final boolean isLandscape() {
                    return false;
                }

                @Override
                public final boolean isOwner(long j3) {
                    return false;
                }

                @Override
                public final boolean isProgressLoading(ChatMessageCell chatMessageCell2, int i9) {
                    return i9 == ThemePreviewMessagesCell.this.progress;
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
                public final void needOpenWebView(MessageObject messageObject9, String str, String str2, String str3, String str4, int i9, int i10) {
                    ThemePreviewMessagesCell themePreviewMessagesCell = ThemePreviewMessagesCell.this;
                    if (ThemePreviewMessagesCell.access$100(themePreviewMessagesCell)) {
                        themePreviewMessagesCell.progress = 2;
                        AndroidUtilities.cancelRunOnUIThread(themePreviewMessagesCell.cancelProgress);
                        AndroidUtilities.runOnUIThread(themePreviewMessagesCell.cancelProgress, 5000L);
                    }
                }

                @Override
                public final boolean needPlayMessage(ChatMessageCell chatMessageCell2, MessageObject messageObject9, boolean z3) {
                    return false;
                }

                @Override
                public final void needReloadPolls() {
                }

                @Override
                public final void needShowPremiumBulletin(int i9) {
                }

                @Override
                public final boolean onAccessibilityAction(int i9, Bundle bundle) {
                    return false;
                }

                @Override
                public final void onDiceFinished() {
                }

                @Override
                public final boolean openArticlePhoto(ChatMessageCell chatMessageCell2, TL_iv.PageBlock pageBlock) {
                    return false;
                }

                @Override
                public final void setShouldNotRepeatSticker(MessageObject messageObject9) {
                }

                @Override
                public final boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell2, boolean z3) {
                    return false;
                }

                @Override
                public final boolean shouldRepeatSticker(MessageObject messageObject9) {
                    return true;
                }

                @Override
                public final void videoTimerReached() {
                }

                @Override
                public final void forceUpdate(ChatMessageCell chatMessageCell2, boolean z3, boolean z4) {
                }
            });
            ChatMessageCell chatMessageCell2 = this.cells[i2];
            if (i3 != 2) {
                z = true;
            } else {
                z = true;
            }
            chatMessageCell2.isChat = z;
            chatMessageCell2.setFullyDraw(true);
            if (i2 == 0) {
                messageObject3 = messageObject2;
            } else {
                messageObject3 = messageObject;
            }
            if (messageObject3 == null) {
                this.cells[i2].setMessageObject(messageObject3, null, false, false, false);
                addView(this.cells[i2], LayoutHelper.createLinear(-1, -2));
            }
            i2++;
            context2 = context;
            resourcesProvider2 = resourcesProvider;
            i4 = i3;
        }
    }

    public static boolean access$100(ThemePreviewMessagesCell themePreviewMessagesCell) {
        int i = themePreviewMessagesCell.type;
        return i == 3 || i == 0;
    }

    @Override
    public void dispatchSetPressed(boolean z) {
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i = this.type;
        if (i == 2 || i == 3 || i == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
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

    public final void lambda$new$0() {
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

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.overrideDrawable;
        if (drawable instanceof ChatBackgroundDrawable) {
            ((ChatBackgroundDrawable) drawable).onAttachedToWindow(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
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
    public void onDraw(Canvas canvas) {
        Drawable drawable = this.overrideDrawable;
        if (drawable == null && (drawable = Theme.themedWallpaper) == null) {
            drawable = Theme.wallpaper;
        }
        if (Theme.wallpaperLoadTask != null) {
            invalidate();
        }
        Drawable drawable2 = this.backgroundDrawable;
        if (drawable != drawable2 && drawable != null) {
            if (Theme.animatingColors == null && !this.customAnimation) {
                BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
                if (disposable != null) {
                    disposable.dispose();
                    this.backgroundGradientDisposable = null;
                }
            } else {
                this.oldBackgroundDrawable = drawable2;
                this.oldBackgroundGradientDisposable = this.backgroundGradientDisposable;
            }
            this.backgroundDrawable = drawable;
            this.overrideDrawableUpdate.set(0.0f, true);
        }
        float themeAnimationValue = this.customAnimation ? this.overrideDrawableUpdate.set(1.0f) : ((ActionBarLayout) this.parentLayout).getThemeAnimationValue();
        int i = 0;
        while (i < 2) {
            Drawable drawable3 = i == 0 ? this.oldBackgroundDrawable : this.backgroundDrawable;
            if (drawable3 != null) {
                int i2 = (i != 1 || this.oldBackgroundDrawable == null || (this.parentLayout == null && !this.customAnimation)) ? 255 : (int) (255.0f * themeAnimationValue);
                if (i2 > 0) {
                    drawable3.setAlpha(i2);
                    if ((drawable3 instanceof ColorDrawable) || (drawable3 instanceof GradientDrawable) || (drawable3 instanceof MotionBackgroundDrawable)) {
                        drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable3 instanceof BackgroundGradientDrawable) {
                            this.backgroundGradientDisposable = ((BackgroundGradientDrawable) drawable3).drawExactBoundsSize(canvas, this);
                        } else {
                            drawable3.draw(canvas);
                        }
                    } else if (drawable3 instanceof BitmapDrawable) {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                        bitmapDrawable.setFilterBitmap(true);
                        if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                            canvas.save();
                            float f = 2.0f / AndroidUtilities.density;
                            canvas.scale(f, f);
                            drawable3.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getMeasuredHeight() / f));
                        } else {
                            int measuredHeight = getMeasuredHeight();
                            float fMax = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight / drawable3.getIntrinsicHeight());
                            int iCeil = (int) Math.ceil(drawable3.getIntrinsicWidth() * fMax);
                            int iCeil2 = (int) Math.ceil(drawable3.getIntrinsicHeight() * fMax);
                            int measuredWidth = (getMeasuredWidth() - iCeil) / 2;
                            int i3 = (measuredHeight - iCeil2) / 2;
                            canvas.save();
                            canvas.clipRect(0, 0, iCeil, getMeasuredHeight());
                            drawable3.setBounds(measuredWidth, i3, iCeil + measuredWidth, iCeil2 + i3);
                        }
                        drawable3.draw(canvas);
                        canvas.restore();
                    } else {
                        StoryEntry.drawBackgroundDrawable(canvas, drawable3, getWidth(), getHeight());
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
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = this.type;
        if (i == 2 || i == 3 || i == 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = this.type;
        if (i == 2 || i == 3 || i == 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
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
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.overrideDrawable || drawable == this.oldBackgroundDrawable || super.verifyDrawable(drawable);
    }
}
