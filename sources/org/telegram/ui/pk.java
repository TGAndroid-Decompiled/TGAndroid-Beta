package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class pk extends org.telegram.ui.Components.en0 {
    public final tn E;

    public pk(tn tnVar, Context context, tn tnVar2, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, j10, context, tnVar2, c6Var);
        this.E = tnVar;
    }

    @Override
    public final void b(boolean z10) {
        tn tnVar = this.E;
        tnVar.t7();
        tnVar.r7();
        uk ukVar = tnVar.Xa;
        if (ukVar != null) {
            ukVar.setTranslationY(tnVar.f42969s9 + getCurrentHeight());
        }
        if (z10) {
            tnVar.f43059z9 = true;
            tnVar.jc();
        }
    }

    @Override
    public final boolean f(kg.q0 q0Var) {
        boolean z10;
        int i10;
        boolean z11;
        tn tnVar = this.E;
        tnVar.f42889m3 = q0Var;
        if (q0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        tnVar.f42902n3 = z10;
        if (q0Var == null) {
            tnVar.getMediaDataController().clearFoundMessageObjects();
            tnVar.kb(false);
            tnVar.Fc(0, 0, -1);
        }
        tnVar.Ic();
        tnVar.vc();
        tnVar.f42927p3 = tnVar.f42802f0.getSearchField().getText().toString();
        MediaDataController mediaDataController = tnVar.getMediaDataController();
        String str = tnVar.f42927p3;
        long j10 = tnVar.P5;
        long j11 = tnVar.H6;
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
        long j12 = tnVar.Z3;
        TLRPC.User user = tnVar.f42867k3;
        TLRPC.Chat chat = tnVar.f42878l3;
        if (TextUtils.isEmpty(tnVar.f42927p3) && tnVar.f42889m3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, j12, false, user, chat, z11, tnVar.f42889m3);
        AndroidUtilities.hideKeyboard(tnVar.f42802f0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        tn tnVar = this.E;
        org.telegram.ui.ActionBar.w0 w0Var = tnVar.f42802f0;
        if (w0Var != null && w0Var.s() && a() && tnVar.f42940q3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
