package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class l00 extends i00 {
    public final m00 E;

    public l00(m00 m00Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, int i11) {
        super(context, n2Var, i10, i11);
        this.E = m00Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.l0(tL_exportedChatlistInvite);
    }
}
