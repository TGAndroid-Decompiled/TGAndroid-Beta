package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class g51 implements org.telegram.messenger.u10, org.telegram.messenger.v10 {
    public final StickersActivity f48113a;

    public g51(StickersActivity stickersActivity) {
        this.f48113a = stickersActivity;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.n41 n41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        StickersActivity stickersActivity = this.f48113a;
        if (stickersActivity.f43921x.isEmpty() && (n41Var.H instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.s0((org.telegram.ui.Cells.g8) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        StickersActivity.Z(this.f48113a, (org.telegram.ui.Components.n41) obj, (View) obj2);
    }
}
