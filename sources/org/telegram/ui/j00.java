package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class j00 extends g00 {
    public final k00 A;

    public j00(k00 k00Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i9, int i10) {
        super(context, o2Var, i9, i10);
        this.A = k00Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.A.f39658e.k0(tL_exportedChatlistInvite);
    }
}
