package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class py extends f61 {
    public static final int f29831a = 0;

    static {
        f61.setup(new f61());
    }

    public static g61 a(TLRPC.StickerSetCovered stickerSetCovered, gy gyVar, boolean z10) {
        g61 J = g61.J(py.class);
        long j3 = stickerSetCovered.set.f20069id;
        long j10 = 1 + j3;
        J.d = (int) (j10 ^ (j10 >>> 32));
        J.B = j3;
        J.G = stickerSetCovered;
        J.H = gyVar;
        J.f26668e = z10;
        return J;
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        nh.c cVar = (nh.c) view;
        Object obj = g61Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((gy) g61Var.H).f26953e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f16908c.d(document, null, null, null, false, false);
        }
        cVar.a(g61Var.f26668e, false);
    }

    @Override
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        if (g61Var.B == g61Var2.B && g61Var.f26668e == g61Var2.f26668e) {
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
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        if (g61Var.B == g61Var2.B) {
            return true;
        }
        return false;
    }
}
