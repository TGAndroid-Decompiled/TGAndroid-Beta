package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class a00 extends y9 {
    public final b00 G;

    public a00(b00 b00Var, Context context) {
        super(context);
        this.G = b00Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b00 b00Var = this.G;
        d00 d00Var = b00Var.d;
        boolean z10 = b00Var.f24520c;
        if (!z10 && MediaDataController.getInstance(d00Var.f25080c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.f19829id) && d00Var.f25131s1 != null) {
            canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), d00Var.f25131s1);
        }
    }
}
