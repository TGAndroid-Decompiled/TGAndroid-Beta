package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ty extends u51 {
    public static final int f27510a = 0;

    static {
        u51.setup(new u51());
    }

    public static v51 a(TLRPC.StickerSetCovered stickerSetCovered, jy jyVar, boolean z10) {
        v51 J = v51.J(ty.class);
        long j3 = stickerSetCovered.set.f17222id;
        long j10 = 1 + j3;
        J.d = (int) (j10 ^ (j10 >>> 32));
        J.B = j3;
        J.G = stickerSetCovered;
        J.H = jyVar;
        J.e = z10;
        return J;
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        mh.c cVar = (mh.c) view;
        Object obj = v51Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((jy) v51Var.H).e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f13664c.d(document, null, null, null, false, false);
        }
        cVar.a(v51Var.e, false);
    }

    @Override
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        if (v51Var.B == v51Var2.B && v51Var.e == v51Var2.e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        mh.c cVar = new mh.c(context, f6Var);
        cVar.setLayoutParams(new s4.p0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        if (v51Var.B == v51Var2.B) {
            return true;
        }
        return false;
    }
}
