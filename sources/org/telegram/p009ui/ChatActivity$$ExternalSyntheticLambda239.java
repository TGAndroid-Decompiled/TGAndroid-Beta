package org.telegram.p009ui;

import android.view.MotionEvent;
import org.telegram.p009ui.Components.RecyclerListView;

public final class ChatActivity$$ExternalSyntheticLambda239 implements RecyclerListView.OnInterceptTouchListener {
    public static final ChatActivity$$ExternalSyntheticLambda239 INSTANCE = new ChatActivity$$ExternalSyntheticLambda239();

    private ChatActivity$$ExternalSyntheticLambda239() {
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean lambda$showChatThemeBottomSheet$241;
        lambda$showChatThemeBottomSheet$241 = ChatActivity.lambda$showChatThemeBottomSheet$241(motionEvent);
        return lambda$showChatThemeBottomSheet$241;
    }
}
