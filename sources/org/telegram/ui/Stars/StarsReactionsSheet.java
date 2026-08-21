package org.telegram.ui.Stars;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import com.google.zxing.common.detector.MathUtils;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BatchParticlesDrawHelper;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.Text;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.HighlightMessageSheet;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class StarsReactionsSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private final BalanceCloud balanceCloud;
    private final ButtonWithCounterView buttonView;
    private ChatActivity chatActivity;
    private final CheckBox2 checkBox;
    private final LinearLayout checkLayout;
    private final View checkSeparatorView;
    private final TextView checkTextView;
    private boolean checkedVisiblity;
    private final ImageView closeView;
    private LiveCommentsView.Message commentMessage;
    private LiveCommentsView.LiveCommentView commentView;
    private LiveCommentsView commentsView;
    private final int currentAccount;
    private final BackupImageView dialogImageView;
    private final ImageView dialogSelectorIconView;
    private final FrameLayout dialogSelectorInnerLayout;
    private final FrameLayout dialogSelectorLayout;
    private final GLIconTextureView icon3dView;
    private ValueAnimator iconAnimator;
    public long lastSelectedPeer;
    private final LinearLayout layout;
    private final boolean liveStories;
    private View messageCell;
    private int messageId;
    private final MessageObject messageObject;
    private Utilities.Callback2Return onSendListener;
    public long peer;
    private final ArrayList reactors;
    private final Theme.ResourcesProvider resourcesProvider;
    private final boolean sendEnabled;
    private boolean sending;
    private int sentMessageId;
    private final View separatorView;
    private final StarsSlider slider;
    private final ColoredImageSpan[] starRef;
    private final TextView statusView;
    private final TextView titleView;
    private final FrameLayout topLayout;
    private final TopSendersView topSendersView;
    private final LinearLayout toptopLayout;

    @Override
    protected void appendOpenAnimator(boolean z, ArrayList arrayList) {
        arrayList.add(ObjectAnimator.ofFloat(this.balanceCloud, (Property<BalanceCloud, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.balanceCloud, (Property<BalanceCloud, Float>) View.SCALE_X, z ? 1.0f : 0.6f));
        arrayList.add(ObjectAnimator.ofFloat(this.balanceCloud, (Property<BalanceCloud, Float>) View.SCALE_Y, z ? 1.0f : 0.6f));
    }

    @Override
    protected boolean isTouchOutside(float f, float f2) {
        if (f < this.balanceCloud.getX() || f > this.balanceCloud.getX() + this.balanceCloud.getWidth() || f2 < this.balanceCloud.getY() || f2 > this.balanceCloud.getY() + this.balanceCloud.getHeight()) {
            return super.isTouchOutside(f, f2);
        }
        return false;
    }

    public StarsReactionsSheet(final android.content.Context r39, final int r40, final long r41, final org.telegram.ui.ChatActivity r43, final org.telegram.messenger.MessageObject r44, java.util.ArrayList r45, boolean r46, final boolean r47, long r48, final org.telegram.ui.ActionBar.Theme.ResourcesProvider r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarsReactionsSheet.<init>(android.content.Context, int, long, org.telegram.ui.ChatActivity, org.telegram.messenger.MessageObject, java.util.ArrayList, boolean, boolean, long, org.telegram.ui.ActionBar.Theme$ResourcesProvider):void");
    }

    public static void $r8$lambda$5nYVya0ypja5fs2EyLwc5FgW03w(StarsReactionsSheet starsReactionsSheet, int i, final boolean z, Long l) {
        starsReactionsSheet.getClass();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        if (l.longValue() >= 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", l.longValue());
            if (l.longValue() == UserConfig.getInstance(i).getClientUserId()) {
                bundle.putBoolean("my_profile", true);
            }
            safeLastFragment.presentFragment(new ProfileActivity(bundle) {
                @Override
                public void onFragmentDestroy() {
                    super.onFragmentDestroy();
                    if (z) {
                        return;
                    }
                    StarsReactionsSheet.this.show();
                }
            });
            starsReactionsSheet.dismiss();
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", -l.longValue());
            safeLastFragment.presentFragment(new ChatActivity(bundle2) {
                @Override
                public void onFragmentDestroy() {
                    super.onFragmentDestroy();
                    if (z) {
                        return;
                    }
                    StarsReactionsSheet.this.show();
                }
            });
        }
        starsReactionsSheet.dismiss();
    }

    public static void m4285$r8$lambda$bfFmTLBSaoQwQZ7YLwkTvTpWtE(StarsReactionsSheet starsReactionsSheet, View view) {
        CheckBox2 checkBox2 = starsReactionsSheet.checkBox;
        checkBox2.setChecked(!checkBox2.isChecked(), true);
        starsReactionsSheet.peer = starsReactionsSheet.checkBox.isChecked() ? starsReactionsSheet.lastSelectedPeer : 2666000L;
        starsReactionsSheet.updatePeerDialog();
        TopSendersView topSendersView = starsReactionsSheet.topSendersView;
        if (topSendersView != null) {
            topSendersView.setMyPrivacy(starsReactionsSheet.peer);
        }
    }

    public static void m4284$r8$lambda$TIgKHs5HGl4gWXSKNBGqWeHttE(final StarsReactionsSheet starsReactionsSheet, final MessageObject messageObject, final ChatActivity chatActivity, int i, boolean z, Context context, Theme.ResourcesProvider resourcesProvider, long j, TLRPC.Chat chat, View view) {
        if (starsReactionsSheet.sending) {
            return;
        }
        final long value = starsReactionsSheet.slider.getValue();
        if (!(starsReactionsSheet.onSendListener == null && (messageObject == null || chatActivity == null)) && starsReactionsSheet.iconAnimator == null) {
            if (MessagesController.getInstance(i).isFrozen()) {
                AccountFrozenAlert.show(i);
                return;
            }
            final StarsController starsController = StarsController.getInstance(i);
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    StarsReactionsSheet.$r8$lambda$pwJ1FUzJq2NiuD7f0cxhv3x6YtU(this.f$0, value, starsController, messageObject, chatActivity);
                }
            };
            if (!starsController.balanceAvailable() || starsController.getBalance().amount >= value) {
                runnable.run();
            } else if (z) {
                new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, value, 17, DialogObject.getShortName(i, j), runnable, j).show();
            } else {
                new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, value, 5, chat == null ? "" : chat.title, runnable, j).show();
            }
        }
    }

    public static void $r8$lambda$pwJ1FUzJq2NiuD7f0cxhv3x6YtU(final StarsReactionsSheet starsReactionsSheet, long j, StarsController starsController, MessageObject messageObject, ChatActivity chatActivity) {
        Utilities.Callback2Return callback2Return = starsReactionsSheet.onSendListener;
        if (callback2Return != null) {
            int iIntValue = ((Integer) callback2Return.run(Long.valueOf(starsReactionsSheet.peer), Long.valueOf(j))).intValue();
            starsReactionsSheet.sentMessageId = iIntValue;
            if (iIntValue == Integer.MIN_VALUE) {
                starsReactionsSheet.dismiss();
                return;
            } else {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StarsReactionsSheet.$r8$lambda$wvc14jhHOpgOtgAPU6Po4H4W2iw(this.f$0);
                    }
                });
                return;
            }
        }
        final StarsController.PendingPaidReactions pendingPaidReactionsSendPaidReaction = starsController.sendPaidReaction(messageObject, chatActivity, j, false, true, Long.valueOf(starsReactionsSheet.peer));
        if (pendingPaidReactionsSendPaidReaction == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsReactionsSheet.m4286$r8$lambda$qxUdQr9lhn0cBEHJdlb252yws(this.f$0, pendingPaidReactionsSendPaidReaction);
            }
        });
    }

    public static void $r8$lambda$wvc14jhHOpgOtgAPU6Po4H4W2iw(StarsReactionsSheet starsReactionsSheet) {
        starsReactionsSheet.sending = true;
        starsReactionsSheet.animate3dIcon(null);
        AndroidUtilities.runOnUIThread(new StarsReactionsSheet$$ExternalSyntheticLambda14(starsReactionsSheet), 240L);
    }

    public static void m4286$r8$lambda$qxUdQr9lhn0cBEHJdlb252yws(StarsReactionsSheet starsReactionsSheet, final StarsController.PendingPaidReactions pendingPaidReactions) {
        starsReactionsSheet.sending = true;
        Objects.requireNonNull(pendingPaidReactions);
        starsReactionsSheet.animate3dIcon(new Runnable() {
            @Override
            public final void run() {
                pendingPaidReactions.apply();
            }
        });
        AndroidUtilities.runOnUIThread(new StarsReactionsSheet$$ExternalSyntheticLambda14(starsReactionsSheet), 240L);
    }

    public static void $r8$lambda$BY8YZpbloWjv5kM3QfWB8L6O3j8(final StarsReactionsSheet starsReactionsSheet, int i, Theme.ResourcesProvider resourcesProvider, long j, final boolean z, View view) {
        final long j2;
        starsReactionsSheet.getClass();
        ArrayList adminedChannels = BotStarsController.getInstance(i).getAdminedChannels();
        adminedChannels.add(0, UserConfig.getInstance(i).getCurrentUser());
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(starsReactionsSheet.containerView, resourcesProvider, starsReactionsSheet.dialogSelectorInnerLayout);
        int size = adminedChannels.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = adminedChannels.get(i2);
            i2++;
            TLObject tLObject = (TLObject) obj;
            if (tLObject instanceof TLRPC.User) {
                j2 = ((TLRPC.User) tLObject).id;
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    j2 = -chat.id;
                }
            }
            if (j2 != j) {
                long j3 = starsReactionsSheet.peer;
                itemOptionsMakeOptions.addChat(tLObject, j2 == j3 || (j3 == 0 && j2 == UserConfig.getInstance(i).getClientUserId()), new Runnable() {
                    @Override
                    public final void run() {
                        StarsReactionsSheet.$r8$lambda$vo4BvQobXRa0SahbGPcPCxse3kQ(this.f$0, j2, z);
                    }
                });
            }
        }
        itemOptionsMakeOptions.setDrawScrim(false).setOnTopOfScrim().setDimAlpha(0).setGravity(5).show();
    }

    public static void $r8$lambda$vo4BvQobXRa0SahbGPcPCxse3kQ(StarsReactionsSheet starsReactionsSheet, long j, boolean z) {
        starsReactionsSheet.lastSelectedPeer = j;
        starsReactionsSheet.peer = j;
        if (z) {
            LiveCommentsView.Message message = starsReactionsSheet.commentMessage;
            message.dialogId = j;
            starsReactionsSheet.commentView.set(message);
        }
        starsReactionsSheet.updatePeerDialog();
        starsReactionsSheet.checkBox.setChecked(true, true);
        TopSendersView topSendersView = starsReactionsSheet.topSendersView;
        if (topSendersView != null) {
            topSendersView.setMyPrivacy(starsReactionsSheet.peer);
        }
    }

    public StarsReactionsSheet setLiveCommentsView(LiveCommentsView liveCommentsView) {
        this.commentsView = liveCommentsView;
        return this;
    }

    public StarsReactionsSheet setOnSend(Utilities.Callback2Return callback2Return) {
        this.onSendListener = callback2Return;
        return this;
    }

    private void updatePeerDialog() {
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setScaleSize(0.42f);
        long j = this.peer;
        if (j == 2666000) {
            avatarDrawable.setAvatarType(21);
            int i = Theme.key_avatar_backgroundGray;
            avatarDrawable.setColor(Theme.getColor(i, this.resourcesProvider), Theme.getColor(i, this.resourcesProvider));
            this.dialogImageView.setForUserOrChat(null, avatarDrawable);
            return;
        }
        if (j >= 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.peer));
            avatarDrawable.setInfo(user);
            this.dialogImageView.setForUserOrChat(user, avatarDrawable);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.peer));
            avatarDrawable.setInfo(chat);
            this.dialogImageView.setForUserOrChat(chat, avatarDrawable);
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.adminedChannelsLoaded) {
            updateCanSwitchPeer(true);
        }
    }

    private boolean canSwitchPeer() {
        if (this.liveStories) {
            return false;
        }
        ArrayList adminedChannels = BotStarsController.getInstance(this.currentAccount).getAdminedChannels();
        int size = adminedChannels.size();
        int i = 0;
        while (i < size) {
            Object obj = adminedChannels.get(i);
            i++;
            if ((obj instanceof TLRPC.Chat) && ChatObject.isChannelAndNotMegaGroup((TLRPC.Chat) obj)) {
                return true;
            }
        }
        return false;
    }

    private void updateCanSwitchPeer(boolean z) {
        if ((this.dialogSelectorLayout.getVisibility() == 0) != canSwitchPeer()) {
            this.dialogSelectorLayout.setVisibility(canSwitchPeer() ? 0 : 8);
            if (z) {
                if (canSwitchPeer()) {
                    this.dialogSelectorLayout.setScaleX(0.4f);
                    this.dialogSelectorLayout.setScaleY(0.4f);
                    this.dialogSelectorLayout.setAlpha(0.0f);
                    this.dialogSelectorLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.toptopLayout, changeBounds);
            }
        }
    }

    public void updateSenders(long j) {
        long j2;
        if ((!this.liveStories || this.sendEnabled || j <= 0) && this.topSendersView != null) {
            ArrayList arrayList = new ArrayList();
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            long j3 = 0;
            if (this.reactors != null) {
                for (int i = 0; i < this.reactors.size(); i++) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) this.reactors.get(i);
                    long peerDialogId = DialogObject.getPeerDialogId(messageReactor.peer_id);
                    boolean z = messageReactor.anonymous;
                    if (!z) {
                        j2 = peerDialogId;
                    } else if (messageReactor.my) {
                        j2 = clientUserId;
                    } else {
                        peerDialogId = (-i) - 1;
                        j2 = peerDialogId;
                    }
                    if (messageReactor.my || j2 == clientUserId) {
                        j3 = messageReactor.count;
                    } else {
                        arrayList.add(SenderData.of(z, false, j2, messageReactor.count));
                    }
                }
            }
            long j4 = j3 + j;
            if (j4 > 0) {
                arrayList.add(SenderData.of(this.peer == 2666000, true, clientUserId, j4));
            }
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return StarsReactionsSheet.$r8$lambda$bCH_sQJJecgHsNrSQOp5eQYI_k8((StarsReactionsSheet.SenderData) obj, (StarsReactionsSheet.SenderData) obj2);
                }
            });
            this.topSendersView.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }

    public static int $r8$lambda$bCH_sQJJecgHsNrSQOp5eQYI_k8(SenderData senderData, SenderData senderData2) {
        return (int) (senderData2.stars - senderData.stars);
    }

    private void checkVisibility() {
        if (this.checkedVisiblity) {
            return;
        }
        this.checkedVisiblity = true;
        MessageObject messageObject = this.messageObject;
        if (messageObject == null) {
            return;
        }
        Long myPaidReactionPeer = messageObject.getMyPaidReactionPeer();
        if (myPaidReactionPeer == null || myPaidReactionPeer.longValue() != this.peer) {
            this.messageObject.setMyPaidReactionDialogId(this.peer);
            StarsController.MessageId messageIdFrom = StarsController.MessageId.from(this.messageObject);
            TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
            tL_messages_togglePaidReactionPrivacy.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageIdFrom.did);
            tL_messages_togglePaidReactionPrivacy.msg_id = messageIdFrom.mid;
            long j = this.peer;
            if (j == 0) {
                tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
            } else if (j == 2666000) {
                tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
            } else {
                TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                paidreactionprivacypeer.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.peer);
            }
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.starReactionAnonymousUpdate, Long.valueOf(messageIdFrom.did), Integer.valueOf(messageIdFrom.mid), Long.valueOf(this.peer));
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_togglePaidReactionPrivacy, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarsReactionsSheet.$r8$lambda$yQFdXn7yXj7uaClFhRtzC2Iv2q8(this.f$0, tLObject, tL_error);
                }
            });
        }
    }

    public static void $r8$lambda$yQFdXn7yXj7uaClFhRtzC2Iv2q8(StarsReactionsSheet starsReactionsSheet, TLObject tLObject, TLRPC.TL_error tL_error) {
        starsReactionsSheet.getClass();
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            MessagesStorage.getInstance(starsReactionsSheet.currentAccount).putMessages(new ArrayList<>(Arrays.asList(starsReactionsSheet.messageObject.messageOwner)), true, true, true, 0, 0, 0L);
        }
    }

    @Override
    public void dismiss() {
        if (!this.sending) {
            checkVisibility();
        }
        super.dismiss();
    }

    public void setMessageCell(ChatActivity chatActivity, int i, View view) {
        this.chatActivity = chatActivity;
        this.messageId = i;
        this.messageCell = view;
    }

    private void animate3dIcon(final Runnable runnable) {
        View view;
        final ReactionsLayoutInBubble reactionsLayoutInBubble;
        LiveCommentsView liveCommentsView;
        View view2;
        ReactionsLayoutInBubble reactionsLayoutInBubble2;
        ReactionsLayoutInBubble.ReactionButton reactionButton;
        ReactionsLayoutInBubble.ReactionButton reactionButton2 = null;
        MessageObject messageObject = null;
        if (this.messageObject == null || (view2 = this.chatActivity.fragmentView) == null || !view2.isAttachedToWindow()) {
            if (this.commentsView == null) {
                return;
            }
            view = null;
            reactionsLayoutInBubble = null;
        } else {
            View viewFindMessageCell = this.messageCell;
            if (viewFindMessageCell instanceof ChatMessageCell) {
                reactionsLayoutInBubble2 = ((ChatMessageCell) viewFindMessageCell).reactionsLayoutInBubble;
                reactionButton = reactionsLayoutInBubble2.getReactionButton(ReactionsLayoutInBubble.VisibleReaction.asStar());
            } else if (viewFindMessageCell instanceof ChatActionCell) {
                reactionsLayoutInBubble2 = ((ChatActionCell) viewFindMessageCell).reactionsLayoutInBubble;
                reactionButton = reactionsLayoutInBubble2.getReactionButton(ReactionsLayoutInBubble.VisibleReaction.asStar());
            } else {
                reactionsLayoutInBubble2 = null;
                reactionButton = null;
            }
            if (reactionButton != null || reactionsLayoutInBubble2 == null) {
                reactionButton2 = reactionButton;
            } else {
                MessageObject.GroupedMessages validGroupedMessage = this.chatActivity.getValidGroupedMessage(this.messageObject);
                if (validGroupedMessage != null && !validGroupedMessage.posArray.isEmpty()) {
                    ArrayList<MessageObject> arrayList = validGroupedMessage.messages;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        MessageObject messageObject2 = arrayList.get(i);
                        i++;
                        MessageObject messageObject3 = messageObject2;
                        MessageObject.GroupedMessagePosition position = validGroupedMessage.getPosition(messageObject3);
                        if (position != null) {
                            int i2 = position.flags;
                            if ((i2 & 1) != 0 && (i2 & 8) != 0) {
                                messageObject = messageObject3;
                                break;
                            }
                        }
                    }
                    if (messageObject != null) {
                        viewFindMessageCell = this.chatActivity.findMessageCell(messageObject.getId(), false);
                    }
                }
                if (viewFindMessageCell == null) {
                    return;
                }
                if (viewFindMessageCell instanceof ChatMessageCell) {
                    ReactionsLayoutInBubble reactionsLayoutInBubble3 = ((ChatMessageCell) viewFindMessageCell).reactionsLayoutInBubble;
                    reactionsLayoutInBubble2 = reactionsLayoutInBubble3;
                    reactionButton2 = reactionsLayoutInBubble3.getReactionButton(ReactionsLayoutInBubble.VisibleReaction.asStar());
                } else {
                    reactionButton2 = reactionButton;
                }
            }
            if (reactionButton2 == null) {
                return;
            }
            reactionsLayoutInBubble = reactionsLayoutInBubble2;
            view = viewFindMessageCell;
        }
        final int[] iArr = new int[2];
        final RectF rectF = new RectF();
        this.slider.getLocationInWindow(iArr);
        rectF.set(this.slider.counterImage.getBounds());
        rectF.inset(-AndroidUtilities.dp(3.5f), -AndroidUtilities.dp(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        this.icon3dView.whenReady(new Runnable() {
            @Override
            public final void run() {
                StarsReactionsSheet.$r8$lambda$xxOdjFAhx7AXo43xY9_uvlrfs9Y(this.f$0);
            }
        });
        if (reactionButton2 != null) {
            reactionButton2.drawImage = false;
        }
        if (view != null) {
            view.invalidate();
        }
        final LiveCommentsView.LiveCommentView[] liveCommentViewArr = new LiveCommentsView.LiveCommentView[1];
        if (this.liveStories && (liveCommentsView = this.commentsView) != null) {
            liveCommentViewArr[0] = liveCommentsView.findComment(this.sentMessageId);
        }
        final ReactionsLayoutInBubble.ReactionButton reactionButton3 = reactionButton2;
        final RectF rectF2 = new RectF();
        final View view3 = view;
        final Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                StarsReactionsSheet.$r8$lambda$uaoJSTCAW6GZzZkkJUlSdYdBGHo(this.f$0, liveCommentViewArr, iArr, rectF2, view3, reactionsLayoutInBubble, reactionButton3);
            }
        };
        runnable2.run();
        this.icon3dView.setPaused(false);
        this.icon3dView.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        this.icon3dView.setTranslationX(rectF3.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
        this.icon3dView.setTranslationY(rectF3.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
        this.icon3dView.setScaleX(rectF3.width() / AndroidUtilities.dp(150.0f));
        this.icon3dView.setScaleY(rectF3.height() / AndroidUtilities.dp(150.0f));
        ValueAnimator valueAnimator = this.iconAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.iconAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                StarsReactionsSheet.$r8$lambda$iOYfvQWE6ADsWUmYua3xV_JR0Bs(this.f$0, runnable2, rectF, rectF2, rectF3, zArr, runnable, valueAnimator2);
            }
        });
        this.iconAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                StarsReactionsSheet.this.icon3dView.setVisibility(4);
                StarsReactionsSheet.this.icon3dView.setPaused(true);
                ReactionsLayoutInBubble.ReactionButton reactionButton4 = reactionButton3;
                if (reactionButton4 != null) {
                    reactionButton4.drawImage = true;
                }
                View view4 = view3;
                if (view4 != null) {
                    view4.invalidate();
                }
                LiveCommentsView.LiveCommentView liveCommentView = liveCommentViewArr[0];
                if (liveCommentView != null) {
                    liveCommentView.setDrawStar(true);
                }
                StarsReactionsSheet.super.dismissInternal();
                boolean[] zArr2 = zArr;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    LaunchActivity.makeRipple(rectF2.centerX(), rectF2.centerY(), 1.5f);
                    try {
                        StarsReactionsSheet.this.container.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    Runnable runnable3 = runnable;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                }
                LaunchActivity launchActivity = LaunchActivity.instance;
                if (launchActivity == null || launchActivity.getFireworksOverlay() == null) {
                    return;
                }
                LaunchActivity.instance.getFireworksOverlay().start(true);
            }
        });
        this.iconAnimator.setDuration(800L);
        this.iconAnimator.setInterpolator(new Interpolator() {
            @Override
            public float getInterpolation(float f) {
                return (float) Math.pow(f, 2.0d);
            }
        });
        this.iconAnimator.start();
    }

    public static void $r8$lambda$xxOdjFAhx7AXo43xY9_uvlrfs9Y(StarsReactionsSheet starsReactionsSheet) {
        StarsSlider starsSlider = starsReactionsSheet.slider;
        starsSlider.drawCounterImage = false;
        starsSlider.invalidate();
    }

    public static void $r8$lambda$uaoJSTCAW6GZzZkkJUlSdYdBGHo(StarsReactionsSheet starsReactionsSheet, LiveCommentsView.LiveCommentView[] liveCommentViewArr, int[] iArr, RectF rectF, View view, ReactionsLayoutInBubble reactionsLayoutInBubble, ReactionsLayoutInBubble.ReactionButton reactionButton) {
        if (starsReactionsSheet.liveStories) {
            LiveCommentsView.LiveCommentView liveCommentViewFindComment = liveCommentViewArr[0];
            if (liveCommentViewFindComment == null) {
                liveCommentViewFindComment = starsReactionsSheet.commentsView.findComment(starsReactionsSheet.sentMessageId);
                liveCommentViewArr[0] = liveCommentViewFindComment;
            }
            if (liveCommentViewFindComment != null) {
                liveCommentViewFindComment.setDrawStar(false);
                liveCommentViewFindComment.getLocationInWindow(iArr);
                liveCommentViewFindComment.getStarLocation(rectF);
                rectF.offset(iArr[0], iArr[1]);
                return;
            }
            return;
        }
        view.getLocationInWindow(iArr);
        rectF.set(iArr[0] + reactionsLayoutInBubble.x + reactionButton.x + AndroidUtilities.dp(4.0f), iArr[1] + reactionsLayoutInBubble.y + reactionButton.y + ((reactionButton.height - AndroidUtilities.dp(22.0f)) / 2.0f), iArr[0] + reactionsLayoutInBubble.x + reactionButton.x + AndroidUtilities.dp(26.0f), iArr[1] + reactionsLayoutInBubble.y + reactionButton.y + ((reactionButton.height + AndroidUtilities.dp(22.0f)) / 2.0f));
    }

    public static void $r8$lambda$iOYfvQWE6ADsWUmYua3xV_JR0Bs(StarsReactionsSheet starsReactionsSheet, Runnable runnable, RectF rectF, RectF rectF2, RectF rectF3, boolean[] zArr, Runnable runnable2, ValueAnimator valueAnimator) {
        starsReactionsSheet.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        runnable.run();
        AndroidUtilities.lerp(rectF, rectF2, fFloatValue, rectF3);
        starsReactionsSheet.icon3dView.setTranslationX(rectF3.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
        starsReactionsSheet.icon3dView.setTranslationY(rectF3.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
        float fLerp = AndroidUtilities.lerp(Math.max(rectF3.width() / AndroidUtilities.dp(150.0f), rectF3.height() / AndroidUtilities.dp(150.0f)), 1.0f, (float) Math.sin(((double) fFloatValue) * 3.141592653589793d));
        starsReactionsSheet.icon3dView.setScaleX(fLerp);
        starsReactionsSheet.icon3dView.setScaleY(fLerp);
        GLIconRenderer gLIconRenderer = starsReactionsSheet.icon3dView.mRenderer;
        gLIconRenderer.angleX = 360.0f * fFloatValue;
        gLIconRenderer.white = Math.max(0.0f, 1.0f - (4.0f * fFloatValue));
        if (zArr[0] || fFloatValue <= 0.95f) {
            return;
        }
        zArr[0] = true;
        LaunchActivity.makeRipple(rectF2.centerX(), rectF2.centerY(), 1.5f);
        try {
            starsReactionsSheet.container.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    @Override
    public void dismissInternal() {
        ValueAnimator valueAnimator = this.iconAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.dismissInternal();
        }
    }

    @Override
    protected boolean canDismissWithSwipe() {
        if (this.slider.tracking) {
            return false;
        }
        return super.canDismissWithSwipe();
    }

    public static class StarsSlider extends View {
        public float aprogress;
        private final RectF arc;
        private final Drawable counterImage;
        private final AnimatedTextView.AnimatedTextDrawable counterSubText;
        private final AnimatedTextView.AnimatedTextDrawable counterText;
        private long currentTop;
        public boolean drawCounterImage;
        public boolean drawPlus;
        private LinearGradient gradient;
        private ValueAnimator gradientAnimator;
        private int gradientColor1;
        private int gradientColor2;
        private final Matrix gradientMatrix;
        private float lastX;
        private float lastY;
        private final AnimatedFloat overTop;
        private final AnimatedFloat overTopText;
        private final Paint plusPaint;
        private final Path plusPath;
        private int pointerId;
        private long pressTime;
        public float progress;
        private ValueAnimator progressAnimator;
        private final Theme.ResourcesProvider resourcesProvider;
        private final Paint sliderCirclePaint;
        private final RectF sliderCircleRect;
        private final Paint sliderInnerPaint;
        private final Path sliderInnerPath;
        private final RectF sliderInnerRect;
        private final Paint sliderPaint;
        private final Particles sliderParticles;
        private final Path sliderPath;
        private final RectF sliderRect;
        private final ColoredImageSpan[] starRef;
        public int steps;
        public int[] stops;
        private final BoolAnimator subTextVisible;
        private final Paint textBackgroundPaint;
        private final Particles textParticles;
        private final Path textPath;
        private final RectF textRect;
        private int toGradientColor1;
        private int toGradientColor2;
        private final Paint topPaint;
        private final Text topText;
        private boolean tracking;

        protected boolean onTapCustom(float f, float f2) {
            return false;
        }

        protected void onValueChanged(int i) {
        }

        public StarsSlider(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.sliderInnerPaint = new Paint(1);
            this.sliderPaint = new Paint(1);
            this.plusPaint = new Paint(1);
            this.sliderCirclePaint = new Paint(1);
            this.textBackgroundPaint = new Paint(1);
            this.sliderParticles = new Particles(0, 300);
            this.textParticles = new Particles(2, 30);
            this.gradientColor1 = -1135603;
            this.gradientColor2 = -404714;
            this.toGradientColor1 = -1135603;
            this.toGradientColor2 = -404714;
            this.gradient = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.gradientColor1, this.gradientColor2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.gradientMatrix = new Matrix();
            this.drawCounterImage = true;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
            this.counterText = animatedTextDrawable;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
            this.counterSubText = animatedTextDrawable2;
            this.starRef = new ColoredImageSpan[1];
            Paint paint = new Paint(1);
            this.topPaint = paint;
            this.topText = new Text(LocaleController.getString(R.string.StarsReactionTop), 14.0f, AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.overTop = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
            this.overTopText = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
            this.currentTop = -1L;
            this.sliderInnerRect = new RectF();
            this.sliderRect = new RectF();
            this.sliderCircleRect = new RectF();
            this.arc = new RectF();
            this.sliderInnerPath = new Path();
            this.sliderPath = new Path();
            this.plusPath = new Path();
            this.textRect = new RectF();
            this.textPath = new Path();
            this.progress = 0.0f;
            this.subTextVisible = new BoolAnimator(this, cubicBezierInterpolator, 320L);
            this.resourcesProvider = resourcesProvider;
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
            this.counterImage = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            animatedTextDrawable.setTextColor(-1);
            animatedTextDrawable.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(21.0f));
            animatedTextDrawable.setCallback(this);
            animatedTextDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
            animatedTextDrawable.setGravity(17);
            animatedTextDrawable2.setTextColor(-570425345);
            animatedTextDrawable2.setTextSize(AndroidUtilities.dp(11.0f));
            animatedTextDrawable2.setCallback(this);
            animatedTextDrawable2.setOverrideFullWidth(AndroidUtilities.displaySize.x);
            animatedTextDrawable2.setGravity(17);
            paint.setColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        }

        public void setStarsTop(long j) {
            this.currentTop = j;
            invalidate();
        }

        public void setTopText(String str) {
            this.topText.setText(str);
        }

        @Override
        protected boolean verifyDrawable(Drawable drawable) {
            return drawable == this.counterText || super.verifyDrawable(drawable);
        }

        public void setSteps(int i, int... iArr) {
            this.steps = i;
            this.stops = iArr;
        }

        public void setValue(int i) {
            setValue(i, false);
        }

        public void setValue(int i, boolean z) {
            float progress = getProgress(i);
            this.progress = progress;
            if (!z) {
                this.aprogress = progress;
            }
            updateText(true);
        }

        public int getValue() {
            return getValue(this.progress);
        }

        public float getProgress() {
            return this.progress;
        }

        public int getValue(float f) {
            if (f <= 0.0f) {
                return this.stops[0];
            }
            if (f >= 1.0f) {
                int[] iArr = this.stops;
                return iArr[iArr.length - 1];
            }
            int[] iArr2 = this.stops;
            float length = f * (iArr2.length - 1);
            int i = (int) length;
            float f2 = length - i;
            int i2 = iArr2[i];
            float f3 = i2;
            int i3 = i + 1;
            if (i3 < iArr2.length) {
                i = i3;
            }
            return Math.round(f3 + (f2 * (iArr2[i] - i2)));
        }

        public float getProgress(int i) {
            int i2 = 1;
            while (true) {
                int[] iArr = this.stops;
                if (i2 >= iArr.length) {
                    return 1.0f;
                }
                int i3 = iArr[i2];
                if (i <= i3) {
                    int i4 = i2 - 1;
                    int i5 = iArr[i4];
                    return (i4 + ((i - i5) / (i3 - i5))) / (iArr.length - 1);
                }
                i2++;
            }
        }

        public void setColor(final int i, final int i2, boolean z) {
            if (this.toGradientColor1 == i && this.toGradientColor2 == i2) {
                return;
            }
            ValueAnimator valueAnimator = this.gradientAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.gradientAnimator = null;
            }
            if (z) {
                final int i3 = this.gradientColor1;
                final int i4 = this.gradientColor2;
                this.toGradientColor1 = i;
                this.toGradientColor2 = i2;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.gradientAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        StarsReactionsSheet.StarsSlider.m4288$r8$lambda$NaicAq1wm4lKbu2n96zuvbxGAA(this.f$0, i3, i, i4, i2, valueAnimator2);
                    }
                });
                this.gradientAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        StarsSlider.this.gradientColor1 = ColorUtils.blendARGB(i3, i, 1.0f);
                        StarsSlider.this.gradientColor2 = ColorUtils.blendARGB(i4, i2, 1.0f);
                        StarsSlider.this.gradient = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{StarsSlider.this.gradientColor1, StarsSlider.this.gradientColor2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        StarsSlider.this.invalidate();
                    }
                });
                this.gradientAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.gradientAnimator.setDuration(420L);
                this.gradientAnimator.start();
                return;
            }
            this.toGradientColor1 = i;
            this.gradientColor1 = i;
            this.toGradientColor2 = i2;
            this.gradientColor2 = i2;
            this.gradient = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.gradientColor1, this.gradientColor2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            invalidate();
        }

        public static void m4288$r8$lambda$NaicAq1wm4lKbu2n96zuvbxGAA(StarsSlider starsSlider, int i, int i2, int i3, int i4, ValueAnimator valueAnimator) {
            starsSlider.getClass();
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            starsSlider.gradientColor1 = ColorUtils.blendARGB(i, i2, fFloatValue);
            starsSlider.gradientColor2 = ColorUtils.blendARGB(i3, i4, fFloatValue);
            starsSlider.gradient = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{starsSlider.gradientColor1, starsSlider.gradientColor2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            starsSlider.invalidate();
        }

        public void updateText(boolean z) {
            this.counterText.cancelAnimation();
            this.counterText.setText(StarsIntroActivity.replaceStars(LocaleController.formatNumber(getValue(), ','), this.starRef), z);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(220.0f));
            int measuredWidth = getMeasuredWidth();
            getMeasuredHeight();
            int iDp = AndroidUtilities.dp(14.0f);
            int iDp2 = AndroidUtilities.dp(135.0f);
            this.sliderInnerRect.set(iDp, iDp2, measuredWidth - iDp, iDp2 + AndroidUtilities.dp(24.0f));
            this.sliderPaint.setColor(-1069811);
            this.sliderCirclePaint.setColor(-1);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            int i;
            float f;
            float f2;
            float f3;
            float f4;
            Canvas canvas2 = canvas;
            super.dispatchDraw(canvas);
            this.gradientMatrix.reset();
            this.gradientMatrix.postTranslate(this.sliderInnerRect.left, 0.0f);
            this.gradientMatrix.postScale(this.sliderInnerRect.width() / 255.0f, 1.0f);
            this.gradient.setLocalMatrix(this.gradientMatrix);
            this.sliderPaint.setShader(this.gradient);
            int iBlendARGB = ColorUtils.blendARGB(this.gradientColor1, this.gradientColor2, this.progress);
            this.sliderInnerPath.rewind();
            Path path = this.sliderInnerPath;
            RectF rectF = this.sliderInnerRect;
            float fDp = AndroidUtilities.dp(12.0f);
            float fDp2 = AndroidUtilities.dp(12.0f);
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, fDp, fDp2, direction);
            this.sliderInnerPaint.setColor(Theme.multAlpha(this.gradientColor1, 0.15f));
            canvas2.drawPath(this.sliderInnerPath, this.sliderInnerPaint);
            this.sliderRect.set(this.sliderInnerRect);
            float progress = getProgress(getValue());
            RectF rectF2 = this.sliderRect;
            rectF2.right = AndroidUtilities.lerp(rectF2.left + AndroidUtilities.dp(24.0f), this.sliderRect.right, progress);
            this.sliderPath.rewind();
            this.sliderPath.addRoundRect(this.sliderRect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), direction);
            this.sliderParticles.setBounds(this.sliderInnerRect);
            this.sliderParticles.setSpeed((this.progress * 15.0f) + 1.0f);
            this.sliderParticles.setVisible((this.progress * 0.85f) + 0.15f);
            this.sliderParticles.process();
            canvas2.save();
            canvas2.clipPath(this.sliderInnerPath);
            this.sliderParticles.draw(canvas2, iBlendARGB);
            long j = this.currentTop;
            if (j == -1 || getProgress((int) j) >= 1.0f || getProgress((int) this.currentTop) <= 0.0f) {
                i = iBlendARGB;
                f = 255.0f;
                f2 = 12.0f;
            } else {
                float fDp3 = this.sliderInnerRect.left + AndroidUtilities.dp(12.0f) + ((this.sliderInnerRect.width() - AndroidUtilities.dp(24.0f)) * Utilities.clamp01(getProgress((int) this.currentTop)));
                float f5 = this.overTop.set(Math.abs((this.sliderRect.right - ((float) AndroidUtilities.dp(10.0f))) - fDp3) < ((float) AndroidUtilities.dp(14.0f)));
                f = 255.0f;
                f2 = 12.0f;
                float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), this.overTopText.set(Math.abs((this.sliderRect.right - ((float) AndroidUtilities.dp(10.0f))) - fDp3) < ((float) AndroidUtilities.dp(12.0f))));
                float currentWidth = (this.topText.getCurrentWidth() + fDp3) + ((float) (AndroidUtilities.dp(16.0f) * 2)) > this.sliderInnerRect.right ? (fDp3 - fLerp) - this.topText.getCurrentWidth() : fLerp + fDp3;
                this.topPaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                this.topPaint.setColor(Theme.multAlpha(iBlendARGB, 0.6f));
                RectF rectF3 = this.sliderInnerRect;
                float fLerp2 = AndroidUtilities.lerp(rectF3.top, rectF3.centerY(), f5);
                RectF rectF4 = this.sliderInnerRect;
                canvas2.drawLine(fDp3, fLerp2, fDp3, AndroidUtilities.lerp(rectF4.bottom, rectF4.centerY(), f5), this.topPaint);
                this.topText.draw(canvas, currentWidth, this.sliderInnerRect.centerY(), iBlendARGB, 0.6f);
                canvas2 = canvas;
                i = iBlendARGB;
            }
            canvas2.drawPath(this.sliderPath, this.sliderPaint);
            canvas2.clipPath(this.sliderPath);
            this.sliderParticles.draw(canvas2, -1);
            long j2 = this.currentTop;
            if (j2 != -1 && getProgress((int) j2) < 1.0f && getProgress((int) this.currentTop) > 0.0f) {
                float fDp4 = this.sliderInnerRect.left + AndroidUtilities.dp(f2) + ((this.sliderInnerRect.width() - AndroidUtilities.dp(24.0f)) * Utilities.clamp01(getProgress((int) this.currentTop)));
                float f6 = this.overTop.set(Math.abs((this.sliderRect.right - ((float) AndroidUtilities.dp(10.0f))) - fDp4) < ((float) AndroidUtilities.dp(14.0f)));
                float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), this.overTopText.set(Math.abs((this.sliderRect.right - ((float) AndroidUtilities.dp(10.0f))) - fDp4) < ((float) AndroidUtilities.dp(f2))));
                float currentWidth2 = (this.topText.getCurrentWidth() + fDp4) + ((float) (AndroidUtilities.dp(16.0f) * 2)) > this.sliderInnerRect.right ? (fDp4 - fLerp3) - this.topText.getCurrentWidth() : fLerp3 + fDp4;
                this.topPaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                this.topPaint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider), 0.4f));
                RectF rectF5 = this.sliderInnerRect;
                float fLerp4 = AndroidUtilities.lerp(rectF5.top, rectF5.centerY(), f6);
                RectF rectF6 = this.sliderInnerRect;
                canvas2.drawLine(fDp4, fLerp4, fDp4, AndroidUtilities.lerp(rectF6.bottom, rectF6.centerY(), f6), this.topPaint);
                this.topText.draw(canvas, currentWidth2, this.sliderInnerRect.centerY(), -1, 0.75f);
                canvas2 = canvas;
            }
            canvas2.restore();
            invalidate();
            if (this.drawPlus) {
                RectF rectF7 = this.sliderInnerRect;
                float fHeight = rectF7.right - (rectF7.height() / 2.0f);
                float fCenterY = this.sliderInnerRect.centerY();
                this.plusPaint.setColor(ColorUtils.blendARGB(this.sliderInnerPaint.getColor(), this.gradientColor2, 0.5f));
                this.plusPath.rewind();
                f3 = 0.5f;
                f4 = 2.0f;
                this.plusPath.addRoundRect(fHeight - AndroidUtilities.dp(1.0f), fCenterY - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + fHeight, fCenterY + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), direction);
                this.plusPath.addRoundRect(fHeight - AndroidUtilities.dp(6.0f), fCenterY - AndroidUtilities.dp(1.0f), fHeight + AndroidUtilities.dp(6.0f), fCenterY + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), direction);
                canvas2.drawPath(this.plusPath, this.plusPaint);
            } else {
                f3 = 0.5f;
                f4 = 2.0f;
            }
            this.sliderCircleRect.set((this.sliderRect.right - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f), this.sliderRect.centerY() - (AndroidUtilities.dp(16.0f) / f4), this.sliderRect.right - AndroidUtilities.dp(4.0f), this.sliderRect.centerY() + (AndroidUtilities.dp(16.0f) / f4));
            canvas2.drawRoundRect(this.sliderCircleRect, AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), this.sliderCirclePaint);
            float fDp5 = AndroidUtilities.dp(9.0f) / this.sliderInnerRect.width();
            RectF rectF8 = this.sliderCircleRect;
            float fLerp5 = AndroidUtilities.lerp(AndroidUtilities.lerp(rectF8.left, rectF8.right, progress), AndroidUtilities.lerp(this.sliderCircleRect.left + AndroidUtilities.dp(9.0f), this.sliderCircleRect.right - AndroidUtilities.dp(9.0f), progress), Math.min(Utilities.clamp01(progress / fDp5), Utilities.clamp01((1.0f - progress) / fDp5)));
            float fMax = Math.max(this.counterSubText.getCurrentWidth() + AndroidUtilities.dp(20.0f), this.counterText.getCurrentWidth() + AndroidUtilities.dp(50.0f));
            float fDp6 = AndroidUtilities.dp(44.0f);
            float fClamp = Utilities.clamp(fLerp5 - (fMax / f4), (this.sliderInnerRect.right - fMax) - AndroidUtilities.dp(4.0f), this.sliderInnerRect.left + AndroidUtilities.dp(4.0f));
            this.textRect.set(fClamp, (this.sliderInnerRect.top - AndroidUtilities.dp(21.0f)) - fDp6, fMax + fClamp, this.sliderInnerRect.top - AndroidUtilities.dp(21.0f));
            float fHeight2 = this.textRect.height();
            float f7 = fHeight2 / f4;
            RectF rectF9 = this.textRect;
            float fClamp2 = Utilities.clamp(fLerp5, rectF9.right, rectF9.left);
            float fDp7 = fClamp2 - AndroidUtilities.dp(9.0f);
            RectF rectF10 = this.textRect;
            float fClamp3 = Utilities.clamp(fDp7, rectF10.right, rectF10.left);
            float fDp8 = AndroidUtilities.dp(9.0f) + fClamp2;
            RectF rectF11 = this.textRect;
            float fClamp4 = Utilities.clamp(fDp8, rectF11.right, rectF11.left);
            float fClamp5 = Utilities.clamp(this.progress - this.aprogress, 1.0f, -1.0f) * 60.0f;
            float fDp9 = this.textRect.bottom + AndroidUtilities.dp(8.0f);
            this.textPath.rewind();
            RectF rectF12 = this.arc;
            RectF rectF13 = this.textRect;
            float f8 = rectF13.left;
            float f9 = rectF13.top;
            rectF12.set(f8, f9, f8 + fHeight2, f9 + fHeight2);
            this.textPath.arcTo(this.arc, -180.0f, 90.0f);
            RectF rectF14 = this.arc;
            RectF rectF15 = this.textRect;
            float f10 = rectF15.right;
            float f11 = rectF15.top;
            rectF14.set(f10 - fHeight2, f11, f10, f11 + fHeight2);
            this.textPath.arcTo(this.arc, -90.0f, 90.0f);
            RectF rectF16 = this.arc;
            RectF rectF17 = this.textRect;
            float f12 = rectF17.right;
            float f13 = rectF17.bottom;
            rectF16.set(f12 - fHeight2, f13 - fHeight2, f12, f13);
            this.textPath.arcTo(this.arc, 0.0f, (float) Utilities.clamp(((Math.acos(Utilities.clamp01((fClamp4 - this.arc.centerX()) / f7)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d));
            RectF rectF18 = this.textRect;
            float f14 = 0.7f * fHeight2;
            if (fClamp3 < rectF18.right - f14) {
                this.textPath.lineTo(fClamp4, rectF18.bottom);
                this.textPath.lineTo(fClamp2 + f4, this.textRect.bottom + AndroidUtilities.dp(8.0f));
            }
            this.textPath.lineTo(fClamp2, this.textRect.bottom + AndroidUtilities.dp(8.0f) + 1.0f);
            RectF rectF19 = this.textRect;
            if (fClamp4 > rectF19.left + f14) {
                this.textPath.lineTo(fClamp2 - f4, rectF19.bottom + AndroidUtilities.dp(8.0f));
                this.textPath.lineTo(fClamp3, this.textRect.bottom);
            }
            RectF rectF20 = this.arc;
            RectF rectF21 = this.textRect;
            float f15 = rectF21.left;
            float f16 = rectF21.bottom;
            rectF20.set(f15, f16 - fHeight2, fHeight2 + f15, f16);
            float fClamp6 = ((float) Utilities.clamp(((Math.acos(Utilities.clamp01((fClamp3 - this.arc.left) / f7)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d)) + 90.0f;
            this.textPath.arcTo(this.arc, fClamp6, 180.0f - fClamp6);
            Path path2 = this.textPath;
            RectF rectF22 = this.textRect;
            path2.lineTo(rectF22.left, rectF22.bottom);
            this.textPath.close();
            RectF rectF23 = AndroidUtilities.rectTmp;
            rectF23.set(this.textRect);
            rectF23.inset(-AndroidUtilities.dp(f2), -AndroidUtilities.dp(f2));
            this.textParticles.setBounds(rectF23);
            this.textParticles.setSpeed((this.progress * 15.0f) + 1.0f);
            this.textParticles.process();
            canvas2.save();
            this.textParticles.draw(canvas2, i);
            canvas2.restore();
            canvas2.save();
            canvas2.rotate(fClamp5, fClamp2, fDp9);
            if (Math.abs(this.progress - this.aprogress) > 0.001f) {
                this.aprogress = AndroidUtilities.lerp(this.aprogress, this.progress, 0.1f);
                invalidate();
            }
            this.textBackgroundPaint.setShader(this.gradient);
            canvas2.drawPath(this.textPath, this.textBackgroundPaint);
            canvas2.save();
            canvas2.clipPath(this.textPath);
            canvas2.rotate(-fClamp5, fClamp2, fDp9);
            this.textParticles.draw(canvas2, -1);
            canvas2.restore();
            canvas2.save();
            float floatValue = 1.0f - (this.subTextVisible.getFloatValue() * 0.15f);
            float fCenterX = this.textRect.centerX();
            RectF rectF24 = this.textRect;
            canvas2.scale(floatValue, floatValue, fCenterX, rectF24.top - (rectF24.height() * f3));
            this.counterImage.setBounds((int) ((this.textRect.centerX() - (this.counterText.getCurrentWidth() / f4)) + AndroidUtilities.dp(-12.0f)), (int) (this.textRect.centerY() - AndroidUtilities.dp(10.0f)), (int) ((this.textRect.centerX() - (this.counterText.getCurrentWidth() / f4)) + AndroidUtilities.dp(8.0f)), (int) (this.textRect.centerY() + AndroidUtilities.dp(10.0f)));
            if (this.drawCounterImage) {
                this.counterImage.draw(canvas2);
            }
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.counterText;
            float fDp10 = this.textRect.left + AndroidUtilities.dp(24.0f);
            RectF rectF25 = this.textRect;
            animatedTextDrawable.setBounds(fDp10, rectF25.top, rectF25.right, rectF25.bottom);
            this.counterText.draw(canvas2);
            canvas2.restore();
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.counterSubText;
            RectF rectF26 = this.textRect;
            float f17 = rectF26.left;
            float fDp11 = rectF26.top + AndroidUtilities.dp(10.0f);
            RectF rectF27 = this.textRect;
            animatedTextDrawable2.setBounds(f17, fDp11, rectF27.right, rectF27.bottom + AndroidUtilities.dp(10.0f));
            this.counterSubText.setAlpha((int) (this.subTextVisible.getFloatValue() * f));
            this.counterSubText.draw(canvas2);
            canvas2.restore();
        }

        public void setCounterSubText(String str, boolean z) {
            this.subTextVisible.setValue(!TextUtils.isEmpty(str), z);
            this.counterSubText.cancelAnimation();
            this.counterSubText.setText(str, z);
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.lastX = motionEvent.getX();
                this.lastY = motionEvent.getY();
                this.pointerId = motionEvent.getPointerId(0);
                this.pressTime = System.currentTimeMillis();
                this.tracking = false;
            } else if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.pointerId) {
                float x = motionEvent.getX() - this.lastX;
                float y = motionEvent.getY() - this.lastY;
                if (!this.tracking && Math.abs(x) > Math.abs(y * 1.5f) && Math.abs(x) > AndroidUtilities.touchSlop) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.tracking = true;
                    ValueAnimator valueAnimator = this.progressAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                }
                if (this.tracking) {
                    int value = getValue();
                    this.progress = Utilities.clamp01(this.progress + (x / (getWidth() * 1.0f)));
                    if (getValue() != value) {
                        onValueChanged(getValue());
                        updateText(true);
                    }
                    this.lastX = motionEvent.getX();
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (!this.tracking && motionEvent.getPointerId(0) == this.pointerId && MathUtils.distance(this.lastX, this.lastY, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.touchSlop && System.currentTimeMillis() - this.pressTime <= ViewConfiguration.getTapTimeout() * 1.5f && !onTapCustom(motionEvent.getX(), motionEvent.getY())) {
                    float x2 = motionEvent.getX();
                    RectF rectF = this.sliderInnerRect;
                    float fClamp01 = Utilities.clamp01((x2 - rectF.left) / rectF.width());
                    long j = this.currentTop;
                    if (j > 0 && Math.abs(getProgress((int) j) - fClamp01) < 0.035f) {
                        fClamp01 = Utilities.clamp01(getProgress((int) this.currentTop));
                    }
                    animateProgressTo(fClamp01);
                }
                this.tracking = false;
            }
            return true;
        }

        public void setValueAnimated(int i) {
            if (i == getValue()) {
                return;
            }
            animateProgressTo(getProgress(i));
        }

        private void animateProgressTo(final float f) {
            ValueAnimator valueAnimator = this.progressAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.progress, f);
            this.progressAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    StarsReactionsSheet.StarsSlider.$r8$lambda$jQpoCFrs6xh_nRnOGpfClrYkpj8(this.f$0, valueAnimator2);
                }
            });
            final int value = getValue();
            this.progressAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    StarsSlider starsSlider = StarsSlider.this;
                    starsSlider.progress = f;
                    if (starsSlider.getValue() != value) {
                        StarsSlider starsSlider2 = StarsSlider.this;
                        starsSlider2.onValueChanged(starsSlider2.getValue());
                    }
                    StarsSlider.this.invalidate();
                }
            });
            this.progressAnimator.setDuration(320L);
            this.progressAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.progressAnimator.start();
            if (getValue(f) != value) {
                onValueChanged(getValue(f));
            }
            this.counterText.cancelAnimation();
            this.counterText.setText(StarsIntroActivity.replaceStars(LocaleController.formatNumber(getValue(f), ','), this.starRef), true);
        }

        public static void $r8$lambda$jQpoCFrs6xh_nRnOGpfClrYkpj8(StarsSlider starsSlider, ValueAnimator valueAnimator) {
            starsSlider.getClass();
            starsSlider.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            starsSlider.invalidate();
        }
    }

    public static class Particles {
        public final Bitmap b;
        private int bPaintColor;
        private BatchParticlesDrawHelper.BatchParticlesBuffer batchParticlesBuffer;
        private final Paint batchParticlesPaint;
        private long lastInvalidateTime;
        private long lastTime;
        public final ArrayList particles;
        public final int type;
        private int visibleCount;
        public final RectF bounds = new RectF();
        public final Paint bPaint = new Paint(3);
        public final Rect rect = new Rect();
        private float speed = 1.0f;
        private float lifetime = 1.0f;
        private boolean firstDraw = true;

        public Particles(int i, int i2) {
            this.type = i;
            this.visibleCount = i2;
            this.particles = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                this.particles.add(new Particle());
            }
            int iDp = AndroidUtilities.dp(10.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
            this.b = bitmapCreateBitmap;
            Path path = new Path();
            float f = iDp >> 1;
            int i4 = (int) (0.85f * f);
            path.moveTo(0.0f, f);
            float f2 = i4;
            path.lineTo(f2, f2);
            path.lineTo(f, 0.0f);
            float f3 = iDp - i4;
            path.lineTo(f3, f2);
            float f4 = iDp;
            path.lineTo(f4, f);
            path.lineTo(f3, f3);
            path.lineTo(f, f4);
            path.lineTo(f2, f3);
            path.lineTo(0.0f, f);
            path.close();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setColor(Theme.multAlpha(-1, 0.75f));
            canvas.drawPath(path, paint);
            if (BatchParticlesDrawHelper.isAvailable()) {
                BatchParticlesDrawHelper.BatchParticlesBuffer batchParticlesBuffer = new BatchParticlesDrawHelper.BatchParticlesBuffer(i2);
                this.batchParticlesBuffer = batchParticlesBuffer;
                batchParticlesBuffer.fillParticleTextureCords(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                this.batchParticlesPaint = BatchParticlesDrawHelper.createBatchParticlesPaint(bitmapCreateBitmap);
                return;
            }
            this.batchParticlesBuffer = null;
            this.batchParticlesPaint = null;
        }

        public void setVisible(float f) {
            this.visibleCount = (int) (this.particles.size() * f);
        }

        public void setBounds(RectF rectF) {
            this.bounds.set(rectF);
            removeParticlesOutside();
        }

        public void setBounds(Rect rect) {
            this.bounds.set(rect);
            removeParticlesOutside();
        }

        public void setBounds(int i, int i2, int i3, int i4) {
            this.bounds.set(i, i2, i3, i4);
            removeParticlesOutside();
        }

        public void removeParticlesOutside() {
            if (this.type == 2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (int i = 0; i < this.particles.size(); i++) {
                    Particle particle = (Particle) this.particles.get(i);
                    if (!this.bounds.contains((int) particle.x, (int) particle.y)) {
                        gen(particle, jCurrentTimeMillis, this.firstDraw);
                    }
                }
            }
        }

        public void setSpeed(float f) {
            this.speed = f;
        }

        public boolean process() {
            if (!LiteMode.isEnabled(131072)) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            float fMin = (Math.min(this.lastTime - jCurrentTimeMillis, 16L) / 1000.0f) * this.speed;
            for (int i = 0; i < Math.min(this.visibleCount, this.particles.size()); i++) {
                Particle particle = (Particle) this.particles.get(i);
                long j = particle.lifetime;
                float f = j <= 0 ? 2.0f : (jCurrentTimeMillis - particle.start) / j;
                if (f > 1.0f) {
                    gen(particle, jCurrentTimeMillis, this.firstDraw);
                    f = 0.0f;
                }
                particle.x += particle.vx * fMin;
                particle.y += particle.vy * fMin;
                float f2 = 4.0f * f;
                particle.la = f2 - (f * f2);
            }
            this.lastTime = jCurrentTimeMillis;
            long j2 = this.lastInvalidateTime;
            if (j2 != 0 && j2 - jCurrentTimeMillis < 66) {
                return false;
            }
            this.lastInvalidateTime = jCurrentTimeMillis;
            return true;
        }

        public void generateGrid() {
            ArrayList arrayListPoissonDiskSampling = poissonDiskSampling(AndroidUtilities.dp(30.0f), (int) this.bounds.width(), (int) this.bounds.height(), 15);
            int size = arrayListPoissonDiskSampling.size() - this.particles.size();
            for (int i = 0; i < size; i++) {
                this.particles.add(new Particle());
            }
            int size2 = arrayListPoissonDiskSampling.size();
            this.visibleCount = size2;
            if (this.batchParticlesBuffer != null) {
                BatchParticlesDrawHelper.BatchParticlesBuffer batchParticlesBuffer = new BatchParticlesDrawHelper.BatchParticlesBuffer(size2);
                this.batchParticlesBuffer = batchParticlesBuffer;
                batchParticlesBuffer.fillParticleTextureCords(0.0f, 0.0f, this.b.getWidth(), this.b.getHeight());
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (int i2 = 0; i2 < this.visibleCount; i2++) {
                Particle particle = (Particle) this.particles.get(i2);
                PointF pointF = (PointF) arrayListPoissonDiskSampling.get(i2);
                gen(particle, jCurrentTimeMillis, true);
                float f = pointF.x;
                RectF rectF = this.bounds;
                particle.x = f + rectF.left;
                particle.y = pointF.y + rectF.top;
                particle.la = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
                particle.s *= 1.25f;
            }
        }

        static boolean isValidPoint(PointF[][] pointFArr, int i, int i2, float f, int i3, int i4, PointF pointF, float f2) {
            int iDp = AndroidUtilities.dp(15.0f) / 2;
            float f3 = pointF.x;
            float f4 = iDp;
            if (f3 >= f4 && f3 < i - iDp) {
                float f5 = pointF.y;
                if (f5 >= f4 && f5 < i2 - iDp) {
                    int iFloor = (int) Math.floor(f3 / f);
                    int iFloor2 = (int) Math.floor(pointF.y / f);
                    int iMin = Math.min(iFloor + 1, i3 - 1);
                    int iMax = Math.max(iFloor2 - 1, 0);
                    int iMin2 = Math.min(iFloor2 + 1, i4 - 1);
                    for (int iMax2 = Math.max(iFloor - 1, 0); iMax2 <= iMin; iMax2++) {
                        for (int i5 = iMax; i5 <= iMin2; i5++) {
                            PointF pointF2 = pointFArr[iMax2][i5];
                            if (pointF2 != null && MathUtils.distance(pointF2.x, pointF2.y, pointF.x, pointF.y) < f2) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        static void insertPoint(PointF[][] pointFArr, float f, PointF pointF) {
            pointFArr[(int) Math.floor(pointF.x / f)][(int) Math.floor(pointF.y / f)] = pointF;
        }

        private static ArrayList poissonDiskSampling(float f, int i, int i2, int i3) {
            f = f;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            PointF pointF = new PointF(AndroidUtilities.lerp(0, i, Utilities.fastRandom.nextFloat()), AndroidUtilities.lerp(0, i2, Utilities.fastRandom.nextFloat()));
            float fFloor = (float) Math.floor(((double) f) / Math.sqrt(2));
            int i5 = 1;
            int iCeil = ((int) Math.ceil(i / fFloor)) + 1;
            int iCeil2 = ((int) Math.ceil(i2 / fFloor)) + 1;
            PointF[][] pointFArr = (PointF[][]) Array.newInstance((Class<?>) PointF.class, iCeil, iCeil2);
            for (int i6 = 0; i6 < iCeil; i6++) {
                for (int i7 = 0; i7 < iCeil2; i7++) {
                    pointFArr[i6][i7] = null;
                }
            }
            insertPoint(pointFArr, fFloor, pointF);
            arrayList.add(pointF);
            arrayList2.add(pointF);
            while (!arrayList2.isEmpty()) {
                int iNextInt = arrayList2.size() > i5 ? Utilities.fastRandom.nextInt(arrayList2.size() - i5) : 0;
                PointF pointF2 = (PointF) arrayList2.get(iNextInt);
                int i8 = 0;
                while (true) {
                    if (i8 < i3) {
                        float fLerp = AndroidUtilities.lerp(i4, 360, Utilities.fastRandom.nextFloat());
                        int i9 = i8;
                        double dLerp = AndroidUtilities.lerp(1, 2, Utilities.fastRandom.nextFloat()) * f;
                        double d = fLerp;
                        PointF[][] pointFArr2 = pointFArr;
                        PointF pointF3 = new PointF((float) (((double) pointF2.x) + (Math.cos(Math.toRadians(d)) * dLerp)), (float) (((double) pointF2.y) + (Math.sin(Math.toRadians(d)) * dLerp)));
                        if (isValidPoint(pointFArr2, i, i2, fFloor, iCeil, iCeil2, pointF3, f)) {
                            arrayList.add(pointF3);
                            insertPoint(pointFArr2, fFloor, pointF3);
                            arrayList2.add(pointF3);
                            pointFArr = pointFArr2;
                            break;
                        }
                        f = f;
                        pointFArr = pointFArr2;
                        i8 = i9 + 1;
                        i4 = 0;
                    } else {
                        arrayList2.remove(iNextInt);
                        break;
                    }
                }
                i4 = 0;
                i5 = 1;
            }
            return arrayList;
        }

        public void draw(Canvas canvas, int i) {
            draw(canvas, i, 1.0f);
        }

        public void draw(Canvas canvas, int i, float f) {
            if (LiteMode.isEnabled(131072)) {
                int iMin = Math.min(this.visibleCount, this.particles.size());
                if (this.batchParticlesBuffer != null) {
                    float width = this.b.getWidth();
                    float height = this.b.getHeight();
                    for (int i2 = 0; i2 < iMin; i2++) {
                        Particle particle = (Particle) this.particles.get(i2);
                        float f2 = particle.a * particle.s * f;
                        float f3 = (width / 2.0f) * f2;
                        float f4 = (height / 2.0f) * f2;
                        BatchParticlesDrawHelper.BatchParticlesBuffer batchParticlesBuffer = this.batchParticlesBuffer;
                        float f5 = particle.x;
                        float f6 = particle.y;
                        batchParticlesBuffer.setParticleVertexCords(i2, f5 - f3, f6 - f4, f5 + f3, f4 + f6);
                        this.batchParticlesBuffer.setParticleColor(i2, ColorUtils.setAlphaComponent(i, (int) (Utilities.clamp01(particle.la * f) * 255.0f)));
                    }
                    BatchParticlesDrawHelper.draw(canvas, this.batchParticlesBuffer, iMin, this.batchParticlesPaint);
                } else {
                    if (this.bPaintColor != i) {
                        Paint paint = this.bPaint;
                        this.bPaintColor = i;
                        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                    }
                    for (int i3 = 0; i3 < iMin; i3++) {
                        Particle particle2 = (Particle) this.particles.get(i3);
                        particle2.draw(canvas, i, particle2.la * f);
                    }
                }
                this.firstDraw = false;
            }
        }

        public void gen(Particle particle, long j, boolean z) {
            particle.start = j;
            long jLerp = (long) (AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.lifetime);
            particle.lifetime = jLerp;
            if (z) {
                particle.start -= (long) (jLerp * Utilities.clamp01(Utilities.fastRandom.nextFloat()));
            }
            RectF rectF = this.bounds;
            particle.x = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
            RectF rectF2 = this.bounds;
            particle.y = AndroidUtilities.lerp(rectF2.top, rectF2.bottom, Utilities.fastRandom.nextFloat());
            if (this.type == 0) {
                particle.vx = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
                particle.vy = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
            } else {
                particle.vx = this.bounds.centerX() - particle.x;
                particle.vy = this.bounds.centerY() - particle.y;
                float fDp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat()));
                float f = particle.vx;
                float f2 = particle.vy;
                float fSqrt = fDp / ((float) Math.sqrt((f * f) + (f2 * f2)));
                particle.vx *= fSqrt;
                particle.vy *= fSqrt;
            }
            particle.a = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
            particle.s = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
        }

        public class Particle {
            public float a;
            public float la;
            public long lifetime;
            public float s;
            public long start;
            public float vx;
            public float vy;
            public float x;
            public float y;

            public Particle() {
            }

            public void draw(Canvas canvas, int i, float f) {
                Particles.this.bPaint.setAlpha((int) (255.0f * f));
                Particles particles = Particles.this;
                particles.rect.set((int) (this.x - ((((particles.b.getWidth() / 2.0f) * this.a) * this.s) * f)), (int) (this.y - ((((Particles.this.b.getHeight() / 2.0f) * this.a) * this.s) * f)), (int) (this.x + ((Particles.this.b.getWidth() / 2.0f) * this.a * this.s * f)), (int) (this.y + ((Particles.this.b.getHeight() / 2.0f) * this.a * this.s * f)));
                Particles particles2 = Particles.this;
                canvas.drawBitmap(particles2.b, (Rect) null, particles2.rect, particles2.bPaint);
            }
        }
    }

    public static class SenderData {
        public boolean anonymous;
        public long did;
        public boolean my;
        public long stars;

        public static SenderData of(boolean z, boolean z2, long j, long j2) {
            SenderData senderData = new SenderData();
            senderData.anonymous = z;
            senderData.my = z2;
            senderData.did = j;
            senderData.stars = j2;
            return senderData;
        }
    }

    public class TopSendersView extends View {
        public final AnimatedFloat animatedCount;
        public final Paint backgroundPaint;
        private Utilities.Callback clickListener;
        public float count;
        public final boolean liveStories;
        public final ArrayList oldSenders;
        private Sender pressedSender;
        public final ArrayList senders;

        public TopSendersView(Context context, boolean z) {
            super(context);
            this.senders = new ArrayList();
            this.oldSenders = new ArrayList();
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            this.animatedCount = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.liveStories = z;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint.setColor(Theme.getColor(Theme.key_dialogBackground, StarsReactionsSheet.this.resourcesProvider));
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            for (int i = 0; i < this.senders.size(); i++) {
                ((Sender) this.senders.get(i)).imageReceiver.onAttachedToWindow();
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            for (int i = 0; i < this.senders.size(); i++) {
                ((Sender) this.senders.get(i)).imageReceiver.onDetachedFromWindow();
            }
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            this.count = this.animatedCount.set(this.senders.size());
            for (int i = 0; i < this.oldSenders.size(); i++) {
                ((Sender) this.oldSenders.get(i)).draw(canvas);
            }
            for (int i2 = 0; i2 < this.senders.size(); i2++) {
                ((Sender) this.senders.get(i2)).draw(canvas);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            Sender sender;
            Utilities.Callback callback;
            if (motionEvent.getAction() == 0) {
                Sender sender2 = this.pressedSender;
                if (sender2 != null) {
                    sender2.bounce.setPressed(false);
                }
                this.pressedSender = null;
                for (int i = 0; i < this.senders.size(); i++) {
                    if (((Sender) this.senders.get(i)).clickBounds.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.pressedSender = (Sender) this.senders.get(i);
                        break;
                    }
                }
                Sender sender3 = this.pressedSender;
                if (sender3 != null) {
                    sender3.bounce.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && (sender = this.pressedSender) != null && !sender.anonymous && sender.clickBounds.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.clickListener) != null) {
                    callback.run(Long.valueOf(this.pressedSender.did));
                }
                Sender sender4 = this.pressedSender;
                if (sender4 != null) {
                    sender4.bounce.setPressed(false);
                }
                this.pressedSender = null;
            }
            return this.pressedSender != null;
        }

        public void setMyPrivacy(long j) {
            for (int i = 0; i < this.senders.size(); i++) {
                Sender sender = (Sender) this.senders.get(i);
                if (sender.my) {
                    sender.setPrivacy(j);
                    return;
                }
            }
        }

        public void setSenders(ArrayList<SenderData> arrayList) {
            Sender sender;
            int i = 0;
            while (true) {
                SenderData senderData = null;
                if (i >= this.senders.size()) {
                    break;
                }
                Sender sender2 = (Sender) this.senders.get(i);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    SenderData senderData2 = arrayList.get(i2);
                    boolean z = senderData2.my;
                    if ((z && sender2.my) || (!sender2.my && !z && senderData2.did == sender2.did)) {
                        senderData = arrayList.get(i2);
                        break;
                    }
                }
                if (senderData == null) {
                    sender2.imageReceiver.onDetachedFromWindow();
                    this.senders.remove(i);
                    i--;
                    sender2.index = -1;
                    this.oldSenders.add(sender2);
                }
                i++;
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                SenderData senderData3 = arrayList.get(i3);
                int i4 = 0;
                while (true) {
                    if (i4 >= this.senders.size()) {
                        sender = null;
                        break;
                    }
                    Sender sender3 = (Sender) this.senders.get(i4);
                    boolean z2 = sender3.my;
                    if ((z2 && senderData3.my) || (!z2 && !senderData3.my && sender3.did == senderData3.did)) {
                        sender = (Sender) this.senders.get(i4);
                        break;
                    }
                    i4++;
                }
                if (sender == null) {
                    for (int i5 = 0; i5 < this.oldSenders.size(); i5++) {
                        Sender sender4 = (Sender) this.oldSenders.get(i5);
                        boolean z3 = sender4.my;
                        if ((z3 && senderData3.my) || (!z3 && !senderData3.my && sender4.did == senderData3.did)) {
                            sender = (Sender) this.oldSenders.get(i5);
                            break;
                        }
                    }
                    if (sender != null) {
                        this.oldSenders.remove(sender);
                        sender.imageReceiver.onAttachedToWindow();
                        this.senders.add(sender);
                    }
                }
                if (sender == null) {
                    sender = new Sender(senderData3.my, senderData3.did);
                    sender.animatedScale.set(0.0f, true);
                    this.senders.add(sender);
                    sender.animatedPosition.set((arrayList.size() - 1) - i3, true);
                }
                sender.index = (arrayList.size() - 1) - i3;
                sender.setStars(senderData3.stars);
                if (this.liveStories) {
                    sender.setPlace(i3 + 1);
                }
                if (senderData3.my) {
                    sender.setPrivacy(StarsReactionsSheet.this.peer);
                } else {
                    sender.setAnonymous(senderData3.anonymous);
                }
            }
            invalidate();
        }

        public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
            this.clickListener = callback;
        }

        public class Sender {
            public final AnimatedFloat animatedAnonymous;
            public final AnimatedFloat animatedPosition;
            public final AnimatedFloat animatedScale;
            public boolean anonymous;
            public final AvatarDrawable anonymousAvatarDrawable;
            public final AvatarDrawable avatarDrawable;
            public final ButtonBounce bounce;
            public final RectF clickBounds = new RectF();
            private Drawable crown;
            private Drawable crownOutline;
            private int currentColor;
            public long did;
            public LinearGradient gradient;
            public Matrix gradientMatrix;
            public final ImageReceiver imageReceiver;
            public int index;
            public final boolean my;
            public final Paint paint;
            private int place;
            private Text placeText;
            public Text starsText;
            public Text text;

            public Sender(boolean z, long j) {
                String forcedFirstName;
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.animatedPosition = new AnimatedFloat(TopSendersView.this, 0L, 600L, cubicBezierInterpolator);
                this.animatedScale = new AnimatedFloat(TopSendersView.this, 0L, 200L, cubicBezierInterpolator);
                this.animatedAnonymous = new AnimatedFloat(TopSendersView.this, 0L, 350L, cubicBezierInterpolator);
                this.gradient = null;
                this.gradientMatrix = new Matrix();
                this.paint = new Paint(1);
                ImageReceiver imageReceiver = new ImageReceiver(TopSendersView.this);
                this.imageReceiver = imageReceiver;
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                this.avatarDrawable = avatarDrawable;
                AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                this.anonymousAvatarDrawable = avatarDrawable2;
                this.bounce = new ButtonBounce(TopSendersView.this);
                this.my = z;
                this.did = j;
                if (j >= 0) {
                    TLRPC.User user = MessagesController.getInstance(StarsReactionsSheet.this.currentAccount).getUser(Long.valueOf(j));
                    forcedFirstName = UserObject.getForcedFirstName(user);
                    avatarDrawable.setInfo(user);
                    imageReceiver.setForUserOrChat(user, avatarDrawable);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(StarsReactionsSheet.this.currentAccount).getChat(Long.valueOf(-j));
                    forcedFirstName = chat == null ? "" : chat.title;
                    avatarDrawable.setInfo(chat);
                    imageReceiver.setForUserOrChat(chat, avatarDrawable);
                }
                imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
                imageReceiver.onAttachedToWindow();
                imageReceiver.setCrossfadeWithOldImage(true);
                avatarDrawable2.setAvatarType(21);
                avatarDrawable2.setColor(Theme.getColor(Theme.key_avatar_backgroundGray, StarsReactionsSheet.this.resourcesProvider));
                this.text = new Text(forcedFirstName, 12.0f);
            }

            private long getPrivacy() {
                if (this.anonymous) {
                    return 2666000L;
                }
                if (this.did == UserConfig.getInstance(StarsReactionsSheet.this.currentAccount).getClientUserId()) {
                    return 0L;
                }
                return this.did;
            }

            public void setAnonymous(boolean z) {
                String shortName;
                if (this.my || this.anonymous == z) {
                    return;
                }
                this.anonymous = z;
                if (z) {
                    shortName = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    shortName = DialogObject.getShortName(this.did);
                }
                this.text = new Text(shortName, 12.0f);
                TopSendersView.this.invalidate();
            }

            public void setPrivacy(long j) {
                String forcedFirstName;
                String string;
                if (this.my && getPrivacy() != j) {
                    this.anonymous = j == 2666000;
                    if (j == 0 || j == 2666000) {
                        j = UserConfig.getInstance(StarsReactionsSheet.this.currentAccount).getClientUserId();
                    }
                    this.did = j;
                    if (this.anonymous) {
                        string = LocaleController.getString(R.string.StarsReactionAnonymous);
                    } else {
                        if (j >= 0) {
                            TLRPC.User user = MessagesController.getInstance(StarsReactionsSheet.this.currentAccount).getUser(Long.valueOf(this.did));
                            forcedFirstName = UserObject.getForcedFirstName(user);
                            this.avatarDrawable.setInfo(user);
                            this.imageReceiver.setForUserOrChat(user, this.avatarDrawable);
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(StarsReactionsSheet.this.currentAccount).getChat(Long.valueOf(-this.did));
                            forcedFirstName = chat == null ? "" : chat.title;
                            this.avatarDrawable.setInfo(chat);
                            this.imageReceiver.setForUserOrChat(chat, this.avatarDrawable);
                        }
                        string = forcedFirstName;
                    }
                    this.text = new Text(string, 12.0f);
                    TopSendersView.this.invalidate();
                }
            }

            public void setStars(long j) {
                this.starsText = new Text(StarsIntroActivity.replaceStars("⭐️" + LocaleController.formatNumber(j, ','), 0.85f), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (TopSendersView.this.liveStories) {
                    int i = (int) j;
                    this.gradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{HighlightMessageSheet.getTierOption(StarsReactionsSheet.this.currentAccount, i, HighlightMessageSheet.TIER_COLOR2), HighlightMessageSheet.getTierOption(StarsReactionsSheet.this.currentAccount, i, HighlightMessageSheet.TIER_COLOR1)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.currentColor = ColorUtils.blendARGB(HighlightMessageSheet.getTierOption(StarsReactionsSheet.this.currentAccount, i, HighlightMessageSheet.TIER_COLOR2), HighlightMessageSheet.getTierOption(StarsReactionsSheet.this.currentAccount, i, HighlightMessageSheet.TIER_COLOR1), 0.5f);
                    this.paint.setShader(this.gradient);
                } else {
                    this.paint.setShader(null);
                    Paint paint = this.paint;
                    this.currentColor = -1002750;
                    paint.setColor(-1002750);
                }
                Drawable drawable = this.crown;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(this.currentColor, PorterDuff.Mode.SRC_IN));
                }
            }

            public void setPlace(int i) {
                this.place = i;
                this.placeText = new Text("" + i, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i <= 0 || this.crown != null) {
                    return;
                }
                Drawable drawableMutate = TopSendersView.this.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                this.crown = drawableMutate;
                int i2 = this.currentColor;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(i2, mode));
                Drawable drawableMutate2 = TopSendersView.this.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                this.crownOutline = drawableMutate2;
                drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogBackground, StarsReactionsSheet.this.resourcesProvider), mode));
            }

            public void draw(Canvas canvas) {
                float f;
                float f2;
                float f3 = this.animatedPosition.set(this.index);
                AnimatedFloat animatedFloat = this.animatedScale;
                int i = this.index;
                float f4 = animatedFloat.set(i >= 0 && i < TopSendersView.this.senders.size());
                canvas.save();
                float width = (TopSendersView.this.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, TopSendersView.this.count);
                float fDp = AndroidUtilities.dp(40.0f) + ((TopSendersView.this.count - (f3 + 0.5f)) * width);
                float fDp2 = AndroidUtilities.dp(40.0f);
                float f5 = width / 2.0f;
                this.clickBounds.set(fDp - f5, fDp2 - AndroidUtilities.dp(50.0f), f5 + fDp, AndroidUtilities.dp(50.0f) + fDp2);
                float f6 = (0.3f * f4) + 0.7f;
                canvas.scale(f6, f6, fDp, fDp2);
                float scale = this.bounce.getScale(0.04f);
                canvas.scale(scale, scale, fDp, fDp2);
                if (f4 > 0.0f) {
                    float f7 = this.animatedAnonymous.set(this.anonymous);
                    if (f7 < 1.0f) {
                        f = 255.0f;
                        f2 = 40.0f;
                        this.imageReceiver.setImageCoords(fDp - (AndroidUtilities.dp(56.0f) / 2.0f), fDp2 - (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                        this.imageReceiver.setAlpha(f4);
                        this.imageReceiver.draw(canvas);
                        this.imageReceiver.setAlpha(1.0f);
                    } else {
                        f = 255.0f;
                        f2 = 40.0f;
                    }
                    if (f7 > 0.0f) {
                        int i2 = (int) fDp;
                        int i3 = (int) fDp2;
                        this.anonymousAvatarDrawable.setBounds(i2 - (AndroidUtilities.dp(56.0f) / 2), i3 - (AndroidUtilities.dp(56.0f) / 2), i2 + (AndroidUtilities.dp(56.0f) / 2), i3 + (AndroidUtilities.dp(56.0f) / 2));
                        this.anonymousAvatarDrawable.setAlpha((int) (f4 * f * f7));
                        this.anonymousAvatarDrawable.draw(canvas);
                        this.anonymousAvatarDrawable.setAlpha(255);
                    }
                } else {
                    f = 255.0f;
                    f2 = 40.0f;
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set((fDp - (this.starsText.getCurrentWidth() / 2.0f)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + fDp2) - (AndroidUtilities.dp(16.0f) / 2.0f), (this.starsText.getCurrentWidth() / 2.0f) + fDp + AndroidUtilities.dp(5.66f), AndroidUtilities.dp(23.0f) + fDp2 + (AndroidUtilities.dp(16.0f) / 2.0f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, TopSendersView.this.backgroundPaint);
                int i4 = (int) (f4 * f);
                this.paint.setAlpha(i4);
                if (this.gradient != null) {
                    this.gradientMatrix.reset();
                    this.gradientMatrix.postTranslate(0.0f, rectF.top);
                    this.gradient.setLocalMatrix(this.gradientMatrix);
                }
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.paint);
                Text text = this.starsText;
                text.draw(canvas, fDp - (text.getCurrentWidth() / 2.0f), AndroidUtilities.dp(23.0f) + fDp2, -1, f4);
                this.text.ellipsize(width - AndroidUtilities.dp(4.0f)).draw(canvas, fDp - (this.text.getWidth() / 2.0f), fDp2 + AndroidUtilities.dp(42.0f), Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, StarsReactionsSheet.this.resourcesProvider), f4);
                if (this.place > 0) {
                    int i5 = (int) fDp;
                    int i6 = (int) fDp2;
                    this.crownOutline.setBounds(i5 - AndroidUtilities.dp(12.0f), i6 - AndroidUtilities.dp(f2), AndroidUtilities.dp(12.0f) + i5, i6 - AndroidUtilities.dp(16.0f));
                    this.crown.setBounds(i5 - AndroidUtilities.dp(12.0f), i6 - AndroidUtilities.dp(f2), i5 + AndroidUtilities.dp(12.0f), i6 - AndroidUtilities.dp(16.0f));
                    this.crownOutline.setAlpha(i4);
                    this.crown.setAlpha(i4);
                    this.crownOutline.draw(canvas);
                    this.crown.draw(canvas);
                    Text text2 = this.placeText;
                    text2.draw(canvas, fDp - (text2.getCurrentWidth() / 2.0f), fDp2 - AndroidUtilities.dp(27.0f), -1, f4);
                }
                canvas.restore();
            }
        }
    }
}
