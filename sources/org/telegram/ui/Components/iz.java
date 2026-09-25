package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class iz extends w9 {
    public final jz G;

    public iz(jz jzVar, Context context) {
        super(context);
        this.G = jzVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        jz jzVar = this.G;
        lz lzVar = jzVar.d;
        boolean z10 = jzVar.f25582c;
        if (!z10 && MediaDataController.getInstance(lzVar.f26237c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.f18363id) && lzVar.f26287s1 != null) {
            canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), lzVar.f26287s1);
        }
    }
}
