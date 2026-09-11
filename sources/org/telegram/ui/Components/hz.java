package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class hz extends x9 {
    public final iz G;

    public hz(iz izVar, Context context) {
        super(context);
        this.G = izVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        iz izVar = this.G;
        kz kzVar = izVar.d;
        boolean z10 = izVar.f27287c;
        if (!z10 && MediaDataController.getInstance(kzVar.f27932c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.f19896id) && kzVar.f27983s1 != null) {
            canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), kzVar.f27983s1);
        }
    }
}
