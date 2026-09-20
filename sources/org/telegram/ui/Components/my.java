package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class my extends v51 {
    public static final int f26507a = 0;

    static {
        v51.setup(new v51());
    }

    public static w51 a(TLRPC.StickerSetCovered stickerSetCovered, dy dyVar, boolean z10) {
        w51 J = w51.J(my.class);
        long j3 = stickerSetCovered.set.f18355id;
        long j10 = 1 + j3;
        J.d = (int) (j10 ^ (j10 >>> 32));
        J.B = j3;
        J.G = stickerSetCovered;
        J.H = dyVar;
        J.e = z10;
        return J;
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        nh.c cVar = (nh.c) view;
        Object obj = w51Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((dy) w51Var.H).e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f15454c.d(document, null, null, null, false, false);
        }
        cVar.a(w51Var.e, false);
    }

    @Override
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        if (w51Var.B == w51Var2.B && w51Var.e == w51Var2.e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        nh.c cVar = new nh.c(context, f6Var);
        cVar.setLayoutParams(new s4.p0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        if (w51Var.B == w51Var2.B) {
            return true;
        }
        return false;
    }
}
