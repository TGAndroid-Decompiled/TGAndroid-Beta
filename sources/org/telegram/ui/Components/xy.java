package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class xy extends l61 {
    public static final int f31086a = 0;

    static {
        l61.setup(new l61());
    }

    public static m61 a(TLRPC.StickerSetCovered stickerSetCovered, oy oyVar, boolean z10) {
        m61 J = m61.J(xy.class);
        long j10 = stickerSetCovered.set.f18943id;
        long j11 = 1 + j10;
        J.d = (int) (j11 ^ (j11 >>> 32));
        J.B = j10;
        J.G = stickerSetCovered;
        J.H = oyVar;
        J.e = z10;
        return J;
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        oh.c cVar = (oh.c) view;
        Object obj = m61Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((oy) m61Var.H).e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f16350c.d(document, null, null, null, false, false);
        }
        cVar.a(m61Var.e, false);
    }

    @Override
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        if (m61Var.B == m61Var2.B && m61Var.e == m61Var2.e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        oh.c cVar = new oh.c(context, c6Var);
        cVar.setLayoutParams(new s4.o0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        if (m61Var.B == m61Var2.B) {
            return true;
        }
        return false;
    }
}
