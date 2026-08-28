package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class mk extends org.telegram.ui.Components.sm0 {
    public final qn E;

    public mk(qn qnVar, Context context, qn qnVar2, int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(i9, j10, context, qnVar2, b6Var);
        this.E = qnVar;
    }

    @Override
    public final void b(boolean z10) {
        qn qnVar = this.E;
        qnVar.t7();
        qnVar.r7();
        rk rkVar = qnVar.Xa;
        if (rkVar != null) {
            rkVar.setTranslationY(qnVar.f42073s9 + getCurrentHeight());
        }
        if (z10) {
            qnVar.f42162z9 = true;
            qnVar.jc();
        }
    }

    @Override
    public final boolean f(hg.r0 r0Var) {
        boolean z10;
        int i9;
        boolean z11;
        qn qnVar = this.E;
        qnVar.f41992m3 = r0Var;
        if (r0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        qnVar.f42005n3 = z10;
        if (r0Var == null) {
            qnVar.getMediaDataController().clearFoundMessageObjects();
            qnVar.kb(false);
            qnVar.Fc(0, 0, -1);
        }
        qnVar.Ic();
        qnVar.vc();
        qnVar.f42028p3 = qnVar.f41904f0.getSearchField().getText().toString();
        MediaDataController mediaDataController = qnVar.getMediaDataController();
        String str = qnVar.f42028p3;
        long j10 = qnVar.P5;
        long j11 = qnVar.H6;
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
        long j12 = qnVar.Z3;
        TLRPC.User user = qnVar.f41969k3;
        TLRPC.Chat chat = qnVar.f41980l3;
        if (TextUtils.isEmpty(qnVar.f42028p3) && qnVar.f41992m3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController.searchMessagesInChat(str, j10, j11, i9, 0, j12, false, user, chat, z11, qnVar.f41992m3);
        AndroidUtilities.hideKeyboard(qnVar.f41904f0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        qn qnVar = this.E;
        org.telegram.ui.ActionBar.w0 w0Var = qnVar.f41904f0;
        if (w0Var != null && w0Var.s() && a() && qnVar.f42039q3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
