package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.ui.Components.RecyclerListView;
public final class ChatActivity$$ExternalSyntheticLambda279 implements RecyclerListView.OnInterceptTouchListener {
    public static final ChatActivity$$ExternalSyntheticLambda279 INSTANCE = new ChatActivity$$ExternalSyntheticLambda279();

    private ChatActivity$$ExternalSyntheticLambda279() {
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean lambda$showChatThemeBottomSheet$273;
        lambda$showChatThemeBottomSheet$273 = ChatActivity.lambda$showChatThemeBottomSheet$273(motionEvent);
        return lambda$showChatThemeBottomSheet$273;
    }
}
