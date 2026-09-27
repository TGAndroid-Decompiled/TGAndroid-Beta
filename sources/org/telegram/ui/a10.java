package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class a10 extends x00 {
    public final b10 E;

    public a10(b10 b10Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, int i11) {
        super(context, o2Var, i10, i11);
        this.E = b10Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.l0(tL_exportedChatlistInvite);
    }
}
