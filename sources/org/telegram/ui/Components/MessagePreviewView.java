package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManagerFixed;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.IMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public class MessagePreviewView extends FrameLayout {
    public static final int TAB_FORWARD = 1;
    public static final int TAB_LINK = 2;
    public static final int TAB_REPLY = 0;
    Runnable changeBoundsRunnable;
    final ChatActivity chatActivity;
    private final int currentAccount;
    TLRPC.Chat currentChat;
    TLRPC.User currentUser;
    private final ArrayList<MessageObject.GroupedMessages> drawingGroups;
    private final BlurredBackgroundDrawableViewFactory iBlur3Factory;
    boolean isLandscapeMode;
    final MessagePreviewParams messagePreviewParams;
    ValueAnimator offsetsAnimator;
    private final ResourcesDelegate resourcesProvider;
    boolean returnSendersNames;
    TLRPC.Peer sendAsPeer;
    final boolean showOutdatedQuote;
    boolean showing;
    TabsView tabsView;
    ViewPagerFixed viewPager;

    public class ActionBar extends FrameLayout {
        private boolean forward;
        private Theme.ResourcesProvider resourcesProvider;
        private final AnimatedTextView.AnimatedTextDrawable subtitle;
        private final AnimatedTextView.AnimatedTextDrawable title;

        public ActionBar(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, true);
            this.title = animatedTextDrawable;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            animatedTextDrawable.setAnimationProperties(0.3f, 0L, 430L, cubicBezierInterpolator);
            animatedTextDrawable.setTypeface(AndroidUtilities.bold());
            animatedTextDrawable.setTextColor(Theme.getColor(Theme.key_actionBarDefaultTitle, resourcesProvider));
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(18.0f));
            animatedTextDrawable.setEllipsizeByGradient(!LocaleController.isRTL);
            animatedTextDrawable.setCallback(this);
            animatedTextDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(true, true, true);
            this.subtitle = animatedTextDrawable2;
            animatedTextDrawable2.setAnimationProperties(0.3f, 0L, 430L, cubicBezierInterpolator);
            animatedTextDrawable2.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubtitle, resourcesProvider));
            animatedTextDrawable2.setTextSize(AndroidUtilities.dp(14.0f));
            animatedTextDrawable2.setEllipsizeByGradient(true ^ LocaleController.isRTL);
            animatedTextDrawable2.setCallback(this);
            animatedTextDrawable2.setOverrideFullWidth(AndroidUtilities.displaySize.x);
        }

        private void setBounds(Drawable drawable, float f) {
            int i = (int) f;
            drawable.setBounds(getPaddingLeft(), i - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + i);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            setBounds(this.title, AndroidUtilities.lerp(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(18.83f), this.subtitle.isNotEmpty()));
            this.title.draw(canvas);
            setBounds(this.subtitle, AndroidUtilities.dp(39.5f));
            this.subtitle.draw(canvas);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
            setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        }

        public void setAnimationForward(boolean z) {
            this.forward = z;
            invalidate();
        }

        public void setSubtitle(CharSequence charSequence, boolean z) {
            this.subtitle.setText(charSequence, z && !LocaleController.isRTL);
        }

        public void setTitle(CharSequence charSequence, boolean z) {
            this.title.setText(charSequence, z && !LocaleController.isRTL);
        }

        @Override
        public boolean verifyDrawable(Drawable drawable) {
            return this.title == drawable || this.subtitle == drawable || super.verifyDrawable(drawable);
        }
    }

    public class Page extends FrameLayout {
        ActionBar actionBar;
        Adapter adapter;
        private int buttonsHeight;
        ToggleButton changePositionBtn;
        ToggleButton changeSizeBtn;
        FrameLayout changeSizeBtnContainer;
        GridLayoutManagerFixed chatLayoutManager;
        RecyclerListView chatListView;
        SizeNotifierFrameLayout chatPreviewContainer;
        int chatTopOffset;
        ActionBarMenuSubItem clearQuoteButton;
        public int currentTab;
        int currentTopOffset;
        float currentYOffset;
        ActionBarMenuSubItem deleteReplyButton;
        private boolean firstAttach;
        private boolean firstLayout;
        ChatListItemAnimator itemAnimator;
        int lastSize;
        ActionBarPopupWindow.ActionBarPopupWindowLayout menu;
        int menuBack;
        MessagePreviewParams.Messages messages;
        ActionBarMenuSubItem quoteAnotherChatButton;
        ActionBarMenuSubItem quoteButton;
        private AnimatorSet quoteSwitcher;
        Rect rect;
        ActionBarMenuSubItem replyAnotherChatButton;
        int scrollToQuoteEndY;
        int scrollToQuoteStartY;
        ChatMessageSharedResources sharedResources;
        boolean shouldScrollToQuote;
        boolean shownBackMenu;
        TextSelectionHelper.ChatListTextSelectionHelper textSelectionHelper;
        View textSelectionOverlay;
        boolean toQuote;
        boolean updateAfterAnimations;
        private boolean updateScroll;
        ToggleButton videoChangeSizeBtn;
        float yOffset;

        public class AnonymousClass10 extends GridLayoutManagerFixed {
            final MessagePreviewView val$this$0;

            public AnonymousClass10(Context context, int i, int i2, boolean z, MessagePreviewView messagePreviewView) {
                super(i, i2, z);
                this.val$this$0 = messagePreviewView;
            }

            public void lambda$onLayoutChildren$0() {
                Page.this.adapter.notifyDataSetChanged();
            }

            @Override
            public boolean hasSiblingChild(int i) {
                byte b;
                MessageObject messageObject = Page.this.messages.previewMessages.get(i);
                MessageObject.GroupedMessages validGroupedMessage = Page.this.getValidGroupedMessage(messageObject);
                if (validGroupedMessage != null) {
                    MessageObject.GroupedMessagePosition position = validGroupedMessage.getPosition(messageObject);
                    if (position.minX != position.maxX && (b = position.minY) == position.maxY && b != 0) {
                        int size = validGroupedMessage.posArray.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition = validGroupedMessage.posArray.get(i2);
                            if (groupedMessagePosition != position) {
                                byte b2 = groupedMessagePosition.minY;
                                byte b3 = position.minY;
                                if (b2 <= b3 && groupedMessagePosition.maxY >= b3) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }

            @Override
            public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    super.onLayoutChildren(recycler, state);
                    return;
                }
                try {
                    super.onLayoutChildren(recycler, state);
                } catch (Exception e) {
                    FileLog.e(e);
                    AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(this, 22));
                }
            }

            @Override
            public boolean shouldLayoutChildFromOpositeSide(View view) {
                return false;
            }
        }

        public class AnonymousClass6 extends RecyclerListView {
            final MessagePreviewView val$this$0;

            public AnonymousClass6(Context context, Theme.ResourcesProvider resourcesProvider, MessagePreviewView messagePreviewView) {
                super(context, resourcesProvider);
                this.val$this$0 = messagePreviewView;
            }

            private void drawChatBackgroundElements(Canvas canvas) {
                boolean z;
                Canvas canvas2;
                float f;
                MessageObject.GroupedMessages currentMessagesGroup;
                MessageObject.GroupedMessages currentMessagesGroup2;
                int childCount = getChildCount();
                ?? r3 = 0;
                MessageObject.GroupedMessages groupedMessages = null;
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if ((childAt instanceof ChatMessageCell) && ((currentMessagesGroup2 = ((ChatMessageCell) childAt).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != groupedMessages)) {
                        groupedMessages = currentMessagesGroup2;
                    }
                }
                int i2 = 0;
                while (i2 < 3) {
                    MessagePreviewView.this.drawingGroups.clear();
                    if (i2 != 2 || Page.this.chatListView.isFastScrollAnimationRunning()) {
                        int i3 = 0;
                        while (true) {
                            z = true;
                            if (i3 >= childCount) {
                                break;
                            }
                            View childAt2 = Page.this.chatListView.getChildAt(i3);
                            if (childAt2 instanceof ChatMessageCell) {
                                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt2;
                                if (childAt2.getY() <= Page.this.chatListView.getHeight() && childAt2.getY() + childAt2.getHeight() >= 0.0f && (currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup()) != null && ((i2 != 0 || currentMessagesGroup.messages.size() != 1) && ((i2 != 1 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i2 != 0 || !chatMessageCell.getMessageObject().deleted) && ((i2 != 1 || chatMessageCell.getMessageObject().deleted) && ((i2 != 2 || chatMessageCell.willRemovedAfterAnimation()) && (i2 == 2 || !chatMessageCell.willRemovedAfterAnimation()))))))) {
                                    if (!MessagePreviewView.this.drawingGroups.contains(currentMessagesGroup)) {
                                        MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                        transitionParams.left = r3;
                                        transitionParams.top = r3;
                                        transitionParams.right = r3;
                                        transitionParams.bottom = r3;
                                        transitionParams.pinnedBotton = r3;
                                        transitionParams.pinnedTop = r3;
                                        transitionParams.cell = chatMessageCell;
                                        MessagePreviewView.this.drawingGroups.add(currentMessagesGroup);
                                    }
                                    currentMessagesGroup.transitionParams.pinnedTop = chatMessageCell.isPinnedTop();
                                    currentMessagesGroup.transitionParams.pinnedBotton = chatMessageCell.isPinnedBottom();
                                    int backgroundDrawableLeft = chatMessageCell.getBackgroundDrawableLeft() + chatMessageCell.getLeft();
                                    int backgroundDrawableRight = chatMessageCell.getBackgroundDrawableRight() + chatMessageCell.getLeft();
                                    int backgroundDrawableTop = chatMessageCell.getBackgroundDrawableTop() + chatMessageCell.getPaddingTop() + chatMessageCell.getTop();
                                    int backgroundDrawableBottom = chatMessageCell.getBackgroundDrawableBottom() + chatMessageCell.getPaddingTop() + chatMessageCell.getTop();
                                    if ((chatMessageCell.getCurrentPosition().flags & 4) == 0) {
                                        backgroundDrawableTop -= AndroidUtilities.dp(10.0f);
                                    }
                                    if ((chatMessageCell.getCurrentPosition().flags & 8) == 0) {
                                        backgroundDrawableBottom += AndroidUtilities.dp(10.0f);
                                    }
                                    if (chatMessageCell.willRemovedAfterAnimation()) {
                                        currentMessagesGroup.transitionParams.cell = chatMessageCell;
                                    }
                                    MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                    int i4 = transitionParams2.top;
                                    if (i4 == 0 || backgroundDrawableTop < i4) {
                                        transitionParams2.top = backgroundDrawableTop;
                                    }
                                    int i5 = transitionParams2.bottom;
                                    if (i5 == 0 || backgroundDrawableBottom > i5) {
                                        transitionParams2.bottom = backgroundDrawableBottom;
                                    }
                                    int i6 = transitionParams2.left;
                                    if (i6 == 0 || backgroundDrawableLeft < i6) {
                                        transitionParams2.left = backgroundDrawableLeft;
                                    }
                                    int i7 = transitionParams2.right;
                                    if (i7 == 0 || backgroundDrawableRight > i7) {
                                        transitionParams2.right = backgroundDrawableRight;
                                    }
                                }
                            }
                            i3++;
                        }
                        int i8 = 0;
                        while (i8 < MessagePreviewView.this.drawingGroups.size()) {
                            MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) MessagePreviewView.this.drawingGroups.get(i8);
                            if (groupedMessages2 != null) {
                                float nonAnimationTranslationX = groupedMessages2.transitionParams.cell.getNonAnimationTranslationX(z);
                                MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                                float f2 = transitionParams3.left + nonAnimationTranslationX + transitionParams3.offsetLeft;
                                float translationY = transitionParams3.top + transitionParams3.offsetTop;
                                float f3 = transitionParams3.right + nonAnimationTranslationX + transitionParams3.offsetRight;
                                float fDp = transitionParams3.bottom + transitionParams3.offsetBottom;
                                if (!transitionParams3.backgroundChangeBounds) {
                                    translationY += transitionParams3.cell.getTranslationY();
                                    fDp += groupedMessages2.transitionParams.cell.getTranslationY();
                                }
                                if (translationY < (-AndroidUtilities.dp(20.0f))) {
                                    translationY = -AndroidUtilities.dp(20.0f);
                                }
                                if (fDp > AndroidUtilities.dp(20.0f) + Page.this.chatListView.getMeasuredHeight()) {
                                    fDp = AndroidUtilities.dp(20.0f) + Page.this.chatListView.getMeasuredHeight();
                                }
                                boolean z2 = (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                                if (z2) {
                                    canvas.save();
                                    canvas2 = canvas;
                                    f = 2.0f;
                                    canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), ImageReceiver$$ExternalSyntheticOutline0.m(f3, f2, 2.0f, f2), ImageReceiver$$ExternalSyntheticOutline0.m(fDp, translationY, 2.0f, translationY));
                                } else {
                                    canvas2 = canvas;
                                    f = 2.0f;
                                }
                                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                                transitionParams4.cell.drawBackground(canvas2, (int) f2, (int) translationY, (int) f3, (int) fDp, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                                MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                                transitionParams5.cell = null;
                                transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                                if (z2) {
                                    canvas.restore();
                                    for (int i9 = 0; i9 < childCount; i9++) {
                                        View childAt3 = Page.this.chatListView.getChildAt(i9);
                                        if (childAt3 instanceof ChatMessageCell) {
                                            ChatMessageCell chatMessageCell2 = (ChatMessageCell) childAt3;
                                            if (chatMessageCell2.getCurrentMessagesGroup() == groupedMessages2) {
                                                int left = chatMessageCell2.getLeft();
                                                int top = chatMessageCell2.getTop();
                                                childAt3.setPivotX(((f3 - f2) / f) + (f2 - left));
                                                childAt3.setPivotY(((fDp - translationY) / f) + (translationY - top));
                                            }
                                        }
                                    }
                                }
                            }
                            i8++;
                            z = true;
                        }
                    }
                    i2++;
                    r3 = 0;
                }
            }

            public void lambda$onLayout$0(int i, int i2) {
                View replyMessageCell = Page.this.getReplyMessageCell();
                if (replyMessageCell == null) {
                    return;
                }
                int top = replyMessageCell.getTop() + i;
                int top2 = replyMessageCell.getTop() + i2;
                int i3 = top2 - top;
                int paddingTop = Page.this.chatListView.getPaddingTop();
                int height = Page.this.chatListView.getHeight() - Page.this.chatListView.getPaddingBottom();
                if (i3 <= height - paddingTop) {
                    top = (top + top2) / 2;
                    paddingTop = (paddingTop + height) / 2;
                }
                int i4 = top - paddingTop;
                if (i4 < 0) {
                    Page.this.chatListView.scrollBy(0, i4);
                }
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                for (int i = 0; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    if (childAt instanceof ChatMessageCell) {
                        ((ChatMessageCell) childAt).setParentViewSize(Page.this.chatPreviewContainer.getMeasuredWidth(), Page.this.chatPreviewContainer.getBackgroundSizeY());
                    }
                }
                drawChatBackgroundElements(canvas);
                super.dispatchDraw(canvas);
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (!(view instanceof ChatMessageCell)) {
                    return super.drawChild(canvas, view, j);
                }
                ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                boolean zDrawChild = super.drawChild(canvas, view, j);
                chatMessageCell.drawCheckBox(canvas);
                canvas.save();
                canvas.translate(chatMessageCell.getX(), chatMessageCell.getY());
                canvas.save();
                canvas.scale(chatMessageCell.getScaleX(), chatMessageCell.getScaleY(), chatMessageCell.getPivotX(), chatMessageCell.getPivotY());
                chatMessageCell.drawContent(canvas, true);
                chatMessageCell.layoutTextXY(true);
                chatMessageCell.drawMessageText(canvas);
                if (chatMessageCell.getCurrentMessagesGroup() == null || ((chatMessageCell.getCurrentPosition() != null && (((chatMessageCell.getCurrentPosition().flags & chatMessageCell.captionFlag()) != 0 && (chatMessageCell.getCurrentPosition().flags & 1) != 0) || (chatMessageCell.getCurrentMessagesGroup() != null && chatMessageCell.getCurrentMessagesGroup().isDocuments))) || chatMessageCell.getTransitionParams().animateBackgroundBoundsInner)) {
                    chatMessageCell.drawCaptionLayout(canvas, false, chatMessageCell.getAlpha());
                    chatMessageCell.drawReactionsLayout(canvas, chatMessageCell.getAlpha(), null);
                    chatMessageCell.drawCommentLayout(canvas, chatMessageCell.getAlpha());
                }
                if (chatMessageCell.getCurrentMessagesGroup() != null || chatMessageCell.getTransitionParams().animateBackgroundBoundsInner) {
                    chatMessageCell.drawNamesLayout(canvas, chatMessageCell.getAlpha());
                }
                if ((chatMessageCell.getCurrentPosition() != null && chatMessageCell.getCurrentPosition().last) || chatMessageCell.getTransitionParams().animateBackgroundBoundsInner) {
                    chatMessageCell.drawTime(canvas, chatMessageCell.getAlpha(), true);
                }
                chatMessageCell.drawOverlays(canvas);
                canvas.restore();
                ChatMessageCell.TransitionParams transitionParams = chatMessageCell.getTransitionParams();
                StaticLayout[] staticLayoutArr = transitionParams.lastDrawnForwardedNameLayout;
                ChatMessageCell chatMessageCell2 = ChatMessageCell.this;
                staticLayoutArr[0] = chatMessageCell2.forwardedNameLayout[0];
                transitionParams.lastDrawnForwardedNameLayout[1] = chatMessageCell2.forwardedNameLayout[1];
                transitionParams.lastDrawnForwardedName = chatMessageCell2.currentMessageObject.needDrawForwarded();
                transitionParams.lastForwardNameX = chatMessageCell2.forwardNameX;
                int i = chatMessageCell2.namesOffset;
                transitionParams.lastForwardedNamesOffset = i;
                transitionParams.lastNamesOffset = i;
                transitionParams.lastForwardNameWidth = chatMessageCell2.forwardedNameWidth;
                canvas.restore();
                return zDrawChild;
            }

            @Override
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                if (Page.this.firstLayout) {
                    if (Page.this.currentTab != 0) {
                        scrollToPosition(0);
                    }
                    Page.this.firstLayout = false;
                }
                super.onLayout(z, i, i2, i3, i4);
                Page.this.updatePositions();
                Page.this.checkScroll();
                Page page = Page.this;
                if (page.shouldScrollToQuote && page.currentTab == 0) {
                    int i5 = page.scrollToQuoteStartY;
                    int i6 = page.scrollToQuoteEndY;
                    page.shouldScrollToQuote = false;
                    post(new MessagePreviewView$Page$6$$ExternalSyntheticLambda0(this, i5, i6));
                }
            }

            @Override
            public void onScrollStateChanged(int i) {
                if (i == 0) {
                    Page.this.textSelectionHelper.stopScrolling();
                }
                super.onScrollStateChanged(i);
            }

            @Override
            public void onScrolled(int i, int i2) {
                super.onScrolled(i, i2);
                Page.this.textSelectionHelper.onParentScrolled();
            }
        }

        public class AnonymousClass7 extends ChatListItemAnimator {
            Runnable finishRunnable;
            int scrollAnimationIndex;
            final MessagePreviewView val$this$0;

            public AnonymousClass7(ChatActivity chatActivity, RecyclerListView recyclerListView, Theme.ResourcesProvider resourcesProvider, MessagePreviewView messagePreviewView) {
                super(chatActivity, recyclerListView, resourcesProvider);
                this.val$this$0 = messagePreviewView;
                this.scrollAnimationIndex = -1;
            }

            public void lambda$endAnimations$2() {
                if (this.scrollAnimationIndex != -1) {
                    NotificationCenter.getInstance(MessagePreviewView.this.currentAccount).onAnimationFinish(this.scrollAnimationIndex);
                    this.scrollAnimationIndex = -1;
                }
            }

            public void lambda$onAllAnimationsDone$0() {
                if (this.scrollAnimationIndex != -1) {
                    NotificationCenter.getInstance(MessagePreviewView.this.currentAccount).onAnimationFinish(this.scrollAnimationIndex);
                    this.scrollAnimationIndex = -1;
                }
            }

            public void lambda$onAllAnimationsDone$1() {
                Page.this.updateMessages();
            }

            @Override
            public void endAnimations() {
                super.endAnimations();
                Runnable runnable = this.finishRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                MessagePreviewView$Page$7$$ExternalSyntheticLambda0 messagePreviewView$Page$7$$ExternalSyntheticLambda0 = new MessagePreviewView$Page$7$$ExternalSyntheticLambda0(this, 2);
                this.finishRunnable = messagePreviewView$Page$7$$ExternalSyntheticLambda0;
                AndroidUtilities.runOnUIThread(messagePreviewView$Page$7$$ExternalSyntheticLambda0);
            }

            @Override
            public void onAllAnimationsDone() {
                super.onAllAnimationsDone();
                Runnable runnable = this.finishRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                MessagePreviewView$Page$7$$ExternalSyntheticLambda0 messagePreviewView$Page$7$$ExternalSyntheticLambda0 = new MessagePreviewView$Page$7$$ExternalSyntheticLambda0(this, 0);
                this.finishRunnable = messagePreviewView$Page$7$$ExternalSyntheticLambda0;
                AndroidUtilities.runOnUIThread(messagePreviewView$Page$7$$ExternalSyntheticLambda0);
                Page page = Page.this;
                if (page.updateAfterAnimations) {
                    page.updateAfterAnimations = false;
                    AndroidUtilities.runOnUIThread(new MessagePreviewView$Page$7$$ExternalSyntheticLambda0(this, 1));
                }
            }

            @Override
            public void onAnimationStart() {
                AndroidUtilities.cancelRunOnUIThread(MessagePreviewView.this.changeBoundsRunnable);
                MessagePreviewView.this.changeBoundsRunnable.run();
                if (this.scrollAnimationIndex == -1) {
                    this.scrollAnimationIndex = NotificationCenter.getInstance(MessagePreviewView.this.currentAccount).setAnimationInProgress(this.scrollAnimationIndex, null, false);
                }
                Runnable runnable = this.finishRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.finishRunnable = null;
                }
            }
        }

        public class Adapter extends RecyclerView.Adapter {
            private Adapter() {
            }

            private int offset(ChatMessageCell chatMessageCell, int i) {
                return offset(chatMessageCell, i, false);
            }

            @Override
            public int getItemCount() {
                MessagePreviewParams.Messages messages = Page.this.messages;
                if (messages == null) {
                    return 0;
                }
                return messages.previewMessages.size();
            }

            @Override
            public int getItemViewType(int i) {
                return 0;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (Page.this.messages != null && viewHolder.getItemViewType() == 0) {
                    ChatMessageCell chatMessageCell = (ChatMessageCell) viewHolder.itemView;
                    chatMessageCell.setInvalidateSpoilersParent(Page.this.messages.hasSpoilers);
                    chatMessageCell.setParentViewSize(Page.this.chatListView.getMeasuredWidth(), Page.this.chatListView.getMeasuredHeight());
                    int id = chatMessageCell.getMessageObject() != null ? chatMessageCell.getMessageObject().getId() : 0;
                    Page page = Page.this;
                    if (page.currentTab == 2) {
                        MessagePreviewView.this.messagePreviewParams.checkCurrentLink(page.messages.previewMessages.get(i));
                    }
                    MessageObject messageObject = Page.this.messages.previewMessages.get(i);
                    MessagePreviewParams.Messages messages = Page.this.messages;
                    chatMessageCell.setMessageObject(messageObject, messages.groupedMessagesMap.get(messages.previewMessages.get(i).getGroupId()), true, true, false);
                    if (Page.this.currentTab == 1) {
                        chatMessageCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
                            @Override
                            public boolean allowAddPollOptions() {
                                return false;
                            }

                            @Override
                            public boolean canDrawOutboundsContent() {
                                return true;
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
                            public boolean canSaveRichDocument(ChatMessageCell chatMessageCell2) {
                                return false;
                            }

                            @Override
                            public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2) {
                                return false;
                            }

                            @Override
                            public void didLongPress(ChatMessageCell chatMessageCell2, float f, float f2) {
                            }

                            @Override
                            public void didLongPressBotButton(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                            }

                            @Override
                            public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i2, float f, float f2) {
                                return false;
                            }

                            @Override
                            public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                            }

                            @Override
                            public boolean didLongPressPollOption(ChatMessageCell chatMessageCell2, TLRPC.PollAnswer pollAnswer) {
                                return false;
                            }

                            @Override
                            public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem) {
                                return false;
                            }

                            @Override
                            public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user, float f, float f2) {
                                return false;
                            }

                            @Override
                            public void didPressAboutRevenueSharingAds() {
                            }

                            @Override
                            public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell2) {
                            }

                            @Override
                            public void didPressAdmin(ChatMessageCell chatMessageCell2) {
                            }

                            @Override
                            public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell2, AnimatedEmojiSpan animatedEmojiSpan) {
                                return false;
                            }

                            @Override
                            public void didPressAppUpdateButton() {
                            }

                            @Override
                            public void didPressBoostCounter(ChatMessageCell chatMessageCell2) {
                            }

                            @Override
                            public void didPressBotButton(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                            }

                            @Override
                            public void didPressCancelSendButton(ChatMessageCell chatMessageCell2) {
                            }

                            @Override
                            public void didPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i2, float f, float f2, boolean z) {
                            }

                            @Override
                            public void didPressChannelRecommendation(ChatMessageCell chatMessageCell2, TLObject tLObject, boolean z) {
                            }

                            @Override
                            public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell2) {
                            }

                            @Override
                            public void didPressCodeCopy(ChatMessageCell chatMessageCell2, MessageObject.TextLayoutBlock textLayoutBlock) {
                            }

                            @Override
                            public void didPressCommentButton(ChatMessageCell chatMessageCell2) {
                            }

                            @Override
                            public void didPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                            }

                            public void didPressDialogButton(ChatMessageCell chatMessageCell2) {
                            }

                            @Override
                            public void didPressEffect(ChatMessageCell chatMessageCell2) {
                            }

                            public void didPressEmojiStatus() {
                            }

                            @Override
                            public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                            }

                            @Override
                            public void didPressFactCheck(ChatMessageCell chatMessageCell2) {
                            }

                            @Override
                            public void didPressFactCheckWhat(ChatMessageCell chatMessageCell2, int i2, int i3) {
                            }

                            @Override
                            public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell2, int i2) {
                            }

                            @Override
                            public void didPressGroupImage(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                            }

                            @Override
                            public void didPressHiddenForward(ChatMessageCell chatMessageCell2) {
                            }

                            @Override
                            public void didPressHint(ChatMessageCell chatMessageCell2, int i2) {
                            }

                            @Override
                            public void didPressImage(ChatMessageCell chatMessageCell2, float f, float f2, boolean z) {
                            }

                            @Override
                            public void didPressInstantButton(ChatMessageCell chatMessageCell2, int i2) {
                            }

                            @Override
                            public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell2) {
                            }

                            @Override
                            public void didPressOther(ChatMessageCell chatMessageCell2, float f, float f2) {
                            }

                            @Override
                            public void didPressPollMedia(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i2) {
                            }

                            @Override
                            public void didPressReaction(ChatMessageCell chatMessageCell2, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                            }

                            @Override
                            public void didPressReplyMessage(ChatMessageCell chatMessageCell2, int i2, float f, float f2, boolean z) {
                            }

                            @Override
                            public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell2) {
                            }

                            @Override
                            public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell2, TLRPC.Document document, float f, float f2) {
                            }

                            @Override
                            public void didPressShowMore(ChatMessageCell chatMessageCell2) {
                            }

                            @Override
                            public void didPressSideButton(ChatMessageCell chatMessageCell2) {
                            }

                            @Override
                            public void didPressSponsoredClose(ChatMessageCell chatMessageCell2) {
                            }

                            @Override
                            public void didPressSponsoredInfo(ChatMessageCell chatMessageCell2, float f, float f2) {
                            }

                            @Override
                            public void didPressSummarize(ChatMessageCell chatMessageCell2, boolean z) {
                            }

                            @Override
                            public void didPressTime(ChatMessageCell chatMessageCell2) {
                            }

                            @Override
                            public boolean didPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem, boolean z) {
                                return false;
                            }

                            public void didPressTopicButton(ChatMessageCell chatMessageCell2) {
                            }

                            @Override
                            public void didPressUrl(ChatMessageCell chatMessageCell2, CharacterStyle characterStyle, boolean z) {
                            }

                            @Override
                            public void didPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user, float f, float f2, boolean z) {
                            }

                            @Override
                            public void didPressUserStatus(ChatMessageCell chatMessageCell2, TLRPC.User user, TLRPC.Document document, String str) {
                            }

                            @Override
                            public void didPressViaBot(ChatMessageCell chatMessageCell2, String str) {
                            }

                            @Override
                            public void didPressViaBotNotInline(ChatMessageCell chatMessageCell2, long j) {
                            }

                            @Override
                            public void didPressVoteButtons(ChatMessageCell chatMessageCell2, ArrayList arrayList, int i2, int i3, int i4) {
                            }

                            @Override
                            public void didPressWebPage(ChatMessageCell chatMessageCell2, TLRPC.WebPage webPage, String str, boolean z) {
                                Browser.openUrl(chatMessageCell2.getContext(), str);
                            }

                            @Override
                            public void didQuickShareEnd(ChatMessageCell chatMessageCell2, float f, float f2) {
                            }

                            @Override
                            public void didQuickShareMove(ChatMessageCell chatMessageCell2, float f, float f2) {
                            }

                            @Override
                            public void didQuickShareStart(ChatMessageCell chatMessageCell2, float f, float f2) {
                            }

                            @Override
                            public void didStartVideoStream(MessageObject messageObject2) {
                            }

                            @Override
                            public void didTogglePollPreview(ChatMessageCell chatMessageCell2) {
                            }

                            @Override
                            public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2, boolean z, Runnable runnable) {
                            }

                            @Override
                            public boolean doNotShowLoadingReply(MessageObject messageObject2) {
                                return Theme.ResourcesProvider.CC.$default$doNotShowLoadingReply(messageObject2);
                            }

                            @Override
                            public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell2) {
                            }

                            public boolean drawingVideoPlayerContainer() {
                                return false;
                            }

                            @Override
                            public void forceUpdate(ChatMessageCell chatMessageCell2, boolean z) {
                            }

                            @Override
                            public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell2, boolean z) {
                            }

                            @Override
                            public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell2) {
                                return 0;
                            }

                            @Override
                            public String getAdminRank(long j) {
                                return null;
                            }

                            @Override
                            public int getChatMode() {
                                return 0;
                            }

                            @Override
                            public ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                                return null;
                            }

                            @Override
                            public PinchToZoomHelper getPinchToZoomHelper() {
                                return null;
                            }

                            @Override
                            public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell2) {
                                return null;
                            }

                            @Override
                            public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell2) {
                                return null;
                            }

                            @Override
                            public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                                return null;
                            }

                            @Override
                            public boolean hasSelectedMessages() {
                                return false;
                            }

                            @Override
                            public void invalidateBlur() {
                            }

                            @Override
                            public boolean isAdmin(long j) {
                                return false;
                            }

                            @Override
                            public boolean isLandscape() {
                                return false;
                            }

                            @Override
                            public boolean isOwner(long j) {
                                return false;
                            }

                            @Override
                            public boolean isProgressLoading(ChatMessageCell chatMessageCell2, int i2) {
                                return false;
                            }

                            @Override
                            public boolean isReplyOrSelf() {
                                return false;
                            }

                            @Override
                            public boolean keyboardIsOpened() {
                                return false;
                            }

                            @Override
                            public void needOpenWebView(MessageObject messageObject2, String str, String str2, String str3, String str4, int i2, int i3) {
                            }

                            @Override
                            public boolean needPlayMessage(ChatMessageCell chatMessageCell2, MessageObject messageObject2, boolean z) {
                                return false;
                            }

                            @Override
                            public void needReloadPolls() {
                            }

                            @Override
                            public void needShowPremiumBulletin(int i2) {
                            }

                            public void needShowPremiumFeatures(String str) {
                            }

                            @Override
                            public boolean onAccessibilityAction(int i2, Bundle bundle) {
                                return false;
                            }

                            @Override
                            public void onDiceFinished() {
                            }

                            @Override
                            public boolean openArticlePhoto(ChatMessageCell chatMessageCell2, TL_iv.PageBlock pageBlock) {
                                return false;
                            }

                            @Override
                            public void setShouldNotRepeatSticker(MessageObject messageObject2) {
                            }

                            @Override
                            public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell2, boolean z) {
                                return false;
                            }

                            @Override
                            public boolean shouldRepeatSticker(MessageObject messageObject2) {
                                return true;
                            }

                            public boolean shouldShowDialogButton(ChatMessageCell chatMessageCell2) {
                                return false;
                            }

                            public boolean shouldShowTopicButton(ChatMessageCell chatMessageCell2) {
                                return false;
                            }

                            @Override
                            public void videoTimerReached() {
                            }

                            @Override
                            public void forceUpdate(ChatMessageCell chatMessageCell2, boolean z, boolean z2) {
                                forceUpdate(chatMessageCell2, z);
                            }
                        });
                    }
                    if (Page.this.messages.previewMessages.size() > 1) {
                        chatMessageCell.setCheckBoxVisible(Page.this.currentTab == 1, false);
                        boolean z = id == Page.this.messages.previewMessages.get(i).getId();
                        MessagePreviewParams.Messages messages2 = Page.this.messages;
                        boolean z2 = messages2.selectedIds.get(messages2.previewMessages.get(i).getId(), false);
                        chatMessageCell.setChecked(z2, z2, z);
                    }
                }
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                Context context = viewGroup.getContext();
                int i2 = MessagePreviewView.this.currentAccount;
                Page page = Page.this;
                ChatMessageCell chatMessageCell = new ChatMessageCell(context, i2, false, page.sharedResources, MessagePreviewView.this.resourcesProvider) {
                    @Override
                    public void invalidate() {
                        super.invalidate();
                        Page.this.chatListView.invalidate();
                    }

                    @Override
                    public void onFactorChangeFinished(int i3, float f, FactorAnimator factorAnimator) {
                    }

                    @Override
                    public void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                        super.onLayout(z, i3, i4, i5, i6);
                        Page.this.updateLinkHighlight(this);
                    }

                    @Override
                    public void setMessageObject(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z, boolean z2, boolean z3, boolean z4) {
                        super.setMessageObject(messageObject, groupedMessages, z, z2, z3, z4);
                        Page.this.updateLinkHighlight(this);
                    }

                    @Override
                    public void invalidate(int i3, int i4, int i5, int i6) {
                        super.invalidate(i3, i4, i5, i6);
                        Page.this.chatListView.invalidate();
                    }
                };
                chatMessageCell.setClipChildren(false);
                chatMessageCell.setClipToPadding(false);
                chatMessageCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
                    @Override
                    public boolean allowAddPollOptions() {
                        return false;
                    }

                    @Override
                    public boolean canDrawOutboundsContent() {
                        return true;
                    }

                    @Override
                    public boolean canPerformActions() {
                        Page page2 = Page.this;
                        if (page2.currentTab != 2) {
                            return false;
                        }
                        MessagePreviewParams messagePreviewParams = MessagePreviewView.this.messagePreviewParams;
                        return (messagePreviewParams.singleLink || messagePreviewParams.isSecret) ? false : true;
                    }

                    @Override
                    public boolean canPerformReply() {
                        return canPerformActions();
                    }

                    @Override
                    public boolean canSaveRichDocument(ChatMessageCell chatMessageCell2) {
                        return false;
                    }

                    @Override
                    public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2) {
                        return false;
                    }

                    @Override
                    public void didLongPress(ChatMessageCell chatMessageCell2, float f, float f2) {
                    }

                    @Override
                    public void didLongPressBotButton(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                    }

                    @Override
                    public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i3, float f, float f2) {
                        return false;
                    }

                    @Override
                    public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    }

                    @Override
                    public boolean didLongPressPollOption(ChatMessageCell chatMessageCell2, TLRPC.PollAnswer pollAnswer) {
                        return false;
                    }

                    @Override
                    public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem) {
                        return false;
                    }

                    @Override
                    public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user, float f, float f2) {
                        return false;
                    }

                    @Override
                    public void didPressAboutRevenueSharingAds() {
                    }

                    @Override
                    public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public void didPressAdmin(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell2, AnimatedEmojiSpan animatedEmojiSpan) {
                        return false;
                    }

                    @Override
                    public void didPressAppUpdateButton() {
                    }

                    @Override
                    public void didPressBoostCounter(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public void didPressBotButton(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                    }

                    @Override
                    public void didPressCancelSendButton(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public void didPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i3, float f, float f2, boolean z) {
                    }

                    @Override
                    public void didPressChannelRecommendation(ChatMessageCell chatMessageCell2, TLObject tLObject, boolean z) {
                    }

                    @Override
                    public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public void didPressCodeCopy(ChatMessageCell chatMessageCell2, MessageObject.TextLayoutBlock textLayoutBlock) {
                    }

                    @Override
                    public void didPressCommentButton(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public void didPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    }

                    public void didPressDialogButton(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public void didPressEffect(ChatMessageCell chatMessageCell2) {
                    }

                    public void didPressEmojiStatus() {
                    }

                    @Override
                    public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                    }

                    @Override
                    public void didPressFactCheck(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public void didPressFactCheckWhat(ChatMessageCell chatMessageCell2, int i3, int i4) {
                    }

                    @Override
                    public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell2, int i3) {
                    }

                    @Override
                    public void didPressGroupImage(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                    }

                    @Override
                    public void didPressHiddenForward(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public void didPressHint(ChatMessageCell chatMessageCell2, int i3) {
                    }

                    @Override
                    public void didPressImage(ChatMessageCell chatMessageCell2, float f, float f2, boolean z) {
                    }

                    @Override
                    public void didPressInstantButton(ChatMessageCell chatMessageCell2, int i3) {
                    }

                    @Override
                    public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public void didPressOther(ChatMessageCell chatMessageCell2, float f, float f2) {
                    }

                    @Override
                    public void didPressPollMedia(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i3) {
                    }

                    @Override
                    public void didPressReaction(ChatMessageCell chatMessageCell2, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                    }

                    @Override
                    public void didPressReplyMessage(ChatMessageCell chatMessageCell2, int i3, float f, float f2, boolean z) {
                    }

                    @Override
                    public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell2, TLRPC.Document document, float f, float f2) {
                    }

                    @Override
                    public void didPressShowMore(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public void didPressSideButton(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public void didPressSponsoredClose(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public void didPressSponsoredInfo(ChatMessageCell chatMessageCell2, float f, float f2) {
                    }

                    @Override
                    public void didPressSummarize(ChatMessageCell chatMessageCell2, boolean z) {
                    }

                    @Override
                    public void didPressTime(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public boolean didPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem, boolean z) {
                        return false;
                    }

                    public void didPressTopicButton(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public void didPressUrl(ChatMessageCell chatMessageCell2, CharacterStyle characterStyle, boolean z) {
                        Page page2 = Page.this;
                        if (page2.currentTab != 2 || MessagePreviewView.this.messagePreviewParams.currentLink == characterStyle || chatMessageCell2.getMessageObject() == null || !(characterStyle instanceof URLSpan)) {
                            return;
                        }
                        String url = ((URLSpan) characterStyle).getURL();
                        MessagePreviewView messagePreviewView = MessagePreviewView.this;
                        MessagePreviewParams messagePreviewParams = messagePreviewView.messagePreviewParams;
                        messagePreviewParams.currentLink = characterStyle;
                        messagePreviewParams.webpage = null;
                        ChatActivity chatActivity = messagePreviewView.chatActivity;
                        if (chatActivity != null && url != null) {
                            chatActivity.searchLinks(url, true);
                        }
                        Page.this.updateLinkHighlight(chatMessageCell2);
                    }

                    @Override
                    public void didPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user, float f, float f2, boolean z) {
                    }

                    @Override
                    public void didPressUserStatus(ChatMessageCell chatMessageCell2, TLRPC.User user, TLRPC.Document document, String str) {
                    }

                    @Override
                    public void didPressViaBot(ChatMessageCell chatMessageCell2, String str) {
                    }

                    @Override
                    public void didPressViaBotNotInline(ChatMessageCell chatMessageCell2, long j) {
                    }

                    @Override
                    public void didPressVoteButtons(ChatMessageCell chatMessageCell2, ArrayList arrayList, int i3, int i4, int i5) {
                    }

                    @Override
                    public void didPressWebPage(ChatMessageCell chatMessageCell2, TLRPC.WebPage webPage, String str, boolean z) {
                        Browser.openUrl(chatMessageCell2.getContext(), str);
                    }

                    @Override
                    public void didQuickShareEnd(ChatMessageCell chatMessageCell2, float f, float f2) {
                    }

                    @Override
                    public void didQuickShareMove(ChatMessageCell chatMessageCell2, float f, float f2) {
                    }

                    @Override
                    public void didQuickShareStart(ChatMessageCell chatMessageCell2, float f, float f2) {
                    }

                    @Override
                    public void didStartVideoStream(MessageObject messageObject) {
                    }

                    @Override
                    public void didTogglePollPreview(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2, boolean z, Runnable runnable) {
                    }

                    @Override
                    public boolean doNotShowLoadingReply(MessageObject messageObject) {
                        return Theme.ResourcesProvider.CC.$default$doNotShowLoadingReply(messageObject);
                    }

                    @Override
                    public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell2) {
                    }

                    public boolean drawingVideoPlayerContainer() {
                        return false;
                    }

                    @Override
                    public void forceUpdate(ChatMessageCell chatMessageCell2, boolean z) {
                    }

                    @Override
                    public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell2, boolean z) {
                    }

                    @Override
                    public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell2) {
                        return 0;
                    }

                    @Override
                    public String getAdminRank(long j) {
                        return null;
                    }

                    @Override
                    public int getChatMode() {
                        return 0;
                    }

                    @Override
                    public ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                        return null;
                    }

                    @Override
                    public PinchToZoomHelper getPinchToZoomHelper() {
                        return null;
                    }

                    @Override
                    public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell2) {
                        return null;
                    }

                    @Override
                    public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell2) {
                        Page page2 = Page.this;
                        if (page2.currentTab != 2) {
                            return null;
                        }
                        MessagePreviewParams messagePreviewParams = MessagePreviewView.this.messagePreviewParams;
                        if (messagePreviewParams.singleLink) {
                            return null;
                        }
                        return messagePreviewParams.currentLink;
                    }

                    @Override
                    public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                        return Page.this.textSelectionHelper;
                    }

                    @Override
                    public boolean hasSelectedMessages() {
                        return true;
                    }

                    @Override
                    public void invalidateBlur() {
                    }

                    @Override
                    public boolean isAdmin(long j) {
                        return false;
                    }

                    @Override
                    public boolean isLandscape() {
                        return false;
                    }

                    @Override
                    public boolean isOwner(long j) {
                        return false;
                    }

                    @Override
                    public boolean isProgressLoading(ChatMessageCell chatMessageCell2, int i3) {
                        Page page2 = Page.this;
                        if (page2.currentTab == 2 && i3 == 1) {
                            MessagePreviewParams messagePreviewParams = MessagePreviewView.this.messagePreviewParams;
                            if (!messagePreviewParams.singleLink) {
                                TLRPC.WebPage webPage = messagePreviewParams.webpage;
                                return webPage == null || (webPage instanceof TLRPC.TL_webPagePending);
                            }
                        }
                        return false;
                    }

                    @Override
                    public boolean isReplyOrSelf() {
                        return false;
                    }

                    @Override
                    public boolean keyboardIsOpened() {
                        return false;
                    }

                    @Override
                    public void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i3, int i4) {
                    }

                    @Override
                    public boolean needPlayMessage(ChatMessageCell chatMessageCell2, MessageObject messageObject, boolean z) {
                        return false;
                    }

                    @Override
                    public void needReloadPolls() {
                    }

                    @Override
                    public void needShowPremiumBulletin(int i3) {
                    }

                    public void needShowPremiumFeatures(String str) {
                    }

                    @Override
                    public boolean onAccessibilityAction(int i3, Bundle bundle) {
                        return false;
                    }

                    @Override
                    public void onDiceFinished() {
                    }

                    @Override
                    public boolean openArticlePhoto(ChatMessageCell chatMessageCell2, TL_iv.PageBlock pageBlock) {
                        return false;
                    }

                    @Override
                    public void setShouldNotRepeatSticker(MessageObject messageObject) {
                    }

                    @Override
                    public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell2, boolean z) {
                        return false;
                    }

                    @Override
                    public boolean shouldRepeatSticker(MessageObject messageObject) {
                        return true;
                    }

                    public boolean shouldShowDialogButton(ChatMessageCell chatMessageCell2) {
                        return false;
                    }

                    public boolean shouldShowTopicButton(ChatMessageCell chatMessageCell2) {
                        return false;
                    }

                    @Override
                    public void videoTimerReached() {
                    }

                    @Override
                    public void forceUpdate(ChatMessageCell chatMessageCell2, boolean z, boolean z2) {
                        forceUpdate(chatMessageCell2, z);
                    }
                });
                return new RecyclerListView.Holder(chatMessageCell);
            }

            @Override
            public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                int i;
                Page page = Page.this;
                if (page.messages == null || (i = page.currentTab) == 1) {
                    return;
                }
                View view = viewHolder.itemView;
                if (view instanceof ChatMessageCell) {
                    ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                    if (i != 0) {
                        chatMessageCell.setDrawSelectionBackground(false);
                        return;
                    }
                    MessageObject.GroupedMessages validGroupedMessage = page.getValidGroupedMessage(chatMessageCell.getMessageObject());
                    chatMessageCell.setDrawSelectionBackground(validGroupedMessage == null);
                    chatMessageCell.setChecked(true, validGroupedMessage == null, false);
                    Page page2 = Page.this;
                    MessagePreviewParams messagePreviewParams = MessagePreviewView.this.messagePreviewParams;
                    if (messagePreviewParams.isSecret || messagePreviewParams.quote == null || !page2.isReplyMessageCell(chatMessageCell) || Page.this.textSelectionHelper.isInSelectionMode()) {
                        return;
                    }
                    Page page3 = Page.this;
                    TextSelectionHelper.ChatListTextSelectionHelper chatListTextSelectionHelper = page3.textSelectionHelper;
                    MessagePreviewParams messagePreviewParams2 = MessagePreviewView.this.messagePreviewParams;
                    chatListTextSelectionHelper.select(chatMessageCell, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                    if (Page.this.firstAttach) {
                        Page page4 = Page.this;
                        page4.scrollToQuoteStartY = offset(chatMessageCell, MessagePreviewView.this.messagePreviewParams.quoteStart, false);
                        Page page5 = Page.this;
                        page5.scrollToQuoteEndY = offset(chatMessageCell, MessagePreviewView.this.messagePreviewParams.quoteEnd, true);
                        Page page6 = Page.this;
                        page6.shouldScrollToQuote = true;
                        page6.firstAttach = false;
                    }
                }
            }

            private int offset(ChatMessageCell chatMessageCell, int i, boolean z) {
                MessageObject messageObject;
                int iM;
                ArrayList<MessageObject.TextLayoutBlock> arrayList;
                CharSequence charSequence;
                float fTextYOffset;
                MessageObject.TextLayoutBlocks textLayoutBlocks;
                if (chatMessageCell == null || (messageObject = chatMessageCell.getMessageObject()) == null || messageObject.getGroupId() != 0) {
                    return 0;
                }
                if (TextUtils.isEmpty(messageObject.caption) || (textLayoutBlocks = chatMessageCell.captionLayout) == null) {
                    chatMessageCell.layoutTextXY(true);
                    iM = chatMessageCell.textY;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    if (chatMessageCell.linkPreviewAbove) {
                        iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(10.0f, chatMessageCell.linkPreviewHeight, iM);
                    }
                    arrayList = arrayList2;
                    charSequence = charSequence2;
                } else {
                    iM = (int) chatMessageCell.captionY;
                    charSequence = messageObject.caption;
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                }
                if (arrayList != null && charSequence != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i2);
                        StaticLayout staticLayout = textLayoutBlock.textLayout;
                        String string = staticLayout.getText().toString();
                        int i3 = textLayoutBlock.charactersOffset;
                        if (i > i3) {
                            if (i - i3 > string.length() - 1) {
                                fTextYOffset = iM + ((int) (textLayoutBlock.textYOffset(arrayList, chatMessageCell.transitionParams) + textLayoutBlock.padTop + textLayoutBlock.height));
                            } else {
                                int lineForOffset = staticLayout.getLineForOffset(i - textLayoutBlock.charactersOffset);
                                fTextYOffset = textLayoutBlock.textYOffset(arrayList, chatMessageCell.transitionParams) + iM + textLayoutBlock.padTop + (z ? staticLayout.getLineBottom(lineForOffset) : staticLayout.getLineTop(lineForOffset));
                            }
                            return (int) fTextYOffset;
                        }
                    }
                }
                return 0;
            }
        }

        public Page(final Context context, int i) {
            final Page page;
            float f;
            MessagePreviewView messagePreviewView;
            Context context2;
            boolean z;
            ToggleButton toggleButton;
            ToggleButton toggleButton2;
            MessagePreviewParams messagePreviewParams;
            MessagePreviewParams.Messages messages;
            MessagePreviewView messagePreviewView2;
            int i2;
            int i3;
            float f2;
            ViewGroup viewGroup;
            super(context);
            this.firstLayout = true;
            this.scrollToQuoteStartY = -1;
            this.scrollToQuoteEndY = -1;
            this.shouldScrollToQuote = false;
            this.rect = new Rect();
            this.updateScroll = false;
            this.firstAttach = true;
            this.sharedResources = new ChatMessageSharedResources(context);
            this.currentTab = i;
            setOnTouchListener(new ItemOptions$$ExternalSyntheticLambda1(this, 1));
            SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
                @Override
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getY() < Page.this.currentTopOffset) {
                        return false;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }

                @Override
                public Drawable getNewDrawable() {
                    Drawable wallpaperDrawable = MessagePreviewView.this.resourcesProvider.getWallpaperDrawable();
                    return wallpaperDrawable != null ? wallpaperDrawable : super.getNewDrawable();
                }
            };
            this.chatPreviewContainer = sizeNotifierFrameLayout;
            sizeNotifierFrameLayout.setBackgroundImage(MessagePreviewView.this.resourcesProvider.getWallpaperDrawable(), MessagePreviewView.this.resourcesProvider.isWallpaperMotion());
            this.chatPreviewContainer.setOccupyStatusBar(false);
            this.chatPreviewContainer.setOutlineProvider(new ViewOutlineProvider() {
                @Override
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, Page.this.currentTopOffset + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
                }
            });
            this.chatPreviewContainer.setClipToOutline(true);
            this.chatPreviewContainer.setElevation(AndroidUtilities.dp(4.0f));
            ActionBar actionBar = MessagePreviewView.this.new ActionBar(context, MessagePreviewView.this.resourcesProvider);
            this.actionBar = actionBar;
            actionBar.setBackgroundColor(MessagePreviewView.this.getThemedColor(Theme.key_actionBarDefault));
            TextSelectionHelper.ChatListTextSelectionHelper chatListTextSelectionHelper = new TextSelectionHelper.ChatListTextSelectionHelper() {
                {
                    this.resourcesProvider = MessagePreviewView.this.resourcesProvider;
                }

                @Override
                public boolean canCopy() {
                    if (Page.this.isReplyToRichMessage()) {
                        return false;
                    }
                    MessagePreviewParams messagePreviewParams2 = MessagePreviewView.this.messagePreviewParams;
                    return messagePreviewParams2 == null || !messagePreviewParams2.noforwards;
                }

                @Override
                public boolean canShowQuote() {
                    Page page2 = Page.this;
                    return (page2.currentTab != 0 || MessagePreviewView.this.messagePreviewParams.isSecret || page2.isReplyToRichMessage()) ? false : true;
                }

                @Override
                public Theme.ResourcesProvider getResourcesProvider() {
                    return this.resourcesProvider;
                }

                @Override
                public void invalidate() {
                    super.invalidate();
                    RecyclerListView recyclerListView = Page.this.chatListView;
                    if (recyclerListView != null) {
                        recyclerListView.invalidate();
                    }
                }

                @Override
                public boolean isSelected(MessageObject messageObject) {
                    Page page2 = Page.this;
                    return page2.currentTab == 0 && !MessagePreviewView.this.messagePreviewParams.isSecret && isInSelectionMode();
                }

                @Override
                public void onQuoteClick(MessageObject messageObject, int i4, int i5, CharSequence charSequence) {
                    ChatActivity.ReplyQuote replyQuote;
                    MessageObject messageObject2;
                    Page page2 = Page.this;
                    TextSelectionHelper.ChatListTextSelectionHelper chatListTextSelectionHelper2 = page2.textSelectionHelper;
                    if (chatListTextSelectionHelper2.selectionEnd - chatListTextSelectionHelper2.selectionStart > MessagesController.getInstance(MessagePreviewView.this.currentAccount).quoteLengthMax) {
                        Page.this.showQuoteLengthError();
                        return;
                    }
                    Page page3 = Page.this;
                    MessagePreviewParams messagePreviewParams2 = MessagePreviewView.this.messagePreviewParams;
                    TextSelectionHelper.ChatListTextSelectionHelper chatListTextSelectionHelper3 = page3.textSelectionHelper;
                    messagePreviewParams2.quoteStart = chatListTextSelectionHelper3.selectionStart;
                    messagePreviewParams2.quoteEnd = chatListTextSelectionHelper3.selectionEnd;
                    MessageObject replyMessage = page3.getReplyMessage(messageObject);
                    if (replyMessage != null && ((replyQuote = MessagePreviewView.this.messagePreviewParams.quote) == null || (messageObject2 = replyQuote.message) == null || messageObject2.getId() != replyMessage.getId())) {
                        MessagePreviewView.this.messagePreviewParams.quote = ChatActivity.ReplyQuote.from(replyMessage, i4, i5);
                    }
                    MessagePreviewView.this.onQuoteSelectedPart();
                    MessagePreviewView.this.dismiss(true);
                }
            };
            this.textSelectionHelper = chatListTextSelectionHelper;
            chatListTextSelectionHelper.setCallback(new TextSelectionHelper.Callback() {
                @Override
                public void onStateChanged(boolean z2) {
                    Page page2 = Page.this;
                    if (MessagePreviewView.this.showing) {
                        if (!z2 && page2.menu.getSwipeBack().isForegroundOpen()) {
                            Page.this.menu.getSwipeBack().closeForeground(true);
                            return;
                        }
                        if (z2) {
                            Page page3 = Page.this;
                            TextSelectionHelper.ChatListTextSelectionHelper chatListTextSelectionHelper2 = page3.textSelectionHelper;
                            if (chatListTextSelectionHelper2.selectionEnd - chatListTextSelectionHelper2.selectionStart > MessagesController.getInstance(MessagePreviewView.this.currentAccount).quoteLengthMax) {
                                Page.this.showQuoteLengthError();
                                return;
                            }
                            MessageObject replyMessage = Page.this.getReplyMessage(Page.this.textSelectionHelper.getSelectedCell() != null ? ((ChatMessageCell) Page.this.textSelectionHelper.getSelectedCell()).getMessageObject() : null);
                            Page page4 = Page.this;
                            MessagePreviewParams messagePreviewParams2 = MessagePreviewView.this.messagePreviewParams;
                            if (messagePreviewParams2.quote == null) {
                                TextSelectionHelper.ChatListTextSelectionHelper chatListTextSelectionHelper3 = page4.textSelectionHelper;
                                int i4 = chatListTextSelectionHelper3.selectionStart;
                                messagePreviewParams2.quoteStart = i4;
                                int i5 = chatListTextSelectionHelper3.selectionEnd;
                                messagePreviewParams2.quoteEnd = i5;
                                messagePreviewParams2.quote = ChatActivity.ReplyQuote.from(replyMessage, i4, i5);
                                Page.this.menu.getSwipeBack().openForeground(Page.this.menuBack);
                            }
                        }
                    }
                }
            });
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(context, MessagePreviewView.this.resourcesProvider, MessagePreviewView.this);
            this.chatListView = anonymousClass6;
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(null, this.chatListView, MessagePreviewView.this.resourcesProvider, MessagePreviewView.this);
            this.itemAnimator = anonymousClass7;
            anonymousClass6.lambda$onCellEnter$52(anonymousClass7);
            this.chatListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                    super.onScrolled(recyclerView, i4, i5);
                    for (int i6 = 0; i6 < Page.this.chatListView.getChildCount(); i6++) {
                        View childAt = Page.this.chatListView.getChildAt(i6);
                        if (childAt instanceof ChatMessageCell) {
                            ((ChatMessageCell) childAt).setParentViewSize(Page.this.chatPreviewContainer.getMeasuredWidth(), Page.this.chatPreviewContainer.getBackgroundSizeY());
                        }
                    }
                    TextSelectionHelper.ChatListTextSelectionHelper chatListTextSelectionHelper2 = Page.this.textSelectionHelper;
                    if (chatListTextSelectionHelper2 != null) {
                        chatListTextSelectionHelper2.invalidate();
                    }
                }
            });
            this.chatListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public void onItemClick(View view, int i4) {
                    Page page2 = Page.this;
                    if (page2.currentTab != 1 || page2.messages.previewMessages.size() <= 1) {
                        return;
                    }
                    int id = Page.this.messages.previewMessages.get(i4).getId();
                    boolean z2 = Page.this.messages.selectedIds.get(id, false);
                    boolean z3 = !z2;
                    if (Page.this.messages.selectedIds.size() == 1 && z2) {
                        return;
                    }
                    if (z2) {
                        Page.this.messages.selectedIds.delete(id);
                    } else {
                        Page.this.messages.selectedIds.put(id, z3);
                    }
                    if (view instanceof ChatMessageCell) {
                        ((ChatMessageCell) view).setChecked(z3, z3, true);
                    }
                    Page.this.updateSubtitle(true);
                }
            });
            RecyclerListView recyclerListView = this.chatListView;
            Adapter adapter = new Adapter();
            this.adapter = adapter;
            recyclerListView.setAdapter(adapter);
            this.chatListView.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
            Context context3 = context;
            AnonymousClass10 anonymousClass10 = new AnonymousClass10(context3, 1000, 1, true, MessagePreviewView.this);
            this.chatLayoutManager = anonymousClass10;
            anonymousClass10.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int i4) {
                    if (i4 < 0 || i4 >= Page.this.messages.previewMessages.size()) {
                        return 1000;
                    }
                    MessageObject messageObject = Page.this.messages.previewMessages.get(i4);
                    MessageObject.GroupedMessages validGroupedMessage = Page.this.getValidGroupedMessage(messageObject);
                    if (validGroupedMessage != null) {
                        return validGroupedMessage.getPosition(messageObject).spanSize;
                    }
                    return 1000;
                }
            });
            this.chatListView.setClipToPadding(false);
            this.chatListView.setLayoutManager(this.chatLayoutManager);
            this.chatListView.addItemDecoration(new RecyclerView.ItemDecoration() {
                @Override
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    ChatMessageCell chatMessageCell;
                    MessageObject.GroupedMessages currentMessagesGroup;
                    MessageObject.GroupedMessagePosition currentPosition;
                    rect.bottom = 0;
                    if (!(view instanceof ChatMessageCell) || (currentMessagesGroup = (chatMessageCell = (ChatMessageCell) view).getCurrentMessagesGroup()) == null || (currentPosition = chatMessageCell.getCurrentPosition()) == null || currentPosition.siblingHeights == null) {
                        return;
                    }
                    Point point = AndroidUtilities.displaySize;
                    float fMax = Math.max(point.x, point.y) * 0.5f;
                    int extraInsetHeight = chatMessageCell.getExtraInsetHeight();
                    int i4 = 0;
                    while (true) {
                        float[] fArr = currentPosition.siblingHeights;
                        if (i4 >= fArr.length) {
                            break;
                        }
                        extraInsetHeight += (int) Math.ceil(fArr[i4] * fMax);
                        i4++;
                    }
                    int iRound = (Math.round(AndroidUtilities.density * 7.0f) * (currentPosition.maxY - currentPosition.minY)) + extraInsetHeight;
                    int size = currentMessagesGroup.posArray.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition = currentMessagesGroup.posArray.get(i5);
                        byte b = groupedMessagePosition.minY;
                        byte b2 = currentPosition.minY;
                        if (b == b2 && ((groupedMessagePosition.minX != currentPosition.minX || groupedMessagePosition.maxX != currentPosition.maxX || b != b2 || groupedMessagePosition.maxY != currentPosition.maxY) && b == b2)) {
                            iRound -= ((int) Math.ceil(fMax * groupedMessagePosition.ph)) - AndroidUtilities.dp(4.0f);
                            break;
                        }
                    }
                    rect.bottom = -iRound;
                }
            });
            this.chatPreviewContainer.addView(this.chatListView);
            addView(this.chatPreviewContainer, LayoutHelper.createFrame(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
            this.chatPreviewContainer.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(getContext(), R.drawable.popup_fixed_alert2, MessagePreviewView.this.resourcesProvider, 1);
            this.menu = actionBarPopupWindowLayout;
            actionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new MessagePreviewView$Page$$ExternalSyntheticLambda9(this, 0));
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = this.menu;
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate = MessagePreviewView.this.iBlur3Factory.create(this.menu, null, false);
            blurredBackgroundDrawableCreate.setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(MessagePreviewView.this.resourcesProvider));
            blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(8.0f));
            blurredBackgroundDrawableCreate.boundProps.hasPadding = true;
            blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(12.0f));
            actionBarPopupWindowLayout2.setBackground(blurredBackgroundDrawableCreate);
            addView(this.menu, LayoutHelper.createFrame(-2, -2.0f));
            if (i != 0 || (messages = (messagePreviewParams = MessagePreviewView.this.messagePreviewParams).replyMessage) == null) {
                page = this;
                f = 8.0f;
                if (i != 1 || MessagePreviewView.this.messagePreviewParams.forwardMessages == null) {
                    messagePreviewView = MessagePreviewView.this;
                    if (i == 2 && messagePreviewView.messagePreviewParams.linkMessage != null) {
                        ToggleButton toggleButton3 = new ToggleButton(context, R.raw.position_below, LocaleController.getString(R.string.LinkAbove), R.raw.position_above, LocaleController.getString(R.string.LinkBelow), messagePreviewView.resourcesProvider);
                        page.changePositionBtn = toggleButton3;
                        toggleButton3.setState(!messagePreviewView.messagePreviewParams.webpageTop, false);
                        page.menu.addView((View) page.changePositionBtn, LayoutHelper.createLinear(-1, 48));
                        FrameLayout frameLayout = new FrameLayout(context);
                        page.changeSizeBtnContainer = frameLayout;
                        frameLayout.setBackground(Theme.createRadSelectorDrawable(messagePreviewView.getThemedColor(Theme.key_dialogButtonSelector), 0, 0));
                        int i4 = R.raw.media_shrink;
                        String string = LocaleController.getString(R.string.LinkMediaLarger);
                        int i5 = R.raw.media_enlarge;
                        ToggleButton toggleButton4 = new ToggleButton(context, i4, string, i5, LocaleController.getString(R.string.LinkMediaSmaller), messagePreviewView.resourcesProvider);
                        page.changeSizeBtn = toggleButton4;
                        toggleButton4.setBackground(null);
                        page.changeSizeBtn.setVisibility(messagePreviewView.messagePreviewParams.isVideo ? 4 : 0);
                        page.changeSizeBtnContainer.addView(page.changeSizeBtn, LayoutHelper.createLinear(-1, 48));
                        ToggleButton toggleButton5 = new ToggleButton(context, i4, LocaleController.getString(R.string.LinkVideoLarger), i5, LocaleController.getString(R.string.LinkVideoSmaller), messagePreviewView.resourcesProvider);
                        page.videoChangeSizeBtn = toggleButton5;
                        toggleButton5.setBackground(null);
                        page.videoChangeSizeBtn.setVisibility(messagePreviewView.messagePreviewParams.isVideo ? 0 : 4);
                        page.changeSizeBtnContainer.setAlpha(messagePreviewView.messagePreviewParams.hasMedia ? 1.0f : 0.5f);
                        page.changeSizeBtnContainer.addView(page.videoChangeSizeBtn, LayoutHelper.createLinear(-1, 48));
                        page.menu.addView((View) page.changeSizeBtnContainer, LayoutHelper.createLinear(-1, 48));
                        FrameLayout frameLayout2 = page.changeSizeBtnContainer;
                        MessagePreviewParams messagePreviewParams2 = messagePreviewView.messagePreviewParams;
                        frameLayout2.setVisibility((!messagePreviewParams2.singleLink || messagePreviewParams2.hasMedia) ? 0 : 8);
                        page.changeSizeBtn.setState(messagePreviewView.messagePreviewParams.webpageSmall, false);
                        page.videoChangeSizeBtn.setState(messagePreviewView.messagePreviewParams.webpageSmall, false);
                        ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(context, messagePreviewView.resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
                        gapView.setColor(Theme.multAlpha(0.06f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, messagePreviewView.resourcesProvider)));
                        gapView.setTag(R.id.fit_width_tag, 1);
                        page.menu.addView((View) gapView, LayoutHelper.createLinear(-1, 8));
                        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(1, context, messagePreviewView.resourcesProvider, false, false);
                        actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select);
                        final int i6 = 10;
                        actionBarMenuSubItem.setOnClickListener(new View.OnClickListener(page) {
                            public final MessagePreviewView.Page f$0;

                            {
                                this.f$0 = page;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (i6) {
                                    case 0:
                                        this.f$0.lambda$new$10(view);
                                        break;
                                    case 1:
                                        this.f$0.lambda$new$2(view);
                                        break;
                                    case 2:
                                        this.f$0.lambda$new$3(view);
                                        break;
                                    case 3:
                                        this.f$0.lambda$new$4(view);
                                        break;
                                    case 4:
                                        this.f$0.lambda$new$5(view);
                                        break;
                                    case 5:
                                        this.f$0.lambda$new$6(view);
                                        break;
                                    case 6:
                                        this.f$0.lambda$new$7(view);
                                        break;
                                    case 7:
                                        this.f$0.lambda$new$8(view);
                                        break;
                                    case 8:
                                        this.f$0.lambda$new$9(view);
                                        break;
                                    case 9:
                                        this.f$0.lambda$new$11(view);
                                        break;
                                    case 10:
                                        this.f$0.lambda$new$16(view);
                                        break;
                                    case 11:
                                        this.f$0.lambda$new$17(view);
                                        break;
                                    case 12:
                                        this.f$0.lambda$new$18(view);
                                        break;
                                    default:
                                        this.f$0.lambda$new$19(view);
                                        break;
                                }
                            }
                        });
                        page.menu.addView((View) actionBarMenuSubItem, LayoutHelper.createLinear(-1, 48));
                        context2 = context;
                        ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(1, context2, messagePreviewView.resourcesProvider, false, true);
                        actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.DoNotLinkPreview), R.drawable.msg_delete);
                        int themedColor = messagePreviewView.getThemedColor(Theme.key_text_RedBold);
                        int i7 = Theme.key_text_RedRegular;
                        actionBarMenuSubItem2.setColors(themedColor, messagePreviewView.getThemedColor(i7));
                        final int i8 = 11;
                        actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener(page) {
                            public final MessagePreviewView.Page f$0;

                            {
                                this.f$0 = page;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (i8) {
                                    case 0:
                                        this.f$0.lambda$new$10(view);
                                        break;
                                    case 1:
                                        this.f$0.lambda$new$2(view);
                                        break;
                                    case 2:
                                        this.f$0.lambda$new$3(view);
                                        break;
                                    case 3:
                                        this.f$0.lambda$new$4(view);
                                        break;
                                    case 4:
                                        this.f$0.lambda$new$5(view);
                                        break;
                                    case 5:
                                        this.f$0.lambda$new$6(view);
                                        break;
                                    case 6:
                                        this.f$0.lambda$new$7(view);
                                        break;
                                    case 7:
                                        this.f$0.lambda$new$8(view);
                                        break;
                                    case 8:
                                        this.f$0.lambda$new$9(view);
                                        break;
                                    case 9:
                                        this.f$0.lambda$new$11(view);
                                        break;
                                    case 10:
                                        this.f$0.lambda$new$16(view);
                                        break;
                                    case 11:
                                        this.f$0.lambda$new$17(view);
                                        break;
                                    case 12:
                                        this.f$0.lambda$new$18(view);
                                        break;
                                    default:
                                        this.f$0.lambda$new$19(view);
                                        break;
                                }
                            }
                        });
                        actionBarMenuSubItem2.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(null, i7, false)));
                        page.menu.addView((View) actionBarMenuSubItem2, LayoutHelper.createLinear(-1, 48));
                        final int i9 = 12;
                        page.changeSizeBtnContainer.setOnClickListener(new View.OnClickListener(page) {
                            public final MessagePreviewView.Page f$0;

                            {
                                this.f$0 = page;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (i9) {
                                    case 0:
                                        this.f$0.lambda$new$10(view);
                                        break;
                                    case 1:
                                        this.f$0.lambda$new$2(view);
                                        break;
                                    case 2:
                                        this.f$0.lambda$new$3(view);
                                        break;
                                    case 3:
                                        this.f$0.lambda$new$4(view);
                                        break;
                                    case 4:
                                        this.f$0.lambda$new$5(view);
                                        break;
                                    case 5:
                                        this.f$0.lambda$new$6(view);
                                        break;
                                    case 6:
                                        this.f$0.lambda$new$7(view);
                                        break;
                                    case 7:
                                        this.f$0.lambda$new$8(view);
                                        break;
                                    case 8:
                                        this.f$0.lambda$new$9(view);
                                        break;
                                    case 9:
                                        this.f$0.lambda$new$11(view);
                                        break;
                                    case 10:
                                        this.f$0.lambda$new$16(view);
                                        break;
                                    case 11:
                                        this.f$0.lambda$new$17(view);
                                        break;
                                    case 12:
                                        this.f$0.lambda$new$18(view);
                                        break;
                                    default:
                                        this.f$0.lambda$new$19(view);
                                        break;
                                }
                            }
                        });
                        final int i10 = 13;
                        page.changePositionBtn.setOnClickListener(new View.OnClickListener(page) {
                            public final MessagePreviewView.Page f$0;

                            {
                                this.f$0 = page;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        this.f$0.lambda$new$10(view);
                                        break;
                                    case 1:
                                        this.f$0.lambda$new$2(view);
                                        break;
                                    case 2:
                                        this.f$0.lambda$new$3(view);
                                        break;
                                    case 3:
                                        this.f$0.lambda$new$4(view);
                                        break;
                                    case 4:
                                        this.f$0.lambda$new$5(view);
                                        break;
                                    case 5:
                                        this.f$0.lambda$new$6(view);
                                        break;
                                    case 6:
                                        this.f$0.lambda$new$7(view);
                                        break;
                                    case 7:
                                        this.f$0.lambda$new$8(view);
                                        break;
                                    case 8:
                                        this.f$0.lambda$new$9(view);
                                        break;
                                    case 9:
                                        this.f$0.lambda$new$11(view);
                                        break;
                                    case 10:
                                        this.f$0.lambda$new$16(view);
                                        break;
                                    case 11:
                                        this.f$0.lambda$new$17(view);
                                        break;
                                    case 12:
                                        this.f$0.lambda$new$18(view);
                                        break;
                                    default:
                                        this.f$0.lambda$new$19(view);
                                        break;
                                }
                            }
                        });
                    }
                } else {
                    if (!UserConfig.getInstance(MessagePreviewView.this.currentAccount).isPremium()) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= MessagePreviewView.this.messagePreviewParams.forwardMessages.messages.size()) {
                                z = true;
                                break;
                            } else {
                                if (MessagePreviewView.this.messagePreviewParams.forwardMessages.messages.get(i11).type == 36) {
                                    z = false;
                                    break;
                                }
                                i11++;
                            }
                        }
                    } else {
                        z = true;
                        break;
                    }
                    messagePreviewView = MessagePreviewView.this;
                    ToggleButton toggleButton6 = new ToggleButton(context, R.raw.name_hide, LocaleController.getString(MessagePreviewView.this.messagePreviewParams.multipleUsers ? R.string.ShowSenderNames : R.string.ShowSendersName), R.raw.name_show, LocaleController.getString(MessagePreviewView.this.messagePreviewParams.multipleUsers ? R.string.HideSenderNames : R.string.HideSendersName), MessagePreviewView.this.resourcesProvider);
                    page.menu.addView((View) toggleButton6, LayoutHelper.createLinear(-1, 48));
                    if (messagePreviewView.messagePreviewParams.hasCaption) {
                        toggleButton = toggleButton6;
                        ToggleButton toggleButton7 = new ToggleButton(context, R.raw.caption_hide, LocaleController.getString(R.string.ShowCaption), R.raw.caption_show, LocaleController.getString(R.string.HideCaption), messagePreviewView.resourcesProvider);
                        toggleButton7.setState(messagePreviewView.messagePreviewParams.hideCaption, false);
                        page.menu.addView((View) toggleButton7, LayoutHelper.createLinear(-1, 48));
                        toggleButton2 = toggleButton7;
                    } else {
                        toggleButton = toggleButton6;
                        toggleButton2 = null;
                    }
                    ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(0, context, messagePreviewView.resourcesProvider, true, false);
                    final int i12 = 8;
                    actionBarMenuSubItem3.setOnClickListener(new View.OnClickListener(page) {
                        public final MessagePreviewView.Page f$0;

                        {
                            this.f$0 = page;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    this.f$0.lambda$new$10(view);
                                    break;
                                case 1:
                                    this.f$0.lambda$new$2(view);
                                    break;
                                case 2:
                                    this.f$0.lambda$new$3(view);
                                    break;
                                case 3:
                                    this.f$0.lambda$new$4(view);
                                    break;
                                case 4:
                                    this.f$0.lambda$new$5(view);
                                    break;
                                case 5:
                                    this.f$0.lambda$new$6(view);
                                    break;
                                case 6:
                                    this.f$0.lambda$new$7(view);
                                    break;
                                case 7:
                                    this.f$0.lambda$new$8(view);
                                    break;
                                case 8:
                                    this.f$0.lambda$new$9(view);
                                    break;
                                case 9:
                                    this.f$0.lambda$new$11(view);
                                    break;
                                case 10:
                                    this.f$0.lambda$new$16(view);
                                    break;
                                case 11:
                                    this.f$0.lambda$new$17(view);
                                    break;
                                case 12:
                                    this.f$0.lambda$new$18(view);
                                    break;
                                default:
                                    this.f$0.lambda$new$19(view);
                                    break;
                            }
                        }
                    });
                    actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.ChangeRecipient), R.drawable.msg_forward_replace);
                    page.menu.addView((View) actionBarMenuSubItem3, LayoutHelper.createLinear(-1, 48));
                    ActionBarPopupWindow.GapView gapView2 = new ActionBarPopupWindow.GapView(context, messagePreviewView.resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
                    gapView2.setColor(Theme.multAlpha(0.06f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, messagePreviewView.resourcesProvider)));
                    gapView2.setTag(R.id.fit_width_tag, 1);
                    page.menu.addView((View) gapView2, LayoutHelper.createLinear(-1, 8));
                    ActionBarMenuSubItem actionBarMenuSubItem4 = new ActionBarMenuSubItem(1, context, messagePreviewView.resourcesProvider, false, false);
                    actionBarMenuSubItem4.setTextAndIcon(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select);
                    final int i13 = 0;
                    actionBarMenuSubItem4.setOnClickListener(new View.OnClickListener(page) {
                        public final MessagePreviewView.Page f$0;

                        {
                            this.f$0 = page;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    this.f$0.lambda$new$10(view);
                                    break;
                                case 1:
                                    this.f$0.lambda$new$2(view);
                                    break;
                                case 2:
                                    this.f$0.lambda$new$3(view);
                                    break;
                                case 3:
                                    this.f$0.lambda$new$4(view);
                                    break;
                                case 4:
                                    this.f$0.lambda$new$5(view);
                                    break;
                                case 5:
                                    this.f$0.lambda$new$6(view);
                                    break;
                                case 6:
                                    this.f$0.lambda$new$7(view);
                                    break;
                                case 7:
                                    this.f$0.lambda$new$8(view);
                                    break;
                                case 8:
                                    this.f$0.lambda$new$9(view);
                                    break;
                                case 9:
                                    this.f$0.lambda$new$11(view);
                                    break;
                                case 10:
                                    this.f$0.lambda$new$16(view);
                                    break;
                                case 11:
                                    this.f$0.lambda$new$17(view);
                                    break;
                                case 12:
                                    this.f$0.lambda$new$18(view);
                                    break;
                                default:
                                    this.f$0.lambda$new$19(view);
                                    break;
                            }
                        }
                    });
                    page.menu.addView((View) actionBarMenuSubItem4, LayoutHelper.createLinear(-1, 48));
                    ActionBarMenuSubItem actionBarMenuSubItem5 = new ActionBarMenuSubItem(1, context, messagePreviewView.resourcesProvider, false, true);
                    actionBarMenuSubItem5.setTextAndIcon(LocaleController.getString(R.string.DoNotForward), R.drawable.msg_delete);
                    int themedColor2 = messagePreviewView.getThemedColor(Theme.key_text_RedBold);
                    int i14 = Theme.key_text_RedRegular;
                    actionBarMenuSubItem5.setColors(themedColor2, messagePreviewView.getThemedColor(i14));
                    final int i15 = 9;
                    actionBarMenuSubItem5.setOnClickListener(new View.OnClickListener(page) {
                        public final MessagePreviewView.Page f$0;

                        {
                            this.f$0 = page;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i15) {
                                case 0:
                                    this.f$0.lambda$new$10(view);
                                    break;
                                case 1:
                                    this.f$0.lambda$new$2(view);
                                    break;
                                case 2:
                                    this.f$0.lambda$new$3(view);
                                    break;
                                case 3:
                                    this.f$0.lambda$new$4(view);
                                    break;
                                case 4:
                                    this.f$0.lambda$new$5(view);
                                    break;
                                case 5:
                                    this.f$0.lambda$new$6(view);
                                    break;
                                case 6:
                                    this.f$0.lambda$new$7(view);
                                    break;
                                case 7:
                                    this.f$0.lambda$new$8(view);
                                    break;
                                case 8:
                                    this.f$0.lambda$new$9(view);
                                    break;
                                case 9:
                                    this.f$0.lambda$new$11(view);
                                    break;
                                case 10:
                                    this.f$0.lambda$new$16(view);
                                    break;
                                case 11:
                                    this.f$0.lambda$new$17(view);
                                    break;
                                case 12:
                                    this.f$0.lambda$new$18(view);
                                    break;
                                default:
                                    this.f$0.lambda$new$19(view);
                                    break;
                            }
                        }
                    });
                    actionBarMenuSubItem5.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(null, i14, false)));
                    page.menu.addView((View) actionBarMenuSubItem5, LayoutHelper.createLinear(-1, 48));
                    final ToggleButton toggleButton8 = toggleButton;
                    toggleButton8.setState(messagePreviewView.messagePreviewParams.hideForwardSendersName, false);
                    final ToggleButton toggleButton9 = toggleButton2;
                    final boolean z2 = z;
                    toggleButton8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.lambda$new$14(z2, context, toggleButton9, toggleButton8, view);
                        }
                    });
                    if (toggleButton9 != null) {
                        toggleButton9.setOnClickListener(new EditTextEmoji$$ExternalSyntheticLambda0(page, toggleButton9, toggleButton8, 2));
                    }
                }
                context2 = context;
            } else {
                if (!messages.hasText || messagePreviewParams.isSecret) {
                    page = this;
                    messagePreviewView = MessagePreviewView.this;
                    i2 = 8;
                    i3 = 48;
                    f2 = 0.06f;
                    f = 8.0f;
                } else {
                    LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context3);
                    if (MessagePreviewView.this.showOutdatedQuote) {
                        viewGroup = linearLayoutM;
                        i2 = 8;
                        i3 = 48;
                        f2 = 0.06f;
                        f = 8.0f;
                    } else {
                        viewGroup = linearLayoutM;
                        i2 = 8;
                        i3 = 48;
                        f2 = 0.06f;
                        f = 8.0f;
                        ActionBarMenuSubItem actionBarMenuSubItem6 = new ActionBarMenuSubItem(0, context3, MessagePreviewView.this.resourcesProvider, true, false);
                        actionBarMenuSubItem6.setTextAndIcon(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back);
                        final int i16 = 1;
                        actionBarMenuSubItem6.setOnClickListener(new View.OnClickListener(this) {
                            public final MessagePreviewView.Page f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (i16) {
                                    case 0:
                                        this.f$0.lambda$new$10(view);
                                        break;
                                    case 1:
                                        this.f$0.lambda$new$2(view);
                                        break;
                                    case 2:
                                        this.f$0.lambda$new$3(view);
                                        break;
                                    case 3:
                                        this.f$0.lambda$new$4(view);
                                        break;
                                    case 4:
                                        this.f$0.lambda$new$5(view);
                                        break;
                                    case 5:
                                        this.f$0.lambda$new$6(view);
                                        break;
                                    case 6:
                                        this.f$0.lambda$new$7(view);
                                        break;
                                    case 7:
                                        this.f$0.lambda$new$8(view);
                                        break;
                                    case 8:
                                        this.f$0.lambda$new$9(view);
                                        break;
                                    case 9:
                                        this.f$0.lambda$new$11(view);
                                        break;
                                    case 10:
                                        this.f$0.lambda$new$16(view);
                                        break;
                                    case 11:
                                        this.f$0.lambda$new$17(view);
                                        break;
                                    case 12:
                                        this.f$0.lambda$new$18(view);
                                        break;
                                    default:
                                        this.f$0.lambda$new$19(view);
                                        break;
                                }
                            }
                        });
                        viewGroup.addView(actionBarMenuSubItem6, LayoutHelper.createLinear(-1, 48));
                        ActionBarPopupWindow.GapView gapView3 = new ActionBarPopupWindow.GapView(context3, MessagePreviewView.this.resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
                        gapView3.setColor(Theme.multAlpha(0.06f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, MessagePreviewView.this.resourcesProvider)));
                        gapView3.setTag(R.id.fit_width_tag, 1);
                        viewGroup.addView(gapView3, LayoutHelper.createLinear(-1, 8));
                        ActionBarMenuSubItem actionBarMenuSubItem7 = new ActionBarMenuSubItem(0, context3, MessagePreviewView.this.resourcesProvider, false, true);
                        actionBarMenuSubItem7.setTextAndIcon(LocaleController.getString(R.string.QuoteSelectedPart), R.drawable.menu_quote_specific);
                        final int i17 = 2;
                        actionBarMenuSubItem7.setOnClickListener(new View.OnClickListener(this) {
                            public final MessagePreviewView.Page f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (i17) {
                                    case 0:
                                        this.f$0.lambda$new$10(view);
                                        break;
                                    case 1:
                                        this.f$0.lambda$new$2(view);
                                        break;
                                    case 2:
                                        this.f$0.lambda$new$3(view);
                                        break;
                                    case 3:
                                        this.f$0.lambda$new$4(view);
                                        break;
                                    case 4:
                                        this.f$0.lambda$new$5(view);
                                        break;
                                    case 5:
                                        this.f$0.lambda$new$6(view);
                                        break;
                                    case 6:
                                        this.f$0.lambda$new$7(view);
                                        break;
                                    case 7:
                                        this.f$0.lambda$new$8(view);
                                        break;
                                    case 8:
                                        this.f$0.lambda$new$9(view);
                                        break;
                                    case 9:
                                        this.f$0.lambda$new$11(view);
                                        break;
                                    case 10:
                                        this.f$0.lambda$new$16(view);
                                        break;
                                    case 11:
                                        this.f$0.lambda$new$17(view);
                                        break;
                                    case 12:
                                        this.f$0.lambda$new$18(view);
                                        break;
                                    default:
                                        this.f$0.lambda$new$19(view);
                                        break;
                                }
                            }
                        });
                        viewGroup.addView(actionBarMenuSubItem7, LayoutHelper.createLinear(-1, 48));
                    }
                    this.menuBack = this.menu.addViewToSwipeBack(viewGroup);
                    this.menu.getSwipeBack().setStickToRight(true);
                    FrameLayout frameLayout3 = new FrameLayout(context3);
                    ActionBarMenuSubItem actionBarMenuSubItem8 = new ActionBarMenuSubItem(context3, true, true, false, MessagePreviewView.this.resourcesProvider, MessagePreviewView.this) {
                        final MessagePreviewView val$this$0;

                        {
                            this.val$this$0 = messagePreviewView;
                            int i18 = z ? 1 : 0;
                        }

                        @Override
                        public boolean onTouchEvent(MotionEvent motionEvent) {
                            if (getVisibility() != 0 || getAlpha() < 0.5f) {
                                return false;
                            }
                            return super.onTouchEvent(motionEvent);
                        }

                        @Override
                        public void updateBackground() {
                            setBackground(null);
                        }
                    };
                    this.quoteButton = actionBarMenuSubItem8;
                    actionBarMenuSubItem8.setTextAndIcon(LocaleController.getString(MessagePreviewView.this.showOutdatedQuote ? R.string.QuoteSelectedPart : R.string.SelectSpecificQuote), R.drawable.menu_select_quote);
                    context3 = context;
                    ActionBarMenuSubItem actionBarMenuSubItem9 = new ActionBarMenuSubItem(context3, true, true, false, MessagePreviewView.this.resourcesProvider, MessagePreviewView.this) {
                        final MessagePreviewView val$this$0;

                        {
                            this.val$this$0 = messagePreviewView;
                            int i18 = z ? 1 : 0;
                        }

                        @Override
                        public boolean onTouchEvent(MotionEvent motionEvent) {
                            if (getVisibility() != 0 || getAlpha() < 0.5f) {
                                return false;
                            }
                            return super.onTouchEvent(motionEvent);
                        }

                        @Override
                        public void updateBackground() {
                            setBackground(null);
                        }
                    };
                    messagePreviewView = MessagePreviewView.this;
                    page = this;
                    page.clearQuoteButton = actionBarMenuSubItem9;
                    actionBarMenuSubItem9.setTextAndIcon(LocaleController.getString(R.string.ClearQuote), R.drawable.menu_quote_delete);
                    frameLayout3.setBackground(Theme.createRadSelectorDrawable(messagePreviewView2.getThemedColor(Theme.key_dialogButtonSelector), 6, 0));
                    final int i18 = 3;
                    frameLayout3.setOnClickListener(new View.OnClickListener(page) {
                        public final MessagePreviewView.Page f$0;

                        {
                            this.f$0 = page;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i18) {
                                case 0:
                                    this.f$0.lambda$new$10(view);
                                    break;
                                case 1:
                                    this.f$0.lambda$new$2(view);
                                    break;
                                case 2:
                                    this.f$0.lambda$new$3(view);
                                    break;
                                case 3:
                                    this.f$0.lambda$new$4(view);
                                    break;
                                case 4:
                                    this.f$0.lambda$new$5(view);
                                    break;
                                case 5:
                                    this.f$0.lambda$new$6(view);
                                    break;
                                case 6:
                                    this.f$0.lambda$new$7(view);
                                    break;
                                case 7:
                                    this.f$0.lambda$new$8(view);
                                    break;
                                case 8:
                                    this.f$0.lambda$new$9(view);
                                    break;
                                case 9:
                                    this.f$0.lambda$new$11(view);
                                    break;
                                case 10:
                                    this.f$0.lambda$new$16(view);
                                    break;
                                case 11:
                                    this.f$0.lambda$new$17(view);
                                    break;
                                case 12:
                                    this.f$0.lambda$new$18(view);
                                    break;
                                default:
                                    this.f$0.lambda$new$19(view);
                                    break;
                            }
                        }
                    });
                    frameLayout3.addView(page.quoteButton, LayoutHelper.createFrame(-1, 48.0f));
                    frameLayout3.addView(page.clearQuoteButton, LayoutHelper.createFrame(-1, 48.0f));
                    page.menu.addView((View) frameLayout3, LayoutHelper.createLinear(-1, i3));
                }
                MessagePreviewParams messagePreviewParams3 = messagePreviewView2.messagePreviewParams;
                if (!messagePreviewParams3.monoforum && !messagePreviewParams3.noforwards && !messagePreviewParams3.hasSecretMessages) {
                    FrameLayout frameLayout4 = new FrameLayout(context3);
                    ActionBarMenuSubItem actionBarMenuSubItem10 = new ActionBarMenuSubItem(1, context3, messagePreviewView2.resourcesProvider, false, false);
                    page.replyAnotherChatButton = actionBarMenuSubItem10;
                    String string2 = LocaleController.getString(R.string.ReplyToAnotherChat);
                    int i19 = R.drawable.msg_forward_replace;
                    actionBarMenuSubItem10.setTextAndIcon(string2, i19);
                    final int i20 = 4;
                    page.replyAnotherChatButton.setOnClickListener(new View.OnClickListener(page) {
                        public final MessagePreviewView.Page f$0;

                        {
                            this.f$0 = page;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i20) {
                                case 0:
                                    this.f$0.lambda$new$10(view);
                                    break;
                                case 1:
                                    this.f$0.lambda$new$2(view);
                                    break;
                                case 2:
                                    this.f$0.lambda$new$3(view);
                                    break;
                                case 3:
                                    this.f$0.lambda$new$4(view);
                                    break;
                                case 4:
                                    this.f$0.lambda$new$5(view);
                                    break;
                                case 5:
                                    this.f$0.lambda$new$6(view);
                                    break;
                                case 6:
                                    this.f$0.lambda$new$7(view);
                                    break;
                                case 7:
                                    this.f$0.lambda$new$8(view);
                                    break;
                                case 8:
                                    this.f$0.lambda$new$9(view);
                                    break;
                                case 9:
                                    this.f$0.lambda$new$11(view);
                                    break;
                                case 10:
                                    this.f$0.lambda$new$16(view);
                                    break;
                                case 11:
                                    this.f$0.lambda$new$17(view);
                                    break;
                                case 12:
                                    this.f$0.lambda$new$18(view);
                                    break;
                                default:
                                    this.f$0.lambda$new$19(view);
                                    break;
                            }
                        }
                    });
                    context3 = context;
                    ActionBarMenuSubItem actionBarMenuSubItem11 = new ActionBarMenuSubItem(1, context3, messagePreviewView2.resourcesProvider, false, false);
                    page.quoteAnotherChatButton = actionBarMenuSubItem11;
                    actionBarMenuSubItem11.setTextAndIcon(LocaleController.getString(R.string.QuoteToAnotherChat), i19);
                    final int i21 = 5;
                    page.quoteAnotherChatButton.setOnClickListener(new View.OnClickListener(page) {
                        public final MessagePreviewView.Page f$0;

                        {
                            this.f$0 = page;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i21) {
                                case 0:
                                    this.f$0.lambda$new$10(view);
                                    break;
                                case 1:
                                    this.f$0.lambda$new$2(view);
                                    break;
                                case 2:
                                    this.f$0.lambda$new$3(view);
                                    break;
                                case 3:
                                    this.f$0.lambda$new$4(view);
                                    break;
                                case 4:
                                    this.f$0.lambda$new$5(view);
                                    break;
                                case 5:
                                    this.f$0.lambda$new$6(view);
                                    break;
                                case 6:
                                    this.f$0.lambda$new$7(view);
                                    break;
                                case 7:
                                    this.f$0.lambda$new$8(view);
                                    break;
                                case 8:
                                    this.f$0.lambda$new$9(view);
                                    break;
                                case 9:
                                    this.f$0.lambda$new$11(view);
                                    break;
                                case 10:
                                    this.f$0.lambda$new$16(view);
                                    break;
                                case 11:
                                    this.f$0.lambda$new$17(view);
                                    break;
                                case 12:
                                    this.f$0.lambda$new$18(view);
                                    break;
                                default:
                                    this.f$0.lambda$new$19(view);
                                    break;
                            }
                        }
                    });
                    frameLayout4.addView(page.quoteAnotherChatButton, LayoutHelper.createFrame(-1, 48.0f));
                    frameLayout4.addView(page.replyAnotherChatButton, LayoutHelper.createFrame(-1, 48.0f));
                    page.menu.addView((View) frameLayout4, LayoutHelper.createLinear(-1, i3));
                }
                MessagePreviewParams messagePreviewParams4 = messagePreviewView2.messagePreviewParams;
                if (!messagePreviewParams4.noforwards && !messagePreviewParams4.hasSecretMessages) {
                    ActionBarPopupWindow.GapView gapView4 = new ActionBarPopupWindow.GapView(context3, messagePreviewView2.resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
                    gapView4.setColor(Theme.multAlpha(f2, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, messagePreviewView2.resourcesProvider)));
                    gapView4.setTag(R.id.fit_width_tag, 1);
                    page.menu.addView((View) gapView4, LayoutHelper.createLinear(-1, i2));
                }
                page.switchToQuote(messagePreviewView2.messagePreviewParams.quote != null, false);
                ActionBarMenuSubItem actionBarMenuSubItem12 = new ActionBarMenuSubItem(1, context3, messagePreviewView2.resourcesProvider, false, false);
                actionBarMenuSubItem12.setTextAndIcon(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select);
                final int i22 = 6;
                actionBarMenuSubItem12.setOnClickListener(new View.OnClickListener(page) {
                    public final MessagePreviewView.Page f$0;

                    {
                        this.f$0 = page;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                this.f$0.lambda$new$10(view);
                                break;
                            case 1:
                                this.f$0.lambda$new$2(view);
                                break;
                            case 2:
                                this.f$0.lambda$new$3(view);
                                break;
                            case 3:
                                this.f$0.lambda$new$4(view);
                                break;
                            case 4:
                                this.f$0.lambda$new$5(view);
                                break;
                            case 5:
                                this.f$0.lambda$new$6(view);
                                break;
                            case 6:
                                this.f$0.lambda$new$7(view);
                                break;
                            case 7:
                                this.f$0.lambda$new$8(view);
                                break;
                            case 8:
                                this.f$0.lambda$new$9(view);
                                break;
                            case 9:
                                this.f$0.lambda$new$11(view);
                                break;
                            case 10:
                                this.f$0.lambda$new$16(view);
                                break;
                            case 11:
                                this.f$0.lambda$new$17(view);
                                break;
                            case 12:
                                this.f$0.lambda$new$18(view);
                                break;
                            default:
                                this.f$0.lambda$new$19(view);
                                break;
                        }
                    }
                });
                page.menu.addView((View) actionBarMenuSubItem12, LayoutHelper.createLinear(-1, i3));
                ActionBarMenuSubItem actionBarMenuSubItem13 = new ActionBarMenuSubItem(1, context, messagePreviewView2.resourcesProvider, false, true);
                page.deleteReplyButton = actionBarMenuSubItem13;
                actionBarMenuSubItem13.setTextAndIcon(LocaleController.getString(messagePreviewView2.showOutdatedQuote ? R.string.DoNotQuote : R.string.DoNotReply), R.drawable.msg_delete);
                ActionBarMenuSubItem actionBarMenuSubItem14 = page.deleteReplyButton;
                int themedColor3 = messagePreviewView2.getThemedColor(Theme.key_text_RedBold);
                int i23 = Theme.key_text_RedRegular;
                actionBarMenuSubItem14.setColors(themedColor3, messagePreviewView2.getThemedColor(i23));
                page.deleteReplyButton.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(null, i23, false)));
                final int i24 = 7;
                page.deleteReplyButton.setOnClickListener(new View.OnClickListener(page) {
                    public final MessagePreviewView.Page f$0;

                    {
                        this.f$0 = page;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i24) {
                            case 0:
                                this.f$0.lambda$new$10(view);
                                break;
                            case 1:
                                this.f$0.lambda$new$2(view);
                                break;
                            case 2:
                                this.f$0.lambda$new$3(view);
                                break;
                            case 3:
                                this.f$0.lambda$new$4(view);
                                break;
                            case 4:
                                this.f$0.lambda$new$5(view);
                                break;
                            case 5:
                                this.f$0.lambda$new$6(view);
                                break;
                            case 6:
                                this.f$0.lambda$new$7(view);
                                break;
                            case 7:
                                this.f$0.lambda$new$8(view);
                                break;
                            case 8:
                                this.f$0.lambda$new$9(view);
                                break;
                            case 9:
                                this.f$0.lambda$new$11(view);
                                break;
                            case 10:
                                this.f$0.lambda$new$16(view);
                                break;
                            case 11:
                                this.f$0.lambda$new$17(view);
                                break;
                            case 12:
                                this.f$0.lambda$new$18(view);
                                break;
                            default:
                                this.f$0.lambda$new$19(view);
                                break;
                        }
                    }
                });
                page.menu.addView((View) page.deleteReplyButton, LayoutHelper.createLinear(-1, i3));
                context2 = context;
                messagePreviewView = messagePreviewView2;
            }
            int i25 = page.currentTab;
            if (i25 == 1) {
                page.messages = messagePreviewView.messagePreviewParams.forwardMessages;
            } else if (i25 == 0) {
                page.messages = messagePreviewView.messagePreviewParams.replyMessage;
            } else if (i25 == 2) {
                page.messages = messagePreviewView.messagePreviewParams.linkMessage;
            }
            TextSelectionHelper.TextSelectionOverlay overlayView = page.textSelectionHelper.getOverlayView(context2);
            page.textSelectionOverlay = overlayView;
            overlayView.setElevation(AndroidUtilities.dp(f));
            page.textSelectionOverlay.setOutlineProvider(null);
            View view = page.textSelectionOverlay;
            if (view != null) {
                if (view.getParent() instanceof ViewGroup) {
                    ((ViewGroup) page.textSelectionOverlay.getParent()).removeView(page.textSelectionOverlay);
                }
                page.addView(page.textSelectionOverlay, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.ActionBar.getCurrentActionBarHeight() / AndroidUtilities.density, 0.0f, 0.0f));
            }
            page.textSelectionHelper.setParentView(page.chatListView);
        }

        public void checkScroll() {
            if (this.updateScroll) {
                if (this.chatListView.computeVerticalScrollRange() > this.chatListView.computeVerticalScrollExtent()) {
                    postDelayed(new MessagePreviewView$Page$$ExternalSyntheticLambda9(this, 1), 0L);
                }
                this.updateScroll = false;
            }
        }

        public MessageObject.GroupedMessages getValidGroupedMessage(MessageObject messageObject) {
            if (messageObject.getGroupId() == 0) {
                return null;
            }
            MessageObject.GroupedMessages groupedMessages = this.messages.groupedMessagesMap.get(messageObject.getGroupId());
            if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
                return groupedMessages;
            }
            return null;
        }

        public void lambda$checkScroll$20() {
            if (MessagePreviewView.this.messagePreviewParams.webpageTop) {
                RecyclerListView recyclerListView = this.chatListView;
                recyclerListView.smoothScrollBy(0, -recyclerListView.computeVerticalScrollOffset(), 250, ChatListItemAnimator.DEFAULT_INTERPOLATOR);
            } else {
                RecyclerListView recyclerListView2 = this.chatListView;
                recyclerListView2.smoothScrollBy(0, recyclerListView2.computeVerticalScrollRange() - (this.chatListView.computeVerticalScrollExtent() + this.chatListView.computeVerticalScrollOffset()), 250, ChatListItemAnimator.DEFAULT_INTERPOLATOR);
            }
        }

        public boolean lambda$new$0(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                MessagePreviewView.this.dismiss(true);
            }
            return true;
        }

        public void lambda$new$1() {
            switchToQuote(true, false);
        }

        public void lambda$new$10(View view) {
            MessagePreviewView.this.dismiss(true);
        }

        public void lambda$new$11(View view) {
            MessagePreviewView.this.removeForward();
        }

        public void lambda$new$12(Context context) {
            if (AndroidUtilities.isContextSafe(context)) {
                new PremiumFeatureBottomSheet(context, 43, MessagePreviewView.this.resourcesProvider).show();
            }
        }

        public void lambda$new$13(Context context) {
            MessagePreviewView.this.dismiss(false);
            AndroidUtilities.runOnUIThread(new MessagePreviewView$Page$$ExternalSyntheticLambda19(this, context, 1));
        }

        public void lambda$new$14(boolean z, Context context, ToggleButton toggleButton, ToggleButton toggleButton2, View view) {
            if (!z) {
                MessagePreviewView messagePreviewView = MessagePreviewView.this;
                BulletinFactory.of(messagePreviewView, messagePreviewView.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new MessagePreviewView$Page$$ExternalSyntheticLambda19(this, context, 0))).show();
                return;
            }
            MessagePreviewView messagePreviewView2 = MessagePreviewView.this;
            MessagePreviewParams messagePreviewParams = messagePreviewView2.messagePreviewParams;
            boolean z2 = messagePreviewParams.hideForwardSendersName;
            messagePreviewParams.hideForwardSendersName = !z2;
            messagePreviewView2.returnSendersNames = false;
            if (z2) {
                messagePreviewParams.hideCaption = false;
                if (toggleButton != null) {
                    toggleButton.setState(false, true);
                }
            }
            toggleButton2.setState(MessagePreviewView.this.messagePreviewParams.hideForwardSendersName, true);
            updateMessages();
            updateSubtitle(true);
        }

        public void lambda$new$15(ToggleButton toggleButton, ToggleButton toggleButton2, View view) {
            MessagePreviewView messagePreviewView = MessagePreviewView.this;
            MessagePreviewParams messagePreviewParams = messagePreviewView.messagePreviewParams;
            boolean z = messagePreviewParams.hideCaption;
            boolean z2 = !z;
            messagePreviewParams.hideCaption = z2;
            if (z) {
                if (messagePreviewView.returnSendersNames) {
                    messagePreviewParams.hideForwardSendersName = false;
                }
                messagePreviewView.returnSendersNames = false;
            } else if (!messagePreviewParams.hideForwardSendersName) {
                messagePreviewParams.hideForwardSendersName = true;
                messagePreviewView.returnSendersNames = true;
            }
            toggleButton.setState(z2, true);
            toggleButton2.setState(MessagePreviewView.this.messagePreviewParams.hideForwardSendersName, true);
            updateMessages();
            updateSubtitle(true);
        }

        public void lambda$new$16(View view) {
            MessagePreviewView.this.dismiss(true);
        }

        public void lambda$new$17(View view) {
            MessagePreviewView.this.removeLink();
        }

        public void lambda$new$18(View view) {
            TLRPC.Message message;
            TLRPC.MessageMedia messageMedia;
            TLRPC.Message message2;
            TLRPC.MessageMedia messageMedia2;
            MessagePreviewParams messagePreviewParams = MessagePreviewView.this.messagePreviewParams;
            if (messagePreviewParams.hasMedia) {
                boolean z = !messagePreviewParams.webpageSmall;
                messagePreviewParams.webpageSmall = z;
                this.changeSizeBtn.setState(z, true);
                this.videoChangeSizeBtn.setState(MessagePreviewView.this.messagePreviewParams.webpageSmall, true);
                if (this.messages.messages.size() > 0 && (message2 = this.messages.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                    boolean z2 = MessagePreviewView.this.messagePreviewParams.webpageSmall;
                    messageMedia2.force_small_media = z2;
                    messageMedia2.force_large_media = !z2;
                }
                if (this.messages.previewMessages.size() > 0 && (message = this.messages.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                    boolean z3 = MessagePreviewView.this.messagePreviewParams.webpageSmall;
                    messageMedia.force_small_media = z3;
                    messageMedia.force_large_media = !z3;
                }
                updateMessages();
                this.updateScroll = true;
            }
        }

        public void lambda$new$19(View view) {
            TLRPC.Message message;
            TLRPC.Message message2;
            MessagePreviewParams messagePreviewParams = MessagePreviewView.this.messagePreviewParams;
            boolean z = messagePreviewParams.webpageTop;
            messagePreviewParams.webpageTop = !z;
            this.changePositionBtn.setState(z, true);
            if (this.messages.messages.size() > 0 && (message2 = this.messages.messages.get(0).messageOwner) != null) {
                message2.invert_media = MessagePreviewView.this.messagePreviewParams.webpageTop;
            }
            if (this.messages.previewMessages.size() > 0 && (message = this.messages.previewMessages.get(0).messageOwner) != null) {
                message.invert_media = MessagePreviewView.this.messagePreviewParams.webpageTop;
            }
            updateMessages();
            this.updateScroll = true;
        }

        public void lambda$new$2(View view) {
            MessagePreviewView.this.messagePreviewParams.quote = null;
            this.textSelectionHelper.clear();
            switchToQuote(false, false);
            this.menu.getSwipeBack().closeForeground();
        }

        public void lambda$new$3(View view) {
            if (getReplyMessage() != null) {
                TextSelectionHelper.ChatListTextSelectionHelper chatListTextSelectionHelper = this.textSelectionHelper;
                if (chatListTextSelectionHelper.selectionEnd - chatListTextSelectionHelper.selectionStart > MessagesController.getInstance(MessagePreviewView.this.currentAccount).quoteLengthMax) {
                    showQuoteLengthError();
                    return;
                }
                MessageObject replyMessage = getReplyMessage(this.textSelectionHelper.getSelectedCell() != null ? ((ChatMessageCell) this.textSelectionHelper.getSelectedCell()).getMessageObject() : null);
                MessagePreviewParams messagePreviewParams = MessagePreviewView.this.messagePreviewParams;
                TextSelectionHelper.ChatListTextSelectionHelper chatListTextSelectionHelper2 = this.textSelectionHelper;
                int i = chatListTextSelectionHelper2.selectionStart;
                messagePreviewParams.quoteStart = i;
                int i2 = chatListTextSelectionHelper2.selectionEnd;
                messagePreviewParams.quoteEnd = i2;
                messagePreviewParams.quote = ChatActivity.ReplyQuote.from(replyMessage, i, i2);
                MessagePreviewView.this.onQuoteSelectedPart();
                MessagePreviewView.this.dismiss(true);
            }
        }

        public void lambda$new$4(View view) {
            MessagePreviewView messagePreviewView = MessagePreviewView.this;
            MessagePreviewParams messagePreviewParams = messagePreviewView.messagePreviewParams;
            if (messagePreviewParams.quote != null && !messagePreviewView.showOutdatedQuote) {
                messagePreviewParams.quote = null;
                this.textSelectionHelper.clear();
                switchToQuote(false, true);
                updateSubtitle(true);
                return;
            }
            TextSelectionHelper.ChatListTextSelectionHelper chatListTextSelectionHelper = this.textSelectionHelper;
            if (chatListTextSelectionHelper.selectionEnd - chatListTextSelectionHelper.selectionStart > MessagesController.getInstance(messagePreviewView.currentAccount).quoteLengthMax) {
                showQuoteLengthError();
                return;
            }
            MessageObject replyMessage = getReplyMessage();
            if (replyMessage != null) {
                if (this.textSelectionHelper.isInSelectionMode()) {
                    MessagePreviewParams messagePreviewParams2 = MessagePreviewView.this.messagePreviewParams;
                    TextSelectionHelper.ChatListTextSelectionHelper chatListTextSelectionHelper2 = this.textSelectionHelper;
                    messagePreviewParams2.quoteStart = chatListTextSelectionHelper2.selectionStart;
                    messagePreviewParams2.quoteEnd = chatListTextSelectionHelper2.selectionEnd;
                    MessageObject replyMessage2 = getReplyMessage(chatListTextSelectionHelper2.getSelectedCell() != null ? ((ChatMessageCell) this.textSelectionHelper.getSelectedCell()).getMessageObject() : null);
                    MessagePreviewParams messagePreviewParams3 = MessagePreviewView.this.messagePreviewParams;
                    messagePreviewParams3.quote = ChatActivity.ReplyQuote.from(replyMessage2, messagePreviewParams3.quoteStart, messagePreviewParams3.quoteEnd);
                    MessagePreviewView.this.onQuoteSelectedPart();
                    MessagePreviewView.this.dismiss(true);
                    return;
                }
                MessagePreviewView messagePreviewView2 = MessagePreviewView.this;
                MessagePreviewParams messagePreviewParams4 = messagePreviewView2.messagePreviewParams;
                messagePreviewParams4.quoteStart = 0;
                messagePreviewParams4.quoteEnd = Math.min(MessagesController.getInstance(messagePreviewView2.currentAccount).quoteLengthMax, replyMessage.messageOwner.message.length());
                MessagePreviewParams messagePreviewParams5 = MessagePreviewView.this.messagePreviewParams;
                messagePreviewParams5.quote = ChatActivity.ReplyQuote.from(replyMessage, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                View replyMessageCell = getReplyMessageCell();
                if (replyMessageCell instanceof ChatMessageCell) {
                    MessagePreviewParams messagePreviewParams6 = MessagePreviewView.this.messagePreviewParams;
                    this.textSelectionHelper.select((ChatMessageCell) replyMessageCell, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                }
                if (!MessagePreviewView.this.showOutdatedQuote) {
                    this.menu.getSwipeBack().openForeground(this.menuBack);
                }
                switchToQuote(true, true);
            }
        }

        public void lambda$new$5(View view) {
            MessagePreviewView.this.selectAnotherChat(false);
        }

        public void lambda$new$6(View view) {
            MessagePreviewView.this.selectAnotherChat(false);
        }

        public void lambda$new$7(View view) {
            MessagePreviewView.this.dismiss(true);
        }

        public void lambda$new$8(View view) {
            MessagePreviewView messagePreviewView = MessagePreviewView.this;
            if (messagePreviewView.showOutdatedQuote) {
                messagePreviewView.removeQuote();
            } else {
                messagePreviewView.removeReply();
            }
        }

        public void lambda$new$9(View view) {
            MessagePreviewView.this.selectAnotherChat(true);
        }

        public void lambda$onAttachedToWindow$21(View view) {
            this.adapter.onViewAttachedToWindow(this.chatListView.getChildViewHolder(view));
        }

        public void lambda$updatePositions$22(int i, float f, ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f2 = 1.0f - fFloatValue;
            int i2 = (int) ((this.chatTopOffset * fFloatValue) + (i * f2));
            this.currentTopOffset = i2;
            float f3 = (this.yOffset * fFloatValue) + (f * f2);
            this.currentYOffset = f3;
            setOffset(f3, i2);
        }

        public void setOffset(float f, int i) {
            if (MessagePreviewView.this.isLandscapeMode) {
                this.actionBar.setTranslationY(0.0f);
                this.chatPreviewContainer.invalidateOutline();
                this.chatPreviewContainer.setTranslationY(0.0f);
                this.menu.setTranslationY(0.0f);
            } else {
                this.actionBar.setTranslationY(i);
                this.chatPreviewContainer.invalidateOutline();
                this.chatPreviewContainer.setTranslationY(f);
                this.menu.setTranslationY((f + this.chatPreviewContainer.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
            }
            this.textSelectionOverlay.setTranslationX(this.chatPreviewContainer.getX());
            this.textSelectionOverlay.setTranslationY(this.chatPreviewContainer.getY());
        }

        public void showQuoteLengthError() {
            MessagePreviewView messagePreviewView = MessagePreviewView.this;
            BulletinFactory.of(messagePreviewView, messagePreviewView.resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage)).show();
        }

        public void switchToQuote(final boolean z, boolean z2) {
            if (MessagePreviewView.this.showOutdatedQuote) {
                z = false;
            }
            if (z2 && this.toQuote == z) {
                return;
            }
            this.toQuote = z;
            AnimatorSet animatorSet = this.quoteSwitcher;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.quoteSwitcher = null;
            }
            if (!z2) {
                ActionBarMenuSubItem actionBarMenuSubItem = this.quoteButton;
                if (actionBarMenuSubItem != null) {
                    actionBarMenuSubItem.setAlpha(!z ? 1.0f : 0.0f);
                    this.quoteButton.setVisibility(!z ? 0 : 4);
                }
                ActionBarMenuSubItem actionBarMenuSubItem2 = this.clearQuoteButton;
                if (actionBarMenuSubItem2 != null) {
                    actionBarMenuSubItem2.setAlpha(z ? 1.0f : 0.0f);
                    this.clearQuoteButton.setVisibility(z ? 0 : 4);
                }
                ActionBarMenuSubItem actionBarMenuSubItem3 = this.replyAnotherChatButton;
                if (actionBarMenuSubItem3 != null) {
                    actionBarMenuSubItem3.setAlpha(!z ? 1.0f : 0.0f);
                    this.replyAnotherChatButton.setVisibility(!z ? 0 : 4);
                }
                ActionBarMenuSubItem actionBarMenuSubItem4 = this.quoteAnotherChatButton;
                if (actionBarMenuSubItem4 != null) {
                    actionBarMenuSubItem4.setAlpha(z ? 1.0f : 0.0f);
                    this.quoteAnotherChatButton.setVisibility(z ? 0 : 4);
                    return;
                }
                return;
            }
            this.quoteSwitcher = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            ActionBarMenuSubItem actionBarMenuSubItem5 = this.quoteButton;
            Property property = View.ALPHA;
            if (actionBarMenuSubItem5 != null) {
                actionBarMenuSubItem5.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.quoteButton, (Property<ActionBarMenuSubItem, Float>) property, !z ? 1.0f : 0.0f));
            }
            ActionBarMenuSubItem actionBarMenuSubItem6 = this.clearQuoteButton;
            if (actionBarMenuSubItem6 != null) {
                actionBarMenuSubItem6.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.clearQuoteButton, (Property<ActionBarMenuSubItem, Float>) property, z ? 1.0f : 0.0f));
            }
            ActionBarMenuSubItem actionBarMenuSubItem7 = this.replyAnotherChatButton;
            if (actionBarMenuSubItem7 != null) {
                actionBarMenuSubItem7.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.replyAnotherChatButton, (Property<ActionBarMenuSubItem, Float>) property, !z ? 1.0f : 0.0f));
            }
            ActionBarMenuSubItem actionBarMenuSubItem8 = this.quoteAnotherChatButton;
            if (actionBarMenuSubItem8 != null) {
                actionBarMenuSubItem8.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.quoteAnotherChatButton, (Property<ActionBarMenuSubItem, Float>) property, z ? 1.0f : 0.0f));
            }
            this.quoteSwitcher.playTogether(arrayList);
            this.quoteSwitcher.setDuration(360L);
            this.quoteSwitcher.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.quoteSwitcher.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    Page.this.quoteSwitcher = null;
                    Page.this.switchToQuote(z, false);
                }
            });
            this.quoteSwitcher.start();
        }

        public void updateLinkHighlight(ChatMessageCell chatMessageCell) {
            CharacterStyle characterStyle;
            TLRPC.WebPage webPage;
            if (this.currentTab == 2) {
                MessagePreviewParams messagePreviewParams = MessagePreviewView.this.messagePreviewParams;
                if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    chatMessageCell.setHighlightedSpan(characterStyle);
                    return;
                }
            }
            chatMessageCell.setHighlightedSpan(null);
        }

        public void updateMessages() {
            TLRPC.Message message;
            TLRPC.MessageMedia messageMedia;
            if (this.itemAnimator.isRunning()) {
                this.updateAfterAnimations = true;
                return;
            }
            for (int i = 0; i < this.messages.previewMessages.size(); i++) {
                MessageObject messageObject = this.messages.previewMessages.get(i);
                messageObject.forceUpdate = true;
                MessagePreviewView messagePreviewView = MessagePreviewView.this;
                messageObject.sendAsPeer = messagePreviewView.sendAsPeer;
                MessagePreviewParams messagePreviewParams = messagePreviewView.messagePreviewParams;
                if (messagePreviewParams.hideForwardSendersName) {
                    messageObject.messageOwner.flags &= -5;
                    messageObject.hideSendersName = true;
                } else {
                    messageObject.messageOwner.flags |= 4;
                    messageObject.hideSendersName = false;
                }
                if (this.currentTab == 2) {
                    TLRPC.WebPage webPage = messagePreviewParams.webpage;
                    if (webPage != null && ((messageMedia = (message = messageObject.messageOwner).media) == null || messageMedia.webpage != webPage)) {
                        message.flags |= 512;
                        message.media = new TLRPC.TL_messageMediaWebPage();
                        TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                        MessagePreviewParams messagePreviewParams2 = MessagePreviewView.this.messagePreviewParams;
                        messageMedia2.webpage = messagePreviewParams2.webpage;
                        boolean z = messagePreviewParams2.webpageSmall;
                        messageMedia2.force_large_media = !z;
                        messageMedia2.force_small_media = z;
                        messageMedia2.manual = true;
                        messageObject.linkDescription = null;
                        messageObject.generateLinkDescription();
                        messageObject.photoThumbs = null;
                        messageObject.photoThumbs2 = null;
                        messageObject.photoThumbsObject = null;
                        messageObject.photoThumbsObject2 = null;
                        messageObject.generateThumbs(true);
                        messageObject.checkMediaExistance();
                    } else if (webPage == null) {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        message2.flags &= -513;
                        message2.media = null;
                    }
                }
                if (MessagePreviewView.this.messagePreviewParams.hideCaption) {
                    messageObject.caption = null;
                } else {
                    messageObject.generateCaption();
                }
                if (messageObject.isPoll()) {
                    MessagePreviewParams.PreviewMediaPoll previewMediaPoll = (MessagePreviewParams.PreviewMediaPoll) messageObject.messageOwner.media;
                    previewMediaPoll.results.total_voters = MessagePreviewView.this.messagePreviewParams.hideCaption ? 0 : previewMediaPoll.totalVotersCached;
                }
            }
            for (int i2 = 0; i2 < this.messages.pollChosenAnswers.size(); i2++) {
                this.messages.pollChosenAnswers.get(i2).chosen = !MessagePreviewView.this.messagePreviewParams.hideForwardSendersName;
            }
            for (int i3 = 0; i3 < this.messages.groupedMessagesMap.size(); i3++) {
                this.itemAnimator.groupWillChanged(this.messages.groupedMessagesMap.valueAt(i3));
            }
            this.adapter.notifyItemRangeChanged(0, this.messages.previewMessages.size());
        }

        public void updatePositions() {
            int i = this.chatTopOffset;
            float f = this.yOffset;
            int i2 = 0;
            if (MessagePreviewView.this.isLandscapeMode) {
                this.yOffset = 0.0f;
                this.chatTopOffset = 0;
                this.menu.setTranslationX(AndroidUtilities.dp(8.0f) + this.chatListView.getMeasuredWidth());
            } else {
                int measuredHeight = this.chatListView.getMeasuredHeight();
                int i3 = 0;
                for (int i4 = 0; i4 < this.chatListView.getChildCount(); i4++) {
                    View childAt = this.chatListView.getChildAt(i4);
                    if (this.chatListView.getChildAdapterPosition(childAt) != -1) {
                        measuredHeight = Math.min(measuredHeight, childAt.getTop());
                        i3++;
                    }
                }
                MessagePreviewParams.Messages messages = this.messages;
                if (messages == null || i3 == 0 || i3 > messages.previewMessages.size()) {
                    this.chatTopOffset = 0;
                } else {
                    int iM = BotFullscreenButtons$$ExternalSyntheticOutline1.m(4.0f, measuredHeight, 0);
                    this.chatTopOffset = iM;
                    this.chatTopOffset = Math.min(((this.chatListView.getMeasuredHeight() - this.chatTopOffset) + iM) - ((int) ((((AndroidUtilities.displaySize.y - (Build.VERSION.SDK_INT >= 35 ? AndroidUtilities.navigationBarHeight : 0)) * 0.8f) - this.buttonsHeight) - AndroidUtilities.dp(8.0f))), this.chatTopOffset);
                }
                float fM = ImageReceiver$$ExternalSyntheticOutline0.m(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.chatPreviewContainer.getMeasuredHeight() - this.chatTopOffset) + (this.buttonsHeight - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.chatTopOffset;
                this.yOffset = fM;
                if (fM > AndroidUtilities.dp(8.0f)) {
                    this.yOffset = AndroidUtilities.dp(8.0f);
                }
                this.menu.setTranslationX(getMeasuredWidth() - this.menu.getMeasuredWidth());
            }
            boolean z = this.firstLayout;
            if (z || (this.chatTopOffset == i && this.yOffset == f)) {
                if (z) {
                    float f2 = this.yOffset;
                    this.currentYOffset = f2;
                    int i5 = this.chatTopOffset;
                    this.currentTopOffset = i5;
                    setOffset(f2, i5);
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator = MessagePreviewView.this.offsetsAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            MessagePreviewView.this.offsetsAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
            MessagePreviewView.this.offsetsAnimator.addUpdateListener(new MessagePreviewView$Page$$ExternalSyntheticLambda18(this, i, f, i2));
            MessagePreviewView.this.offsetsAnimator.setDuration(250L);
            MessagePreviewView.this.offsetsAnimator.setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR);
            MessagePreviewView.this.offsetsAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    Page page = Page.this;
                    MessagePreviewView.this.offsetsAnimator = null;
                    page.setOffset(page.yOffset, page.chatTopOffset);
                }
            });
            AndroidUtilities.runOnUIThread(MessagePreviewView.this.changeBoundsRunnable, 50L);
            this.currentTopOffset = i;
            this.currentYOffset = f;
            setOffset(f, i);
        }

        public void updateSubtitle(boolean z) {
            String string;
            int i = this.currentTab;
            if (i != 1) {
                if (i != 0) {
                    if (i == 2) {
                        this.actionBar.setTitle(LocaleController.getString(R.string.MessageOptionsLinkTitle), z);
                        this.actionBar.setSubtitle(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z);
                        return;
                    }
                    return;
                }
                MessagePreviewParams messagePreviewParams = MessagePreviewView.this.messagePreviewParams;
                if (messagePreviewParams.quote == null || !messagePreviewParams.replyMessage.hasText) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.MessageOptionsReplyTitle), z);
                    this.actionBar.setSubtitle(MessagePreviewView.this.messagePreviewParams.replyMessage.hasText ? LocaleController.getString(R.string.MessageOptionsReplySubtitle) : "", z);
                    return;
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PreviewQuoteUpdate), z);
                    this.actionBar.setSubtitle(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z);
                    return;
                }
            }
            ActionBar actionBar = this.actionBar;
            MessagePreviewParams.Messages messages = MessagePreviewView.this.messagePreviewParams.forwardMessages;
            actionBar.setTitle(LocaleController.formatPluralString("PreviewForwardMessagesCount", messages == null ? 0 : messages.selectedIds.size(), new Object[0]), z);
            MessagePreviewView messagePreviewView = MessagePreviewView.this;
            MessagePreviewParams messagePreviewParams2 = messagePreviewView.messagePreviewParams;
            if (messagePreviewParams2.hasSenders) {
                if (messagePreviewParams2.hideForwardSendersName) {
                    TLRPC.User user = messagePreviewView.currentUser;
                    if (user != null) {
                        string = LocaleController.formatString("ForwardPreviewSendersNameHidden", R.string.ForwardPreviewSendersNameHidden, ContactsController.formatName(user.first_name, user.last_name));
                    } else {
                        string = (!ChatObject.isChannel(messagePreviewView.currentChat) || MessagePreviewView.this.currentChat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel);
                    }
                } else {
                    TLRPC.User user2 = messagePreviewView.currentUser;
                    if (user2 != null) {
                        string = LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user2.first_name, user2.last_name));
                    } else {
                        string = (!ChatObject.isChannel(messagePreviewView.currentChat) || MessagePreviewView.this.currentChat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel);
                    }
                }
            } else if (messagePreviewParams2.willSeeSenders) {
                TLRPC.User user3 = messagePreviewView.currentUser;
                if (user3 != null) {
                    string = LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user3.first_name, user3.last_name));
                } else {
                    string = (!ChatObject.isChannel(messagePreviewView.currentChat) || MessagePreviewView.this.currentChat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel);
                }
            } else {
                TLRPC.User user4 = messagePreviewView.currentUser;
                if (user4 != null) {
                    string = LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user4.first_name, user4.last_name));
                } else {
                    string = (!ChatObject.isChannel(messagePreviewView.currentChat) || MessagePreviewView.this.currentChat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel);
                }
            }
            this.actionBar.setSubtitle(string, z);
        }

        public void bind() {
            updateMessages();
            updateSubtitle(false);
        }

        public MessageObject getReplyMessage() {
            return getReplyMessage(null);
        }

        public View getReplyMessageCell() {
            MessageObject replyMessage = getReplyMessage();
            if (replyMessage == null) {
                return null;
            }
            for (int i = 0; i < this.chatListView.getChildCount(); i++) {
                View childAt = this.chatListView.getChildAt(i);
                IMessageCell iMessageCell = (IMessageCell) childAt;
                if (iMessageCell.getMessageObject() != null && (iMessageCell.getMessageObject() == replyMessage || iMessageCell.getMessageObject().getId() == replyMessage.getId())) {
                    return childAt;
                }
            }
            return null;
        }

        public boolean isReplyMessageCell(ChatMessageCell chatMessageCell) {
            MessageObject replyMessage;
            if (chatMessageCell == null || chatMessageCell.getMessageObject() == null || (replyMessage = getReplyMessage()) == null) {
                return false;
            }
            return chatMessageCell.getMessageObject() == replyMessage || chatMessageCell.getMessageObject().getId() == replyMessage.getId();
        }

        public boolean isReplyToRichMessage() {
            MessageObject replyMessage;
            TLRPC.Message message;
            return (this.currentTab != 0 || (replyMessage = getReplyMessage()) == null || (message = replyMessage.messageOwner) == null || message.rich_message == null) ? false : true;
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.currentTab == 0) {
                AndroidUtilities.forEachViews((RecyclerView) this.chatListView, (Consumer) new UniversalRecyclerView$$ExternalSyntheticLambda3(this, 1));
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            updateSelection();
            this.firstAttach = true;
            this.firstLayout = true;
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            updatePositions();
            this.firstLayout = false;
        }

        @Override
        public void onMeasure(int i, int i2) {
            MessagePreviewView.this.isLandscapeMode = View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2);
            this.buttonsHeight = 0;
            this.menu.measure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
            int i3 = this.buttonsHeight;
            int measuredHeight = this.menu.getMeasuredHeight();
            Rect rect = this.rect;
            this.buttonsHeight = Math.max(i3, measuredHeight + rect.top + rect.bottom);
            ((ViewGroup.MarginLayoutParams) this.chatListView.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.ActionBar.getCurrentActionBarHeight();
            if (MessagePreviewView.this.isLandscapeMode) {
                this.chatPreviewContainer.getLayoutParams().height = -1;
                ((ViewGroup.MarginLayoutParams) this.chatPreviewContainer.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
                ((ViewGroup.MarginLayoutParams) this.chatPreviewContainer.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                this.chatPreviewContainer.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i) * 0.6f));
                this.menu.getLayoutParams().height = -1;
            } else {
                ((ViewGroup.MarginLayoutParams) this.chatPreviewContainer.getLayoutParams()).topMargin = 0;
                ((ViewGroup.MarginLayoutParams) this.chatPreviewContainer.getLayoutParams()).bottomMargin = 0;
                this.chatPreviewContainer.getLayoutParams().height = (View.MeasureSpec.getSize(i2) - AndroidUtilities.dp(6.0f)) - this.buttonsHeight;
                if (this.chatPreviewContainer.getLayoutParams().height < View.MeasureSpec.getSize(i2) * 0.5f) {
                    this.chatPreviewContainer.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i2) * 0.5f);
                }
                this.chatPreviewContainer.getLayoutParams().width = -1;
                this.menu.getLayoutParams().height = View.MeasureSpec.getSize(i2) - this.chatPreviewContainer.getLayoutParams().height;
            }
            int size = (View.MeasureSpec.getSize(i2) + View.MeasureSpec.getSize(i)) << 16;
            if (this.lastSize != size) {
                for (int i4 = 0; i4 < this.messages.previewMessages.size(); i4++) {
                    MessageObject messageObject = this.messages.previewMessages.get(i4);
                    messageObject.parentWidth = MessagePreviewView.this.isLandscapeMode ? this.chatPreviewContainer.getLayoutParams().width : View.MeasureSpec.getSize(i) - AndroidUtilities.dp(16.0f);
                    messageObject.resetLayout();
                    messageObject.forceUpdate = true;
                    Adapter adapter = this.adapter;
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                }
                this.firstLayout = true;
            }
            this.lastSize = size;
            super.onMeasure(i, i2);
        }

        public void updateSelection() {
            MessageObject messageObject;
            if (this.currentTab == 0) {
                TextSelectionHelper.ChatListTextSelectionHelper chatListTextSelectionHelper = this.textSelectionHelper;
                if (chatListTextSelectionHelper.selectionEnd - chatListTextSelectionHelper.selectionStart > MessagesController.getInstance(MessagePreviewView.this.currentAccount).quoteLengthMax) {
                    return;
                }
                MessageObject replyMessage = getReplyMessage(this.textSelectionHelper.getSelectedCell() != null ? ((ChatMessageCell) this.textSelectionHelper.getSelectedCell()).getMessageObject() : null);
                if (MessagePreviewView.this.messagePreviewParams.quote != null && this.textSelectionHelper.isInSelectionMode()) {
                    MessagePreviewParams messagePreviewParams = MessagePreviewView.this.messagePreviewParams;
                    TextSelectionHelper.ChatListTextSelectionHelper chatListTextSelectionHelper2 = this.textSelectionHelper;
                    messagePreviewParams.quoteStart = chatListTextSelectionHelper2.selectionStart;
                    messagePreviewParams.quoteEnd = chatListTextSelectionHelper2.selectionEnd;
                    if (replyMessage != null && ((messageObject = messagePreviewParams.quote.message) == null || messageObject.getId() != replyMessage.getId())) {
                        MessagePreviewParams messagePreviewParams2 = MessagePreviewView.this.messagePreviewParams;
                        messagePreviewParams2.quote = ChatActivity.ReplyQuote.from(replyMessage, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                        MessagePreviewView.this.onQuoteSelectedPart();
                    }
                }
                this.textSelectionHelper.clear();
            }
        }

        public MessageObject getReplyMessage(MessageObject messageObject) {
            MessageObject.GroupedMessages groupedMessagesValueAt;
            MessagePreviewParams.Messages messages = MessagePreviewView.this.messagePreviewParams.replyMessage;
            if (messages == null) {
                return null;
            }
            LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
            if (longSparseArray == null || longSparseArray.size() <= 0 || (groupedMessagesValueAt = MessagePreviewView.this.messagePreviewParams.replyMessage.groupedMessagesMap.valueAt(0)) == null) {
                return MessagePreviewView.this.messagePreviewParams.replyMessage.messages.get(0);
            }
            if (groupedMessagesValueAt.isDocuments) {
                if (messageObject != null) {
                    return messageObject;
                }
                ChatActivity.ReplyQuote replyQuote = MessagePreviewView.this.messagePreviewParams.quote;
                if (replyQuote != null) {
                    return replyQuote.message;
                }
            }
            return groupedMessagesValueAt.captionMessage;
        }
    }

    public static class RLottieToggleDrawable extends Drawable {
        private RLottieDrawable currentState;
        private boolean detached;
        private boolean isState1;
        private RLottieDrawable state1;
        private RLottieDrawable state2;

        public RLottieToggleDrawable(View view, int i, int i2) {
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i, DiffUtil.m(i, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            this.state1 = rLottieDrawable;
            rLottieDrawable.setMasterParent(view);
            this.state1.setAllowDecodeSingleFrame(true);
            this.state1.setPlayInDirectionOfCustomEndFrame(true);
            this.state1.setAutoRepeat(0);
            RLottieDrawable rLottieDrawable2 = new RLottieDrawable(i2, DiffUtil.m(i2, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            this.state2 = rLottieDrawable2;
            rLottieDrawable2.setMasterParent(view);
            this.state2.setAllowDecodeSingleFrame(true);
            this.state2.setPlayInDirectionOfCustomEndFrame(true);
            this.state2.setAutoRepeat(0);
            this.currentState = this.state1;
        }

        public void detach() {
            this.detached = true;
            this.state1.recycle(true);
            this.state2.recycle(true);
        }

        @Override
        public void draw(Canvas canvas) {
            if (this.detached) {
                return;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(getBounds().centerX() - AndroidUtilities.dp(12.0f), getBounds().centerY() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + getBounds().centerX(), AndroidUtilities.dp(12.0f) + getBounds().centerY());
            if (this.currentState.isLastFrame()) {
                RLottieDrawable rLottieDrawable = this.currentState;
                boolean z = this.isState1;
                if (rLottieDrawable != (z ? this.state1 : this.state2)) {
                    RLottieDrawable rLottieDrawable2 = z ? this.state1 : this.state2;
                    this.currentState = rLottieDrawable2;
                    rLottieDrawable2.setCurrentFrame(rLottieDrawable2.getFramesCount() - 1);
                }
            }
            this.currentState.setBounds(rect);
            this.currentState.draw(canvas);
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i) {
            this.state1.setAlpha(i);
            this.state2.setAlpha(i);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.state1.setColorFilter(colorFilter);
            this.state2.setColorFilter(colorFilter);
        }

        public void setState(boolean z, boolean z2) {
            this.isState1 = z;
            if (!z2) {
                RLottieDrawable rLottieDrawable = z ? this.state1 : this.state2;
                this.currentState = rLottieDrawable;
                rLottieDrawable.setCurrentFrame(rLottieDrawable.getFramesCount() - 1);
            } else {
                this.currentState = z ? this.state1 : this.state2;
                this.state1.setCurrentFrame(0);
                this.state2.setCurrentFrame(0);
                this.currentState.start();
            }
        }
    }

    public static class TabsView extends View {
        private Drawable bgDrawable;
        private final Paint bgPaint;
        private int color;
        private float marginBetween;
        private Utilities.Callback<Integer> onTabClick;
        private final Theme.ResourcesProvider resourcesProvider;
        private RectF selectRect;
        private int selectedColor;
        private float selectedTab;
        private float tabInnerPadding;
        public final ArrayList<Tab> tabs;

        public static class Tab {
            final RectF bounds = new RectF();
            final RectF clickBounds = new RectF();
            final int id;
            final Text text;

            public Tab(int i, String str) {
                this.id = i;
                this.text = new Text(str, 14.0f, AndroidUtilities.bold());
            }
        }

        public TabsView(Context context, Theme.ResourcesProvider resourcesProvider) {
            int[] colors;
            super(context);
            this.tabs = new ArrayList<>();
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            this.tabInnerPadding = AndroidUtilities.dp(14.0f);
            this.marginBetween = AndroidUtilities.dp(0.0f);
            this.selectRect = new RectF();
            this.resourcesProvider = resourcesProvider;
            if (Theme.currentTheme.isDark()) {
                this.color = -1862270977;
                this.selectedColor = -1325400065;
                paint.setColor(285212671);
                return;
            }
            int color = Theme.getColor(Theme.key_chat_wallpaper, resourcesProvider);
            if (resourcesProvider instanceof ChatActivity.ThemeDelegate) {
                ChatActivity.ThemeDelegate themeDelegate = (ChatActivity.ThemeDelegate) resourcesProvider;
                if ((themeDelegate.getWallpaperDrawable() instanceof MotionBackgroundDrawable) && (colors = ((MotionBackgroundDrawable) themeDelegate.getWallpaperDrawable()).getColors()) != null) {
                    color = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(colors[0], colors[1]), AndroidUtilities.getAverageColor(colors[2], colors[3]));
                }
            }
            this.color = Theme.adaptHue(-1606201797, color);
            this.selectedColor = Theme.adaptHue(-448573893, color);
            paint.setColor(Theme.adaptHue(814980216, color));
        }

        private int getHitTab(float f, float f2) {
            for (int i = 0; i < this.tabs.size(); i++) {
                if (this.tabs.get(i).clickBounds.contains(f, f2)) {
                    return this.tabs.get(i).id;
                }
            }
            return -1;
        }

        public void addTab(int i, String str) {
            this.tabs.add(new Tab(i, str));
        }

        public boolean containsTab(int i) {
            for (int i2 = 0; i2 < this.tabs.size(); i2++) {
                if (this.tabs.get(i2).id == i) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            if (this.tabs.size() <= 1) {
                return;
            }
            float f = this.selectedTab;
            double d = f;
            int iFloor = (int) Math.floor(d);
            boolean z = iFloor >= 0 && iFloor < this.tabs.size();
            int iCeil = (int) Math.ceil(d);
            boolean z2 = iCeil >= 0 && iCeil < this.tabs.size();
            if (z && z2) {
                AndroidUtilities.lerp(this.tabs.get(iFloor).bounds, this.tabs.get(iCeil).bounds, f - iFloor, this.selectRect);
            } else if (z) {
                this.selectRect.set(this.tabs.get(iFloor).bounds);
            } else if (z2) {
                this.selectRect.set(this.tabs.get(iCeil).bounds);
            }
            Drawable drawable = this.bgDrawable;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (z || z2) {
                canvas.drawRoundRect(this.selectRect, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.bgPaint);
            }
            for (int i = 0; i < this.tabs.size(); i++) {
                Tab tab = this.tabs.get(i);
                tab.text.draw(canvas, tab.bounds.left + this.tabInnerPadding, getMeasuredHeight() / 2.0f, ColorUtils.blendARGB(1.0f - Math.abs(f - i), this.color, this.selectedColor), 1.0f);
            }
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            Utilities.Callback<Integer> callback;
            if (this.tabs.size() <= 1) {
                return false;
            }
            int hitTab = getHitTab(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                return hitTab != -1;
            }
            if (motionEvent.getAction() == 1 && hitTab != -1 && (callback = this.onTabClick) != null) {
                callback.run(Integer.valueOf(hitTab));
            }
            return false;
        }

        public int getColor() {
            return this.color;
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.tabInnerPadding = AndroidUtilities.dp(14.0f);
            float width = 0.0f;
            this.marginBetween = AndroidUtilities.dp(0.0f);
            for (int i3 = 0; i3 < this.tabs.size(); i3++) {
                if (i3 > 0) {
                    width += this.marginBetween;
                }
                width += this.tabs.get(i3).text.getWidth() + this.tabInnerPadding + this.tabInnerPadding;
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float fDp = (measuredHeight - AndroidUtilities.dp(26.0f)) / 2.0f;
            float fDp2 = (AndroidUtilities.dp(26.0f) + measuredHeight) / 2.0f;
            float f = measuredWidth;
            float f2 = (f - width) / 2.0f;
            float f3 = f2;
            for (int i4 = 0; i4 < this.tabs.size(); i4++) {
                float width2 = this.tabs.get(i4).text.getWidth() + this.tabInnerPadding + this.tabInnerPadding;
                this.tabs.get(i4).bounds.set(f3, fDp, f3 + width2, fDp2);
                this.tabs.get(i4).clickBounds.set(this.tabs.get(i4).bounds);
                this.tabs.get(i4).clickBounds.inset((-this.marginBetween) / 2.0f, -fDp);
                f3 += width2 + this.marginBetween;
            }
            Drawable drawable = this.bgDrawable;
            if (drawable != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                drawable.getPadding(rect);
                int i5 = measuredHeight / 2;
                this.bgDrawable.setBounds((((int) f2) - AndroidUtilities.dp(3.0f)) - rect.left, (i5 - AndroidUtilities.dp(16.0f)) - rect.top, AndroidUtilities.dp(3.0f) + ((int) ((f + width) / 2.0f)) + rect.right, AndroidUtilities.dp(16.0f) + i5 + rect.bottom);
            }
        }

        @Override
        public void setBackground(Drawable drawable) {
            this.bgDrawable = drawable;
        }

        public void setOnTabClick(Utilities.Callback<Integer> callback) {
            this.onTabClick = callback;
        }

        public void setSelectedTab(float f) {
            this.selectedTab = f;
            invalidate();
        }
    }

    public static class ToggleButton extends View {
        private boolean first;
        RLottieToggleDrawable iconDrawable;
        private boolean isState1;
        final int minWidth;
        final String text1;
        final String text2;
        AnimatedTextView.AnimatedTextDrawable textDrawable;

        public ToggleButton(Context context, int i, String str, int i2, String str2, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.first = true;
            this.text1 = str;
            this.text2 = str2;
            setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 2, -1));
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, true);
            this.textDrawable = animatedTextDrawable;
            animatedTextDrawable.setAnimationProperties(0.35f, 0L, 300L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.textDrawable.setTextSize(AndroidUtilities.dp(16.0f));
            this.textDrawable.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider));
            this.textDrawable.setCallback(this);
            this.textDrawable.setEllipsizeByGradient(true ^ LocaleController.isRTL);
            if (LocaleController.isRTL) {
                this.textDrawable.setGravity(5);
            }
            int iMax = (int) (Math.max(this.textDrawable.getPaint().measureText(str), this.textDrawable.getPaint().measureText(str2)) + AndroidUtilities.dp(77.0f));
            this.minWidth = iMax;
            this.textDrawable.setOverrideFullWidth(iMax);
            RLottieToggleDrawable rLottieToggleDrawable = new RLottieToggleDrawable(this, i, i2);
            this.iconDrawable = rLottieToggleDrawable;
            rLottieToggleDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider), PorterDuff.Mode.SRC_IN));
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            if (LocaleController.isRTL) {
                this.iconDrawable.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), OKLCH.m$2(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
                this.textDrawable.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
            } else {
                this.iconDrawable.setBounds(AndroidUtilities.dp(17.0f), OKLCH.m$2(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
                this.textDrawable.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
            }
            this.textDrawable.draw(canvas);
            this.iconDrawable.draw(canvas);
        }

        public boolean getState() {
            return this.isState1;
        }

        @Override
        public void onMeasure(int i, int i2) {
            int mode = View.MeasureSpec.getMode(i);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(mode == 1073741824 ? Math.max(View.MeasureSpec.getSize(i), this.minWidth) : Math.min(View.MeasureSpec.getSize(i), this.minWidth), mode), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (getVisibility() != 0 || getAlpha() < 0.5f) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }

        public void setState(boolean z, boolean z2) {
            if (this.first || z != this.isState1) {
                this.isState1 = z;
                this.textDrawable.setText(z ? this.text1 : this.text2, z2 && !LocaleController.isRTL);
                this.iconDrawable.setState(z, z2);
                this.first = false;
                setContentDescription(this.textDrawable.getText());
            }
        }

        @Override
        public boolean verifyDrawable(Drawable drawable) {
            return drawable == this.textDrawable || super.verifyDrawable(drawable);
        }
    }

    public MessagePreviewView(final Context context, ChatActivity chatActivity, BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i, ResourcesDelegate resourcesDelegate, int i2, final boolean z) {
        super(context);
        this.changeBoundsRunnable = new Runnable() {
            @Override
            public void run() {
                ValueAnimator valueAnimator = MessagePreviewView.this.offsetsAnimator;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                MessagePreviewView.this.offsetsAnimator.start();
            }
        };
        this.drawingGroups = new ArrayList<>(10);
        this.showOutdatedQuote = z;
        this.chatActivity = chatActivity;
        this.currentAccount = i;
        this.iBlur3Factory = blurredBackgroundDrawableViewFactory;
        this.currentUser = user;
        this.currentChat = chat;
        this.messagePreviewParams = messagePreviewParams;
        this.resourcesProvider = resourcesDelegate;
        this.viewPager = new ViewPagerFixed(context, resourcesDelegate) {
            @Override
            public void onScrollEnd() {
                View view = this.viewPages[0];
                if (view instanceof Page) {
                    ((Page) view).textSelectionHelper.stopScrolling();
                }
            }

            @Override
            public void onTabAnimationUpdate(boolean z2) {
                MessagePreviewView messagePreviewView = MessagePreviewView.this;
                messagePreviewView.tabsView.setSelectedTab(messagePreviewView.viewPager.getPositionAnimated());
                View view = this.viewPages[0];
                if (view instanceof Page) {
                    ((Page) view).textSelectionHelper.onParentScrolled();
                }
                View view2 = this.viewPages[1];
                if (view2 instanceof Page) {
                    ((Page) view2).textSelectionHelper.onParentScrolled();
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (MessagePreviewView.this.isTouchedHandle()) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        TabsView tabsView = new TabsView(context, resourcesDelegate);
        this.tabsView = tabsView;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(tabsView, null, false);
        blurredBackgroundDrawableCreate.setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(resourcesDelegate));
        blurredBackgroundDrawableCreate.boundProps.hasPadding = true;
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(8.0f));
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(16.0f));
        tabsView.setBackground(blurredBackgroundDrawableCreate);
        int size = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            if (i3 == 0 && messagePreviewParams.replyMessage != null) {
                this.tabsView.addTab(0, LocaleController.getString(R.string.MessageOptionsReply));
            } else if (i3 != 1 || messagePreviewParams.forwardMessages == null || z) {
                if (i3 == 2 && messagePreviewParams.linkMessage != null && !z) {
                    this.tabsView.addTab(2, LocaleController.getString(R.string.MessageOptionsLink));
                }
            } else {
                this.tabsView.addTab(1, LocaleController.getString(R.string.MessageOptionsForward));
            }
            if (i3 == i2) {
                size = this.tabsView.tabs.size() - 1;
            }
        }
        this.viewPager.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public void bindView(View view, int i4, int i5) {
                ((Page) view).bind();
            }

            @Override
            public View createView(int i4) {
                return MessagePreviewView.this.new Page(context, i4);
            }

            @Override
            public int getItemCount() {
                return MessagePreviewView.this.tabsView.tabs.size();
            }

            @Override
            public int getItemViewType(int i4) {
                return MessagePreviewView.this.tabsView.tabs.get(i4).id;
            }
        });
        this.viewPager.setPosition(size);
        this.tabsView.setSelectedTab(size);
        addView(this.tabsView, LayoutHelper.createFrame(-1, 66, 87));
        addView(this.viewPager, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.tabsView.setOnTabClick(new PasscodeView$$ExternalSyntheticLambda8(this, 8));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f$0.lambda$new$1(z, view, motionEvent);
            }
        });
        this.showing = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR).scaleY(1.0f);
        updateColors();
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public void lambda$new$0(Integer num) {
        if (this.tabsView.tabs.get(this.viewPager.getCurrentPosition()).id == num.intValue()) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.tabsView.tabs.size(); i2++) {
            if (this.tabsView.tabs.get(i2).id == num.intValue()) {
                i = i2;
                break;
            }
        }
        if (this.viewPager.getCurrentPosition() == i) {
            return;
        }
        this.viewPager.scrollToPosition(i);
    }

    public boolean lambda$new$1(boolean z, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && !z) {
            dismiss(true);
        }
        return true;
    }

    private void updateColors() {
    }

    public void didSendPressed() {
    }

    public void dismiss(final boolean z) {
        if (this.showing) {
            int i = 0;
            this.showing = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (MessagePreviewView.this.getParent() != null) {
                        ((ViewGroup) MessagePreviewView.this.getParent()).removeView(MessagePreviewView.this);
                    }
                    MessagePreviewView.this.onFullDismiss(z);
                }
            });
            while (true) {
                View[] viewArr = this.viewPager.viewPages;
                if (i >= viewArr.length) {
                    break;
                }
                View view = viewArr[i];
                if (view instanceof Page) {
                    Page page = (Page) view;
                    if (page.currentTab == 0) {
                        page.updateSelection();
                        break;
                    }
                }
                i++;
            }
            onDismiss(z);
        }
    }

    public boolean isShowing() {
        return this.showing;
    }

    public boolean isTouchedHandle() {
        int i = 0;
        while (true) {
            View[] viewArr = this.viewPager.viewPages;
            if (i >= viewArr.length) {
                return false;
            }
            View view = viewArr[i];
            if (view != null) {
                Page page = (Page) view;
                if (page.currentTab == 0) {
                    return page.textSelectionHelper.isTouched();
                }
            }
            i++;
        }
    }

    public void onDismiss(boolean z) {
    }

    public void onFullDismiss(boolean z) {
    }

    public void onQuoteSelectedPart() {
    }

    public void removeForward() {
    }

    public void removeLink() {
    }

    public void removeQuote() {
    }

    public void removeReply() {
    }

    public void selectAnotherChat(boolean z) {
    }

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.sendAsPeer = peer;
        int i = 0;
        while (true) {
            View[] viewArr = this.viewPager.viewPages;
            if (i >= viewArr.length) {
                return;
            }
            View view = viewArr[i];
            if (view != null) {
                Page page = (Page) view;
                if (page.currentTab == 1) {
                    page.updateMessages();
                }
            }
            i++;
        }
    }

    public void updateAll() {
        int i = 0;
        while (true) {
            View[] viewArr = this.viewPager.viewPages;
            if (i >= viewArr.length) {
                return;
            }
            View view = viewArr[i];
            if (view instanceof Page) {
                Page page = (Page) view;
                int i2 = page.currentTab;
                if (i2 == 1) {
                    page.messages = this.messagePreviewParams.forwardMessages;
                } else if (i2 == 0) {
                    page.messages = this.messagePreviewParams.replyMessage;
                } else if (i2 == 2) {
                    page.messages = this.messagePreviewParams.linkMessage;
                }
                page.updateMessages();
                if (page.currentTab == 0) {
                    if (!this.showOutdatedQuote || this.messagePreviewParams.isSecret) {
                        this.messagePreviewParams.quote = null;
                        page.textSelectionHelper.clear();
                        page.switchToQuote(false, true);
                    } else {
                        MessageObject replyMessage = page.getReplyMessage(page.textSelectionHelper.getSelectedCell() != null ? ((ChatMessageCell) page.textSelectionHelper.getSelectedCell()).getMessageObject() : null);
                        if (replyMessage != null) {
                            MessagePreviewParams messagePreviewParams = this.messagePreviewParams;
                            messagePreviewParams.quoteStart = 0;
                            messagePreviewParams.quoteEnd = Math.min(MessagesController.getInstance(this.currentAccount).quoteLengthMax, replyMessage.messageOwner.message.length());
                            MessagePreviewParams messagePreviewParams2 = this.messagePreviewParams;
                            messagePreviewParams2.quote = ChatActivity.ReplyQuote.from(replyMessage, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                            View replyMessageCell = page.getReplyMessageCell();
                            if (replyMessageCell instanceof ChatMessageCell) {
                                MessagePreviewParams messagePreviewParams3 = this.messagePreviewParams;
                                page.textSelectionHelper.select((ChatMessageCell) replyMessageCell, messagePreviewParams3.quoteStart, messagePreviewParams3.quoteEnd);
                            }
                        }
                    }
                    page.updateSubtitle(true);
                }
                ToggleButton toggleButton = page.changeSizeBtn;
                if (toggleButton != null) {
                    toggleButton.animate().alpha(this.messagePreviewParams.hasMedia ? 1.0f : 0.5f).start();
                }
            }
            i++;
        }
    }

    public void updateLink() {
        int i = 0;
        while (true) {
            View[] viewArr = this.viewPager.viewPages;
            if (i >= viewArr.length) {
                return;
            }
            View view = viewArr[i];
            if (view != null) {
                Page page = (Page) view;
                if (page.currentTab == 2) {
                    FrameLayout frameLayout = page.changeSizeBtnContainer;
                    MessagePreviewParams messagePreviewParams = this.messagePreviewParams;
                    frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                    page.changeSizeBtn.setVisibility(this.messagePreviewParams.isVideo ? 4 : 0);
                    page.videoChangeSizeBtn.setVisibility(this.messagePreviewParams.isVideo ? 0 : 4);
                    page.changeSizeBtnContainer.animate().alpha(this.messagePreviewParams.hasMedia ? 1.0f : 0.5f).start();
                    page.changeSizeBtn.setState(this.messagePreviewParams.webpageSmall, true);
                    page.videoChangeSizeBtn.setState(this.messagePreviewParams.webpageSmall, true);
                    page.changePositionBtn.setState(!this.messagePreviewParams.webpageTop, true);
                    page.updateMessages();
                }
            }
            i++;
        }
    }

    public interface ResourcesDelegate extends Theme.ResourcesProvider {
        @Override
        void applyServiceShaderMatrix(int i, int i2, float f, float f2);

        @Override
        ColorFilter getAnimatedEmojiColorFilter();

        @Override
        int getColor(int i);

        @Override
        int getColorOrDefault(int i);

        @Override
        int getCurrentColor(int i);

        @Override
        Drawable getDrawable(String str);

        @Override
        Paint getPaint(String str);

        Drawable getWallpaperDrawable();

        @Override
        boolean hasGradientService();

        @Override
        boolean isDark();

        boolean isWallpaperMotion();

        @Override
        void setAnimatedColor(int i, int i2);

        public abstract class CC {
            public static Drawable $default$getDrawable(ResourcesDelegate resourcesDelegate, String str) {
                return null;
            }

            public static boolean $default$hasGradientService(ResourcesDelegate resourcesDelegate) {
                return false;
            }

            public static void $default$setAnimatedColor(ResourcesDelegate resourcesDelegate, int i, int i2) {
            }
        }
    }
}
