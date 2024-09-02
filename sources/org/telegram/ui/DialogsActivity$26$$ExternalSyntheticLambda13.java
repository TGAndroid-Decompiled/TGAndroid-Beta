package org.telegram.ui;

import org.telegram.ui.Stories.StealthModeAlert;

public final class DialogsActivity$26$$ExternalSyntheticLambda13 implements Runnable {
    public static final DialogsActivity$26$$ExternalSyntheticLambda13 INSTANCE = new DialogsActivity$26$$ExternalSyntheticLambda13();

    private DialogsActivity$26$$ExternalSyntheticLambda13() {
    }

    @Override
    public final void run() {
        StealthModeAlert.showStealthModeEnabledBulletin();
    }
}
