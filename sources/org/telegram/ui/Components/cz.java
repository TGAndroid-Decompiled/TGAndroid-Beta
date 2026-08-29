package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class cz extends t9 {
    public final dz C;

    public cz(dz dzVar, Context context) {
        super(context);
        this.C = dzVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        dz dzVar = this.C;
        fz fzVar = dzVar.d;
        boolean z10 = dzVar.f27886c;
        if (!z10 && MediaDataController.getInstance(fzVar.Y0).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.f22419id) && fzVar.f28620o1 != null) {
            canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), fzVar.f28620o1);
        }
    }
}
