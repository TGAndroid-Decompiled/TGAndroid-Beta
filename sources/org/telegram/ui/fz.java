package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class fz extends dz {
    public final gz E;

    public fz(gz gzVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, int i10) {
        super(context, f2Var, i7, i10);
        this.E = gzVar;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.f46182e.r0(tL_exportedChatlistInvite);
    }
}
