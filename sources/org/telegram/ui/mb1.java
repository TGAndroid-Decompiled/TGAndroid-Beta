package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class mb1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final StickersActivity f37962a;

    public mb1(StickersActivity stickersActivity) {
        this.f37962a = stickersActivity;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        StickersActivity.U(this.f37962a, (org.telegram.ui.Components.m61) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        org.telegram.ui.Components.m61 m61Var = (org.telegram.ui.Components.m61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        StickersActivity stickersActivity = this.f37962a;
        if (stickersActivity.f32509x.isEmpty() && (m61Var.G instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.n0((org.telegram.ui.Cells.m8) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
