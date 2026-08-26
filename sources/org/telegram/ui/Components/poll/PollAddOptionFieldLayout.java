package org.telegram.ui.Components.poll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda5;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda39;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.web.WebActionBar;

public final class PollAddOptionFieldLayout extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final BoolAnimator animatorTextErrorVisibility;
    public final BoolAnimator animatorTextWarnVisibility;
    public final PollAttachButton attachButton;
    public PollAttachedMedia attachedMedia;
    public ChatMessageCell cellToWatch;
    public final int[] cords;
    public final EmojiButton emojiButton;
    public final ChatActivity fragment;
    public int lastColor;
    public final SimpleTextView limitTextView;
    public final FrameLayout.LayoutParams lp;
    public final int maxLength;
    public int messageIdToWatch;
    public ViewTreeObserver observer;
    public ChatActivity$$ExternalSyntheticLambda39 onCancel;
    public final Rect rect;
    public final AuctionBidSheet.AnonymousClass4 textView;
    public final ActionBar.AnonymousClass8 viewsContainer;
    public final ActionBar.AnonymousClass8 viewsContainerWrapper;

    public final class EmojiButton extends View {
        public final BoolAnimator animatorIsEmojiVisible;
        public final Drawable emojiDrawable;
        public final Drawable keyboardDrawable;

        public EmojiButton(Context context) {
            super(context);
            this.animatorIsEmojiVisible = new BoolAnimator(this, CubicBezierInterpolator.EASE_OUT_QUINT, 320L);
            this.emojiDrawable = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
            this.keyboardDrawable = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float f = this.animatorIsEmojiVisible.floatValue;
            DrawableUtils.drawWithScale(canvas, this.emojiDrawable, 1.0f - f);
            DrawableUtils.drawWithScale(canvas, this.keyboardDrawable, f);
        }

        @Override
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            float f = i / 2.0f;
            float f2 = i2 / 2.0f;
            DrawableUtils.setBounds(this.emojiDrawable, f, f2, 17);
            DrawableUtils.setBounds(this.keyboardDrawable, f, f2, 17);
        }
    }

    public PollAddOptionFieldLayout(ChatActivity chatActivity, Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.lp = layoutParams;
        this.cords = new int[2];
        this.rect = new Rect();
        int i = 8;
        GiftSheet$$ExternalSyntheticLambda6 giftSheet$$ExternalSyntheticLambda6 = new GiftSheet$$ExternalSyntheticLambda6(this, i);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorTextWarnVisibility = new BoolAnimator(0, giftSheet$$ExternalSyntheticLambda6, cubicBezierInterpolator, 380L, false);
        this.animatorTextErrorVisibility = new BoolAnimator(0, new GiftSheet$$ExternalSyntheticLambda6(this, i), cubicBezierInterpolator, 380L, false);
        this.fragment = chatActivity;
        this.maxLength = chatActivity.getMessagesController().config.pollAnswerLengthMax.get();
        AuctionBidSheet.AnonymousClass4 anonymousClass4 = new AuctionBidSheet.AnonymousClass4(this, context, resourcesProvider, 2);
        this.textView = anonymousClass4;
        anonymousClass4.setAllowTextEntitiesIntersection(true);
        anonymousClass4.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        anonymousClass4.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        anonymousClass4.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
        anonymousClass4.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        anonymousClass4.setTextSize(1, 15.0f);
        anonymousClass4.setMaxLines(Integer.MAX_VALUE);
        anonymousClass4.setBackground(null);
        anonymousClass4.setImeOptions(268435462);
        anonymousClass4.setInputType(anonymousClass4.getInputType() | 16384);
        anonymousClass4.addTextChangedListener(new WebActionBar.AnonymousClass5(this, 5));
        EmojiButton emojiButton = new EmojiButton(context);
        this.emojiButton = emojiButton;
        int i2 = Theme.key_stickers_menuSelector;
        emojiButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(i2, resourcesProvider), 1, -1));
        ScaleStateListAnimator.apply(emojiButton);
        PollAttachButton pollAttachButton = new PollAttachButton(getContext(), resourcesProvider, 36);
        this.attachButton = pollAttachButton;
        pollAttachButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(i2, resourcesProvider), 1, -1));
        pollAttachButton.setOnClickListener(new AlertDialog$$ExternalSyntheticLambda5(24, this, chatActivity));
        ScaleStateListAnimator.apply(pollAttachButton);
        SimpleTextView simpleTextView = new SimpleTextView(getContext());
        this.limitTextView = simpleTextView;
        simpleTextView.setTextSize(13);
        simpleTextView.setGravity(17);
        simpleTextView.setTranslationY(AndroidUtilities.dp(44.0f));
        simpleTextView.setVisibility(8);
        ActionBar.AnonymousClass8 anonymousClass8 = new ActionBar.AnonymousClass8(context, 6);
        this.viewsContainerWrapper = anonymousClass8;
        addView(anonymousClass8, layoutParams);
        ActionBar.AnonymousClass8 anonymousClass9 = new ActionBar.AnonymousClass8(context, 5);
        this.viewsContainer = anonymousClass9;
        anonymousClass8.addView(anonymousClass9, LayoutHelper.createFrame(-1, -2.0f));
        anonymousClass9.addView(simpleTextView, LayoutHelper.createFrame(54, 24, 53));
        anonymousClass9.addView(emojiButton, LayoutHelper.createFrame(44, 44, 51));
        anonymousClass9.addView(pollAttachButton, LayoutHelper.createFrame(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        anonymousClass9.addView(anonymousClass4, LayoutHelper.createFrame(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        anonymousClass4.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public PollAttachedMedia getAttachedMedia() {
        return this.attachedMedia;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.observer = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.observer;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.observer.removeOnPreDrawListener(this);
        }
        this.observer = null;
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onPreDraw() {
        ChatMessageCell chatMessageCell = this.cellToWatch;
        if (chatMessageCell != null) {
            int id = chatMessageCell.getMessageObject().getId();
            if (this.cellToWatch.isAttachedToWindow() && this.messageIdToWatch == id) {
                ChatMessageCell chatMessageCell2 = this.cellToWatch;
                Rect rect = this.rect;
                if (chatMessageCell2.getPollAddButtonBounds(rect)) {
                    ChatMessageCell chatMessageCell3 = this.cellToWatch;
                    int[] iArr = this.cords;
                    chatMessageCell3.getLocationInWindow(iArr);
                    int i = iArr[0];
                    int i2 = iArr[1];
                    getLocationInWindow(iArr);
                    rect.offset(i - iArr[0], i2 - iArr[1]);
                    int iWidth = rect.width();
                    FrameLayout.LayoutParams layoutParams = this.lp;
                    int i3 = layoutParams.width;
                    ActionBar.AnonymousClass8 anonymousClass8 = this.viewsContainerWrapper;
                    if (i3 != iWidth) {
                        layoutParams.width = iWidth;
                        anonymousClass8.setLayoutParams(layoutParams);
                    }
                    anonymousClass8.setTranslationX(rect.left);
                    anonymousClass8.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                    return true;
                }
            }
            ChatActivity$$ExternalSyntheticLambda39 chatActivity$$ExternalSyntheticLambda39 = this.onCancel;
            if (chatActivity$$ExternalSyntheticLambda39 != null) {
                chatActivity$$ExternalSyntheticLambda39.run();
                this.onCancel = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f) {
        this.viewsContainer.setAlpha(f);
    }

    public void setCellToWatch(ChatMessageCell chatMessageCell) {
        this.cellToWatch = chatMessageCell;
        this.messageIdToWatch = chatMessageCell.getMessageObject().getId();
    }

    public void setColor(int i) {
        if (this.lastColor != i) {
            this.lastColor = i;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
            EmojiButton emojiButton = this.emojiButton;
            emojiButton.emojiDrawable.setColorFilter(porterDuffColorFilter);
            emojiButton.keyboardDrawable.setColorFilter(porterDuffColorFilter);
            this.attachButton.attachDrawable.setColorFilter(porterDuffColorFilter);
            AuctionBidSheet.AnonymousClass4 anonymousClass4 = this.textView;
            anonymousClass4.setCursorColor(i);
            anonymousClass4.setHandlesColor(i);
            anonymousClass4.setHintTextColor(i);
        }
    }
}
