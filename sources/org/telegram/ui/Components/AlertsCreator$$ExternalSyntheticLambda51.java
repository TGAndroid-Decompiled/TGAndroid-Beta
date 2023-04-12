package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.SharedConfig;
public final class AlertsCreator$$ExternalSyntheticLambda51 implements DialogInterface.OnDismissListener {
    public static final AlertsCreator$$ExternalSyntheticLambda51 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda51();

    private AlertsCreator$$ExternalSyntheticLambda51() {
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
    }
}
