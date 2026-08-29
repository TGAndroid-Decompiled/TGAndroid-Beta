package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class ge extends tg {
    public final ChatActivityEnterView f28874x;

    public ge(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.f28874x = chatActivityEnterView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.f28874x;
        Paint paint = chatActivityEnterView.L1;
        super.onDraw(canvas);
        if (getTag() != null && chatActivityEnterView.f26148k1 != null && !chatActivityEnterView.S0 && !MediaDataController.getInstance(chatActivityEnterView.M).getUnreadStickerSets().isEmpty() && paint != null) {
            canvas.drawCircle(AndroidUtilities.dp(9.0f) + (getWidth() / 2), (getHeight() / 2) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), paint);
        }
    }
}
