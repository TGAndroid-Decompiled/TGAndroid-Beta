package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class fz extends dz {
    public final gz F;

    public fz(gz gzVar, Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, int i10) {
        super(context, g2Var, i7, i10);
        this.F = gzVar;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.F.f48380e.r0(tL_exportedChatlistInvite);
    }
}
