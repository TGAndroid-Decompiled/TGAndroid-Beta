package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Utilities.Callback {
    public final int f18019a;
    public final Object f18020b;

    public z0(Object obj, int i10) {
        this.f18019a = i10;
        this.f18020b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18019a) {
            case 0:
                ChatThemeController.q((ChatThemeController) this.f18020b, (List) obj);
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f18020b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f18020b).invalidate();
                return;
        }
    }
}
