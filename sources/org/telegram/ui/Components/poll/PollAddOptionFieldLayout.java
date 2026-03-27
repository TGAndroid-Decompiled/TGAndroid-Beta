package org.telegram.ui.Components.poll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.messenger.utils.TextWatcherImpl;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;

public class PollAddOptionFieldLayout extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    private final BoolAnimator animatorTextErrorVisibility;
    private final BoolAnimator animatorTextWarnVisibility;
    private final PollAttachButton attachButton;
    private PollAttachedMedia attachedMedia;
    public ChatMessageCell cellToWatch;
    private final int[] cords;
    private final EmojiButton emojiButton;
    private final BaseFragment fragment;
    private int lastColor;
    private final SimpleTextView limitTextView;
    private final FrameLayout.LayoutParams lp;
    private final int maxLength;
    private int messageIdToWatch;
    private ViewTreeObserver observer;
    private Runnable onCancel;
    private final Rect rect;
    public final EditTextBoldCursor textView;
    private FrameLayout viewsContainer;
    private ViewWrapper viewsContainerWrapper;

    public PollAddOptionFieldLayout(final BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.lp = layoutParams;
        this.cords = new int[2];
        this.rect = new Rect();
        FactorAnimator.Target target = new FactorAnimator.Target() {
            @Override
            public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
                FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
            }

            @Override
            public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
                this.f$0.checkLimitText(i, f, f2, factorAnimator);
            }
        };
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorTextWarnVisibility = new BoolAnimator(0, target, cubicBezierInterpolator, 380L);
        this.animatorTextErrorVisibility = new BoolAnimator(0, new FactorAnimator.Target() {
            @Override
            public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
                FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
            }

            @Override
            public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
                this.f$0.checkLimitText(i, f, f2, factorAnimator);
            }
        }, cubicBezierInterpolator, 380L);
        this.fragment = baseFragment;
        this.maxLength = baseFragment.getMessagesController().config.pollAnswerLengthMax.get();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, resourcesProvider);
        this.textView = anonymousClass1;
        anonymousClass1.setAllowTextEntitiesIntersection(true);
        anonymousClass1.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        anonymousClass1.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        anonymousClass1.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
        anonymousClass1.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        anonymousClass1.setTextSize(1, 15.0f);
        anonymousClass1.setMaxLines(Integer.MAX_VALUE);
        anonymousClass1.setBackground(null);
        anonymousClass1.setImeOptions(268435462);
        anonymousClass1.setInputType(anonymousClass1.getInputType() | 16384);
        anonymousClass1.addTextChangedListener(new TextWatcherImpl() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                TextWatcherImpl.CC.$default$beforeTextChanged(this, charSequence, i, i2, i3);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                TextWatcherImpl.CC.$default$onTextChanged(this, charSequence, i, i2, i3);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                PollAddOptionFieldLayout.this.checkTextLengthLimit();
            }
        });
        EmojiButton emojiButton = new EmojiButton(context);
        this.emojiButton = emojiButton;
        int i = Theme.key_stickers_menuSelector;
        emojiButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(i, resourcesProvider)));
        ScaleStateListAnimator.apply(emojiButton);
        PollAttachButton pollAttachButton = new PollAttachButton(getContext(), resourcesProvider, 36);
        this.attachButton = pollAttachButton;
        pollAttachButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(i, resourcesProvider)));
        pollAttachButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$2(baseFragment, view);
            }
        });
        ScaleStateListAnimator.apply(pollAttachButton);
        SimpleTextView simpleTextView = new SimpleTextView(getContext());
        this.limitTextView = simpleTextView;
        simpleTextView.setTextSize(13);
        simpleTextView.setGravity(17);
        simpleTextView.setTranslationY(AndroidUtilities.dp(44.0f));
        simpleTextView.setVisibility(8);
        ViewWrapper viewWrapper = new ViewWrapper(context);
        this.viewsContainerWrapper = viewWrapper;
        addView(viewWrapper, layoutParams);
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public boolean hasOverlappingRendering() {
                return false;
            }
        };
        this.viewsContainer = frameLayout;
        this.viewsContainerWrapper.addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f));
        this.viewsContainer.addView(simpleTextView, LayoutHelper.createFrame(54, 24, 53));
        this.viewsContainer.addView(emojiButton, LayoutHelper.createFrame(44, 44, 51));
        this.viewsContainer.addView(pollAttachButton, LayoutHelper.createFrame(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        this.viewsContainer.addView(anonymousClass1, LayoutHelper.createFrame(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        anonymousClass1.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    class AnonymousClass1 extends EditTextCaption {
        private int lastHeight;

        @Override
        protected int emojiCacheType() {
            return 3;
        }

        AnonymousClass1(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int height = getHeight();
            if (this.lastHeight != height) {
                postOnAnimation(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onLayout$0();
                    }
                });
                this.lastHeight = height;
            }
        }

        public void lambda$onLayout$0() {
            PollAddOptionFieldLayout.this.updateCell();
        }

        @Override
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            editorInfo.imeOptions &= -1073741825;
            return inputConnectionOnCreateInputConnection;
        }
    }

    public void lambda$new$2(BaseFragment baseFragment, View view) {
        ChatAttachAlertPollLayout.openPollAttachMenu(baseFragment, ChatAttachAlertPollLayout.getStartLayoutForMedia(this.attachedMedia), ChatAttachAlertPollLayout.getAllowedLayoutsForIndex(0), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$new$1((PollAttachedMedia) obj);
            }
        }, null);
    }

    public void lambda$new$1(PollAttachedMedia pollAttachedMedia) {
        this.attachedMedia = pollAttachedMedia;
        this.attachButton.setAttachedMedia(pollAttachedMedia, true);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0();
            }
        }, 200L);
    }

    public void lambda$new$0() {
        AndroidUtilities.showKeyboard(this.textView);
    }

    public void drawInCell(Canvas canvas) {
        this.viewsContainerWrapper.drawInCell(canvas);
    }

    public void doOnCancel(Runnable runnable) {
        this.onCancel = runnable;
    }

    public PollAttachedMedia getAttachedMedia() {
        return this.attachedMedia;
    }

    public void doOnEmojiClick(final Runnable runnable) {
        this.emojiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                runnable.run();
            }
        });
    }

    public void setAnimatedVisibility(float f) {
        this.viewsContainer.setAlpha(f);
    }

    public void setCellToWatch(ChatMessageCell chatMessageCell) {
        this.cellToWatch = chatMessageCell;
        this.messageIdToWatch = chatMessageCell.getMessageObject().getId();
    }

    public void updateCell() {
        ChatMessageCell chatMessageCell = this.cellToWatch;
        if (chatMessageCell == null || chatMessageCell.getDelegate() == null) {
            return;
        }
        this.cellToWatch.getDelegate().forceUpdate(this.cellToWatch, false);
    }

    private void cancel() {
        Runnable runnable = this.onCancel;
        if (runnable != null) {
            runnable.run();
            this.onCancel = null;
        }
    }

    @Override
    public boolean onPreDraw() {
        ChatMessageCell chatMessageCell = this.cellToWatch;
        if (chatMessageCell == null) {
            return true;
        }
        int id = chatMessageCell.getMessageObject().getId();
        if (!this.cellToWatch.isAttachedToWindow() || this.messageIdToWatch != id || !this.cellToWatch.getPollAddButtonBounds(this.rect)) {
            cancel();
            return true;
        }
        this.cellToWatch.getLocationInWindow(this.cords);
        int[] iArr = this.cords;
        int i = iArr[0];
        int i2 = iArr[1];
        getLocationInWindow(iArr);
        int[] iArr2 = this.cords;
        this.rect.offset(i - iArr2[0], i2 - iArr2[1]);
        int iWidth = this.rect.width();
        FrameLayout.LayoutParams layoutParams = this.lp;
        if (layoutParams.width != iWidth) {
            layoutParams.width = iWidth;
            this.viewsContainerWrapper.setLayoutParams(layoutParams);
        }
        this.viewsContainerWrapper.setTranslationX(this.rect.left);
        this.viewsContainerWrapper.setTranslationY(this.rect.top + AndroidUtilities.dp(0.66f));
        return true;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.observer = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override
    protected void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.observer;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.observer.removeOnPreDrawListener(this);
        }
        this.observer = null;
        super.onDetachedFromWindow();
    }

    public void setEmojiKeyboardVisible(boolean z, boolean z2) {
        this.emojiButton.animatorIsEmojiVisible.setValue(z, z2);
    }

    public void setColor(int i) {
        if (this.lastColor != i) {
            this.lastColor = i;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
            this.emojiButton.emojiDrawable.setColorFilter(porterDuffColorFilter);
            this.emojiButton.keyboardDrawable.setColorFilter(porterDuffColorFilter);
            this.attachButton.attachDrawable.setColorFilter(porterDuffColorFilter);
            this.textView.setCursorColor(i);
            this.textView.setHandlesColor(i);
            this.textView.setHintTextColor(i);
        }
    }

    private static final class EmojiButton extends View {
        private final BoolAnimator animatorIsEmojiVisible;
        private final Drawable emojiDrawable;
        private final Drawable keyboardDrawable;

        public EmojiButton(Context context) {
            super(context);
            this.animatorIsEmojiVisible = new BoolAnimator(this, CubicBezierInterpolator.EASE_OUT_QUINT, 320L);
            this.emojiDrawable = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
            this.keyboardDrawable = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
        }

        @Override
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            float f = i / 2.0f;
            float f2 = i2 / 2.0f;
            DrawableUtils.setBounds(this.emojiDrawable, f, f2, 17);
            DrawableUtils.setBounds(this.keyboardDrawable, f, f2, 17);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float floatValue = this.animatorIsEmojiVisible.getFloatValue();
            DrawableUtils.drawWithScale(canvas, this.emojiDrawable, 1.0f - floatValue);
            DrawableUtils.drawWithScale(canvas, this.keyboardDrawable, floatValue);
        }
    }

    public void checkTextLengthLimit() {
        int length = this.textView.getText().length();
        this.animatorTextWarnVisibility.setValue(length > (this.maxLength * 7) / 10, true);
        this.animatorTextErrorVisibility.setValue(length > this.maxLength, true);
        this.limitTextView.setText(Integer.toString(this.maxLength - length));
    }

    public void checkLimitText(int i, float f, float f2, FactorAnimator factorAnimator) {
        FragmentFloatingButton.setAnimatedVisibility(this.limitTextView, this.animatorTextWarnVisibility.getFloatValue());
        this.limitTextView.setTextColor(ColorUtils.blendARGB(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, this.fragment.getResourceProvider()), Theme.getColor(Theme.key_text_RedRegular, this.fragment.getResourceProvider()), this.animatorTextErrorVisibility.getFloatValue()));
    }

    private static class ViewWrapper extends FrameLayout {
        public void drawInCell(Canvas canvas) {
        }

        public ViewWrapper(Context context) {
            super(context);
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            return super.drawChild(canvas, view, j);
        }
    }
}
