package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

public final class ni extends k51 {

    public final ri f30975b3;

    public ni(ri riVar, Context context, int i10, d dVar, ki kiVar, ki kiVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, 0, false, dVar, kiVar, kiVar2, c6Var);
        this.f30975b3 = riVar;
    }

    @Override
    public final void C1() {
        ri riVar = this.f30975b3;
        riVar.f34900b.X1(riVar, 0);
    }

    @Override
    public final boolean E0(float f10) {
        gi giVar = this.f30975b3.f34900b;
        return f10 >= ((float) ((AndroidUtilities.dp(30.0f) + giVar.X1[0]) + (!giVar.f28639c0 ? AndroidUtilities.statusBarHeight : 0)));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ri riVar = this.f30975b3;
        riVar.f34900b.X1(riVar, 0);
    }
}
