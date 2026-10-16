package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class dl extends org.telegram.ui.Components.ko0 {
    public final fo I;

    public dl(fo foVar, Context context, fo foVar2, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, j10, context, foVar2, c6Var);
        this.I = foVar;
    }

    @Override
    public final void b(boolean z10) {
        fo foVar = this.I;
        foVar.w7();
        foVar.u7();
        il ilVar = foVar.f35596bb;
        if (ilVar != null) {
            ilVar.setTranslationY(foVar.w9 + getCurrentHeight());
        }
        if (z10) {
            foVar.D9 = true;
            foVar.nc();
        }
    }

    @Override
    public final boolean f(ah.i1 i1Var) {
        boolean z10;
        int i10;
        boolean z11;
        fo foVar = this.I;
        foVar.f35772q3 = i1Var;
        if (i1Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        foVar.f35785r3 = z10;
        if (i1Var == null) {
            foVar.getMediaDataController().clearFoundMessageObjects();
            foVar.ob(false);
            foVar.Jc(0, 0, -1);
        }
        foVar.Mc();
        foVar.zc();
        foVar.f35812t3 = foVar.f35684j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = foVar.getMediaDataController();
        String str = foVar.f35812t3;
        long j10 = foVar.T5;
        long j11 = foVar.L6;
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
        long j12 = foVar.f35616d4;
        TLRPC.User user = foVar.f35750o3;
        TLRPC.Chat chat = foVar.f35761p3;
        if (TextUtils.isEmpty(foVar.f35812t3) && foVar.f35772q3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, j12, false, user, chat, z11, foVar.f35772q3);
        AndroidUtilities.hideKeyboard(foVar.f35684j0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        fo foVar = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = foVar.f35684j0;
        if (u0Var != null && u0Var.s() && a() && foVar.f35825u3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
