package org.telegram.ui;

import org.telegram.ui.Stories.StealthModeAlert;
public final class DialogsActivity$29$$ExternalSyntheticLambda12 implements Runnable {
    public static final DialogsActivity$29$$ExternalSyntheticLambda12 INSTANCE = new DialogsActivity$29$$ExternalSyntheticLambda12();

    private DialogsActivity$29$$ExternalSyntheticLambda12() {
    }

    @Override
    public final void run() {
        StealthModeAlert.showStealthModeEnabledBulletin();
    }
}
