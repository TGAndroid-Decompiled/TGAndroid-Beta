package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class dl extends org.telegram.ui.Components.to0 {
    public final eo I;

    public dl(eo eoVar, Context context, eo eoVar2, int i10, long j3, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, j3, context, eoVar2, c6Var);
        this.I = eoVar;
    }

    @Override
    public final void b(boolean z10) {
        eo eoVar = this.I;
        eoVar.w7();
        eoVar.u7();
        il ilVar = eoVar.f37213bb;
        if (ilVar != null) {
            ilVar.setTranslationY(eoVar.f37473w9 + getCurrentHeight());
        }
        if (z10) {
            eoVar.D9 = true;
            eoVar.nc();
        }
    }

    @Override
    public final boolean f(zg.n0 n0Var) {
        boolean z10;
        int i10;
        boolean z11;
        eo eoVar = this.I;
        eoVar.f37389q3 = n0Var;
        if (n0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        eoVar.f37402r3 = z10;
        if (n0Var == null) {
            eoVar.getMediaDataController().clearFoundMessageObjects();
            eoVar.ob(false);
            eoVar.Jc(0, 0, -1);
        }
        eoVar.Mc();
        eoVar.zc();
        eoVar.f37429t3 = eoVar.f37302j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = eoVar.getMediaDataController();
        String str = eoVar.f37429t3;
        long j3 = eoVar.T5;
        long j10 = eoVar.L6;
        i10 = ((org.telegram.ui.ActionBar.m2) eoVar).classGuid;
        long j11 = eoVar.f37232d4;
        TLRPC.User user = eoVar.f37365o3;
        TLRPC.Chat chat = eoVar.f37377p3;
        if (TextUtils.isEmpty(eoVar.f37429t3) && eoVar.f37389q3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController.searchMessagesInChat(str, j3, j10, i10, 0, j11, false, user, chat, z11, eoVar.f37389q3);
        AndroidUtilities.hideKeyboard(eoVar.f37302j0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        eo eoVar = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = eoVar.f37302j0;
        if (u0Var != null && u0Var.s() && a() && eoVar.f37441u3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
