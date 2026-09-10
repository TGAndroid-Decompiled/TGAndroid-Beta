package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class al extends org.telegram.ui.Components.rn0 {
    public final eo I;

    public al(eo eoVar, Context context, eo eoVar2, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, j3, context, eoVar2, f6Var);
        this.I = eoVar;
    }

    @Override
    public final void b(boolean z10) {
        eo eoVar = this.I;
        eoVar.t7();
        eoVar.r7();
        fl flVar = eoVar.f32279bb;
        if (flVar != null) {
            flVar.setTranslationY(eoVar.f32538w9 + getCurrentHeight());
        }
        if (z10) {
            eoVar.D9 = true;
            eoVar.jc();
        }
    }

    @Override
    public final boolean f(yg.p0 p0Var) {
        boolean z10;
        int i10;
        boolean z11;
        eo eoVar = this.I;
        eoVar.f32454q3 = p0Var;
        if (p0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        eoVar.f32467r3 = z10;
        if (p0Var == null) {
            eoVar.getMediaDataController().clearFoundMessageObjects();
            eoVar.kb(false);
            eoVar.Fc(0, 0, -1);
        }
        eoVar.Ic();
        eoVar.vc();
        eoVar.f32494t3 = eoVar.f32367j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = eoVar.getMediaDataController();
        String str = eoVar.f32494t3;
        long j3 = eoVar.T5;
        long j10 = eoVar.L6;
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
        long j11 = eoVar.f32298d4;
        TLRPC.User user = eoVar.f32430o3;
        TLRPC.Chat chat = eoVar.f32442p3;
        if (TextUtils.isEmpty(eoVar.f32494t3) && eoVar.f32454q3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController.searchMessagesInChat(str, j3, j10, i10, 0, j11, false, user, chat, z11, eoVar.f32454q3);
        AndroidUtilities.hideKeyboard(eoVar.f32367j0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        eo eoVar = this.I;
        org.telegram.ui.ActionBar.w0 w0Var = eoVar.f32367j0;
        if (w0Var != null && w0Var.s() && a() && eoVar.f32506u3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
