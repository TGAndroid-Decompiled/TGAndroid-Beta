package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class qz extends w9 {
    public final rz G;

    public qz(rz rzVar, Context context) {
        super(context);
        this.G = rzVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        rz rzVar = this.G;
        tz tzVar = rzVar.d;
        boolean z10 = rzVar.f30058c;
        if (!z10 && MediaDataController.getInstance(tzVar.f30722c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.f20303id) && tzVar.f30772s1 != null) {
            canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), tzVar.f30772s1);
        }
    }
}
