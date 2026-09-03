package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class jz extends p9 {
    public final kz D;

    public jz(kz kzVar, Context context) {
        super(context);
        this.D = kzVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        kz kzVar = this.D;
        mz mzVar = kzVar.d;
        boolean z4 = kzVar.f28525c;
        if (!z4 && MediaDataController.getInstance(mzVar.Z0).isStickerPackUnread(z4, ((TLRPC.StickerSetCovered) getTag()).set.f20872id) && mzVar.f29314p1 != null) {
            canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), mzVar.f29314p1);
        }
    }
}
