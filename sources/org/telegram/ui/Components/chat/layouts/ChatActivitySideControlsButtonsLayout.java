package org.telegram.ui.Components.chat.layouts;

import android.content.Context;
import android.widget.FrameLayout;
import me.vkryl.android.AnimatorUtils;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.commonmark.internal.InlineParserImpl;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda68;
import org.telegram.ui.Components.CounterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.chat.buttons.ChatActivityBlurredRoundButton;
import org.telegram.ui.Components.chat.buttons.ChatActivityBlurredRoundPageDownButton;

public final class ChatActivitySideControlsButtonsLayout extends FrameLayout implements FactorAnimator.Target {
    public static final int[] buttonIcons;
    public final BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory;
    public final String[] buttonDescriptions;
    public final ChatActivity.AnonymousClass117[] buttonHolders;
    public final BlurredBackgroundColorProviderThemed colorProvider;
    public int gravity;
    public ButtonOnClickListener onClickListener;
    public ButtonOnLongClickListener onLongClickListener;
    public final InlineParserImpl.DelimiterData[] pendingStates;
    public final Theme.ResourcesProvider resourcesProvider;

    static {
        int i = R.drawable.msg_input_attach2;
        int i2 = R.drawable.pagedown;
        buttonIcons = new int[]{i, i2, R.drawable.mentionbutton, R.drawable.reactionbutton, R.drawable.menu_poll_notify, i2, i2};
    }

    public ChatActivitySideControlsButtonsLayout(Context context, Theme.ResourcesProvider resourcesProvider, BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed, BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        super(context);
        this.buttonDescriptions = new String[]{LocaleController.getString(R.string.AttachMenu), LocaleController.getString(R.string.AccDescrPageDown), LocaleController.getString(R.string.AccDescrMentionDown), LocaleController.getString(R.string.AccDescrReactionMentionDown), LocaleController.getString(R.string.AccDescrPollVotesMentionDown), LocaleController.getString(R.string.AccDescrSearchPrev), LocaleController.getString(R.string.AccDescrSearchNext)};
        this.buttonHolders = new ChatActivity.AnonymousClass117[7];
        this.pendingStates = new InlineParserImpl.DelimiterData[7];
        this.gravity = 83;
        this.blurredBackgroundDrawableViewFactory = blurredBackgroundDrawableViewFactory;
        this.colorProvider = blurredBackgroundColorProviderThemed;
        this.resourcesProvider = resourcesProvider;
    }

