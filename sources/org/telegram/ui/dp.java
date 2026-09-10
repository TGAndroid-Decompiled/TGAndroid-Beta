package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dp implements View.OnClickListener {
    public final int f31953a;
    public final mp f31954b;

    public dp(mp mpVar, int i10) {
        this.f31953a = i10;
        this.f31954b = mpVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f31953a;
        mp mpVar = this.f31954b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.R = string;
                if (mpVar.f35016a0) {
                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, mpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, mpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new oe(9, mpVar, currentChannel));
                mpVar.showDialog(d2Var);
                return;
            case 1:
                if (!mpVar.V) {
                    mpVar.V = true;
                    mpVar.b0();
                    return;
                }
                return;
            case 2:
                if (mpVar.V) {
                    if (!mpVar.f35020c0) {
                        mpVar.Z();
                        return;
                    }
                    mpVar.V = false;
                    mpVar.b0();
                    return;
                }
                return;
            case 3:
                zh0 zh0Var = new zh0(mpVar.Z, 0L, 0);
                zh0Var.g0(mpVar.Y, mpVar.f35030l0);
                mpVar.presentFragment(zh0Var);
                return;
            default:
                boolean z10 = !mpVar.f35018b0;
                mpVar.f35018b0 = z10;
                ((org.telegram.ui.Cells.x8) view).setChecked(z10);
                return;
        }
    }
}
