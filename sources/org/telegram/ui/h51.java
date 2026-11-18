package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class h51 implements org.telegram.messenger.v10, org.telegram.messenger.w10 {
    public final StickersActivity f48165a;

    public h51(StickersActivity stickersActivity) {
        this.f48165a = stickersActivity;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.l41 l41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        StickersActivity stickersActivity = this.f48165a;
        if (stickersActivity.f43795x.isEmpty() && (l41Var.H instanceof TLRPC.TL_messages_stickerSet)) {
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
        StickersActivity.Z(this.f48165a, (org.telegram.ui.Components.l41) obj, (View) obj2);
    }
}
