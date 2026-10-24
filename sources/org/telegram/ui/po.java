package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class po implements View.OnClickListener {
    public final int f40602a;
    public final yo f40603b;

    public po(yo yoVar, int i10) {
        this.f40602a = i10;
        this.f40603b = yoVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f40602a;
        yo yoVar = this.f40603b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yoVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                c2Var.R = string;
                if (yoVar.f43902b0) {
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, yoVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, yoVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.w0(20, yoVar, currentChannel));
                yoVar.showDialog(c2Var);
                return;
            case 1:
                if (!yoVar.W) {
                    yoVar.W = true;
                    yoVar.c0();
                    return;
                }
                return;
            case 2:
                if (yoVar.W) {
                    if (!yoVar.f43905d0) {
                        yoVar.a0();
                        return;
                    }
                    yoVar.W = false;
                    yoVar.c0();
                    return;
                }
                return;
            case 3:
                lh0 lh0Var = new lh0(yoVar.f43900a0, 0L, 0);
                lh0Var.h0(yoVar.Z, yoVar.m0);
                yoVar.presentFragment(lh0Var);
                return;
            default:
                boolean z10 = !yoVar.f43904c0;
                yoVar.f43904c0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                return;
        }
    }
}
