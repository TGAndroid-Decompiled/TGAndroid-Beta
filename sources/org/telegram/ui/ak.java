package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class ak extends org.telegram.ui.Components.ql0 {
    public final an I;

    public ak(an anVar, Context context, an anVar2, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, anVar2, i7, j3, f6Var);
        this.I = anVar;
    }

    @Override
    public final void b(boolean z9) {
        an anVar = this.I;
        anVar.H7();
        anVar.F7();
        hk hkVar = anVar.f44029xb;
        if (hkVar != null) {
            hkVar.setTranslationY(anVar.P9 + getCurrentHeight());
        }
        if (z9) {
            anVar.W9 = true;
            anVar.Nc();
        }
    }

    @Override
    public final boolean f(ch.o0 o0Var) {
        boolean z9;
        int i7;
        boolean z10;
        an anVar = this.I;
        anVar.E3 = o0Var;
        if (o0Var != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        anVar.F3 = z9;
        if (o0Var == null) {
            org.telegram.messenger.ui mediaDataController = anVar.getMediaDataController();
            mediaDataController.Y0.clear();
            mediaDataController.Z0.clear();
            mediaDataController.f25801a1.clear();
            anVar.Mb(false);
            anVar.jd(0, 0, -1);
        }
        anVar.md();
        anVar.Zc();
        anVar.H3 = anVar.f43843j0.getSearchField().getText().toString();
        org.telegram.messenger.ui mediaDataController2 = anVar.getMediaDataController();
        String str = anVar.H3;
        long j3 = anVar.f43848j6;
        long j10 = anVar.f43744b7;
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
        long j11 = anVar.f43945r4;
        TLRPC.User user = anVar.C3;
        TLRPC.Chat chat = anVar.D3;
        if (TextUtils.isEmpty(anVar.H3) && anVar.E3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        mediaDataController2.X1(str, j3, j10, i7, 0, j11, false, user, chat, z10, anVar.E3);
        org.telegram.messenger.g0.v1(anVar.f43843j0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z9) {
        boolean z10;
        super.h(z9);
        an anVar = this.I;
        org.telegram.ui.ActionBar.r0 r0Var = anVar.f43843j0;
        if (r0Var != null && r0Var.v() && a() && anVar.I3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g(z10);
    }
}
