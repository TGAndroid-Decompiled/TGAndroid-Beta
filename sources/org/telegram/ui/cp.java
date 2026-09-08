package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cp implements View.OnClickListener {
    public final int f35539a;
    public final lp f35540b;

    public cp(lp lpVar, int i10) {
        this.f35539a = i10;
        this.f35540b = lpVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f35539a;
        lp lpVar = this.f35540b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                b2Var.R = string;
                if (lpVar.f38451a0) {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, lpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, lpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4(14, lpVar, currentChannel));
                lpVar.showDialog(b2Var);
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
                    if (!lpVar.f38455c0) {
                        lpVar.Z();
                        return;
                    }
                    lpVar.V = false;
                    lpVar.b0();
                    return;
                }
                return;
            case 3:
                yh0 yh0Var = new yh0(lpVar.Z, 0L, 0);
                yh0Var.g0(lpVar.Y, lpVar.f38466l0);
                lpVar.presentFragment(yh0Var);
                return;
            default:
                boolean z10 = !lpVar.f38453b0;
                lpVar.f38453b0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                return;
        }
    }
}
