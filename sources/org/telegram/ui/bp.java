package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bp implements View.OnClickListener {
    public final int f32547a;
    public final kp f32548b;

    public bp(kp kpVar, int i10) {
        this.f32547a = i10;
        this.f32548b = kpVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f32547a;
        kp kpVar = this.f32548b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                c2Var.R = string;
                if (kpVar.f35323a0) {
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, kpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, kpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new x5(13, kpVar, currentChannel));
                kpVar.showDialog(c2Var);
                return;
            case 1:
                if (!kpVar.V) {
                    kpVar.V = true;
                    kpVar.b0();
                    return;
                }
                return;
            case 2:
                if (kpVar.V) {
                    if (!kpVar.f35327c0) {
                        kpVar.Z();
                        return;
                    }
                    kpVar.V = false;
                    kpVar.b0();
                    return;
                }
                return;
            case 3:
                ai0 ai0Var = new ai0(kpVar.Z, 0L, 0);
                ai0Var.g0(kpVar.Y, kpVar.f35337l0);
                kpVar.presentFragment(ai0Var);
                return;
            default:
                boolean z10 = !kpVar.f35325b0;
                kpVar.f35325b0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                return;
        }
    }
}
