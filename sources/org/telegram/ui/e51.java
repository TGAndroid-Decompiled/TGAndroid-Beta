package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class e51 implements org.telegram.messenger.x10, org.telegram.messenger.y10 {
    public final StickersActivity f46575a;

    public e51(StickersActivity stickersActivity) {
        this.f46575a = stickersActivity;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.b41 b41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        StickersActivity stickersActivity = this.f46575a;
        if (stickersActivity.f43349x.isEmpty() && (b41Var.G instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.s0((org.telegram.ui.Cells.f8) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        StickersActivity.Z(this.f46575a, (org.telegram.ui.Components.b41) obj, (View) obj2);
    }
}
