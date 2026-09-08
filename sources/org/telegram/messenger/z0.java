package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Utilities.Callback {
    public final int f19793a;
    public final Object f19794b;

    public z0(Object obj, int i10) {
        this.f19793a = i10;
        this.f19794b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19793a) {
            case 0:
                ChatThemeController.q((ChatThemeController) this.f19794b, (List) obj);
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f19794b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f19794b).invalidate();
                return;
        }
    }
}
