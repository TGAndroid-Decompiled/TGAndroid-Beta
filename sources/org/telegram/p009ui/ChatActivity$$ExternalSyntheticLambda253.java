package org.telegram.p009ui;

import android.view.MotionEvent;
import org.telegram.p009ui.Components.RecyclerListView;

public final class ChatActivity$$ExternalSyntheticLambda253 implements RecyclerListView.OnInterceptTouchListener {
    public static final ChatActivity$$ExternalSyntheticLambda253 INSTANCE = new ChatActivity$$ExternalSyntheticLambda253();

    private ChatActivity$$ExternalSyntheticLambda253() {
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean lambda$showChatThemeBottomSheet$253;
        lambda$showChatThemeBottomSheet$253 = ChatActivity.lambda$showChatThemeBottomSheet$253(motionEvent);
        return lambda$showChatThemeBottomSheet$253;
    }
}
