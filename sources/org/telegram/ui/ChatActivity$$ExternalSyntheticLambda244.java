package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.ui.Components.RecyclerListView;

public final class ChatActivity$$ExternalSyntheticLambda244 implements RecyclerListView.OnInterceptTouchListener {
    public static final ChatActivity$$ExternalSyntheticLambda244 INSTANCE = new ChatActivity$$ExternalSyntheticLambda244();

    private ChatActivity$$ExternalSyntheticLambda244() {
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean lambda$showChatThemeBottomSheet$246;
        lambda$showChatThemeBottomSheet$246 = ChatActivity.lambda$showChatThemeBottomSheet$246(motionEvent);
        return lambda$showChatThemeBottomSheet$246;
    }
}
