package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

public final class vy extends n9 {
    public final wy C;

    public vy(wy wyVar, Context context) {
        super(context);
        this.C = wyVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        wy wyVar = this.C;
        yy yyVar = wyVar.d;
        boolean z10 = wyVar.f34374c;
        if (z10) {
            return;
        }
        if (!MediaDataController.getInstance(yyVar.Y0).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.f22407id) || yyVar.f35022o1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), yyVar.f35022o1);
    }
}
