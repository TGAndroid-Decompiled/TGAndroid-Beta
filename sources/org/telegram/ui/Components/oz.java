package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class oz extends w9 {
    public final pz G;

    public oz(pz pzVar, Context context) {
        super(context);
        this.G = pzVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        pz pzVar = this.G;
        rz rzVar = pzVar.d;
        boolean z10 = pzVar.f26273c;
        if (!z10 && MediaDataController.getInstance(rzVar.f26805c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.f17222id) && rzVar.f26855s1 != null) {
            canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), rzVar.f26855s1);
        }
    }
}
