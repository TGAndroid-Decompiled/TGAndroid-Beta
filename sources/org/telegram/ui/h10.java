package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class h10 extends e10 {
    public final i10 E;

    public h10(i10 i10Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, int i11) {
        super(context, m2Var, i10, i11);
        this.E = i10Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.l0(tL_exportedChatlistInvite);
    }
}
