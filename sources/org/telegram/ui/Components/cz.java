package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class cz extends p61 {
    public static final int f25491a = 0;

    static {
        p61.setup(new p61());
    }

    public static q61 a(TLRPC.StickerSetCovered stickerSetCovered, ty tyVar, boolean z10) {
        q61 J = q61.J(cz.class);
        long j3 = stickerSetCovered.set.f20069id;
        long j10 = 1 + j3;
        J.d = (int) (j10 ^ (j10 >>> 32));
        J.B = j3;
        J.G = stickerSetCovered;
        J.H = tyVar;
        J.f30057e = z10;
        return J;
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        nh.c cVar = (nh.c) view;
        Object obj = q61Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((ty) q61Var.H).f31277e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f16866c.d(document, null, null, null, false, false);
        }
        cVar.a(q61Var.f30057e, false);
    }

    @Override
    public final boolean contentsEquals(q61 q61Var, q61 q61Var2) {
        if (q61Var.B == q61Var2.B && q61Var.f30057e == q61Var2.f30057e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        nh.c cVar = new nh.c(context, e6Var);
        cVar.setLayoutParams(new s4.q0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override
    public final boolean equals(q61 q61Var, q61 q61Var2) {
        if (q61Var.B == q61Var2.B) {
            return true;
        }
        return false;
    }
}
