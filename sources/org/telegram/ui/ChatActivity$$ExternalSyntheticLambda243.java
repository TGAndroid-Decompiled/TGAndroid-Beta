package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.ui.Components.RecyclerListView;

public final class ChatActivity$$ExternalSyntheticLambda243 implements RecyclerListView.OnInterceptTouchListener {
    public static final ChatActivity$$ExternalSyntheticLambda243 INSTANCE = new ChatActivity$$ExternalSyntheticLambda243();

    private ChatActivity$$ExternalSyntheticLambda243() {
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean lambda$showChatThemeBottomSheet$245;
        lambda$showChatThemeBottomSheet$245 = ChatActivity.lambda$showChatThemeBottomSheet$245(motionEvent);
        return lambda$showChatThemeBottomSheet$245;
    }
}