    public final void checkButtonsPositionsAndVisibility$1() {
        int i = 0;
        float fDp = 0.0f;
        while (true) {
            ChatActivity.AnonymousClass117[] anonymousClass117Arr = this.buttonHolders;
            if (i >= anonymousClass117Arr.length) {
                return;
            }
            ChatActivity.AnonymousClass117 anonymousClass117 = anonymousClass117Arr[i];
            if (anonymousClass117 != null) {
                float f = ((BoolAnimator) anonymousClass117.val$finalReactionsLayout).floatValue;
                float f2 = ((BoolAnimator) anonymousClass117.this$0).floatValue;
                int i2 = f > 0.0f ? 0 : 8;
                ChatActivityBlurredRoundPageDownButton chatActivityBlurredRoundPageDownButton = (ChatActivityBlurredRoundPageDownButton) anonymousClass117.val$primaryMessage;
                chatActivityBlurredRoundPageDownButton.setVisibility(i2);
                chatActivityBlurredRoundPageDownButton.setAlpha(f);
                chatActivityBlurredRoundPageDownButton.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f));
                chatActivityBlurredRoundPageDownButton.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f));
                if (i != 0) {
                    chatActivityBlurredRoundPageDownButton.setTranslationY(((1.0f - f) * AndroidUtilities.dp(80.0f)) - fDp);
                }
                fDp += (AndroidUtilities.dp((f2 * 10.0f) + 10.0f) + AndroidUtilities.dp(44.0f)) * f;
            }
            i++;
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        int i2 = i >> 16;
        int i3 = i & 65535;
        if (i2 >= 0) {
            ChatActivity.AnonymousClass117[] anonymousClass117Arr = this.buttonHolders;
            if (i2 >= anonymousClass117Arr.length || anonymousClass117Arr[i2] == null) {
                return;
            }
            if (i3 == 1 || i3 == 2) {
                checkButtonsPositionsAndVisibility$1();
            }
        }
    }

    public final void setButtonCount(int i, int i2, boolean z) {
        InlineParserImpl.DelimiterData[] delimiterDataArr = this.pendingStates;
        if (delimiterDataArr[i] == null) {
            delimiterDataArr[i] = new InlineParserImpl.DelimiterData(3);
        }
        delimiterDataArr[i].count = i2;
        ChatActivity.AnonymousClass117 anonymousClass117 = this.buttonHolders[i];
        if (anonymousClass117 != null) {
            ChatActivityBlurredRoundPageDownButton chatActivityBlurredRoundPageDownButton = (ChatActivityBlurredRoundPageDownButton) anonymousClass117.val$primaryMessage;
            if (chatActivityBlurredRoundPageDownButton.counterView == null) {
                CounterView counterView = new CounterView(chatActivityBlurredRoundPageDownButton.getContext(), chatActivityBlurredRoundPageDownButton.resourcesProvider);
                chatActivityBlurredRoundPageDownButton.counterView = counterView;
                counterView.setReverse(chatActivityBlurredRoundPageDownButton.reversedCounter);
                chatActivityBlurredRoundPageDownButton.addView(chatActivityBlurredRoundPageDownButton.counterView, LayoutHelper.createFrame(-1, 28, 48));
            }
            chatActivityBlurredRoundPageDownButton.counterView.counterDrawable.setCount(i2, z);
            ((BoolAnimator) anonymousClass117.this$0).setValue(i2 > 0, z);
        }
    }

    public void setGravity(int i) {
        this.gravity = i;
    }

    public void setOnClickListener(ButtonOnClickListener buttonOnClickListener) {
        this.onClickListener = buttonOnClickListener;
    }

    public void setOnLongClickListener(ButtonOnLongClickListener buttonOnLongClickListener) {
        this.onLongClickListener = buttonOnLongClickListener;
    }

    public final void showButton(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        ChatActivity.AnonymousClass117[] anonymousClass117Arr = this.buttonHolders;
        ChatActivity.AnonymousClass117 anonymousClass117 = anonymousClass117Arr[i];
        if (anonymousClass117 != null || z) {
            if (anonymousClass117 == null) {
                int i4 = i << 16;
                BoolAnimator boolAnimator = new BoolAnimator(i4 | 1, this, i == 0 ? CubicBezierInterpolator.EASE_OUT_QUINT : AnimatorUtils.DECELERATE_INTERPOLATOR, i == 0 ? 300L : 280L, false);
                BoolAnimator boolAnimator2 = new BoolAnimator(i4 | 2, this, i == 0 ? CubicBezierInterpolator.EASE_OUT_QUINT : AnimatorUtils.DECELERATE_INTERPOLATOR, i == 0 ? 300L : 280L, false);
                if (i == 0) {
                    i2 = 50;
                    i3 = 32;
                } else {
                    i2 = 56;
                    i3 = 48;
                }
                Context context = getContext();
                int i5 = buttonIcons[i];
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                ChatActivityBlurredRoundPageDownButton chatActivityBlurredRoundPageDownButton = new ChatActivityBlurredRoundPageDownButton(context, resourcesProvider);
                ChatActivityBlurredRoundButton chatActivityBlurredRoundButtonCreate = ChatActivityBlurredRoundButton.create(context, this.blurredBackgroundDrawableViewFactory, this.colorProvider, resourcesProvider, i5, i3);
                chatActivityBlurredRoundPageDownButton.buttonView = chatActivityBlurredRoundButtonCreate;
                chatActivityBlurredRoundPageDownButton.addView(chatActivityBlurredRoundButtonCreate, LayoutHelper.createFrame(i2, i2, 80));
                chatActivityBlurredRoundButtonCreate.setIconPadding(AndroidUtilities.dp(2.0f));
                ScaleStateListAnimator.apply(chatActivityBlurredRoundPageDownButton, 0.13f, 2.0f);
                float f = i2 / 2.0f;
                chatActivityBlurredRoundPageDownButton.setPivotX(AndroidUtilities.dp(f));
                chatActivityBlurredRoundPageDownButton.setPivotY(AndroidUtilities.dp(f + 8.0f));
                chatActivityBlurredRoundPageDownButton.setVisibility(8);
                chatActivityBlurredRoundPageDownButton.setContentDescription(this.buttonDescriptions[i]);
                chatActivityBlurredRoundPageDownButton.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(this, i, 11));
                chatActivityBlurredRoundPageDownButton.setOnLongClickListener(new ScrollSlidingTextTabStrip$$ExternalSyntheticLambda2(this, i, 1));
                if (i == 6) {
                    ChatActivityBlurredRoundButton chatActivityBlurredRoundButton = chatActivityBlurredRoundPageDownButton.buttonView;
                    chatActivityBlurredRoundButton.buttonScaleY = -1.0f;
                    chatActivityBlurredRoundButton.checkUi_IconViewVisibility();
                }
                if (i == 1) {
                    chatActivityBlurredRoundPageDownButton.reversedCounter = true;
                    CounterView counterView = chatActivityBlurredRoundPageDownButton.counterView;
                    if (counterView != null) {
                        counterView.setReverse(true);
                    }
                }
                addView(chatActivityBlurredRoundPageDownButton, LayoutHelper.createFrame(i2, i2 + 8, this.gravity));
                ChatActivity.AnonymousClass117 anonymousClass118 = new ChatActivity.AnonymousClass117();
                anonymousClass118.val$primaryMessage = chatActivityBlurredRoundPageDownButton;
                anonymousClass118.val$finalReactionsLayout = boolAnimator;
                anonymousClass118.this$0 = boolAnimator2;
                anonymousClass117Arr[i] = anonymousClass118;
                InlineParserImpl.DelimiterData delimiterData = this.pendingStates[i];
                if (delimiterData != null) {
                    int i6 = delimiterData.count;
                    if (chatActivityBlurredRoundPageDownButton.counterView == null) {
                        CounterView counterView2 = new CounterView(chatActivityBlurredRoundPageDownButton.getContext(), chatActivityBlurredRoundPageDownButton.resourcesProvider);
                        chatActivityBlurredRoundPageDownButton.counterView = counterView2;
                        counterView2.setReverse(chatActivityBlurredRoundPageDownButton.reversedCounter);
                        chatActivityBlurredRoundPageDownButton.addView(chatActivityBlurredRoundPageDownButton.counterView, LayoutHelper.createFrame(-1, 28, 48));
                    }
                    chatActivityBlurredRoundPageDownButton.counterView.counterDrawable.setCount(i6, false);
                    boolAnimator.setValue(false, false);
                    boolAnimator2.setValue(delimiterData.count > 0, false);
                    chatActivityBlurredRoundPageDownButton.buttonView.showLoading(delimiterData.canClose, false);
                    chatActivityBlurredRoundPageDownButton.setEnabled(delimiterData.canOpen, false);
                }
                checkButtonsPositionsAndVisibility$1();
            }
            ((BoolAnimator) anonymousClass117Arr[i].val$finalReactionsLayout).setValue(z, z2);
        }
    }
}
