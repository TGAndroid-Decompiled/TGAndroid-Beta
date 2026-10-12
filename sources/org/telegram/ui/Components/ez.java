package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ez extends t61 {
    public static final int f25827a = 0;

    static {
        t61.setup(new t61());
    }

    public static u61 a(TLRPC.StickerSetCovered stickerSetCovered, vy vyVar, boolean z10) {
        u61 J = u61.J(ez.class);
        long j3 = stickerSetCovered.set.f19830id;
        long j10 = 1 + j3;
        J.d = (int) (j10 ^ (j10 >>> 32));
        J.B = j3;
        J.G = stickerSetCovered;
        J.H = vyVar;
        J.f31065e = z10;
        return J;
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        nh.c cVar = (nh.c) view;
        Object obj = u61Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((vy) u61Var.H).f32197e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f16615c.d(document, null, null, null, false, false);
        }
        cVar.a(u61Var.f31065e, false);
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (u61Var.B == u61Var2.B && u61Var.f31065e == u61Var2.f31065e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        nh.c cVar = new nh.c(context, c6Var);
        cVar.setLayoutParams(new s4.q0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.B == u61Var2.B) {
            return true;
        }
        return false;
    }
}
