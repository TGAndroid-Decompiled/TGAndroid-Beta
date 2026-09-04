package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class b10 extends y00 {
    public final c10 E;

    public b10(c10 c10Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, int i11) {
        super(context, n2Var, i10, i11);
        this.E = c10Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.f34972e.l0(tL_exportedChatlistInvite);
    }
}
