package org.telegram.ui.Components.Reactions;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.ScrimOptions$$ExternalSyntheticLambda2;
import org.telegram.ui.LocationActivity;

public final class ChatSelectionReactionMenuOverlay extends FrameLayout {
    public float currentOffsetY;
    public MessageObject currentPrimaryObject;
    public boolean hiddenByScroll;
    public boolean isVisible;
    public long lastUpdate;
    public final int mPadding;
    public final int mSidePadding;
    public boolean messageSet;
    public final ChatActivity parentFragment;
    public final int[] pos;
    public AnonymousClass2 reactionsContainerLayout;
    public List selectedMessages;
    public float toOffsetY;
    public float translationOffsetY;

    public final class AnonymousClass2 extends ReactionsContainerLayout {
        public float enabledAlpha;
        public long lastUpdate;

        @Override
        public final void draw(Canvas canvas) {
            long jMin = Math.min(16L, System.currentTimeMillis() - this.lastUpdate);
            this.lastUpdate = System.currentTimeMillis();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (this.enabledAlpha * 255.0f), 31);
            super.draw(canvas);
            canvas.restore();
            if (!isEnabled()) {
                float f = this.enabledAlpha;
                if (f != 0.0f) {
                    this.enabledAlpha = Math.max(0.0f, f - (jMin / 150.0f));
                    invalidate();
                    if (this.enabledAlpha == 0.0f) {
                        setVisibility(8);
                        return;
                    }
                    return;
                }
            }
            if (isEnabled()) {
                float f2 = this.enabledAlpha;
                if (f2 != 1.0f) {
                    this.enabledAlpha = Math.min(1.0f, (jMin / 150.0f) + f2);
                    invalidate();
                }
            }
        }

