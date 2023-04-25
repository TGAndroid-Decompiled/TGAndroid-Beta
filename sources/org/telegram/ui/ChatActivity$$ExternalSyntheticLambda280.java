package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.ui.Components.RecyclerListView;
public final class ChatActivity$$ExternalSyntheticLambda280 implements RecyclerListView.OnInterceptTouchListener {
    public static final ChatActivity$$ExternalSyntheticLambda280 INSTANCE = new ChatActivity$$ExternalSyntheticLambda280();

    private ChatActivity$$ExternalSyntheticLambda280() {
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean lambda$showChatThemeBottomSheet$275;
        lambda$showChatThemeBottomSheet$275 = ChatActivity.lambda$showChatThemeBottomSheet$275(motionEvent);
        return lambda$showChatThemeBottomSheet$275;
    }
}
