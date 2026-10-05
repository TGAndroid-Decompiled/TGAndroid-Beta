package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class kz extends w9 {
    public final lz G;

    public kz(lz lzVar, Context context) {
        super(context);
        this.G = lzVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        lz lzVar = this.G;
        nz nzVar = lzVar.d;
        boolean z10 = lzVar.f28548c;
        if (!z10 && MediaDataController.getInstance(nzVar.f29194c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.f20074id) && nzVar.f29245s1 != null) {
            canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), nzVar.f29245s1);
        }
    }
}
