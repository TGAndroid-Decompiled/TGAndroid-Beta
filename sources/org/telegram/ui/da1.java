package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class da1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final StickersActivity f38567a;

    public da1(StickersActivity stickersActivity) {
        this.f38567a = stickersActivity;
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        StickersActivity.V(this.f38567a, (org.telegram.ui.Components.u61) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        StickersActivity stickersActivity = this.f38567a;
        if (stickersActivity.f36254w.isEmpty() && (u61Var.G instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.o0((org.telegram.ui.Cells.p8) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
