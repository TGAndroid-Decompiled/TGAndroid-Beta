package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class i51 implements org.telegram.messenger.a20, org.telegram.messenger.b20 {
    public final StickersActivity f46472a;

    public i51(StickersActivity stickersActivity) {
        this.f46472a = stickersActivity;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.y31 y31Var, View view, Integer num, Float f10, Float f11) {
        boolean z9;
        StickersActivity stickersActivity = this.f46472a;
        if (stickersActivity.f41984x.isEmpty() && (y31Var.G instanceof TLRPC.TL_messages_stickerSet)) {
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
        StickersActivity.Z(this.f46472a, (org.telegram.ui.Components.y31) obj, (View) obj2);
    }
}
