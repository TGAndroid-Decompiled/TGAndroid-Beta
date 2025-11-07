package org.telegram.ui.Components.chat.layouts;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import me.vkryl.android.AnimatorUtils;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.chat.buttons.ChatActivityBlurredRoundPageDownButton;

public class ChatActivitySideControlsButtonsLayout extends FrameLayout implements FactorAnimator.Target {
    private static final int[] buttonIcons;
    private final BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory;
    private final String[] buttonDescriptions;
    private final ButtonHolder[] buttonHolders;
    private final BlurredBackgroundColorProvider colorProvider;
    private ButtonOnClickListener onClickListener;
    private ButtonOnLongClickListener onLongClickListener;
    private final Theme.ResourcesProvider resourcesProvider;

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    static {
        int i = R.drawable.pagedown;
        buttonIcons = new int[]{i, R.drawable.mentionbutton, R.drawable.reactionbutton, i, i};
    }

    public ChatActivitySideControlsButtonsLayout(Context context, Theme.ResourcesProvider resourcesProvider, BlurredBackgroundColorProvider blurredBackgroundColorProvider, BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        super(context);
        this.buttonDescriptions = new String[]{LocaleController.getString(R.string.AccDescrPageDown), LocaleController.getString(R.string.AccDescrMentionDown), LocaleController.getString(R.string.AccDescrReactionMentionDown), LocaleController.getString(R.string.AccDescrSearchPrev), LocaleController.getString(R.string.AccDescrSearchNext)};
        this.buttonHolders = new ButtonHolder[5];
        this.blurredBackgroundDrawableViewFactory = blurredBackgroundDrawableViewFactory;
        this.colorProvider = blurredBackgroundColorProvider;
        this.resourcesProvider = resourcesProvider;
    }

    public void setOnClickListener(ButtonOnClickListener buttonOnClickListener) {
        this.onClickListener = buttonOnClickListener;
    }

    public void setOnLongClickListener(ButtonOnLongClickListener buttonOnLongClickListener) {
        this.onLongClickListener = buttonOnLongClickListener;
    }

    public boolean getButtonLocationInWindow(int i, int[] iArr) {
        ButtonHolder buttonHolder = this.buttonHolders[i];
        if (buttonHolder == null) {
            return false;
        }
        buttonHolder.button.getLocationInWindow(iArr);
        return true;
    }

    public void updateColors() {
        for (ButtonHolder buttonHolder : this.buttonHolders) {
            if (buttonHolder != null) {
                buttonHolder.button.updateColors();
            }
        }
    }

    public void showButton(int i, boolean z, boolean z2) {
        if (this.buttonHolders[i] != null || z) {
            getOrCreateButtonHolder(i).visibilityAnimator.setValue(z, z2);
        }
    }

    public void setButtonCount(int i, int i2, boolean z) {
        getOrCreateButtonHolder(i).button.setCount(i2, z);
    }

    public void setButtonLoading(int i, boolean z, boolean z2) {
        getOrCreateButtonHolder(i).button.showLoading(z, z2);
    }

    public boolean isButtonVisible(int i) {
        ButtonHolder buttonHolder = getButtonHolder(i);
        return buttonHolder != null && buttonHolder.visibilityAnimator.getValue();
    }

    public void setButtonEnabled(int i, boolean z, boolean z2) {
        getOrCreateButtonHolder(i).button.setEnabled(z, z2);
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        int i2 = i >> 16;
        int i3 = i & 65535;
        if (i2 >= 0) {
            ButtonHolder[] buttonHolderArr = this.buttonHolders;
            if (i2 >= buttonHolderArr.length || buttonHolderArr[i2] == null || i3 != 1) {
                return;
            }
            checkButtonsPositionsAndVisibility();
        }
    }

    private void checkButtonsPositionsAndVisibility() {
        int i = 0;
        float f = 0.0f;
        while (true) {
            ButtonHolder[] buttonHolderArr = this.buttonHolders;
            if (i >= buttonHolderArr.length) {
                return;
            }
            ButtonHolder buttonHolder = buttonHolderArr[i];
            if (buttonHolder != null) {
                float floatValue = buttonHolder.visibilityAnimator.getFloatValue();
                buttonHolder.button.setVisibility(floatValue > 0.0f ? 0 : 8);
                buttonHolder.button.setAlpha(floatValue);
                buttonHolder.button.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, floatValue));
                buttonHolder.button.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, floatValue));
                buttonHolder.button.setTranslationY((AndroidUtilities.dp(100.0f) * (1.0f - floatValue)) - f);
                f += (AndroidUtilities.dp(44.0f) + AndroidUtilities.dp((i == 4 || i == 3) ? 10.0f : 16.0f)) * floatValue;
            }
            i++;
        }
    }

    private ButtonHolder getButtonHolder(int i) {
        if (i < 0) {
            return null;
        }
        ButtonHolder[] buttonHolderArr = this.buttonHolders;
        if (i >= buttonHolderArr.length) {
            return null;
        }
        return buttonHolderArr[i];
    }

    private ButtonHolder getOrCreateButtonHolder(final int i) {
        if (this.buttonHolders[i] == null) {
            BoolAnimator boolAnimator = new BoolAnimator((i << 16) | 1, this, AnimatorUtils.DECELERATE_INTERPOLATOR, 280L);
            ChatActivityBlurredRoundPageDownButton create = ChatActivityBlurredRoundPageDownButton.create(getContext(), this.resourcesProvider, this.blurredBackgroundDrawableViewFactory, this.colorProvider, buttonIcons[i]);
            create.setPivotX(AndroidUtilities.dp(28.0f));
            create.setPivotY(AndroidUtilities.dp(36.0f));
            create.setVisibility(8);
            create.setContentDescription(this.buttonDescriptions[i]);
            create.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatActivitySideControlsButtonsLayout.this.lambda$getOrCreateButtonHolder$0(i, view);
                }
            });
            create.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view) {
                    boolean lambda$getOrCreateButtonHolder$1;
                    lambda$getOrCreateButtonHolder$1 = ChatActivitySideControlsButtonsLayout.this.lambda$getOrCreateButtonHolder$1(i, view);
                    return lambda$getOrCreateButtonHolder$1;
                }
            });
            if (i == 4) {
                create.reverseIconByY();
            }
            if (i == 0) {
                create.reverseCounter();
            }
            addView(create, LayoutHelper.createFrame(56, 64, 83));
            this.buttonHolders[i] = new ButtonHolder(create, boolAnimator);
            checkButtonsPositionsAndVisibility();
        }
        return this.buttonHolders[i];
    }

    public void lambda$getOrCreateButtonHolder$0(int i, View view) {
        ButtonOnClickListener buttonOnClickListener = this.onClickListener;
        if (buttonOnClickListener != null) {
            buttonOnClickListener.onClick(i, view);
        }
    }

    public boolean lambda$getOrCreateButtonHolder$1(int i, View view) {
        ButtonOnLongClickListener buttonOnLongClickListener = this.onLongClickListener;
        if (buttonOnLongClickListener != null) {
            return buttonOnLongClickListener.onLongClick(i, view);
        }
        return false;
    }

    public static class ButtonHolder {
        public final ChatActivityBlurredRoundPageDownButton button;
        public final BoolAnimator visibilityAnimator;

        private ButtonHolder(ChatActivityBlurredRoundPageDownButton chatActivityBlurredRoundPageDownButton, BoolAnimator boolAnimator) {
            this.button = chatActivityBlurredRoundPageDownButton;
            this.visibilityAnimator = boolAnimator;
        }
    }
}
