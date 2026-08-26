package org.telegram.ui.Components.chat.layouts;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.zxing.Result;
import me.vkryl.android.AnimatorUtils;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.commonmark.internal.InlineParserImpl;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda26;
import org.telegram.ui.Components.CounterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.chat.buttons.ChatActivityBlurredRoundButton;
import org.telegram.ui.Components.chat.buttons.ChatActivityBlurredRoundPageDownButton;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda29;

public final class ChatActivitySideControlsButtonsLayout extends FrameLayout implements FactorAnimator.Target {
    public static final int[] buttonIcons;
    public final BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory;
    public final String[] buttonDescriptions;
    public final Result[] buttonHolders;
    public final BlurredBackgroundColorProvider colorProvider;
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

    public ChatActivitySideControlsButtonsLayout(Context context, Theme.ResourcesProvider resourcesProvider, BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundColorProvider blurredBackgroundColorProvider) {
        super(context);
        this.buttonDescriptions = new String[]{LocaleController.getString(R.string.AttachMenu), LocaleController.getString(R.string.AccDescrPageDown), LocaleController.getString(R.string.AccDescrMentionDown), LocaleController.getString(R.string.AccDescrReactionMentionDown), LocaleController.getString(R.string.AccDescrPollVotesMentionDown), LocaleController.getString(R.string.AccDescrSearchPrev), LocaleController.getString(R.string.AccDescrSearchNext)};
        this.buttonHolders = new Result[7];
        this.pendingStates = new InlineParserImpl.DelimiterData[7];
        this.gravity = 83;
        this.blurredBackgroundDrawableViewFactory = blurredBackgroundDrawableViewFactory;
        this.colorProvider = blurredBackgroundColorProvider;
        this.resourcesProvider = resourcesProvider;
    }

    public final void checkButtonsPositionsAndVisibility$1() {
        int i = 0;
        float fDp = 0.0f;
        while (true) {
            Result[] resultArr = this.buttonHolders;
            if (i >= resultArr.length) {
                return;
            }
            Result result = resultArr[i];
            if (result != null) {
                float f = ((BoolAnimator) result.resultPoints).floatValue;
                float f2 = ((BoolAnimator) result.resultMetadata).floatValue;
                int i2 = f > 0.0f ? 0 : 8;
                ChatActivityBlurredRoundPageDownButton chatActivityBlurredRoundPageDownButton = (ChatActivityBlurredRoundPageDownButton) result.text;
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
    public final void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        int i2 = i >> 16;
        int i3 = i & 65535;
        if (i2 >= 0) {
            Result[] resultArr = this.buttonHolders;
            if (i2 >= resultArr.length || resultArr[i2] == null) {
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
            delimiterDataArr[i] = new InlineParserImpl.DelimiterData();
        }
        delimiterDataArr[i].count = i2;
        Result result = this.buttonHolders[i];
        if (result != null) {
            ChatActivityBlurredRoundPageDownButton chatActivityBlurredRoundPageDownButton = (ChatActivityBlurredRoundPageDownButton) result.text;
            if (chatActivityBlurredRoundPageDownButton.counterView == null) {
                CounterView counterView = new CounterView(chatActivityBlurredRoundPageDownButton.getContext(), chatActivityBlurredRoundPageDownButton.resourcesProvider);
                chatActivityBlurredRoundPageDownButton.counterView = counterView;
                counterView.setReverse(chatActivityBlurredRoundPageDownButton.reversedCounter);
                chatActivityBlurredRoundPageDownButton.addView(chatActivityBlurredRoundPageDownButton.counterView, LayoutHelper.createFrame(-1, 28, 48));
            }
            chatActivityBlurredRoundPageDownButton.counterView.setCount(i2, z);
            ((BoolAnimator) result.resultMetadata).setValue(i2 > 0, z);
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

    public final void showButton(final int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Result[] resultArr = this.buttonHolders;
        Result result = resultArr[i];
        if (result != null || z) {
            if (result == null) {
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
                chatActivityBlurredRoundPageDownButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda29(this, i, 2));
                chatActivityBlurredRoundPageDownButton.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        ButtonOnLongClickListener buttonOnLongClickListener = this.f$0.onLongClickListener;
                        if (buttonOnLongClickListener != null) {
                            return ((ChatActivity$$ExternalSyntheticLambda26) buttonOnLongClickListener).f$0.onSideControlButtonOnLongClick(i, view);
                        }
                        return false;
                    }
                });
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
                resultArr[i] = new Result(chatActivityBlurredRoundPageDownButton, boolAnimator, boolAnimator2, 27);
                InlineParserImpl.DelimiterData delimiterData = this.pendingStates[i];
                if (delimiterData != null) {
                    int i6 = delimiterData.count;
                    if (chatActivityBlurredRoundPageDownButton.counterView == null) {
                        CounterView counterView2 = new CounterView(chatActivityBlurredRoundPageDownButton.getContext(), chatActivityBlurredRoundPageDownButton.resourcesProvider);
                        chatActivityBlurredRoundPageDownButton.counterView = counterView2;
                        counterView2.setReverse(chatActivityBlurredRoundPageDownButton.reversedCounter);
                        chatActivityBlurredRoundPageDownButton.addView(chatActivityBlurredRoundPageDownButton.counterView, LayoutHelper.createFrame(-1, 28, 48));
                    }
                    chatActivityBlurredRoundPageDownButton.counterView.setCount(i6, false);
                    boolAnimator.setValue(false, false);
                    boolAnimator2.setValue(delimiterData.count > 0, false);
                    chatActivityBlurredRoundPageDownButton.buttonView.showLoading(delimiterData.canClose, false);
                    chatActivityBlurredRoundPageDownButton.setEnabled(delimiterData.canOpen, false);
                }
                checkButtonsPositionsAndVisibility$1();
            }
            ((BoolAnimator) resultArr[i].resultPoints).setValue(z, z2);
        }
    }
}
