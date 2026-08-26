package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog;

public final class AlertsCreator$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId;
    public final AlertDialog f$0;
    public final Context f$1;

    public AlertsCreator$$ExternalSyntheticLambda13(Context context, AlertDialog alertDialog, int i) {
        this.$r8$classId = i;
        this.f$0 = alertDialog;
        this.f$1 = context;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createBotLaunchAlert$59(this.f$0, this.f$1);
                break;
            default:
                AlertsCreator.lambda$createBotLaunchAlert$55(this.f$0, this.f$1);
                break;
        }
    }
}
