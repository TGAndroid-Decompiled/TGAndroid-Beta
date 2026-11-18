package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class bk extends org.telegram.ui.Components.cm0 {
    public final bn J;

    public bk(bn bnVar, Context context, bn bnVar2, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, bnVar2, i7, j3, i6Var);
        this.J = bnVar;
    }

    @Override
    public final void b(boolean z10) {
        bn bnVar = this.J;
        bnVar.I7();
        bnVar.G7();
        ik ikVar = bnVar.Bb;
        if (ikVar != null) {
            ikVar.setTranslationY(bnVar.T9 + getCurrentHeight());
        }
        if (z10) {
            bnVar.f45933aa = true;
            bnVar.Rc();
        }
    }

    @Override
    public final boolean f(ch.p0 p0Var) {
        boolean z10;
        int i7;
        boolean z11;
        bn bnVar = this.J;
        bnVar.F3 = p0Var;
        if (p0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        bnVar.G3 = z10;
        if (p0Var == null) {
            org.telegram.messenger.ri mediaDataController = bnVar.getMediaDataController();
            mediaDataController.Z0.clear();
            mediaDataController.f26598a1.clear();
            mediaDataController.f26601b1.clear();
            bnVar.Qb(false);
            bnVar.nd(0, 0, -1);
        }
        bnVar.qd();
        bnVar.dd();
        bnVar.I3 = bnVar.f46058k0.getSearchField().getText().toString();
        org.telegram.messenger.ri mediaDataController2 = bnVar.getMediaDataController();
        String str = bnVar.I3;
        long j3 = bnVar.f46076l6;
        long j10 = bnVar.f45972d7;
        i7 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
        long j11 = bnVar.f46164s4;
        TLRPC.User user = bnVar.D3;
        TLRPC.Chat chat = bnVar.E3;
        if (TextUtils.isEmpty(bnVar.I3) && bnVar.F3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController2.c2(str, j3, j10, i7, 0, j11, false, user, chat, z11, bnVar.F3);
        org.telegram.messenger.g0.v1(bnVar.f46058k0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        bn bnVar = this.J;
        org.telegram.ui.ActionBar.r0 r0Var = bnVar.f46058k0;
        if (r0Var != null && r0Var.w() && a() && bnVar.J3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
