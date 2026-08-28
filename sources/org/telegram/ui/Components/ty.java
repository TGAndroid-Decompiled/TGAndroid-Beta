package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class ty extends o9 {
    public final uy C;

    public ty(uy uyVar, Context context) {
        super(context);
        this.C = uyVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        uy uyVar = this.C;
        wy wyVar = uyVar.d;
        boolean z10 = uyVar.f33169c;
        if (!z10 && MediaDataController.getInstance(wyVar.Y0).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.f22407id) && wyVar.f34429o1 != null) {
            canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), wyVar.f34429o1);
        }
    }
}
