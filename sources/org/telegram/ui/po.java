package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class po implements View.OnClickListener {
    public final int f41439a;
    public final yo f41440b;

    public po(yo yoVar, int i10) {
        this.f41439a = i10;
        this.f41440b = yoVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f41439a;
        yo yoVar = this.f41440b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yoVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.N = string;
                if (yoVar.W) {
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, yoVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, yoVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new kg.w(23, yoVar, currentChannel));
                yoVar.showDialog(c2Var);
                return;
            case 1:
                if (!yoVar.R) {
                    yoVar.R = true;
                    yoVar.b0();
                    return;
                }
                return;
            case 2:
                if (yoVar.R) {
                    if (!yoVar.Y) {
                        yoVar.Z();
                        return;
                    }
                    yoVar.R = false;
                    yoVar.b0();
                    return;
                }
                return;
            case 3:
                hh0 hh0Var = new hh0(yoVar.V, 0L, 0);
                hh0Var.g0(yoVar.U, yoVar.f44927h0);
                yoVar.presentFragment(hh0Var);
                return;
            default:
                boolean z10 = !yoVar.X;
                yoVar.X = z10;
                ((org.telegram.ui.Cells.q8) view).setChecked(z10);
                return;
        }
    }
}
