package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class jz extends w9 {
    public final kz G;

    public jz(kz kzVar, Context context) {
        super(context);
        this.G = kzVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        kz kzVar = this.G;
        mz mzVar = kzVar.d;
        boolean z10 = kzVar.f25888c;
        if (!z10 && MediaDataController.getInstance(mzVar.f26548c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.f18362id) && mzVar.f26598s1 != null) {
            canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), mzVar.f26598s1);
        }
    }
}
