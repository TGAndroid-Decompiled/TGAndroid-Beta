package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.GridLayoutManagerFixed;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda26;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.IMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda174;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda62;
import org.telegram.ui.ChatActivity$64$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.Gifts.ProfileGiftsContainer$Page$$ExternalSyntheticLambda16;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.PollItemMenu;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.QrActivity$5$$ExternalSyntheticLambda0;
import org.telegram.ui.SettingsActivity;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda4;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public abstract class MessagePreviewView extends FrameLayout {
    public final BubbleActivity.AnonymousClass1 changeBoundsRunnable;
    public final ChatActivity chatActivity;
    public final int currentAccount;
    public final TLRPC.Chat currentChat;
    public final TLRPC.User currentUser;
    public final ArrayList drawingGroups;
    public final BlurredBackgroundDrawableViewFactory iBlur3Factory;
    public boolean isLandscapeMode;
    public final MessagePreviewParams messagePreviewParams;
    public ValueAnimator offsetsAnimator;
    public final ResourcesDelegate resourcesProvider;
    public boolean returnSendersNames;
    public TLRPC.Peer sendAsPeer;
    public final boolean showOutdatedQuote;
    public boolean showing;
    public final TabsView tabsView;
    public final AnonymousClass2 viewPager;

    public final class Page extends FrameLayout {
        public final IntroActivity.AnonymousClass1 actionBar;
        public final Adapter adapter;
        public int buttonsHeight;
        public final ToggleButton changePositionBtn;
        public final ToggleButton changeSizeBtn;
        public final FrameLayout changeSizeBtnContainer;
        public final AnonymousClass6 chatListView;
        public final AnonymousClass2 chatPreviewContainer;
        public int chatTopOffset;
        public final AnonymousClass13 clearQuoteButton;
        public final int currentTab;
        public int currentTopOffset;
        public boolean firstAttach;
        public boolean firstLayout;
        public final AnonymousClass7 itemAnimator;
        public int lastSize;
        public final ActionBarPopupWindow.ActionBarPopupWindowLayout menu;
        public final int menuBack;
        public MessagePreviewParams.Messages messages;
        public final ActionBarMenuSubItem quoteAnotherChatButton;
        public final AnonymousClass13 quoteButton;
        public AnimatorSet quoteSwitcher;
        public final Rect rect;
        public final ActionBarMenuSubItem replyAnotherChatButton;
        public int scrollToQuoteEndY;
        public int scrollToQuoteStartY;
        public final ChatMessageSharedResources sharedResources;
        public boolean shouldScrollToQuote;
        public final AnonymousClass4 textSelectionHelper;
        public final TextSelectionHelper.TextSelectionOverlay textSelectionOverlay;
        public final ChatActivity.AnonymousClass64 this$0;
        public boolean toQuote;
        public boolean updateAfterAnimations;
        public boolean updateScroll;
        public final ToggleButton videoChangeSizeBtn;
        public float yOffset;

        public final class AnonymousClass10 extends GridLayoutManagerFixed {
            public AnonymousClass10() {
                super(true);
            }

            @Override
            public final boolean hasSiblingChild(int i) {
                byte b;
                Page page = Page.this;
                MessageObject messageObject = page.messages.previewMessages.get(i);
                MessageObject.GroupedMessages groupedMessagesAccess$1300 = Page.access$1300(page, messageObject);
                if (groupedMessagesAccess$1300 != null) {
                    MessageObject.GroupedMessagePosition position = groupedMessagesAccess$1300.getPosition(messageObject);
                    if (position.minX != position.maxX && (b = position.minY) == position.maxY && b != 0) {
                        int size = groupedMessagesAccess$1300.posArray.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition = groupedMessagesAccess$1300.posArray.get(i2);
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
            public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    super.onLayoutChildren(recycler, state);
                    return;
                }
                try {
                    super.onLayoutChildren(recycler, state);
                } catch (Exception e) {
                    FileLog.e(e);
                    AndroidUtilities.runOnUIThread(new HintView$1$$ExternalSyntheticLambda0(this, 20));
                }
            }

            @Override
            public final boolean shouldLayoutChildFromOpositeSide(View view) {
                return false;
            }
        }

        public final class AnonymousClass12 extends RecyclerView.ItemDecoration {
            @Override
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
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
                int i = 0;
                while (true) {
                    float[] fArr = currentPosition.siblingHeights;
                    if (i >= fArr.length) {
                        break;
                    }
                    extraInsetHeight += (int) Math.ceil(fArr[i] * fMax);
                    i++;
                }
                int iRound = (Math.round(AndroidUtilities.density * 7.0f) * (currentPosition.maxY - currentPosition.minY)) + extraInsetHeight;
                int size = currentMessagesGroup.posArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = currentMessagesGroup.posArray.get(i2);
                    byte b = groupedMessagePosition.minY;
                    byte b2 = currentPosition.minY;
                    if (b == b2 && ((groupedMessagePosition.minX != currentPosition.minX || groupedMessagePosition.maxX != currentPosition.maxX || b != b2 || groupedMessagePosition.maxY != currentPosition.maxY) && b == b2)) {
                        iRound = RichMessageLayout$$ExternalSyntheticOutline1.m((int) Math.ceil(fMax * groupedMessagePosition.ph), 4.0f, iRound);
                        break;
                    }
                }
                rect.bottom = -iRound;
            }
        }

        public final class AnonymousClass4 extends TextSelectionHelper.ChatListTextSelectionHelper {
            public AnonymousClass4() {
                this.resourcesProvider = Page.this.this$0.resourcesProvider;
            }

            @Override
            public final boolean canCopy() {
                MessageObject replyMessage;
                TLRPC.Message message;
                Page page = Page.this;
                if (page.currentTab == 0 && (replyMessage = page.getReplyMessage(null)) != null && (message = replyMessage.messageOwner) != null && message.rich_message != null) {
                    return false;
                }
                MessagePreviewParams messagePreviewParams = page.this$0.messagePreviewParams;
                return messagePreviewParams == null || !messagePreviewParams.noforwards;
            }

            @Override
            public final boolean canShowQuote() {
                MessageObject replyMessage;
                TLRPC.Message message;
                Page page = Page.this;
                int i = page.currentTab;
                if (i != 0 || page.this$0.messagePreviewParams.isSecret) {
                    return false;
                }
                return i != 0 || (replyMessage = page.getReplyMessage(null)) == null || (message = replyMessage.messageOwner) == null || message.rich_message == null;
            }

            @Override
            public final Theme.ResourcesProvider getResourcesProvider() {
                return this.resourcesProvider;
            }

            @Override
            public final void invalidate() {
                super.invalidate();
                AnonymousClass6 anonymousClass6 = Page.this.chatListView;
                if (anonymousClass6 != null) {
                    anonymousClass6.invalidate();
                }
            }

            @Override
            public final boolean isSelected(MessageObject messageObject) {
                Page page = Page.this;
                return page.currentTab == 0 && !page.this$0.messagePreviewParams.isSecret && isInSelectionMode();
            }

            @Override
            public final void onQuoteClick(int i, int i2, MessageObject messageObject) {
                ChatActivity.ReplyQuote replyQuote;
                MessageObject messageObject2;
                Page page = Page.this;
                AnonymousClass4 anonymousClass4 = page.textSelectionHelper;
                int i3 = anonymousClass4.selectionEnd - anonymousClass4.selectionStart;
                ChatActivity.AnonymousClass64 anonymousClass64 = page.this$0;
                if (i3 > MessagesController.getInstance(anonymousClass64.currentAccount).quoteLengthMax) {
                    page.showQuoteLengthError();
                    return;
                }
                AnonymousClass4 anonymousClass5 = page.textSelectionHelper;
                int i4 = anonymousClass5.selectionStart;
                MessagePreviewParams messagePreviewParams = anonymousClass64.messagePreviewParams;
                messagePreviewParams.quoteStart = i4;
                messagePreviewParams.quoteEnd = anonymousClass5.selectionEnd;
                MessageObject replyMessage = page.getReplyMessage(messageObject);
                if (replyMessage != null && ((replyQuote = anonymousClass64.messagePreviewParams.quote) == null || (messageObject2 = replyQuote.message) == null || messageObject2.getId() != replyMessage.getId())) {
                    anonymousClass64.messagePreviewParams.quote = ChatActivity.ReplyQuote.from(i, i2, replyMessage);
                }
                anonymousClass64.onQuoteSelectedPart();
                anonymousClass64.dismiss(true);
            }
        }

        public final class AnonymousClass6 extends RecyclerListView {
            public AnonymousClass6(Context context, Theme.ResourcesProvider resourcesProvider) {
                super(context, resourcesProvider);
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                Page page;
                boolean z;
                ChatActivity.AnonymousClass64 anonymousClass64;
                Canvas canvas2;
                float f;
                MessageObject.GroupedMessages currentMessagesGroup;
                MessageObject.GroupedMessages currentMessagesGroup2;
                ?? r1 = 0;
                int i = 0;
                while (true) {
                    int childCount = getChildCount();
                    page = Page.this;
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i);
                    if (childAt instanceof ChatMessageCell) {
                        ((ChatMessageCell) childAt).setParentViewSize(page.chatPreviewContainer.getMeasuredWidth(), page.chatPreviewContainer.getBackgroundSizeY());
                    }
                    i++;
                }
                int childCount2 = getChildCount();
                MessageObject.GroupedMessages groupedMessages = null;
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = getChildAt(i2);
                    if ((childAt2 instanceof ChatMessageCell) && ((currentMessagesGroup2 = ((ChatMessageCell) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != groupedMessages)) {
                        groupedMessages = currentMessagesGroup2;
                    }
                }
                int i3 = 0;
                while (i3 < 3) {
                    page.this$0.drawingGroups.clear();
                    AnonymousClass6 anonymousClass6 = page.chatListView;
                    if (i3 != 2 || anonymousClass6.fastScrollAnimationRunning) {
                        int i4 = 0;
                        while (true) {
                            z = true;
                            anonymousClass64 = page.this$0;
                            if (i4 >= childCount2) {
                                break;
                            }
                            View childAt3 = anonymousClass6.getChildAt(i4);
                            if (childAt3 instanceof ChatMessageCell) {
                                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt3;
                                if (childAt3.getY() <= anonymousClass6.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup()) != null && ((i3 != 0 || currentMessagesGroup.messages.size() != 1) && ((i3 != 1 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i3 != 0 || !chatMessageCell.getMessageObject().deleted) && ((i3 != 1 || chatMessageCell.getMessageObject().deleted) && ((i3 != 2 || chatMessageCell.willRemoved) && (i3 == 2 || !chatMessageCell.willRemoved))))))) {
                                    if (!anonymousClass64.drawingGroups.contains(currentMessagesGroup)) {
                                        MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                        transitionParams.left = r1;
                                        transitionParams.top = r1;
                                        transitionParams.right = r1;
                                        transitionParams.bottom = r1;
                                        transitionParams.pinnedBotton = r1;
                                        transitionParams.pinnedTop = r1;
                                        transitionParams.cell = chatMessageCell;
                                        anonymousClass64.drawingGroups.add(currentMessagesGroup);
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
                                    if (chatMessageCell.willRemoved) {
                                        currentMessagesGroup.transitionParams.cell = chatMessageCell;
                                    }
                                    MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                    int i5 = transitionParams2.top;
                                    if (i5 == 0 || backgroundDrawableTop < i5) {
                                        transitionParams2.top = backgroundDrawableTop;
                                    }
                                    int i6 = transitionParams2.bottom;
                                    if (i6 == 0 || backgroundDrawableBottom > i6) {
                                        transitionParams2.bottom = backgroundDrawableBottom;
                                    }
                                    int i7 = transitionParams2.left;
                                    if (i7 == 0 || backgroundDrawableLeft < i7) {
                                        transitionParams2.left = backgroundDrawableLeft;
                                    }
                                    int i8 = transitionParams2.right;
                                    if (i8 == 0 || backgroundDrawableRight > i8) {
                                        transitionParams2.right = backgroundDrawableRight;
                                    }
                                }
                            }
                            i4++;
                        }
                        int i9 = 0;
                        while (i9 < anonymousClass64.drawingGroups.size()) {
                            MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) anonymousClass64.drawingGroups.get(i9);
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
                                if (fDp > AndroidUtilities.dp(20.0f) + anonymousClass6.getMeasuredHeight()) {
                                    fDp = AndroidUtilities.dp(20.0f) + anonymousClass6.getMeasuredHeight();
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
                                    for (int i10 = 0; i10 < childCount2; i10++) {
                                        View childAt4 = anonymousClass6.getChildAt(i10);
                                        if (childAt4 instanceof ChatMessageCell) {
                                            ChatMessageCell chatMessageCell2 = (ChatMessageCell) childAt4;
                                            if (chatMessageCell2.getCurrentMessagesGroup() == groupedMessages2) {
                                                int left = chatMessageCell2.getLeft();
                                                int top = chatMessageCell2.getTop();
                                                childAt4.setPivotX(((f3 - f2) / f) + (f2 - left));
                                                childAt4.setPivotY(((fDp - translationY) / f) + (translationY - top));
                                            }
                                        }
                                    }
                                }
                            }
                            i9++;
                            z = true;
                        }
                    }
                    i3++;
                    r1 = 0;
                }
                super.dispatchDraw(canvas);
            }

            @Override
            public final boolean drawChild(Canvas canvas, View view, long j) {
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
                    chatMessageCell.drawCaptionLayout(chatMessageCell.getAlpha(), canvas, false);
                    chatMessageCell.drawReactionsLayout(canvas, chatMessageCell.getAlpha(), null);
                    chatMessageCell.drawCommentLayout(canvas, chatMessageCell.getAlpha());
                }
                if (chatMessageCell.getCurrentMessagesGroup() != null || chatMessageCell.getTransitionParams().animateBackgroundBoundsInner) {
                    chatMessageCell.drawNamesLayout(canvas, chatMessageCell.getAlpha());
                }
                if ((chatMessageCell.getCurrentPosition() != null && chatMessageCell.getCurrentPosition().last) || chatMessageCell.getTransitionParams().animateBackgroundBoundsInner) {
                    chatMessageCell.drawTime(chatMessageCell.getAlpha(), canvas, true);
                }
                chatMessageCell.drawOverlays(canvas);
                canvas.restore();
                chatMessageCell.getTransitionParams().recordDrawingStatePreview();
                canvas.restore();
                return zDrawChild;
            }

            @Override
            public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                Page page = Page.this;
                boolean z2 = page.firstLayout;
                int i5 = page.currentTab;
                if (z2) {
                    if (i5 != 0) {
                        scrollToPosition(0);
                    }
                    page.firstLayout = false;
                }
                super.onLayout(z, i, i2, i3, i4);
                page.updatePositions();
                if (page.updateScroll) {
                    AnonymousClass6 anonymousClass6 = page.chatListView;
                    if (anonymousClass6.computeVerticalScrollRange() > anonymousClass6.computeVerticalScrollExtent()) {
                        page.postDelayed(new MessagePreviewView$Page$$ExternalSyntheticLambda10(page, 1), 0L);
                    }
                    page.updateScroll = false;
                }
                if (page.shouldScrollToQuote && i5 == 0) {
                    int i6 = page.scrollToQuoteStartY;
                    int i7 = page.scrollToQuoteEndY;
                    page.shouldScrollToQuote = false;
                    post(new ArticleViewer$$ExternalSyntheticLambda26(this, i6, i7, 10));
                }
            }

            @Override
            public final void onScrollStateChanged(int i) {
                if (i == 0) {
                    AnonymousClass4 anonymousClass4 = Page.this.textSelectionHelper;
                    anonymousClass4.parentIsScrolling = false;
                    anonymousClass4.textSelectionOverlay.invalidate();
                    ChatActivity$$ExternalSyntheticLambda174 chatActivity$$ExternalSyntheticLambda174 = anonymousClass4.showActionsRunnable;
                    AndroidUtilities.cancelRunOnUIThread(chatActivity$$ExternalSyntheticLambda174);
                    AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda174);
                }
            }

            @Override
            public final void onScrolled(int i, int i2) {
                Page.this.textSelectionHelper.onParentScrolled();
            }
        }

        public final class AnonymousClass7 extends ChatListItemAnimator {
            public Runnable finishRunnable;
            public int scrollAnimationIndex;

            public AnonymousClass7(AnonymousClass6 anonymousClass6, Theme.ResourcesProvider resourcesProvider) {
                super(null, anonymousClass6, resourcesProvider);
                this.scrollAnimationIndex = -1;
            }

            @Override
            public final void endAnimations() {
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
            public final void onAllAnimationsDone() {
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
            public final void onAnimationStart() {
                Page page = Page.this;
                AndroidUtilities.cancelRunOnUIThread(page.this$0.changeBoundsRunnable);
                page.this$0.changeBoundsRunnable.run();
                if (this.scrollAnimationIndex == -1) {
                    this.scrollAnimationIndex = NotificationCenter.getInstance(page.this$0.currentAccount).setAnimationInProgress(this.scrollAnimationIndex, null, false);
                }
                Runnable runnable = this.finishRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.finishRunnable = null;
                }
            }
        }

        public final class Adapter extends RecyclerView.Adapter {
            public Adapter() {
            }

            public static int offset(boolean z, int i, ChatMessageCell chatMessageCell) {
                MessageObject messageObject;
                int iM;
                ArrayList<MessageObject.TextLayoutBlock> arrayList;
                CharSequence charSequence;
                float lineBottom;
                MessageObject.TextLayoutBlocks textLayoutBlocks;
                if (chatMessageCell != null && (messageObject = chatMessageCell.getMessageObject()) != null && messageObject.getGroupId() == 0) {
                    if (TextUtils.isEmpty(messageObject.caption) || (textLayoutBlocks = chatMessageCell.captionLayout) == null) {
                        chatMessageCell.layoutTextXY(true);
                        iM = chatMessageCell.textY;
                        CharSequence charSequence2 = messageObject.messageText;
                        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                        if (chatMessageCell.linkPreviewAbove) {
                            iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(chatMessageCell.linkPreviewHeight, 10.0f, iM);
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
                                int i4 = i - i3;
                                int length = string.length() - 1;
                                ChatMessageCell.TransitionParams transitionParams = chatMessageCell.transitionParams;
                                if (i4 > length) {
                                    lineBottom = iM + ((int) (textLayoutBlock.textYOffset(arrayList, transitionParams) + textLayoutBlock.padTop + textLayoutBlock.height));
                                } else {
                                    int lineForOffset = staticLayout.getLineForOffset(i - textLayoutBlock.charactersOffset);
                                    lineBottom = (z ? staticLayout.getLineBottom(lineForOffset) : staticLayout.getLineTop(lineForOffset)) + textLayoutBlock.textYOffset(arrayList, transitionParams) + iM + textLayoutBlock.padTop;
                                }
                                return (int) lineBottom;
                            }
                        }
                    }
                }
                return 0;
            }

            @Override
            public final int getItemCount() {
                MessagePreviewParams.Messages messages = Page.this.messages;
                if (messages == null) {
                    return 0;
                }
                return messages.previewMessages.size();
            }

            @Override
            public final int getItemViewType(int i) {
                return 0;
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                Page page = Page.this;
                MessagePreviewParams.Messages messages = page.messages;
                if (messages != null && viewHolder.mItemViewType == 0) {
                    ChatMessageCell chatMessageCell = (ChatMessageCell) viewHolder.itemView;
                    chatMessageCell.setInvalidateSpoilersParent(messages.hasSpoilers);
                    AnonymousClass6 anonymousClass6 = page.chatListView;
                    chatMessageCell.setParentViewSize(anonymousClass6.getMeasuredWidth(), anonymousClass6.getMeasuredHeight());
                    int id = chatMessageCell.getMessageObject() != null ? chatMessageCell.getMessageObject().getId() : 0;
                    int i2 = page.currentTab;
                    if (i2 == 2) {
                        page.this$0.messagePreviewParams.checkCurrentLink(page.messages.previewMessages.get(i));
                    }
                    MessageObject messageObject = page.messages.previewMessages.get(i);
                    MessagePreviewParams.Messages messages2 = page.messages;
                    chatMessageCell.setMessageObject(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i).getGroupId()), true, true, false, false);
                    if (i2 == 1) {
                        chatMessageCell.setDelegate(new PollItemMenu.AnonymousClass8(25));
                    }
                    if (page.messages.previewMessages.size() > 1) {
                        chatMessageCell.setCheckBoxVisible(i2 == 1, false);
                        boolean z = id == page.messages.previewMessages.get(i).getId();
                        MessagePreviewParams.Messages messages3 = page.messages;
                        boolean z2 = messages3.selectedIds.get(messages3.previewMessages.get(i).getId(), false);
                        chatMessageCell.setChecked(z2, z2, z);
                    }
                }
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                Context context = viewGroup.getContext();
                Page page = Page.this;
                ChatActivity.AnonymousClass64 anonymousClass64 = page.this$0;
                ChatMessageCell chatMessageCell = new ChatMessageCell(context, anonymousClass64.currentAccount, page.sharedResources, anonymousClass64.resourcesProvider) {
                    @Override
                    public final void invalidate() {
                        super.invalidate();
                        Page.this.chatListView.invalidate();
                    }

                    @Override
                    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                        super.onLayout(z, i2, i3, i4, i5);
                        Page.access$1600(Page.this, this);
                    }

                    @Override
                    public final void setMessageObject(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z, boolean z2, boolean z3, boolean z4) {
                        super.setMessageObject(messageObject, groupedMessages, z, z2, z3, z4);
                        Page.access$1600(Page.this, this);
                    }

                    @Override
                    public final void invalidate(int i2, int i3, int i4, int i5) {
                        super.invalidate(i2, i3, i4, i5);
                        Page.this.chatListView.invalidate();
                    }
                };
                chatMessageCell.setClipChildren(false);
                chatMessageCell.setClipToPadding(false);
                chatMessageCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
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
                        Page page2 = Page.this;
                        if (page2.currentTab != 2) {
                            return false;
                        }
                        MessagePreviewParams messagePreviewParams = page2.this$0.messagePreviewParams;
                        return (messagePreviewParams.singleLink || messagePreviewParams.isSecret) ? false : true;
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
                    public final boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat) {
                        return false;
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
                    public final boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user) {
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
                    public final boolean didPressAnimatedEmoji(AnimatedEmojiSpan animatedEmojiSpan) {
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
                    public final void didPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i2, float f, float f2, boolean z) {
                    }

                    @Override
                    public final void didPressChannelRecommendation(ChatMessageCell chatMessageCell2, TLObject tLObject, boolean z) {
                    }

                    @Override
                    public final void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public final void didPressCodeCopy(MessageObject.TextLayoutBlock textLayoutBlock) {
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
                    public final void didPressFactCheckWhat(ChatMessageCell chatMessageCell2, int i2, int i3) {
                    }

                    @Override
                    public final void didPressGiveawayChatButton(int i2, ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public final void didPressGroupImage(ChatMessageCell chatMessageCell2, TLRPC.MessageExtendedMedia messageExtendedMedia) {
                    }

                    @Override
                    public final void didPressHiddenForward(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public final void didPressHint(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public final void didPressImage(ChatMessageCell chatMessageCell2, float f, float f2, boolean z) {
                    }

                    @Override
                    public final void didPressInstantButton(int i2, ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public final void didPressMoreChannelRecommendations() {
                    }

                    @Override
                    public final void didPressOther(ChatMessageCell chatMessageCell2, float f, float f2) {
                    }

                    @Override
                    public final void didPressPollMedia(ChatMessageCell chatMessageCell2, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i2) {
                    }

                    @Override
                    public final void didPressReaction(ChatMessageCell chatMessageCell2, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                    }

                    @Override
                    public final void didPressReplyMessage(ChatMessageCell chatMessageCell2, int i2, float f, float f2, boolean z) {
                    }

                    @Override
                    public final void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public final void didPressRichDocumentOptions(ChatMessageCell chatMessageCell2, TLRPC.Document document) {
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
                    public final void didPressSummarize(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public final void didPressTime() {
                    }

                    @Override
                    public final boolean didPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem, boolean z) {
                        return false;
                    }

                    @Override
                    public final void didPressUrl(ChatMessageCell chatMessageCell2, CharacterStyle characterStyle, boolean z) {
                        Adapter adapter = Adapter.this;
                        Page page2 = Page.this;
                        if (page2.currentTab != 2 || page2.this$0.messagePreviewParams.currentLink == characterStyle || chatMessageCell2.getMessageObject() == null || !(characterStyle instanceof URLSpan)) {
                            return;
                        }
                        String url = ((URLSpan) characterStyle).getURL();
                        ChatActivity.AnonymousClass64 anonymousClass65 = Page.this.this$0;
                        MessagePreviewParams messagePreviewParams = anonymousClass65.messagePreviewParams;
                        messagePreviewParams.currentLink = characterStyle;
                        messagePreviewParams.webpage = null;
                        ChatActivity chatActivity = anonymousClass65.chatActivity;
                        if (chatActivity != null && url != null) {
                            chatActivity.searchLinks(url, true);
                        }
                        Page.access$1600(Page.this, chatMessageCell2);
                    }

                    @Override
                    public final void didPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user, float f, float f2) {
                    }

                    @Override
                    public final void didPressUserStatus(ChatMessageCell chatMessageCell2, TLRPC.User user, TLRPC.Document document, String str) {
                    }

                    @Override
                    public final void didPressViaBot(String str) {
                    }

                    @Override
                    public final void didPressViaBotNotInline(ChatMessageCell chatMessageCell2, long j) {
                    }

                    @Override
                    public final void didPressVoteButtons(ChatMessageCell chatMessageCell2, ArrayList arrayList, int i2, int i3, int i4) {
                    }

                    @Override
                    public final void didPressWebPage(ChatMessageCell chatMessageCell2, TLRPC.WebPage webPage, String str, boolean z) {
                        ArticleViewer.IBlock.CC.$default$didPressWebPage(chatMessageCell2, str);
                    }

                    @Override
                    public final void didQuickShareEnd(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public final void didQuickShareMove(ChatMessageCell chatMessageCell2, float f, float f2) {
                    }

                    @Override
                    public final void didQuickShareStart(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public final void didStartVideoStream(MessageObject messageObject) {
                    }

                    @Override
                    public final void didTogglePollPreview(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public final void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2, FileLoader$$ExternalSyntheticLambda1 fileLoader$$ExternalSyntheticLambda1) {
                    }

                    @Override
                    public final boolean doNotShowLoadingReply(MessageObject messageObject) {
                        return ArticleViewer.IBlock.CC.$default$doNotShowLoadingReply(messageObject);
                    }

                    @Override
                    public final void drawPollMode(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public final void forceUpdate(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public final void forceUpdateNoAnimation(ChatMessageCell chatMessageCell2) {
                    }

                    @Override
                    public final int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell2) {
                        return 0;
                    }

                    @Override
                    public final String getAdminRank(long j) {
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
                        Page page2 = Page.this;
                        if (page2.currentTab != 2) {
                            return null;
                        }
                        MessagePreviewParams messagePreviewParams = page2.this$0.messagePreviewParams;
                        if (messagePreviewParams.singleLink) {
                            return null;
                        }
                        return messagePreviewParams.currentLink;
                    }

                    @Override
                    public final TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                        return Page.this.textSelectionHelper;
                    }

                    @Override
                    public final boolean hasSelectedMessages() {
                        return true;
                    }

                    @Override
                    public final void invalidateBlur() {
                    }

                    @Override
                    public final boolean isAdmin(long j) {
                        return false;
                    }

                    @Override
                    public final boolean isLandscape() {
                        return false;
                    }

                    @Override
                    public final boolean isOwner(long j) {
                        return false;
                    }

                    @Override
                    public final boolean isProgressLoading(int i2, ChatMessageCell chatMessageCell2) {
                        Page page2 = Page.this;
                        if (page2.currentTab != 2 || i2 != 1) {
                            return false;
                        }
                        MessagePreviewParams messagePreviewParams = page2.this$0.messagePreviewParams;
                        if (messagePreviewParams.singleLink) {
                            return false;
                        }
                        TLRPC.WebPage webPage = messagePreviewParams.webpage;
                        return webPage == null || (webPage instanceof TLRPC.TL_webPagePending);
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
                    public final void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i2, int i3) {
                    }

                    @Override
                    public final boolean needPlayMessage(ChatMessageCell chatMessageCell2, MessageObject messageObject) {
                        return false;
                    }

                    @Override
                    public final void needReloadPolls() {
                    }

                    @Override
                    public final void needShowPremiumBulletin(int i2) {
                    }

                    @Override
                    public final boolean onAccessibilityAction(int i2) {
                        return false;
                    }

                    @Override
                    public final void onDiceFinished() {
                    }

                    @Override
                    public final void openArticlePhoto(ChatMessageCell chatMessageCell2, TL_iv.PageBlock pageBlock) {
                    }

                    @Override
                    public final void setShouldNotRepeatSticker(MessageObject messageObject) {
                    }

                    @Override
                    public final boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell2, boolean z) {
                        return false;
                    }

                    @Override
                    public final boolean shouldRepeatSticker(MessageObject messageObject) {
                        return true;
                    }

                    @Override
                    public final void videoTimerReached() {
                    }

                    @Override
                    public final void forceUpdate(ChatMessageCell chatMessageCell2, boolean z) {
                    }
                });
                return new RecyclerListView.Holder(chatMessageCell);
            }

            @Override
            public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                int i;
                MessageObject replyMessage;
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
                    MessageObject.GroupedMessages groupedMessagesAccess$1300 = Page.access$1300(page, chatMessageCell.getMessageObject());
                    chatMessageCell.setDrawSelectionBackground(groupedMessagesAccess$1300 == null);
                    chatMessageCell.setChecked(true, groupedMessagesAccess$1300 == null, false);
                    ChatActivity.AnonymousClass64 anonymousClass64 = page.this$0;
                    MessagePreviewParams messagePreviewParams = anonymousClass64.messagePreviewParams;
                    if (messagePreviewParams.isSecret || messagePreviewParams.quote == null || chatMessageCell.getMessageObject() == null || (replyMessage = page.getReplyMessage(null)) == null) {
                        return;
                    }
                    if (chatMessageCell.getMessageObject() == replyMessage || chatMessageCell.getMessageObject().getId() == replyMessage.getId()) {
                        AnonymousClass4 anonymousClass4 = page.textSelectionHelper;
                        if (anonymousClass4.isInSelectionMode()) {
                            return;
                        }
                        MessagePreviewParams messagePreviewParams2 = anonymousClass64.messagePreviewParams;
                        anonymousClass4.select(chatMessageCell, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                        if (page.firstAttach) {
                            page.scrollToQuoteStartY = offset(false, anonymousClass64.messagePreviewParams.quoteStart, chatMessageCell);
                            page.scrollToQuoteEndY = offset(true, anonymousClass64.messagePreviewParams.quoteEnd, chatMessageCell);
                            page.shouldScrollToQuote = true;
                            page.firstAttach = false;
                        }
                    }
                }
            }
        }

        public Page(ChatActivity.AnonymousClass64 anonymousClass64, Context context, int i) {
            final Page page;
            int i2;
            Context context2;
            Page page2;
            boolean z;
            ToggleButton toggleButton;
            ToggleButton toggleButton2;
            Page page3;
            MessagePreviewParams.Messages messages;
            ResourcesDelegate resourcesDelegate;
            ViewGroup viewGroup;
            Context context3 = context;
            int i3 = 2;
            int i4 = 4;
            this.this$0 = anonymousClass64;
            super(context3);
            final int i5 = 1;
            this.firstLayout = true;
            this.scrollToQuoteStartY = -1;
            this.scrollToQuoteEndY = -1;
            int i6 = 0;
            this.shouldScrollToQuote = false;
            this.rect = new Rect();
            this.updateScroll = false;
            this.firstAttach = true;
            this.sharedResources = new ChatMessageSharedResources(context3);
            this.currentTab = i;
            setOnTouchListener(new TodoItemMenu$$ExternalSyntheticLambda4(this, 6));
            ?? r3 = new SizeNotifierFrameLayout(context3) {
                @Override
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getY() < Page.this.currentTopOffset) {
                        return false;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }

                @Override
                public final Drawable getNewDrawable() {
                    Drawable wallpaperDrawable = ((ChatActivity.ThemeDelegate) Page.this.this$0.resourcesProvider).getWallpaperDrawable();
                    return wallpaperDrawable != null ? wallpaperDrawable : super.getNewDrawable();
                }
            };
            this.chatPreviewContainer = r3;
            ResourcesDelegate resourcesDelegate2 = anonymousClass64.resourcesProvider;
            Drawable wallpaperDrawable = ((ChatActivity.ThemeDelegate) resourcesDelegate2).getWallpaperDrawable();
            if (((ChatActivity.ThemeDelegate) resourcesDelegate2).chatTheme == null) {
                int i7 = Theme.default_shadow_color;
            }
            r3.setBackgroundImage(wallpaperDrawable);
            r3.setOccupyStatusBar(false);
            r3.setOutlineProvider(new PremiumPreviewFragment.AnonymousClass3(this, i4));
            r3.setClipToOutline(true);
            r3.setElevation(AndroidUtilities.dp(4.0f));
            IntroActivity.AnonymousClass1 anonymousClass1 = new IntroActivity.AnonymousClass1(context3, 10, resourcesDelegate2);
            this.actionBar = anonymousClass1;
            anonymousClass1.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefault, resourcesDelegate2));
            AnonymousClass4 anonymousClass4 = new AnonymousClass4();
            this.textSelectionHelper = anonymousClass4;
            anonymousClass4.callback = new ArticleViewer.AnonymousClass8(this, i3);
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(context3, resourcesDelegate2);
            this.chatListView = anonymousClass6;
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(anonymousClass6, resourcesDelegate2);
            this.itemAnimator = anonymousClass7;
            anonymousClass6.setItemAnimator(anonymousClass7);
            anonymousClass6.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 28));
            anonymousClass6.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(int i8, View view) {
                    Page page4 = Page.this;
                    if (page4.currentTab != 1 || page4.messages.previewMessages.size() <= 1) {
                        return;
                    }
                    int id = page4.messages.previewMessages.get(i8).getId();
                    boolean z2 = page4.messages.selectedIds.get(id, false);
                    boolean z3 = !z2;
                    if (page4.messages.selectedIds.size() == 1 && z2) {
                        return;
                    }
                    if (z2) {
                        page4.messages.selectedIds.delete(id);
                    } else {
                        page4.messages.selectedIds.put(id, z3);
                    }
                    if (view instanceof ChatMessageCell) {
                        ((ChatMessageCell) view).setChecked(z3, z3, true);
                    }
                    page4.updateSubtitle(true);
                }
            });
            Adapter adapter = new Adapter();
            this.adapter = adapter;
            anonymousClass6.setAdapter(adapter);
            anonymousClass6.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
            AnonymousClass10 anonymousClass10 = new AnonymousClass10();
            anonymousClass10.mSpanSizeLookup = new BaseMenuWrapper() {
                @Override
                public final int getSpanSize(int i8) {
                    MessageObject messageObject;
                    MessageObject.GroupedMessages groupedMessagesAccess$1300;
                    if (i8 < 0) {
                        return 1000;
                    }
                    Page page4 = Page.this;
                    if (i8 >= page4.messages.previewMessages.size() || (groupedMessagesAccess$1300 = Page.access$1300(page4, (messageObject = page4.messages.previewMessages.get(i8)))) == null) {
                        return 1000;
                    }
                    return groupedMessagesAccess$1300.getPosition(messageObject).spanSize;
                }
            };
            anonymousClass6.setClipToPadding(false);
            anonymousClass6.setLayoutManager(anonymousClass10);
            anonymousClass6.addItemDecoration(new AnonymousClass12());
            r3.addView(anonymousClass6);
            addView((View) r3, LayoutHelper.createFrame(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
            r3.addView(anonymousClass1, LayoutHelper.createFrame(-2.0f, -1));
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), resourcesDelegate2);
            this.menu = actionBarPopupWindowLayout;
            actionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new MessagePreviewView$Page$$ExternalSyntheticLambda10(this, i6));
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate = anonymousClass64.iBlur3Factory.create(actionBarPopupWindowLayout, null, false);
            blurredBackgroundDrawableCreate.setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(resourcesDelegate2));
            blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(8.0f));
            blurredBackgroundDrawableCreate.boundProps.hasPadding = true;
            blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(12.0f));
            actionBarPopupWindowLayout.setBackground(blurredBackgroundDrawableCreate);
            addView(actionBarPopupWindowLayout, LayoutHelper.createFrame(-2.0f, -2));
            MessagePreviewParams messagePreviewParams = anonymousClass64.messagePreviewParams;
            ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
            if (i != 0 || (messages = messagePreviewParams.replyMessage) == null) {
                if (i != 1 || messagePreviewParams.forwardMessages == null) {
                    page = this;
                    page2 = page;
                    if (i == 2 && messagePreviewParams.linkMessage != null) {
                        ToggleButton toggleButton3 = new ToggleButton(context, R.raw.position_below, LocaleController.getString(R.string.LinkAbove), R.raw.position_above, LocaleController.getString(R.string.LinkBelow), anonymousClass64.resourcesProvider);
                        page.changePositionBtn = toggleButton3;
                        toggleButton3.setState(!messagePreviewParams.webpageTop, false);
                        anonymousClass2.addView(toggleButton3, LayoutHelper.createLinear(-1, 48));
                        FrameLayout frameLayout = new FrameLayout(context);
                        page.changeSizeBtnContainer = frameLayout;
                        frameLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, resourcesDelegate2), 0, 0));
                        int i8 = R.raw.media_shrink;
                        String string = LocaleController.getString(R.string.LinkMediaLarger);
                        int i9 = R.raw.media_enlarge;
                        ToggleButton toggleButton4 = new ToggleButton(context, i8, string, i9, LocaleController.getString(R.string.LinkMediaSmaller), anonymousClass64.resourcesProvider);
                        page.changeSizeBtn = toggleButton4;
                        toggleButton4.setBackground(null);
                        if (messagePreviewParams.isVideo) {
                            page2 = page;
                            i2 = 4;
                        } else {
                            page2 = page;
                            i2 = 0;
                        }
                        toggleButton4.setVisibility(i2);
                        frameLayout.addView(toggleButton4, LayoutHelper.createLinear(-1, 48));
                        ToggleButton toggleButton5 = new ToggleButton(context, i8, LocaleController.getString(R.string.LinkVideoLarger), i9, LocaleController.getString(R.string.LinkVideoSmaller), anonymousClass64.resourcesProvider);
                        page.videoChangeSizeBtn = toggleButton5;
                        toggleButton5.setBackground(null);
                        toggleButton5.setVisibility(!messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.setAlpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f);
                        frameLayout.addView(toggleButton5, LayoutHelper.createLinear(-1, 48));
                        anonymousClass2.addView(frameLayout, LayoutHelper.createLinear(-1, 48));
                        frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                        toggleButton4.setState(messagePreviewParams.webpageSmall, false);
                        toggleButton5.setState(messagePreviewParams.webpageSmall, false);
                        ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(context, Theme.key_actionBarDefaultSubmenuSeparator, resourcesDelegate2);
                        gapView.setColor(Theme.multAlpha(0.06f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesDelegate2)));
                        gapView.setTag(R.id.fit_width_tag, 1);
                        anonymousClass2.addView(gapView, LayoutHelper.createLinear(-1, 8));
                        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(1, context, anonymousClass64.resourcesProvider, false, false);
                        actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                        final int i10 = 10;
                        actionBarMenuSubItem.setOnClickListener(new View.OnClickListener(page) {
                            public final MessagePreviewView.Page f$0;

                            {
                                this.f$0 = page;
                            }

                            @Override
                            public final void onClick(View view) {
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (i10) {
                                    case 0:
                                        this.f$0.this$0.dismiss(true);
                                        break;
                                    case 1:
                                        MessagePreviewView.Page page4 = this.f$0;
                                        page4.this$0.messagePreviewParams.quote = null;
                                        page4.textSelectionHelper.clear(false);
                                        page4.switchToQuote(false, false);
                                        page4.menu.getSwipeBack().closeForeground(true);
                                        break;
                                    case 2:
                                        MessagePreviewView.Page page5 = this.f$0;
                                        if (page5.getReplyMessage(null) != null) {
                                            MessagePreviewView.Page.AnonymousClass4 anonymousClass5 = page5.textSelectionHelper;
                                            int i11 = anonymousClass5.selectionEnd - anonymousClass5.selectionStart;
                                            ChatActivity.AnonymousClass64 anonymousClass65 = page5.this$0;
                                            if (i11 <= MessagesController.getInstance(anonymousClass65.currentAccount).quoteLengthMax) {
                                                TextSelectionHelper.SelectableView selectableView = anonymousClass5.selectedView;
                                                MessageObject replyMessage = page5.getReplyMessage(selectableView != null ? ((ChatMessageCell) selectableView).getMessageObject() : null);
                                                int i12 = anonymousClass5.selectionStart;
                                                MessagePreviewParams messagePreviewParams2 = anonymousClass65.messagePreviewParams;
                                                messagePreviewParams2.quoteStart = i12;
                                                int i13 = anonymousClass5.selectionEnd;
                                                messagePreviewParams2.quoteEnd = i13;
                                                messagePreviewParams2.quote = ChatActivity.ReplyQuote.from(i12, i13, replyMessage);
                                                anonymousClass65.onQuoteSelectedPart();
                                                anonymousClass65.dismiss(true);
                                            } else {
                                                page5.showQuoteLengthError();
                                            }
                                        }
                                        break;
                                    case 3:
                                        MessagePreviewView.Page page6 = this.f$0;
                                        ChatActivity.AnonymousClass64 anonymousClass66 = page6.this$0;
                                        MessagePreviewParams messagePreviewParams3 = anonymousClass66.messagePreviewParams;
                                        ChatActivity.ReplyQuote replyQuote = messagePreviewParams3.quote;
                                        boolean z2 = anonymousClass66.showOutdatedQuote;
                                        MessagePreviewView.Page.AnonymousClass4 anonymousClass8 = page6.textSelectionHelper;
                                        if (replyQuote == null || z2) {
                                            int i14 = anonymousClass8.selectionEnd - anonymousClass8.selectionStart;
                                            int i15 = anonymousClass66.currentAccount;
                                            if (i14 <= MessagesController.getInstance(i15).quoteLengthMax) {
                                                MessageObject replyMessage2 = page6.getReplyMessage(null);
                                                if (replyMessage2 != null) {
                                                    boolean zIsInSelectionMode = anonymousClass8.isInSelectionMode();
                                                    MessagePreviewParams messagePreviewParams4 = anonymousClass66.messagePreviewParams;
                                                    if (!zIsInSelectionMode) {
                                                        messagePreviewParams4.quoteStart = 0;
                                                        messagePreviewParams4.quoteEnd = Math.min(MessagesController.getInstance(i15).quoteLengthMax, replyMessage2.messageOwner.message.length());
                                                        messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, replyMessage2);
                                                        View replyMessageCell = page6.getReplyMessageCell();
                                                        if (replyMessageCell instanceof ChatMessageCell) {
                                                            anonymousClass8.select((ChatMessageCell) replyMessageCell, messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd);
                                                        }
                                                        if (!z2) {
                                                            page6.menu.getSwipeBack().openForeground(page6.menuBack);
                                                        }
                                                        page6.switchToQuote(true, true);
                                                    } else {
                                                        messagePreviewParams4.quoteStart = anonymousClass8.selectionStart;
                                                        messagePreviewParams4.quoteEnd = anonymousClass8.selectionEnd;
                                                        TextSelectionHelper.SelectableView selectableView2 = anonymousClass8.selectedView;
                                                        messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, page6.getReplyMessage(selectableView2 != null ? ((ChatMessageCell) selectableView2).getMessageObject() : null));
                                                        anonymousClass66.onQuoteSelectedPart();
                                                        anonymousClass66.dismiss(true);
                                                    }
                                                }
                                            } else {
                                                page6.showQuoteLengthError();
                                            }
                                        } else {
                                            messagePreviewParams3.quote = null;
                                            anonymousClass8.clear(false);
                                            page6.switchToQuote(false, true);
                                            page6.updateSubtitle(true);
                                        }
                                        break;
                                    case 4:
                                        this.f$0.this$0.selectAnotherChat(false);
                                        break;
                                    case 5:
                                        this.f$0.this$0.selectAnotherChat(false);
                                        break;
                                    case 6:
                                        this.f$0.this$0.dismiss(true);
                                        break;
                                    case 7:
                                        ChatActivity.AnonymousClass64 anonymousClass67 = this.f$0.this$0;
                                        boolean z3 = anonymousClass67.showOutdatedQuote;
                                        ChatActivity chatActivity = ChatActivity.this;
                                        if (!z3) {
                                            anonymousClass67.dismiss(true);
                                            chatActivity.replyingMessageObject = null;
                                            chatActivity.replyingQuote = null;
                                            chatActivity.messagePreviewParams.updateReply(null, null, chatActivity.dialog_id, null);
                                            chatActivity.fallbackFieldPanel();
                                        } else {
                                            anonymousClass67.dismiss(true);
                                            chatActivity.replyingQuote = null;
                                            chatActivity.showFieldPanelForReply(chatActivity.replyingMessageObject);
                                        }
                                        break;
                                    case 8:
                                        this.f$0.this$0.selectAnotherChat(true);
                                        break;
                                    case 9:
                                        ChatActivity.AnonymousClass64 anonymousClass68 = this.f$0.this$0;
                                        anonymousClass68.dismiss(true);
                                        ChatActivity chatActivity2 = ChatActivity.this;
                                        chatActivity2.messagePreviewParams.updateForward(null, chatActivity2.dialog_id);
                                        chatActivity2.fallbackFieldPanel();
                                        break;
                                    case 10:
                                        this.f$0.this$0.dismiss(true);
                                        break;
                                    case 11:
                                        ChatActivity.AnonymousClass64 anonymousClass69 = this.f$0.this$0;
                                        anonymousClass69.dismiss(true);
                                        ChatActivity chatActivity3 = ChatActivity.this;
                                        chatActivity3.foundWebPage = null;
                                        ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity3.chatActivityEnterView;
                                        if (anonymousClass39 != null) {
                                            anonymousClass39.messageWebPage = null;
                                            anonymousClass39.messageWebPageSearch = false;
                                        }
                                        MessagePreviewParams messagePreviewParams5 = chatActivity3.messagePreviewParams;
                                        if (messagePreviewParams5 != null) {
                                            int i16 = ((BaseFragment) chatActivity3).currentAccount;
                                            MessageObject messageObject = chatActivity3.replyingMessageObject;
                                            messagePreviewParams5.updateLink(i16, null, null, messageObject == chatActivity3.threadMessageObject ? null : messageObject, chatActivity3.replyingQuote, chatActivity3.editingMessageObject);
                                        }
                                        chatActivity3.fallbackFieldPanel();
                                        break;
                                    case 12:
                                        MessagePreviewView.Page page7 = this.f$0;
                                        ChatActivity.AnonymousClass64 anonymousClass610 = page7.this$0;
                                        MessagePreviewParams messagePreviewParams6 = anonymousClass610.messagePreviewParams;
                                        if (messagePreviewParams6.hasMedia) {
                                            boolean z4 = !messagePreviewParams6.webpageSmall;
                                            messagePreviewParams6.webpageSmall = z4;
                                            page7.changeSizeBtn.setState(z4, true);
                                            MessagePreviewParams messagePreviewParams7 = anonymousClass610.messagePreviewParams;
                                            page7.videoChangeSizeBtn.setState(messagePreviewParams7.webpageSmall, true);
                                            if (page7.messages.messages.size() > 0 && (message2 = page7.messages.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z5 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z5;
                                                messageMedia2.force_large_media = !z5;
                                            }
                                            if (page7.messages.previewMessages.size() > 0 && (message = page7.messages.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z6 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z6;
                                                messageMedia.force_large_media = !z6;
                                            }
                                            page7.updateMessages();
                                            page7.updateScroll = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        MessagePreviewView.Page page8 = this.f$0;
                                        ChatActivity.AnonymousClass64 anonymousClass611 = page8.this$0;
                                        MessagePreviewParams messagePreviewParams8 = anonymousClass611.messagePreviewParams;
                                        boolean z7 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z7;
                                        page8.changePositionBtn.setState(z7, true);
                                        int size = page8.messages.messages.size();
                                        MessagePreviewParams messagePreviewParams9 = anonymousClass611.messagePreviewParams;
                                        if (size > 0 && (message4 = page8.messages.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (page8.messages.previewMessages.size() > 0 && (message3 = page8.messages.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        page8.updateMessages();
                                        page8.updateScroll = true;
                                        break;
                                }
                            }
                        });
                        anonymousClass2.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, 48));
                        ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(1, context, anonymousClass64.resourcesProvider, false, true);
                        context2 = context;
                        actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.DoNotLinkPreview), R.drawable.msg_delete, null);
                        int color = Theme.getColor(Theme.key_text_RedBold, resourcesDelegate2);
                        int i11 = Theme.key_text_RedRegular;
                        int color2 = Theme.getColor(i11, resourcesDelegate2);
                        actionBarMenuSubItem2.setTextColor(color);
                        actionBarMenuSubItem2.setIconColor(color2);
                        final int i12 = 11;
                        actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener(page) {
                            public final MessagePreviewView.Page f$0;

                            {
                                this.f$0 = page;
                            }

                            @Override
                            public final void onClick(View view) {
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (i12) {
                                    case 0:
                                        this.f$0.this$0.dismiss(true);
                                        break;
                                    case 1:
                                        MessagePreviewView.Page page4 = this.f$0;
                                        page4.this$0.messagePreviewParams.quote = null;
                                        page4.textSelectionHelper.clear(false);
                                        page4.switchToQuote(false, false);
                                        page4.menu.getSwipeBack().closeForeground(true);
                                        break;
                                    case 2:
                                        MessagePreviewView.Page page5 = this.f$0;
                                        if (page5.getReplyMessage(null) != null) {
                                            MessagePreviewView.Page.AnonymousClass4 anonymousClass5 = page5.textSelectionHelper;
                                            int i13 = anonymousClass5.selectionEnd - anonymousClass5.selectionStart;
                                            ChatActivity.AnonymousClass64 anonymousClass65 = page5.this$0;
                                            if (i13 <= MessagesController.getInstance(anonymousClass65.currentAccount).quoteLengthMax) {
                                                TextSelectionHelper.SelectableView selectableView = anonymousClass5.selectedView;
                                                MessageObject replyMessage = page5.getReplyMessage(selectableView != null ? ((ChatMessageCell) selectableView).getMessageObject() : null);
                                                int i14 = anonymousClass5.selectionStart;
                                                MessagePreviewParams messagePreviewParams2 = anonymousClass65.messagePreviewParams;
                                                messagePreviewParams2.quoteStart = i14;
                                                int i15 = anonymousClass5.selectionEnd;
                                                messagePreviewParams2.quoteEnd = i15;
                                                messagePreviewParams2.quote = ChatActivity.ReplyQuote.from(i14, i15, replyMessage);
                                                anonymousClass65.onQuoteSelectedPart();
                                                anonymousClass65.dismiss(true);
                                            } else {
                                                page5.showQuoteLengthError();
                                            }
                                        }
                                        break;
                                    case 3:
                                        MessagePreviewView.Page page6 = this.f$0;
                                        ChatActivity.AnonymousClass64 anonymousClass66 = page6.this$0;
                                        MessagePreviewParams messagePreviewParams3 = anonymousClass66.messagePreviewParams;
                                        ChatActivity.ReplyQuote replyQuote = messagePreviewParams3.quote;
                                        boolean z2 = anonymousClass66.showOutdatedQuote;
                                        MessagePreviewView.Page.AnonymousClass4 anonymousClass8 = page6.textSelectionHelper;
                                        if (replyQuote == null || z2) {
                                            int i16 = anonymousClass8.selectionEnd - anonymousClass8.selectionStart;
                                            int i17 = anonymousClass66.currentAccount;
                                            if (i16 <= MessagesController.getInstance(i17).quoteLengthMax) {
                                                MessageObject replyMessage2 = page6.getReplyMessage(null);
                                                if (replyMessage2 != null) {
                                                    boolean zIsInSelectionMode = anonymousClass8.isInSelectionMode();
                                                    MessagePreviewParams messagePreviewParams4 = anonymousClass66.messagePreviewParams;
                                                    if (!zIsInSelectionMode) {
                                                        messagePreviewParams4.quoteStart = 0;
                                                        messagePreviewParams4.quoteEnd = Math.min(MessagesController.getInstance(i17).quoteLengthMax, replyMessage2.messageOwner.message.length());
                                                        messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, replyMessage2);
                                                        View replyMessageCell = page6.getReplyMessageCell();
                                                        if (replyMessageCell instanceof ChatMessageCell) {
                                                            anonymousClass8.select((ChatMessageCell) replyMessageCell, messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd);
                                                        }
                                                        if (!z2) {
                                                            page6.menu.getSwipeBack().openForeground(page6.menuBack);
                                                        }
                                                        page6.switchToQuote(true, true);
                                                    } else {
                                                        messagePreviewParams4.quoteStart = anonymousClass8.selectionStart;
                                                        messagePreviewParams4.quoteEnd = anonymousClass8.selectionEnd;
                                                        TextSelectionHelper.SelectableView selectableView2 = anonymousClass8.selectedView;
                                                        messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, page6.getReplyMessage(selectableView2 != null ? ((ChatMessageCell) selectableView2).getMessageObject() : null));
                                                        anonymousClass66.onQuoteSelectedPart();
                                                        anonymousClass66.dismiss(true);
                                                    }
                                                }
                                            } else {
                                                page6.showQuoteLengthError();
                                            }
                                        } else {
                                            messagePreviewParams3.quote = null;
                                            anonymousClass8.clear(false);
                                            page6.switchToQuote(false, true);
                                            page6.updateSubtitle(true);
                                        }
                                        break;
                                    case 4:
                                        this.f$0.this$0.selectAnotherChat(false);
                                        break;
                                    case 5:
                                        this.f$0.this$0.selectAnotherChat(false);
                                        break;
                                    case 6:
                                        this.f$0.this$0.dismiss(true);
                                        break;
                                    case 7:
                                        ChatActivity.AnonymousClass64 anonymousClass67 = this.f$0.this$0;
                                        boolean z3 = anonymousClass67.showOutdatedQuote;
                                        ChatActivity chatActivity = ChatActivity.this;
                                        if (!z3) {
                                            anonymousClass67.dismiss(true);
                                            chatActivity.replyingMessageObject = null;
                                            chatActivity.replyingQuote = null;
                                            chatActivity.messagePreviewParams.updateReply(null, null, chatActivity.dialog_id, null);
                                            chatActivity.fallbackFieldPanel();
                                        } else {
                                            anonymousClass67.dismiss(true);
                                            chatActivity.replyingQuote = null;
                                            chatActivity.showFieldPanelForReply(chatActivity.replyingMessageObject);
                                        }
                                        break;
                                    case 8:
                                        this.f$0.this$0.selectAnotherChat(true);
                                        break;
                                    case 9:
                                        ChatActivity.AnonymousClass64 anonymousClass68 = this.f$0.this$0;
                                        anonymousClass68.dismiss(true);
                                        ChatActivity chatActivity2 = ChatActivity.this;
                                        chatActivity2.messagePreviewParams.updateForward(null, chatActivity2.dialog_id);
                                        chatActivity2.fallbackFieldPanel();
                                        break;
                                    case 10:
                                        this.f$0.this$0.dismiss(true);
                                        break;
                                    case 11:
                                        ChatActivity.AnonymousClass64 anonymousClass69 = this.f$0.this$0;
                                        anonymousClass69.dismiss(true);
                                        ChatActivity chatActivity3 = ChatActivity.this;
                                        chatActivity3.foundWebPage = null;
                                        ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity3.chatActivityEnterView;
                                        if (anonymousClass39 != null) {
                                            anonymousClass39.messageWebPage = null;
                                            anonymousClass39.messageWebPageSearch = false;
                                        }
                                        MessagePreviewParams messagePreviewParams5 = chatActivity3.messagePreviewParams;
                                        if (messagePreviewParams5 != null) {
                                            int i18 = ((BaseFragment) chatActivity3).currentAccount;
                                            MessageObject messageObject = chatActivity3.replyingMessageObject;
                                            messagePreviewParams5.updateLink(i18, null, null, messageObject == chatActivity3.threadMessageObject ? null : messageObject, chatActivity3.replyingQuote, chatActivity3.editingMessageObject);
                                        }
                                        chatActivity3.fallbackFieldPanel();
                                        break;
                                    case 12:
                                        MessagePreviewView.Page page7 = this.f$0;
                                        ChatActivity.AnonymousClass64 anonymousClass610 = page7.this$0;
                                        MessagePreviewParams messagePreviewParams6 = anonymousClass610.messagePreviewParams;
                                        if (messagePreviewParams6.hasMedia) {
                                            boolean z4 = !messagePreviewParams6.webpageSmall;
                                            messagePreviewParams6.webpageSmall = z4;
                                            page7.changeSizeBtn.setState(z4, true);
                                            MessagePreviewParams messagePreviewParams7 = anonymousClass610.messagePreviewParams;
                                            page7.videoChangeSizeBtn.setState(messagePreviewParams7.webpageSmall, true);
                                            if (page7.messages.messages.size() > 0 && (message2 = page7.messages.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z5 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z5;
                                                messageMedia2.force_large_media = !z5;
                                            }
                                            if (page7.messages.previewMessages.size() > 0 && (message = page7.messages.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z6 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z6;
                                                messageMedia.force_large_media = !z6;
                                            }
                                            page7.updateMessages();
                                            page7.updateScroll = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        MessagePreviewView.Page page8 = this.f$0;
                                        ChatActivity.AnonymousClass64 anonymousClass611 = page8.this$0;
                                        MessagePreviewParams messagePreviewParams8 = anonymousClass611.messagePreviewParams;
                                        boolean z7 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z7;
                                        page8.changePositionBtn.setState(z7, true);
                                        int size = page8.messages.messages.size();
                                        MessagePreviewParams messagePreviewParams9 = anonymousClass611.messagePreviewParams;
                                        if (size > 0 && (message4 = page8.messages.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (page8.messages.previewMessages.size() > 0 && (message3 = page8.messages.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        page8.updateMessages();
                                        page8.updateScroll = true;
                                        break;
                                }
                            }
                        });
                        actionBarMenuSubItem2.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(null, i11, false)));
                        anonymousClass2.addView(actionBarMenuSubItem2, LayoutHelper.createLinear(-1, 48));
                        final int i13 = 12;
                        frameLayout.setOnClickListener(new View.OnClickListener(page) {
                            public final MessagePreviewView.Page f$0;

                            {
                                this.f$0 = page;
                            }

                            @Override
                            public final void onClick(View view) {
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (i13) {
                                    case 0:
                                        this.f$0.this$0.dismiss(true);
                                        break;
                                    case 1:
                                        MessagePreviewView.Page page4 = this.f$0;
                                        page4.this$0.messagePreviewParams.quote = null;
                                        page4.textSelectionHelper.clear(false);
                                        page4.switchToQuote(false, false);
                                        page4.menu.getSwipeBack().closeForeground(true);
                                        break;
                                    case 2:
                                        MessagePreviewView.Page page5 = this.f$0;
                                        if (page5.getReplyMessage(null) != null) {
                                            MessagePreviewView.Page.AnonymousClass4 anonymousClass5 = page5.textSelectionHelper;
                                            int i14 = anonymousClass5.selectionEnd - anonymousClass5.selectionStart;
                                            ChatActivity.AnonymousClass64 anonymousClass65 = page5.this$0;
                                            if (i14 <= MessagesController.getInstance(anonymousClass65.currentAccount).quoteLengthMax) {
                                                TextSelectionHelper.SelectableView selectableView = anonymousClass5.selectedView;
                                                MessageObject replyMessage = page5.getReplyMessage(selectableView != null ? ((ChatMessageCell) selectableView).getMessageObject() : null);
                                                int i15 = anonymousClass5.selectionStart;
                                                MessagePreviewParams messagePreviewParams2 = anonymousClass65.messagePreviewParams;
                                                messagePreviewParams2.quoteStart = i15;
                                                int i16 = anonymousClass5.selectionEnd;
                                                messagePreviewParams2.quoteEnd = i16;
                                                messagePreviewParams2.quote = ChatActivity.ReplyQuote.from(i15, i16, replyMessage);
                                                anonymousClass65.onQuoteSelectedPart();
                                                anonymousClass65.dismiss(true);
                                            } else {
                                                page5.showQuoteLengthError();
                                            }
                                        }
                                        break;
                                    case 3:
                                        MessagePreviewView.Page page6 = this.f$0;
                                        ChatActivity.AnonymousClass64 anonymousClass66 = page6.this$0;
                                        MessagePreviewParams messagePreviewParams3 = anonymousClass66.messagePreviewParams;
                                        ChatActivity.ReplyQuote replyQuote = messagePreviewParams3.quote;
                                        boolean z2 = anonymousClass66.showOutdatedQuote;
                                        MessagePreviewView.Page.AnonymousClass4 anonymousClass8 = page6.textSelectionHelper;
                                        if (replyQuote == null || z2) {
                                            int i17 = anonymousClass8.selectionEnd - anonymousClass8.selectionStart;
                                            int i18 = anonymousClass66.currentAccount;
                                            if (i17 <= MessagesController.getInstance(i18).quoteLengthMax) {
                                                MessageObject replyMessage2 = page6.getReplyMessage(null);
                                                if (replyMessage2 != null) {
                                                    boolean zIsInSelectionMode = anonymousClass8.isInSelectionMode();
                                                    MessagePreviewParams messagePreviewParams4 = anonymousClass66.messagePreviewParams;
                                                    if (!zIsInSelectionMode) {
                                                        messagePreviewParams4.quoteStart = 0;
                                                        messagePreviewParams4.quoteEnd = Math.min(MessagesController.getInstance(i18).quoteLengthMax, replyMessage2.messageOwner.message.length());
                                                        messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, replyMessage2);
                                                        View replyMessageCell = page6.getReplyMessageCell();
                                                        if (replyMessageCell instanceof ChatMessageCell) {
                                                            anonymousClass8.select((ChatMessageCell) replyMessageCell, messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd);
                                                        }
                                                        if (!z2) {
                                                            page6.menu.getSwipeBack().openForeground(page6.menuBack);
                                                        }
                                                        page6.switchToQuote(true, true);
                                                    } else {
                                                        messagePreviewParams4.quoteStart = anonymousClass8.selectionStart;
                                                        messagePreviewParams4.quoteEnd = anonymousClass8.selectionEnd;
                                                        TextSelectionHelper.SelectableView selectableView2 = anonymousClass8.selectedView;
                                                        messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, page6.getReplyMessage(selectableView2 != null ? ((ChatMessageCell) selectableView2).getMessageObject() : null));
                                                        anonymousClass66.onQuoteSelectedPart();
                                                        anonymousClass66.dismiss(true);
                                                    }
                                                }
                                            } else {
                                                page6.showQuoteLengthError();
                                            }
                                        } else {
                                            messagePreviewParams3.quote = null;
                                            anonymousClass8.clear(false);
                                            page6.switchToQuote(false, true);
                                            page6.updateSubtitle(true);
                                        }
                                        break;
                                    case 4:
                                        this.f$0.this$0.selectAnotherChat(false);
                                        break;
                                    case 5:
                                        this.f$0.this$0.selectAnotherChat(false);
                                        break;
                                    case 6:
                                        this.f$0.this$0.dismiss(true);
                                        break;
                                    case 7:
                                        ChatActivity.AnonymousClass64 anonymousClass67 = this.f$0.this$0;
                                        boolean z3 = anonymousClass67.showOutdatedQuote;
                                        ChatActivity chatActivity = ChatActivity.this;
                                        if (!z3) {
                                            anonymousClass67.dismiss(true);
                                            chatActivity.replyingMessageObject = null;
                                            chatActivity.replyingQuote = null;
                                            chatActivity.messagePreviewParams.updateReply(null, null, chatActivity.dialog_id, null);
                                            chatActivity.fallbackFieldPanel();
                                        } else {
                                            anonymousClass67.dismiss(true);
                                            chatActivity.replyingQuote = null;
                                            chatActivity.showFieldPanelForReply(chatActivity.replyingMessageObject);
                                        }
                                        break;
                                    case 8:
                                        this.f$0.this$0.selectAnotherChat(true);
                                        break;
                                    case 9:
                                        ChatActivity.AnonymousClass64 anonymousClass68 = this.f$0.this$0;
                                        anonymousClass68.dismiss(true);
                                        ChatActivity chatActivity2 = ChatActivity.this;
                                        chatActivity2.messagePreviewParams.updateForward(null, chatActivity2.dialog_id);
                                        chatActivity2.fallbackFieldPanel();
                                        break;
                                    case 10:
                                        this.f$0.this$0.dismiss(true);
                                        break;
                                    case 11:
                                        ChatActivity.AnonymousClass64 anonymousClass69 = this.f$0.this$0;
                                        anonymousClass69.dismiss(true);
                                        ChatActivity chatActivity3 = ChatActivity.this;
                                        chatActivity3.foundWebPage = null;
                                        ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity3.chatActivityEnterView;
                                        if (anonymousClass39 != null) {
                                            anonymousClass39.messageWebPage = null;
                                            anonymousClass39.messageWebPageSearch = false;
                                        }
                                        MessagePreviewParams messagePreviewParams5 = chatActivity3.messagePreviewParams;
                                        if (messagePreviewParams5 != null) {
                                            int i19 = ((BaseFragment) chatActivity3).currentAccount;
                                            MessageObject messageObject = chatActivity3.replyingMessageObject;
                                            messagePreviewParams5.updateLink(i19, null, null, messageObject == chatActivity3.threadMessageObject ? null : messageObject, chatActivity3.replyingQuote, chatActivity3.editingMessageObject);
                                        }
                                        chatActivity3.fallbackFieldPanel();
                                        break;
                                    case 12:
                                        MessagePreviewView.Page page7 = this.f$0;
                                        ChatActivity.AnonymousClass64 anonymousClass610 = page7.this$0;
                                        MessagePreviewParams messagePreviewParams6 = anonymousClass610.messagePreviewParams;
                                        if (messagePreviewParams6.hasMedia) {
                                            boolean z4 = !messagePreviewParams6.webpageSmall;
                                            messagePreviewParams6.webpageSmall = z4;
                                            page7.changeSizeBtn.setState(z4, true);
                                            MessagePreviewParams messagePreviewParams7 = anonymousClass610.messagePreviewParams;
                                            page7.videoChangeSizeBtn.setState(messagePreviewParams7.webpageSmall, true);
                                            if (page7.messages.messages.size() > 0 && (message2 = page7.messages.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z5 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z5;
                                                messageMedia2.force_large_media = !z5;
                                            }
                                            if (page7.messages.previewMessages.size() > 0 && (message = page7.messages.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z6 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z6;
                                                messageMedia.force_large_media = !z6;
                                            }
                                            page7.updateMessages();
                                            page7.updateScroll = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        MessagePreviewView.Page page8 = this.f$0;
                                        ChatActivity.AnonymousClass64 anonymousClass611 = page8.this$0;
                                        MessagePreviewParams messagePreviewParams8 = anonymousClass611.messagePreviewParams;
                                        boolean z7 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z7;
                                        page8.changePositionBtn.setState(z7, true);
                                        int size = page8.messages.messages.size();
                                        MessagePreviewParams messagePreviewParams9 = anonymousClass611.messagePreviewParams;
                                        if (size > 0 && (message4 = page8.messages.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (page8.messages.previewMessages.size() > 0 && (message3 = page8.messages.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        page8.updateMessages();
                                        page8.updateScroll = true;
                                        break;
                                }
                            }
                        });
                        final int i14 = 13;
                        toggleButton3.setOnClickListener(new View.OnClickListener(page) {
                            public final MessagePreviewView.Page f$0;

                            {
                                this.f$0 = page;
                            }

                            @Override
                            public final void onClick(View view) {
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (i14) {
                                    case 0:
                                        this.f$0.this$0.dismiss(true);
                                        break;
                                    case 1:
                                        MessagePreviewView.Page page4 = this.f$0;
                                        page4.this$0.messagePreviewParams.quote = null;
                                        page4.textSelectionHelper.clear(false);
                                        page4.switchToQuote(false, false);
                                        page4.menu.getSwipeBack().closeForeground(true);
                                        break;
                                    case 2:
                                        MessagePreviewView.Page page5 = this.f$0;
                                        if (page5.getReplyMessage(null) != null) {
                                            MessagePreviewView.Page.AnonymousClass4 anonymousClass5 = page5.textSelectionHelper;
                                            int i15 = anonymousClass5.selectionEnd - anonymousClass5.selectionStart;
                                            ChatActivity.AnonymousClass64 anonymousClass65 = page5.this$0;
                                            if (i15 <= MessagesController.getInstance(anonymousClass65.currentAccount).quoteLengthMax) {
                                                TextSelectionHelper.SelectableView selectableView = anonymousClass5.selectedView;
                                                MessageObject replyMessage = page5.getReplyMessage(selectableView != null ? ((ChatMessageCell) selectableView).getMessageObject() : null);
                                                int i16 = anonymousClass5.selectionStart;
                                                MessagePreviewParams messagePreviewParams2 = anonymousClass65.messagePreviewParams;
                                                messagePreviewParams2.quoteStart = i16;
                                                int i17 = anonymousClass5.selectionEnd;
                                                messagePreviewParams2.quoteEnd = i17;
                                                messagePreviewParams2.quote = ChatActivity.ReplyQuote.from(i16, i17, replyMessage);
                                                anonymousClass65.onQuoteSelectedPart();
                                                anonymousClass65.dismiss(true);
                                            } else {
                                                page5.showQuoteLengthError();
                                            }
                                        }
                                        break;
                                    case 3:
                                        MessagePreviewView.Page page6 = this.f$0;
                                        ChatActivity.AnonymousClass64 anonymousClass66 = page6.this$0;
                                        MessagePreviewParams messagePreviewParams3 = anonymousClass66.messagePreviewParams;
                                        ChatActivity.ReplyQuote replyQuote = messagePreviewParams3.quote;
                                        boolean z2 = anonymousClass66.showOutdatedQuote;
                                        MessagePreviewView.Page.AnonymousClass4 anonymousClass8 = page6.textSelectionHelper;
                                        if (replyQuote == null || z2) {
                                            int i18 = anonymousClass8.selectionEnd - anonymousClass8.selectionStart;
                                            int i19 = anonymousClass66.currentAccount;
                                            if (i18 <= MessagesController.getInstance(i19).quoteLengthMax) {
                                                MessageObject replyMessage2 = page6.getReplyMessage(null);
                                                if (replyMessage2 != null) {
                                                    boolean zIsInSelectionMode = anonymousClass8.isInSelectionMode();
                                                    MessagePreviewParams messagePreviewParams4 = anonymousClass66.messagePreviewParams;
                                                    if (!zIsInSelectionMode) {
                                                        messagePreviewParams4.quoteStart = 0;
                                                        messagePreviewParams4.quoteEnd = Math.min(MessagesController.getInstance(i19).quoteLengthMax, replyMessage2.messageOwner.message.length());
                                                        messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, replyMessage2);
                                                        View replyMessageCell = page6.getReplyMessageCell();
                                                        if (replyMessageCell instanceof ChatMessageCell) {
                                                            anonymousClass8.select((ChatMessageCell) replyMessageCell, messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd);
                                                        }
                                                        if (!z2) {
                                                            page6.menu.getSwipeBack().openForeground(page6.menuBack);
                                                        }
                                                        page6.switchToQuote(true, true);
                                                    } else {
                                                        messagePreviewParams4.quoteStart = anonymousClass8.selectionStart;
                                                        messagePreviewParams4.quoteEnd = anonymousClass8.selectionEnd;
                                                        TextSelectionHelper.SelectableView selectableView2 = anonymousClass8.selectedView;
                                                        messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, page6.getReplyMessage(selectableView2 != null ? ((ChatMessageCell) selectableView2).getMessageObject() : null));
                                                        anonymousClass66.onQuoteSelectedPart();
                                                        anonymousClass66.dismiss(true);
                                                    }
                                                }
                                            } else {
                                                page6.showQuoteLengthError();
                                            }
                                        } else {
                                            messagePreviewParams3.quote = null;
                                            anonymousClass8.clear(false);
                                            page6.switchToQuote(false, true);
                                            page6.updateSubtitle(true);
                                        }
                                        break;
                                    case 4:
                                        this.f$0.this$0.selectAnotherChat(false);
                                        break;
                                    case 5:
                                        this.f$0.this$0.selectAnotherChat(false);
                                        break;
                                    case 6:
                                        this.f$0.this$0.dismiss(true);
                                        break;
                                    case 7:
                                        ChatActivity.AnonymousClass64 anonymousClass67 = this.f$0.this$0;
                                        boolean z3 = anonymousClass67.showOutdatedQuote;
                                        ChatActivity chatActivity = ChatActivity.this;
                                        if (!z3) {
                                            anonymousClass67.dismiss(true);
                                            chatActivity.replyingMessageObject = null;
                                            chatActivity.replyingQuote = null;
                                            chatActivity.messagePreviewParams.updateReply(null, null, chatActivity.dialog_id, null);
                                            chatActivity.fallbackFieldPanel();
                                        } else {
                                            anonymousClass67.dismiss(true);
                                            chatActivity.replyingQuote = null;
                                            chatActivity.showFieldPanelForReply(chatActivity.replyingMessageObject);
                                        }
                                        break;
                                    case 8:
                                        this.f$0.this$0.selectAnotherChat(true);
                                        break;
                                    case 9:
                                        ChatActivity.AnonymousClass64 anonymousClass68 = this.f$0.this$0;
                                        anonymousClass68.dismiss(true);
                                        ChatActivity chatActivity2 = ChatActivity.this;
                                        chatActivity2.messagePreviewParams.updateForward(null, chatActivity2.dialog_id);
                                        chatActivity2.fallbackFieldPanel();
                                        break;
                                    case 10:
                                        this.f$0.this$0.dismiss(true);
                                        break;
                                    case 11:
                                        ChatActivity.AnonymousClass64 anonymousClass69 = this.f$0.this$0;
                                        anonymousClass69.dismiss(true);
                                        ChatActivity chatActivity3 = ChatActivity.this;
                                        chatActivity3.foundWebPage = null;
                                        ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity3.chatActivityEnterView;
                                        if (anonymousClass39 != null) {
                                            anonymousClass39.messageWebPage = null;
                                            anonymousClass39.messageWebPageSearch = false;
                                        }
                                        MessagePreviewParams messagePreviewParams5 = chatActivity3.messagePreviewParams;
                                        if (messagePreviewParams5 != null) {
                                            int i110 = ((BaseFragment) chatActivity3).currentAccount;
                                            MessageObject messageObject = chatActivity3.replyingMessageObject;
                                            messagePreviewParams5.updateLink(i110, null, null, messageObject == chatActivity3.threadMessageObject ? null : messageObject, chatActivity3.replyingQuote, chatActivity3.editingMessageObject);
                                        }
                                        chatActivity3.fallbackFieldPanel();
                                        break;
                                    case 12:
                                        MessagePreviewView.Page page7 = this.f$0;
                                        ChatActivity.AnonymousClass64 anonymousClass610 = page7.this$0;
                                        MessagePreviewParams messagePreviewParams6 = anonymousClass610.messagePreviewParams;
                                        if (messagePreviewParams6.hasMedia) {
                                            boolean z4 = !messagePreviewParams6.webpageSmall;
                                            messagePreviewParams6.webpageSmall = z4;
                                            page7.changeSizeBtn.setState(z4, true);
                                            MessagePreviewParams messagePreviewParams7 = anonymousClass610.messagePreviewParams;
                                            page7.videoChangeSizeBtn.setState(messagePreviewParams7.webpageSmall, true);
                                            if (page7.messages.messages.size() > 0 && (message2 = page7.messages.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z5 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z5;
                                                messageMedia2.force_large_media = !z5;
                                            }
                                            if (page7.messages.previewMessages.size() > 0 && (message = page7.messages.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z6 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z6;
                                                messageMedia.force_large_media = !z6;
                                            }
                                            page7.updateMessages();
                                            page7.updateScroll = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        MessagePreviewView.Page page8 = this.f$0;
                                        ChatActivity.AnonymousClass64 anonymousClass611 = page8.this$0;
                                        MessagePreviewParams messagePreviewParams8 = anonymousClass611.messagePreviewParams;
                                        boolean z7 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z7;
                                        page8.changePositionBtn.setState(z7, true);
                                        int size = page8.messages.messages.size();
                                        MessagePreviewParams messagePreviewParams9 = anonymousClass611.messagePreviewParams;
                                        if (size > 0 && (message4 = page8.messages.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (page8.messages.previewMessages.size() > 0 && (message3 = page8.messages.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        page8.updateMessages();
                                        page8.updateScroll = true;
                                        break;
                                }
                            }
                        });
                        page3 = page;
                    }
                } else {
                    if (!UserConfig.getInstance(anonymousClass64.currentAccount).isPremium()) {
                        int i15 = 0;
                        while (true) {
                            if (i15 >= messagePreviewParams.forwardMessages.messages.size()) {
                                z = true;
                                break;
                            } else {
                                if (messagePreviewParams.forwardMessages.messages.get(i15).type == 36) {
                                    z = false;
                                    break;
                                }
                                i15++;
                            }
                        }
                    } else {
                        z = true;
                        break;
                    }
                    ToggleButton toggleButton6 = new ToggleButton(context, R.raw.name_hide, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.ShowSenderNames : R.string.ShowSendersName), R.raw.name_show, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.HideSenderNames : R.string.HideSendersName), anonymousClass64.resourcesProvider);
                    this.menu.linearLayout.addView(toggleButton6, LayoutHelper.createLinear(-1, 48));
                    if (messagePreviewParams.hasCaption) {
                        toggleButton = toggleButton6;
                        ToggleButton toggleButton7 = new ToggleButton(context, R.raw.caption_hide, LocaleController.getString(R.string.ShowCaption), R.raw.caption_show, LocaleController.getString(R.string.HideCaption), anonymousClass64.resourcesProvider);
                        toggleButton7.setState(messagePreviewParams.hideCaption, false);
                        this.menu.linearLayout.addView(toggleButton7, LayoutHelper.createLinear(-1, 48));
                        toggleButton2 = toggleButton7;
                    } else {
                        toggleButton = toggleButton6;
                        toggleButton2 = null;
                    }
                    ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(0, context, anonymousClass64.resourcesProvider, true, false);
                    final int i16 = 8;
                    actionBarMenuSubItem3.setOnClickListener(new View.OnClickListener(this) {
                        public final MessagePreviewView.Page f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i16) {
                                case 0:
                                    this.f$0.this$0.dismiss(true);
                                    break;
                                case 1:
                                    MessagePreviewView.Page page4 = this.f$0;
                                    page4.this$0.messagePreviewParams.quote = null;
                                    page4.textSelectionHelper.clear(false);
                                    page4.switchToQuote(false, false);
                                    page4.menu.getSwipeBack().closeForeground(true);
                                    break;
                                case 2:
                                    MessagePreviewView.Page page5 = this.f$0;
                                    if (page5.getReplyMessage(null) != null) {
                                        MessagePreviewView.Page.AnonymousClass4 anonymousClass5 = page5.textSelectionHelper;
                                        int i17 = anonymousClass5.selectionEnd - anonymousClass5.selectionStart;
                                        ChatActivity.AnonymousClass64 anonymousClass65 = page5.this$0;
                                        if (i17 <= MessagesController.getInstance(anonymousClass65.currentAccount).quoteLengthMax) {
                                            TextSelectionHelper.SelectableView selectableView = anonymousClass5.selectedView;
                                            MessageObject replyMessage = page5.getReplyMessage(selectableView != null ? ((ChatMessageCell) selectableView).getMessageObject() : null);
                                            int i18 = anonymousClass5.selectionStart;
                                            MessagePreviewParams messagePreviewParams2 = anonymousClass65.messagePreviewParams;
                                            messagePreviewParams2.quoteStart = i18;
                                            int i19 = anonymousClass5.selectionEnd;
                                            messagePreviewParams2.quoteEnd = i19;
                                            messagePreviewParams2.quote = ChatActivity.ReplyQuote.from(i18, i19, replyMessage);
                                            anonymousClass65.onQuoteSelectedPart();
                                            anonymousClass65.dismiss(true);
                                        } else {
                                            page5.showQuoteLengthError();
                                        }
                                    }
                                    break;
                                case 3:
                                    MessagePreviewView.Page page6 = this.f$0;
                                    ChatActivity.AnonymousClass64 anonymousClass66 = page6.this$0;
                                    MessagePreviewParams messagePreviewParams3 = anonymousClass66.messagePreviewParams;
                                    ChatActivity.ReplyQuote replyQuote = messagePreviewParams3.quote;
                                    boolean z2 = anonymousClass66.showOutdatedQuote;
                                    MessagePreviewView.Page.AnonymousClass4 anonymousClass8 = page6.textSelectionHelper;
                                    if (replyQuote == null || z2) {
                                        int i110 = anonymousClass8.selectionEnd - anonymousClass8.selectionStart;
                                        int i111 = anonymousClass66.currentAccount;
                                        if (i110 <= MessagesController.getInstance(i111).quoteLengthMax) {
                                            MessageObject replyMessage2 = page6.getReplyMessage(null);
                                            if (replyMessage2 != null) {
                                                boolean zIsInSelectionMode = anonymousClass8.isInSelectionMode();
                                                MessagePreviewParams messagePreviewParams4 = anonymousClass66.messagePreviewParams;
                                                if (!zIsInSelectionMode) {
                                                    messagePreviewParams4.quoteStart = 0;
                                                    messagePreviewParams4.quoteEnd = Math.min(MessagesController.getInstance(i111).quoteLengthMax, replyMessage2.messageOwner.message.length());
                                                    messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, replyMessage2);
                                                    View replyMessageCell = page6.getReplyMessageCell();
                                                    if (replyMessageCell instanceof ChatMessageCell) {
                                                        anonymousClass8.select((ChatMessageCell) replyMessageCell, messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd);
                                                    }
                                                    if (!z2) {
                                                        page6.menu.getSwipeBack().openForeground(page6.menuBack);
                                                    }
                                                    page6.switchToQuote(true, true);
                                                } else {
                                                    messagePreviewParams4.quoteStart = anonymousClass8.selectionStart;
                                                    messagePreviewParams4.quoteEnd = anonymousClass8.selectionEnd;
                                                    TextSelectionHelper.SelectableView selectableView2 = anonymousClass8.selectedView;
                                                    messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, page6.getReplyMessage(selectableView2 != null ? ((ChatMessageCell) selectableView2).getMessageObject() : null));
                                                    anonymousClass66.onQuoteSelectedPart();
                                                    anonymousClass66.dismiss(true);
                                                }
                                            }
                                        } else {
                                            page6.showQuoteLengthError();
                                        }
                                    } else {
                                        messagePreviewParams3.quote = null;
                                        anonymousClass8.clear(false);
                                        page6.switchToQuote(false, true);
                                        page6.updateSubtitle(true);
                                    }
                                    break;
                                case 4:
                                    this.f$0.this$0.selectAnotherChat(false);
                                    break;
                                case 5:
                                    this.f$0.this$0.selectAnotherChat(false);
                                    break;
                                case 6:
                                    this.f$0.this$0.dismiss(true);
                                    break;
                                case 7:
                                    ChatActivity.AnonymousClass64 anonymousClass67 = this.f$0.this$0;
                                    boolean z3 = anonymousClass67.showOutdatedQuote;
                                    ChatActivity chatActivity = ChatActivity.this;
                                    if (!z3) {
                                        anonymousClass67.dismiss(true);
                                        chatActivity.replyingMessageObject = null;
                                        chatActivity.replyingQuote = null;
                                        chatActivity.messagePreviewParams.updateReply(null, null, chatActivity.dialog_id, null);
                                        chatActivity.fallbackFieldPanel();
                                    } else {
                                        anonymousClass67.dismiss(true);
                                        chatActivity.replyingQuote = null;
                                        chatActivity.showFieldPanelForReply(chatActivity.replyingMessageObject);
                                    }
                                    break;
                                case 8:
                                    this.f$0.this$0.selectAnotherChat(true);
                                    break;
                                case 9:
                                    ChatActivity.AnonymousClass64 anonymousClass68 = this.f$0.this$0;
                                    anonymousClass68.dismiss(true);
                                    ChatActivity chatActivity2 = ChatActivity.this;
                                    chatActivity2.messagePreviewParams.updateForward(null, chatActivity2.dialog_id);
                                    chatActivity2.fallbackFieldPanel();
                                    break;
                                case 10:
                                    this.f$0.this$0.dismiss(true);
                                    break;
                                case 11:
                                    ChatActivity.AnonymousClass64 anonymousClass69 = this.f$0.this$0;
                                    anonymousClass69.dismiss(true);
                                    ChatActivity chatActivity3 = ChatActivity.this;
                                    chatActivity3.foundWebPage = null;
                                    ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity3.chatActivityEnterView;
                                    if (anonymousClass39 != null) {
                                        anonymousClass39.messageWebPage = null;
                                        anonymousClass39.messageWebPageSearch = false;
                                    }
                                    MessagePreviewParams messagePreviewParams5 = chatActivity3.messagePreviewParams;
                                    if (messagePreviewParams5 != null) {
                                        int i112 = ((BaseFragment) chatActivity3).currentAccount;
                                        MessageObject messageObject = chatActivity3.replyingMessageObject;
                                        messagePreviewParams5.updateLink(i112, null, null, messageObject == chatActivity3.threadMessageObject ? null : messageObject, chatActivity3.replyingQuote, chatActivity3.editingMessageObject);
                                    }
                                    chatActivity3.fallbackFieldPanel();
                                    break;
                                case 12:
                                    MessagePreviewView.Page page7 = this.f$0;
                                    ChatActivity.AnonymousClass64 anonymousClass610 = page7.this$0;
                                    MessagePreviewParams messagePreviewParams6 = anonymousClass610.messagePreviewParams;
                                    if (messagePreviewParams6.hasMedia) {
                                        boolean z4 = !messagePreviewParams6.webpageSmall;
                                        messagePreviewParams6.webpageSmall = z4;
                                        page7.changeSizeBtn.setState(z4, true);
                                        MessagePreviewParams messagePreviewParams7 = anonymousClass610.messagePreviewParams;
                                        page7.videoChangeSizeBtn.setState(messagePreviewParams7.webpageSmall, true);
                                        if (page7.messages.messages.size() > 0 && (message2 = page7.messages.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z5 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z5;
                                            messageMedia2.force_large_media = !z5;
                                        }
                                        if (page7.messages.previewMessages.size() > 0 && (message = page7.messages.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z6 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z6;
                                            messageMedia.force_large_media = !z6;
                                        }
                                        page7.updateMessages();
                                        page7.updateScroll = true;
                                        break;
                                    }
                                    break;
                                default:
                                    MessagePreviewView.Page page8 = this.f$0;
                                    ChatActivity.AnonymousClass64 anonymousClass611 = page8.this$0;
                                    MessagePreviewParams messagePreviewParams8 = anonymousClass611.messagePreviewParams;
                                    boolean z7 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z7;
                                    page8.changePositionBtn.setState(z7, true);
                                    int size = page8.messages.messages.size();
                                    MessagePreviewParams messagePreviewParams9 = anonymousClass611.messagePreviewParams;
                                    if (size > 0 && (message4 = page8.messages.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    if (page8.messages.previewMessages.size() > 0 && (message3 = page8.messages.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    page8.updateMessages();
                                    page8.updateScroll = true;
                                    break;
                            }
                        }
                    });
                    actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.ChangeRecipient), R.drawable.msg_forward_replace, null);
                    this.menu.linearLayout.addView(actionBarMenuSubItem3, LayoutHelper.createLinear(-1, 48));
                    ActionBarPopupWindow.GapView gapView2 = new ActionBarPopupWindow.GapView(context, Theme.key_actionBarDefaultSubmenuSeparator, resourcesDelegate2);
                    gapView2.setColor(Theme.multAlpha(0.06f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesDelegate2)));
                    gapView2.setTag(R.id.fit_width_tag, 1);
                    this.menu.linearLayout.addView(gapView2, LayoutHelper.createLinear(-1, 8));
                    ActionBarMenuSubItem actionBarMenuSubItem4 = new ActionBarMenuSubItem(1, context, anonymousClass64.resourcesProvider, false, false);
                    actionBarMenuSubItem4.setTextAndIcon(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                    final int i17 = 0;
                    actionBarMenuSubItem4.setOnClickListener(new View.OnClickListener(this) {
                        public final MessagePreviewView.Page f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i17) {
                                case 0:
                                    this.f$0.this$0.dismiss(true);
                                    break;
                                case 1:
                                    MessagePreviewView.Page page4 = this.f$0;
                                    page4.this$0.messagePreviewParams.quote = null;
                                    page4.textSelectionHelper.clear(false);
                                    page4.switchToQuote(false, false);
                                    page4.menu.getSwipeBack().closeForeground(true);
                                    break;
                                case 2:
                                    MessagePreviewView.Page page5 = this.f$0;
                                    if (page5.getReplyMessage(null) != null) {
                                        MessagePreviewView.Page.AnonymousClass4 anonymousClass5 = page5.textSelectionHelper;
                                        int i18 = anonymousClass5.selectionEnd - anonymousClass5.selectionStart;
                                        ChatActivity.AnonymousClass64 anonymousClass65 = page5.this$0;
                                        if (i18 <= MessagesController.getInstance(anonymousClass65.currentAccount).quoteLengthMax) {
                                            TextSelectionHelper.SelectableView selectableView = anonymousClass5.selectedView;
                                            MessageObject replyMessage = page5.getReplyMessage(selectableView != null ? ((ChatMessageCell) selectableView).getMessageObject() : null);
                                            int i19 = anonymousClass5.selectionStart;
                                            MessagePreviewParams messagePreviewParams2 = anonymousClass65.messagePreviewParams;
                                            messagePreviewParams2.quoteStart = i19;
                                            int i110 = anonymousClass5.selectionEnd;
                                            messagePreviewParams2.quoteEnd = i110;
                                            messagePreviewParams2.quote = ChatActivity.ReplyQuote.from(i19, i110, replyMessage);
                                            anonymousClass65.onQuoteSelectedPart();
                                            anonymousClass65.dismiss(true);
                                        } else {
                                            page5.showQuoteLengthError();
                                        }
                                    }
                                    break;
                                case 3:
                                    MessagePreviewView.Page page6 = this.f$0;
                                    ChatActivity.AnonymousClass64 anonymousClass66 = page6.this$0;
                                    MessagePreviewParams messagePreviewParams3 = anonymousClass66.messagePreviewParams;
                                    ChatActivity.ReplyQuote replyQuote = messagePreviewParams3.quote;
                                    boolean z2 = anonymousClass66.showOutdatedQuote;
                                    MessagePreviewView.Page.AnonymousClass4 anonymousClass8 = page6.textSelectionHelper;
                                    if (replyQuote == null || z2) {
                                        int i111 = anonymousClass8.selectionEnd - anonymousClass8.selectionStart;
                                        int i112 = anonymousClass66.currentAccount;
                                        if (i111 <= MessagesController.getInstance(i112).quoteLengthMax) {
                                            MessageObject replyMessage2 = page6.getReplyMessage(null);
                                            if (replyMessage2 != null) {
                                                boolean zIsInSelectionMode = anonymousClass8.isInSelectionMode();
                                                MessagePreviewParams messagePreviewParams4 = anonymousClass66.messagePreviewParams;
                                                if (!zIsInSelectionMode) {
                                                    messagePreviewParams4.quoteStart = 0;
                                                    messagePreviewParams4.quoteEnd = Math.min(MessagesController.getInstance(i112).quoteLengthMax, replyMessage2.messageOwner.message.length());
                                                    messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, replyMessage2);
                                                    View replyMessageCell = page6.getReplyMessageCell();
                                                    if (replyMessageCell instanceof ChatMessageCell) {
                                                        anonymousClass8.select((ChatMessageCell) replyMessageCell, messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd);
                                                    }
                                                    if (!z2) {
                                                        page6.menu.getSwipeBack().openForeground(page6.menuBack);
                                                    }
                                                    page6.switchToQuote(true, true);
                                                } else {
                                                    messagePreviewParams4.quoteStart = anonymousClass8.selectionStart;
                                                    messagePreviewParams4.quoteEnd = anonymousClass8.selectionEnd;
                                                    TextSelectionHelper.SelectableView selectableView2 = anonymousClass8.selectedView;
                                                    messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, page6.getReplyMessage(selectableView2 != null ? ((ChatMessageCell) selectableView2).getMessageObject() : null));
                                                    anonymousClass66.onQuoteSelectedPart();
                                                    anonymousClass66.dismiss(true);
                                                }
                                            }
                                        } else {
                                            page6.showQuoteLengthError();
                                        }
                                    } else {
                                        messagePreviewParams3.quote = null;
                                        anonymousClass8.clear(false);
                                        page6.switchToQuote(false, true);
                                        page6.updateSubtitle(true);
                                    }
                                    break;
                                case 4:
                                    this.f$0.this$0.selectAnotherChat(false);
                                    break;
                                case 5:
                                    this.f$0.this$0.selectAnotherChat(false);
                                    break;
                                case 6:
                                    this.f$0.this$0.dismiss(true);
                                    break;
                                case 7:
                                    ChatActivity.AnonymousClass64 anonymousClass67 = this.f$0.this$0;
                                    boolean z3 = anonymousClass67.showOutdatedQuote;
                                    ChatActivity chatActivity = ChatActivity.this;
                                    if (!z3) {
                                        anonymousClass67.dismiss(true);
                                        chatActivity.replyingMessageObject = null;
                                        chatActivity.replyingQuote = null;
                                        chatActivity.messagePreviewParams.updateReply(null, null, chatActivity.dialog_id, null);
                                        chatActivity.fallbackFieldPanel();
                                    } else {
                                        anonymousClass67.dismiss(true);
                                        chatActivity.replyingQuote = null;
                                        chatActivity.showFieldPanelForReply(chatActivity.replyingMessageObject);
                                    }
                                    break;
                                case 8:
                                    this.f$0.this$0.selectAnotherChat(true);
                                    break;
                                case 9:
                                    ChatActivity.AnonymousClass64 anonymousClass68 = this.f$0.this$0;
                                    anonymousClass68.dismiss(true);
                                    ChatActivity chatActivity2 = ChatActivity.this;
                                    chatActivity2.messagePreviewParams.updateForward(null, chatActivity2.dialog_id);
                                    chatActivity2.fallbackFieldPanel();
                                    break;
                                case 10:
                                    this.f$0.this$0.dismiss(true);
                                    break;
                                case 11:
                                    ChatActivity.AnonymousClass64 anonymousClass69 = this.f$0.this$0;
                                    anonymousClass69.dismiss(true);
                                    ChatActivity chatActivity3 = ChatActivity.this;
                                    chatActivity3.foundWebPage = null;
                                    ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity3.chatActivityEnterView;
                                    if (anonymousClass39 != null) {
                                        anonymousClass39.messageWebPage = null;
                                        anonymousClass39.messageWebPageSearch = false;
                                    }
                                    MessagePreviewParams messagePreviewParams5 = chatActivity3.messagePreviewParams;
                                    if (messagePreviewParams5 != null) {
                                        int i113 = ((BaseFragment) chatActivity3).currentAccount;
                                        MessageObject messageObject = chatActivity3.replyingMessageObject;
                                        messagePreviewParams5.updateLink(i113, null, null, messageObject == chatActivity3.threadMessageObject ? null : messageObject, chatActivity3.replyingQuote, chatActivity3.editingMessageObject);
                                    }
                                    chatActivity3.fallbackFieldPanel();
                                    break;
                                case 12:
                                    MessagePreviewView.Page page7 = this.f$0;
                                    ChatActivity.AnonymousClass64 anonymousClass610 = page7.this$0;
                                    MessagePreviewParams messagePreviewParams6 = anonymousClass610.messagePreviewParams;
                                    if (messagePreviewParams6.hasMedia) {
                                        boolean z4 = !messagePreviewParams6.webpageSmall;
                                        messagePreviewParams6.webpageSmall = z4;
                                        page7.changeSizeBtn.setState(z4, true);
                                        MessagePreviewParams messagePreviewParams7 = anonymousClass610.messagePreviewParams;
                                        page7.videoChangeSizeBtn.setState(messagePreviewParams7.webpageSmall, true);
                                        if (page7.messages.messages.size() > 0 && (message2 = page7.messages.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z5 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z5;
                                            messageMedia2.force_large_media = !z5;
                                        }
                                        if (page7.messages.previewMessages.size() > 0 && (message = page7.messages.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z6 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z6;
                                            messageMedia.force_large_media = !z6;
                                        }
                                        page7.updateMessages();
                                        page7.updateScroll = true;
                                        break;
                                    }
                                    break;
                                default:
                                    MessagePreviewView.Page page8 = this.f$0;
                                    ChatActivity.AnonymousClass64 anonymousClass611 = page8.this$0;
                                    MessagePreviewParams messagePreviewParams8 = anonymousClass611.messagePreviewParams;
                                    boolean z7 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z7;
                                    page8.changePositionBtn.setState(z7, true);
                                    int size = page8.messages.messages.size();
                                    MessagePreviewParams messagePreviewParams9 = anonymousClass611.messagePreviewParams;
                                    if (size > 0 && (message4 = page8.messages.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    if (page8.messages.previewMessages.size() > 0 && (message3 = page8.messages.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    page8.updateMessages();
                                    page8.updateScroll = true;
                                    break;
                            }
                        }
                    });
                    this.menu.linearLayout.addView(actionBarMenuSubItem4, LayoutHelper.createLinear(-1, 48));
                    ActionBarMenuSubItem actionBarMenuSubItem5 = new ActionBarMenuSubItem(1, context, anonymousClass64.resourcesProvider, false, true);
                    actionBarMenuSubItem5.setTextAndIcon(LocaleController.getString(R.string.DoNotForward), R.drawable.msg_delete, null);
                    int color3 = Theme.getColor(Theme.key_text_RedBold, resourcesDelegate2);
                    int i18 = Theme.key_text_RedRegular;
                    int color4 = Theme.getColor(i18, resourcesDelegate2);
                    actionBarMenuSubItem5.setTextColor(color3);
                    actionBarMenuSubItem5.setIconColor(color4);
                    final int i19 = 9;
                    actionBarMenuSubItem5.setOnClickListener(new View.OnClickListener(this) {
                        public final MessagePreviewView.Page f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i19) {
                                case 0:
                                    this.f$0.this$0.dismiss(true);
                                    break;
                                case 1:
                                    MessagePreviewView.Page page4 = this.f$0;
                                    page4.this$0.messagePreviewParams.quote = null;
                                    page4.textSelectionHelper.clear(false);
                                    page4.switchToQuote(false, false);
                                    page4.menu.getSwipeBack().closeForeground(true);
                                    break;
                                case 2:
                                    MessagePreviewView.Page page5 = this.f$0;
                                    if (page5.getReplyMessage(null) != null) {
                                        MessagePreviewView.Page.AnonymousClass4 anonymousClass5 = page5.textSelectionHelper;
                                        int i110 = anonymousClass5.selectionEnd - anonymousClass5.selectionStart;
                                        ChatActivity.AnonymousClass64 anonymousClass65 = page5.this$0;
                                        if (i110 <= MessagesController.getInstance(anonymousClass65.currentAccount).quoteLengthMax) {
                                            TextSelectionHelper.SelectableView selectableView = anonymousClass5.selectedView;
                                            MessageObject replyMessage = page5.getReplyMessage(selectableView != null ? ((ChatMessageCell) selectableView).getMessageObject() : null);
                                            int i111 = anonymousClass5.selectionStart;
                                            MessagePreviewParams messagePreviewParams2 = anonymousClass65.messagePreviewParams;
                                            messagePreviewParams2.quoteStart = i111;
                                            int i112 = anonymousClass5.selectionEnd;
                                            messagePreviewParams2.quoteEnd = i112;
                                            messagePreviewParams2.quote = ChatActivity.ReplyQuote.from(i111, i112, replyMessage);
                                            anonymousClass65.onQuoteSelectedPart();
                                            anonymousClass65.dismiss(true);
                                        } else {
                                            page5.showQuoteLengthError();
                                        }
                                    }
                                    break;
                                case 3:
                                    MessagePreviewView.Page page6 = this.f$0;
                                    ChatActivity.AnonymousClass64 anonymousClass66 = page6.this$0;
                                    MessagePreviewParams messagePreviewParams3 = anonymousClass66.messagePreviewParams;
                                    ChatActivity.ReplyQuote replyQuote = messagePreviewParams3.quote;
                                    boolean z2 = anonymousClass66.showOutdatedQuote;
                                    MessagePreviewView.Page.AnonymousClass4 anonymousClass8 = page6.textSelectionHelper;
                                    if (replyQuote == null || z2) {
                                        int i113 = anonymousClass8.selectionEnd - anonymousClass8.selectionStart;
                                        int i114 = anonymousClass66.currentAccount;
                                        if (i113 <= MessagesController.getInstance(i114).quoteLengthMax) {
                                            MessageObject replyMessage2 = page6.getReplyMessage(null);
                                            if (replyMessage2 != null) {
                                                boolean zIsInSelectionMode = anonymousClass8.isInSelectionMode();
                                                MessagePreviewParams messagePreviewParams4 = anonymousClass66.messagePreviewParams;
                                                if (!zIsInSelectionMode) {
                                                    messagePreviewParams4.quoteStart = 0;
                                                    messagePreviewParams4.quoteEnd = Math.min(MessagesController.getInstance(i114).quoteLengthMax, replyMessage2.messageOwner.message.length());
                                                    messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, replyMessage2);
                                                    View replyMessageCell = page6.getReplyMessageCell();
                                                    if (replyMessageCell instanceof ChatMessageCell) {
                                                        anonymousClass8.select((ChatMessageCell) replyMessageCell, messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd);
                                                    }
                                                    if (!z2) {
                                                        page6.menu.getSwipeBack().openForeground(page6.menuBack);
                                                    }
                                                    page6.switchToQuote(true, true);
                                                } else {
                                                    messagePreviewParams4.quoteStart = anonymousClass8.selectionStart;
                                                    messagePreviewParams4.quoteEnd = anonymousClass8.selectionEnd;
                                                    TextSelectionHelper.SelectableView selectableView2 = anonymousClass8.selectedView;
                                                    messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, page6.getReplyMessage(selectableView2 != null ? ((ChatMessageCell) selectableView2).getMessageObject() : null));
                                                    anonymousClass66.onQuoteSelectedPart();
                                                    anonymousClass66.dismiss(true);
                                                }
                                            }
                                        } else {
                                            page6.showQuoteLengthError();
                                        }
                                    } else {
                                        messagePreviewParams3.quote = null;
                                        anonymousClass8.clear(false);
                                        page6.switchToQuote(false, true);
                                        page6.updateSubtitle(true);
                                    }
                                    break;
                                case 4:
                                    this.f$0.this$0.selectAnotherChat(false);
                                    break;
                                case 5:
                                    this.f$0.this$0.selectAnotherChat(false);
                                    break;
                                case 6:
                                    this.f$0.this$0.dismiss(true);
                                    break;
                                case 7:
                                    ChatActivity.AnonymousClass64 anonymousClass67 = this.f$0.this$0;
                                    boolean z3 = anonymousClass67.showOutdatedQuote;
                                    ChatActivity chatActivity = ChatActivity.this;
                                    if (!z3) {
                                        anonymousClass67.dismiss(true);
                                        chatActivity.replyingMessageObject = null;
                                        chatActivity.replyingQuote = null;
                                        chatActivity.messagePreviewParams.updateReply(null, null, chatActivity.dialog_id, null);
                                        chatActivity.fallbackFieldPanel();
                                    } else {
                                        anonymousClass67.dismiss(true);
                                        chatActivity.replyingQuote = null;
                                        chatActivity.showFieldPanelForReply(chatActivity.replyingMessageObject);
                                    }
                                    break;
                                case 8:
                                    this.f$0.this$0.selectAnotherChat(true);
                                    break;
                                case 9:
                                    ChatActivity.AnonymousClass64 anonymousClass68 = this.f$0.this$0;
                                    anonymousClass68.dismiss(true);
                                    ChatActivity chatActivity2 = ChatActivity.this;
                                    chatActivity2.messagePreviewParams.updateForward(null, chatActivity2.dialog_id);
                                    chatActivity2.fallbackFieldPanel();
                                    break;
                                case 10:
                                    this.f$0.this$0.dismiss(true);
                                    break;
                                case 11:
                                    ChatActivity.AnonymousClass64 anonymousClass69 = this.f$0.this$0;
                                    anonymousClass69.dismiss(true);
                                    ChatActivity chatActivity3 = ChatActivity.this;
                                    chatActivity3.foundWebPage = null;
                                    ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity3.chatActivityEnterView;
                                    if (anonymousClass39 != null) {
                                        anonymousClass39.messageWebPage = null;
                                        anonymousClass39.messageWebPageSearch = false;
                                    }
                                    MessagePreviewParams messagePreviewParams5 = chatActivity3.messagePreviewParams;
                                    if (messagePreviewParams5 != null) {
                                        int i115 = ((BaseFragment) chatActivity3).currentAccount;
                                        MessageObject messageObject = chatActivity3.replyingMessageObject;
                                        messagePreviewParams5.updateLink(i115, null, null, messageObject == chatActivity3.threadMessageObject ? null : messageObject, chatActivity3.replyingQuote, chatActivity3.editingMessageObject);
                                    }
                                    chatActivity3.fallbackFieldPanel();
                                    break;
                                case 12:
                                    MessagePreviewView.Page page7 = this.f$0;
                                    ChatActivity.AnonymousClass64 anonymousClass610 = page7.this$0;
                                    MessagePreviewParams messagePreviewParams6 = anonymousClass610.messagePreviewParams;
                                    if (messagePreviewParams6.hasMedia) {
                                        boolean z4 = !messagePreviewParams6.webpageSmall;
                                        messagePreviewParams6.webpageSmall = z4;
                                        page7.changeSizeBtn.setState(z4, true);
                                        MessagePreviewParams messagePreviewParams7 = anonymousClass610.messagePreviewParams;
                                        page7.videoChangeSizeBtn.setState(messagePreviewParams7.webpageSmall, true);
                                        if (page7.messages.messages.size() > 0 && (message2 = page7.messages.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z5 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z5;
                                            messageMedia2.force_large_media = !z5;
                                        }
                                        if (page7.messages.previewMessages.size() > 0 && (message = page7.messages.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z6 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z6;
                                            messageMedia.force_large_media = !z6;
                                        }
                                        page7.updateMessages();
                                        page7.updateScroll = true;
                                        break;
                                    }
                                    break;
                                default:
                                    MessagePreviewView.Page page8 = this.f$0;
                                    ChatActivity.AnonymousClass64 anonymousClass611 = page8.this$0;
                                    MessagePreviewParams messagePreviewParams8 = anonymousClass611.messagePreviewParams;
                                    boolean z7 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z7;
                                    page8.changePositionBtn.setState(z7, true);
                                    int size = page8.messages.messages.size();
                                    MessagePreviewParams messagePreviewParams9 = anonymousClass611.messagePreviewParams;
                                    if (size > 0 && (message4 = page8.messages.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    if (page8.messages.previewMessages.size() > 0 && (message3 = page8.messages.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    page8.updateMessages();
                                    page8.updateScroll = true;
                                    break;
                            }
                        }
                    });
                    actionBarMenuSubItem5.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(null, i18, false)));
                    this.menu.linearLayout.addView(actionBarMenuSubItem5, LayoutHelper.createLinear(-1, 48));
                    ToggleButton toggleButton8 = toggleButton;
                    toggleButton8.setState(messagePreviewParams.hideForwardSendersName, false);
                    ToggleButton toggleButton9 = toggleButton2;
                    Page page4 = this;
                    toggleButton8.setOnClickListener(new ProfileGiftsContainer$Page$$ExternalSyntheticLambda16(this, z, context, toggleButton9, toggleButton8, 1));
                    page2 = page4;
                    if (toggleButton9 != null) {
                        toggleButton9.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62(page4, toggleButton9, toggleButton8, 24));
                        page2 = page4;
                    }
                }
                page2 = page;
                context2 = context;
                page3 = page2;
            } else {
                boolean z2 = messages.hasText;
                boolean z3 = anonymousClass64.showOutdatedQuote;
                if (!z2 || messagePreviewParams.isSecret) {
                    resourcesDelegate = resourcesDelegate2;
                } else {
                    ViewGroup viewGroupM = zzkf.m(context3, 1);
                    if (z3) {
                        resourcesDelegate = resourcesDelegate2;
                        viewGroup = viewGroupM;
                    } else {
                        ActionBarMenuSubItem actionBarMenuSubItem6 = new ActionBarMenuSubItem(0, context3, anonymousClass64.resourcesProvider, true, false);
                        actionBarMenuSubItem6.setTextAndIcon(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                        actionBarMenuSubItem6.setOnClickListener(new View.OnClickListener(this) {
                            public final MessagePreviewView.Page f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (i5) {
                                    case 0:
                                        this.f$0.this$0.dismiss(true);
                                        break;
                                    case 1:
                                        MessagePreviewView.Page page5 = this.f$0;
                                        page5.this$0.messagePreviewParams.quote = null;
                                        page5.textSelectionHelper.clear(false);
                                        page5.switchToQuote(false, false);
                                        page5.menu.getSwipeBack().closeForeground(true);
                                        break;
                                    case 2:
                                        MessagePreviewView.Page page6 = this.f$0;
                                        if (page6.getReplyMessage(null) != null) {
                                            MessagePreviewView.Page.AnonymousClass4 anonymousClass5 = page6.textSelectionHelper;
                                            int i110 = anonymousClass5.selectionEnd - anonymousClass5.selectionStart;
                                            ChatActivity.AnonymousClass64 anonymousClass65 = page6.this$0;
                                            if (i110 <= MessagesController.getInstance(anonymousClass65.currentAccount).quoteLengthMax) {
                                                TextSelectionHelper.SelectableView selectableView = anonymousClass5.selectedView;
                                                MessageObject replyMessage = page6.getReplyMessage(selectableView != null ? ((ChatMessageCell) selectableView).getMessageObject() : null);
                                                int i111 = anonymousClass5.selectionStart;
                                                MessagePreviewParams messagePreviewParams2 = anonymousClass65.messagePreviewParams;
                                                messagePreviewParams2.quoteStart = i111;
                                                int i112 = anonymousClass5.selectionEnd;
                                                messagePreviewParams2.quoteEnd = i112;
                                                messagePreviewParams2.quote = ChatActivity.ReplyQuote.from(i111, i112, replyMessage);
                                                anonymousClass65.onQuoteSelectedPart();
                                                anonymousClass65.dismiss(true);
                                            } else {
                                                page6.showQuoteLengthError();
                                            }
                                        }
                                        break;
                                    case 3:
                                        MessagePreviewView.Page page7 = this.f$0;
                                        ChatActivity.AnonymousClass64 anonymousClass66 = page7.this$0;
                                        MessagePreviewParams messagePreviewParams3 = anonymousClass66.messagePreviewParams;
                                        ChatActivity.ReplyQuote replyQuote = messagePreviewParams3.quote;
                                        boolean z4 = anonymousClass66.showOutdatedQuote;
                                        MessagePreviewView.Page.AnonymousClass4 anonymousClass8 = page7.textSelectionHelper;
                                        if (replyQuote == null || z4) {
                                            int i113 = anonymousClass8.selectionEnd - anonymousClass8.selectionStart;
                                            int i114 = anonymousClass66.currentAccount;
                                            if (i113 <= MessagesController.getInstance(i114).quoteLengthMax) {
                                                MessageObject replyMessage2 = page7.getReplyMessage(null);
                                                if (replyMessage2 != null) {
                                                    boolean zIsInSelectionMode = anonymousClass8.isInSelectionMode();
                                                    MessagePreviewParams messagePreviewParams4 = anonymousClass66.messagePreviewParams;
                                                    if (!zIsInSelectionMode) {
                                                        messagePreviewParams4.quoteStart = 0;
                                                        messagePreviewParams4.quoteEnd = Math.min(MessagesController.getInstance(i114).quoteLengthMax, replyMessage2.messageOwner.message.length());
                                                        messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, replyMessage2);
                                                        View replyMessageCell = page7.getReplyMessageCell();
                                                        if (replyMessageCell instanceof ChatMessageCell) {
                                                            anonymousClass8.select((ChatMessageCell) replyMessageCell, messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd);
                                                        }
                                                        if (!z4) {
                                                            page7.menu.getSwipeBack().openForeground(page7.menuBack);
                                                        }
                                                        page7.switchToQuote(true, true);
                                                    } else {
                                                        messagePreviewParams4.quoteStart = anonymousClass8.selectionStart;
                                                        messagePreviewParams4.quoteEnd = anonymousClass8.selectionEnd;
                                                        TextSelectionHelper.SelectableView selectableView2 = anonymousClass8.selectedView;
                                                        messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, page7.getReplyMessage(selectableView2 != null ? ((ChatMessageCell) selectableView2).getMessageObject() : null));
                                                        anonymousClass66.onQuoteSelectedPart();
                                                        anonymousClass66.dismiss(true);
                                                    }
                                                }
                                            } else {
                                                page7.showQuoteLengthError();
                                            }
                                        } else {
                                            messagePreviewParams3.quote = null;
                                            anonymousClass8.clear(false);
                                            page7.switchToQuote(false, true);
                                            page7.updateSubtitle(true);
                                        }
                                        break;
                                    case 4:
                                        this.f$0.this$0.selectAnotherChat(false);
                                        break;
                                    case 5:
                                        this.f$0.this$0.selectAnotherChat(false);
                                        break;
                                    case 6:
                                        this.f$0.this$0.dismiss(true);
                                        break;
                                    case 7:
                                        ChatActivity.AnonymousClass64 anonymousClass67 = this.f$0.this$0;
                                        boolean z5 = anonymousClass67.showOutdatedQuote;
                                        ChatActivity chatActivity = ChatActivity.this;
                                        if (!z5) {
                                            anonymousClass67.dismiss(true);
                                            chatActivity.replyingMessageObject = null;
                                            chatActivity.replyingQuote = null;
                                            chatActivity.messagePreviewParams.updateReply(null, null, chatActivity.dialog_id, null);
                                            chatActivity.fallbackFieldPanel();
                                        } else {
                                            anonymousClass67.dismiss(true);
                                            chatActivity.replyingQuote = null;
                                            chatActivity.showFieldPanelForReply(chatActivity.replyingMessageObject);
                                        }
                                        break;
                                    case 8:
                                        this.f$0.this$0.selectAnotherChat(true);
                                        break;
                                    case 9:
                                        ChatActivity.AnonymousClass64 anonymousClass68 = this.f$0.this$0;
                                        anonymousClass68.dismiss(true);
                                        ChatActivity chatActivity2 = ChatActivity.this;
                                        chatActivity2.messagePreviewParams.updateForward(null, chatActivity2.dialog_id);
                                        chatActivity2.fallbackFieldPanel();
                                        break;
                                    case 10:
                                        this.f$0.this$0.dismiss(true);
                                        break;
                                    case 11:
                                        ChatActivity.AnonymousClass64 anonymousClass69 = this.f$0.this$0;
                                        anonymousClass69.dismiss(true);
                                        ChatActivity chatActivity3 = ChatActivity.this;
                                        chatActivity3.foundWebPage = null;
                                        ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity3.chatActivityEnterView;
                                        if (anonymousClass39 != null) {
                                            anonymousClass39.messageWebPage = null;
                                            anonymousClass39.messageWebPageSearch = false;
                                        }
                                        MessagePreviewParams messagePreviewParams5 = chatActivity3.messagePreviewParams;
                                        if (messagePreviewParams5 != null) {
                                            int i115 = ((BaseFragment) chatActivity3).currentAccount;
                                            MessageObject messageObject = chatActivity3.replyingMessageObject;
                                            messagePreviewParams5.updateLink(i115, null, null, messageObject == chatActivity3.threadMessageObject ? null : messageObject, chatActivity3.replyingQuote, chatActivity3.editingMessageObject);
                                        }
                                        chatActivity3.fallbackFieldPanel();
                                        break;
                                    case 12:
                                        MessagePreviewView.Page page8 = this.f$0;
                                        ChatActivity.AnonymousClass64 anonymousClass610 = page8.this$0;
                                        MessagePreviewParams messagePreviewParams6 = anonymousClass610.messagePreviewParams;
                                        if (messagePreviewParams6.hasMedia) {
                                            boolean z6 = !messagePreviewParams6.webpageSmall;
                                            messagePreviewParams6.webpageSmall = z6;
                                            page8.changeSizeBtn.setState(z6, true);
                                            MessagePreviewParams messagePreviewParams7 = anonymousClass610.messagePreviewParams;
                                            page8.videoChangeSizeBtn.setState(messagePreviewParams7.webpageSmall, true);
                                            if (page8.messages.messages.size() > 0 && (message2 = page8.messages.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z7 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z7;
                                                messageMedia2.force_large_media = !z7;
                                            }
                                            if (page8.messages.previewMessages.size() > 0 && (message = page8.messages.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z8 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z8;
                                                messageMedia.force_large_media = !z8;
                                            }
                                            page8.updateMessages();
                                            page8.updateScroll = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        MessagePreviewView.Page page9 = this.f$0;
                                        ChatActivity.AnonymousClass64 anonymousClass611 = page9.this$0;
                                        MessagePreviewParams messagePreviewParams8 = anonymousClass611.messagePreviewParams;
                                        boolean z9 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z9;
                                        page9.changePositionBtn.setState(z9, true);
                                        int size = page9.messages.messages.size();
                                        MessagePreviewParams messagePreviewParams9 = anonymousClass611.messagePreviewParams;
                                        if (size > 0 && (message4 = page9.messages.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (page9.messages.previewMessages.size() > 0 && (message3 = page9.messages.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        page9.updateMessages();
                                        page9.updateScroll = true;
                                        break;
                                }
                            }
                        });
                        viewGroupM.addView(actionBarMenuSubItem6, LayoutHelper.createLinear(-1, 48));
                        ActionBarPopupWindow.GapView gapView3 = new ActionBarPopupWindow.GapView(context3, Theme.key_actionBarDefaultSubmenuSeparator, resourcesDelegate2);
                        gapView3.setColor(Theme.multAlpha(0.06f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesDelegate2)));
                        gapView3.setTag(R.id.fit_width_tag, 1);
                        viewGroupM.addView(gapView3, LayoutHelper.createLinear(-1, 8));
                        resourcesDelegate = resourcesDelegate2;
                        ActionBarMenuSubItem actionBarMenuSubItem7 = new ActionBarMenuSubItem(0, context3, anonymousClass64.resourcesProvider, false, true);
                        actionBarMenuSubItem7.setTextAndIcon(LocaleController.getString(R.string.QuoteSelectedPart), R.drawable.menu_quote_specific, null);
                        final int i20 = 2;
                        actionBarMenuSubItem7.setOnClickListener(new View.OnClickListener(this) {
                            public final MessagePreviewView.Page f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (i20) {
                                    case 0:
                                        this.f$0.this$0.dismiss(true);
                                        break;
                                    case 1:
                                        MessagePreviewView.Page page5 = this.f$0;
                                        page5.this$0.messagePreviewParams.quote = null;
                                        page5.textSelectionHelper.clear(false);
                                        page5.switchToQuote(false, false);
                                        page5.menu.getSwipeBack().closeForeground(true);
                                        break;
                                    case 2:
                                        MessagePreviewView.Page page6 = this.f$0;
                                        if (page6.getReplyMessage(null) != null) {
                                            MessagePreviewView.Page.AnonymousClass4 anonymousClass5 = page6.textSelectionHelper;
                                            int i110 = anonymousClass5.selectionEnd - anonymousClass5.selectionStart;
                                            ChatActivity.AnonymousClass64 anonymousClass65 = page6.this$0;
                                            if (i110 <= MessagesController.getInstance(anonymousClass65.currentAccount).quoteLengthMax) {
                                                TextSelectionHelper.SelectableView selectableView = anonymousClass5.selectedView;
                                                MessageObject replyMessage = page6.getReplyMessage(selectableView != null ? ((ChatMessageCell) selectableView).getMessageObject() : null);
                                                int i111 = anonymousClass5.selectionStart;
                                                MessagePreviewParams messagePreviewParams2 = anonymousClass65.messagePreviewParams;
                                                messagePreviewParams2.quoteStart = i111;
                                                int i112 = anonymousClass5.selectionEnd;
                                                messagePreviewParams2.quoteEnd = i112;
                                                messagePreviewParams2.quote = ChatActivity.ReplyQuote.from(i111, i112, replyMessage);
                                                anonymousClass65.onQuoteSelectedPart();
                                                anonymousClass65.dismiss(true);
                                            } else {
                                                page6.showQuoteLengthError();
                                            }
                                        }
                                        break;
                                    case 3:
                                        MessagePreviewView.Page page7 = this.f$0;
                                        ChatActivity.AnonymousClass64 anonymousClass66 = page7.this$0;
                                        MessagePreviewParams messagePreviewParams3 = anonymousClass66.messagePreviewParams;
                                        ChatActivity.ReplyQuote replyQuote = messagePreviewParams3.quote;
                                        boolean z4 = anonymousClass66.showOutdatedQuote;
                                        MessagePreviewView.Page.AnonymousClass4 anonymousClass8 = page7.textSelectionHelper;
                                        if (replyQuote == null || z4) {
                                            int i113 = anonymousClass8.selectionEnd - anonymousClass8.selectionStart;
                                            int i114 = anonymousClass66.currentAccount;
                                            if (i113 <= MessagesController.getInstance(i114).quoteLengthMax) {
                                                MessageObject replyMessage2 = page7.getReplyMessage(null);
                                                if (replyMessage2 != null) {
                                                    boolean zIsInSelectionMode = anonymousClass8.isInSelectionMode();
                                                    MessagePreviewParams messagePreviewParams4 = anonymousClass66.messagePreviewParams;
                                                    if (!zIsInSelectionMode) {
                                                        messagePreviewParams4.quoteStart = 0;
                                                        messagePreviewParams4.quoteEnd = Math.min(MessagesController.getInstance(i114).quoteLengthMax, replyMessage2.messageOwner.message.length());
                                                        messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, replyMessage2);
                                                        View replyMessageCell = page7.getReplyMessageCell();
                                                        if (replyMessageCell instanceof ChatMessageCell) {
                                                            anonymousClass8.select((ChatMessageCell) replyMessageCell, messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd);
                                                        }
                                                        if (!z4) {
                                                            page7.menu.getSwipeBack().openForeground(page7.menuBack);
                                                        }
                                                        page7.switchToQuote(true, true);
                                                    } else {
                                                        messagePreviewParams4.quoteStart = anonymousClass8.selectionStart;
                                                        messagePreviewParams4.quoteEnd = anonymousClass8.selectionEnd;
                                                        TextSelectionHelper.SelectableView selectableView2 = anonymousClass8.selectedView;
                                                        messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, page7.getReplyMessage(selectableView2 != null ? ((ChatMessageCell) selectableView2).getMessageObject() : null));
                                                        anonymousClass66.onQuoteSelectedPart();
                                                        anonymousClass66.dismiss(true);
                                                    }
                                                }
                                            } else {
                                                page7.showQuoteLengthError();
                                            }
                                        } else {
                                            messagePreviewParams3.quote = null;
                                            anonymousClass8.clear(false);
                                            page7.switchToQuote(false, true);
                                            page7.updateSubtitle(true);
                                        }
                                        break;
                                    case 4:
                                        this.f$0.this$0.selectAnotherChat(false);
                                        break;
                                    case 5:
                                        this.f$0.this$0.selectAnotherChat(false);
                                        break;
                                    case 6:
                                        this.f$0.this$0.dismiss(true);
                                        break;
                                    case 7:
                                        ChatActivity.AnonymousClass64 anonymousClass67 = this.f$0.this$0;
                                        boolean z5 = anonymousClass67.showOutdatedQuote;
                                        ChatActivity chatActivity = ChatActivity.this;
                                        if (!z5) {
                                            anonymousClass67.dismiss(true);
                                            chatActivity.replyingMessageObject = null;
                                            chatActivity.replyingQuote = null;
                                            chatActivity.messagePreviewParams.updateReply(null, null, chatActivity.dialog_id, null);
                                            chatActivity.fallbackFieldPanel();
                                        } else {
                                            anonymousClass67.dismiss(true);
                                            chatActivity.replyingQuote = null;
                                            chatActivity.showFieldPanelForReply(chatActivity.replyingMessageObject);
                                        }
                                        break;
                                    case 8:
                                        this.f$0.this$0.selectAnotherChat(true);
                                        break;
                                    case 9:
                                        ChatActivity.AnonymousClass64 anonymousClass68 = this.f$0.this$0;
                                        anonymousClass68.dismiss(true);
                                        ChatActivity chatActivity2 = ChatActivity.this;
                                        chatActivity2.messagePreviewParams.updateForward(null, chatActivity2.dialog_id);
                                        chatActivity2.fallbackFieldPanel();
                                        break;
                                    case 10:
                                        this.f$0.this$0.dismiss(true);
                                        break;
                                    case 11:
                                        ChatActivity.AnonymousClass64 anonymousClass69 = this.f$0.this$0;
                                        anonymousClass69.dismiss(true);
                                        ChatActivity chatActivity3 = ChatActivity.this;
                                        chatActivity3.foundWebPage = null;
                                        ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity3.chatActivityEnterView;
                                        if (anonymousClass39 != null) {
                                            anonymousClass39.messageWebPage = null;
                                            anonymousClass39.messageWebPageSearch = false;
                                        }
                                        MessagePreviewParams messagePreviewParams5 = chatActivity3.messagePreviewParams;
                                        if (messagePreviewParams5 != null) {
                                            int i115 = ((BaseFragment) chatActivity3).currentAccount;
                                            MessageObject messageObject = chatActivity3.replyingMessageObject;
                                            messagePreviewParams5.updateLink(i115, null, null, messageObject == chatActivity3.threadMessageObject ? null : messageObject, chatActivity3.replyingQuote, chatActivity3.editingMessageObject);
                                        }
                                        chatActivity3.fallbackFieldPanel();
                                        break;
                                    case 12:
                                        MessagePreviewView.Page page8 = this.f$0;
                                        ChatActivity.AnonymousClass64 anonymousClass610 = page8.this$0;
                                        MessagePreviewParams messagePreviewParams6 = anonymousClass610.messagePreviewParams;
                                        if (messagePreviewParams6.hasMedia) {
                                            boolean z6 = !messagePreviewParams6.webpageSmall;
                                            messagePreviewParams6.webpageSmall = z6;
                                            page8.changeSizeBtn.setState(z6, true);
                                            MessagePreviewParams messagePreviewParams7 = anonymousClass610.messagePreviewParams;
                                            page8.videoChangeSizeBtn.setState(messagePreviewParams7.webpageSmall, true);
                                            if (page8.messages.messages.size() > 0 && (message2 = page8.messages.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z7 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z7;
                                                messageMedia2.force_large_media = !z7;
                                            }
                                            if (page8.messages.previewMessages.size() > 0 && (message = page8.messages.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z8 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z8;
                                                messageMedia.force_large_media = !z8;
                                            }
                                            page8.updateMessages();
                                            page8.updateScroll = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        MessagePreviewView.Page page9 = this.f$0;
                                        ChatActivity.AnonymousClass64 anonymousClass611 = page9.this$0;
                                        MessagePreviewParams messagePreviewParams8 = anonymousClass611.messagePreviewParams;
                                        boolean z9 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z9;
                                        page9.changePositionBtn.setState(z9, true);
                                        int size = page9.messages.messages.size();
                                        MessagePreviewParams messagePreviewParams9 = anonymousClass611.messagePreviewParams;
                                        if (size > 0 && (message4 = page9.messages.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (page9.messages.previewMessages.size() > 0 && (message3 = page9.messages.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        page9.updateMessages();
                                        page9.updateScroll = true;
                                        break;
                                }
                            }
                        });
                        viewGroup = viewGroupM;
                        viewGroup.addView(actionBarMenuSubItem7, LayoutHelper.createLinear(-1, 48));
                    }
                    this.menuBack = actionBarPopupWindowLayout.addViewToSwipeBack(viewGroup);
                    actionBarPopupWindowLayout.getSwipeBack().setStickToRight(true);
                    FrameLayout frameLayout2 = new FrameLayout(context3);
                    final int i21 = 0;
                    ?? r2 = new ActionBarMenuSubItem(1, context, anonymousClass64.resourcesProvider, true, false) {
                        @Override
                        public final boolean onTouchEvent(MotionEvent motionEvent) {
                            switch (i21) {
                                case 0:
                                    if (getVisibility() != 0 || getAlpha() < 0.5f) {
                                        return false;
                                    }
                                    return super.onTouchEvent(motionEvent);
                                default:
                                    if (getVisibility() != 0 || getAlpha() < 0.5f) {
                                        return false;
                                    }
                                    return super.onTouchEvent(motionEvent);
                            }
                        }

                        @Override
                        public final void updateBackground() {
                            switch (i21) {
                                case 0:
                                    setBackground(null);
                                    break;
                                default:
                                    setBackground(null);
                                    break;
                            }
                        }
                    };
                    this.quoteButton = r2;
                    r2.setTextAndIcon(LocaleController.getString(z3 ? R.string.QuoteSelectedPart : R.string.SelectSpecificQuote), R.drawable.menu_select_quote, null);
                    final int i22 = 1;
                    ?? r4 = new ActionBarMenuSubItem(1, context, anonymousClass64.resourcesProvider, true, false) {
                        @Override
                        public final boolean onTouchEvent(MotionEvent motionEvent) {
                            switch (i22) {
                                case 0:
                                    if (getVisibility() != 0 || getAlpha() < 0.5f) {
                                        return false;
                                    }
                                    return super.onTouchEvent(motionEvent);
                                default:
                                    if (getVisibility() != 0 || getAlpha() < 0.5f) {
                                        return false;
                                    }
                                    return super.onTouchEvent(motionEvent);
                            }
                        }

                        @Override
                        public final void updateBackground() {
                            switch (i22) {
                                case 0:
                                    setBackground(null);
                                    break;
                                default:
                                    setBackground(null);
                                    break;
                            }
                        }
                    };
                    context3 = context;
                    this.clearQuoteButton = r4;
                    r4.setTextAndIcon(LocaleController.getString(R.string.ClearQuote), R.drawable.menu_quote_delete, null);
                    frameLayout2.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, resourcesDelegate), 6, 0));
                    final int i23 = 3;
                    frameLayout2.setOnClickListener(new View.OnClickListener(this) {
                        public final MessagePreviewView.Page f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i23) {
                                case 0:
                                    this.f$0.this$0.dismiss(true);
                                    break;
                                case 1:
                                    MessagePreviewView.Page page5 = this.f$0;
                                    page5.this$0.messagePreviewParams.quote = null;
                                    page5.textSelectionHelper.clear(false);
                                    page5.switchToQuote(false, false);
                                    page5.menu.getSwipeBack().closeForeground(true);
                                    break;
                                case 2:
                                    MessagePreviewView.Page page6 = this.f$0;
                                    if (page6.getReplyMessage(null) != null) {
                                        MessagePreviewView.Page.AnonymousClass4 anonymousClass5 = page6.textSelectionHelper;
                                        int i110 = anonymousClass5.selectionEnd - anonymousClass5.selectionStart;
                                        ChatActivity.AnonymousClass64 anonymousClass65 = page6.this$0;
                                        if (i110 <= MessagesController.getInstance(anonymousClass65.currentAccount).quoteLengthMax) {
                                            TextSelectionHelper.SelectableView selectableView = anonymousClass5.selectedView;
                                            MessageObject replyMessage = page6.getReplyMessage(selectableView != null ? ((ChatMessageCell) selectableView).getMessageObject() : null);
                                            int i111 = anonymousClass5.selectionStart;
                                            MessagePreviewParams messagePreviewParams2 = anonymousClass65.messagePreviewParams;
                                            messagePreviewParams2.quoteStart = i111;
                                            int i112 = anonymousClass5.selectionEnd;
                                            messagePreviewParams2.quoteEnd = i112;
                                            messagePreviewParams2.quote = ChatActivity.ReplyQuote.from(i111, i112, replyMessage);
                                            anonymousClass65.onQuoteSelectedPart();
                                            anonymousClass65.dismiss(true);
                                        } else {
                                            page6.showQuoteLengthError();
                                        }
                                    }
                                    break;
                                case 3:
                                    MessagePreviewView.Page page7 = this.f$0;
                                    ChatActivity.AnonymousClass64 anonymousClass66 = page7.this$0;
                                    MessagePreviewParams messagePreviewParams3 = anonymousClass66.messagePreviewParams;
                                    ChatActivity.ReplyQuote replyQuote = messagePreviewParams3.quote;
                                    boolean z4 = anonymousClass66.showOutdatedQuote;
                                    MessagePreviewView.Page.AnonymousClass4 anonymousClass8 = page7.textSelectionHelper;
                                    if (replyQuote == null || z4) {
                                        int i113 = anonymousClass8.selectionEnd - anonymousClass8.selectionStart;
                                        int i114 = anonymousClass66.currentAccount;
                                        if (i113 <= MessagesController.getInstance(i114).quoteLengthMax) {
                                            MessageObject replyMessage2 = page7.getReplyMessage(null);
                                            if (replyMessage2 != null) {
                                                boolean zIsInSelectionMode = anonymousClass8.isInSelectionMode();
                                                MessagePreviewParams messagePreviewParams4 = anonymousClass66.messagePreviewParams;
                                                if (!zIsInSelectionMode) {
                                                    messagePreviewParams4.quoteStart = 0;
                                                    messagePreviewParams4.quoteEnd = Math.min(MessagesController.getInstance(i114).quoteLengthMax, replyMessage2.messageOwner.message.length());
                                                    messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, replyMessage2);
                                                    View replyMessageCell = page7.getReplyMessageCell();
                                                    if (replyMessageCell instanceof ChatMessageCell) {
                                                        anonymousClass8.select((ChatMessageCell) replyMessageCell, messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd);
                                                    }
                                                    if (!z4) {
                                                        page7.menu.getSwipeBack().openForeground(page7.menuBack);
                                                    }
                                                    page7.switchToQuote(true, true);
                                                } else {
                                                    messagePreviewParams4.quoteStart = anonymousClass8.selectionStart;
                                                    messagePreviewParams4.quoteEnd = anonymousClass8.selectionEnd;
                                                    TextSelectionHelper.SelectableView selectableView2 = anonymousClass8.selectedView;
                                                    messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, page7.getReplyMessage(selectableView2 != null ? ((ChatMessageCell) selectableView2).getMessageObject() : null));
                                                    anonymousClass66.onQuoteSelectedPart();
                                                    anonymousClass66.dismiss(true);
                                                }
                                            }
                                        } else {
                                            page7.showQuoteLengthError();
                                        }
                                    } else {
                                        messagePreviewParams3.quote = null;
                                        anonymousClass8.clear(false);
                                        page7.switchToQuote(false, true);
                                        page7.updateSubtitle(true);
                                    }
                                    break;
                                case 4:
                                    this.f$0.this$0.selectAnotherChat(false);
                                    break;
                                case 5:
                                    this.f$0.this$0.selectAnotherChat(false);
                                    break;
                                case 6:
                                    this.f$0.this$0.dismiss(true);
                                    break;
                                case 7:
                                    ChatActivity.AnonymousClass64 anonymousClass67 = this.f$0.this$0;
                                    boolean z5 = anonymousClass67.showOutdatedQuote;
                                    ChatActivity chatActivity = ChatActivity.this;
                                    if (!z5) {
                                        anonymousClass67.dismiss(true);
                                        chatActivity.replyingMessageObject = null;
                                        chatActivity.replyingQuote = null;
                                        chatActivity.messagePreviewParams.updateReply(null, null, chatActivity.dialog_id, null);
                                        chatActivity.fallbackFieldPanel();
                                    } else {
                                        anonymousClass67.dismiss(true);
                                        chatActivity.replyingQuote = null;
                                        chatActivity.showFieldPanelForReply(chatActivity.replyingMessageObject);
                                    }
                                    break;
                                case 8:
                                    this.f$0.this$0.selectAnotherChat(true);
                                    break;
                                case 9:
                                    ChatActivity.AnonymousClass64 anonymousClass68 = this.f$0.this$0;
                                    anonymousClass68.dismiss(true);
                                    ChatActivity chatActivity2 = ChatActivity.this;
                                    chatActivity2.messagePreviewParams.updateForward(null, chatActivity2.dialog_id);
                                    chatActivity2.fallbackFieldPanel();
                                    break;
                                case 10:
                                    this.f$0.this$0.dismiss(true);
                                    break;
                                case 11:
                                    ChatActivity.AnonymousClass64 anonymousClass69 = this.f$0.this$0;
                                    anonymousClass69.dismiss(true);
                                    ChatActivity chatActivity3 = ChatActivity.this;
                                    chatActivity3.foundWebPage = null;
                                    ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity3.chatActivityEnterView;
                                    if (anonymousClass39 != null) {
                                        anonymousClass39.messageWebPage = null;
                                        anonymousClass39.messageWebPageSearch = false;
                                    }
                                    MessagePreviewParams messagePreviewParams5 = chatActivity3.messagePreviewParams;
                                    if (messagePreviewParams5 != null) {
                                        int i115 = ((BaseFragment) chatActivity3).currentAccount;
                                        MessageObject messageObject = chatActivity3.replyingMessageObject;
                                        messagePreviewParams5.updateLink(i115, null, null, messageObject == chatActivity3.threadMessageObject ? null : messageObject, chatActivity3.replyingQuote, chatActivity3.editingMessageObject);
                                    }
                                    chatActivity3.fallbackFieldPanel();
                                    break;
                                case 12:
                                    MessagePreviewView.Page page8 = this.f$0;
                                    ChatActivity.AnonymousClass64 anonymousClass610 = page8.this$0;
                                    MessagePreviewParams messagePreviewParams6 = anonymousClass610.messagePreviewParams;
                                    if (messagePreviewParams6.hasMedia) {
                                        boolean z6 = !messagePreviewParams6.webpageSmall;
                                        messagePreviewParams6.webpageSmall = z6;
                                        page8.changeSizeBtn.setState(z6, true);
                                        MessagePreviewParams messagePreviewParams7 = anonymousClass610.messagePreviewParams;
                                        page8.videoChangeSizeBtn.setState(messagePreviewParams7.webpageSmall, true);
                                        if (page8.messages.messages.size() > 0 && (message2 = page8.messages.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z7 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z7;
                                            messageMedia2.force_large_media = !z7;
                                        }
                                        if (page8.messages.previewMessages.size() > 0 && (message = page8.messages.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z8 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z8;
                                            messageMedia.force_large_media = !z8;
                                        }
                                        page8.updateMessages();
                                        page8.updateScroll = true;
                                        break;
                                    }
                                    break;
                                default:
                                    MessagePreviewView.Page page9 = this.f$0;
                                    ChatActivity.AnonymousClass64 anonymousClass611 = page9.this$0;
                                    MessagePreviewParams messagePreviewParams8 = anonymousClass611.messagePreviewParams;
                                    boolean z9 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z9;
                                    page9.changePositionBtn.setState(z9, true);
                                    int size = page9.messages.messages.size();
                                    MessagePreviewParams messagePreviewParams9 = anonymousClass611.messagePreviewParams;
                                    if (size > 0 && (message4 = page9.messages.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    if (page9.messages.previewMessages.size() > 0 && (message3 = page9.messages.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    page9.updateMessages();
                                    page9.updateScroll = true;
                                    break;
                            }
                        }
                    });
                    frameLayout2.addView((View) r2, LayoutHelper.createFrame(48.0f, -1));
                    frameLayout2.addView((View) r4, LayoutHelper.createFrame(48.0f, -1));
                    anonymousClass2.addView(frameLayout2, LayoutHelper.createLinear(-1, 48));
                }
                if (!messagePreviewParams.monoforum && !messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                    FrameLayout frameLayout3 = new FrameLayout(context3);
                    ActionBarMenuSubItem actionBarMenuSubItem8 = new ActionBarMenuSubItem(1, context3, anonymousClass64.resourcesProvider, false, false);
                    this.replyAnotherChatButton = actionBarMenuSubItem8;
                    String string2 = LocaleController.getString(R.string.ReplyToAnotherChat);
                    int i24 = R.drawable.msg_forward_replace;
                    actionBarMenuSubItem8.setTextAndIcon(string2, i24, null);
                    final int i25 = 4;
                    actionBarMenuSubItem8.setOnClickListener(new View.OnClickListener(this) {
                        public final MessagePreviewView.Page f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i25) {
                                case 0:
                                    this.f$0.this$0.dismiss(true);
                                    break;
                                case 1:
                                    MessagePreviewView.Page page5 = this.f$0;
                                    page5.this$0.messagePreviewParams.quote = null;
                                    page5.textSelectionHelper.clear(false);
                                    page5.switchToQuote(false, false);
                                    page5.menu.getSwipeBack().closeForeground(true);
                                    break;
                                case 2:
                                    MessagePreviewView.Page page6 = this.f$0;
                                    if (page6.getReplyMessage(null) != null) {
                                        MessagePreviewView.Page.AnonymousClass4 anonymousClass5 = page6.textSelectionHelper;
                                        int i110 = anonymousClass5.selectionEnd - anonymousClass5.selectionStart;
                                        ChatActivity.AnonymousClass64 anonymousClass65 = page6.this$0;
                                        if (i110 <= MessagesController.getInstance(anonymousClass65.currentAccount).quoteLengthMax) {
                                            TextSelectionHelper.SelectableView selectableView = anonymousClass5.selectedView;
                                            MessageObject replyMessage = page6.getReplyMessage(selectableView != null ? ((ChatMessageCell) selectableView).getMessageObject() : null);
                                            int i111 = anonymousClass5.selectionStart;
                                            MessagePreviewParams messagePreviewParams2 = anonymousClass65.messagePreviewParams;
                                            messagePreviewParams2.quoteStart = i111;
                                            int i112 = anonymousClass5.selectionEnd;
                                            messagePreviewParams2.quoteEnd = i112;
                                            messagePreviewParams2.quote = ChatActivity.ReplyQuote.from(i111, i112, replyMessage);
                                            anonymousClass65.onQuoteSelectedPart();
                                            anonymousClass65.dismiss(true);
                                        } else {
                                            page6.showQuoteLengthError();
                                        }
                                    }
                                    break;
                                case 3:
                                    MessagePreviewView.Page page7 = this.f$0;
                                    ChatActivity.AnonymousClass64 anonymousClass66 = page7.this$0;
                                    MessagePreviewParams messagePreviewParams3 = anonymousClass66.messagePreviewParams;
                                    ChatActivity.ReplyQuote replyQuote = messagePreviewParams3.quote;
                                    boolean z4 = anonymousClass66.showOutdatedQuote;
                                    MessagePreviewView.Page.AnonymousClass4 anonymousClass8 = page7.textSelectionHelper;
                                    if (replyQuote == null || z4) {
                                        int i113 = anonymousClass8.selectionEnd - anonymousClass8.selectionStart;
                                        int i114 = anonymousClass66.currentAccount;
                                        if (i113 <= MessagesController.getInstance(i114).quoteLengthMax) {
                                            MessageObject replyMessage2 = page7.getReplyMessage(null);
                                            if (replyMessage2 != null) {
                                                boolean zIsInSelectionMode = anonymousClass8.isInSelectionMode();
                                                MessagePreviewParams messagePreviewParams4 = anonymousClass66.messagePreviewParams;
                                                if (!zIsInSelectionMode) {
                                                    messagePreviewParams4.quoteStart = 0;
                                                    messagePreviewParams4.quoteEnd = Math.min(MessagesController.getInstance(i114).quoteLengthMax, replyMessage2.messageOwner.message.length());
                                                    messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, replyMessage2);
                                                    View replyMessageCell = page7.getReplyMessageCell();
                                                    if (replyMessageCell instanceof ChatMessageCell) {
                                                        anonymousClass8.select((ChatMessageCell) replyMessageCell, messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd);
                                                    }
                                                    if (!z4) {
                                                        page7.menu.getSwipeBack().openForeground(page7.menuBack);
                                                    }
                                                    page7.switchToQuote(true, true);
                                                } else {
                                                    messagePreviewParams4.quoteStart = anonymousClass8.selectionStart;
                                                    messagePreviewParams4.quoteEnd = anonymousClass8.selectionEnd;
                                                    TextSelectionHelper.SelectableView selectableView2 = anonymousClass8.selectedView;
                                                    messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, page7.getReplyMessage(selectableView2 != null ? ((ChatMessageCell) selectableView2).getMessageObject() : null));
                                                    anonymousClass66.onQuoteSelectedPart();
                                                    anonymousClass66.dismiss(true);
                                                }
                                            }
                                        } else {
                                            page7.showQuoteLengthError();
                                        }
                                    } else {
                                        messagePreviewParams3.quote = null;
                                        anonymousClass8.clear(false);
                                        page7.switchToQuote(false, true);
                                        page7.updateSubtitle(true);
                                    }
                                    break;
                                case 4:
                                    this.f$0.this$0.selectAnotherChat(false);
                                    break;
                                case 5:
                                    this.f$0.this$0.selectAnotherChat(false);
                                    break;
                                case 6:
                                    this.f$0.this$0.dismiss(true);
                                    break;
                                case 7:
                                    ChatActivity.AnonymousClass64 anonymousClass67 = this.f$0.this$0;
                                    boolean z5 = anonymousClass67.showOutdatedQuote;
                                    ChatActivity chatActivity = ChatActivity.this;
                                    if (!z5) {
                                        anonymousClass67.dismiss(true);
                                        chatActivity.replyingMessageObject = null;
                                        chatActivity.replyingQuote = null;
                                        chatActivity.messagePreviewParams.updateReply(null, null, chatActivity.dialog_id, null);
                                        chatActivity.fallbackFieldPanel();
                                    } else {
                                        anonymousClass67.dismiss(true);
                                        chatActivity.replyingQuote = null;
                                        chatActivity.showFieldPanelForReply(chatActivity.replyingMessageObject);
                                    }
                                    break;
                                case 8:
                                    this.f$0.this$0.selectAnotherChat(true);
                                    break;
                                case 9:
                                    ChatActivity.AnonymousClass64 anonymousClass68 = this.f$0.this$0;
                                    anonymousClass68.dismiss(true);
                                    ChatActivity chatActivity2 = ChatActivity.this;
                                    chatActivity2.messagePreviewParams.updateForward(null, chatActivity2.dialog_id);
                                    chatActivity2.fallbackFieldPanel();
                                    break;
                                case 10:
                                    this.f$0.this$0.dismiss(true);
                                    break;
                                case 11:
                                    ChatActivity.AnonymousClass64 anonymousClass69 = this.f$0.this$0;
                                    anonymousClass69.dismiss(true);
                                    ChatActivity chatActivity3 = ChatActivity.this;
                                    chatActivity3.foundWebPage = null;
                                    ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity3.chatActivityEnterView;
                                    if (anonymousClass39 != null) {
                                        anonymousClass39.messageWebPage = null;
                                        anonymousClass39.messageWebPageSearch = false;
                                    }
                                    MessagePreviewParams messagePreviewParams5 = chatActivity3.messagePreviewParams;
                                    if (messagePreviewParams5 != null) {
                                        int i115 = ((BaseFragment) chatActivity3).currentAccount;
                                        MessageObject messageObject = chatActivity3.replyingMessageObject;
                                        messagePreviewParams5.updateLink(i115, null, null, messageObject == chatActivity3.threadMessageObject ? null : messageObject, chatActivity3.replyingQuote, chatActivity3.editingMessageObject);
                                    }
                                    chatActivity3.fallbackFieldPanel();
                                    break;
                                case 12:
                                    MessagePreviewView.Page page8 = this.f$0;
                                    ChatActivity.AnonymousClass64 anonymousClass610 = page8.this$0;
                                    MessagePreviewParams messagePreviewParams6 = anonymousClass610.messagePreviewParams;
                                    if (messagePreviewParams6.hasMedia) {
                                        boolean z6 = !messagePreviewParams6.webpageSmall;
                                        messagePreviewParams6.webpageSmall = z6;
                                        page8.changeSizeBtn.setState(z6, true);
                                        MessagePreviewParams messagePreviewParams7 = anonymousClass610.messagePreviewParams;
                                        page8.videoChangeSizeBtn.setState(messagePreviewParams7.webpageSmall, true);
                                        if (page8.messages.messages.size() > 0 && (message2 = page8.messages.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z7 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z7;
                                            messageMedia2.force_large_media = !z7;
                                        }
                                        if (page8.messages.previewMessages.size() > 0 && (message = page8.messages.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z8 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z8;
                                            messageMedia.force_large_media = !z8;
                                        }
                                        page8.updateMessages();
                                        page8.updateScroll = true;
                                        break;
                                    }
                                    break;
                                default:
                                    MessagePreviewView.Page page9 = this.f$0;
                                    ChatActivity.AnonymousClass64 anonymousClass611 = page9.this$0;
                                    MessagePreviewParams messagePreviewParams8 = anonymousClass611.messagePreviewParams;
                                    boolean z9 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z9;
                                    page9.changePositionBtn.setState(z9, true);
                                    int size = page9.messages.messages.size();
                                    MessagePreviewParams messagePreviewParams9 = anonymousClass611.messagePreviewParams;
                                    if (size > 0 && (message4 = page9.messages.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    if (page9.messages.previewMessages.size() > 0 && (message3 = page9.messages.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    page9.updateMessages();
                                    page9.updateScroll = true;
                                    break;
                            }
                        }
                    });
                    context3 = context;
                    ActionBarMenuSubItem actionBarMenuSubItem9 = new ActionBarMenuSubItem(1, context3, anonymousClass64.resourcesProvider, false, false);
                    this.quoteAnotherChatButton = actionBarMenuSubItem9;
                    actionBarMenuSubItem9.setTextAndIcon(LocaleController.getString(R.string.QuoteToAnotherChat), i24, null);
                    final int i26 = 5;
                    actionBarMenuSubItem9.setOnClickListener(new View.OnClickListener(this) {
                        public final MessagePreviewView.Page f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i26) {
                                case 0:
                                    this.f$0.this$0.dismiss(true);
                                    break;
                                case 1:
                                    MessagePreviewView.Page page5 = this.f$0;
                                    page5.this$0.messagePreviewParams.quote = null;
                                    page5.textSelectionHelper.clear(false);
                                    page5.switchToQuote(false, false);
                                    page5.menu.getSwipeBack().closeForeground(true);
                                    break;
                                case 2:
                                    MessagePreviewView.Page page6 = this.f$0;
                                    if (page6.getReplyMessage(null) != null) {
                                        MessagePreviewView.Page.AnonymousClass4 anonymousClass5 = page6.textSelectionHelper;
                                        int i110 = anonymousClass5.selectionEnd - anonymousClass5.selectionStart;
                                        ChatActivity.AnonymousClass64 anonymousClass65 = page6.this$0;
                                        if (i110 <= MessagesController.getInstance(anonymousClass65.currentAccount).quoteLengthMax) {
                                            TextSelectionHelper.SelectableView selectableView = anonymousClass5.selectedView;
                                            MessageObject replyMessage = page6.getReplyMessage(selectableView != null ? ((ChatMessageCell) selectableView).getMessageObject() : null);
                                            int i111 = anonymousClass5.selectionStart;
                                            MessagePreviewParams messagePreviewParams2 = anonymousClass65.messagePreviewParams;
                                            messagePreviewParams2.quoteStart = i111;
                                            int i112 = anonymousClass5.selectionEnd;
                                            messagePreviewParams2.quoteEnd = i112;
                                            messagePreviewParams2.quote = ChatActivity.ReplyQuote.from(i111, i112, replyMessage);
                                            anonymousClass65.onQuoteSelectedPart();
                                            anonymousClass65.dismiss(true);
                                        } else {
                                            page6.showQuoteLengthError();
                                        }
                                    }
                                    break;
                                case 3:
                                    MessagePreviewView.Page page7 = this.f$0;
                                    ChatActivity.AnonymousClass64 anonymousClass66 = page7.this$0;
                                    MessagePreviewParams messagePreviewParams3 = anonymousClass66.messagePreviewParams;
                                    ChatActivity.ReplyQuote replyQuote = messagePreviewParams3.quote;
                                    boolean z4 = anonymousClass66.showOutdatedQuote;
                                    MessagePreviewView.Page.AnonymousClass4 anonymousClass8 = page7.textSelectionHelper;
                                    if (replyQuote == null || z4) {
                                        int i113 = anonymousClass8.selectionEnd - anonymousClass8.selectionStart;
                                        int i114 = anonymousClass66.currentAccount;
                                        if (i113 <= MessagesController.getInstance(i114).quoteLengthMax) {
                                            MessageObject replyMessage2 = page7.getReplyMessage(null);
                                            if (replyMessage2 != null) {
                                                boolean zIsInSelectionMode = anonymousClass8.isInSelectionMode();
                                                MessagePreviewParams messagePreviewParams4 = anonymousClass66.messagePreviewParams;
                                                if (!zIsInSelectionMode) {
                                                    messagePreviewParams4.quoteStart = 0;
                                                    messagePreviewParams4.quoteEnd = Math.min(MessagesController.getInstance(i114).quoteLengthMax, replyMessage2.messageOwner.message.length());
                                                    messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, replyMessage2);
                                                    View replyMessageCell = page7.getReplyMessageCell();
                                                    if (replyMessageCell instanceof ChatMessageCell) {
                                                        anonymousClass8.select((ChatMessageCell) replyMessageCell, messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd);
                                                    }
                                                    if (!z4) {
                                                        page7.menu.getSwipeBack().openForeground(page7.menuBack);
                                                    }
                                                    page7.switchToQuote(true, true);
                                                } else {
                                                    messagePreviewParams4.quoteStart = anonymousClass8.selectionStart;
                                                    messagePreviewParams4.quoteEnd = anonymousClass8.selectionEnd;
                                                    TextSelectionHelper.SelectableView selectableView2 = anonymousClass8.selectedView;
                                                    messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, page7.getReplyMessage(selectableView2 != null ? ((ChatMessageCell) selectableView2).getMessageObject() : null));
                                                    anonymousClass66.onQuoteSelectedPart();
                                                    anonymousClass66.dismiss(true);
                                                }
                                            }
                                        } else {
                                            page7.showQuoteLengthError();
                                        }
                                    } else {
                                        messagePreviewParams3.quote = null;
                                        anonymousClass8.clear(false);
                                        page7.switchToQuote(false, true);
                                        page7.updateSubtitle(true);
                                    }
                                    break;
                                case 4:
                                    this.f$0.this$0.selectAnotherChat(false);
                                    break;
                                case 5:
                                    this.f$0.this$0.selectAnotherChat(false);
                                    break;
                                case 6:
                                    this.f$0.this$0.dismiss(true);
                                    break;
                                case 7:
                                    ChatActivity.AnonymousClass64 anonymousClass67 = this.f$0.this$0;
                                    boolean z5 = anonymousClass67.showOutdatedQuote;
                                    ChatActivity chatActivity = ChatActivity.this;
                                    if (!z5) {
                                        anonymousClass67.dismiss(true);
                                        chatActivity.replyingMessageObject = null;
                                        chatActivity.replyingQuote = null;
                                        chatActivity.messagePreviewParams.updateReply(null, null, chatActivity.dialog_id, null);
                                        chatActivity.fallbackFieldPanel();
                                    } else {
                                        anonymousClass67.dismiss(true);
                                        chatActivity.replyingQuote = null;
                                        chatActivity.showFieldPanelForReply(chatActivity.replyingMessageObject);
                                    }
                                    break;
                                case 8:
                                    this.f$0.this$0.selectAnotherChat(true);
                                    break;
                                case 9:
                                    ChatActivity.AnonymousClass64 anonymousClass68 = this.f$0.this$0;
                                    anonymousClass68.dismiss(true);
                                    ChatActivity chatActivity2 = ChatActivity.this;
                                    chatActivity2.messagePreviewParams.updateForward(null, chatActivity2.dialog_id);
                                    chatActivity2.fallbackFieldPanel();
                                    break;
                                case 10:
                                    this.f$0.this$0.dismiss(true);
                                    break;
                                case 11:
                                    ChatActivity.AnonymousClass64 anonymousClass69 = this.f$0.this$0;
                                    anonymousClass69.dismiss(true);
                                    ChatActivity chatActivity3 = ChatActivity.this;
                                    chatActivity3.foundWebPage = null;
                                    ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity3.chatActivityEnterView;
                                    if (anonymousClass39 != null) {
                                        anonymousClass39.messageWebPage = null;
                                        anonymousClass39.messageWebPageSearch = false;
                                    }
                                    MessagePreviewParams messagePreviewParams5 = chatActivity3.messagePreviewParams;
                                    if (messagePreviewParams5 != null) {
                                        int i115 = ((BaseFragment) chatActivity3).currentAccount;
                                        MessageObject messageObject = chatActivity3.replyingMessageObject;
                                        messagePreviewParams5.updateLink(i115, null, null, messageObject == chatActivity3.threadMessageObject ? null : messageObject, chatActivity3.replyingQuote, chatActivity3.editingMessageObject);
                                    }
                                    chatActivity3.fallbackFieldPanel();
                                    break;
                                case 12:
                                    MessagePreviewView.Page page8 = this.f$0;
                                    ChatActivity.AnonymousClass64 anonymousClass610 = page8.this$0;
                                    MessagePreviewParams messagePreviewParams6 = anonymousClass610.messagePreviewParams;
                                    if (messagePreviewParams6.hasMedia) {
                                        boolean z6 = !messagePreviewParams6.webpageSmall;
                                        messagePreviewParams6.webpageSmall = z6;
                                        page8.changeSizeBtn.setState(z6, true);
                                        MessagePreviewParams messagePreviewParams7 = anonymousClass610.messagePreviewParams;
                                        page8.videoChangeSizeBtn.setState(messagePreviewParams7.webpageSmall, true);
                                        if (page8.messages.messages.size() > 0 && (message2 = page8.messages.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z7 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z7;
                                            messageMedia2.force_large_media = !z7;
                                        }
                                        if (page8.messages.previewMessages.size() > 0 && (message = page8.messages.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z8 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z8;
                                            messageMedia.force_large_media = !z8;
                                        }
                                        page8.updateMessages();
                                        page8.updateScroll = true;
                                        break;
                                    }
                                    break;
                                default:
                                    MessagePreviewView.Page page9 = this.f$0;
                                    ChatActivity.AnonymousClass64 anonymousClass611 = page9.this$0;
                                    MessagePreviewParams messagePreviewParams8 = anonymousClass611.messagePreviewParams;
                                    boolean z9 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z9;
                                    page9.changePositionBtn.setState(z9, true);
                                    int size = page9.messages.messages.size();
                                    MessagePreviewParams messagePreviewParams9 = anonymousClass611.messagePreviewParams;
                                    if (size > 0 && (message4 = page9.messages.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    if (page9.messages.previewMessages.size() > 0 && (message3 = page9.messages.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    page9.updateMessages();
                                    page9.updateScroll = true;
                                    break;
                            }
                        }
                    });
                    frameLayout3.addView(actionBarMenuSubItem9, LayoutHelper.createFrame(48.0f, -1));
                    frameLayout3.addView(actionBarMenuSubItem8, LayoutHelper.createFrame(48.0f, -1));
                    anonymousClass2.addView(frameLayout3, LayoutHelper.createLinear(-1, 48));
                }
                if (!messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                    ActionBarPopupWindow.GapView gapView4 = new ActionBarPopupWindow.GapView(context3, Theme.key_actionBarDefaultSubmenuSeparator, resourcesDelegate);
                    gapView4.setColor(Theme.multAlpha(0.06f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesDelegate)));
                    gapView4.setTag(R.id.fit_width_tag, 1);
                    anonymousClass2.addView(gapView4, LayoutHelper.createLinear(-1, 8));
                }
                switchToQuote(messagePreviewParams.quote != null, false);
                ActionBarMenuSubItem actionBarMenuSubItem10 = new ActionBarMenuSubItem(1, context3, anonymousClass64.resourcesProvider, false, false);
                actionBarMenuSubItem10.setTextAndIcon(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                final int i27 = 6;
                actionBarMenuSubItem10.setOnClickListener(new View.OnClickListener(this) {
                    public final MessagePreviewView.Page f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i27) {
                            case 0:
                                this.f$0.this$0.dismiss(true);
                                break;
                            case 1:
                                MessagePreviewView.Page page5 = this.f$0;
                                page5.this$0.messagePreviewParams.quote = null;
                                page5.textSelectionHelper.clear(false);
                                page5.switchToQuote(false, false);
                                page5.menu.getSwipeBack().closeForeground(true);
                                break;
                            case 2:
                                MessagePreviewView.Page page6 = this.f$0;
                                if (page6.getReplyMessage(null) != null) {
                                    MessagePreviewView.Page.AnonymousClass4 anonymousClass5 = page6.textSelectionHelper;
                                    int i110 = anonymousClass5.selectionEnd - anonymousClass5.selectionStart;
                                    ChatActivity.AnonymousClass64 anonymousClass65 = page6.this$0;
                                    if (i110 <= MessagesController.getInstance(anonymousClass65.currentAccount).quoteLengthMax) {
                                        TextSelectionHelper.SelectableView selectableView = anonymousClass5.selectedView;
                                        MessageObject replyMessage = page6.getReplyMessage(selectableView != null ? ((ChatMessageCell) selectableView).getMessageObject() : null);
                                        int i111 = anonymousClass5.selectionStart;
                                        MessagePreviewParams messagePreviewParams2 = anonymousClass65.messagePreviewParams;
                                        messagePreviewParams2.quoteStart = i111;
                                        int i112 = anonymousClass5.selectionEnd;
                                        messagePreviewParams2.quoteEnd = i112;
                                        messagePreviewParams2.quote = ChatActivity.ReplyQuote.from(i111, i112, replyMessage);
                                        anonymousClass65.onQuoteSelectedPart();
                                        anonymousClass65.dismiss(true);
                                    } else {
                                        page6.showQuoteLengthError();
                                    }
                                }
                                break;
                            case 3:
                                MessagePreviewView.Page page7 = this.f$0;
                                ChatActivity.AnonymousClass64 anonymousClass66 = page7.this$0;
                                MessagePreviewParams messagePreviewParams3 = anonymousClass66.messagePreviewParams;
                                ChatActivity.ReplyQuote replyQuote = messagePreviewParams3.quote;
                                boolean z4 = anonymousClass66.showOutdatedQuote;
                                MessagePreviewView.Page.AnonymousClass4 anonymousClass8 = page7.textSelectionHelper;
                                if (replyQuote == null || z4) {
                                    int i113 = anonymousClass8.selectionEnd - anonymousClass8.selectionStart;
                                    int i114 = anonymousClass66.currentAccount;
                                    if (i113 <= MessagesController.getInstance(i114).quoteLengthMax) {
                                        MessageObject replyMessage2 = page7.getReplyMessage(null);
                                        if (replyMessage2 != null) {
                                            boolean zIsInSelectionMode = anonymousClass8.isInSelectionMode();
                                            MessagePreviewParams messagePreviewParams4 = anonymousClass66.messagePreviewParams;
                                            if (!zIsInSelectionMode) {
                                                messagePreviewParams4.quoteStart = 0;
                                                messagePreviewParams4.quoteEnd = Math.min(MessagesController.getInstance(i114).quoteLengthMax, replyMessage2.messageOwner.message.length());
                                                messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, replyMessage2);
                                                View replyMessageCell = page7.getReplyMessageCell();
                                                if (replyMessageCell instanceof ChatMessageCell) {
                                                    anonymousClass8.select((ChatMessageCell) replyMessageCell, messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd);
                                                }
                                                if (!z4) {
                                                    page7.menu.getSwipeBack().openForeground(page7.menuBack);
                                                }
                                                page7.switchToQuote(true, true);
                                            } else {
                                                messagePreviewParams4.quoteStart = anonymousClass8.selectionStart;
                                                messagePreviewParams4.quoteEnd = anonymousClass8.selectionEnd;
                                                TextSelectionHelper.SelectableView selectableView2 = anonymousClass8.selectedView;
                                                messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, page7.getReplyMessage(selectableView2 != null ? ((ChatMessageCell) selectableView2).getMessageObject() : null));
                                                anonymousClass66.onQuoteSelectedPart();
                                                anonymousClass66.dismiss(true);
                                            }
                                        }
                                    } else {
                                        page7.showQuoteLengthError();
                                    }
                                } else {
                                    messagePreviewParams3.quote = null;
                                    anonymousClass8.clear(false);
                                    page7.switchToQuote(false, true);
                                    page7.updateSubtitle(true);
                                }
                                break;
                            case 4:
                                this.f$0.this$0.selectAnotherChat(false);
                                break;
                            case 5:
                                this.f$0.this$0.selectAnotherChat(false);
                                break;
                            case 6:
                                this.f$0.this$0.dismiss(true);
                                break;
                            case 7:
                                ChatActivity.AnonymousClass64 anonymousClass67 = this.f$0.this$0;
                                boolean z5 = anonymousClass67.showOutdatedQuote;
                                ChatActivity chatActivity = ChatActivity.this;
                                if (!z5) {
                                    anonymousClass67.dismiss(true);
                                    chatActivity.replyingMessageObject = null;
                                    chatActivity.replyingQuote = null;
                                    chatActivity.messagePreviewParams.updateReply(null, null, chatActivity.dialog_id, null);
                                    chatActivity.fallbackFieldPanel();
                                } else {
                                    anonymousClass67.dismiss(true);
                                    chatActivity.replyingQuote = null;
                                    chatActivity.showFieldPanelForReply(chatActivity.replyingMessageObject);
                                }
                                break;
                            case 8:
                                this.f$0.this$0.selectAnotherChat(true);
                                break;
                            case 9:
                                ChatActivity.AnonymousClass64 anonymousClass68 = this.f$0.this$0;
                                anonymousClass68.dismiss(true);
                                ChatActivity chatActivity2 = ChatActivity.this;
                                chatActivity2.messagePreviewParams.updateForward(null, chatActivity2.dialog_id);
                                chatActivity2.fallbackFieldPanel();
                                break;
                            case 10:
                                this.f$0.this$0.dismiss(true);
                                break;
                            case 11:
                                ChatActivity.AnonymousClass64 anonymousClass69 = this.f$0.this$0;
                                anonymousClass69.dismiss(true);
                                ChatActivity chatActivity3 = ChatActivity.this;
                                chatActivity3.foundWebPage = null;
                                ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity3.chatActivityEnterView;
                                if (anonymousClass39 != null) {
                                    anonymousClass39.messageWebPage = null;
                                    anonymousClass39.messageWebPageSearch = false;
                                }
                                MessagePreviewParams messagePreviewParams5 = chatActivity3.messagePreviewParams;
                                if (messagePreviewParams5 != null) {
                                    int i115 = ((BaseFragment) chatActivity3).currentAccount;
                                    MessageObject messageObject = chatActivity3.replyingMessageObject;
                                    messagePreviewParams5.updateLink(i115, null, null, messageObject == chatActivity3.threadMessageObject ? null : messageObject, chatActivity3.replyingQuote, chatActivity3.editingMessageObject);
                                }
                                chatActivity3.fallbackFieldPanel();
                                break;
                            case 12:
                                MessagePreviewView.Page page8 = this.f$0;
                                ChatActivity.AnonymousClass64 anonymousClass610 = page8.this$0;
                                MessagePreviewParams messagePreviewParams6 = anonymousClass610.messagePreviewParams;
                                if (messagePreviewParams6.hasMedia) {
                                    boolean z6 = !messagePreviewParams6.webpageSmall;
                                    messagePreviewParams6.webpageSmall = z6;
                                    page8.changeSizeBtn.setState(z6, true);
                                    MessagePreviewParams messagePreviewParams7 = anonymousClass610.messagePreviewParams;
                                    page8.videoChangeSizeBtn.setState(messagePreviewParams7.webpageSmall, true);
                                    if (page8.messages.messages.size() > 0 && (message2 = page8.messages.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z7 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z7;
                                        messageMedia2.force_large_media = !z7;
                                    }
                                    if (page8.messages.previewMessages.size() > 0 && (message = page8.messages.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z8 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z8;
                                        messageMedia.force_large_media = !z8;
                                    }
                                    page8.updateMessages();
                                    page8.updateScroll = true;
                                    break;
                                }
                                break;
                            default:
                                MessagePreviewView.Page page9 = this.f$0;
                                ChatActivity.AnonymousClass64 anonymousClass611 = page9.this$0;
                                MessagePreviewParams messagePreviewParams8 = anonymousClass611.messagePreviewParams;
                                boolean z9 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z9;
                                page9.changePositionBtn.setState(z9, true);
                                int size = page9.messages.messages.size();
                                MessagePreviewParams messagePreviewParams9 = anonymousClass611.messagePreviewParams;
                                if (size > 0 && (message4 = page9.messages.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (page9.messages.previewMessages.size() > 0 && (message3 = page9.messages.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                page9.updateMessages();
                                page9.updateScroll = true;
                                break;
                        }
                    }
                });
                anonymousClass2.addView(actionBarMenuSubItem10, LayoutHelper.createLinear(-1, 48));
                ActionBarMenuSubItem actionBarMenuSubItem11 = new ActionBarMenuSubItem(1, context, anonymousClass64.resourcesProvider, false, true);
                actionBarMenuSubItem11.setTextAndIcon(LocaleController.getString(z3 ? R.string.DoNotQuote : R.string.DoNotReply), R.drawable.msg_delete, null);
                int color5 = Theme.getColor(Theme.key_text_RedBold, resourcesDelegate);
                int i28 = Theme.key_text_RedRegular;
                int color6 = Theme.getColor(i28, resourcesDelegate);
                actionBarMenuSubItem11.setTextColor(color5);
                actionBarMenuSubItem11.setIconColor(color6);
                actionBarMenuSubItem11.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(null, i28, false)));
                final int i29 = 7;
                actionBarMenuSubItem11.setOnClickListener(new View.OnClickListener(this) {
                    public final MessagePreviewView.Page f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i29) {
                            case 0:
                                this.f$0.this$0.dismiss(true);
                                break;
                            case 1:
                                MessagePreviewView.Page page5 = this.f$0;
                                page5.this$0.messagePreviewParams.quote = null;
                                page5.textSelectionHelper.clear(false);
                                page5.switchToQuote(false, false);
                                page5.menu.getSwipeBack().closeForeground(true);
                                break;
                            case 2:
                                MessagePreviewView.Page page6 = this.f$0;
                                if (page6.getReplyMessage(null) != null) {
                                    MessagePreviewView.Page.AnonymousClass4 anonymousClass5 = page6.textSelectionHelper;
                                    int i110 = anonymousClass5.selectionEnd - anonymousClass5.selectionStart;
                                    ChatActivity.AnonymousClass64 anonymousClass65 = page6.this$0;
                                    if (i110 <= MessagesController.getInstance(anonymousClass65.currentAccount).quoteLengthMax) {
                                        TextSelectionHelper.SelectableView selectableView = anonymousClass5.selectedView;
                                        MessageObject replyMessage = page6.getReplyMessage(selectableView != null ? ((ChatMessageCell) selectableView).getMessageObject() : null);
                                        int i111 = anonymousClass5.selectionStart;
                                        MessagePreviewParams messagePreviewParams2 = anonymousClass65.messagePreviewParams;
                                        messagePreviewParams2.quoteStart = i111;
                                        int i112 = anonymousClass5.selectionEnd;
                                        messagePreviewParams2.quoteEnd = i112;
                                        messagePreviewParams2.quote = ChatActivity.ReplyQuote.from(i111, i112, replyMessage);
                                        anonymousClass65.onQuoteSelectedPart();
                                        anonymousClass65.dismiss(true);
                                    } else {
                                        page6.showQuoteLengthError();
                                    }
                                }
                                break;
                            case 3:
                                MessagePreviewView.Page page7 = this.f$0;
                                ChatActivity.AnonymousClass64 anonymousClass66 = page7.this$0;
                                MessagePreviewParams messagePreviewParams3 = anonymousClass66.messagePreviewParams;
                                ChatActivity.ReplyQuote replyQuote = messagePreviewParams3.quote;
                                boolean z4 = anonymousClass66.showOutdatedQuote;
                                MessagePreviewView.Page.AnonymousClass4 anonymousClass8 = page7.textSelectionHelper;
                                if (replyQuote == null || z4) {
                                    int i113 = anonymousClass8.selectionEnd - anonymousClass8.selectionStart;
                                    int i114 = anonymousClass66.currentAccount;
                                    if (i113 <= MessagesController.getInstance(i114).quoteLengthMax) {
                                        MessageObject replyMessage2 = page7.getReplyMessage(null);
                                        if (replyMessage2 != null) {
                                            boolean zIsInSelectionMode = anonymousClass8.isInSelectionMode();
                                            MessagePreviewParams messagePreviewParams4 = anonymousClass66.messagePreviewParams;
                                            if (!zIsInSelectionMode) {
                                                messagePreviewParams4.quoteStart = 0;
                                                messagePreviewParams4.quoteEnd = Math.min(MessagesController.getInstance(i114).quoteLengthMax, replyMessage2.messageOwner.message.length());
                                                messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, replyMessage2);
                                                View replyMessageCell = page7.getReplyMessageCell();
                                                if (replyMessageCell instanceof ChatMessageCell) {
                                                    anonymousClass8.select((ChatMessageCell) replyMessageCell, messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd);
                                                }
                                                if (!z4) {
                                                    page7.menu.getSwipeBack().openForeground(page7.menuBack);
                                                }
                                                page7.switchToQuote(true, true);
                                            } else {
                                                messagePreviewParams4.quoteStart = anonymousClass8.selectionStart;
                                                messagePreviewParams4.quoteEnd = anonymousClass8.selectionEnd;
                                                TextSelectionHelper.SelectableView selectableView2 = anonymousClass8.selectedView;
                                                messagePreviewParams4.quote = ChatActivity.ReplyQuote.from(messagePreviewParams4.quoteStart, messagePreviewParams4.quoteEnd, page7.getReplyMessage(selectableView2 != null ? ((ChatMessageCell) selectableView2).getMessageObject() : null));
                                                anonymousClass66.onQuoteSelectedPart();
                                                anonymousClass66.dismiss(true);
                                            }
                                        }
                                    } else {
                                        page7.showQuoteLengthError();
                                    }
                                } else {
                                    messagePreviewParams3.quote = null;
                                    anonymousClass8.clear(false);
                                    page7.switchToQuote(false, true);
                                    page7.updateSubtitle(true);
                                }
                                break;
                            case 4:
                                this.f$0.this$0.selectAnotherChat(false);
                                break;
                            case 5:
                                this.f$0.this$0.selectAnotherChat(false);
                                break;
                            case 6:
                                this.f$0.this$0.dismiss(true);
                                break;
                            case 7:
                                ChatActivity.AnonymousClass64 anonymousClass67 = this.f$0.this$0;
                                boolean z5 = anonymousClass67.showOutdatedQuote;
                                ChatActivity chatActivity = ChatActivity.this;
                                if (!z5) {
                                    anonymousClass67.dismiss(true);
                                    chatActivity.replyingMessageObject = null;
                                    chatActivity.replyingQuote = null;
                                    chatActivity.messagePreviewParams.updateReply(null, null, chatActivity.dialog_id, null);
                                    chatActivity.fallbackFieldPanel();
                                } else {
                                    anonymousClass67.dismiss(true);
                                    chatActivity.replyingQuote = null;
                                    chatActivity.showFieldPanelForReply(chatActivity.replyingMessageObject);
                                }
                                break;
                            case 8:
                                this.f$0.this$0.selectAnotherChat(true);
                                break;
                            case 9:
                                ChatActivity.AnonymousClass64 anonymousClass68 = this.f$0.this$0;
                                anonymousClass68.dismiss(true);
                                ChatActivity chatActivity2 = ChatActivity.this;
                                chatActivity2.messagePreviewParams.updateForward(null, chatActivity2.dialog_id);
                                chatActivity2.fallbackFieldPanel();
                                break;
                            case 10:
                                this.f$0.this$0.dismiss(true);
                                break;
                            case 11:
                                ChatActivity.AnonymousClass64 anonymousClass69 = this.f$0.this$0;
                                anonymousClass69.dismiss(true);
                                ChatActivity chatActivity3 = ChatActivity.this;
                                chatActivity3.foundWebPage = null;
                                ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity3.chatActivityEnterView;
                                if (anonymousClass39 != null) {
                                    anonymousClass39.messageWebPage = null;
                                    anonymousClass39.messageWebPageSearch = false;
                                }
                                MessagePreviewParams messagePreviewParams5 = chatActivity3.messagePreviewParams;
                                if (messagePreviewParams5 != null) {
                                    int i115 = ((BaseFragment) chatActivity3).currentAccount;
                                    MessageObject messageObject = chatActivity3.replyingMessageObject;
                                    messagePreviewParams5.updateLink(i115, null, null, messageObject == chatActivity3.threadMessageObject ? null : messageObject, chatActivity3.replyingQuote, chatActivity3.editingMessageObject);
                                }
                                chatActivity3.fallbackFieldPanel();
                                break;
                            case 12:
                                MessagePreviewView.Page page8 = this.f$0;
                                ChatActivity.AnonymousClass64 anonymousClass610 = page8.this$0;
                                MessagePreviewParams messagePreviewParams6 = anonymousClass610.messagePreviewParams;
                                if (messagePreviewParams6.hasMedia) {
                                    boolean z6 = !messagePreviewParams6.webpageSmall;
                                    messagePreviewParams6.webpageSmall = z6;
                                    page8.changeSizeBtn.setState(z6, true);
                                    MessagePreviewParams messagePreviewParams7 = anonymousClass610.messagePreviewParams;
                                    page8.videoChangeSizeBtn.setState(messagePreviewParams7.webpageSmall, true);
                                    if (page8.messages.messages.size() > 0 && (message2 = page8.messages.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z7 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z7;
                                        messageMedia2.force_large_media = !z7;
                                    }
                                    if (page8.messages.previewMessages.size() > 0 && (message = page8.messages.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z8 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z8;
                                        messageMedia.force_large_media = !z8;
                                    }
                                    page8.updateMessages();
                                    page8.updateScroll = true;
                                    break;
                                }
                                break;
                            default:
                                MessagePreviewView.Page page9 = this.f$0;
                                ChatActivity.AnonymousClass64 anonymousClass611 = page9.this$0;
                                MessagePreviewParams messagePreviewParams8 = anonymousClass611.messagePreviewParams;
                                boolean z9 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z9;
                                page9.changePositionBtn.setState(z9, true);
                                int size = page9.messages.messages.size();
                                MessagePreviewParams messagePreviewParams9 = anonymousClass611.messagePreviewParams;
                                if (size > 0 && (message4 = page9.messages.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (page9.messages.previewMessages.size() > 0 && (message3 = page9.messages.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                page9.updateMessages();
                                page9.updateScroll = true;
                                break;
                        }
                    }
                });
                anonymousClass2.addView(actionBarMenuSubItem11, LayoutHelper.createLinear(-1, 48));
                context2 = context;
                page3 = this;
            }
            int i30 = page3.currentTab;
            if (i30 == 1) {
                page3.messages = messagePreviewParams.forwardMessages;
            } else if (i30 == 0) {
                page3.messages = messagePreviewParams.replyMessage;
            } else if (i30 == 2) {
                page3.messages = messagePreviewParams.linkMessage;
            }
            TextSelectionHelper.TextSelectionOverlay overlayView = page3.textSelectionHelper.getOverlayView(context2);
            page3.textSelectionOverlay = overlayView;
            overlayView.setElevation(AndroidUtilities.dp(8.0f));
            overlayView.setOutlineProvider(null);
            if (overlayView.getParent() instanceof ViewGroup) {
                ((ViewGroup) overlayView.getParent()).removeView(overlayView);
            }
            page3.addView(overlayView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, ActionBar.getCurrentActionBarHeight() / AndroidUtilities.density, 0.0f, 0.0f));
            page3.textSelectionHelper.setParentView(page3.chatListView);
        }

        public static MessageObject.GroupedMessages access$1300(Page page, MessageObject messageObject) {
            page.getClass();
            if (messageObject.getGroupId() == 0) {
                return null;
            }
            MessageObject.GroupedMessages groupedMessages = page.messages.groupedMessagesMap.get(messageObject.getGroupId());
            if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
                return groupedMessages;
            }
            return null;
        }

        public static void access$1600(Page page, ChatMessageCell chatMessageCell) {
            CharacterStyle characterStyle;
            TLRPC.WebPage webPage;
            if (page.currentTab == 2) {
                MessagePreviewParams messagePreviewParams = page.this$0.messagePreviewParams;
                if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    chatMessageCell.setHighlightedSpan(characterStyle);
                    return;
                }
            }
            chatMessageCell.setHighlightedSpan(null);
        }

        public final MessageObject getReplyMessage(MessageObject messageObject) {
            MessageObject.GroupedMessages groupedMessagesValueAt;
            ChatActivity.AnonymousClass64 anonymousClass64 = this.this$0;
            MessagePreviewParams.Messages messages = anonymousClass64.messagePreviewParams.replyMessage;
            if (messages == null) {
                return null;
            }
            LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
            if (longSparseArray == null || longSparseArray.size() <= 0 || (groupedMessagesValueAt = anonymousClass64.messagePreviewParams.replyMessage.groupedMessagesMap.valueAt(0)) == null) {
                return anonymousClass64.messagePreviewParams.replyMessage.messages.get(0);
            }
            if (groupedMessagesValueAt.isDocuments) {
                if (messageObject != null) {
                    return messageObject;
                }
                ChatActivity.ReplyQuote replyQuote = anonymousClass64.messagePreviewParams.quote;
                if (replyQuote != null) {
                    return replyQuote.message;
                }
            }
            return groupedMessagesValueAt.captionMessage;
        }

        public final View getReplyMessageCell() {
            MessageObject replyMessage = getReplyMessage(null);
            if (replyMessage == null) {
                return null;
            }
            int i = 0;
            while (true) {
                AnonymousClass6 anonymousClass6 = this.chatListView;
                if (i >= anonymousClass6.getChildCount()) {
                    return null;
                }
                View childAt = anonymousClass6.getChildAt(i);
                IMessageCell iMessageCell = (IMessageCell) childAt;
                if (iMessageCell.getMessageObject() != null && (iMessageCell.getMessageObject() == replyMessage || iMessageCell.getMessageObject().getId() == replyMessage.getId())) {
                    return childAt;
                }
                i++;
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.currentTab == 0) {
                AndroidUtilities.forEachViews((RecyclerView) this.chatListView, (Consumer) new QrActivity$5$$ExternalSyntheticLambda0(this, 3));
            }
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            updateSelection();
            this.firstAttach = true;
            this.firstLayout = true;
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            updatePositions();
            this.firstLayout = false;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            boolean z = View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2);
            ChatActivity.AnonymousClass64 anonymousClass64 = this.this$0;
            anonymousClass64.isLandscapeMode = z;
            this.buttonsHeight = 0;
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.menu;
            actionBarPopupWindowLayout.measure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
            int i3 = this.buttonsHeight;
            int measuredHeight = actionBarPopupWindowLayout.getMeasuredHeight();
            Rect rect = this.rect;
            this.buttonsHeight = Math.max(i3, measuredHeight + rect.top + rect.bottom);
            ((ViewGroup.MarginLayoutParams) this.chatListView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
            boolean z2 = anonymousClass64.isLandscapeMode;
            AnonymousClass2 anonymousClass2 = this.chatPreviewContainer;
            if (z2) {
                anonymousClass2.getLayoutParams().height = -1;
                ((ViewGroup.MarginLayoutParams) anonymousClass2.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
                ((ViewGroup.MarginLayoutParams) anonymousClass2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                anonymousClass2.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i) * 0.6f));
                actionBarPopupWindowLayout.getLayoutParams().height = -1;
            } else {
                ((ViewGroup.MarginLayoutParams) anonymousClass2.getLayoutParams()).topMargin = 0;
                ((ViewGroup.MarginLayoutParams) anonymousClass2.getLayoutParams()).bottomMargin = 0;
                anonymousClass2.getLayoutParams().height = (View.MeasureSpec.getSize(i2) - AndroidUtilities.dp(6.0f)) - this.buttonsHeight;
                if (anonymousClass2.getLayoutParams().height < View.MeasureSpec.getSize(i2) * 0.5f) {
                    anonymousClass2.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i2) * 0.5f);
                }
                anonymousClass2.getLayoutParams().width = -1;
                actionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i2) - anonymousClass2.getLayoutParams().height;
            }
            int size = (View.MeasureSpec.getSize(i2) + View.MeasureSpec.getSize(i)) << 16;
            if (this.lastSize != size) {
                for (int i4 = 0; i4 < this.messages.previewMessages.size(); i4++) {
                    MessageObject messageObject = this.messages.previewMessages.get(i4);
                    messageObject.parentWidth = anonymousClass64.isLandscapeMode ? anonymousClass2.getLayoutParams().width : View.MeasureSpec.getSize(i) - AndroidUtilities.dp(16.0f);
                    messageObject.resetLayout();
                    messageObject.forceUpdate = true;
                    Adapter adapter = this.adapter;
                    if (adapter != null) {
                        adapter.mObservable.notifyChanged();
                    }
                }
                this.firstLayout = true;
            }
            this.lastSize = size;
            super.onMeasure(i, i2);
        }

        public final void setOffset(float f, int i) {
            boolean z = this.this$0.isLandscapeMode;
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.menu;
            IntroActivity.AnonymousClass1 anonymousClass1 = this.actionBar;
            AnonymousClass2 anonymousClass2 = this.chatPreviewContainer;
            if (z) {
                anonymousClass1.setTranslationY(0.0f);
                anonymousClass2.invalidateOutline();
                anonymousClass2.setTranslationY(0.0f);
                actionBarPopupWindowLayout.setTranslationY(0.0f);
            } else {
                anonymousClass1.setTranslationY(i);
                anonymousClass2.invalidateOutline();
                anonymousClass2.setTranslationY(f);
                actionBarPopupWindowLayout.setTranslationY((f + anonymousClass2.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
            }
            float x = anonymousClass2.getX();
            TextSelectionHelper.TextSelectionOverlay textSelectionOverlay = this.textSelectionOverlay;
            textSelectionOverlay.setTranslationX(x);
            textSelectionOverlay.setTranslationY(anonymousClass2.getY());
        }

        public final void showQuoteLengthError() {
            ChatActivity.AnonymousClass64 anonymousClass64 = this.this$0;
            new BulletinFactory(anonymousClass64, anonymousClass64.resourcesProvider).createSimpleBulletin(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).show();
        }

        public final void switchToQuote(boolean z, boolean z2) {
            if (this.this$0.showOutdatedQuote) {
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
            ActionBarMenuSubItem actionBarMenuSubItem = this.quoteAnotherChatButton;
            ActionBarMenuSubItem actionBarMenuSubItem2 = this.replyAnotherChatButton;
            AnonymousClass13 anonymousClass13 = this.clearQuoteButton;
            AnonymousClass13 anonymousClass14 = this.quoteButton;
            if (!z2) {
                if (anonymousClass14 != null) {
                    anonymousClass14.setAlpha(!z ? 1.0f : 0.0f);
                    anonymousClass14.setVisibility(!z ? 0 : 4);
                }
                if (anonymousClass13 != null) {
                    anonymousClass13.setAlpha(z ? 1.0f : 0.0f);
                    anonymousClass13.setVisibility(z ? 0 : 4);
                }
                if (actionBarMenuSubItem2 != null) {
                    actionBarMenuSubItem2.setAlpha(!z ? 1.0f : 0.0f);
                    actionBarMenuSubItem2.setVisibility(!z ? 0 : 4);
                }
                if (actionBarMenuSubItem != null) {
                    actionBarMenuSubItem.setAlpha(z ? 1.0f : 0.0f);
                    actionBarMenuSubItem.setVisibility(z ? 0 : 4);
                    return;
                }
                return;
            }
            this.quoteSwitcher = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (anonymousClass14 != null) {
                anonymousClass14.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass14, (Property<AnonymousClass13, Float>) property, !z ? 1.0f : 0.0f));
            }
            if (anonymousClass13 != null) {
                anonymousClass13.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass13, (Property<AnonymousClass13, Float>) property, z ? 1.0f : 0.0f));
            }
            if (actionBarMenuSubItem2 != null) {
                actionBarMenuSubItem2.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(actionBarMenuSubItem2, (Property<ActionBarMenuSubItem, Float>) property, !z ? 1.0f : 0.0f));
            }
            if (actionBarMenuSubItem != null) {
                actionBarMenuSubItem.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(actionBarMenuSubItem, (Property<ActionBarMenuSubItem, Float>) property, z ? 1.0f : 0.0f));
            }
            this.quoteSwitcher.playTogether(arrayList);
            this.quoteSwitcher.setDuration(360L);
            this.quoteSwitcher.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.quoteSwitcher.addListener(new ChatActivity.AnonymousClass77(29, this, z));
            this.quoteSwitcher.start();
        }

        public final void updateMessages() {
            ChatActivity.AnonymousClass64 anonymousClass64;
            TLRPC.Message message;
            TLRPC.MessageMedia messageMedia;
            AnonymousClass7 anonymousClass7 = this.itemAnimator;
            if (anonymousClass7.isRunning()) {
                this.updateAfterAnimations = true;
                return;
            }
            int i = 0;
            while (true) {
                int size = this.messages.previewMessages.size();
                anonymousClass64 = this.this$0;
                if (i >= size) {
                    break;
                }
                MessageObject messageObject = this.messages.previewMessages.get(i);
                messageObject.forceUpdate = true;
                messageObject.sendAsPeer = anonymousClass64.sendAsPeer;
                MessagePreviewParams messagePreviewParams = anonymousClass64.messagePreviewParams;
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
                        MessagePreviewParams messagePreviewParams2 = anonymousClass64.messagePreviewParams;
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
                if (anonymousClass64.messagePreviewParams.hideCaption) {
                    messageObject.caption = null;
                } else {
                    messageObject.generateCaption();
                }
                if (messageObject.isPoll()) {
                    MessagePreviewParams.PreviewMediaPoll previewMediaPoll = (MessagePreviewParams.PreviewMediaPoll) messageObject.messageOwner.media;
                    previewMediaPoll.results.total_voters = anonymousClass64.messagePreviewParams.hideCaption ? 0 : previewMediaPoll.totalVotersCached;
                }
                i++;
            }
            for (int i2 = 0; i2 < this.messages.pollChosenAnswers.size(); i2++) {
                this.messages.pollChosenAnswers.get(i2).chosen = !anonymousClass64.messagePreviewParams.hideForwardSendersName;
            }
            for (int i3 = 0; i3 < this.messages.groupedMessagesMap.size(); i3++) {
                anonymousClass7.groupWillChanged(this.messages.groupedMessagesMap.valueAt(i3));
            }
            this.adapter.mObservable.notifyItemRangeChanged(0, this.messages.previewMessages.size(), null);
        }

        public final void updatePositions() {
            int i = this.chatTopOffset;
            float f = this.yOffset;
            ChatActivity.AnonymousClass64 anonymousClass64 = this.this$0;
            boolean z = anonymousClass64.isLandscapeMode;
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.menu;
            AnonymousClass6 anonymousClass6 = this.chatListView;
            if (z) {
                this.yOffset = 0.0f;
                this.chatTopOffset = 0;
                actionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + anonymousClass6.getMeasuredWidth());
            } else {
                int measuredHeight = anonymousClass6.getMeasuredHeight();
                int i2 = 0;
                for (int i3 = 0; i3 < anonymousClass6.getChildCount(); i3++) {
                    View childAt = anonymousClass6.getChildAt(i3);
                    if (RecyclerView.getChildAdapterPosition(childAt) != -1) {
                        measuredHeight = Math.min(measuredHeight, childAt.getTop());
                        i2++;
                    }
                }
                MessagePreviewParams.Messages messages = this.messages;
                if (messages == null || i2 == 0 || i2 > messages.previewMessages.size()) {
                    this.chatTopOffset = 0;
                } else {
                    int iM = BotFullscreenButtons$$ExternalSyntheticOutline1.m(measuredHeight, 4.0f, 0);
                    this.chatTopOffset = iM;
                    this.chatTopOffset = Math.min(((anonymousClass6.getMeasuredHeight() - this.chatTopOffset) + iM) - ((int) ((((AndroidUtilities.displaySize.y - (Build.VERSION.SDK_INT >= 35 ? AndroidUtilities.navigationBarHeight : 0)) * 0.8f) - this.buttonsHeight) - AndroidUtilities.dp(8.0f))), this.chatTopOffset);
                }
                float fM = ImageReceiver$$ExternalSyntheticOutline0.m(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (getMeasuredHeight() - this.chatTopOffset) + (this.buttonsHeight - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.chatTopOffset;
                this.yOffset = fM;
                if (fM > AndroidUtilities.dp(8.0f)) {
                    this.yOffset = AndroidUtilities.dp(8.0f);
                }
                actionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindowLayout.getMeasuredWidth());
            }
            boolean z2 = this.firstLayout;
            if (z2 || (this.chatTopOffset == i && this.yOffset == f)) {
                if (z2) {
                    float f2 = this.yOffset;
                    int i4 = this.chatTopOffset;
                    this.currentTopOffset = i4;
                    setOffset(f2, i4);
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator = anonymousClass64.offsetsAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            anonymousClass64.offsetsAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new MessagePreviewView$Page$$ExternalSyntheticLambda0(this, i, f, 0));
            anonymousClass64.offsetsAnimator.setDuration(250L);
            anonymousClass64.offsetsAnimator.setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR);
            anonymousClass64.offsetsAnimator.addListener(new ItemOptions.AnonymousClass3(this, 7));
            AndroidUtilities.runOnUIThread(anonymousClass64.changeBoundsRunnable, 50L);
            this.currentTopOffset = i;
            setOffset(f, i);
        }

        public final void updateSelection() {
            MessageObject messageObject;
            if (this.currentTab == 0) {
                AnonymousClass4 anonymousClass4 = this.textSelectionHelper;
                int i = anonymousClass4.selectionEnd - anonymousClass4.selectionStart;
                ChatActivity.AnonymousClass64 anonymousClass64 = this.this$0;
                if (i > MessagesController.getInstance(anonymousClass64.currentAccount).quoteLengthMax) {
                    return;
                }
                TextSelectionHelper.SelectableView selectableView = anonymousClass4.selectedView;
                MessageObject replyMessage = getReplyMessage(selectableView != null ? ((ChatMessageCell) selectableView).getMessageObject() : null);
                if (anonymousClass64.messagePreviewParams.quote != null && anonymousClass4.isInSelectionMode()) {
                    MessagePreviewParams messagePreviewParams = anonymousClass64.messagePreviewParams;
                    messagePreviewParams.quoteStart = anonymousClass4.selectionStart;
                    messagePreviewParams.quoteEnd = anonymousClass4.selectionEnd;
                    if (replyMessage != null && ((messageObject = messagePreviewParams.quote.message) == null || messageObject.getId() != replyMessage.getId())) {
                        MessagePreviewParams messagePreviewParams2 = anonymousClass64.messagePreviewParams;
                        messagePreviewParams2.quote = ChatActivity.ReplyQuote.from(messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd, replyMessage);
                        anonymousClass64.onQuoteSelectedPart();
                    }
                }
                anonymousClass4.clear(false);
            }
        }

        public final void updateSubtitle(boolean z) {
            String string;
            ChatActivity.AnonymousClass64 anonymousClass64 = this.this$0;
            MessagePreviewParams messagePreviewParams = anonymousClass64.messagePreviewParams;
            IntroActivity.AnonymousClass1 anonymousClass1 = this.actionBar;
            int i = this.currentTab;
            if (i != 1) {
                if (i != 0) {
                    if (i == 2) {
                        anonymousClass1.setTitle(LocaleController.getString(R.string.MessageOptionsLinkTitle), z);
                        anonymousClass1.setSubtitle(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z);
                        return;
                    }
                    return;
                }
                if (messagePreviewParams.quote == null || !messagePreviewParams.replyMessage.hasText) {
                    anonymousClass1.setTitle(LocaleController.getString(R.string.MessageOptionsReplyTitle), z);
                    anonymousClass1.setSubtitle(messagePreviewParams.replyMessage.hasText ? LocaleController.getString(R.string.MessageOptionsReplySubtitle) : "", z);
                    return;
                } else {
                    anonymousClass1.setTitle(LocaleController.getString(R.string.PreviewQuoteUpdate), z);
                    anonymousClass1.setSubtitle(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z);
                    return;
                }
            }
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            anonymousClass1.setTitle(LocaleController.formatPluralString("PreviewForwardMessagesCount", messages == null ? 0 : messages.selectedIds.size(), new Object[0]), z);
            boolean z2 = messagePreviewParams.hasSenders;
            TLRPC.Chat chat = anonymousClass64.currentChat;
            TLRPC.User user = anonymousClass64.currentUser;
            if (z2) {
                if (messagePreviewParams.hideForwardSendersName) {
                    if (user != null) {
                        string = LocaleController.formatString("ForwardPreviewSendersNameHidden", R.string.ForwardPreviewSendersNameHidden, ContactsController.formatName(user.first_name, user.last_name));
                    } else {
                        string = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel);
                    }
                } else if (user != null) {
                    string = LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name));
                } else {
                    string = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel);
                }
            } else if (messagePreviewParams.willSeeSenders) {
                if (user != null) {
                    string = LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name));
                } else {
                    string = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel);
                }
            } else if (user != null) {
                string = LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name));
            } else {
                string = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel);
            }
            anonymousClass1.setSubtitle(string, z);
        }
    }

    public interface ResourcesDelegate extends Theme.ResourcesProvider {
    }

    public final class TabsView extends View {
        public Drawable bgDrawable;
        public final Paint bgPaint;
        public final int color;
        public float marginBetween;
        public Utilities.Callback onTabClick;
        public final RectF selectRect;
        public final int selectedColor;
        public float selectedTab;
        public float tabInnerPadding;
        public final ArrayList tabs;

        public final class Tab {
            public final RectF bounds = new RectF();
            public final RectF clickBounds = new RectF();
            public final int id;
            public final Text text;

            public Tab(int i, String str) {
                this.id = i;
                this.text = new Text(str, 14.0f, AndroidUtilities.bold());
            }
        }

        public TabsView(Context context, Theme.ResourcesProvider resourcesProvider) {
            int[] iArr;
            super(context);
            this.tabs = new ArrayList();
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            this.tabInnerPadding = AndroidUtilities.dp(14.0f);
            this.marginBetween = AndroidUtilities.dp(0.0f);
            this.selectRect = new RectF();
            if (Theme.currentTheme.isDark()) {
                this.color = -1862270977;
                this.selectedColor = -1325400065;
                paint.setColor(285212671);
                return;
            }
            int color = Theme.getColor(Theme.key_chat_wallpaper, resourcesProvider);
            if (resourcesProvider instanceof ChatActivity.ThemeDelegate) {
                ChatActivity.ThemeDelegate themeDelegate = (ChatActivity.ThemeDelegate) resourcesProvider;
                if ((themeDelegate.getWallpaperDrawable() instanceof MotionBackgroundDrawable) && (iArr = ((MotionBackgroundDrawable) themeDelegate.getWallpaperDrawable()).colors) != null) {
                    color = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(iArr[0], iArr[1]), AndroidUtilities.getAverageColor(iArr[2], iArr[3]));
                }
            }
            this.color = Theme.adaptHue(-1606201797, color);
            this.selectedColor = Theme.adaptHue(-448573893, color);
            paint.setColor(Theme.adaptHue(814980216, color));
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            ArrayList arrayList = this.tabs;
            if (arrayList.size() <= 1) {
                return;
            }
            float f = this.selectedTab;
            double d = f;
            int iFloor = (int) Math.floor(d);
            boolean z = iFloor >= 0 && iFloor < arrayList.size();
            int iCeil = (int) Math.ceil(d);
            boolean z2 = iCeil >= 0 && iCeil < arrayList.size();
            RectF rectF = this.selectRect;
            if (z && z2) {
                AndroidUtilities.lerp(((Tab) arrayList.get(iFloor)).bounds, ((Tab) arrayList.get(iCeil)).bounds, f - iFloor, rectF);
            } else if (z) {
                rectF.set(((Tab) arrayList.get(iFloor)).bounds);
            } else if (z2) {
                rectF.set(((Tab) arrayList.get(iCeil)).bounds);
            }
            Drawable drawable = this.bgDrawable;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (z || z2) {
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.bgPaint);
            }
            for (int i = 0; i < arrayList.size(); i++) {
                Tab tab = (Tab) arrayList.get(i);
                tab.text.draw(tab.bounds.left + this.tabInnerPadding, getMeasuredHeight() / 2.0f, 1.0f, ColorUtils.blendARGB(1.0f - Math.abs(f - i), this.color, this.selectedColor), canvas);
            }
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            int i;
            Utilities.Callback callback;
            ArrayList arrayList = this.tabs;
            if (arrayList.size() > 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        i = -1;
                        break;
                    }
                    if (((Tab) arrayList.get(i2)).clickBounds.contains(x, y)) {
                        i = ((Tab) arrayList.get(i2)).id;
                        break;
                    }
                    i2++;
                }
                if (motionEvent.getAction() == 0) {
                    if (i != -1) {
                        return true;
                    }
                } else if (motionEvent.getAction() == 1 && i != -1 && (callback = this.onTabClick) != null) {
                    callback.run(Integer.valueOf(i));
                }
            }
            return false;
        }

        public int getColor() {
            return this.color;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            ArrayList arrayList;
            super.onMeasure(i, i2);
            this.tabInnerPadding = AndroidUtilities.dp(14.0f);
            float width = 0.0f;
            this.marginBetween = AndroidUtilities.dp(0.0f);
            int i3 = 0;
            while (true) {
                arrayList = this.tabs;
                if (i3 >= arrayList.size()) {
                    break;
                }
                if (i3 > 0) {
                    width += this.marginBetween;
                }
                width += ((Tab) arrayList.get(i3)).text.getWidth() + this.tabInnerPadding + this.tabInnerPadding;
                i3++;
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float fDp = (measuredHeight - AndroidUtilities.dp(26.0f)) / 2.0f;
            float fDp2 = (AndroidUtilities.dp(26.0f) + measuredHeight) / 2.0f;
            float f = measuredWidth;
            float f2 = (f - width) / 2.0f;
            float f3 = f2;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                float width2 = ((Tab) arrayList.get(i4)).text.getWidth() + this.tabInnerPadding + this.tabInnerPadding;
                ((Tab) arrayList.get(i4)).bounds.set(f3, fDp, f3 + width2, fDp2);
                ((Tab) arrayList.get(i4)).clickBounds.set(((Tab) arrayList.get(i4)).bounds);
                ((Tab) arrayList.get(i4)).clickBounds.inset((-this.marginBetween) / 2.0f, -fDp);
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

    public final class ToggleButton extends View {
        public boolean first;
        public final SettingsActivity.SettingCell.Background iconDrawable;
        public boolean isState1;
        public final int minWidth;
        public final String text1;
        public final String text2;
        public final AnimatedTextView.AnimatedTextDrawable textDrawable;

        public ToggleButton(Context context, int i, String str, int i2, String str2, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.first = true;
            this.text1 = str;
            this.text2 = str2;
            setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 2, -1));
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, true, false);
            this.textDrawable = animatedTextDrawable;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            animatedTextDrawable.moveAmplitude = 0.35f;
            animatedTextDrawable.animateDuration = 300L;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(16.0f));
            int color = Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider);
            TextPaint textPaint = animatedTextDrawable.textPaint;
            textPaint.setColor(color);
            animatedTextDrawable.alpha = Color.alpha(color);
            animatedTextDrawable.setCallback(this);
            animatedTextDrawable.ellipsizeByGradient = true ^ LocaleController.isRTL;
            animatedTextDrawable.invalidateSelf();
            if (LocaleController.isRTL) {
                animatedTextDrawable.gravity = 5;
            }
            int iMax = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
            this.minWidth = iMax;
            animatedTextDrawable.overrideFullWidth = iMax;
            SettingsActivity.SettingCell.Background background = new SettingsActivity.SettingCell.Background(this, i, i2);
            this.iconDrawable = background;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider), PorterDuff.Mode.SRC_IN);
            ((RLottieDrawable) background.paint).setColorFilter(porterDuffColorFilter);
            ((RLottieDrawable) background.strokePaint).setColorFilter(porterDuffColorFilter);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            boolean z = LocaleController.isRTL;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textDrawable;
            SettingsActivity.SettingCell.Background background = this.iconDrawable;
            if (z) {
                background.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), OKLCH.m$2(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
                animatedTextDrawable.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
            } else {
                background.setBounds(AndroidUtilities.dp(17.0f), OKLCH.m$2(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
                animatedTextDrawable.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
            }
            animatedTextDrawable.draw(canvas);
            background.draw(canvas);
        }

        public boolean getState() {
            return this.isState1;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int mode = View.MeasureSpec.getMode(i);
            int i3 = this.minWidth;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(mode == 1073741824 ? Math.max(View.MeasureSpec.getSize(i), i3) : Math.min(View.MeasureSpec.getSize(i), i3), mode), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (getVisibility() != 0 || getAlpha() < 0.5f) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }

        public final void setState(boolean z, boolean z2) {
            if (this.first || z != this.isState1) {
                this.isState1 = z;
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textDrawable;
                animatedTextDrawable.setText(z ? this.text1 : this.text2, z2 && !LocaleController.isRTL, true);
                SettingsActivity.SettingCell.Background background = this.iconDrawable;
                background.border = z;
                RLottieDrawable rLottieDrawable = (RLottieDrawable) background.strokePaint;
                RLottieDrawable rLottieDrawable2 = (RLottieDrawable) background.paint;
                if (z2) {
                    background.matrix = z ? rLottieDrawable2 : rLottieDrawable;
                    rLottieDrawable2.setCurrentFrame(0, true, false);
                    rLottieDrawable.setCurrentFrame(0, true, false);
                    ((RLottieDrawable) background.matrix).start();
                } else {
                    if (z) {
                        rLottieDrawable = rLottieDrawable2;
                    }
                    background.matrix = rLottieDrawable;
                    rLottieDrawable.setCurrentFrame(rLottieDrawable.metaData[0] - 1, true, false);
                }
                this.first = false;
                setContentDescription(animatedTextDrawable.currentText);
            }
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return drawable == this.textDrawable || super.verifyDrawable(drawable);
        }
    }

    public MessagePreviewView(final Context context, ChatActivity chatActivity, BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i, ResourcesDelegate resourcesDelegate, int i2, final boolean z) {
        super(context);
        final ChatActivity.AnonymousClass64 anonymousClass64 = (ChatActivity.AnonymousClass64) this;
        this.changeBoundsRunnable = new BubbleActivity.AnonymousClass1(anonymousClass64, 22);
        this.drawingGroups = new ArrayList(10);
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
            public final void onScrollEnd() {
                View view = this.viewPages[0];
                if (view instanceof Page) {
                    Page.AnonymousClass4 anonymousClass4 = ((Page) view).textSelectionHelper;
                    anonymousClass4.parentIsScrolling = false;
                    anonymousClass4.textSelectionOverlay.invalidate();
                    ChatActivity$$ExternalSyntheticLambda174 chatActivity$$ExternalSyntheticLambda174 = anonymousClass4.showActionsRunnable;
                    AndroidUtilities.cancelRunOnUIThread(chatActivity$$ExternalSyntheticLambda174);
                    AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda174);
                }
            }

            @Override
            public final void onTabAnimationUpdate(boolean z2) {
                ChatActivity.AnonymousClass64 anonymousClass65 = anonymousClass64;
                anonymousClass65.tabsView.setSelectedTab(anonymousClass65.viewPager.getPositionAnimated());
                View[] viewArr = this.viewPages;
                View view = viewArr[0];
                if (view instanceof Page) {
                    ((Page) view).textSelectionHelper.onParentScrolled();
                }
                View view2 = viewArr[1];
                if (view2 instanceof Page) {
                    ((Page) view2).textSelectionHelper.onParentScrolled();
                }
            }

            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                boolean z2;
                int i3 = 0;
                while (true) {
                    View[] viewArr = anonymousClass64.viewPager.viewPages;
                    if (i3 >= viewArr.length) {
                        z2 = false;
                        break;
                    }
                    View view = viewArr[i3];
                    if (view != null) {
                        Page page = (Page) view;
                        if (page.currentTab == 0) {
                            z2 = page.textSelectionHelper.movingHandle;
                            break;
                        }
                    }
                    i3++;
                }
                if (z2) {
                    return false;
                }
                return onTouchEventInternal(motionEvent);
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
                this.tabsView.tabs.add(new TabsView.Tab(0, LocaleController.getString(R.string.MessageOptionsReply)));
            } else if (i3 != 1 || messagePreviewParams.forwardMessages == null || z) {
                if (i3 == 2 && messagePreviewParams.linkMessage != null && !z) {
                    this.tabsView.tabs.add(new TabsView.Tab(2, LocaleController.getString(R.string.MessageOptionsLink)));
                }
            } else {
                this.tabsView.tabs.add(new TabsView.Tab(1, LocaleController.getString(R.string.MessageOptionsForward)));
            }
            if (i3 == i2) {
                size = this.tabsView.tabs.size() - 1;
            }
        }
        setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public final void bindView(View view, int i4, int i5) {
                Page page = (Page) view;
                page.updateMessages();
                page.updateSubtitle(false);
            }

            @Override
            public final View createView(int i4) {
                return new Page(anonymousClass64, context, i4);
            }

            @Override
            public final int getItemCount() {
                return anonymousClass64.tabsView.tabs.size();
            }

            @Override
            public final int getItemViewType(int i4) {
                return ((TabsView.Tab) anonymousClass64.tabsView.tabs.get(i4)).id;
            }
        });
        setPosition(size);
        this.tabsView.setSelectedTab(size);
        addView(this.tabsView, LayoutHelper.createFrame(-1, 66, 87));
        addView(this.viewPager, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        final ChatActivity.AnonymousClass64 anonymousClass65 = (ChatActivity.AnonymousClass64) this;
        this.tabsView.setOnTabClick(new DialogCell$$ExternalSyntheticLambda6(anonymousClass65, 20));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ChatActivity.AnonymousClass64 anonymousClass66 = anonymousClass65;
                if (motionEvent.getAction() == 1 && !z) {
                    anonymousClass66.dismiss(true);
                }
                return true;
            }
        });
        this.showing = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR).scaleY(1.0f);
    }

    public final void dismiss(boolean z) {
        if (this.showing) {
            this.showing = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR).setListener(new ChatActivity.AnonymousClass77(28, this, z));
            int i = 0;
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
            ChatActivity.AnonymousClass64 anonymousClass64 = (ChatActivity.AnonymousClass64) this;
            ChatActivity chatActivity = ChatActivity.this;
            chatActivity.forwardingPreviewView = null;
            chatActivity.checkShowBlur();
            MessagePreviewParams messagePreviewParams = chatActivity.messagePreviewParams;
            if (messagePreviewParams != null) {
                if (chatActivity.replyingQuote == null) {
                    chatActivity.replyingQuote = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    chatActivity.replyingQuote = null;
                }
                ChatActivity.ReplyQuote replyQuote = chatActivity.replyingQuote;
                if (replyQuote != null) {
                    replyQuote.outdated = false;
                    replyQuote.start = messagePreviewParams.quoteStart;
                    replyQuote.end = messagePreviewParams.quoteEnd;
                    replyQuote.update();
                    if (chatActivity.fieldPanelShown == 2) {
                        chatActivity.showFieldPanelForReplyQuote(chatActivity.replyingMessageObject, chatActivity.replyingQuote);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = chatActivity.messagePreviewParams.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    chatActivity.fallbackFieldPanel();
                }
            }
            if (chatActivity.keyboardWasVisible && z) {
                AndroidUtilities.runOnUIThread(new ChatActivity$64$$ExternalSyntheticLambda0(anonymousClass64, 1), 50L);
                chatActivity.keyboardWasVisible = false;
            }
            AndroidUtilities.requestAdjustResize(chatActivity.getParentActivity(), ((BaseFragment) chatActivity).classGuid);
        }
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
}
