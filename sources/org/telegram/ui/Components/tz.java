package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class tz extends z9 {
    public final uz G;

    public tz(uz uzVar, Context context) {
        super(context);
        this.G = uzVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        uz uzVar = this.G;
        wz wzVar = uzVar.d;
        boolean z10 = uzVar.f29820c;
        if (!z10 && MediaDataController.getInstance(wzVar.f31014c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.f19243id) && wzVar.f31064s1 != null) {
            canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), wzVar.f31064s1);
        }
    }
}
