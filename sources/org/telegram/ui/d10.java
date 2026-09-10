package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class d10 extends a10 {
    public final e10 E;

    public d10(e10 e10Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, int i11) {
        super(context, p2Var, i10, i11);
        this.E = e10Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.l0(tL_exportedChatlistInvite);
    }
}
