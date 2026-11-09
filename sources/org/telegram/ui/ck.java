package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class ck extends org.telegram.ui.Components.rl0 {
    public final cn I;

    public ck(cn cnVar, Context context, cn cnVar2, int i7, long j3, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, cnVar2, i7, j3, g6Var);
        this.I = cnVar;
    }

    @Override
    public final void b(boolean z9) {
        cn cnVar = this.I;
        cnVar.I7();
        cnVar.G7();
        jk jkVar = cnVar.f44710zb;
        if (jkVar != null) {
            jkVar.setTranslationY(cnVar.R9 + getCurrentHeight());
        }
        if (z9) {
            cnVar.Y9 = true;
            cnVar.Qc();
        }
    }

    @Override
    public final boolean f(ch.o0 o0Var) {
        boolean z9;
        int i7;
        boolean z10;
        cn cnVar = this.I;
        cnVar.E3 = o0Var;
        if (o0Var != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        cnVar.F3 = z9;
        if (o0Var == null) {
            org.telegram.messenger.ui mediaDataController = cnVar.getMediaDataController();
            mediaDataController.Y0.clear();
            mediaDataController.Z0.clear();
            mediaDataController.f25801a1.clear();
            cnVar.Pb(false);
            cnVar.md(0, 0, -1);
        }
        cnVar.pd();
        cnVar.cd();
        cnVar.H3 = cnVar.f44499j0.getSearchField().getText().toString();
        org.telegram.messenger.ui mediaDataController2 = cnVar.getMediaDataController();
        String str = cnVar.H3;
        long j3 = cnVar.f44504j6;
        long j10 = cnVar.f44399b7;
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
        long j11 = cnVar.f44602r4;
        TLRPC.User user = cnVar.C3;
        TLRPC.Chat chat = cnVar.D3;
        if (TextUtils.isEmpty(cnVar.H3) && cnVar.E3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        mediaDataController2.X1(str, j3, j10, i7, 0, j11, false, user, chat, z10, cnVar.E3);
        org.telegram.messenger.g0.v1(cnVar.f44499j0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z9) {
        boolean z10;
        super.h(z9);
        cn cnVar = this.I;
        org.telegram.ui.ActionBar.r0 r0Var = cnVar.f44499j0;
        if (r0Var != null && r0Var.v() && a() && cnVar.I3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g(z10);
    }
}
