package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.ui.Components.RecyclerListView;

public final class ChatActivity$$ExternalSyntheticLambda246 implements RecyclerListView.OnInterceptTouchListener {
    public static final ChatActivity$$ExternalSyntheticLambda246 INSTANCE = new ChatActivity$$ExternalSyntheticLambda246();

    private ChatActivity$$ExternalSyntheticLambda246() {
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean lambda$showChatThemeBottomSheet$248;
        lambda$showChatThemeBottomSheet$248 = ChatActivity.lambda$showChatThemeBottomSheet$248(motionEvent);
        return lambda$showChatThemeBottomSheet$248;
    }
}
