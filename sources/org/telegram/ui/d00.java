package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class d00 extends b00 {
    public final e00 E;

    public d00(e00 e00Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, int i10, int i11) {
        super(context, k2Var, i10, i11);
        this.E = e00Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.r0(tL_exportedChatlistInvite);
    }
}
