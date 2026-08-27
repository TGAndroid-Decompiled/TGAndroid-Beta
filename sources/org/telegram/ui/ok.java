package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

public final class ok extends org.telegram.ui.Components.um0 {
    public final rn E;

    public ok(rn rnVar, Context context, rn rnVar2, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, j10, context, rnVar2, c6Var);
        this.E = rnVar;
    }

    @Override
    public final void b(boolean z10) {
        rn rnVar = this.E;
        rnVar.t7();
        rnVar.r7();
        tk tkVar = rnVar.Xa;
        if (tkVar != null) {
            tkVar.setTranslationY(rnVar.f42209s9 + getCurrentHeight());
        }
        if (z10) {
            rnVar.f42299z9 = true;
            rnVar.jc();
        }
    }

    @Override
    public final boolean f(ig.q0 q0Var) {
        rn rnVar = this.E;
        rnVar.f42128m3 = q0Var;
        rnVar.f42142n3 = q0Var != null;
        if (q0Var == null) {
            rnVar.getMediaDataController().clearFoundMessageObjects();
            rnVar.kb(false);
            rnVar.Fc(0, 0, -1);
        }
        rnVar.Ic();
        rnVar.vc();
        rnVar.f42167p3 = rnVar.f42040f0.getSearchField().getText().toString();
        rnVar.getMediaDataController().searchMessagesInChat(rnVar.f42167p3, rnVar.P5, rnVar.H6, ((org.telegram.ui.ActionBar.n2) rnVar).classGuid, 0, rnVar.Z3, false, rnVar.f42106k3, rnVar.f42117l3, (TextUtils.isEmpty(rnVar.f42167p3) && rnVar.f42128m3 == null) ? false : true, rnVar.f42128m3);
        AndroidUtilities.hideKeyboard(rnVar.f42040f0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        super.h(z10);
        rn rnVar = this.E;
        org.telegram.ui.ActionBar.v0 v0Var = rnVar.f42040f0;
        g(v0Var != null && v0Var.s() && a() && rnVar.f42177q3 == null);
    }
}
