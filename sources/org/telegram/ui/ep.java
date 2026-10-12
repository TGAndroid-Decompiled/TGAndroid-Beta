package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ep implements View.OnClickListener {
    public final int f35650a;
    public final np f35651b;

    public ep(np npVar, int i10) {
        this.f35650a = i10;
        this.f35651b = npVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f35650a;
        np npVar = this.f35651b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(npVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                a2Var.R = string;
                if (npVar.f38753a0) {
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, npVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, npVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.z0(19, npVar, currentChannel));
                npVar.showDialog(a2Var);
                return;
            case 1:
                if (!npVar.V) {
                    npVar.V = true;
                    npVar.b0();
                    return;
                }
                return;
            case 2:
                if (npVar.V) {
                    if (!npVar.f38757c0) {
                        npVar.Z();
                        return;
                    }
                    npVar.V = false;
                    npVar.b0();
                    return;
                }
                return;
            case 3:
                ei0 ei0Var = new ei0(npVar.Z, 0L, 0);
                ei0Var.g0(npVar.Y, npVar.f38767l0);
                npVar.presentFragment(ei0Var);
                return;
            default:
                boolean z10 = !npVar.f38755b0;
                npVar.f38755b0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                return;
        }
    }
}
