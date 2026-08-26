package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.stripe.android.Stripe;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda174;
import org.telegram.ui.ChatBackgroundDrawable;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.recorder.StoryEntry;

public class ThemePreviewMessagesCell extends LinearLayout {
    public Drawable backgroundDrawable;
    public BackgroundGradientDrawable.Disposable backgroundGradientDisposable;
    public final ChatActivity$$ExternalSyntheticLambda174 cancelProgress;
    public final ChatMessageCell[] cells;
    public boolean customAnimation;
    public BaseFragment fragment;
    public Drawable oldBackgroundDrawable;
    public BackgroundGradientDrawable.Disposable oldBackgroundGradientDisposable;
    public Drawable overrideDrawable;
    public final AnimatedFloat overrideDrawableUpdate;
    public final INavigationLayout parentLayout;
    public int progress;
    public final Drawable shadowDrawable;
    public final int type;

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
        this.cells = new ChatMessageCell[2];
        this.progress = -1;
        this.cancelProgress = new ChatActivity$$ExternalSyntheticLambda174(this, 3);
        this.overrideDrawableUpdate = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.type = i4;
        int i5 = UserConfig.selectedAccount;
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
                int i6 = iCurrentTimeMillis - 3540;
                tL_message3.date = i6;
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
                tL_message5.date = i6;
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
                    messageObject8.customAvatarDrawable = new AvatarDrawable(tL_user);
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
                chatMessageCellArr[i2] = new ChatMessageCell(context2, i5, resourcesProvider2, context, i3) {
                    public final AnimatedColor color1;
                    public final AnimatedColor color2;
                    public final GestureDetector gestureDetector;
                    public final int val$type;

                    public final class C00061 extends GestureDetector.SimpleOnGestureListener {
                        public C00061() {
                        }

                        @Override
                        public final boolean onDoubleTap(MotionEvent motionEvent) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            if (anonymousClass1.val$type == 2) {
                                int i = anonymousClass1.currentAccount;
                                if (MediaDataController.getInstance(i).getDoubleTapReaction() != null) {
                                    boolean zSelectReaction = anonymousClass1.getMessageObject().selectReaction(ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(MediaDataController.getInstance(i).getDoubleTapReaction()), false, false);
                                    anonymousClass1.setMessageObject(anonymousClass1.getMessageObject(), null, false, false, false, false);
                                    anonymousClass1.requestLayout();
                                    ReactionsEffectOverlay.removeCurrent(false);
                                    if (zSelectReaction) {
                                        ThemePreviewMessagesCell themePreviewMessagesCell = ThemePreviewMessagesCell.this;
                                        ReactionsEffectOverlay.show(themePreviewMessagesCell.fragment, null, themePreviewMessagesCell.cells[1], null, motionEvent.getX(), motionEvent.getY(), ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(MediaDataController.getInstance(i).getDoubleTapReaction()), anonymousClass1.currentAccount, 0);
                                        ReactionsEffectOverlay.startAnimation();
                                    }
                                    anonymousClass1.getViewTreeObserver().addOnPreDrawListener(new PhotoViewer.AnonymousClass9(this, 1));
                                    return true;
                                }
                            }
                            return false;
                        }
                    }

                    {
                        this.val$type = i3;
                        this.gestureDetector = new GestureDetector(context, new C00061());
                        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
                        this.color1 = new AnimatedColor(this, 180L, cubicBezierInterpolator, 0);
                        this.color2 = new AnimatedColor(this, 180L, cubicBezierInterpolator, 0);
                    }

