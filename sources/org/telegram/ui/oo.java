package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class oo implements View.OnClickListener {

    public final int f41144a;

    public final xo f41145b;

    public oo(xo xoVar, int i10) {
        this.f41144a = i10;
        this.f41145b = xoVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f41144a;
        xo xoVar = this.f41145b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xoVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                b2Var.N = string;
                if (xoVar.W) {
                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, xoVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, xoVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new jh.z1(23, xoVar, currentChannel));
                xoVar.showDialog(b2Var);
                break;
            case 1:
                if (!xoVar.R) {
                    xoVar.R = true;
                    xoVar.b0();
                    break;
                }
                break;
            case 2:
                if (xoVar.R) {
                    if (!xoVar.Y) {
                        xoVar.Z();
                    } else {
                        xoVar.R = false;
                        xoVar.b0();
                    }
                    break;
                }
                break;
            case 3:
                kh0 kh0Var = new kh0(xoVar.V, 0L, 0);
                kh0Var.g0(xoVar.U, xoVar.f44560h0);
                xoVar.presentFragment(kh0Var);
                break;
            default:
                boolean z10 = !xoVar.X;
                xoVar.X = z10;
                ((org.telegram.ui.Cells.p8) view).setChecked(z10);
                break;
        }
    }
}
