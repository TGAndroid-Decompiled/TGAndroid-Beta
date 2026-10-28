package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class pz extends y9 {
    public final qz G;

    public pz(qz qzVar, Context context) {
        super(context);
        this.G = qzVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        qz qzVar = this.G;
        sz szVar = qzVar.d;
        boolean z10 = qzVar.f32067c;
        if (!z10 && MediaDataController.getInstance(szVar.f32713c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.f22055id) && szVar.f32763s1 != null) {
            canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), szVar.f32763s1);
        }
    }
}
