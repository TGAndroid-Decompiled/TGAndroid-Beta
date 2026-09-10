package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class oe extends dh {
    public final ChatActivityEnterView f25768x;

    public oe(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.f25768x = chatActivityEnterView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.f25768x;
        Paint paint = chatActivityEnterView.P1;
        super.onDraw(canvas);
        if (getTag() != null && chatActivityEnterView.f20900o1 != null && !chatActivityEnterView.W0 && !MediaDataController.getInstance(chatActivityEnterView.Q).getUnreadStickerSets().isEmpty() && paint != null) {
            canvas.drawCircle(AndroidUtilities.dp(9.0f) + (getWidth() / 2), (getHeight() / 2) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), paint);
        }
    }
}
