package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class po implements View.OnClickListener {
    public final int f40216a;
    public final yo f40217b;

    public po(yo yoVar, int i10) {
        this.f40216a = i10;
        this.f40217b = yoVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f40216a;
        yo yoVar = this.f40217b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yoVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                b2Var.R = string;
                if (yoVar.f43459a0) {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, yoVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, yoVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.w0(20, yoVar, currentChannel));
                yoVar.showDialog(b2Var);
                return;
            case 1:
                if (!yoVar.V) {
                    yoVar.V = true;
                    yoVar.b0();
                    return;
                }
                return;
            case 2:
                if (yoVar.V) {
                    if (!yoVar.f43463c0) {
                        yoVar.Z();
                        return;
                    }
                    yoVar.V = false;
                    yoVar.b0();
                    return;
                }
                return;
            case 3:
                kh0 kh0Var = new kh0(yoVar.Z, 0L, 0);
                kh0Var.g0(yoVar.Y, yoVar.f43473l0);
                yoVar.presentFragment(kh0Var);
                return;
            default:
                boolean z10 = !yoVar.f43461b0;
                yoVar.f43461b0 = z10;
                ((org.telegram.ui.Cells.v8) view).setChecked(z10);
                return;
        }
    }
}
