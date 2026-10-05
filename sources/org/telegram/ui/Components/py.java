package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class py extends g61 {
    public static final int f29858a = 0;

    static {
        g61.setup(new g61());
    }

    public static h61 a(TLRPC.StickerSetCovered stickerSetCovered, gy gyVar, boolean z10) {
        h61 K = h61.K(py.class);
        long j3 = stickerSetCovered.set.f20074id;
        long j10 = 1 + j3;
        K.d = (int) (j10 ^ (j10 >>> 32));
        K.B = j3;
        K.G = stickerSetCovered;
        K.H = gyVar;
        K.f27087e = z10;
        return K;
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        nh.c cVar = (nh.c) view;
        Object obj = h61Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((gy) h61Var.H).f27009e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f16913c.d(document, null, null, null, false, false);
        }
        cVar.a(h61Var.f27087e, false);
    }

    @Override
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        if (h61Var.B == h61Var2.B && h61Var.f27087e == h61Var2.f27087e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        nh.c cVar = new nh.c(context, d6Var);
        cVar.setLayoutParams(new s4.p0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        if (h61Var.B == h61Var2.B) {
            return true;
        }
        return false;
    }
}
