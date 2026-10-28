package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class m00 extends j00 {
    public final n00 E;

    public m00(n00 n00Var, Context context, org.telegram.ui.ActionBar.r2 r2Var, int i10, int i11) {
        super(context, r2Var, i10, i11);
        this.E = n00Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.n0(tL_exportedChatlistInvite);
    }
}
