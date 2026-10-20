package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class no implements View.OnClickListener {
    public final int f39658a;
    public final wo f39659b;

    public no(wo woVar, int i10) {
        this.f39658a = i10;
        this.f39659b = woVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f39658a;
        wo woVar = this.f39659b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(woVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
                b2Var.R = string;
                if (woVar.f42907a0) {
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
                    if (!woVar.f42911c0) {
                        woVar.Z();
                        return;
                    }
                    woVar.V = false;
                    woVar.b0();
                    return;
                }
                return;
            case 3:
                ih0 ih0Var = new ih0(woVar.Z, 0L, 0);
                ih0Var.g0(woVar.Y, woVar.f42921l0);
                woVar.presentFragment(ih0Var);
                return;
            default:
                boolean z10 = !woVar.f42909b0;
                woVar.f42909b0 = z10;
                ((org.telegram.ui.Cells.v8) view).setChecked(z10);
                return;
        }
    }
}
