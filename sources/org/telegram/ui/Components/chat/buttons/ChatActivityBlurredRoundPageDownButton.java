package org.telegram.ui.Components.chat.buttons;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CounterView;

public final class ChatActivityBlurredRoundPageDownButton extends FrameLayout {
    public ChatActivityBlurredRoundButton buttonView;
    public CounterView counterView;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean reversedCounter;

    public ChatActivityBlurredRoundPageDownButton(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.buttonView.setEnabled(z, false);
    }

    public final void setEnabled(boolean z, boolean z2) {
        super.setEnabled(z);
        this.buttonView.setEnabled(z, z2);
    }
}
