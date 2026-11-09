package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class ez extends cz {
    public final fz E;

    public ez(fz fzVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, int i10) {
        super(context, f2Var, i7, i10);
        this.E = fzVar;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.f45815e.r0(tL_exportedChatlistInvite);
    }
}
