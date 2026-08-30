package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class hz extends p9 {
    public final iz D;

    public hz(iz izVar, Context context) {
        super(context);
        this.D = izVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        iz izVar = this.D;
        kz kzVar = izVar.d;
        boolean z4 = izVar.f25804c;
        if (!z4 && MediaDataController.getInstance(kzVar.Z0).isStickerPackUnread(z4, ((TLRPC.StickerSetCovered) getTag()).set.f19211id) && kzVar.f26457p1 != null) {
            canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), kzVar.f26457p1);
        }
    }
}
