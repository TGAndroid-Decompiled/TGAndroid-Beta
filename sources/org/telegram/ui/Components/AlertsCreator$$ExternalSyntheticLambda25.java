package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.ActionBar.AlertDialog;

public final class AlertsCreator$$ExternalSyntheticLambda25 implements Runnable {
    public final int $r8$classId;
    public final AlertDialog f$0;
    public final Context f$1;

    public AlertsCreator$$ExternalSyntheticLambda25(int i, Context context, AlertDialog alertDialog) {
        this.$r8$classId = i;
        this.f$0 = alertDialog;
        this.f$1 = context;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AlertDialog alertDialog = this.f$0;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                Browser.openUrl(this.f$1, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                break;
            default:
                AlertDialog alertDialog2 = this.f$0;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                Browser.openUrl(this.f$1, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                break;
        }
    }
}
