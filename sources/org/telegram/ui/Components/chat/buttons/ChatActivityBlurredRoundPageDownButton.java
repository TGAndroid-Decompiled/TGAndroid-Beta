package org.telegram.ui.Components.chat.buttons;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CounterView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;

public class ChatActivityBlurredRoundPageDownButton extends FrameLayout {
    private ChatActivityBlurredRoundButton buttonView;
    private CounterView counterView;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean reversedCounter;

    public ChatActivityBlurredRoundPageDownButton(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
    }

    public void addButtonView(ChatActivityBlurredRoundButton chatActivityBlurredRoundButton) {
        this.buttonView = chatActivityBlurredRoundButton;
        addView(chatActivityBlurredRoundButton, LayoutHelper.createFrame(56, 56, 80));
        chatActivityBlurredRoundButton.setIconPadding(AndroidUtilities.dp(2.0f));
    }

    public void reverseCounter() {
        this.reversedCounter = true;
        CounterView counterView = this.counterView;
        if (counterView != null) {
            counterView.setReverse(true);
        }
    }

    public void setCount(int i, boolean z) {
        if (this.counterView == null) {
            CounterView counterView = new CounterView(getContext(), this.resourcesProvider);
            this.counterView = counterView;
            counterView.setReverse(this.reversedCounter);
            addView(this.counterView, LayoutHelper.createFrame(-1, 28, 48));
        }
        this.counterView.setCount(i, z);
    }

    public void showLoading(boolean z, boolean z2) {
        this.buttonView.showLoading(z, z2);
    }

    @Override
    public void setEnabled(boolean z) {
        setEnabled(z, false);
    }

    public void setEnabled(boolean z, boolean z2) {
        super.setEnabled(z);
        this.buttonView.setEnabled(z, z2);
    }

    public void reverseIconByY() {
        this.buttonView.reverseIconByY();
    }

    public void updateColors() {
        ChatActivityBlurredRoundButton chatActivityBlurredRoundButton = this.buttonView;
        if (chatActivityBlurredRoundButton != null) {
            chatActivityBlurredRoundButton.updateColors();
            invalidate();
        }
    }

    public static ChatActivityBlurredRoundPageDownButton create(Context context, Theme.ResourcesProvider resourcesProvider, BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundColorProvider blurredBackgroundColorProvider, int i) {
        ChatActivityBlurredRoundPageDownButton chatActivityBlurredRoundPageDownButton = new ChatActivityBlurredRoundPageDownButton(context, resourcesProvider);
        chatActivityBlurredRoundPageDownButton.addButtonView(ChatActivityBlurredRoundButton.create(context, blurredBackgroundDrawableViewFactory, blurredBackgroundColorProvider, resourcesProvider, i));
        ScaleStateListAnimator.apply(chatActivityBlurredRoundPageDownButton, 0.13f, 2.0f);
        return chatActivityBlurredRoundPageDownButton;
    }
}
