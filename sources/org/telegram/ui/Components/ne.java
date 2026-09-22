package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class ne extends ah {
    public final ChatActivityEnterView f26752x;

    public ne(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.f26752x = chatActivityEnterView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.f26752x;
        Paint paint = chatActivityEnterView.Q1;
        super.onDraw(canvas);
        if (getTag() != null && chatActivityEnterView.f22057p1 != null && !chatActivityEnterView.W0 && !MediaDataController.getInstance(chatActivityEnterView.Q).getUnreadStickerSets().isEmpty() && paint != null) {
            canvas.drawCircle(AndroidUtilities.dp(9.0f) + (getWidth() / 2), (getHeight() / 2) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), paint);
        }
    }
}
