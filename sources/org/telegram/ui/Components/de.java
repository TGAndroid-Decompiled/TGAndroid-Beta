package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class de extends qg {
    public final ChatActivityEnterView f26263x;

    public de(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.f26263x = chatActivityEnterView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.f26263x;
        Paint paint = chatActivityEnterView.M1;
        super.onDraw(canvas);
        if (getTag() != null && chatActivityEnterView.l1 != null && !chatActivityEnterView.T0 && !MediaDataController.getInstance(chatActivityEnterView.N).getUnreadStickerSets().isEmpty() && paint != null) {
            canvas.drawCircle(AndroidUtilities.dp(9.0f) + (getWidth() / 2), (getHeight() / 2) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), paint);
        }
    }
}
