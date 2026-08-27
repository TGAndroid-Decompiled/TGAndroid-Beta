package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

public final class jy extends gw0 {

    public final int f29829v3;

    public final ky f29830w3;

    public jy(ky kyVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, i10, c6Var);
        this.f29830w3 = kyVar;
        this.f29829v3 = i11;
    }

    @Override
    public final boolean A1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final void E1(int i10) {
        iw iwVar;
        uv uvVar;
        super.E1(i10);
        ky kyVar = this.f29830w3;
        yy yyVar = kyVar.C;
        jy jyVar = kyVar.f30218r;
        boolean z10 = jyVar.getSelectedCategory() == null;
        int i11 = yy.K2;
        yyVar.O(z10);
        int i12 = this.f29829v3;
        if (i12 == 1 && (uvVar = yyVar.E) != null) {
            uvVar.n(jyVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (iwVar = yyVar.f35052x0) != null) {
            iwVar.f33456k0 = jyVar.getSelectedCategory() == null;
            iwVar.invalidate();
        }
        kyVar.g(false);
    }
}
