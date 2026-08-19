package org.telegram.ui.Components.Reactions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;

public class ChatSelectionReactionMenuOverlay extends FrameLayout {
    private float currentOffsetY;
    private MessageObject currentPrimaryObject;
    private boolean hiddenByScroll;
    private boolean isVisible;
    private long lastUpdate;
    private int mPadding;
    private int mSidePadding;
    private boolean messageSet;
    private ChatActivity parentFragment;
    private int[] pos;
    private ReactionsContainerLayout reactionsContainerLayout;
    private List selectedMessages;
    private float toOffsetY;
    private float translationOffsetY;

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
        chatActivity.getChatListView().addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                ChatSelectionReactionMenuOverlay.this.invalidatePosition();
            }
        });
    }

    private void checkCreateReactionsLayout() {
        if (this.reactionsContainerLayout == null) {
            ReactionsContainerLayout reactionsContainerLayout = new ReactionsContainerLayout((this.parentFragment.getUserConfig().getClientUserId() > this.parentFragment.getDialogId() ? 1 : (this.parentFragment.getUserConfig().getClientUserId() == this.parentFragment.getDialogId() ? 0 : -1)) == 0 ? 3 : 0, this.parentFragment, getContext(), this.parentFragment.getCurrentAccount(), this.parentFragment.getResourceProvider()) {
                float enabledAlpha = 1.0f;
                long lastUpdate;

                {
                    setWillNotDraw(false);
                }

                @Override
                public void draw(Canvas canvas) {
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
                            this.enabledAlpha = Math.min(1.0f, f2 + (jMin / 150.0f));
                            invalidate();
                        }
                    }
                }

                @Override
                public void setVisibility(int i) {
                    super.setVisibility(i);
                    if (i != 8 || this.enabledAlpha == 0.0f) {
                        return;
                    }
                    this.enabledAlpha = 0.0f;
                }
            };
            this.reactionsContainerLayout = reactionsContainerLayout;
            reactionsContainerLayout.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : this.mSidePadding), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? this.mSidePadding : 0), AndroidUtilities.dp(this.mPadding));
            this.reactionsContainerLayout.setDelegate(new AnonymousClass3());
            this.reactionsContainerLayout.setClipChildren(false);
            this.reactionsContainerLayout.setClipToPadding(false);
            addView(this.reactionsContainerLayout, LayoutHelper.createFrame(-2, this.mPadding + 70, 5));
        }
    }

    class AnonymousClass3 implements ReactionsContainerLayout.ReactionsContainerDelegate {
        @Override
        public boolean allowLongPress() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$allowLongPress(this);
        }

        @Override
        public boolean drawBackground() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawBackground(this);
        }

        @Override
        public void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
            ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawRoundRect(this, canvas, rectF, f, f2, f3, i, z);
        }

        @Override
        public boolean needEnterText() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$needEnterText(this);
        }

        @Override
        public void onEmojiWindowDismissed() {
            ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$onEmojiWindowDismissed(this);
        }

        AnonymousClass3() {
        }

        @Override
        public void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
            ChatSelectionReactionMenuOverlay.this.parentFragment.selectReaction(null, ChatSelectionReactionMenuOverlay.this.currentPrimaryObject, ChatSelectionReactionMenuOverlay.this.reactionsContainerLayout, view, 0.0f, 0.0f, visibleReaction, false, z, z2, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatSelectionReactionMenuOverlay.AnonymousClass3.$r8$lambda$1aaIFgFwJZUtJDRzXlEPDb4bPOk(this.f$0);
                }
            });
        }

        public static void $r8$lambda$1aaIFgFwJZUtJDRzXlEPDb4bPOk(AnonymousClass3 anonymousClass3) {
            if (ChatSelectionReactionMenuOverlay.this.reactionsContainerLayout != null) {
                ChatSelectionReactionMenuOverlay.this.reactionsContainerLayout.dismissParent(true);
            }
            anonymousClass3.hideMenu();
        }

        public void hideMenu() {
            ChatSelectionReactionMenuOverlay.this.parentFragment.clearSelectionMode(true);
        }
    }

    public boolean isVisible() {
        return this.isVisible && !this.hiddenByScroll;
    }

    public void invalidatePosition() {
        invalidatePosition(true);
    }

    public void invalidatePosition(boolean z) {
        int height;
        boolean z2;
        boolean z3;
        float interpolation;
        ReactionsContainerLayout reactionsContainerLayout;
        FrameLayout.LayoutParams layoutParams;
        int iMax;
        int iMax2;
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
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.invalidatePosition();
                }
            });
        }
        RecyclerListView chatListView = this.parentFragment.getChatListView();
        chatListView.getLocationInWindow(this.pos);
        int[] iArr = this.pos;
        boolean z4 = true;
        float f4 = iArr[1];
        getLocationInWindow(iArr);
        float pullingDownOffset = (f4 - this.pos[1]) - this.parentFragment.getPullingDownOffset();
        boolean z5 = false;
        for (int i2 = 0; i2 < chatListView.getChildCount(); i2++) {
            View childAt = chatListView.getChildAt(i2);
            if (childAt instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                MessageObject messageObject = chatMessageCell.getMessageObject();
                if (messageObject.getId() == this.currentPrimaryObject.getId()) {
                    boolean zIsOutOwner = messageObject.isOutOwner();
                    ReactionsContainerLayout reactionsContainerLayout2 = this.reactionsContainerLayout;
                    if (reactionsContainerLayout2 != null) {
                        reactionsContainerLayout2.setMirrorX(zIsOutOwner);
                        this.reactionsContainerLayout.setPadding(AndroidUtilities.dp(4.0f) + ((LocaleController.isRTL || zIsOutOwner) ? 0 : this.mSidePadding), AndroidUtilities.dp(this.mPadding), AndroidUtilities.dp(4.0f) + ((LocaleController.isRTL || zIsOutOwner) ? this.mSidePadding : 0), AndroidUtilities.dp(this.mPadding));
                    }
                    int height2 = getHeight() != 0 ? getHeight() : chatListView.getHeight();
                    if (chatMessageCell.getCurrentMessagesGroup() != null) {
                        MessageObject.GroupedMessages.TransitionParams transitionParams = chatMessageCell.getCurrentMessagesGroup().transitionParams;
                        height = transitionParams.bottom - transitionParams.top;
                    } else {
                        height = chatMessageCell.getHeight();
                    }
                    float y = (chatMessageCell.getY() + pullingDownOffset) - AndroidUtilities.dp(74.0f);
                    float fDp = AndroidUtilities.dp(14.0f);
                    float fDp2 = height2 - AndroidUtilities.dp(218.0f);
                    FragmentContextView fragmentContextView = this.parentFragment.getFragmentContextView();
                    if (fragmentContextView != null && fragmentContextView.getVisibility() == 0) {
                        fDp += fragmentContextView.getHeight();
                    }
                    float f5 = height;
                    if (y > fDp - (f5 / 2.0f) && y < fDp2) {
                        this.toOffsetY = 0.0f;
                        z2 = false;
                    } else {
                        if (y < (fDp - f5) - AndroidUtilities.dp(92.0f) || y > fDp2) {
                            z2 = false;
                            z3 = false;
                        } else {
                            this.translationOffsetY = height + AndroidUtilities.dp(56.0f);
                            this.toOffsetY = 1.0f;
                            z2 = true;
                        }
                        if (!z) {
                            this.currentOffsetY = this.toOffsetY;
                        }
                        interpolation = y + (CubicBezierInterpolator.DEFAULT.getInterpolation(this.currentOffsetY) * this.translationOffsetY);
                        reactionsContainerLayout = this.reactionsContainerLayout;
                        if (reactionsContainerLayout == null) {
                            return;
                        }
                        if (z2 != reactionsContainerLayout.isFlippedVertically()) {
                            this.reactionsContainerLayout.setFlippedVertically(z2);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.invalidatePosition();
                                }
                            });
                        }
                        if (z3 != this.reactionsContainerLayout.isEnabled()) {
                            this.reactionsContainerLayout.setEnabled(z3);
                            this.reactionsContainerLayout.invalidate();
                            if (z3) {
                                this.reactionsContainerLayout.setVisibility(0);
                                if (!this.messageSet) {
                                    this.messageSet = true;
                                    this.reactionsContainerLayout.setMessage(this.currentPrimaryObject, this.parentFragment.getCurrentChatInfo(), true);
                                }
                            }
                        }
                        this.reactionsContainerLayout.setTranslationY(MathUtils.clamp(interpolation, fDp, fDp2));
                        this.reactionsContainerLayout.setTranslationX(chatMessageCell.getNonAnimationTranslationX(true));
                        layoutParams = (FrameLayout.LayoutParams) this.reactionsContainerLayout.getLayoutParams();
                        iMax = Math.max(0, chatMessageCell.getBackgroundDrawableLeft() - AndroidUtilities.dp(32.0f));
                        iMax2 = Math.max((int) chatMessageCell.getNonAnimationTranslationX(true), (chatMessageCell.getWidth() - chatMessageCell.getBackgroundDrawableRight()) - AndroidUtilities.dp(32.0f));
                        iDp = AndroidUtilities.dp(40.0f) * 8;
                        if ((getWidth() - iMax2) - iMax < iDp) {
                            if (zIsOutOwner) {
                                iMax = Math.min(iMax, getWidth() - iDp);
                                iMax2 = 0;
                            } else {
                                iMax2 = Math.min(iMax2, getWidth() - iDp);
                                iMax = 0;
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
                        if (iMax != layoutParams.leftMargin) {
                            layoutParams.leftMargin = iMax;
                            z5 = true;
                        }
                        if (iMax2 != layoutParams.rightMargin) {
                            layoutParams.rightMargin = iMax2;
                        } else {
                            z4 = z5;
                        }
                        if (z4) {
                            this.reactionsContainerLayout.requestLayout();
                            return;
                        }
                        return;
                    }
                    z3 = true;
                    if (!z) {
                        this.currentOffsetY = this.toOffsetY;
                    }
                    interpolation = y + (CubicBezierInterpolator.DEFAULT.getInterpolation(this.currentOffsetY) * this.translationOffsetY);
                    reactionsContainerLayout = this.reactionsContainerLayout;
                    if (reactionsContainerLayout == null) {
                        return;
                    }
                    if (z2 != reactionsContainerLayout.isFlippedVertically()) {
                        this.reactionsContainerLayout.setFlippedVertically(z2);
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.invalidatePosition();
                            }
                        });
                    }
                    if (z3 != this.reactionsContainerLayout.isEnabled()) {
                        this.reactionsContainerLayout.setEnabled(z3);
                        this.reactionsContainerLayout.invalidate();
                        if (z3) {
                            this.reactionsContainerLayout.setVisibility(0);
                            if (!this.messageSet) {
                                this.messageSet = true;
                                this.reactionsContainerLayout.setMessage(this.currentPrimaryObject, this.parentFragment.getCurrentChatInfo(), true);
                            }
                        }
                    }
                    this.reactionsContainerLayout.setTranslationY(MathUtils.clamp(interpolation, fDp, fDp2));
                    this.reactionsContainerLayout.setTranslationX(chatMessageCell.getNonAnimationTranslationX(true));
                    layoutParams = (FrameLayout.LayoutParams) this.reactionsContainerLayout.getLayoutParams();
                    iMax = Math.max(0, chatMessageCell.getBackgroundDrawableLeft() - AndroidUtilities.dp(32.0f));
                    iMax2 = Math.max((int) chatMessageCell.getNonAnimationTranslationX(true), (chatMessageCell.getWidth() - chatMessageCell.getBackgroundDrawableRight()) - AndroidUtilities.dp(32.0f));
                    iDp = AndroidUtilities.dp(40.0f) * 8;
                    if ((getWidth() - iMax2) - iMax < iDp) {
                        if (zIsOutOwner) {
                            iMax = Math.min(iMax, getWidth() - iDp);
                            iMax2 = 0;
                        } else {
                            iMax2 = Math.min(iMax2, getWidth() - iDp);
                            iMax = 0;
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
                    if (iMax != layoutParams.leftMargin) {
                        layoutParams.leftMargin = iMax;
                        z5 = true;
                    }
                    if (iMax2 != layoutParams.rightMargin) {
                        layoutParams.rightMargin = iMax2;
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
        ReactionsContainerLayout reactionsContainerLayout3 = this.reactionsContainerLayout;
        if (reactionsContainerLayout3 == null || !reactionsContainerLayout3.isEnabled()) {
            return;
        }
        this.reactionsContainerLayout.setEnabled(false);
    }

    private MessageObject findPrimaryObject() {
        MessageObject.GroupedMessages group;
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (!this.isVisible || this.selectedMessages.isEmpty()) {
            return null;
        }
        int i = 0;
        MessageObject messageObject = (MessageObject) this.selectedMessages.get(0);
        if (messageObject.getGroupId() != 0 && (group = this.parentFragment.getGroup(messageObject.getGroupId())) != null && (arrayList = group.messages) != null) {
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
        return messageObject;
    }

    private boolean isMessageTypeAllowed(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
            return true;
        }
        if (messageObject == null || messageObject.needDrawBluredPreview()) {
            return false;
        }
        if (!MessageObject.isPhoto(messageObject.messageOwner) || MessageObject.getMedia(messageObject.messageOwner).webpage != null) {
            if (messageObject.getDocument() == null) {
                return false;
            }
            if (!MessageObject.isVideoDocument(messageObject.getDocument()) && !MessageObject.isGifDocument(messageObject.getDocument())) {
                return false;
            }
        }
        return true;
    }

    public void setSelectedMessages(List<MessageObject> list) {
        this.selectedMessages = list;
        boolean z = true;
        if (this.parentFragment.getChatMode() == 1 || this.parentFragment.getChatMode() == 5 || this.parentFragment.getChatMode() == 6 || this.parentFragment.isReport() || this.parentFragment.isSecretChat() || ((this.parentFragment.getCurrentChatInfo() != null && (this.parentFragment.getCurrentChatInfo().available_reactions instanceof TLRPC.TL_chatReactionsNone)) || list.isEmpty())) {
            z = false;
            break;
        }
        long groupId = 0;
        boolean z2 = false;
        for (MessageObject messageObject : list) {
            if (isMessageTypeAllowed(messageObject)) {
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

    private void animateVisible(boolean z) {
        if (z) {
            setVisibility(0);
            post(new Runnable() {
                @Override
                public final void run() {
                    ChatSelectionReactionMenuOverlay.$r8$lambda$kvxyFdpcWXB1AajBkfv1DAe5TB0(this.f$0);
                }
            });
            return;
        }
        this.messageSet = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChatSelectionReactionMenuOverlay.$r8$lambda$VkVnq92AEJDF5pnLtB5uWVoy3HY(this.f$0, valueAnimator);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ChatSelectionReactionMenuOverlay.this.setVisibility(8);
                if (ChatSelectionReactionMenuOverlay.this.reactionsContainerLayout != null) {
                    ChatSelectionReactionMenuOverlay chatSelectionReactionMenuOverlay = ChatSelectionReactionMenuOverlay.this;
                    chatSelectionReactionMenuOverlay.removeView(chatSelectionReactionMenuOverlay.reactionsContainerLayout);
                    ChatSelectionReactionMenuOverlay.this.reactionsContainerLayout = null;
                }
                ChatSelectionReactionMenuOverlay.this.currentPrimaryObject = null;
            }
        });
        duration.start();
    }

    public static void $r8$lambda$kvxyFdpcWXB1AajBkfv1DAe5TB0(ChatSelectionReactionMenuOverlay chatSelectionReactionMenuOverlay) {
        chatSelectionReactionMenuOverlay.currentPrimaryObject = chatSelectionReactionMenuOverlay.findPrimaryObject();
        chatSelectionReactionMenuOverlay.checkCreateReactionsLayout();
        chatSelectionReactionMenuOverlay.invalidatePosition(false);
        if (chatSelectionReactionMenuOverlay.reactionsContainerLayout.isEnabled()) {
            chatSelectionReactionMenuOverlay.messageSet = true;
            chatSelectionReactionMenuOverlay.reactionsContainerLayout.setMessage(chatSelectionReactionMenuOverlay.currentPrimaryObject, chatSelectionReactionMenuOverlay.parentFragment.getCurrentChatInfo(), true);
            chatSelectionReactionMenuOverlay.reactionsContainerLayout.startEnterAnimation(false);
        } else {
            chatSelectionReactionMenuOverlay.messageSet = false;
            chatSelectionReactionMenuOverlay.reactionsContainerLayout.setTransitionProgress(1.0f);
        }
    }

    public static void $r8$lambda$VkVnq92AEJDF5pnLtB5uWVoy3HY(ChatSelectionReactionMenuOverlay chatSelectionReactionMenuOverlay, ValueAnimator valueAnimator) {
        chatSelectionReactionMenuOverlay.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ReactionsContainerLayout reactionsContainerLayout = chatSelectionReactionMenuOverlay.reactionsContainerLayout;
        if (reactionsContainerLayout != null) {
            reactionsContainerLayout.setAlpha(fFloatValue);
        }
    }

    public boolean onBackPressed(boolean z) {
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
        if (reactionsContainerLayout == null || reactionsContainerLayout.getReactionsWindow() == null) {
            return true;
        }
        if (!z) {
            return false;
        }
        this.reactionsContainerLayout.dismissWindow();
        return false;
    }

    public void setHiddenByScroll(boolean z) {
        this.hiddenByScroll = z;
        if (z) {
            animateVisible(false);
        }
    }
}
