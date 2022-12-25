package org.telegram.p009ui;

import android.view.MotionEvent;
import org.telegram.p009ui.Components.RecyclerListView;

public final class ChatActivity$$ExternalSyntheticLambda260 implements RecyclerListView.OnInterceptTouchListener {
    public static final ChatActivity$$ExternalSyntheticLambda260 INSTANCE = new ChatActivity$$ExternalSyntheticLambda260();

    private ChatActivity$$ExternalSyntheticLambda260() {
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean lambda$showChatThemeBottomSheet$261;
        lambda$showChatThemeBottomSheet$261 = ChatActivity.lambda$showChatThemeBottomSheet$261(motionEvent);
        return lambda$showChatThemeBottomSheet$261;
    }
}
