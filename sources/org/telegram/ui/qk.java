package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class qk extends org.telegram.ui.Components.go0 {
    public final qn I;

    public qk(qn qnVar, Context context, qn qnVar2, int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, j10, context, qnVar2, d6Var);
        this.I = qnVar;
    }

    @Override
    public final void b(boolean z10) {
        qn qnVar = this.I;
        qnVar.w7();
        qnVar.u7();
        vk vkVar = qnVar.f40636bb;
        if (vkVar != null) {
            vkVar.setTranslationY(qnVar.w9 + getCurrentHeight());
        }
        if (z10) {
            qnVar.D9 = true;
            qnVar.oc();
        }
    }

    @Override
    public final boolean f(ah.i1 i1Var) {
        boolean z10;
        int i10;
        boolean z11;
        qn qnVar = this.I;
        qnVar.f40812q3 = i1Var;
        if (i1Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        qnVar.f40825r3 = z10;
        if (i1Var == null) {
            qnVar.getMediaDataController().clearFoundMessageObjects();
            qnVar.pb(false);
            qnVar.Kc(0, 0, -1);
        }
        qnVar.Nc();
        qnVar.Ac();
        qnVar.f40852t3 = qnVar.f40724j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = qnVar.getMediaDataController();
        String str = qnVar.f40852t3;
        long j10 = qnVar.T5;
        long j11 = qnVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
        long j12 = qnVar.f40656d4;
        TLRPC.User user = qnVar.f40790o3;
        TLRPC.Chat chat = qnVar.f40801p3;
        if (TextUtils.isEmpty(qnVar.f40852t3) && qnVar.f40812q3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, j12, false, user, chat, z11, qnVar.f40812q3);
        AndroidUtilities.hideKeyboard(qnVar.f40724j0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        qn qnVar = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = qnVar.f40724j0;
        if (u0Var != null && u0Var.s() && a() && qnVar.f40865u3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