                    @Override
                    public final void dispatchDraw(Canvas canvas) {
                        int iChangeColorAccent;
                        int color;
                        int color2;
                        int color3;
                        int color4;
                        MessageObject messageObject9 = getMessageObject();
                        AnimatedColor animatedColor = this.color2;
                        AnimatedColor animatedColor2 = this.color1;
                        AvatarDrawable avatarDrawable = this.avatarDrawable;
                        if (messageObject9 == null || getMessageObject().overrideLinkColor < 0) {
                            animatedColor2.set(avatarDrawable.getColor(), false);
                            if (avatarDrawable.needApplyColorAccent) {
                                int i7 = avatarDrawable.color2;
                                Theme.ThemeAccent accent = Theme.currentTheme.getAccent(false);
                                iChangeColorAccent = Theme.changeColorAccent(Theme.currentTheme, accent != null ? accent.accentColor : 0, i7);
                            } else {
                                iChangeColorAccent = avatarDrawable.color2;
                            }
                            animatedColor.set(iChangeColorAccent, false);
                        } else {
                            int i8 = getMessageObject().overrideLinkColor;
                            if (i8 >= 14) {
                                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                                MessagesController.PeerColors peerColors = messagesController != null ? messagesController.peerColors : null;
                                MessagesController.PeerColor color5 = peerColors != null ? peerColors.getColor(i8) : null;
                                if (color5 != null) {
                                    int color1 = color5.getColor1();
                                    color3 = Theme.getColor(Theme.keys_avatar_background[AvatarDrawable.getPeerColorIndex(color1)], this.resourcesProvider);
                                    color4 = Theme.getColor(Theme.keys_avatar_background2[AvatarDrawable.getPeerColorIndex(color1)], this.resourcesProvider);
                                } else {
                                    long j3 = i8;
                                    color = Theme.getColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(j3)], this.resourcesProvider);
                                    color2 = Theme.getColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(j3)], this.resourcesProvider);
                                }
                                avatarDrawable.setColor(animatedColor2.set(color3, false), animatedColor.set(color4, false));
                            } else {
                                long j4 = i8;
                                color = Theme.getColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(j4)], this.resourcesProvider);
                                color2 = Theme.getColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(j4)], this.resourcesProvider);
                            }
                            int i9 = color2;
                            color3 = color;
                            color4 = i9;
                            avatarDrawable.setColor(animatedColor2.set(color3, false), animatedColor.set(color4, false));
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
                        if (ThemePreviewMessagesCell.this.allowLoadingOnTouch()) {
                            return super.onTouchEvent(motionEvent);
                        }
                        this.gestureDetector.onTouchEvent(motionEvent);
                        return true;
                    }
                };
                this.cells[i2].setDelegate(new Stripe(this, 16));
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
                    this.cells[i2].setMessageObject(messageObject3, null, false, false, false, false);
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
            chatMessageCellArr[i2] = new ChatMessageCell(context2, i5, resourcesProvider2, context, i3) {
                public final AnimatedColor color1;
                public final AnimatedColor color2;
                public final GestureDetector gestureDetector;
                public final int val$type;

                public final class C00061 extends GestureDetector.SimpleOnGestureListener {
                    public C00061() {
                    }

                    @Override
                    public final boolean onDoubleTap(MotionEvent motionEvent) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        if (anonymousClass1.val$type == 2) {
                            int i = anonymousClass1.currentAccount;
                            if (MediaDataController.getInstance(i).getDoubleTapReaction() != null) {
                                boolean zSelectReaction = anonymousClass1.getMessageObject().selectReaction(ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(MediaDataController.getInstance(i).getDoubleTapReaction()), false, false);
                                anonymousClass1.setMessageObject(anonymousClass1.getMessageObject(), null, false, false, false, false);
                                anonymousClass1.requestLayout();
                                ReactionsEffectOverlay.removeCurrent(false);
                                if (zSelectReaction) {
                                    ThemePreviewMessagesCell themePreviewMessagesCell = ThemePreviewMessagesCell.this;
                                    ReactionsEffectOverlay.show(themePreviewMessagesCell.fragment, null, themePreviewMessagesCell.cells[1], null, motionEvent.getX(), motionEvent.getY(), ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(MediaDataController.getInstance(i).getDoubleTapReaction()), anonymousClass1.currentAccount, 0);
                                    ReactionsEffectOverlay.startAnimation();
                                }
                                anonymousClass1.getViewTreeObserver().addOnPreDrawListener(new PhotoViewer.AnonymousClass9(this, 1));
                                return true;
                            }
                        }
                        return false;
                    }
                }

                {
                    this.val$type = i3;
                    this.gestureDetector = new GestureDetector(context, new C00061());
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
                    this.color1 = new AnimatedColor(this, 180L, cubicBezierInterpolator, 0);
                    this.color2 = new AnimatedColor(this, 180L, cubicBezierInterpolator, 0);
                }

                @Override
                public final void dispatchDraw(Canvas canvas) {
                    int iChangeColorAccent;
                    int color;
                    int color2;
                    int color3;
                    int color4;
                    MessageObject messageObject9 = getMessageObject();
                    AnimatedColor animatedColor = this.color2;
                    AnimatedColor animatedColor2 = this.color1;
                    AvatarDrawable avatarDrawable = this.avatarDrawable;
                    if (messageObject9 == null || getMessageObject().overrideLinkColor < 0) {
                        animatedColor2.set(avatarDrawable.getColor(), false);
                        if (avatarDrawable.needApplyColorAccent) {
                            int i7 = avatarDrawable.color2;
                            Theme.ThemeAccent accent = Theme.currentTheme.getAccent(false);
                            iChangeColorAccent = Theme.changeColorAccent(Theme.currentTheme, accent != null ? accent.accentColor : 0, i7);
                        } else {
                            iChangeColorAccent = avatarDrawable.color2;
                        }
                        animatedColor.set(iChangeColorAccent, false);
                    } else {
                        int i8 = getMessageObject().overrideLinkColor;
                        if (i8 >= 14) {
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            MessagesController.PeerColors peerColors = messagesController != null ? messagesController.peerColors : null;
                            MessagesController.PeerColor color5 = peerColors != null ? peerColors.getColor(i8) : null;
                            if (color5 != null) {
                                int color1 = color5.getColor1();
                                color3 = Theme.getColor(Theme.keys_avatar_background[AvatarDrawable.getPeerColorIndex(color1)], this.resourcesProvider);
                                color4 = Theme.getColor(Theme.keys_avatar_background2[AvatarDrawable.getPeerColorIndex(color1)], this.resourcesProvider);
                            } else {
                                long j3 = i8;
                                color = Theme.getColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(j3)], this.resourcesProvider);
                                color2 = Theme.getColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(j3)], this.resourcesProvider);
                            }
                            avatarDrawable.setColor(animatedColor2.set(color3, false), animatedColor.set(color4, false));
                        } else {
                            long j4 = i8;
                            color = Theme.getColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(j4)], this.resourcesProvider);
                            color2 = Theme.getColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(j4)], this.resourcesProvider);
                        }
                        int i9 = color2;
                        color3 = color;
                        color4 = i9;
                        avatarDrawable.setColor(animatedColor2.set(color3, false), animatedColor.set(color4, false));
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
                    if (ThemePreviewMessagesCell.this.allowLoadingOnTouch()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.gestureDetector.onTouchEvent(motionEvent);
                    return true;
                }
            };
            this.cells[i2].setDelegate(new Stripe(this, 16));
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
                this.cells[i2].setMessageObject(messageObject3, null, false, false, false, false);
                addView(this.cells[i2], LayoutHelper.createLinear(-1, -2));
            }
            i2++;
            context2 = context;
            resourcesProvider2 = resourcesProvider;
            i4 = i3;
        }
    }

    public final boolean allowLoadingOnTouch() {
        int i = this.type;
        return i == 3 || i == 0;
    }

    @Override
    public final void dispatchSetPressed(boolean z) {
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.type == 2 || allowLoadingOnTouch()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public ChatMessageCell[] getCells() {
        return this.cells;
    }

    @Override
    public final void invalidate() {
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
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.overrideDrawable;
        if (drawable instanceof ChatBackgroundDrawable) {
            ((ChatBackgroundDrawable) drawable).onAttachedToWindow(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
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
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.overrideDrawable;
        if (drawable == null && (drawable = Theme.themedWallpaper) == null) {
            drawable = Theme.wallpaper;
        }
        if (Theme.wallpaperLoadTask != null) {
            invalidate();
        }
        Drawable drawable2 = this.backgroundDrawable;
        AnimatedFloat animatedFloat = this.overrideDrawableUpdate;
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
            animatedFloat.set(0.0f, true);
        }
        boolean z = this.customAnimation;
        INavigationLayout iNavigationLayout = this.parentLayout;
        float themeAnimationValue = z ? animatedFloat.set(1.0f, false) : ((ActionBarLayout) iNavigationLayout).getThemeAnimationValue();
        int i = 0;
        while (i < 2) {
            Drawable drawable3 = i == 0 ? this.oldBackgroundDrawable : this.backgroundDrawable;
            if (drawable3 != null) {
                int i2 = (i != 1 || this.oldBackgroundDrawable == null || (iNavigationLayout == null && !this.customAnimation)) ? 255 : (int) (255.0f * themeAnimationValue);
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
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable4 = this.shadowDrawable;
        drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable4.draw(canvas);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.type == 2 || allowLoadingOnTouch()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.type == 2 || allowLoadingOnTouch()) {
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
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.overrideDrawable || drawable == this.oldBackgroundDrawable || super.verifyDrawable(drawable);
    }
}
