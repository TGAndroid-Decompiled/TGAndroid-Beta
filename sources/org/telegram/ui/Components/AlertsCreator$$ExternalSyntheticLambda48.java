package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.SharedConfig;
public final class AlertsCreator$$ExternalSyntheticLambda48 implements DialogInterface.OnDismissListener {
    public static final AlertsCreator$$ExternalSyntheticLambda48 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda48();

    private AlertsCreator$$ExternalSyntheticLambda48() {
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
    }
}
