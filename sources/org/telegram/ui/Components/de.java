package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class de extends qg {
    public final ChatActivityEnterView f27723x;

    public de(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.f27723x = chatActivityEnterView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.f27723x;
        Paint paint = chatActivityEnterView.L1;
        super.onDraw(canvas);
        if (getTag() != null && chatActivityEnterView.f26137k1 != null && !chatActivityEnterView.S0 && !MediaDataController.getInstance(chatActivityEnterView.M).getUnreadStickerSets().isEmpty() && paint != null) {
            canvas.drawCircle(AndroidUtilities.dp(9.0f) + (getWidth() / 2), (getHeight() / 2) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), paint);
        }
    }
}
