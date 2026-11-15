package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class ak extends org.telegram.ui.Components.ul0 {
    public final an J;

    public ak(an anVar, Context context, an anVar2, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, anVar2, i7, j3, e6Var);
        this.J = anVar;
    }

    @Override
    public final void b(boolean z10) {
        an anVar = this.J;
        anVar.I7();
        anVar.G7();
        hk hkVar = anVar.Ab;
        if (hkVar != null) {
            hkVar.setTranslationY(anVar.S9 + getCurrentHeight());
        }
        if (z10) {
            anVar.Z9 = true;
            anVar.Rc();
        }
    }

    @Override
    public final boolean f(ch.p0 p0Var) {
        boolean z10;
        int i7;
        boolean z11;
        an anVar = this.J;
        anVar.F3 = p0Var;
        if (p0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        anVar.G3 = z10;
        if (p0Var == null) {
            org.telegram.messenger.si mediaDataController = anVar.getMediaDataController();
            mediaDataController.Z0.clear();
            mediaDataController.f26460a1.clear();
            mediaDataController.f26463b1.clear();
            anVar.Qb(false);
            anVar.nd(0, 0, -1);
        }
        anVar.qd();
        anVar.dd();
        anVar.I3 = anVar.f45253k0.getSearchField().getText().toString();
        org.telegram.messenger.si mediaDataController2 = anVar.getMediaDataController();
        String str = anVar.I3;
        long j3 = anVar.f45259k6;
        long j10 = anVar.f45154c7;
        i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
        long j11 = anVar.f45358s4;
        TLRPC.User user = anVar.D3;
        TLRPC.Chat chat = anVar.E3;
        if (TextUtils.isEmpty(anVar.I3) && anVar.F3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController2.X1(str, j3, j10, i7, 0, j11, false, user, chat, z11, anVar.F3);
        org.telegram.messenger.g0.v1(anVar.f45253k0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        an anVar = this.J;
        org.telegram.ui.ActionBar.q0 q0Var = anVar.f45253k0;
        if (q0Var != null && q0Var.w() && a() && anVar.J3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
