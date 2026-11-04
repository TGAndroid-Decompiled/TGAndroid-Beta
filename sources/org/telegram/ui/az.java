package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class az extends yy {
    public final bz F;

    public az(bz bzVar, Context context, org.telegram.ui.ActionBar.d2 d2Var, int i3, int i10) {
        super(context, d2Var, i3, i10);
        this.F = bzVar;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.F.f44167e.r0(tL_exportedChatlistInvite);
    }
}
