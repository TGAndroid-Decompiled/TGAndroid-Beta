package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.ui.Components.RecyclerListView;
public final class ChatActivity$$ExternalSyntheticLambda277 implements RecyclerListView.OnInterceptTouchListener {
    public static final ChatActivity$$ExternalSyntheticLambda277 INSTANCE = new ChatActivity$$ExternalSyntheticLambda277();

    private ChatActivity$$ExternalSyntheticLambda277() {
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean lambda$showChatThemeBottomSheet$272;
        lambda$showChatThemeBottomSheet$272 = ChatActivity.lambda$showChatThemeBottomSheet$272(motionEvent);
        return lambda$showChatThemeBottomSheet$272;
    }
}
