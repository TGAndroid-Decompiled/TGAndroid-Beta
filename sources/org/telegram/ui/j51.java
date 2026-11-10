package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class j51 implements org.telegram.messenger.a20, org.telegram.messenger.b20 {
    public final StickersActivity f46825a;

    public j51(StickersActivity stickersActivity) {
        this.f46825a = stickersActivity;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.x31 x31Var, View view, Integer num, Float f10, Float f11) {
        boolean z9;
        StickersActivity stickersActivity = this.f46825a;
        if (stickersActivity.f41975x.isEmpty() && (x31Var.G instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.s0((org.telegram.ui.Cells.g8) view);
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        StickersActivity.Z(this.f46825a, (org.telegram.ui.Components.x31) obj, (View) obj2);
    }
}
