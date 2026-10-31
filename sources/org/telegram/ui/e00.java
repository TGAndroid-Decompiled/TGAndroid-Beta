package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class e00 extends c00 {
    public final f00 E;

    public e00(f00 f00Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, int i10, int i11) {
        super(context, k2Var, i10, i11);
        this.E = f00Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.q0(tL_exportedChatlistInvite);
    }
}