        @Override
        public final void setVisibility(int i) {
            super.setVisibility(i);
            if (i != 8 || this.enabledAlpha == 0.0f) {
                return;
            }
            this.enabledAlpha = 0.0f;
        }
    }

    public ChatSelectionReactionMenuOverlay(ChatActivity chatActivity, Context context) {
        super(context);
        this.selectedMessages = Collections.EMPTY_LIST;
        this.mPadding = 22;
        this.mSidePadding = 24;
        this.pos = new int[2];
        setVisibility(8);
        this.parentFragment = chatActivity;
        setClipToPadding(false);
        setClipChildren(false);
        chatActivity.chatListView.addOnScrollListener(new LocationActivity.AnonymousClass10(this, 3));
    }

    public final void animateVisible(boolean z) {
        if (z) {
            setVisibility(0);
            post(new ChatSelectionReactionMenuOverlay$$ExternalSyntheticLambda0(this, 1));
            return;
        }
        this.messageSet = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 5));
        duration.addListener(new ItemOptions.AnonymousClass3(this, 24));
        duration.start();
    }

    public final MessageObject findPrimaryObject() {
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (!this.isVisible || this.selectedMessages.isEmpty()) {
            return null;
        }
        int i = 0;
        MessageObject messageObject = (MessageObject) this.selectedMessages.get(0);
        if (messageObject.getGroupId() != 0) {
            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.parentFragment.groupedMessagesMap.get(messageObject.getGroupId());
            if (groupedMessages != null && (arrayList = groupedMessages.messages) != null) {
                int size = arrayList.size();
                while (i < size) {
                    MessageObject messageObject2 = arrayList.get(i);
                    i++;
                    MessageObject messageObject3 = messageObject2;
                    TLRPC.Message message = messageObject3.messageOwner;
                    if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                        return messageObject3;
                    }
                }
            }
        }
        return messageObject;
    }

    public final void invalidatePosition(boolean z) {
        int height;
        boolean z2;
        boolean z3;
        float interpolation;
        AnonymousClass2 anonymousClass2;
        FrameLayout.LayoutParams layoutParams;
        int iM;
        int iM2;
        int iDp;
        int i;
        if (!this.isVisible || this.currentPrimaryObject == null || this.reactionsContainerLayout == null) {
            return;
        }
        long jMin = Math.min(16L, System.currentTimeMillis() - this.lastUpdate);
        this.lastUpdate = System.currentTimeMillis();
        float f = this.currentOffsetY;
        float f2 = this.toOffsetY;
        if (f != f2) {
            float f3 = jMin / 220.0f;
            if (f2 > f) {
                this.currentOffsetY = Math.min(f + f3, f2);
            } else if (f2 < f) {
                this.currentOffsetY = Math.max(f - f3, f2);
            }
            AndroidUtilities.runOnUIThread(new ChatSelectionReactionMenuOverlay$$ExternalSyntheticLambda0(this, 0));
        }
        ChatActivity chatActivity = this.parentFragment;
        ChatActivity.AnonymousClass21 anonymousClass21 = chatActivity.chatListView;
        int[] iArr = this.pos;
        anonymousClass21.getLocationInWindow(iArr);
        boolean z4 = true;
        float f4 = iArr[1];
        getLocationInWindow(iArr);
        float f5 = (f4 - iArr[1]) - chatActivity.pullingDownOffset;
        boolean z5 = false;
        for (int i2 = 0; i2 < anonymousClass21.getChildCount(); i2++) {
            View childAt = anonymousClass21.getChildAt(i2);
            if (childAt instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                MessageObject messageObject = chatMessageCell.getMessageObject();
                if (messageObject.getId() == this.currentPrimaryObject.getId()) {
                    boolean zIsOutOwner = messageObject.isOutOwner();
                    AnonymousClass2 anonymousClass3 = this.reactionsContainerLayout;
                    if (anonymousClass3 != null) {
                        anonymousClass3.setMirrorX(zIsOutOwner);
                        AnonymousClass2 anonymousClass4 = this.reactionsContainerLayout;
                        int iDp2 = AndroidUtilities.dp(4.0f);
                        boolean z6 = LocaleController.isRTL;
                        int i3 = this.mSidePadding;
                        int i4 = iDp2 + ((z6 || zIsOutOwner) ? 0 : i3);
                        float f6 = this.mPadding;
                        int iDp3 = AndroidUtilities.dp(f6);
                        int iDp4 = AndroidUtilities.dp(4.0f);
                        if (!LocaleController.isRTL && !zIsOutOwner) {
                            i3 = 0;
                        }
                        anonymousClass4.setPadding(i4, iDp3, iDp4 + i3, AndroidUtilities.dp(f6));
                    }
                    int height2 = getHeight() != 0 ? getHeight() : anonymousClass21.getHeight();
                    if (chatMessageCell.getCurrentMessagesGroup() != null) {
                        MessageObject.GroupedMessages.TransitionParams transitionParams = chatMessageCell.getCurrentMessagesGroup().transitionParams;
                        height = transitionParams.bottom - transitionParams.top;
                    } else {
                        height = chatMessageCell.getHeight();
                    }
                    float y = (chatMessageCell.getY() + f5) - AndroidUtilities.dp(74.0f);
                    float fDp = AndroidUtilities.dp(14.0f);
                    float fDp2 = height2 - AndroidUtilities.dp(218.0f);
                    ChatActivity.AnonymousClass33 anonymousClass33 = chatActivity.fragmentContextView;
                    if (anonymousClass33 != null && anonymousClass33.getVisibility() == 0) {
                        fDp += anonymousClass33.getHeight();
                    }
                    float f7 = height;
                    if (y <= fDp - (f7 / 2.0f) || y >= fDp2) {
                        if (y < (fDp - f7) - AndroidUtilities.dp(92.0f) || y > fDp2) {
                            z2 = false;
                            z3 = false;
                        } else {
                            this.translationOffsetY = AndroidUtilities.dp(56.0f) + height;
                            this.toOffsetY = 1.0f;
                            z2 = true;
                        }
                        if (!z) {
                            this.currentOffsetY = this.toOffsetY;
                        }
                        interpolation = (CubicBezierInterpolator.DEFAULT.getInterpolation(this.currentOffsetY) * this.translationOffsetY) + y;
                        anonymousClass2 = this.reactionsContainerLayout;
                        if (anonymousClass2 == null) {
                            return;
                        }
                        if (z2 != anonymousClass2.isFlippedVertically) {
                            anonymousClass2.setFlippedVertically(z2);
                            AndroidUtilities.runOnUIThread(new ChatSelectionReactionMenuOverlay$$ExternalSyntheticLambda0(this, 0));
                        }
                        if (z3 != this.reactionsContainerLayout.isEnabled()) {
                            this.reactionsContainerLayout.setEnabled(z3);
                            this.reactionsContainerLayout.invalidate();
                            if (z3) {
                                this.reactionsContainerLayout.setVisibility(0);
                                if (!this.messageSet) {
                                    this.messageSet = true;
                                    this.reactionsContainerLayout.setMessage(this.currentPrimaryObject, chatActivity.chatInfo, true);
                                }
                            }
                        }
                        this.reactionsContainerLayout.setTranslationY(MathUtils.clamp(interpolation, fDp, fDp2));
                        this.reactionsContainerLayout.setTranslationX(chatMessageCell.getNonAnimationTranslationX(true));
                        layoutParams = (FrameLayout.LayoutParams) this.reactionsContainerLayout.getLayoutParams();
                        iM = BotFullscreenButtons$$ExternalSyntheticOutline1.m(chatMessageCell.getBackgroundDrawableLeft(), 32.0f, 0);
                        iM2 = BotFullscreenButtons$$ExternalSyntheticOutline1.m(chatMessageCell.getWidth() - chatMessageCell.getBackgroundDrawableRight(), 32.0f, (int) chatMessageCell.getNonAnimationTranslationX(true));
                        iDp = AndroidUtilities.dp(40.0f) * 8;
                        if ((getWidth() - iM2) - iM < iDp) {
                            if (zIsOutOwner) {
                                iM = Math.min(iM, getWidth() - iDp);
                                iM2 = 0;
                            } else {
                                iM2 = Math.min(iM2, getWidth() - iDp);
                                iM = 0;
                            }
                        }
                        if (zIsOutOwner) {
                            i = 5;
                        } else {
                            i = 3;
                        }
                        if (i != layoutParams.gravity) {
                            layoutParams.gravity = i;
                            z5 = true;
                        }
                        if (iM != layoutParams.leftMargin) {
                            layoutParams.leftMargin = iM;
                            z5 = true;
                        }
                        if (iM2 != layoutParams.rightMargin) {
                            layoutParams.rightMargin = iM2;
                        } else {
                            z4 = z5;
                        }
                        if (z4) {
                            this.reactionsContainerLayout.requestLayout();
                            return;
                        }
                        return;
                    }
                    this.toOffsetY = 0.0f;
                    z2 = false;
                    z3 = true;
                    if (!z) {
                        this.currentOffsetY = this.toOffsetY;
                    }
                    interpolation = (CubicBezierInterpolator.DEFAULT.getInterpolation(this.currentOffsetY) * this.translationOffsetY) + y;
                    anonymousClass2 = this.reactionsContainerLayout;
                    if (anonymousClass2 == null) {
                        return;
                    }
                    if (z2 != anonymousClass2.isFlippedVertically) {
                        anonymousClass2.setFlippedVertically(z2);
                        AndroidUtilities.runOnUIThread(new ChatSelectionReactionMenuOverlay$$ExternalSyntheticLambda0(this, 0));
                    }
                    if (z3 != this.reactionsContainerLayout.isEnabled()) {
                        this.reactionsContainerLayout.setEnabled(z3);
                        this.reactionsContainerLayout.invalidate();
                        if (z3) {
                            this.reactionsContainerLayout.setVisibility(0);
                            if (!this.messageSet) {
                                this.messageSet = true;
                                this.reactionsContainerLayout.setMessage(this.currentPrimaryObject, chatActivity.chatInfo, true);
                            }
                        }
                    }
                    this.reactionsContainerLayout.setTranslationY(MathUtils.clamp(interpolation, fDp, fDp2));
                    this.reactionsContainerLayout.setTranslationX(chatMessageCell.getNonAnimationTranslationX(true));
                    layoutParams = (FrameLayout.LayoutParams) this.reactionsContainerLayout.getLayoutParams();
                    iM = BotFullscreenButtons$$ExternalSyntheticOutline1.m(chatMessageCell.getBackgroundDrawableLeft(), 32.0f, 0);
                    iM2 = BotFullscreenButtons$$ExternalSyntheticOutline1.m(chatMessageCell.getWidth() - chatMessageCell.getBackgroundDrawableRight(), 32.0f, (int) chatMessageCell.getNonAnimationTranslationX(true));
                    iDp = AndroidUtilities.dp(40.0f) * 8;
                    if ((getWidth() - iM2) - iM < iDp) {
                        if (zIsOutOwner) {
                            iM = Math.min(iM, getWidth() - iDp);
                            iM2 = 0;
                        } else {
                            iM2 = Math.min(iM2, getWidth() - iDp);
                            iM = 0;
                        }
                    }
                    if (zIsOutOwner) {
                        i = 5;
                    } else {
                        i = 3;
                    }
                    if (i != layoutParams.gravity) {
                        layoutParams.gravity = i;
                        z5 = true;
                    }
                    if (iM != layoutParams.leftMargin) {
                        layoutParams.leftMargin = iM;
                        z5 = true;
                    }
                    if (iM2 != layoutParams.rightMargin) {
                        layoutParams.rightMargin = iM2;
                    } else {
                        z4 = z5;
                    }
                    if (z4) {
                        this.reactionsContainerLayout.requestLayout();
                        return;
                    }
                    return;
                }
            }
        }
        AnonymousClass2 anonymousClass5 = this.reactionsContainerLayout;
        if (anonymousClass5 == null || !anonymousClass5.isEnabled()) {
            return;
        }
        this.reactionsContainerLayout.setEnabled(false);
    }

    public void setHiddenByScroll(boolean z) {
        this.hiddenByScroll = z;
        if (z) {
            animateVisible(false);
        }
    }

    public void setSelectedMessages(List<MessageObject> list) {
        TLRPC.ChatFull chatFull;
        TLRPC.Message message;
        this.selectedMessages = list;
        ChatActivity chatActivity = this.parentFragment;
        int i = chatActivity.chatMode;
        boolean z = true;
        if (i == 1 || i == 5 || i == 6 || chatActivity.isReport() || chatActivity.isSecretChat() || (((chatFull = chatActivity.chatInfo) != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) || list.isEmpty())) {
            z = false;
            break;
        }
        long groupId = 0;
        boolean z2 = false;
        for (MessageObject messageObject : list) {
            if ((messageObject != null && (message = messageObject.messageOwner) != null && message.rich_message != null) || (messageObject != null && !messageObject.needDrawBluredPreview() && ((MessageObject.isPhoto(messageObject.messageOwner) && MessageObject.getMedia(messageObject.messageOwner).webpage == null) || (messageObject.getDocument() != null && (MessageObject.isVideoDocument(messageObject.getDocument()) || MessageObject.isGifDocument(messageObject.getDocument())))))) {
                if (!z2) {
                    groupId = messageObject.getGroupId();
                    z2 = true;
                } else if (groupId != messageObject.getGroupId() || groupId == 0) {
                }
            }
            z = false;
        }
        if (z != this.isVisible) {
            this.isVisible = z;
            this.hiddenByScroll = false;
            animateVisible(z);
        } else if (z) {
            this.currentPrimaryObject = findPrimaryObject();
        }
    }
}
