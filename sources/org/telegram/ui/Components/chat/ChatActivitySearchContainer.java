package org.telegram.ui.Components.chat;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.chat.layouts.ChatActivityFadeView;

public final class ChatActivitySearchContainer extends FrameLayout {
    public final ChatActivityFadeView fadeView;

    public ChatActivitySearchContainer(Context context) {
        super(context);
        ChatActivityFadeView chatActivityFadeView = new ChatActivityFadeView(context);
        this.fadeView = chatActivityFadeView;
        addView(chatActivityFadeView, LayoutHelper.createFrameMatchParent());
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        bringChildToFront(this.fadeView);
    }

    public final void setup(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder) {
        ChatActivityFadeView chatActivityFadeView = this.fadeView;
        chatActivityFadeView.setup(blurredBackgroundDrawableViewFactory, blurredBackgroundProviderBuilder);
        chatActivityFadeView.setIgnoreFastWay(true);
        chatActivityFadeView.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        chatActivityFadeView.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }
}
