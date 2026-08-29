package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class gy extends v41 {
    public static final int f29010a = 0;

    static {
        v41.setup(new v41());
    }

    public static w41 a(TLRPC.StickerSetCovered stickerSetCovered, wx wxVar, boolean z10) {
        w41 J = w41.J(gy.class);
        long j10 = stickerSetCovered.set.f22419id;
        long j11 = 1 + j10;
        J.d = (int) (j11 ^ (j11 >>> 32));
        J.B = j10;
        J.G = stickerSetCovered;
        J.H = wxVar;
        J.f34294e = z10;
        return J;
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        yg.c cVar = (yg.c) view;
        Object obj = w41Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((wx) w41Var.H).f34506e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f50543c.d(document, null, null, null, false, false);
        }
        cVar.a(w41Var.f34294e, false);
    }

    @Override
    public final boolean contentsEquals(w41 w41Var, w41 w41Var2) {
        if (w41Var.B == w41Var2.B && w41Var.f34294e == w41Var2.f34294e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        yg.c cVar = new yg.c(context, c6Var);
        cVar.setLayoutParams(new f2.x0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        if (w41Var.B == w41Var2.B) {
            return true;
        }
        return false;
    }
}
