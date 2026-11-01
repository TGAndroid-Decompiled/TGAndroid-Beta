package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class wx extends a51 {
    public static final int f32331b = 0;

    static {
        a51.h(new a51());
    }

    public static b51 i(TLRPC.StickerSetCovered stickerSetCovered, nx nxVar, boolean z10) {
        b51 K = b51.K(wx.class);
        long j10 = stickerSetCovered.set.f19821id;
        long j11 = 1 + j10;
        K.d = (int) (j11 ^ (j11 >>> 32));
        K.B = j10;
        K.G = stickerSetCovered;
        K.H = nxVar;
        K.e = z10;
        return K;
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        fh.b bVar = (fh.b) view;
        Object obj = b51Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            bVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((nx) b51Var.H).e;
            bVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            bVar.f7100c.d(document, null, null, null, false, false);
        }
        bVar.a(b51Var.e, false);
    }

    @Override
    public final boolean c(b51 b51Var, b51 b51Var2) {
        if (b51Var.B == b51Var2.B && b51Var.e == b51Var2.e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        fh.b bVar = new fh.b(context, p6Var);
        bVar.setLayoutParams(new s4.o0(org.telegram.messenger.i0.L(64.0f), -1));
        return bVar;
    }

    @Override
    public final boolean e(b51 b51Var, b51 b51Var2) {
        if (b51Var.B == b51Var2.B) {
            return true;
        }
        return false;
    }
}
