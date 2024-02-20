package org.telegram.ui.Components;

import org.telegram.messenger.SavedMessagesController;
public final class BulletinFactory$$ExternalSyntheticLambda5 implements Runnable {
    public static final BulletinFactory$$ExternalSyntheticLambda5 INSTANCE = new BulletinFactory$$ExternalSyntheticLambda5();

    private BulletinFactory$$ExternalSyntheticLambda5() {
    }

    @Override
    public final void run() {
        SavedMessagesController.openSavedMessages();
    }
}
