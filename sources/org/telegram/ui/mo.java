package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mo implements View.OnClickListener {
    public final int f40496a;
    public final vo f40497b;

    public mo(vo voVar, int i9) {
        this.f40496a = i9;
        this.f40497b = voVar;
    }

    @Override
    public final void onClick(View view) {
        int i9 = this.f40496a;
        vo voVar = this.f40497b;
        switch (i9) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(voVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.N = string;
                if (voVar.W) {
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, voVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, voVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ih.v3(23, voVar, currentChannel));
                voVar.showDialog(c2Var);
                return;
            case 1:
                if (!voVar.R) {
                    voVar.R = true;
                    voVar.a0();
                    return;
                }
                return;
            case 2:
                if (voVar.R) {
                    if (!voVar.Y) {
                        voVar.Y();
                        return;
                    }
                    voVar.R = false;
                    voVar.a0();
                    return;
                }
                return;
            case 3:
                hh0 hh0Var = new hh0(voVar.V, 0L, 0);
                hh0Var.f0(voVar.U, voVar.f43536h0);
                voVar.presentFragment(hh0Var);
                return;
            default:
                boolean z10 = !voVar.X;
                voVar.X = z10;
                ((org.telegram.ui.Cells.t8) view).setChecked(z10);
                return;
        }
    }
}
