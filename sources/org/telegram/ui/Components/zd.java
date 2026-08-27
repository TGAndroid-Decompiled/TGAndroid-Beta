package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

public final class zd extends mg {

    public final ChatActivityEnterView f35224x;

    public zd(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.f35224x = chatActivityEnterView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.f35224x;
        Paint paint = chatActivityEnterView.L1;
        super.onDraw(canvas);
        if (getTag() == null || chatActivityEnterView.f26133k1 == null || chatActivityEnterView.S0 || MediaDataController.getInstance(chatActivityEnterView.M).getUnreadStickerSets().isEmpty() || paint == null) {
            return;
        }
        canvas.drawCircle(AndroidUtilities.dp(9.0f) + (getWidth() / 2), (getHeight() / 2) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), paint);
    }
}
