package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cp implements View.OnClickListener {
    public final int f36467a;
    public final lp f36468b;

    public cp(lp lpVar, int i10) {
        this.f36467a = i10;
        this.f36468b = lpVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f36467a;
        lp lpVar = this.f36468b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                a2Var.R = string;
                if (lpVar.f39801a0) {
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, lpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, lpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new o(16, lpVar, currentChannel));
                lpVar.showDialog(a2Var);
                return;
            case 1:
                if (!lpVar.V) {
                    lpVar.V = true;
                    lpVar.b0();
                    return;
                }
                return;
            case 2:
                if (lpVar.V) {
                    if (!lpVar.f39805c0) {
                        lpVar.Z();
                        return;
                    }
                    lpVar.V = false;
                    lpVar.b0();
                    return;
                }
                return;
            case 3:
                ai0 ai0Var = new ai0(lpVar.Z, 0L, 0);
                ai0Var.g0(lpVar.Y, lpVar.f39816l0);
                lpVar.presentFragment(ai0Var);
                return;
            default:
                boolean z10 = !lpVar.f39803b0;
                lpVar.f39803b0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                return;
        }
    }
}
