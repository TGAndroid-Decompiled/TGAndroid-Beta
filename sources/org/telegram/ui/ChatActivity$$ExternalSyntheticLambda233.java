package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.ui.Components.RecyclerListView;

public final class ChatActivity$$ExternalSyntheticLambda233 implements RecyclerListView.OnInterceptTouchListener {
    public static final ChatActivity$$ExternalSyntheticLambda233 INSTANCE = new ChatActivity$$ExternalSyntheticLambda233();

    private ChatActivity$$ExternalSyntheticLambda233() {
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean lambda$showChatThemeBottomSheet$235;
        lambda$showChatThemeBottomSheet$235 = ChatActivity.lambda$showChatThemeBottomSheet$235(motionEvent);
        return lambda$showChatThemeBottomSheet$235;
    }
}
