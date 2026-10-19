package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class no implements View.OnClickListener {
    public final int f39653a;
    public final wo f39654b;

    public no(wo woVar, int i10) {
        this.f39653a = i10;
        this.f39654b = woVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f39653a;
        wo woVar = this.f39654b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(woVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                b2Var.R = string;
                if (woVar.f42902a0) {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, woVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, woVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.w0(20, woVar, currentChannel));
                woVar.showDialog(b2Var);
                return;
            case 1:
                if (!woVar.V) {
                    woVar.V = true;
                    woVar.b0();
                    return;
                }
                return;
            case 2:
                if (woVar.V) {
                    if (!woVar.f42906c0) {
                        woVar.Z();
                        return;
                    }
                    woVar.V = false;
                    woVar.b0();
                    return;
                }
                return;
            case 3:
                hh0 hh0Var = new hh0(woVar.Z, 0L, 0);
                hh0Var.g0(woVar.Y, woVar.f42916l0);
                woVar.presentFragment(hh0Var);
                return;
            default:
                boolean z10 = !woVar.f42904b0;
                woVar.f42904b0 = z10;
                ((org.telegram.ui.Cells.v8) view).setChecked(z10);
                return;
        }
    }
}
