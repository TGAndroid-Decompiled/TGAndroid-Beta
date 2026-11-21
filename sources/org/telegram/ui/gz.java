package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class gz extends ez {
    public final hz F;

    public gz(hz hzVar, Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, int i10) {
        super(context, g2Var, i7, i10);
        this.F = hzVar;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.F.f48547e.r0(tL_exportedChatlistInvite);
    }
}
