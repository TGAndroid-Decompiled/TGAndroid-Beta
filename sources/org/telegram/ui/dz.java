package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class dz extends bz {
    public final ez F;

    public dz(ez ezVar, Context context, org.telegram.ui.ActionBar.e2 e2Var, int i7, int i10) {
        super(context, e2Var, i7, i10);
        this.F = ezVar;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.F.f46942e.r0(tL_exportedChatlistInvite);
    }
}
