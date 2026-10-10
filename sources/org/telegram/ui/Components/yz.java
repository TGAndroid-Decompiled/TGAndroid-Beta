package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class yz extends y9 {
    public final zz G;

    public yz(zz zzVar, Context context) {
        super(context);
        this.G = zzVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        zz zzVar = this.G;
        b00 b00Var = zzVar.d;
        boolean z10 = zzVar.f33728c;
        if (!z10 && MediaDataController.getInstance(b00Var.f24689c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.f20069id) && b00Var.f24740s1 != null) {
            canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), b00Var.f24740s1);
        }
    }
}
