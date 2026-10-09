package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class xz extends y9 {
    public final yz G;

    public xz(yz yzVar, Context context) {
        super(context);
        this.G = yzVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        yz yzVar = this.G;
        a00 a00Var = yzVar.d;
        boolean z10 = yzVar.f33405c;
        if (!z10 && MediaDataController.getInstance(a00Var.f24401c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.f20065id) && a00Var.f24452s1 != null) {
            canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), a00Var.f24452s1);
        }
    }
}
