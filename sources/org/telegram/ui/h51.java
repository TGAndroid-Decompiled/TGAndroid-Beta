package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class h51 implements org.telegram.messenger.w10, org.telegram.messenger.x10 {
    public final StickersActivity f48244a;

    public h51(StickersActivity stickersActivity) {
        this.f48244a = stickersActivity;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.o41 o41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        StickersActivity stickersActivity = this.f48244a;
        if (stickersActivity.f43840x.isEmpty() && (o41Var.H instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.s0((org.telegram.ui.Cells.h8) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        StickersActivity.Z(this.f48244a, (org.telegram.ui.Components.o41) obj, (View) obj2);
    }
}
