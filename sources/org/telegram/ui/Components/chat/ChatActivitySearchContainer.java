package org.telegram.ui.Components.chat;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.chat.layouts.ChatActivityFadeView;

public class ChatActivitySearchContainer extends FrameLayout {
    private final ChatActivityFadeView fadeView;

    public ChatActivitySearchContainer(Context context) {
        super(context);
        ChatActivityFadeView chatActivityFadeView = new ChatActivityFadeView(context);
        this.fadeView = chatActivityFadeView;
        addView(chatActivityFadeView, LayoutHelper.createFrameMatchParent());
    }

    public void setFade(int i, int i2) {
        this.fadeView.setFadeZoneTop(i);
        this.fadeView.setFadeZoneBottom(i2);
    }

    public void setup(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundColorProvider blurredBackgroundColorProvider) {
        this.fadeView.setup(blurredBackgroundDrawableViewFactory, blurredBackgroundColorProvider);
        this.fadeView.setIgnoreFastWay(true);
        this.fadeView.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        this.fadeView.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    @Override
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        bringChildToFront(this.fadeView);
    }
}
